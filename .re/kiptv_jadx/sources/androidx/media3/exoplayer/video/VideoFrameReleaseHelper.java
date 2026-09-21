package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.1f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final java.lang.String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    public static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private final android.content.Context context;
    private long frameIndex;
    private long lastAdjustedFrameIndex;
    private long lastAdjustedPresentationTimeUs;
    private long lastAdjustedReleaseTimeNs;
    private long lastVsyncHysteresisOffsetNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private long pendingLastPresentationTimeUs;
    private long pendingVsyncHysteresisOffsetNs;
    private boolean started;
    private android.view.Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private boolean vsyncSampleBuilt;
    private androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler vsyncSampler;
    private final androidx.media3.exoplayer.video.FixedFrameRateEstimator frameRateEstimator = new androidx.media3.exoplayer.video.FixedFrameRateEstimator();
    private float formatFrameRate = -1.0f;
    private float playbackSpeed = 1.0f;
    private int changeFrameRateStrategy = 0;

    public static final class Api30 {
        private Api30() {
        }

        public static void setSurfaceFrameRate(android.view.Surface surface, float f9) {
            try {
                surface.setFrameRate(f9, f9 == 0.0f ? 0 : 1);
            } catch (java.lang.IllegalStateException e6) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.video.VideoFrameReleaseHelper.TAG, "Failed to call Surface.setFrameRate", e6);
            }
        }
    }

    public static abstract class VSyncSampler implements android.hardware.display.DisplayManager.DisplayListener {
        final android.view.Choreographer choreographer;
        final android.hardware.display.DisplayManager displayManager;
        volatile long sampledVsyncTimeNs;
        volatile long vsyncDurationNs;

        /* JADX INFO: Access modifiers changed from: private */
        public static androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler maybeBuildInstance(android.content.Context context) {
            android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
            if (displayManager == null) {
                return null;
            }
            try {
                android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
                return android.os.Build.VERSION.SDK_INT >= 33 ? new androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSamplerV33(choreographer, displayManager) : new androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSamplerBase(choreographer, displayManager);
            } catch (java.lang.RuntimeException e6) {
                androidx.media3.common.util.Log.w(androidx.media3.exoplayer.video.VideoFrameReleaseHelper.TAG, "Vsync sampling disabled due to platform error", e6);
                return null;
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i3) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i3) {
        }

        public void register() {
            this.displayManager.registerDisplayListener(this, androidx.media3.common.util.Util.createHandlerForCurrentLooper());
        }

        public void unregister() {
            this.displayManager.unregisterDisplayListener(this);
        }

        private VSyncSampler(android.view.Choreographer choreographer, android.hardware.display.DisplayManager displayManager) {
            this.choreographer = choreographer;
            this.displayManager = displayManager;
            this.sampledVsyncTimeNs = androidx.media3.common.C.TIME_UNSET;
            this.vsyncDurationNs = androidx.media3.common.C.TIME_UNSET;
        }
    }

    public static final class VSyncSamplerBase extends androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler implements android.view.Choreographer.FrameCallback {
        private static long getVsyncDurationNsFromDefaultDisplay(android.hardware.display.DisplayManager displayManager) {
            android.view.Display display = displayManager.getDisplay(0);
            if (display != null) {
                return (long) (1.0E9d / ((double) display.getRefreshRate()));
            }
            androidx.media3.common.util.Log.w(androidx.media3.exoplayer.video.VideoFrameReleaseHelper.TAG, "Unable to query display refresh rate");
            return androidx.media3.common.C.TIME_UNSET;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.sampledVsyncTimeNs = j;
            this.choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i3) {
            if (i3 == 0) {
                this.choreographer.postFrameCallback(this);
                this.vsyncDurationNs = getVsyncDurationNsFromDefaultDisplay(this.displayManager);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public void register() {
            super.register();
            this.choreographer.postFrameCallback(this);
            this.vsyncDurationNs = getVsyncDurationNsFromDefaultDisplay(this.displayManager);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public void unregister() {
            super.unregister();
            this.choreographer.removeFrameCallback(this);
            this.sampledVsyncTimeNs = androidx.media3.common.C.TIME_UNSET;
            this.vsyncDurationNs = androidx.media3.common.C.TIME_UNSET;
        }

        private VSyncSamplerBase(android.view.Choreographer choreographer, android.hardware.display.DisplayManager displayManager) {
            super(choreographer, displayManager);
        }
    }

    public static final class VSyncSamplerV33 extends androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler implements android.view.Choreographer$VsyncCallback {
        private final android.os.Handler handler;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onVsync$0() {
            this.choreographer.postVsyncCallback(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i3) {
            if (i3 == 0) {
                this.choreographer.postVsyncCallback(this);
            }
        }

        public void onVsync(android.view.Choreographer.FrameData frameData) {
            this.sampledVsyncTimeNs = frameData.getFrameTimeNanos();
            android.view.Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
            int length = frameTimelines.length;
            long j = androidx.media3.common.C.TIME_UNSET;
            if (length >= 2) {
                long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
                if (expectedPresentationTimeNanos != 0) {
                    j = expectedPresentationTimeNanos;
                }
                this.vsyncDurationNs = j;
            } else {
                this.vsyncDurationNs = androidx.media3.common.C.TIME_UNSET;
            }
            this.handler.postDelayed(new androidx.media3.exoplayer.video.c(1, this), 500L);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public void register() {
            super.register();
            this.choreographer.postVsyncCallback(this);
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler
        public void unregister() {
            super.unregister();
            this.handler.removeCallbacksAndMessages(null);
            this.choreographer.removeVsyncCallback(this);
            this.sampledVsyncTimeNs = androidx.media3.common.C.TIME_UNSET;
            this.vsyncDurationNs = androidx.media3.common.C.TIME_UNSET;
        }

        private VSyncSamplerV33(android.view.Choreographer choreographer, android.hardware.display.DisplayManager displayManager) {
            super(choreographer, displayManager);
            this.handler = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
        }
    }

    public VideoFrameReleaseHelper(android.content.Context context) {
        this.context = context;
    }

    private static boolean adjustmentAllowed(long j, long j9) {
        return java.lang.Math.abs(j - j9) <= MAX_ALLOWED_ADJUSTMENT_NS;
    }

    private void clearSurfaceFrameRate() {
        android.view.Surface surface;
        if (android.os.Build.VERSION.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || this.surfacePlaybackFrameRate == 0.0f || !surface.isValid()) {
            return;
        }
        this.surfacePlaybackFrameRate = 0.0f;
        androidx.media3.exoplayer.video.VideoFrameReleaseHelper.Api30.setSurfaceFrameRate(this.surface, 0.0f);
    }

    private long findClosestVsyncAndUpdateHysteresis(long j, long j9, long j10) {
        long j11;
        long j12 = (((j - j9) / j10) * j10) + j9;
        if (j <= j12) {
            j11 = j12 - j10;
        } else {
            j11 = j12;
            j12 += j10;
        }
        long j13 = j12 - j;
        long j14 = j - j11;
        long jAbs = java.lang.Math.abs(j13 - j14);
        if (jAbs < j10 / 2) {
            long j15 = j10 / 4;
            if (jAbs < j15) {
                long j16 = this.lastVsyncHysteresisOffsetNs;
                if (j16 != 0) {
                    this.pendingVsyncHysteresisOffsetNs = j16;
                } else {
                    if (j13 < j14) {
                        j15 = -j15;
                    }
                    this.pendingVsyncHysteresisOffsetNs = j15;
                }
            } else {
                this.pendingVsyncHysteresisOffsetNs = 0L;
            }
        } else {
            this.pendingVsyncHysteresisOffsetNs = this.lastVsyncHysteresisOffsetNs;
        }
        return j13 + this.pendingVsyncHysteresisOffsetNs < j14 ? j12 : j11;
    }

    private void resetAdjustment() {
        this.frameIndex = 0L;
        this.lastAdjustedFrameIndex = -1L;
        this.pendingLastAdjustedFrameIndex = -1L;
        this.lastVsyncHysteresisOffsetNs = 0L;
        this.pendingVsyncHysteresisOffsetNs = 0L;
    }

    private void updateSurfaceMediaFrameRate() {
        if (android.os.Build.VERSION.SDK_INT < 30 || this.surface == null) {
            return;
        }
        float frameRate = this.frameRateEstimator.isSynced() ? this.frameRateEstimator.getFrameRate() : this.formatFrameRate;
        float f9 = this.surfaceMediaFrameRate;
        if (frameRate == f9) {
            return;
        }
        if (frameRate != -1.0f && f9 != -1.0f) {
            if (java.lang.Math.abs(frameRate - this.surfaceMediaFrameRate) < ((!this.frameRateEstimator.isSynced() || this.frameRateEstimator.getMatchingFrameDurationSumNs() < MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS) ? 1.0f : 0.1f)) {
                return;
            }
        } else if (frameRate == -1.0f && this.frameRateEstimator.getFramesWithoutSyncCount() < 30) {
            return;
        }
        this.surfaceMediaFrameRate = frameRate;
        updateSurfacePlaybackFrameRate(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    private void updateSurfacePlaybackFrameRate(boolean z6) {
        android.view.Surface surface;
        float f9;
        if (android.os.Build.VERSION.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.started) {
            float f10 = this.surfaceMediaFrameRate;
            if (f10 != -1.0f) {
                f9 = f10 * this.playbackSpeed;
            } else {
                f9 = 0.0f;
            }
        } else {
            f9 = 0.0f;
        }
        if (z6 || this.surfacePlaybackFrameRate != f9) {
            this.surfacePlaybackFrameRate = f9;
            androidx.media3.exoplayer.video.VideoFrameReleaseHelper.Api30.setSurfaceFrameRate(this.surface, f9);
        }
    }

    public long adjustReleaseTime(long j, long j9) {
        long j10;
        float frameDurationNs;
        float f9;
        if (this.lastAdjustedFrameIndex == -1) {
            j10 = j;
        } else {
            if (this.frameRateEstimator.isSynced()) {
                frameDurationNs = (this.frameIndex - this.lastAdjustedFrameIndex) * this.frameRateEstimator.getFrameDurationNs();
                f9 = this.playbackSpeed;
            } else {
                frameDurationNs = (j9 - this.lastAdjustedPresentationTimeUs) * 1000;
                f9 = this.playbackSpeed;
            }
            long j11 = this.lastAdjustedReleaseTimeNs + ((long) (frameDurationNs / f9));
            if (adjustmentAllowed(j, j11)) {
                j10 = j11;
            } else {
                resetAdjustment();
                j10 = j;
            }
        }
        this.pendingLastAdjustedFrameIndex = this.frameIndex;
        this.pendingLastAdjustedReleaseTimeNs = j10;
        this.pendingLastPresentationTimeUs = j9;
        androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            long j12 = vSyncSampler.sampledVsyncTimeNs;
            long j13 = this.vsyncSampler.vsyncDurationNs;
            if (j12 != androidx.media3.common.C.TIME_UNSET && j13 != androidx.media3.common.C.TIME_UNSET) {
                return findClosestVsyncAndUpdateHysteresis(j10, j12, j13) - ((j13 * VSYNC_OFFSET_PERCENTAGE) / 100);
            }
        }
        return j10;
    }

    public void onFormatChanged(float f9) {
        this.formatFrameRate = f9;
        this.frameRateEstimator.reset();
        updateSurfaceMediaFrameRate();
    }

    public void onNextFrame(long j) {
        long j9 = this.pendingLastAdjustedFrameIndex;
        if (j9 != -1) {
            this.lastAdjustedFrameIndex = j9;
            this.lastAdjustedReleaseTimeNs = this.pendingLastAdjustedReleaseTimeNs;
            this.lastAdjustedPresentationTimeUs = this.pendingLastPresentationTimeUs;
            this.lastVsyncHysteresisOffsetNs = this.pendingVsyncHysteresisOffsetNs;
        }
        this.frameIndex++;
        this.frameRateEstimator.onNextFrame(j * 1000);
        updateSurfaceMediaFrameRate();
    }

    public void onPlaybackSpeed(float f9) {
        this.playbackSpeed = f9;
        updateSurfacePlaybackFrameRate(false);
    }

    public void onPositionReset() {
        resetAdjustment();
    }

    public void onStarted() {
        this.started = true;
        resetAdjustment();
        if (!this.vsyncSampleBuilt) {
            this.vsyncSampler = androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler.maybeBuildInstance(this.context);
        }
        androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            vSyncSampler.register();
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onStopped() {
        this.started = false;
        androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            vSyncSampler.unregister();
        }
        clearSurfaceFrameRate();
    }

    public void onSurfaceChanged(android.view.Surface surface) {
        if (this.surface == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.surface = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setChangeFrameRateStrategy(int i3) {
        if (this.changeFrameRateStrategy == i3) {
            return;
        }
        this.changeFrameRateStrategy = i3;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setVsyncData(long j, long j9) {
        androidx.media3.exoplayer.video.VideoFrameReleaseHelper.VSyncSampler vSyncSampler = this.vsyncSampler;
        vSyncSampler.getClass();
        vSyncSampler.sampledVsyncTimeNs = j;
        this.vsyncSampler.vsyncDurationNs = j9;
    }
}
