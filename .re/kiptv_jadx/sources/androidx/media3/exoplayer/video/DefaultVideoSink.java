package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
final class DefaultVideoSink implements androidx.media3.exoplayer.video.VideoSink {
    private androidx.media3.common.Format inputFormat;
    private androidx.media3.exoplayer.video.VideoSink.Listener listener;
    private java.util.concurrent.Executor listenerExecutor;
    private android.view.Surface outputSurface;
    private long streamStartPositionUs;
    private final java.util.Queue<androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler> videoFrameHandlers;
    private androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    private final androidx.media3.exoplayer.video.VideoFrameRenderControl videoFrameRenderControl;

    public final class FrameRendererImpl implements androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer {
        private androidx.media3.common.Format outputFormat;

        private FrameRendererImpl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$dropFrame$2() {
            androidx.media3.exoplayer.video.DefaultVideoSink.this.listener.onFrameDropped();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVideoSizeChanged$0(androidx.media3.common.VideoSize videoSize) {
            androidx.media3.exoplayer.video.DefaultVideoSink.this.listener.onVideoSizeChanged(videoSize);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$renderFrame$1() {
            androidx.media3.exoplayer.video.DefaultVideoSink.this.listener.onFirstFrameRendered();
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void dropFrame() {
            androidx.media3.exoplayer.video.DefaultVideoSink.this.listenerExecutor.execute(new androidx.media3.exoplayer.video.d(this, 1));
            ((androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler) androidx.media3.exoplayer.video.DefaultVideoSink.this.videoFrameHandlers.remove()).skip();
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
            this.outputFormat = new androidx.media3.common.Format.Builder().setWidth(videoSize.width).setHeight(videoSize.height).setSampleMimeType(androidx.media3.common.MimeTypes.VIDEO_RAW).build();
            androidx.media3.exoplayer.video.DefaultVideoSink.this.listenerExecutor.execute(new androidx.media3.exoplayer.video.e(this, videoSize, 0));
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameRenderControl.FrameRenderer
        public void renderFrame(long j, long j9, boolean z6) {
            if (z6 && androidx.media3.exoplayer.video.DefaultVideoSink.this.outputSurface != null) {
                androidx.media3.exoplayer.video.DefaultVideoSink.this.listenerExecutor.execute(new androidx.media3.exoplayer.video.d(this, 0));
            }
            androidx.media3.common.Format formatBuild = this.outputFormat;
            if (formatBuild == null) {
                formatBuild = new androidx.media3.common.Format.Builder().build();
            }
            androidx.media3.exoplayer.video.DefaultVideoSink.this.videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j9, j, formatBuild, null);
            ((androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler) androidx.media3.exoplayer.video.DefaultVideoSink.this.videoFrameHandlers.remove()).render(j);
        }
    }

    public DefaultVideoSink(androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl, androidx.media3.exoplayer.video.VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster, androidx.media3.common.util.Clock clock) {
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        videoFrameReleaseControl.setClock(clock);
        this.videoFrameRenderControl = new androidx.media3.exoplayer.video.VideoFrameRenderControl(new androidx.media3.exoplayer.video.DefaultVideoSink.FrameRendererImpl(), videoFrameReleaseControl, videoFrameReleaseEarlyTimeForecaster);
        this.videoFrameHandlers = new java.util.ArrayDeque();
        this.inputFormat = new androidx.media3.common.Format.Builder().build();
        this.streamStartPositionUs = androidx.media3.common.C.TIME_UNSET;
        this.listener = androidx.media3.exoplayer.video.VideoSink.Listener.NO_OP;
        this.listenerExecutor = new androidx.media3.exoplayer.video.a(0);
        this.videoFrameMetadataListener = new androidx.media3.exoplayer.video.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleInputFrame$2() {
        this.listener.onFrameAvailableForRendering();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(java.lang.Runnable runnable) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$1(long j, long j9, androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void allowReleaseFirstFrameBeforeStarted() {
        this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void clearOutputSurfaceInfo() {
        this.outputSurface = null;
        this.videoFrameReleaseControl.setOutputSurface(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void flush(boolean z6) {
        if (z6) {
            this.videoFrameReleaseControl.reset();
        }
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        this.videoFrameRenderControl.flush();
        this.videoFrameHandlers.clear();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public android.view.Surface getInputSurface() {
        android.view.Surface surface = this.outputSurface;
        surface.getClass();
        return surface;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean handleInputBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean handleInputFrame(long j, androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler videoFrameHandler) {
        this.videoFrameHandlers.add(videoFrameHandler);
        this.videoFrameRenderControl.onFrameAvailableForRendering(j);
        this.listenerExecutor.execute(new androidx.media3.exoplayer.video.c(0, this));
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean initialize(androidx.media3.common.Format format) {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isEnded() {
        return this.videoFrameRenderControl.isEnded();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isInitialized() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean isReady(boolean z6) {
        return this.videoFrameReleaseControl.isReady(z6);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void join(boolean z6) {
        this.videoFrameReleaseControl.join(z6);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void onInputStreamChanged(int i3, androidx.media3.common.Format format, long j, int i9, java.util.List<androidx.media3.common.Effect> list) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(list.isEmpty());
        int i10 = format.width;
        androidx.media3.common.Format format2 = this.inputFormat;
        if (i10 != format2.width || format.height != format2.height) {
            this.videoFrameRenderControl.onVideoSizeChanged(i10, format.height);
        }
        float f9 = format.frameRate;
        if (f9 != this.inputFormat.frameRate) {
            this.videoFrameReleaseControl.setFrameRate(f9);
        }
        this.inputFormat = format;
        if (j != this.streamStartPositionUs) {
            this.videoFrameRenderControl.onStreamChanged(i9, j);
            this.streamStartPositionUs = j;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void redraw() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void release() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void render(long j, long j9) throws androidx.media3.exoplayer.video.VideoSink.VideoSinkException {
        try {
            this.videoFrameRenderControl.render(j, j9);
        } catch (androidx.media3.exoplayer.ExoPlaybackException e6) {
            throw new androidx.media3.exoplayer.video.VideoSink.VideoSinkException(e6, this.inputFormat);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setBufferTimestampAdjustmentUs(long j) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setChangeFrameRateStrategy(int i3) {
        this.videoFrameReleaseControl.setChangeFrameRateStrategy(i3);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setListener(androidx.media3.exoplayer.video.VideoSink.Listener listener, java.util.concurrent.Executor executor) {
        this.listener = listener;
        this.listenerExecutor = executor;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setOutputSurfaceInfo(android.view.Surface surface, androidx.media3.common.util.Size size) {
        this.outputSurface = surface;
        this.videoFrameReleaseControl.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setPlaybackSpeed(float f9) {
        this.videoFrameReleaseControl.setPlaybackSpeed(f9);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setVideoEffects(java.util.List<androidx.media3.common.Effect> list) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void signalEndOfCurrentInputStream() {
        this.videoFrameRenderControl.signalEndOfInput();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void signalEndOfInput() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void startRendering() {
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        this.videoFrameReleaseControl.onStarted();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void stopRendering() {
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        this.videoFrameReleaseControl.onStopped();
    }
}
