package com.github.yxsaku.ebml.editor.element.specification;

public enum Type {
    Master("m"), UnsignedInt("u"), SignedInt("i"), Date("d"), Float("f"), Ascii("s"), Utf8("8"), Binary("b");

    private final String text;

    private Type(final String text) {
        this.text = text;
    }

    public String getString() {
        return this.text;
    }
}
