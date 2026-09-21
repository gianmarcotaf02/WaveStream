package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface VideoFrameProcessor {
    public static final long DROP_OUTPUT_FRAME = -2;
    public static final int INPUT_TYPE_BITMAP = 2;
    public static final int INPUT_TYPE_SURFACE = 1;
    public static final int INPUT_TYPE_SURFACE_AUTOMATIC_FRAME_REGISTRATION = 4;
    public static final int INPUT_TYPE_TEXTURE_ID = 3;
    public static final p076i4.AbstractC2186b0 REDRAW = p076i4.AbstractC2186b0.y(new androidx.media3.common.Effect() { // from class: androidx.media3.common.VideoFrameProcessor.1
    });

    @java.lang.Deprecated
    public static final long RENDER_OUTPUT_FRAME_IMMEDIATELY = -1;
    public static final long RENDER_OUTPUT_FRAME_WITH_PRESENTATION_TIME = -3;

    public interface Factory {
        androidx.media3.common.VideoFrameProcessor create(android.content.Context context, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.ColorInfo colorInfo, boolean z6, java.util.concurrent.Executor executor, androidx.media3.common.VideoFrameProcessor.Listener listener);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    public interface Listener {
        default void onEnded() {
        }

        default void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onInputStreamRegistered(int i3, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Effect> list) {
        }

        default void onOutputFrameAvailableForRendering(long j, boolean z6) {
        }

        default void onOutputFrameRateChanged(float f9) {
        }

        default void onOutputSizeChanged(int i3, int i9) {
        }
    }

    void flush();

    android.view.Surface getInputSurface();

    int getPendingInputFrameCount();

    boolean queueInputBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator);

    boolean queueInputTexture(int i3, long j);

    void redraw();

    boolean registerInputFrame();

    void registerInputStream(int i3, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Effect> list, long j);

    void release();

    void renderOutputFrame(long j);

    void setOnInputFrameProcessedListener(androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener);

    void setOnInputSurfaceReadyListener(java.lang.Runnable runnable);

    void setOutputSurfaceInfo(androidx.media3.common.SurfaceInfo surfaceInfo);

    void signalEndOfInput();
}
