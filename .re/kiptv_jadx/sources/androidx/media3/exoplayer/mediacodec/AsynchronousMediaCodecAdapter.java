package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
final class AsynchronousMediaCodecAdapter implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter {
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_SHUT_DOWN = 2;
    private final androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecCallback asynchronousMediaCodecCallback;
    private final androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer bufferEnqueuer;
    private final android.media.MediaCodec codec;
    private boolean codecReleased;
    private final androidx.media3.exoplayer.mediacodec.LoudnessCodecController loudnessCodecController;
    private int state;

    public static final class Factory implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory {
        private final p068h4.v callbackThreadSupplier;
        private boolean enableAsyncCryptoSynchronization;
        private boolean enableSynchronousBufferQueueingWithAsyncCryptoFlag;
        private final p068h4.v queueingThreadSupplier;

        /* JADX WARN: Illegal instructions before constructor call */
        public Factory(final int i3) {
            final int i9 = 0;
            final int i10 = 1;
            this(new p068h4.v() { // from class: androidx.media3.exoplayer.mediacodec.c
                @Override // p068h4.v
                public final java.lang.Object get() {
                    switch (i9) {
                        case 0:
                            return androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory.lambda$new$0(i3);
                        default:
                            return androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory.lambda$new$1(i3);
                    }
                }
            }, new p068h4.v() { // from class: androidx.media3.exoplayer.mediacodec.c
                @Override // p068h4.v
                public final java.lang.Object get() {
                    switch (i10) {
                        case 0:
                            return androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory.lambda$new$0(i3);
                        default:
                            return androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory.lambda$new$1(i3);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ android.os.HandlerThread lambda$new$0(int i3) {
            return new android.os.HandlerThread(androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.createCallbackThreadLabel(i3));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ android.os.HandlerThread lambda$new$1(int i3) {
            return new android.os.HandlerThread(androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.createQueueingThreadLabel(i3));
        }

        private static boolean useSynchronousBufferQueueingWithAsyncCryptoFlag() {
            return android.os.Build.VERSION.SDK_INT >= 36;
        }

        public void experimentalSetAsyncCryptoFlagEnabled(boolean z6) {
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = z6;
        }

        public void setAsyncCryptoSynchronizationEnabled(boolean z6) {
            this.enableAsyncCryptoSynchronization = z6;
        }

        public Factory(p068h4.v vVar, p068h4.v vVar2) {
            this.callbackThreadSupplier = vVar;
            this.queueingThreadSupplier = vVar2;
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = true;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        public androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.lang.Exception {
            java.lang.Exception exc;
            android.media.MediaCodec mediaCodecCreateByCodecName;
            androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer;
            int i3;
            java.lang.String str = configuration.codecInfo.name;
            androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = null;
            try {
                androidx.media3.common.util.TraceUtil.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str);
                try {
                    if (this.enableSynchronousBufferQueueingWithAsyncCryptoFlag && useSynchronousBufferQueueingWithAsyncCryptoFlag()) {
                        asynchronousMediaCodecBufferEnqueuer = new androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName);
                        i3 = 4;
                    } else {
                        asynchronousMediaCodecBufferEnqueuer = new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName, (android.os.HandlerThread) this.queueingThreadSupplier.get(), this.enableAsyncCryptoSynchronization);
                        i3 = 0;
                    }
                    androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, (android.os.HandlerThread) this.callbackThreadSupplier.get(), asynchronousMediaCodecBufferEnqueuer, configuration.loudnessCodecController);
                    try {
                        androidx.media3.common.util.TraceUtil.endSection();
                        android.view.Surface surface = configuration.surface;
                        if (surface == null && configuration.codecInfo.detachedSurfaceSupported && android.os.Build.VERSION.SDK_INT >= 35) {
                            i3 |= 8;
                        }
                        asynchronousMediaCodecAdapter2.initialize(configuration.mediaFormat, surface, configuration.crypto, i3);
                        return asynchronousMediaCodecAdapter2;
                    } catch (java.lang.Exception e6) {
                        exc = e6;
                        asynchronousMediaCodecAdapter = asynchronousMediaCodecAdapter2;
                        if (asynchronousMediaCodecAdapter != null) {
                            asynchronousMediaCodecAdapter.release();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (java.lang.Exception e9) {
                    exc = e9;
                }
            } catch (java.lang.Exception e10) {
                exc = e10;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String createCallbackThreadLabel(int i3) {
        return createThreadLabel(i3, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String createQueueingThreadLabel(int i3) {
        return createThreadLabel(i3, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static java.lang.String createThreadLabel(int i3, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        if (i3 == 1) {
            sb.append("Audio");
        } else if (i3 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i3);
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i3) {
        androidx.media3.exoplayer.mediacodec.LoudnessCodecController loudnessCodecController;
        this.asynchronousMediaCodecCallback.initialize(this.codec);
        androidx.media3.common.util.TraceUtil.beginSection("configureCodec");
        this.codec.configure(mediaFormat, surface, mediaCrypto, i3);
        androidx.media3.common.util.TraceUtil.endSection();
        this.bufferEnqueuer.start();
        androidx.media3.common.util.TraceUtil.beginSection("startCodec");
        this.codec.start();
        androidx.media3.common.util.TraceUtil.endSection();
        if (android.os.Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
            loudnessCodecController.addMediaCodec(this.codec);
        }
        this.state = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnFrameRenderedListener$1(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.media.MediaCodec mediaCodec, long j, long j9) {
        onFrameRenderedListener.onFrameRendered(this, j, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$useInputBuffer$0(java.lang.Runnable runnable) {
        this.bufferEnqueuer.maybeThrowException();
        this.asynchronousMediaCodecCallback.useInputBuffer(runnable);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueInputBufferIndex();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo bufferInfo) {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void detachOutputSurface() {
        this.codec.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.bufferEnqueuer.flush();
        this.codec.flush();
        this.asynchronousMediaCodecCallback.flush();
        this.codec.start();
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
        return this.asynchronousMediaCodecCallback.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    public void onError(android.media.MediaCodec.CodecException codecException) {
        this.asynchronousMediaCodecCallback.onError(this.codec, codecException);
    }

    public void onOutputFormatChanged(android.media.MediaFormat mediaFormat) {
        this.asynchronousMediaCodecCallback.onOutputFormatChanged(this.codec, mediaFormat);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i3, int i9, int i10, long j, int i11) {
        this.bufferEnqueuer.queueInputBuffer(i3, i9, i10, j, i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i3, int i9, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i10) {
        this.bufferEnqueuer.queueSecureInputBuffer(i3, i9, cryptoInfo, j, i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean registerOnBufferAvailableListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        this.asynchronousMediaCodecCallback.setOnBufferAvailableListener(onBufferAvailableListener);
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        androidx.media3.exoplayer.mediacodec.LoudnessCodecController loudnessCodecController;
        androidx.media3.exoplayer.mediacodec.LoudnessCodecController loudnessCodecController2;
        try {
            if (this.state == 1) {
                this.bufferEnqueuer.shutdown();
                this.asynchronousMediaCodecCallback.shutdown();
            }
            this.state = 2;
            if (this.codecReleased) {
                return;
            }
            try {
                int i3 = android.os.Build.VERSION.SDK_INT;
                if (i3 >= 30 && i3 < 33) {
                    this.codec.stop();
                }
            } finally {
                if (android.os.Build.VERSION.SDK_INT >= 35 && (loudnessCodecController2 = this.loudnessCodecController) != null) {
                    loudnessCodecController2.removeMediaCodec(this.codec);
                }
                this.codec.release();
                this.codecReleased = true;
            }
        } catch (java.lang.Throwable th) {
            if (!this.codecReleased) {
                try {
                    int i9 = android.os.Build.VERSION.SDK_INT;
                    if (i9 >= 30 && i9 < 33) {
                        this.codec.stop();
                    }
                } finally {
                    if (android.os.Build.VERSION.SDK_INT >= 35 && (loudnessCodecController = this.loudnessCodecController) != null) {
                        loudnessCodecController.removeMediaCodec(this.codec);
                    }
                    this.codec.release();
                    this.codecReleased = true;
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i3, boolean z6) {
        this.codec.releaseOutputBuffer(i3, z6);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.os.Handler handler) {
        this.codec.setOnFrameRenderedListener(new androidx.media3.exoplayer.mediacodec.b(this, onFrameRenderedListener, 0), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOutputSurface(android.view.Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(android.os.Bundle bundle) {
        this.bufferEnqueuer.setParameters(bundle);
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

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void useInputBuffer(java.lang.Runnable runnable) {
        this.asynchronousMediaCodecCallback.useInputBuffer(new androidx.media3.exoplayer.mediacodec.a(this, runnable, 0));
    }

    private AsynchronousMediaCodecAdapter(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer, androidx.media3.exoplayer.mediacodec.LoudnessCodecController loudnessCodecController) {
        this.codec = mediaCodec;
        this.asynchronousMediaCodecCallback = new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecCallback(handlerThread);
        this.bufferEnqueuer = mediaCodecBufferEnqueuer;
        this.loudnessCodecController = loudnessCodecController;
        this.state = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i3, long j) {
        this.codec.releaseOutputBuffer(i3, j);
    }
}
