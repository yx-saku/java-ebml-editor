package com.github.yxsaku.ebml.editor.element.base;

import java.nio.ByteBuffer;

import com.github.yxsaku.ebml.editor.Reader;

public class BinaryElement extends ValueElement<ByteBuffer> {
    public BinaryElement(Reader reader) {
        super(reader);
    }

    @Override
    protected ByteBuffer cast(ByteBuffer data) {
        return data;
    }
}
