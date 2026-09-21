package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackVideoGraphWrapper implements androidx.media3.common.VideoGraph.Listener {
    public static final long LATE_US_TO_DROP_INPUT_FRAME = 15000;
    private static final java.util.concurrent.Executor NO_OP_EXECUTOR = new androidx.media3.exoplayer.video.a(1);
    private static final int PRIMARY_SEQUENCE_INDEX = 0;
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 2;
    private static final java.lang.String TAG = "PlaybackVidGraphWrapper";
    private final androidx.media3.common.util.Clock clock;
    private p076i4.AbstractC2186b0 compositionEffects;
    private androidx.media3.common.VideoCompositorSettings compositorSettings;
    private final android.content.Context context;
    private android.util.Pair<android.view.Surface, androidx.media3.common.util.Size> currentSurfaceAndSize;
    private final androidx.media3.exoplayer.video.VideoSink defaultVideoSink;
    private final long earlyThresholdToDropInputUs;
    private final boolean enablePlaylistMode;
    private long finalFramePresentationTimeUs;
    private androidx.media3.common.util.HandlerWrapper handler;
    private boolean hasSignaledEndOfVideoGraphOutputStream;
    private final android.util.SparseArray<androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.InputVideoSink> inputVideoSinks;
    private boolean isInputSdrToneMapped;
    private long lastOutputFramePresentationTimeUs;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener> listeners;
    private int outputStreamFirstFrameReleaseInstruction;
    private long outputStreamStartPositionUs;
    private int pendingFlushCount;
    private androidx.media3.common.util.TimedValueQueue<androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.StreamChangeInfo> pendingStreamChanges;
    private int registeredVideoInputCount;
    private boolean requestOpenGlToneMapping;
    private int state;
    private int totalVideoInputCount;
    private final androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler videoFrameHandler;
    private androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    private androidx.media3.common.VideoGraph videoGraph;
    private final androidx.media3.common.VideoGraph.Factory videoGraphFactory;
    private androidx.media3.common.Format videoGraphOutputFormat;

    public static final class Builder {
        private boolean built;
        private final android.content.Context context;
        private boolean enablePlaylistMode;
        private boolean enableReplayableCache;
        private final androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl;
        private androidx.media3.common.VideoGraph.Factory videoGraphFactory;
        private long lateThresholdToDropInputUs = 15000;
        private androidx.media3.exoplayer.video.VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = new androidx.media3.exoplayer.video.VideoFrameReleaseEarlyTimeForecaster(1.0f);
        private androidx.media3.common.util.Clock clock = androidx.media3.common.util.Clock.DEFAULT;

        public Builder(android.content.Context context, androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
        }

        public androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper build() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.built);
            if (this.videoGraphFactory == null) {
                this.videoGraphFactory = new androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.ReflectiveSingleInputVideoGraphFactory(this.enableReplayableCache);
            }
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper playbackVideoGraphWrapper = new androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper(this);
            this.built = true;
            return playbackVideoGraphWrapper;
        }

        public androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Builder experimentalSetLateThresholdToDropInputUs(long j) {
            this.lateThresholdToDropInputUs = j;
            return this;
        }

        public androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Builder setClock(androidx.media3.common.util.Clock clock) {
            this.clock = clock;
            return this;
        }

        public androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Builder setEnablePlaylistMode(boolean z6) {
            this.enablePlaylistMode = z6;
            return this;
        }

        public androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Builder setEnableReplayableCache(boolean z6) {
            this.enableReplayableCache = z6;
            return this;
        }

        public androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Builder setVideoFrameReleaseEarlyTimeForecaster(androidx.media3.exoplayer.video.VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster) {
            this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
            return this;
        }

        public androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Builder setVideoGraphFactory(androidx.media3.common.VideoGraph.Factory factory) {
            this.videoGraphFactory = factory;
            return this;
        }
    }

    public final class DefaultVideoSinkListener implements androidx.media3.exoplayer.video.VideoSink.Listener {
        private DefaultVideoSinkListener() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onError(androidx.media3.exoplayer.video.VideoSink.VideoSinkException videoSinkException) {
            java.util.Iterator it = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener) it.next()).onError(androidx.media3.common.VideoFrameProcessingException.from(videoSinkException));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onFirstFrameRendered() {
            java.util.Iterator it = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener) it.next()).onFirstFrameRendered();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onFrameDropped() {
            java.util.Iterator it = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener) it.next()).onFrameDropped();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
            java.util.Iterator it = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener) it.next()).onVideoSizeChanged(videoSize);
            }
        }
    }

    public final class InputVideoSink implements androidx.media3.exoplayer.video.VideoSink, androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener {
        private static final int MAX_CONSECUTIVE_FRAMES_TO_DROP = 2;
        private int consecutiveDroppedFrames;
        private long inputBufferTimestampAdjustmentUs;
        private androidx.media3.common.Format inputFormat;
        private final int inputIndex;
        private int inputType;
        private boolean isInitialized;
        private long lastFramePresentationTimeUs;
        private androidx.media3.exoplayer.video.VideoSink.Listener listener;
        private java.util.concurrent.Executor listenerExecutor;
        private boolean signaledEndOfStream;
        private p076i4.AbstractC2186b0 videoEffects;
        private final int videoFrameProcessorMaxPendingFrameCount;

        public InputVideoSink(android.content.Context context, int i3) {
            this.inputIndex = i3;
            this.videoFrameProcessorMaxPendingFrameCount = androidx.media3.common.util.Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            this.videoEffects = p076i4.S0.f22832l;
            this.lastFramePresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
            this.listener = androidx.media3.exoplayer.video.VideoSink.Listener.NO_OP;
            this.listenerExecutor = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.NO_OP_EXECUTOR;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onError$1(androidx.media3.exoplayer.video.VideoSink.Listener listener, androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
            androidx.media3.common.Format format = this.inputFormat;
            format.getClass();
            listener.onError(new androidx.media3.exoplayer.video.VideoSink.VideoSinkException(videoFrameProcessingException, format));
        }

        private void registerInputStream(androidx.media3.common.Format format) {
            androidx.media3.common.Format formatBuild = format.buildUpon().setColorInfo(androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.getAdjustedInputColorInfo(format.colorInfo)).build();
            int i3 = this.inputType != 1 ? 2 : 1;
            androidx.media3.common.VideoGraph videoGraph = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            videoGraph.registerInputStream(this.inputIndex, i3, formatBuild, this.videoEffects, 0L);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void allowReleaseFirstFrameBeforeStarted() {
            if (androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.pendingStreamChanges.size() == 0) {
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.allowReleaseFirstFrameBeforeStarted();
                return;
            }
            androidx.media3.common.util.TimedValueQueue timedValueQueue = new androidx.media3.common.util.TimedValueQueue();
            boolean z6 = true;
            while (androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.pendingStreamChanges.size() > 0) {
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.StreamChangeInfo streamChangeInfo = (androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.StreamChangeInfo) androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.pendingStreamChanges.pollFirst();
                streamChangeInfo.getClass();
                if (z6) {
                    int i3 = streamChangeInfo.firstFrameReleaseInstruction;
                    if (i3 == 0 || i3 == 1) {
                        streamChangeInfo = new androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.StreamChangeInfo(streamChangeInfo.startPositionUs, 0, streamChangeInfo.fromTimestampUs);
                    } else {
                        androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.allowReleaseFirstFrameBeforeStarted();
                    }
                    z6 = false;
                }
                timedValueQueue.add(streamChangeInfo.fromTimestampUs, streamChangeInfo);
            }
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.pendingStreamChanges = timedValueQueue;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void clearOutputSurfaceInfo() {
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.clearOutputSurfaceInfo();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void flush(boolean z6) {
            if (isInitialized()) {
                androidx.media3.common.VideoGraph videoGraph = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.flush();
            }
            this.lastFramePresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.flush(z6);
            this.signaledEndOfStream = false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public android.view.Surface getInputSurface() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(isInitialized());
            androidx.media3.common.VideoGraph videoGraph = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            return videoGraph.getInputSurface(this.inputIndex);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(isInitialized());
            if (!androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.shouldRenderToInputVideoSink()) {
                return false;
            }
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.ShiftingTimestampIterator shiftingTimestampIterator = new androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.ShiftingTimestampIterator(timestampIterator, this.inputBufferTimestampAdjustmentUs);
            androidx.media3.common.VideoGraph videoGraph = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            if (!videoGraph.queueInputBitmap(this.inputIndex, bitmap, shiftingTimestampIterator)) {
                return false;
            }
            long lastTimestampUs = shiftingTimestampIterator.getLastTimestampUs();
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(lastTimestampUs != androidx.media3.common.C.TIME_UNSET);
            this.lastFramePresentationTimeUs = lastTimestampUs;
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean handleInputFrame(long j, androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler videoFrameHandler) {
            int i3;
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(isInitialized());
            long j9 = j + this.inputBufferTimestampAdjustmentUs;
            long jPredictEarlyUs = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.videoFrameReleaseEarlyTimeForecaster.predictEarlyUs(j9);
            if (jPredictEarlyUs != androidx.media3.common.C.TIME_UNSET && androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.earlyThresholdToDropInputUs != androidx.media3.common.C.TIME_UNSET && jPredictEarlyUs < androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.earlyThresholdToDropInputUs && (i3 = this.consecutiveDroppedFrames) < 2) {
                this.consecutiveDroppedFrames = i3 + 1;
                videoFrameHandler.skip();
                return true;
            }
            if (!androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.shouldRenderToInputVideoSink()) {
                return false;
            }
            androidx.media3.common.VideoGraph videoGraph = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            if (videoGraph.getPendingInputFrameCount(this.inputIndex) >= this.videoFrameProcessorMaxPendingFrameCount) {
                return false;
            }
            androidx.media3.common.VideoGraph videoGraph2 = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph2.getClass();
            if (!videoGraph2.registerInputFrame(this.inputIndex)) {
                return false;
            }
            this.lastFramePresentationTimeUs = j9;
            videoFrameHandler.render(j9 * 1000);
            this.consecutiveDroppedFrames = 0;
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean initialize(androidx.media3.common.Format format) throws androidx.media3.exoplayer.video.VideoSink.VideoSinkException {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!isInitialized());
            boolean zRegisterInput = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.registerInput(format, this.inputIndex);
            this.isInitialized = zRegisterInput;
            return zRegisterInput;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isEnded() {
            return isInitialized() && androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.isEnded();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isInitialized() {
            return this.isInitialized;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean isReady(boolean z6) {
            return androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.isReady(z6 && isInitialized());
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void join(boolean z6) {
            if (androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.joinPlayback(z6);
            }
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
            this.listenerExecutor.execute(new androidx.media3.exoplayer.video.f(this, this.listener, videoFrameProcessingException, 0));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFirstFrameRendered() {
            androidx.media3.exoplayer.video.VideoSink.Listener listener = this.listener;
            java.util.concurrent.Executor executor = this.listenerExecutor;
            java.util.Objects.requireNonNull(listener);
            executor.execute(new androidx.media3.exoplayer.video.g(listener, 1));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFrameAvailableForRendering() {
            androidx.media3.exoplayer.video.VideoSink.Listener listener = this.listener;
            java.util.concurrent.Executor executor = this.listenerExecutor;
            java.util.Objects.requireNonNull(listener);
            executor.execute(new androidx.media3.exoplayer.video.g(listener, 2));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onFrameDropped() {
            androidx.media3.exoplayer.video.VideoSink.Listener listener = this.listener;
            java.util.concurrent.Executor executor = this.listenerExecutor;
            java.util.Objects.requireNonNull(listener);
            executor.execute(new androidx.media3.exoplayer.video.g(listener, 0));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void onInputStreamChanged(int i3, androidx.media3.common.Format format, long j, int i9, java.util.List<androidx.media3.common.Effect> list) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(isInitialized());
            this.videoEffects = p076i4.AbstractC2186b0.u(list);
            this.inputType = i3;
            this.inputFormat = format;
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.hasSignaledEndOfVideoGraphOutputStream = false;
            registerInputStream(format);
            boolean z6 = this.lastFramePresentationTimeUs == androidx.media3.common.C.TIME_UNSET;
            if (androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.enablePlaylistMode || (this.inputIndex == 0 && z6)) {
                long j9 = z6 ? -4611686018427387904L : this.lastFramePresentationTimeUs + 1;
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.pendingStreamChanges.add(j9, new androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.StreamChangeInfo(this.inputBufferTimestampAdjustmentUs + j, i9, j9));
            }
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
            this.listenerExecutor.execute(new androidx.media3.exoplayer.video.e(this.listener, videoSize, 1));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void redraw() {
            if (isInitialized()) {
                boolean z6 = this.signaledEndOfStream;
                long j = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs;
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.flush(false);
                androidx.media3.common.VideoGraph videoGraph = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.redraw();
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs = j;
                if (z6) {
                    signalEndOfCurrentInputStream();
                }
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.release();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void render(long j, long j9) {
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.render(j + this.inputBufferTimestampAdjustmentUs, j9);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setBufferTimestampAdjustmentUs(long j) {
            this.inputBufferTimestampAdjustmentUs = j;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setChangeFrameRateStrategy(int i3) {
            if (this.inputIndex == 0) {
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.setChangeFrameRateStrategy(i3);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setListener(androidx.media3.exoplayer.video.VideoSink.Listener listener, java.util.concurrent.Executor executor) {
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setOutputSurfaceInfo(android.view.Surface surface, androidx.media3.common.util.Size size) {
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.setOutputSurfaceInfo(surface, size);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setPlaybackSpeed(float f9) {
            if (this.inputIndex == 0) {
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.setPlaybackSpeed(f9);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoEffects(java.util.List<androidx.media3.common.Effect> list) {
            if (this.videoEffects.equals(list)) {
                return;
            }
            this.videoEffects = p076i4.AbstractC2186b0.u(list);
            androidx.media3.common.Format format = this.inputFormat;
            if (format != null) {
                registerInputStream(format);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
            if (this.inputIndex == 0) {
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.setVideoFrameMetadataListener(videoFrameMetadataListener);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void signalEndOfCurrentInputStream() {
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs = this.lastFramePresentationTimeUs;
            if (androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs >= androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs) {
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.signalEndOfVideoGraphOutputStream();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void signalEndOfInput() {
            if (!this.signaledEndOfStream && isInitialized()) {
                androidx.media3.common.VideoGraph videoGraph = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.signalEndOfInput(this.inputIndex);
                this.signaledEndOfStream = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void startRendering() {
            if (androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.startRendering();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void stopRendering() {
            if (androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.stopRendering();
            }
        }
    }

    public interface Listener {
        default void onEnded(long j) {
        }

        default void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onFirstFrameRendered() {
        }

        default void onFrameAvailableForRendering() {
        }

        default void onFrameDropped() {
        }

        default void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
        }
    }

    public static final class ReflectiveDefaultVideoFrameProcessorFactory implements androidx.media3.common.VideoFrameProcessor.Factory {
        private static final p068h4.v DEFAULT_VIDEO_FRAME_PROCESSOR_FACTORY_BUILDER_CLASS = com.google.android.gms.internal.play_billing.V0.x(new androidx.media3.exoplayer.video.h());
        private final boolean enableReplayableCache;

        public ReflectiveDefaultVideoFrameProcessorFactory(boolean z6) {
            this.enableReplayableCache = z6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ java.lang.Class lambda$static$0() {
            try {
                return java.lang.Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (java.lang.Exception e6) {
                throw new java.lang.IllegalStateException(e6);
            }
        }

        @Override // androidx.media3.common.VideoFrameProcessor.Factory
        public androidx.media3.common.VideoFrameProcessor create(android.content.Context context, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.ColorInfo colorInfo, boolean z6, java.util.concurrent.Executor executor, androidx.media3.common.VideoFrameProcessor.Listener listener) throws androidx.media3.common.VideoFrameProcessingException {
            try {
                java.lang.Class cls = (java.lang.Class) DEFAULT_VIDEO_FRAME_PROCESSOR_FACTORY_BUILDER_CLASS.get();
                java.lang.Object objNewInstance = cls.getConstructor(null).newInstance(null);
                cls.getMethod("setEnableReplayableCache", java.lang.Boolean.TYPE).invoke(objNewInstance, java.lang.Boolean.valueOf(this.enableReplayableCache));
                java.lang.Object objInvoke = cls.getMethod(io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, null).invoke(objNewInstance, null);
                objInvoke.getClass();
                return ((androidx.media3.common.VideoFrameProcessor.Factory) objInvoke).create(context, debugViewProvider, colorInfo, z6, executor, listener);
            } catch (java.lang.Exception e6) {
                throw new androidx.media3.common.VideoFrameProcessingException(e6);
            }
        }
    }

    public static final class ReflectiveSingleInputVideoGraphFactory implements androidx.media3.common.VideoGraph.Factory {
        private final androidx.media3.common.VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public ReflectiveSingleInputVideoGraphFactory(boolean z6) {
            this.videoFrameProcessorFactory = new androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.ReflectiveDefaultVideoFrameProcessorFactory(z6);
        }

        @Override // androidx.media3.common.VideoGraph.Factory
        public androidx.media3.common.VideoGraph create(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, long j, boolean z6) {
            try {
                return ((androidx.media3.common.VideoGraph.Factory) java.lang.Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(androidx.media3.common.VideoFrameProcessor.Factory.class).newInstance(this.videoFrameProcessorFactory)).create(context, colorInfo, debugViewProvider, listener, executor, j, z6);
            } catch (java.lang.Exception e6) {
                throw new java.lang.IllegalStateException(e6);
            }
        }

        @Override // androidx.media3.common.VideoGraph.Factory
        public boolean supportsMultipleInputs() {
            return false;
        }
    }

    public static final class ShiftingTimestampIterator implements androidx.media3.common.util.TimestampIterator {
        private final long shift;
        private final androidx.media3.common.util.TimestampIterator timestampIterator;

        public ShiftingTimestampIterator(androidx.media3.common.util.TimestampIterator timestampIterator, long j) {
            this.timestampIterator = timestampIterator;
            this.shift = j;
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public androidx.media3.common.util.TimestampIterator copyOf() {
            return new androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.ShiftingTimestampIterator(this.timestampIterator.copyOf(), this.shift);
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public long getLastTimestampUs() {
            long lastTimestampUs = this.timestampIterator.getLastTimestampUs();
            return lastTimestampUs == androidx.media3.common.C.TIME_UNSET ? androidx.media3.common.C.TIME_UNSET : lastTimestampUs + this.shift;
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public boolean hasNext() {
            return this.timestampIterator.hasNext();
        }

        @Override // androidx.media3.common.util.TimestampIterator
        public long next() {
            return this.timestampIterator.next() + this.shift;
        }
    }

    public static final class StreamChangeInfo {
        public final int firstFrameReleaseInstruction;
        public final long fromTimestampUs;
        public final long startPositionUs;

        public StreamChangeInfo(long j, int i3, long j9) {
            this.startPositionUs = j;
            this.firstFrameReleaseInstruction = i3;
            this.fromTimestampUs = j9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void allowReleaseFirstFrameBeforeStarted() {
        this.defaultVideoSink.allowReleaseFirstFrameBeforeStarted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flush(boolean z6) {
        if (isInitialized()) {
            this.pendingFlushCount++;
            this.defaultVideoSink.flush(z6);
            while (this.pendingStreamChanges.size() > 1) {
                this.pendingStreamChanges.pollFirst();
            }
            if (this.pendingStreamChanges.size() == 1) {
                androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.StreamChangeInfo streamChangeInfoPollFirst = this.pendingStreamChanges.pollFirst();
                streamChangeInfoPollFirst.getClass();
                this.outputStreamStartPositionUs = streamChangeInfoPollFirst.startPositionUs;
                this.outputStreamFirstFrameReleaseInstruction = streamChangeInfoPollFirst.firstFrameReleaseInstruction;
                onOutputStreamChanged();
            }
            this.lastOutputFramePresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
            if (z6) {
                this.finalFramePresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
                this.hasSignaledEndOfVideoGraphOutputStream = false;
            }
            androidx.media3.common.util.HandlerWrapper handlerWrapper = this.handler;
            handlerWrapper.getClass();
            handlerWrapper.post(new androidx.media3.exoplayer.video.c(2, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.media3.common.ColorInfo getAdjustedInputColorInfo(androidx.media3.common.ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid() || this.isInputSdrToneMapped) ? androidx.media3.common.ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isEnded() {
        return this.pendingFlushCount == 0 && this.hasSignaledEndOfVideoGraphOutputStream && this.defaultVideoSink.isEnded();
    }

    private boolean isInitialized() {
        return this.state == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReady(boolean z6) {
        return this.defaultVideoSink.isReady(z6 && this.pendingFlushCount == 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void joinPlayback(boolean z6) {
        this.defaultVideoSink.join(z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$flush$1() {
        this.pendingFlushCount--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(java.lang.Runnable runnable) {
    }

    private void maybeSetOutputSurfaceInfo(android.view.Surface surface, int i3, int i9) {
        androidx.media3.common.VideoGraph videoGraph = this.videoGraph;
        if (videoGraph == null) {
            return;
        }
        if (surface != null) {
            videoGraph.setOutputSurfaceInfo(new androidx.media3.common.SurfaceInfo(surface, i3, i9));
            this.defaultVideoSink.setOutputSurfaceInfo(surface, new androidx.media3.common.util.Size(i3, i9));
        } else {
            videoGraph.setOutputSurfaceInfo(null);
            this.defaultVideoSink.clearOutputSurfaceInfo();
        }
    }

    private void onOutputStreamChanged() {
        androidx.media3.exoplayer.video.VideoSink videoSink = this.defaultVideoSink;
        androidx.media3.common.Format format = this.videoGraphOutputFormat;
        long j = this.outputStreamStartPositionUs;
        int i3 = this.outputStreamFirstFrameReleaseInstruction;
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        videoSink.onInputStreamChanged(1, format, j, i3, p076i4.S0.f22832l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean registerInput(androidx.media3.common.Format format, int i3) throws androidx.media3.exoplayer.video.VideoSink.VideoSinkException {
        androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper playbackVideoGraphWrapper;
        androidx.media3.common.util.GlUtil.GlException glException;
        if (i3 == 0) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.state == 0);
            androidx.media3.common.ColorInfo adjustedInputColorInfo = getAdjustedInputColorInfo(format.colorInfo);
            try {
                try {
                    if (this.requestOpenGlToneMapping) {
                        adjustedInputColorInfo = androidx.media3.common.ColorInfo.SDR_BT709_LIMITED;
                    } else if (adjustedInputColorInfo.colorTransfer == 7 && android.os.Build.VERSION.SDK_INT < 34 && androidx.media3.common.util.GlUtil.isBt2020PqExtensionSupported()) {
                        adjustedInputColorInfo = adjustedInputColorInfo.buildUpon().setColorTransfer(6).build();
                    } else if (androidx.media3.common.util.GlUtil.isColorTransferSupported(adjustedInputColorInfo.colorTransfer) || android.os.Build.VERSION.SDK_INT < 29) {
                        int i9 = adjustedInputColorInfo.colorTransfer;
                        if (i9 == 2 || i9 == 10) {
                            adjustedInputColorInfo = androidx.media3.common.ColorInfo.SDR_BT709_LIMITED;
                        }
                    } else {
                        androidx.media3.common.util.Log.w(TAG, androidx.media3.common.util.Util.formatInvariant("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", java.lang.Integer.valueOf(adjustedInputColorInfo.colorTransfer)));
                        adjustedInputColorInfo = androidx.media3.common.ColorInfo.SDR_BT709_LIMITED;
                    }
                    androidx.media3.common.ColorInfo colorInfo = adjustedInputColorInfo;
                    androidx.media3.common.util.Clock clock = this.clock;
                    android.os.Looper looperMyLooper = android.os.Looper.myLooper();
                    looperMyLooper.getClass();
                    androidx.media3.common.util.HandlerWrapper handlerWrapperCreateHandler = clock.createHandler(looperMyLooper, null);
                    this.handler = handlerWrapperCreateHandler;
                    try {
                        androidx.media3.common.VideoGraph.Factory factory = this.videoGraphFactory;
                        android.content.Context context = this.context;
                        androidx.media3.common.DebugViewProvider debugViewProvider = androidx.media3.common.DebugViewProvider.NONE;
                        java.util.Objects.requireNonNull(handlerWrapperCreateHandler);
                        playbackVideoGraphWrapper = this;
                        try {
                            androidx.media3.common.VideoGraph videoGraphCreate = factory.create(context, colorInfo, debugViewProvider, playbackVideoGraphWrapper, new androidx.media3.exoplayer.ExecutorC1550e(1, handlerWrapperCreateHandler), 0L, false);
                            playbackVideoGraphWrapper.videoGraph = videoGraphCreate;
                            videoGraphCreate.setCompositionEffects(playbackVideoGraphWrapper.compositionEffects);
                            playbackVideoGraphWrapper.videoGraph.setCompositorSettings(playbackVideoGraphWrapper.compositorSettings);
                            playbackVideoGraphWrapper.videoGraph.initialize();
                            android.util.Pair<android.view.Surface, androidx.media3.common.util.Size> pair = playbackVideoGraphWrapper.currentSurfaceAndSize;
                            if (pair != null) {
                                android.view.Surface surface = (android.view.Surface) pair.first;
                                androidx.media3.common.util.Size size = (androidx.media3.common.util.Size) pair.second;
                                maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
                            }
                            playbackVideoGraphWrapper.defaultVideoSink.initialize(format);
                            androidx.media3.exoplayer.video.VideoSink videoSink = playbackVideoGraphWrapper.defaultVideoSink;
                            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.DefaultVideoSinkListener defaultVideoSinkListener = new androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.DefaultVideoSinkListener();
                            androidx.media3.common.util.HandlerWrapper handlerWrapper = playbackVideoGraphWrapper.handler;
                            java.util.Objects.requireNonNull(handlerWrapper);
                            videoSink.setListener(defaultVideoSinkListener, new androidx.media3.exoplayer.ExecutorC1550e(1, handlerWrapper));
                            playbackVideoGraphWrapper.state = 1;
                        } catch (androidx.media3.common.VideoFrameProcessingException e6) {
                            e = e6;
                            throw new androidx.media3.exoplayer.video.VideoSink.VideoSinkException(e, format);
                        }
                    } catch (androidx.media3.common.VideoFrameProcessingException e9) {
                        e = e9;
                    }
                } catch (androidx.media3.common.util.GlUtil.GlException e10) {
                    glException = e10;
                    throw new androidx.media3.exoplayer.video.VideoSink.VideoSinkException(glException, format);
                }
            } catch (androidx.media3.common.util.GlUtil.GlException e11) {
                glException = e11;
            }
        } else {
            playbackVideoGraphWrapper = this;
            if (!isInitialized()) {
                return false;
            }
        }
        try {
            androidx.media3.common.VideoGraph videoGraph = playbackVideoGraphWrapper.videoGraph;
            videoGraph.getClass();
            videoGraph.registerInput(i3);
            playbackVideoGraphWrapper.registeredVideoInputCount++;
            return true;
        } catch (androidx.media3.common.VideoFrameProcessingException e12) {
            throw new androidx.media3.exoplayer.video.VideoSink.VideoSinkException(e12, format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void render(long j, long j9) {
        this.defaultVideoSink.render(j, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChangeFrameRateStrategy(int i3) {
        this.defaultVideoSink.setChangeFrameRateStrategy(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f9) {
        this.videoFrameReleaseEarlyTimeForecaster.setPlaybackSpeed(f9);
        this.defaultVideoSink.setPlaybackSpeed(f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        this.defaultVideoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldRenderToInputVideoSink() {
        int i3 = this.totalVideoInputCount;
        return i3 != -1 && i3 == this.registeredVideoInputCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void signalEndOfVideoGraphOutputStream() {
        this.defaultVideoSink.signalEndOfCurrentInputStream();
        this.hasSignaledEndOfVideoGraphOutputStream = true;
    }

    public void addListener(androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener listener) {
        this.listeners.add(listener);
    }

    public void clearOutputSurfaceInfo() {
        androidx.media3.common.util.Size size = androidx.media3.common.util.Size.UNKNOWN;
        maybeSetOutputSurfaceInfo(null, size.getWidth(), size.getHeight());
        this.currentSurfaceAndSize = null;
    }

    public androidx.media3.exoplayer.video.VideoSink getSink(int i3) {
        if (androidx.media3.common.util.Util.contains(this.inputVideoSinks, i3)) {
            return this.inputVideoSinks.get(i3);
        }
        androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink = new androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.InputVideoSink(this.context, i3);
        if (i3 == 0) {
            addListener(inputVideoSink);
        }
        this.inputVideoSinks.put(i3, inputVideoSink);
        return inputVideoSink;
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onEnded(long j) {
        java.util.Iterator<androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onEnded(j);
        }
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
        java.util.Iterator<androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(videoFrameProcessingException);
        }
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameAvailableForRendering(long j, boolean z6) {
        if (this.pendingFlushCount > 0) {
            return;
        }
        java.util.Iterator<androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onFrameAvailableForRendering();
        }
        if (z6) {
            androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, androidx.media3.common.C.TIME_UNSET, this.videoGraphOutputFormat, null);
                return;
            }
            return;
        }
        this.lastOutputFramePresentationTimeUs = j;
        androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.StreamChangeInfo streamChangeInfoPollFloor = this.pendingStreamChanges.pollFloor(j);
        if (streamChangeInfoPollFloor != null) {
            this.outputStreamStartPositionUs = streamChangeInfoPollFloor.startPositionUs;
            this.outputStreamFirstFrameReleaseInstruction = streamChangeInfoPollFloor.firstFrameReleaseInstruction;
            onOutputStreamChanged();
        }
        this.defaultVideoSink.handleInputFrame(j, this.videoFrameHandler);
        long j9 = this.finalFramePresentationTimeUs;
        if (j9 == androidx.media3.common.C.TIME_UNSET || j < j9) {
            return;
        }
        signalEndOfVideoGraphOutputStream();
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputFrameRateChanged(float f9) {
        this.videoGraphOutputFormat = this.videoGraphOutputFormat.buildUpon().setFrameRate(f9).build();
        onOutputStreamChanged();
    }

    @Override // androidx.media3.common.VideoGraph.Listener
    public void onOutputSizeChanged(int i3, int i9) {
        this.videoGraphOutputFormat = this.videoGraphOutputFormat.buildUpon().setWidth(i3).setHeight(i9).build();
        onOutputStreamChanged();
    }

    public void release() {
        if (this.state == 2) {
            return;
        }
        androidx.media3.common.util.HandlerWrapper handlerWrapper = this.handler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
        }
        androidx.media3.common.VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.release();
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    public void removeListener(androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener listener) {
        this.listeners.remove(listener);
    }

    public void setCompositionEffects(java.util.List<androidx.media3.common.Effect> list) {
        this.compositionEffects = p076i4.AbstractC2186b0.u(list);
        androidx.media3.common.VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.setCompositionEffects(list);
        }
    }

    public void setCompositorSettings(androidx.media3.common.VideoCompositorSettings videoCompositorSettings) {
        this.compositorSettings = videoCompositorSettings;
        androidx.media3.common.VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.setCompositorSettings(videoCompositorSettings);
        }
    }

    public void setIsInputSdrToneMapped(boolean z6) {
        this.isInputSdrToneMapped = z6;
    }

    public void setOutputSurfaceInfo(android.view.Surface surface, androidx.media3.common.util.Size size) {
        android.util.Pair<android.view.Surface, androidx.media3.common.util.Size> pair = this.currentSurfaceAndSize;
        if (pair != null && ((android.view.Surface) pair.first).equals(surface) && ((androidx.media3.common.util.Size) this.currentSurfaceAndSize.second).equals(size)) {
            return;
        }
        this.currentSurfaceAndSize = android.util.Pair.create(surface, size);
        maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
    }

    public void setRequestOpenGlToneMapping(boolean z6) {
        this.requestOpenGlToneMapping = z6;
    }

    public void setTotalVideoInputCount(int i3) {
        if (i3 < this.totalVideoInputCount) {
            return;
        }
        this.totalVideoInputCount = i3;
    }

    public void startRendering() {
        this.defaultVideoSink.startRendering();
    }

    public void stopRendering() {
        this.defaultVideoSink.stopRendering();
    }

    private PlaybackVideoGraphWrapper(androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Builder builder) {
        this.context = builder.context;
        this.pendingStreamChanges = new androidx.media3.common.util.TimedValueQueue<>();
        androidx.media3.common.VideoGraph.Factory factory = builder.videoGraphFactory;
        factory.getClass();
        this.videoGraphFactory = factory;
        this.inputVideoSinks = new android.util.SparseArray<>();
        p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
        this.compositionEffects = p076i4.S0.f22832l;
        this.compositorSettings = androidx.media3.common.VideoCompositorSettings.DEFAULT;
        this.enablePlaylistMode = builder.enablePlaylistMode;
        androidx.media3.common.util.Clock clock = builder.clock;
        this.clock = clock;
        this.earlyThresholdToDropInputUs = builder.lateThresholdToDropInputUs != androidx.media3.common.C.TIME_UNSET ? -builder.lateThresholdToDropInputUs : -9223372036854775807L;
        androidx.media3.exoplayer.video.VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = builder.videoFrameReleaseEarlyTimeForecaster;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        this.defaultVideoSink = new androidx.media3.exoplayer.video.DefaultVideoSink(builder.videoFrameReleaseControl, videoFrameReleaseEarlyTimeForecaster, clock);
        this.videoFrameHandler = new androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler() { // from class: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.1
            @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
            public void render(long j) {
                androidx.media3.common.VideoGraph videoGraph = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.renderOutputFrame(j);
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
            public void skip() {
                androidx.media3.common.VideoGraph videoGraph = androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.renderOutputFrame(-2L);
            }
        };
        this.listeners = new java.util.concurrent.CopyOnWriteArraySet<>();
        this.videoGraphOutputFormat = new androidx.media3.common.Format.Builder().build();
        this.outputStreamStartPositionUs = androidx.media3.common.C.TIME_UNSET;
        this.lastOutputFramePresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.finalFramePresentationTimeUs = androidx.media3.common.C.TIME_UNSET;
        this.totalVideoInputCount = -1;
        this.state = 0;
    }
}
