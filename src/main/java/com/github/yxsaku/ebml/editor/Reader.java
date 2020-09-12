package com.github.yxsaku.ebml.editor;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import com.github.yxsaku.ebml.editor.exception.InvalidVintException;

public class Reader {

    private FileChannel ch;
    private long cursor = 0;

    public Reader(FileChannel ch) {
        this.ch = ch;
    }

    /**
     * ���݂̃J�[�\���̈ʒu���擾����B
     * 
     * @return
     */
    public long getCursor() {
        return cursor;
    }

    /**
     * �J�[�\���̈ʒu��ύX����B
     * 
     * @param cursor
     */
    public void setCursor(long cursor) {
        this.cursor = cursor;
    }

    /**
     * ���݂̈ʒu����EBML ID��ǂݍ��ށB
     * 
     * @return
     * @throws InvalidVintException
     * @throws IOException
     */
    public Integer readElementId() throws InvalidVintException, IOException {
        ByteBuffer vint = read(cursor, VINT.MAX_LENGTH);
        if (vint == null) {
            return null;
        }

        Integer length = VINT.getVintLength(vint);
        int id = 0;
        vint.flip().limit(vint.capacity());
        for (int i = 0; i < length; i++) {
            id <<= VINT.OCTET;
            id += vint.get() & 0xFF;
        }

        cursor += length;
        return id;
    }

    /**
     * ���݂̈ʒu����vint��ǂݍ��ށB
     * 
     * @return
     * @throws InvalidVintException
     * @throws IOException
     */
    public Long readVint() throws InvalidVintException, IOException {
        ByteBuffer vint = read(cursor, VINT.MAX_LENGTH);

        Long value = VINT.readVint(vint);

        cursor += vint.position();
        return value;
    }

    /**
     * ���݂̈ʒu����w��̒����܂ŃJ�[�\����i�߂�B
     * 
     * @param len
     */
    public void skip(long len) {
        cursor += len;
    }

    /**
     * �w��̏ꏊ����A�w��̒����܂œǂݍ��ށB �J�[�\���͐i�݂܂���B
     * 
     * @param pos
     * @param len
     * @return
     * @throws IOException
     */
    public ByteBuffer read(long pos, int len) throws IOException {
        ByteBuffer b = ByteBuffer.allocate(len);
        int ret = ch.read(b, pos);
        if (ret < 0) {
            return null;
        }

        b.rewind();

        if (ret < len) {
            b.limit(ret);
            b = b.slice();
        }

        return b;
    }
}
