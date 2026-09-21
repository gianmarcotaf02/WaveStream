package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public interface Decoder<I, O, E extends androidx.media3.decoder.DecoderException> {
    I dequeueInputBuffer();

    O dequeueOutputBuffer();

    void flush();

    java.lang.String getName();

    void queueInputBuffer(I i3);

    void release();

    void setOutputStartTimeUs(long j);
}
