package com.github.yxsaku.ebml.editor;

import java.io.EOFException;
import java.nio.ByteBuffer;

import com.github.yxsaku.ebml.editor.exception.InvalidVintException;

public class VINT {

    public static final int OCTET = 8;
    public static final long MAX_VALUE = 0xFFFFFFFFFFFFFFL;
    public static final int MAX_LENGTH = 8;

    /**
     * 現在の位置から、vintの長さを取得します。 カーソルは進みません。
     * 
     * @return
     * @throws InvalidVintException
     */
    public static Integer getVintLength(ByteBuffer buffer) throws InvalidVintException {
        short first = (short) (buffer.get(buffer.position()) & 0xFF);
        int length = 1;
        for (; length <= OCTET; length++) {
            if (first >= Math.pow(2, OCTET - length)) {
                break;
            }
        }
        if (length > OCTET) {
            throw new InvalidVintException("Unsupported length: " + length);
        }

        return length;
    }

    /**
     * 渡されたbufferの現在の位置からvintを読み取る。
     * 
     * @return
     * @throws InvalidVintException
     * @throws EOFException
     */
    public static Long readVint(ByteBuffer buffer) throws InvalidVintException, EOFException {
        Integer length = getVintLength(buffer);
        if (length == null) {
            return null;
        }

        short first = (short) (buffer.get() & 0xFF);
        Long value = (long) (first & ((1 << (OCTET - length)) - 1));
        for (int i = 1; i < length; i++) {
            if (!buffer.hasRemaining()) {
                throw new EOFException("Vint data is broken.");
            }

            value <<= OCTET;
            value += (buffer.get() & 0xFF);
        }

        return value;
    }

    /**
     * 指定された値をvintに変換します。
     * 
     * @return
     * @throws InvalidVintException
     */
    public static ByteBuffer convertVint(long value) throws InvalidVintException {
        ByteBuffer bytes = getMinBytes(value);
        int length = bytes.capacity();
        if (length + 1 > MAX_LENGTH) {
            // データ部の長さ + 1（データ長部）が最大長を超える場合、非対応
            throw new InvalidVintException("Unsupported length: " + length);
        }

        short first = (short) (bytes.get(0) >= 0 ? bytes.get(0) : bytes.get(0) + 256);
        short lenByte = (short) Math.pow(2, OCTET - length);
        if (first >= lenByte) {
            // 1バイト目にデータが入らない
            lenByte >>>= 1;
            ByteBuffer tmp = ByteBuffer.allocate(length + 1);
            bytes = tmp.put((byte) lenByte).put(bytes);
        } else {
            // 1バイト目にデータが入る
            bytes.put((byte) (bytes.get(0) + lenByte));
        }

        bytes.rewind();
        return bytes;
    }

    /**
     * 数値を最小のバイト数のbytebufferに変換します。
     * 
     * @param value
     * @return
     */
    public static ByteBuffer getMinBytes(long value) {
        ByteBuffer bytes;
        if (value != 0) {
            bytes = ByteBuffer.allocate(Long.BYTES);
            bytes.putLong(value);
            int i = 0;
            for (; i < Long.BYTES; i++) {
                if (bytes.get(i) != 0)
                    break;
            }

            return bytes.position(i).slice();
        } else {
            return ByteBuffer.allocate(1);
        }
    }
}
