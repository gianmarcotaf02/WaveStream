package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface Renderer extends androidx.media3.exoplayer.PlayerMessage.Target {
    public static final long DEFAULT_DURATION_TO_PROGRESS_US = 10000;
    public static final long DEFAULT_IDLE_DURATION_TO_PROGRESS_US = 1000000;
    public static final int MSG_CUSTOM_BASE = 10000;
    public static final int MSG_SET_AUDIO_ATTRIBUTES = 3;
    public static final int MSG_SET_AUDIO_OUTPUT_PROVIDER = 20;
    public static final int MSG_SET_AUDIO_SESSION_ID = 10;
    public static final int MSG_SET_AUX_EFFECT_INFO = 6;
    public static final int MSG_SET_CAMERA_MOTION_LISTENER = 8;
    public static final int MSG_SET_CHANGE_FRAME_RATE_STRATEGY = 5;
    public static final int MSG_SET_CODEC_PARAMETERS = 21;
    public static final int MSG_SET_IMAGE_METADATA_LISTENER = 23;
    public static final int MSG_SET_IMAGE_OUTPUT = 15;
    public static final int MSG_SET_PREFERRED_AUDIO_DEVICE = 12;
    public static final int MSG_SET_PRIORITY = 16;
    public static final int MSG_SET_SCALING_MODE = 4;
    public static final int MSG_SET_SCRUBBING_MODE = 18;
    public static final int MSG_SET_SKIP_SILENCE_ENABLED = 9;
    public static final int MSG_SET_SUBSCRIBED_CODEC_PARAMETER_KEYS = 22;
    public static final int MSG_SET_VIDEO_EFFECTS = 13;
    public static final int MSG_SET_VIDEO_FRAME_METADATA_LISTENER = 7;
    public static final int MSG_SET_VIDEO_OUTPUT = 1;
    public static final int MSG_SET_VIDEO_OUTPUT_RESOLUTION = 14;
    public static final int MSG_SET_VIRTUAL_DEVICE_ID = 19;
    public static final int MSG_SET_VOLUME = 2;
    public static final int MSG_SET_WAKEUP_LISTENER = 11;
    public static final int MSG_TRANSFER_RESOURCES = 17;
    public static final int STATE_DISABLED = 0;
    public static final int STATE_ENABLED = 1;
    public static final int STATE_STARTED = 2;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MessageType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    public interface WakeupListener {
        void onSleep();

        void onWakeup();
    }

    void disable();

    void enable(androidx.media3.exoplayer.RendererConfiguration rendererConfiguration, androidx.media3.common.Format[] formatArr, androidx.media3.exoplayer.source.SampleStream sampleStream, long j, boolean z6, boolean z9, long j9, long j10, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId);

    default void enableMayRenderStartOfStream() {
    }

    androidx.media3.exoplayer.RendererCapabilities getCapabilities();

    default long getDurationToProgressUs(long j, long j9) {
        if (getState() != 1) {
            return DEFAULT_DURATION_TO_PROGRESS_US;
        }
        if (isReady() || isEnded()) {
            return 1000000L;
        }
        return DEFAULT_DURATION_TO_PROGRESS_US;
    }

    androidx.media3.exoplayer.MediaClock getMediaClock();

    java.lang.String getName();

    long getReadingPositionUs();

    int getState();

    androidx.media3.exoplayer.source.SampleStream getStream();

    int getTrackType();

    boolean hasReadStreamToEnd();

    void init(int i3, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.util.Clock clock);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError();

    default void release() {
    }

    void render(long j, long j9);

    void replaceStream(androidx.media3.common.Format[] formatArr, androidx.media3.exoplayer.source.SampleStream sampleStream, long j, long j9, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId);

    void reset();

    void resetPosition(long j, boolean z6);

    void setCurrentStreamFinal();

    default void setPlaybackSpeed(float f9, float f10) {
    }

    void setTimeline(androidx.media3.common.Timeline timeline);

    void start();

    void stop();

    default boolean supportsResetPositionWithoutKeyFrameReset(long j) {
        return false;
    }
}
