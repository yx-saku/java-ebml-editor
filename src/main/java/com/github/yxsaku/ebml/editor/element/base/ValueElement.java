package com.github.yxsaku.ebml.editor.element.base;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

import com.github.yxsaku.ebml.editor.Reader;
import com.github.yxsaku.ebml.editor.exception.InvalidVintException;

public abstract class ValueElement<T> extends Element {
    protected Reader reader;
    protected ByteBuffer data;

    protected ValueElement(Reader reader) {
        this.reader = reader;
    }

    /**
     * Readerを返します。
     * 
     * @return
     */
    public Reader getReader() {
        return reader;
    }

    /**
     * bytebufferを各要素ごとの型に変換する。
     * 
     * @param data
     * @return
     * 
     */
    protected abstract T cast(ByteBuffer data);

    /**
     * 各要素ごとの型をbytebufferに変換する。
     * 
     * @param data
     * @return
     * 
     */
    protected abstract ByteBuffer cast(T value);

    /**
     * ファイルよりデータ部を読み込み、要素ごとの型に変換して返します。<br>
     * setValueメソッドを使って値を設定している場合は、設定した値を返します。
     * 
     * @return
     * @throws IOException
     * @throws InvalidVintException
     */
    public T getValue() throws IOException, InvalidVintException {
        ByteBuffer ret = getData();
        return cast(ret);
    }

    /**
     * 値を設定します。
     * 
     * @param value
     * @throws InvalidVintException
     * @throws EOFException
     */
    public void setValue(T value) throws EOFException, InvalidVintException {
        this.data = cast(value);
    }

    /**
     * ファイルよりデータ部を読み込みます。<br>
     * setValue/setDataメソッドを使って値を設定している場合は、設定した値をbytebufferで返します。
     * 
     * @return
     * @throws IOException
     * @throws InvalidVintException
     */
    public ByteBuffer getData() throws IOException, InvalidVintException {
        if (data != null) {
            return data;
        }

        return reader.read(this.dataStart, (int) (this.end - this.dataStart));
    }

    /**
     * 値をバイト配列で設定します。
     * 
     * @return
     * 
     */
    public void setData(ByteBuffer data) {
        this.data = data;
    }

    /**
     * setValue/setDataメソッドを使って設定した値をクリアします。
     */
    @Override
    public void clearValue() {
        this.data = null;
    }

    /**
     * データサイズを取得します。
     * 
     * @throws IOException
     */
    @Override
    public long getDataSize() throws InvalidVintException, IOException {
        return getData().capacity();
    }
}
