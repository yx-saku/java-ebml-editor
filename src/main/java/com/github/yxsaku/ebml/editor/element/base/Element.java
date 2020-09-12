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
     * �v�f�̃w�b�_���iID�{�T�C�Y�j�̃T�C�Y���擾����B
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
     * �v�f�S�̂̃T�C�Y��Ԃ��܂��B
     * 
     * @throws InvalidVintException
     * @throws IOException
     */
    public long getElementSize() throws InvalidVintException, IOException {
        return getHeaderSize() + getDataSize();
    }

    public abstract void clearValue();

    public abstract long getDataSize() throws InvalidVintException, IOException;
}
