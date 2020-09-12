package com.github.yxsaku.ebml.editor.element.base;

import java.io.IOException;
import java.nio.ByteBuffer;

import com.github.yxsaku.ebml.editor.Reader;
import com.github.yxsaku.ebml.editor.VINT;
import com.github.yxsaku.ebml.editor.exception.InvalidVintException;

public class SignedIntegerElement extends ValueElement<Long> {

    public SignedIntegerElement(Reader reader) {
        super(reader);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long cast(ByteBuffer data) {
        long value = getUnsigned(data);
        if (data.capacity() < Long.BYTES && (data.get(0) & 0x80) != 0) {
            value -= Math.pow(2, 8 * data.capacity());
        }

        return value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ByteBuffer cast(Long value) {
        return cast(value, (int) (end - dataStart));
    }

    /**
     * �o�C�g�T�C�Y���w�肵��ByteBuffer�ɕϊ����܂��B
     * 
     * @param value
     * @param size
     * @return
     */
    protected ByteBuffer cast(Long value, int size) {
        if (size > Long.BYTES) {
            throw new UnsupportedOperationException("Unsupported signed integer length = " + size);
        }

        boolean nagative = value < 0;

        ByteBuffer buf = ByteBuffer.allocate(size);
        for (int i = 0; i < size; i++) {
            buf.put((byte) (value & 0xFF));
            value >>>= 8;
        }

        if (nagative) {
            buf.put((byte) (buf.get(size - 1) | 0x80));
        }

        return buf.flip().rewind();
    }

    /**
     * �o�C�g�T�C�Y���w�肵�Ēl��ݒ肵�܂��B
     * 
     * @param value �l
     * @param size  �o�C�g�T�C�Y
     */
    public void setValue(Long value, int size) {
        this.data = cast(value, size);
    }

    /**
     * Unsigned�Ƃ��Ēl���擾���܂��B
     * 
     * @return
     * @throws InvalidVintException
     * @throws IOException
     */
    public long getValueAsUnsigned() throws IOException, InvalidVintException {
        return getUnsigned(this.getData());
    }

    /**
     * Unsigned�Ƃ��Ēl��ݒ肵�܂��B
     * 
     * @param value
     */
    public void setValueAsUnsigned(Long value) {
        this.data = VINT.getMinBytes(value);
    }

    /**
     * data����UnsignedInteger���擾����B
     * 
     * @param data
     * @return
     */
    private long getUnsigned(ByteBuffer data) {
        if (data.capacity() > Long.BYTES) {
            throw new UnsupportedOperationException("Unsupported signed integer length = " + data.capacity());
        }

        byte[] arr = data.array();
        long value = 0;
        for (int i = 0; i < arr.length; i++) {
            value += (arr[i] & 0xFF) << (8 * (arr.length - i - 1));
        }

        return value;
    }
}
