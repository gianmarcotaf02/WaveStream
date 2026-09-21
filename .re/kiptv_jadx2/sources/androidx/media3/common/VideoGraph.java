package androidx.media3.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.util.TimestampIterator;
import java.util.List;
import java.util.concurrent.Executor;

public interface VideoGraph {

    public interface Factory {
        VideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, Listener listener, Executor executor, long j, boolean z6);

        boolean supportsMultipleInputs();
    }

    public interface Listener {
        default void onEnded(long j) {
        }

        default void onError(VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onOutputFrameAvailableForRendering(long j, boolean z6) {
        }

        default void onOutputFrameRateChanged(float f9) {
        }

        default void onOutputSizeChanged(int i3, int i9) {
        }
    }

    void flush();

    Surface getInputSurface(int i3);

    int getPendingInputFrameCount(int i3);

    boolean hasProducedFrameWithTimestampZero();

    void initialize();

    boolean queueInputBitmap(int i3, Bitmap bitmap, TimestampIterator timestampIterator);

    boolean queueInputTexture(int i3, int i9, long j);

    void redraw();

    void registerInput(int i3);

    boolean registerInputFrame(int i3);

    void registerInputStream(int i3, int i9, Format format, List<Effect> list, long j);

    void release();

    void renderOutputFrame(long j);

    void setCompositionEffects(List<Effect> list);

    void setCompositorSettings(VideoCompositorSettings videoCompositorSettings);

    void setOnInputFrameProcessedListener(int i3, OnInputFrameProcessedListener onInputFrameProcessedListener);

    void setOnInputSurfaceReadyListener(int i3, Runnable runnable);

    void setOutputSurfaceInfo(SurfaceInfo surfaceInfo);

    void signalEndOfInput(int i3);
}
