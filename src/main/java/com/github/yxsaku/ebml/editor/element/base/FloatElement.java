package com.github.yxsaku.ebml.editor.element.base;

import java.nio.ByteBuffer;

import com.github.yxsaku.ebml.editor.Reader;

public class FloatElement extends ValueElement<Double> {

    public FloatElement(Reader reader) {
        super(reader);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Double cast(ByteBuffer data) {
        return data.capacity() > Float.BYTES ? data.getDouble() : data.getFloat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ByteBuffer cast(Double value) {
        ByteBuffer data;
        if (value.floatValue() == value) {
            data = ByteBuffer.allocate(Float.BYTES).putFloat(value.floatValue());
        } else {
            data = ByteBuffer.allocate(Double.BYTES).putDouble(value);
        }

        return data.rewind();
    }
}
