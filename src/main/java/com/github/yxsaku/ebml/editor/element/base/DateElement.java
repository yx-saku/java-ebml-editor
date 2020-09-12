package com.github.yxsaku.ebml.editor.element.base;

import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Date;

import com.github.yxsaku.ebml.editor.Reader;

public class DateElement extends ValueElement<Date> {

    public DateElement(Reader reader) {
        super(reader);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Date cast(ByteBuffer data) {
        long time = data.getLong();
        Calendar cal = Calendar.getInstance();
        cal.set(2001, 0, 1, 0, 0, 0);
        return new Date(cal.getTimeInMillis() + (time / 1000 / 1000));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected ByteBuffer cast(Date value) {
        Calendar cal = Calendar.getInstance();
        cal.set(2001, 0, 1, 0, 0, 0);

        long time = (value.getTime() - cal.getTimeInMillis()) * 1000 * 1000;
        return ByteBuffer.allocate(Long.BYTES).putLong(time).rewind();
    }
}
