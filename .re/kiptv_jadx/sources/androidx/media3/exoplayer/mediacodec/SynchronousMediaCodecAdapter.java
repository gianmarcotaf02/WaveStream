package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final class SynchronousMediaCodecAdapter implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter {
    private final android.media.MediaCodec codec;
    private final androidx.media3.exoplayer.mediacodec.LoudnessCodecController loudnessCodecController;

    public static class Factory implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory {
        /* JADX WARN: Code duplicated, block: B:22:0x0045  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$1] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        public androidx.media3.exoplayer.mediacodec.MediaCodecAdapter createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.lang.Throwable {
            android.media.MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                android.media.MediaCodec mediaCodecCreateCodec = createCodec(configuration);
                try {
                    androidx.media3.common.util.TraceUtil.beginSection("configureCodec");
                    android.view.Surface surface = configuration.surface;
                    mediaCodecCreateCodec.configure(configuration.mediaFormat, surface, configuration.crypto, (surface == null && configuration.codecInfo.detachedSurfaceSupported && android.os.Build.VERSION.SDK_INT >= 35) ? 8 : 0);
                    androidx.media3.common.util.TraceUtil.endSection();
                    androidx.media3.common.util.TraceUtil.beginSection("startCodec");
                    mediaCodecCreateCodec.start();
                    androidx.media3.common.util.TraceUtil.endSection();
                    return new androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter(mediaCodecCreateCodec, configuration.loudnessCodecController);
                } catch (java.io.IOException e6) {
                    e = e6;
                    mediaCodec = mediaCodecCreateCodec;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                } catch (java.lang.RuntimeException e9) {
                    e = e9;
                    mediaCodec = mediaCodecCreateCodec;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (java.io.IOException e10) {
                e = e10;
            } catch (java.lang.RuntimeException e11) {
                e = e11;
            }
        }

        public android.media.MediaCodec createCodec(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.io.IOException {
            configuration.codecInfo.getClass();
            java.lang.String str = configuration.codecInfo.name;
            androidx.media3.common.util.TraceUtil.beginSection("createCodec:" + str);
            android.media.MediaCodec mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str);
            androidx.media3.common.util.TraceUtil.endSection();
            return mediaCodecCreateByCodecName;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFrameRenderedListener$0(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.media.MediaCodec mediaCodec, long j, long j9) {
        onFrameRenderedListener.onFrameRendered(this, j, j9);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.codec.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public java.nio.ByteBuffer getInputBuffer(int i3) {
        return this.codec.getInputBuffer(i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public android.os.PersistableBundle getMetrics() {
        return this.codec.getMetrics();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public java.nio.ByteBuffer getOutputBuffer(int i3) {
        return this.codec.getOutputBuffer(i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public android.media.MediaFormat getOutputFormat() {
        return this.codec.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        this.codec.queueInputBuffer(i3, i9, i10, j, i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i3, int i9, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i10) {
        this.codec.queueSecureInputBuffer(i3, i9, cryptoInfo.getFrameworkCryptoInfo(), j, i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        androidx.media3.exoplayer.mediacodec.LoudnessCodecController loudnessCodecController;
        try {
            int i3 = android.os.Build.VERSION.SDK_INT;
            if (i3 >= 30 && i3 < 33) {
                this.codec.stop();
            }
        } finally {
            if (android.os.Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                loudnessCodecController.removeMediaCodec(this.codec);
            }
            this.codec.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i3, boolean z6) {
        this.codec.releaseOutputBuffer(i3, z6);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.os.Handler handler) {
        this.codec.setOnFrameRenderedListener(new androidx.media3.exoplayer.mediacodec.b(this, onFrameRenderedListener, 1), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOutputSurface(android.view.Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(android.os.Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i3) {
        this.codec.setVideoScalingMode(i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void subscribeToVendorParameters(java.util.List<java.lang.String> list) {
        this.codec.subscribeToVendorParameters(list);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void unsubscribeFromVendorParameters(java.util.List<java.lang.String> list) {
        this.codec.unsubscribeFromVendorParameters(list);
    }

    private SynchronousMediaCodecAdapter(android.media.MediaCodec mediaCodec, androidx.media3.exoplayer.mediacodec.LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.loudnessCodecController = loudnessCodecController;
        if (android.os.Build.VERSION.SDK_INT < 35 || loudnessCodecController == null) {
            return;
        }
        loudnessCodecController.addMediaCodec(mediaCodec);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i3, long j) {
        this.codec.releaseOutputBuffer(i3, j);
    }
}
