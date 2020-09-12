package com.github.yxsaku.ebml.editor.element.base;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.github.yxsaku.ebml.editor.VINT;
import com.github.yxsaku.ebml.editor.element.specification.Type;
import com.github.yxsaku.ebml.editor.exception.InvalidVintException;

public class MasterElement extends Element {
    public boolean unknownSize = false;
    public List<Element> children = new ArrayList<>();

    /**
     * ���̗v�f�������ׂĂ̎q���v�f����A�w�肵��EBML ID�Ɉ�v����v�f��Ԃ��܂��B<br>
     * �������݂���ꍇ�́A�擪�̗v�f��Ԃ��܂��B
     * 
     * @param ids
     * @return
     */
    public Element get(int... ids) {
        List<Element> elements = getList(ids);
        return elements.size() == 0 ? null : elements.get(0);
    }

    public MasterElement getM(int... ids) {
        return (MasterElement) get(ids);
    }

    public BinaryElement getB(int... ids) {
        return (BinaryElement) get(ids);
    }

    public BlockElement getBlock(int... ids) {
        return (BlockElement) get(ids);
    }

    public DateElement getD(int... ids) {
        return (DateElement) get(ids);
    }

    public FloatElement getF(int... ids) {
        return (FloatElement) get(ids);
    }

    public UnsignedIntegerElement getU(int... ids) {
        return (UnsignedIntegerElement) get(ids);
    }

    public SignedIntegerElement getI(int... ids) {
        return (SignedIntegerElement) get(ids);
    }

    public StringElement getS8(int... ids) {
        return (StringElement) get(ids);
    }

    /**
     * ���̗v�f�������ׂĂ̎q���v�f����A�w�肵��EBML ID�Ɉ�v����v�f��S�ĕԂ��܂��B
     * 
     * @param ids
     * @return
     */
    public List<Element> getList(int... ids) {
        List<Element> list = new ArrayList<>();
        for (Element e : children) {
            if (Arrays.stream(ids).anyMatch(id -> id == e.id)) {
                list.add(e);
            }

            if (e.type == Type.Master) {
                list.addAll(((MasterElement) e).getList(ids));
            }
        }

        return Collections.unmodifiableList(list);
    }

    public List<MasterElement> getMList(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (MasterElement) l).collect(Collectors.toList()));
    }

    public List<BinaryElement> getBList(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (BinaryElement) l).collect(Collectors.toList()));
    }

    public List<BlockElement> getBlockList(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (BlockElement) l).collect(Collectors.toList()));
    }

    public List<DateElement> getDList(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (DateElement) l).collect(Collectors.toList()));
    }

    public List<FloatElement> getFList(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (FloatElement) l).collect(Collectors.toList()));
    }

    public List<UnsignedIntegerElement> getUList(int... ids) {
        return Collections.unmodifiableList(
                getList(ids).stream().map(l -> (UnsignedIntegerElement) l).collect(Collectors.toList()));
    }

    public List<SignedIntegerElement> getIList(int... ids) {
        return Collections.unmodifiableList(
                getList(ids).stream().map(l -> (SignedIntegerElement) l).collect(Collectors.toList()));
    }

    public List<StringElement> getS8List(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (StringElement) l).collect(Collectors.toList()));
    }

    /**
     * �S�Ă̎q�v�f�̃L���b�V�����폜���܂��B
     */
    @Override
    public void clearValue() {
        for (Element e : children) {
            e.clearValue();
        }
    }

    /**
     * �S�Ă̎q�v�f��elementSize�̍��v��Ԃ��܂��B
     * 
     * @throws InvalidVintException
     * @throws IOException
     */
    @Override
    public long getDataSize() throws InvalidVintException, IOException {
        if (unknownSize) {
            return VINT.MAX_VALUE;
        }

        long size = 0;
        for (Element e : children) {
            size += e.getElementSize();
        }

        return size;
    }
}
