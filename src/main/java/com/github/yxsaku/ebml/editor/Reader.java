package com.github.yxsaku.ebml.editor;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import com.github.yxsaku.ebml.editor.exception.InvalidVintException;

public class Reader {

    private FileChannel ch;
    private long cursor = 0;

    public Reader(FileChannel ch) {
        this.ch = ch;
    }

    /**
     * 現在のカーソルの位置を取得する。
     * 
     * @return
     */
    public long getCursor() {
        return cursor;
    }

    /**
     * カーソルの位置を変更する。
     * 
     * @param cursor
     */
    public void setCursor(long cursor) {
        this.cursor = cursor;
    }

    /**
     * 現在の位置からEBML IDを読み込む。
     * 
     * @return
     * @throws InvalidVintException
     * @throws IOException
     */
    public Integer readElementId() throws InvalidVintException, IOException {
        ByteBuffer vint = read(cursor, VINT.MAX_LENGTH);
        if (vint == null) {
            return null;
        }

        Integer length = VINT.getVintLength(vint);
        int id = 0;
        vint.flip().limit(vint.capacity());
        for (int i = 0; i < length; i++) {
            id <<= VINT.OCTET;
            id += vint.get() & 0xFF;
        }

        cursor += length;
        return id;
    }

    /**
     * 現在の位置からvintを読み込む。
     * 
     * @return
     * @throws InvalidVintException
     * @throws IOException
     */
    public Long readVint() throws InvalidVintException, IOException {
        ByteBuffer vint = read(cursor, VINT.MAX_LENGTH);

        Long value = VINT.readVint(vint);

        cursor += vint.position();
        return value;
    }

    /**
     * 現在の位置から指定の長さまでカーソルを進める。
     * 
     * @param len
     */
    public void skip(long len) {
        cursor += len;
    }

    /**
     * 指定の場所から、指定の長さまで読み込む。 カーソルは進みません。
     * 
     * @param pos
     * @param len
     * @return
     * @throws IOException
     */
    public ByteBuffer read(long pos, int len) throws IOException {
        ByteBuffer b = ByteBuffer.allocate(len);
        int ret = ch.read(b, pos);
        if (ret < 0) {
            return null;
        }

        b.rewind();

        if (ret < len) {
            b.limit(ret);
            b = b.slice();
        }

        return b;
    }
}
