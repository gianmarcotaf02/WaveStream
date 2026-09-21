package androidx.media3.decoder;

import androidx.media3.decoder.DecoderException;

public interface Decoder<I, O, E extends DecoderException> {
    I dequeueInputBuffer();

    O dequeueOutputBuffer();

    void flush();

    String getName();

    void queueInputBuffer(I i3);

    void release();

    void setOutputStartTimeUs(long j);
}
