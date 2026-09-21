package androidx.media3.exoplayer.video;

import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

final class DefaultVideoSink implements VideoSink {
    private Format inputFormat;
    private VideoSink.Listener listener;
    private Executor listenerExecutor;
    private Surface outputSurface;
    private long streamStartPositionUs;
    private final Queue<VideoSink.VideoFrameHandler> videoFrameHandlers;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final VideoFrameReleaseControl videoFrameReleaseControl;
    private final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    private final VideoFrameRenderControl videoFrameRenderControl;

    public final class FrameRendererImpl implements VideoFrameRenderControl.FrameRenderer {
        private Format outputFormat;

        private FrameRendererImpl() {
        }

        public void lambda$dropFrame$2() {
            DefaultVideoSink.this.listener.onFrameDropped();
        }

        public void lambda$onVideoSizeChanged$0(VideoSize videoSize) {
            DefaultVideoSink.this.listener.onVideoSizeChanged(videoSize);
        }

        public void lambda$renderFrame$1() {
            DefaultVideoSink.this.listener.onFirstFrameRendered();
        }

        @Override
        public void dropFrame() {
            DefaultVideoSink.this.listenerExecutor.execute(new d(this, 1));
            ((VideoSink.VideoFrameHandler) DefaultVideoSink.this.videoFrameHandlers.remove()).skip();
        }

        @Override
        public void onVideoSizeChanged(VideoSize videoSize) {
            this.outputFormat = new Format.Builder().setWidth(videoSize.width).setHeight(videoSize.height).setSampleMimeType(MimeTypes.VIDEO_RAW).build();
            DefaultVideoSink.this.listenerExecutor.execute(new e(this, videoSize, 0));
        }

        @Override
        public void renderFrame(long j, long j9, boolean z6) {
            if (z6 && DefaultVideoSink.this.outputSurface != null) {
                DefaultVideoSink.this.listenerExecutor.execute(new d(this, 0));
            }
            Format formatBuild = this.outputFormat;
            if (formatBuild == null) {
                formatBuild = new Format.Builder().build();
            }
            DefaultVideoSink.this.videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j9, j, formatBuild, null);
            ((VideoSink.VideoFrameHandler) DefaultVideoSink.this.videoFrameHandlers.remove()).render(j);
        }
    }

    public DefaultVideoSink(VideoFrameReleaseControl videoFrameReleaseControl, VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster, Clock clock) {
        this.videoFrameReleaseControl = videoFrameReleaseControl;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        videoFrameReleaseControl.setClock(clock);
        this.videoFrameRenderControl = new VideoFrameRenderControl(new FrameRendererImpl(), videoFrameReleaseControl, videoFrameReleaseEarlyTimeForecaster);
        this.videoFrameHandlers = new ArrayDeque();
        this.inputFormat = new Format.Builder().build();
        this.streamStartPositionUs = C.TIME_UNSET;
        this.listener = VideoSink.Listener.NO_OP;
        this.listenerExecutor = new a(0);
        this.videoFrameMetadataListener = new b();
    }

    public void lambda$handleInputFrame$2() {
        this.listener.onFrameAvailableForRendering();
    }

    public static void lambda$new$0(Runnable runnable) {
    }

    public static void lambda$new$1(long j, long j9, Format format, MediaFormat mediaFormat) {
    }

    @Override
    public void allowReleaseFirstFrameBeforeStarted() {
        this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
    }

    @Override
    public void clearOutputSurfaceInfo() {
        this.outputSurface = null;
        this.videoFrameReleaseControl.setOutputSurface(null);
    }

    @Override
    public void flush(boolean z6) {
        if (z6) {
            this.videoFrameReleaseControl.reset();
        }
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        this.videoFrameRenderControl.flush();
        this.videoFrameHandlers.clear();
    }

    @Override
    public Surface getInputSurface() {
        Surface surface = this.outputSurface;
        surface.getClass();
        return surface;
    }

    @Override
    public boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean handleInputFrame(long j, VideoSink.VideoFrameHandler videoFrameHandler) {
        this.videoFrameHandlers.add(videoFrameHandler);
        this.videoFrameRenderControl.onFrameAvailableForRendering(j);
        this.listenerExecutor.execute(new c(0, this));
        return true;
    }

    @Override
    public boolean initialize(Format format) {
        return true;
    }

    @Override
    public boolean isEnded() {
        return this.videoFrameRenderControl.isEnded();
    }

    @Override
    public boolean isInitialized() {
        return true;
    }

    @Override
    public boolean isReady(boolean z6) {
        return this.videoFrameReleaseControl.isReady(z6);
    }

    @Override
    public void join(boolean z6) {
        this.videoFrameReleaseControl.join(z6);
    }

    @Override
    public void onInputStreamChanged(int i3, Format format, long j, int i9, List<Effect> list) {
        AbstractC1864o0.Y(list.isEmpty());
        int i10 = format.width;
        Format format2 = this.inputFormat;
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

    @Override
    public void redraw() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void release() {
    }

    @Override
    public void render(long j, long j9) throws VideoSink.VideoSinkException {
        try {
            this.videoFrameRenderControl.render(j, j9);
        } catch (ExoPlaybackException e6) {
            throw new VideoSink.VideoSinkException(e6, this.inputFormat);
        }
    }

    @Override
    public void setBufferTimestampAdjustmentUs(long j) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setChangeFrameRateStrategy(int i3) {
        this.videoFrameReleaseControl.setChangeFrameRateStrategy(i3);
    }

    @Override
    public void setListener(VideoSink.Listener listener, Executor executor) {
        this.listener = listener;
        this.listenerExecutor = executor;
    }

    @Override
    public void setOutputSurfaceInfo(Surface surface, Size size) {
        this.outputSurface = surface;
        this.videoFrameReleaseControl.setOutputSurface(surface);
    }

    @Override
    public void setPlaybackSpeed(float f9) {
        this.videoFrameReleaseControl.setPlaybackSpeed(f9);
    }

    @Override
    public void setVideoEffects(List<Effect> list) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
    }

    @Override
    public void signalEndOfCurrentInputStream() {
        this.videoFrameRenderControl.signalEndOfInput();
    }

    @Override
    public void signalEndOfInput() {
    }

    @Override
    public void startRendering() {
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        this.videoFrameReleaseControl.onStarted();
    }

    @Override
    public void stopRendering() {
        this.videoFrameReleaseEarlyTimeForecaster.reset();
        this.videoFrameReleaseControl.onStopped();
    }
}
