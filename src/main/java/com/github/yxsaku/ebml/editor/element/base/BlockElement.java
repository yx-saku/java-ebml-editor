package com.github.yxsaku.ebml.editor.element.base;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

import com.github.yxsaku.ebml.editor.Reader;
import com.github.yxsaku.ebml.editor.VINT;
import com.github.yxsaku.ebml.editor.exception.InvalidVintException;

public class BlockElement extends BinaryElement {
    public long trackNumber;
    public short timecode;
    public boolean keyframe;
    public boolean invisible;
    public boolean discardable;

    public BlockElement(Reader reader) {
        super(reader);
    }

    /**
     * �t�@�C������u���b�N�v�f��trackNumber, timecode, keyframe, invisible, discardable��ǂݍ��݂܂��B
     * 
     * @throws IOException
     * @throws InvalidVintException
     */
    public void readBlockMetadata() throws IOException, InvalidVintException {
        ByteBuffer data = super.getData();
        readBlockMetadataFromBuffer(data);
        data.rewind();
    }

    /**
     * {@inheritDoc}<br>
     * trackNumber, timecode, keyframe, invisible,
     * discardable���ύX����Ă���ꍇ�́A���̓��e�𔽉f���܂��B
     * 
     * @throws IOException
     * @throws InvalidVintException
     */
    @Override
    public ByteBuffer getValue() throws IOException, InvalidVintException {
        return super.getValue();
    }

    /**
     * {@inheritDoc}<br>
     * trackNumber, timecode, keyframe, invisible, discardable���X�V���܂��B
     * 
     * @throws InvalidVintException
     * @throws EOFException
     */
    @Override
    public void setValue(ByteBuffer value) throws EOFException, InvalidVintException {
        super.setValue(value);
        readBlockMetadataFromBuffer(value);
    }

    /**
     * {@inheritDoc}<br>
     * trackNumber, timecode, keyframe, invisible,
     * discardable���ύX����Ă���ꍇ�́A���̓��e�𔽉f���܂��B
     * 
     * @throws IOException
     * @throws InvalidVintException
     */
    @Override
    public ByteBuffer getData() throws IOException, InvalidVintException {
        ByteBuffer data = super.getData();
        data.put(VINT.convertVint(trackNumber));
        data.putShort(timecode);
        data.put((byte) ((keyframe ? 0x80 : 0) + (invisible ? 0x08 : 0) + (discardable ? 0x01 : 0)));
        data.rewind();
        return data;
    }

    /**
     * bytebuffer����u���b�N�v�f�̃��^�f�[�^��ǂݍ��ށB
     * 
     * @param buffer
     * @throws InvalidVintException
     * @throws EOFException
     */
    private void readBlockMetadataFromBuffer(ByteBuffer buffer) throws EOFException, InvalidVintException {
        this.trackNumber = VINT.readVint(buffer);
        this.timecode = buffer.getShort();

        byte switchs = buffer.get();
        this.keyframe = (switchs & 0x80) != 0;
        this.invisible = (switchs & 0x08) != 0;
        this.discardable = (switchs & 0x01) != 0;
    }
}
