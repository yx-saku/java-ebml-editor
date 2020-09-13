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
     * バイトサイズを指定してByteBufferに変換します。
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
     * バイトサイズを指定して値を設定します。
     * 
     * @param value 値
     * @param size  バイトサイズ
     */
    public void setValue(Long value, int size) {
        this.data = cast(value, size);
    }

    /**
     * Unsignedとして値を取得します。
     * 
     * @return
     * @throws InvalidVintException
     * @throws IOException
     */
    public long getValueAsUnsigned() throws IOException, InvalidVintException {
        return getUnsigned(this.getData());
    }

    /**
     * Unsignedとして値を設定します。
     * 
     * @param value
     */
    public void setValueAsUnsigned(Long value) {
        this.data = VINT.getMinBytes(value);
    }

    /**
     * dataからUnsignedIntegerを取得する。
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
