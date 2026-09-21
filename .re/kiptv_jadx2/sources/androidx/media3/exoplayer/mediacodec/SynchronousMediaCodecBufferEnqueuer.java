package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import androidx.media3.decoder.CryptoInfo;

class SynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {
    private final MediaCodec codec;

    public SynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec) {
        this.codec = mediaCodec;
    }

    @Override
    public void flush() {
    }

    @Override
    public void maybeThrowException() {
    }

    @Override
    public void queueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        this.codec.queueInputBuffer(i3, i9, i10, j, i11);
    }

    @Override
    public void queueSecureInputBuffer(int i3, int i9, CryptoInfo cryptoInfo, long j, int i10) {
        this.codec.queueSecureInputBuffer(i3, i9, cryptoInfo.getFrameworkCryptoInfo(), j, i10);
    }

    @Override
    public void setParameters(Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void waitUntilQueueingComplete() {
    }
}
