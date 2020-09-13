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
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致する要素を返します。<br>
     * 複数存在する場合は、先頭の要素を返します。
     * 
     * @param ids
     * @return
     */
    public Element get(int... ids) {
        List<Element> elements = getList(ids);
        return elements.size() == 0 ? null : elements.get(0);
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致する、Master要素を返します。<br>
     * 複数存在する場合は、先頭の要素を返します。
     * 
     * @param ids
     * @return
     */
    public MasterElement getM(int... ids) {
        return (MasterElement) get(ids);
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致する、Binary型要素を返します。<br>
     * 複数存在する場合は、先頭の要素を返します。
     * 
     * @param ids
     * @return
     */
    public BinaryElement getB(int... ids) {
        return (BinaryElement) get(ids);
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致する、SimpleBlock要素またはBlock要素を返します。<br>
     * 複数存在する場合は、先頭の要素を返します。
     * 
     * @param ids
     * @return
     */
    public BlockElement getBlock(int... ids) {
        return (BlockElement) get(ids);
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致する、Date型要素を返します。<br>
     * 複数存在する場合は、先頭の要素を返します。
     * 
     * @param ids
     * @return
     */
    public DateElement getD(int... ids) {
        return (DateElement) get(ids);
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致する、Float型要素を返します。<br>
     * 複数存在する場合は、先頭の要素を返します。
     * 
     * @param ids
     * @return
     */
    public FloatElement getF(int... ids) {
        return (FloatElement) get(ids);
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致する、UnsignedInteger型要素を返します。<br>
     * 複数存在する場合は、先頭の要素を返します。
     * 
     * @param ids
     * @return
     */
    public UnsignedIntegerElement getU(int... ids) {
        return (UnsignedIntegerElement) get(ids);
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致する、SignedInteger型要素を返します。<br>
     * 複数存在する場合は、先頭の要素を返します。
     * 
     * @param ids
     * @return
     */
    public SignedIntegerElement getI(int... ids) {
        return (SignedIntegerElement) get(ids);
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致する、String型要素またはUTF8String型要素を返します。<br>
     * 複数存在する場合は、先頭の要素を返します。
     * 
     * @param ids
     * @return
     */
    public StringElement getS8(int... ids) {
        return (StringElement) get(ids);
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致する要素を全て返します。
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

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致するMaster型要素を全て返します。
     * 
     * @param ids
     * @return
     */
    public List<MasterElement> getMList(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (MasterElement) l).collect(Collectors.toList()));
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致するBinary型要素を全て返します。
     * 
     * @param ids
     * @return
     */
    public List<BinaryElement> getBList(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (BinaryElement) l).collect(Collectors.toList()));
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致するSimpleBlock要素またはBlock要素を全て返します。
     * 
     * @param ids
     * @return
     */
    public List<BlockElement> getBlockList(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (BlockElement) l).collect(Collectors.toList()));
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致するDate型要素を全て返します。
     * 
     * @param ids
     * @return
     */
    public List<DateElement> getDList(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (DateElement) l).collect(Collectors.toList()));
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致するFloat型要素を全て返します。
     * 
     * @param ids
     * @return
     */
    public List<FloatElement> getFList(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (FloatElement) l).collect(Collectors.toList()));
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致するUnsignedInteger型要素を全て返します。
     * 
     * @param ids
     * @return
     */
    public List<UnsignedIntegerElement> getUList(int... ids) {
        return Collections.unmodifiableList(
                getList(ids).stream().map(l -> (UnsignedIntegerElement) l).collect(Collectors.toList()));
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致するSignedInteger型要素を全て返します。
     * 
     * @param ids
     * @return
     */
    public List<SignedIntegerElement> getIList(int... ids) {
        return Collections.unmodifiableList(
                getList(ids).stream().map(l -> (SignedIntegerElement) l).collect(Collectors.toList()));
    }

    /**
     * この要素が持つすべての子孫要素から、指定したEBML IDに一致するString型要素またはUTF8String型要素を全て返します。
     * 
     * @param ids
     * @return
     */
    public List<StringElement> getS8List(int... ids) {
        return Collections
                .unmodifiableList(getList(ids).stream().map(l -> (StringElement) l).collect(Collectors.toList()));
    }

    /**
     * 全ての子要素のキャッシュを削除します。
     */
    @Override
    public void clearValue() {
        for (Element e : children) {
            e.clearValue();
        }
    }

    /**
     * 全ての子要素のelementSizeの合計を返します。
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
