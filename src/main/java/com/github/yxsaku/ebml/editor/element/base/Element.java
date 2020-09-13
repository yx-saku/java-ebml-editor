package com.github.yxsaku.ebml.editor.element.base;

import java.io.IOException;
import java.util.function.Predicate;

import com.github.yxsaku.ebml.editor.VINT;
import com.github.yxsaku.ebml.editor.element.specification.Type;
import com.github.yxsaku.ebml.editor.exception.InvalidVintException;

public abstract class Element implements Cloneable {
    public int id;
    public String name = null;
    public int level = -1;
    public Type type = null;
    public boolean mandatory = false;
    public boolean multiple = false;
    public boolean webm = false;
    public Object defaultValue = null;
    public Predicate<Long> range = null;
    public String description = null;

    public long start = -1;
    public long end = -1;
    public long dataStart = -1;

    /**
     * 要素のヘッダ部（ID部＋サイズ部）のサイズを取得する。
     * 
     * @return
     * @throws InvalidVintException
     * @throws IOException
     */
    public long getHeaderSize() throws InvalidVintException, IOException {
        try {
            int idLen = VINT.getMinBytes(id).capacity();
            int sizeLen = VINT.getVintLength(VINT.convertVint(getDataSize()));
            return idLen + sizeLen;
        } catch (RuntimeException e) {
            String msg = "name=" + name + " type=" + type;
            throw new RuntimeException(msg, e);
        }
    }

    /**
     * 要素全体のサイズを返します。
     * 
     * @throws InvalidVintException
     * @throws IOException
     */
    public long getElementSize() throws InvalidVintException, IOException {
        return getHeaderSize() + getDataSize();
    }

    /**
     * 設定した値をクリアします。
     */
    public abstract void clearValue();

    /**
     * データ部のサイズを取得します。
     * 
     * @return
     * @throws InvalidVintException
     * @throws IOException
     */
    public abstract long getDataSize() throws InvalidVintException, IOException;
}
