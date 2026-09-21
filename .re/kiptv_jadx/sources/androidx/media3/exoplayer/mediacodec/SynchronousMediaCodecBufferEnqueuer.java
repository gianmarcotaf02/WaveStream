package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
class SynchronousMediaCodecBufferEnqueuer implements androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer {
    private final android.media.MediaCodec codec;

    public SynchronousMediaCodecBufferEnqueuer(android.media.MediaCodec mediaCodec) {
        this.codec = mediaCodec;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void flush() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void maybeThrowException() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void queueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        this.codec.queueInputBuffer(i3, i9, i10, j, i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void queueSecureInputBuffer(int i3, int i9, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i10) {
        this.codec.queueSecureInputBuffer(i3, i9, cryptoInfo.getFrameworkCryptoInfo(), j, i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void setParameters(android.os.Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void shutdown() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void start() {
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void waitUntilQueueingComplete() {
    }
}
