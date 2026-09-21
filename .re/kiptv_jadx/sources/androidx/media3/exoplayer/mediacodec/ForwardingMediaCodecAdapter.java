package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingMediaCodecAdapter implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter {
    private final androidx.media3.exoplayer.mediacodec.MediaCodecAdapter delegate;

    public ForwardingMediaCodecAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter) {
        this.delegate = mediaCodecAdapter;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        return this.delegate.dequeueInputBufferIndex();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo bufferInfo) {
        return this.delegate.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void detachOutputSurface() {
        this.delegate.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.delegate.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public java.nio.ByteBuffer getInputBuffer(int i3) {
        return this.delegate.getInputBuffer(i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public android.os.PersistableBundle getMetrics() {
        return this.delegate.getMetrics();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public java.nio.ByteBuffer getOutputBuffer(int i3) {
        return this.delegate.getOutputBuffer(i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public android.media.MediaFormat getOutputFormat() {
        return this.delegate.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return this.delegate.needsReconfiguration();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        this.delegate.queueInputBuffer(i3, i9, i10, j, i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i3, int i9, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i10) {
        this.delegate.queueSecureInputBuffer(i3, i9, cryptoInfo, j, i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean registerOnBufferAvailableListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        return this.delegate.registerOnBufferAvailableListener(onBufferAvailableListener);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        this.delegate.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i3, boolean z6) {
        this.delegate.releaseOutputBuffer(i3, z6);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.os.Handler handler) {
        this.delegate.setOnFrameRenderedListener(onFrameRenderedListener, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOutputSurface(android.view.Surface surface) {
        this.delegate.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(android.os.Bundle bundle) {
        this.delegate.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i3) {
        this.delegate.setVideoScalingMode(i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void subscribeToVendorParameters(java.util.List<java.lang.String> list) {
        this.delegate.subscribeToVendorParameters(list);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void unsubscribeFromVendorParameters(java.util.List<java.lang.String> list) {
        this.delegate.unsubscribeFromVendorParameters(list);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void useInputBuffer(java.lang.Runnable runnable) {
        this.delegate.useInputBuffer(runnable);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i3, long j) {
        this.delegate.releaseOutputBuffer(i3, j);
    }
}
