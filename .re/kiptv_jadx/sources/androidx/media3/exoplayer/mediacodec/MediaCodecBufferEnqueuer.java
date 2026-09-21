package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
interface MediaCodecBufferEnqueuer {
    void flush();

    void maybeThrowException();

    void queueInputBuffer(int i3, int i9, int i10, long j, int i11);

    void queueSecureInputBuffer(int i3, int i9, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i10);

    void setParameters(android.os.Bundle bundle);

    void shutdown();

    void start();

    void waitUntilQueueingComplete();
}
