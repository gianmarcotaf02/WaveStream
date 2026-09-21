package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public interface VideoSink {
    public static final int INPUT_TYPE_BITMAP = 2;
    public static final int INPUT_TYPE_SURFACE = 1;
    public static final int RELEASE_FIRST_FRAME_IMMEDIATELY = 0;
    public static final int RELEASE_FIRST_FRAME_WHEN_PREVIOUS_STREAM_PROCESSED = 2;
    public static final int RELEASE_FIRST_FRAME_WHEN_STARTED = 1;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FirstFrameReleaseInstruction {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    public interface Listener {
        public static final androidx.media3.exoplayer.video.VideoSink.Listener NO_OP = new androidx.media3.exoplayer.video.VideoSink.Listener() { // from class: androidx.media3.exoplayer.video.VideoSink.Listener.1
        };

        default void onError(androidx.media3.exoplayer.video.VideoSink.VideoSinkException videoSinkException) {
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

    public interface VideoFrameHandler {
        void render(long j);

        void skip();
    }

    public static final class VideoSinkException extends java.lang.Exception {
        public final androidx.media3.common.Format format;

        public VideoSinkException(java.lang.Throwable th, androidx.media3.common.Format format) {
            super(th);
            this.format = format;
        }
    }

    void allowReleaseFirstFrameBeforeStarted();

    void clearOutputSurfaceInfo();

    void flush(boolean z6);

    android.view.Surface getInputSurface();

    boolean handleInputBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator);

    boolean handleInputFrame(long j, androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler videoFrameHandler);

    boolean initialize(androidx.media3.common.Format format);

    boolean isEnded();

    boolean isInitialized();

    boolean isReady(boolean z6);

    void join(boolean z6);

    void onInputStreamChanged(int i3, androidx.media3.common.Format format, long j, int i9, java.util.List<androidx.media3.common.Effect> list);

    void redraw();

    void release();

    void render(long j, long j9);

    void setBufferTimestampAdjustmentUs(long j);

    void setChangeFrameRateStrategy(int i3);

    void setListener(androidx.media3.exoplayer.video.VideoSink.Listener listener, java.util.concurrent.Executor executor);

    void setOutputSurfaceInfo(android.view.Surface surface, androidx.media3.common.util.Size size);

    void setPlaybackSpeed(float f9);

    void setVideoEffects(java.util.List<androidx.media3.common.Effect> list);

    void setVideoFrameMetadataListener(androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener);

    void signalEndOfCurrentInputStream();

    void signalEndOfInput();

    void startRendering();

    void stopRendering();
}
