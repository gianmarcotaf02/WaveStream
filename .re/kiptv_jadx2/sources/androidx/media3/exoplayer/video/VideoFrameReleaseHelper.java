package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;

public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.1f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    public static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private final Context context;
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
    private Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private boolean vsyncSampleBuilt;
    private VSyncSampler vsyncSampler;
    private final FixedFrameRateEstimator frameRateEstimator = new FixedFrameRateEstimator();
    private float formatFrameRate = -1.0f;
    private float playbackSpeed = 1.0f;
    private int changeFrameRateStrategy = 0;

    public static final class Api30 {
        private Api30() {
        }

        public static void setSurfaceFrameRate(Surface surface, float f9) {
            try {
                surface.setFrameRate(f9, f9 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e6) {
                Log.e(VideoFrameReleaseHelper.TAG, "Failed to call Surface.setFrameRate", e6);
            }
        }
    }

    public static abstract class VSyncSampler implements DisplayManager.DisplayListener {
        final Choreographer choreographer;
        final DisplayManager displayManager;
        volatile long sampledVsyncTimeNs;
        volatile long vsyncDurationNs;

        public static VSyncSampler maybeBuildInstance(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager == null) {
                return null;
            }
            try {
                Choreographer choreographer = Choreographer.getInstance();
                return Build.VERSION.SDK_INT >= 33 ? new VSyncSamplerV33(choreographer, displayManager) : new VSyncSamplerBase(choreographer, displayManager);
            } catch (RuntimeException e6) {
                Log.w(VideoFrameReleaseHelper.TAG, "Vsync sampling disabled due to platform error", e6);
                return null;
            }
        }

        @Override
        public final void onDisplayAdded(int i3) {
        }

        @Override
        public final void onDisplayRemoved(int i3) {
        }

        public void register() {
            this.displayManager.registerDisplayListener(this, Util.createHandlerForCurrentLooper());
        }

        public void unregister() {
            this.displayManager.unregisterDisplayListener(this);
        }

        private VSyncSampler(Choreographer choreographer, DisplayManager displayManager) {
            this.choreographer = choreographer;
            this.displayManager = displayManager;
            this.sampledVsyncTimeNs = C.TIME_UNSET;
            this.vsyncDurationNs = C.TIME_UNSET;
        }
    }

    public static final class VSyncSamplerBase extends VSyncSampler implements Choreographer.FrameCallback {
        private static long getVsyncDurationNsFromDefaultDisplay(DisplayManager displayManager) {
            Display display = displayManager.getDisplay(0);
            if (display != null) {
                return (long) (1.0E9d / ((double) display.getRefreshRate()));
            }
            Log.w(VideoFrameReleaseHelper.TAG, "Unable to query display refresh rate");
            return C.TIME_UNSET;
        }

        @Override
        public void doFrame(long j) {
            this.sampledVsyncTimeNs = j;
            this.choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override
        public void onDisplayChanged(int i3) {
            if (i3 == 0) {
                this.choreographer.postFrameCallback(this);
                this.vsyncDurationNs = getVsyncDurationNsFromDefaultDisplay(this.displayManager);
            }
        }

        @Override
        public void register() {
            super.register();
            this.choreographer.postFrameCallback(this);
            this.vsyncDurationNs = getVsyncDurationNsFromDefaultDisplay(this.displayManager);
        }

        @Override
        public void unregister() {
            super.unregister();
            this.choreographer.removeFrameCallback(this);
            this.sampledVsyncTimeNs = C.TIME_UNSET;
            this.vsyncDurationNs = C.TIME_UNSET;
        }

        private VSyncSamplerBase(Choreographer choreographer, DisplayManager displayManager) {
            super(choreographer, displayManager);
        }
    }

    public static final class VSyncSamplerV33 extends VSyncSampler implements Choreographer$VsyncCallback {
        private final Handler handler;

        public void lambda$onVsync$0() {
            this.choreographer.postVsyncCallback(this);
        }

        @Override
        public void onDisplayChanged(int i3) {
            if (i3 == 0) {
                this.choreographer.postVsyncCallback(this);
            }
        }

        public void onVsync(Choreographer.FrameData frameData) {
            this.sampledVsyncTimeNs = frameData.getFrameTimeNanos();
            Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
            int length = frameTimelines.length;
            long j = C.TIME_UNSET;
            if (length >= 2) {
                long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
                if (expectedPresentationTimeNanos != 0) {
                    j = expectedPresentationTimeNanos;
                }
                this.vsyncDurationNs = j;
            } else {
                this.vsyncDurationNs = C.TIME_UNSET;
            }
            this.handler.postDelayed(new c(1, this), 500L);
        }

        @Override
        public void register() {
            super.register();
            this.choreographer.postVsyncCallback(this);
        }

        @Override
        public void unregister() {
            super.unregister();
            this.handler.removeCallbacksAndMessages(null);
            this.choreographer.removeVsyncCallback(this);
            this.sampledVsyncTimeNs = C.TIME_UNSET;
            this.vsyncDurationNs = C.TIME_UNSET;
        }

        private VSyncSamplerV33(Choreographer choreographer, DisplayManager displayManager) {
            super(choreographer, displayManager);
            this.handler = Util.createHandlerForCurrentLooper();
        }
    }

    public VideoFrameReleaseHelper(Context context) {
        this.context = context;
    }

    private static boolean adjustmentAllowed(long j, long j9) {
        return Math.abs(j - j9) <= MAX_ALLOWED_ADJUSTMENT_NS;
    }

    private void clearSurfaceFrameRate() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || this.surfacePlaybackFrameRate == 0.0f || !surface.isValid()) {
            return;
        }
        this.surfacePlaybackFrameRate = 0.0f;
        Api30.setSurfaceFrameRate(this.surface, 0.0f);
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
        long jAbs = Math.abs(j13 - j14);
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
        if (Build.VERSION.SDK_INT < 30 || this.surface == null) {
            return;
        }
        float frameRate = this.frameRateEstimator.isSynced() ? this.frameRateEstimator.getFrameRate() : this.formatFrameRate;
        float f9 = this.surfaceMediaFrameRate;
        if (frameRate == f9) {
            return;
        }
        if (frameRate != -1.0f && f9 != -1.0f) {
            if (Math.abs(frameRate - this.surfaceMediaFrameRate) < ((!this.frameRateEstimator.isSynced() || this.frameRateEstimator.getMatchingFrameDurationSumNs() < MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS) ? 1.0f : 0.1f)) {
                return;
            }
        } else if (frameRate == -1.0f && this.frameRateEstimator.getFramesWithoutSyncCount() < 30) {
            return;
        }
        this.surfaceMediaFrameRate = frameRate;
        updateSurfacePlaybackFrameRate(false);
    }

    private void updateSurfacePlaybackFrameRate(boolean z6) {
        Surface surface;
        float f9;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || !surface.isValid()) {
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
            Api30.setSurfaceFrameRate(this.surface, f9);
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
        VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            long j12 = vSyncSampler.sampledVsyncTimeNs;
            long j13 = this.vsyncSampler.vsyncDurationNs;
            if (j12 != C.TIME_UNSET && j13 != C.TIME_UNSET) {
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
            this.vsyncSampler = VSyncSampler.maybeBuildInstance(this.context);
        }
        VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            vSyncSampler.register();
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onStopped() {
        this.started = false;
        VSyncSampler vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
            vSyncSampler.unregister();
        }
        clearSurfaceFrameRate();
    }

    public void onSurfaceChanged(Surface surface) {
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
        VSyncSampler vSyncSampler = this.vsyncSampler;
        vSyncSampler.getClass();
        vSyncSampler.sampledVsyncTimeNs = j;
        this.vsyncSampler.vsyncDurationNs = j9;
    }
}
