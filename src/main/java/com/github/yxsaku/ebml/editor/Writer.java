package com.github.yxsaku.ebml.editor;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import com.github.yxsaku.ebml.editor.exception.InvalidVintException;

public class Writer {

    private FileChannel ch;
    private long cursor = 0;

    public Writer(FileChannel ch) {
        this.ch = ch;
    }

    /**
     * ���݂̈ʒu����EBML ID��ǂݍ��ށB
     * 
     * @return
     * @throws IOException
     */
    public int writeElementId(int elmId) throws IOException {
        ByteBuffer bytes = VINT.getMinBytes(elmId);

        cursor += ch.write(bytes, cursor);
        return bytes.capacity();
    }

    /**
     * ���݂̈ʒu��vint���������݂܂��B
     * 
     * @return
     * @throws IOException
     * @throws InvalidVintException
     */
    public int writeVint(long value) throws IOException, InvalidVintException {
        ByteBuffer bytes = VINT.convertVint(value);

        cursor += ch.write(bytes, cursor);

        return bytes.capacity();
    }

    /**
     * �f�[�^���������݂܂��B
     * 
     * @param data
     * @return
     * @throws IOException
     */
    public int writeData(ByteBuffer data) throws IOException {
        cursor += ch.write(data, cursor);
        return data.capacity();
    }
}
