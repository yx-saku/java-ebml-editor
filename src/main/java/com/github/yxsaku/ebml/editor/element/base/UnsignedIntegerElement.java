package com.github.yxsaku.ebml.editor.element.base;

import java.nio.ByteBuffer;

import com.github.yxsaku.ebml.editor.Reader;
import com.github.yxsaku.ebml.editor.VINT;

public class UnsignedIntegerElement extends ValueElement<Long> {

    public UnsignedIntegerElement(Reader reader) {
        super(reader);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long cast(ByteBuffer data) {
        byte[] arr = data.array();
        long value = 0;
        for (int i = 0; i < arr.length; i++) {
            value += (arr[i] & 0xFF) << (8 * (arr.length - i - 1));
        }

        return value;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ByteBuffer cast(Long value) {
        return VINT.getMinBytes(value);
    }
}
