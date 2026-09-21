package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface VideoGraph {

    public interface Factory {
        androidx.media3.common.VideoGraph create(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, long j, boolean z6);

        boolean supportsMultipleInputs();
    }

    public interface Listener {
        default void onEnded(long j) {
        }

        default void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onOutputFrameAvailableForRendering(long j, boolean z6) {
        }

        default void onOutputFrameRateChanged(float f9) {
        }

        default void onOutputSizeChanged(int i3, int i9) {
        }
    }

    void flush();

    android.view.Surface getInputSurface(int i3);

    int getPendingInputFrameCount(int i3);

    boolean hasProducedFrameWithTimestampZero();

    void initialize();

    boolean queueInputBitmap(int i3, android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator);

    boolean queueInputTexture(int i3, int i9, long j);

    void redraw();

    void registerInput(int i3);

    boolean registerInputFrame(int i3);

    void registerInputStream(int i3, int i9, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Effect> list, long j);

    void release();

    void renderOutputFrame(long j);

    void setCompositionEffects(java.util.List<androidx.media3.common.Effect> list);

    void setCompositorSettings(androidx.media3.common.VideoCompositorSettings videoCompositorSettings);

    void setOnInputFrameProcessedListener(int i3, androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener);

    void setOnInputSurfaceReadyListener(int i3, java.lang.Runnable runnable);

    void setOutputSurfaceInfo(androidx.media3.common.SurfaceInfo surfaceInfo);

    void signalEndOfInput(int i3);
}
