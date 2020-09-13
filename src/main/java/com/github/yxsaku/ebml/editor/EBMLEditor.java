package com.github.yxsaku.ebml.editor;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

import com.github.yxsaku.ebml.editor.element.base.BlockElement;
import com.github.yxsaku.ebml.editor.element.base.Element;
import com.github.yxsaku.ebml.editor.element.base.MasterElement;
import com.github.yxsaku.ebml.editor.element.base.ValueElement;
import com.github.yxsaku.ebml.editor.element.specification.E;
import com.github.yxsaku.ebml.editor.element.specification.Type;
import com.github.yxsaku.ebml.editor.exception.InvalidVintException;
import com.github.yxsaku.ebml.editor.exception.UnknownElementException;

public class EBMLEditor implements Closeable, Flushable {

    private String filePath;
    private FileInputStream is;
    private FileChannel ic;
    private Reader reader;
    private Writer writer;

    public final MasterElement root = new MasterElement();

    /**
     * 指定されたファイルのEBML構造を読み込みます。 メモリを圧迫させないため、データ部は読み込みません。
     * 
     * @param filePath
     * @throws UnknownElementException
     * @throws IOException
     * @throws InvalidVintException
     */
    public EBMLEditor(String filePath) throws InvalidVintException, IOException, UnknownElementException {
        this.filePath = filePath;
        is = new FileInputStream(filePath);
        ic = is.getChannel();
        reader = new Reader(ic);

        readRecursive(root);
    }

    /**
     * 再帰的にEBML要素の構造を読み込む。
     * 
     * @param parent
     * @throws IOException
     * @throws InvalidVintException
     * @throws UnknownElementException
     */
    private void readRecursive(MasterElement parent) throws InvalidVintException, IOException, UnknownElementException {
        while (true) {
            // 要素ID取得
            long start = reader.getCursor();
            Integer elmId = reader.readElementId();
            if (elmId == null) {
                // ファイルの終わりに到達
                if (parent.unknownSize) {
                    parent.end = start;
                }
                break;
            }

            long idLen = reader.getCursor() - start;
            Element elm = E.createElementById(reader, Math.toIntExact(elmId));
            if (elm == null) {
                throw new UnknownElementException(
                        "\"" + Long.toHexString(elmId) + "\" is unknown element id. pos=" + start);
            }
            elm.start = start;

            if (elm.level <= parent.level) {
                // 階層が変わったため、要素の先頭にカーソルを戻して1つ上に戻る
                if (parent.unknownSize) {
                    parent.end = start;
                }
                reader.setCursor(start);
                return;
            }

            // データサイズ取得
            long sizeStart = reader.getCursor();
            Long size = reader.readVint();
            if (size == null) {
                // TODO タグの途中でファイルが終わった場合、エラー？そのタグは無視？
                throw new EOFException("Element size could not read.");
            }

            long sizeLen = reader.getCursor() - sizeStart;
            elm.dataStart = elm.start + idLen + sizeLen;
            if (size == VINT.MAX_VALUE) {
                // サイズ不定
                ((MasterElement) elm).unknownSize = true;
            } else {
                elm.end = elm.dataStart + size;
            }

            if (elm.type == Type.Master) {
                // 子要素を読み込む
                readRecursive((MasterElement) elm);
            } else {
                // データは読み込まない
                reader.skip(size);

                if (elm instanceof BlockElement) {
                    // メタデータを読み込んでおく
                    ((BlockElement) elm).readBlockMetadata();
                }
            }

            parent.children.add(elm);
        }
    }

    /**
     * 各要素を再帰的にファイルに書き込みます。
     * 
     * @param elements
     * @throws InvalidVintException
     * @throws IOException
     */
    private void writeRecursive(List<Element> elements) throws IOException, InvalidVintException {
        for (Element e : elements) {
            // IDの書き込み
            writer.writeElementId(e.id);
            // データサイズの書き込み
            writer.writeVint(e.getDataSize());

            if (e.type == Type.Master) {
                // 子要素の書き込み
                writeRecursive(((MasterElement) e).children);
            } else {
                // データの書き込み
                writer.writeData(((ValueElement<?>) e).getData());
            }
        }
    }

    /**
     * 変更内容を指定されたファイルに出力します。<br>
     * メモリ上にキャッシュしているデータ値はクリアされません。
     * 
     * @throws IOException
     * @throws FileNotFoundException
     * @throws InvalidVintException
     */
    public void output(String outputPath) throws FileNotFoundException, IOException, InvalidVintException {
        try (FileOutputStream os = new FileOutputStream(outputPath); FileChannel oc = os.getChannel()) {
            writer = new Writer(oc);
            writeRecursive(root.children);
        }
    }

    /**
     * 変更内容を読み込み中のファイルに出力します。<br>
     * メモリ上にキャッシュしているデータ値を全てクリアします。
     * 
     * @throws IOException
     * @throws FileNotFoundException
     */
    @Override
    public void flush() throws FileNotFoundException, IOException {
        try {
            output(filePath);
        } catch (InvalidVintException e) {
            throw new RuntimeException(e);
        }
        this.root.clearValue();
    }

    /**
     * 編集を終了します。<br>
     * 変更内容は破棄されます。
     * 
     * @throws IOException
     */
    @Override
    public void close() throws IOException {
        // readerを閉じる
        if (ic.isOpen())
            ic.close();
        is.close();
    }
}
