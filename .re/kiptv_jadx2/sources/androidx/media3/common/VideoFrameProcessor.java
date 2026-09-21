package androidx.media3.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.media3.common.util.TimestampIterator;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;
import p076i4.AbstractC2186b0;

public interface VideoFrameProcessor {
    public static final long DROP_OUTPUT_FRAME = -2;
    public static final int INPUT_TYPE_BITMAP = 2;
    public static final int INPUT_TYPE_SURFACE = 1;
    public static final int INPUT_TYPE_SURFACE_AUTOMATIC_FRAME_REGISTRATION = 4;
    public static final int INPUT_TYPE_TEXTURE_ID = 3;
    public static final AbstractC2186b0 REDRAW = AbstractC2186b0.y(new Effect() {
    });

    @Deprecated
    public static final long RENDER_OUTPUT_FRAME_IMMEDIATELY = -1;
    public static final long RENDER_OUTPUT_FRAME_WITH_PRESENTATION_TIME = -3;

    public interface Factory {
        VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z6, Executor executor, Listener listener);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    public interface Listener {
        default void onEnded() {
        }

        default void onError(VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onInputStreamRegistered(int i3, Format format, List<Effect> list) {
        }

        default void onOutputFrameAvailableForRendering(long j, boolean z6) {
        }

        default void onOutputFrameRateChanged(float f9) {
        }

        default void onOutputSizeChanged(int i3, int i9) {
        }
    }

    void flush();

    Surface getInputSurface();

    int getPendingInputFrameCount();

    boolean queueInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator);

    boolean queueInputTexture(int i3, long j);

    void redraw();

    boolean registerInputFrame();

    void registerInputStream(int i3, Format format, List<Effect> list, long j);

    void release();

    void renderOutputFrame(long j);

    void setOnInputFrameProcessedListener(OnInputFrameProcessedListener onInputFrameProcessedListener);

    void setOnInputSurfaceReadyListener(Runnable runnable);

    void setOutputSurfaceInfo(SurfaceInfo surfaceInfo);

    void signalEndOfInput();
}
