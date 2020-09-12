package com.github.yxsaku.ebml.editor;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

import com.github.yxsaku.ebml.editor.element.base.BlockElement;
import com.github.yxsaku.ebml.editor.element.base.Element;
import com.github.yxsaku.ebml.editor.element.base.MasterElement;
import com.github.yxsaku.ebml.editor.element.base.ValueElement;
import com.github.yxsaku.ebml.editor.element.specification.E;
import com.github.yxsaku.ebml.editor.element.specification.Type;
import com.github.yxsaku.ebml.editor.exception.InvalidVintException;
import com.github.yxsaku.ebml.editor.exception.UnknownElementException;

public class EBMLEditor implements Closeable, Flushable {

    private String filePath;
    private FileInputStream is;
    private FileChannel ic;
    private Reader reader;
    private Writer writer;

    public final MasterElement root = new MasterElement();

    /**
     * �w�肳�ꂽ�t�@�C����EBML�\����ǂݍ��݂܂��B �����������������Ȃ����߁A�f�[�^���͓ǂݍ��݂܂���B
     * 
     * @param filePath
     * @throws UnknownElementException
     * @throws IOException
     * @throws InvalidVintException
     */
    public EBMLEditor(String filePath) throws InvalidVintException, IOException, UnknownElementException {
        this.filePath = filePath;
        is = new FileInputStream(filePath);
        ic = is.getChannel();
        reader = new Reader(ic);

        readRecursive(root);
    }

    /**
     * �ċA�I��EBML�v�f�̍\����ǂݍ��ށB
     * 
     * @param parent
     * @throws IOException
     * @throws InvalidVintException
     * @throws UnknownElementException
     */
    private void readRecursive(MasterElement parent) throws InvalidVintException, IOException, UnknownElementException {
        while (true) {
            // �v�fID�擾
            long start = reader.getCursor();
            Integer elmId = reader.readElementId();
            if (elmId == null) {
                // �t�@�C���̏I���ɓ��B
                if (parent.unknownSize) {
                    parent.end = start;
                }
                break;
            }

            long idLen = reader.getCursor() - start;
            Element elm = E.createElementById(reader, Math.toIntExact(elmId));
            if (elm == null) {
                throw new UnknownElementException(
                        "\"" + Long.toHexString(elmId) + "\" is unknown element id. pos=" + start);
            }
            elm.start = start;

            if (elm.level <= parent.level) {
                // �K�w���ς�������߁A�v�f�̐擪�ɃJ�[�\����߂���1��ɖ߂�
                if (parent.unknownSize) {
                    parent.end = start;
                }
                reader.setCursor(start);
                return;
            }

            // �f�[�^�T�C�Y�擾
            long sizeStart = reader.getCursor();
            Long size = reader.readVint();
            if (size == null) {
                // TODO �^�O�̓r���Ńt�@�C�����I������ꍇ�A�G���[�H���̃^�O�͖����H
                throw new EOFException("Element size could not read.");
            }

            long sizeLen = reader.getCursor() - sizeStart;
            elm.dataStart = elm.start + idLen + sizeLen;
            if (size == VINT.MAX_VALUE) {
                // �T�C�Y�s��
                ((MasterElement) elm).unknownSize = true;
            } else {
                elm.end = elm.dataStart + size;
            }

            if (elm.type == Type.Master) {
                // �q�v�f��ǂݍ���
                readRecursive((MasterElement) elm);
            } else {
                // �f�[�^�͓ǂݍ��܂Ȃ�
                reader.skip(size);

                if (elm instanceof BlockElement) {
                    // ���^�f�[�^��ǂݍ���ł���
                    ((BlockElement) elm).readBlockMetadata();
                }
            }

            parent.children.add(elm);
        }
    }

    /**
     * �e�v�f���ċA�I�Ƀt�@�C���ɏ������݂܂��B
     * 
     * @param elements
     * @throws InvalidVintException
     * @throws IOException
     */
    private void writeRecursive(List<Element> elements) throws IOException, InvalidVintException {
        for (Element e : elements) {
            // ID�̏�������
            writer.writeElementId(e.id);
            // �f�[�^�T�C�Y�̏�������
            writer.writeVint(e.getDataSize());

            if (e.type == Type.Master) {
                // �q�v�f�̏�������
                writeRecursive(((MasterElement) e).children);
            } else {
                // �f�[�^�̏�������
                writer.writeData(((ValueElement<?>) e).getData());
            }
        }
    }

    /**
     * �ύX���e���w�肳�ꂽ�t�@�C���ɏo�͂��܂��B<br>
     * ��������ɃL���b�V�����Ă���f�[�^�l�̓N���A����܂���B
     * 
     * @throws IOException
     * @throws FileNotFoundException
     * @throws InvalidVintException
     */
    public void output(String outputPath) throws FileNotFoundException, IOException, InvalidVintException {
        try (FileOutputStream os = new FileOutputStream(outputPath); FileChannel oc = os.getChannel()) {
            writer = new Writer(oc);
            writeRecursive(root.children);
        }
    }

    /**
     * �ύX���e��ǂݍ��ݒ��̃t�@�C���ɏo�͂��܂��B<br>
     * ��������ɃL���b�V�����Ă���f�[�^�l��S�ăN���A���܂��B
     * 
     * @throws IOException
     * @throws FileNotFoundException
     */
    @Override
    public void flush() throws FileNotFoundException, IOException {
        try {
            output(filePath);
        } catch (InvalidVintException e) {
            throw new RuntimeException(e);
        }
        this.root.clearValue();
    }

    /**
     * �ҏW���I�����܂��B<br>
     * �ύX���e�͔j������܂��B
     * 
     * @throws IOException
     */
    @Override
    public void close() throws IOException {
        // reader�����
        if (ic.isOpen())
            ic.close();
        is.close();
    }
}
