package com.github.yxsaku.ebml.editor.element.base;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import com.github.yxsaku.ebml.editor.Reader;
import com.github.yxsaku.ebml.editor.element.specification.Type;

public class StringElement extends ValueElement<String> {

    public StringElement(Reader reader) {
        super(reader);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String cast(ByteBuffer data) {
        Charset charset = type == Type.Ascii ? StandardCharsets.US_ASCII : StandardCharsets.UTF_8;
        return charset.decode(data).toString();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ByteBuffer cast(String value) {
        Charset charset = type == Type.Ascii ? StandardCharsets.US_ASCII : StandardCharsets.UTF_8;
        return ByteBuffer.wrap(value.getBytes(charset));
    }
}
