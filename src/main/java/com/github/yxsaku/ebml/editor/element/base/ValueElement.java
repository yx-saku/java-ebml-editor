package com.github.yxsaku.ebml.editor.element.base;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

import com.github.yxsaku.ebml.editor.Reader;
import com.github.yxsaku.ebml.editor.exception.InvalidVintException;

public abstract class ValueElement<T> extends Element {
    protected Reader reader;
    protected ByteBuffer data;

    protected ValueElement(Reader reader) {
        this.reader = reader;
    }

    /**
     * Reader��Ԃ��܂��B
     * 
     * @return
     */
    public Reader getReader() {
        return reader;
    }

    /**
     * bytebuffer���e�v�f���Ƃ̌^�ɕϊ�����B
     * 
     * @param data
     * @return
     * 
     */
    protected abstract T cast(ByteBuffer data);

    /**
     * �e�v�f���Ƃ̌^��bytebuffer�ɕϊ�����B
     * 
     * @param data
     * @return
     * 
     */
    protected abstract ByteBuffer cast(T value);

    /**
     * �t�@�C�����f�[�^����ǂݍ��݁A�v�f���Ƃ̌^�ɕϊ����ĕԂ��܂��B<br>
     * setValue���\�b�h���g���Ēl��ݒ肵�Ă���ꍇ�́A�ݒ肵���l��Ԃ��܂��B
     * 
     * @return
     * @throws IOException
     * @throws InvalidVintException
     */
    public T getValue() throws IOException, InvalidVintException {
        ByteBuffer ret = getData();
        return cast(ret);
    }

    /**
     * �l��ݒ肵�܂��B
     * 
     * @param value
     * @throws InvalidVintException
     * @throws EOFException
     */
    public void setValue(T value) throws EOFException, InvalidVintException {
        this.data = cast(value);
    }

    /**
     * �t�@�C�����f�[�^����ǂݍ��݂܂��B<br>
     * setValue/setData���\�b�h���g���Ēl��ݒ肵�Ă���ꍇ�́A�ݒ肵���l��bytebuffer�ŕԂ��܂��B
     * 
     * @return
     * @throws IOException
     * @throws InvalidVintException
     */
    public ByteBuffer getData() throws IOException, InvalidVintException {
        if (data != null) {
            return data;
        }

        return reader.read(this.dataStart, (int) (this.end - this.dataStart));
    }

    /**
     * �l���o�C�g�z��Őݒ肵�܂��B
     * 
     * @return
     * 
     */
    public void setData(ByteBuffer data) {
        this.data = data;
    }

    /**
     * setValue/setData���\�b�h���g���Đݒ肵���l���N���A���܂��B
     */
    @Override
    public void clearValue() {
        this.data = null;
    }

    /**
     * �f�[�^�T�C�Y���擾���܂��B
     * 
     * @throws IOException
     */
    @Override
    public long getDataSize() throws InvalidVintException, IOException {
        return getData().capacity();
    }
}
