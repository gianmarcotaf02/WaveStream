package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DebugViewProvider;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.SurfaceInfo;
import androidx.media3.common.VideoCompositorSettings;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExecutorC1550e;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.android.gms.internal.play_billing.V0;
import io.sentry.protocol.OperatingSystem;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import p068h4.v;
import p076i4.AbstractC2186b0;
import p076i4.S0;
import p076i4.Z;

public final class PlaybackVideoGraphWrapper implements VideoGraph.Listener {
    public static final long LATE_US_TO_DROP_INPUT_FRAME = 15000;
    private static final Executor NO_OP_EXECUTOR = new a(1);
    private static final int PRIMARY_SEQUENCE_INDEX = 0;
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_RELEASED = 2;
    private static final String TAG = "PlaybackVidGraphWrapper";
    private final Clock clock;
    private AbstractC2186b0 compositionEffects;
    private VideoCompositorSettings compositorSettings;
    private final Context context;
    private Pair<Surface, Size> currentSurfaceAndSize;
    private final VideoSink defaultVideoSink;
    private final long earlyThresholdToDropInputUs;
    private final boolean enablePlaylistMode;
    private long finalFramePresentationTimeUs;
    private HandlerWrapper handler;
    private boolean hasSignaledEndOfVideoGraphOutputStream;
    private final SparseArray<InputVideoSink> inputVideoSinks;
    private boolean isInputSdrToneMapped;
    private long lastOutputFramePresentationTimeUs;
    private final CopyOnWriteArraySet<Listener> listeners;
    private int outputStreamFirstFrameReleaseInstruction;
    private long outputStreamStartPositionUs;
    private int pendingFlushCount;
    private TimedValueQueue<StreamChangeInfo> pendingStreamChanges;
    private int registeredVideoInputCount;
    private boolean requestOpenGlToneMapping;
    private int state;
    private int totalVideoInputCount;
    private final VideoSink.VideoFrameHandler videoFrameHandler;
    private VideoFrameMetadataListener videoFrameMetadataListener;
    private final VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster;
    private VideoGraph videoGraph;
    private final VideoGraph.Factory videoGraphFactory;
    private Format videoGraphOutputFormat;

    public static final class Builder {
        private boolean built;
        private final Context context;
        private boolean enablePlaylistMode;
        private boolean enableReplayableCache;
        private final VideoFrameReleaseControl videoFrameReleaseControl;
        private VideoGraph.Factory videoGraphFactory;
        private long lateThresholdToDropInputUs = 15000;
        private VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = new VideoFrameReleaseEarlyTimeForecaster(1.0f);
        private Clock clock = Clock.DEFAULT;

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.context = context.getApplicationContext();
            this.videoFrameReleaseControl = videoFrameReleaseControl;
        }

        public PlaybackVideoGraphWrapper build() {
            AbstractC1864o0.Y(!this.built);
            if (this.videoGraphFactory == null) {
                this.videoGraphFactory = new ReflectiveSingleInputVideoGraphFactory(this.enableReplayableCache);
            }
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = new PlaybackVideoGraphWrapper(this);
            this.built = true;
            return playbackVideoGraphWrapper;
        }

        public Builder experimentalSetLateThresholdToDropInputUs(long j) {
            this.lateThresholdToDropInputUs = j;
            return this;
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }

        public Builder setEnablePlaylistMode(boolean z6) {
            this.enablePlaylistMode = z6;
            return this;
        }

        public Builder setEnableReplayableCache(boolean z6) {
            this.enableReplayableCache = z6;
            return this;
        }

        public Builder setVideoFrameReleaseEarlyTimeForecaster(VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster) {
            this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
            return this;
        }

        public Builder setVideoGraphFactory(VideoGraph.Factory factory) {
            this.videoGraphFactory = factory;
            return this;
        }
    }

    public final class DefaultVideoSinkListener implements VideoSink.Listener {
        private DefaultVideoSinkListener() {
        }

        @Override
        public void onError(VideoSink.VideoSinkException videoSinkException) {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onError(VideoFrameProcessingException.from(videoSinkException));
            }
        }

        @Override
        public void onFirstFrameRendered() {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFirstFrameRendered();
            }
        }

        @Override
        public void onFrameDropped() {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onFrameDropped();
            }
        }

        @Override
        public void onVideoSizeChanged(VideoSize videoSize) {
            Iterator it = PlaybackVideoGraphWrapper.this.listeners.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).onVideoSizeChanged(videoSize);
            }
        }
    }

    public final class InputVideoSink implements VideoSink, Listener {
        private static final int MAX_CONSECUTIVE_FRAMES_TO_DROP = 2;
        private int consecutiveDroppedFrames;
        private long inputBufferTimestampAdjustmentUs;
        private Format inputFormat;
        private final int inputIndex;
        private int inputType;
        private boolean isInitialized;
        private long lastFramePresentationTimeUs;
        private VideoSink.Listener listener;
        private Executor listenerExecutor;
        private boolean signaledEndOfStream;
        private AbstractC2186b0 videoEffects;
        private final int videoFrameProcessorMaxPendingFrameCount;

        public InputVideoSink(Context context, int i3) {
            this.inputIndex = i3;
            this.videoFrameProcessorMaxPendingFrameCount = Util.getMaxPendingFramesCountForMediaCodecDecoders(context);
            Z z6 = AbstractC2186b0.f22868i;
            this.videoEffects = S0.f22832l;
            this.lastFramePresentationTimeUs = C.TIME_UNSET;
            this.listener = VideoSink.Listener.NO_OP;
            this.listenerExecutor = PlaybackVideoGraphWrapper.NO_OP_EXECUTOR;
        }

        public void lambda$onError$1(VideoSink.Listener listener, VideoFrameProcessingException videoFrameProcessingException) {
            Format format = this.inputFormat;
            format.getClass();
            listener.onError(new VideoSink.VideoSinkException(videoFrameProcessingException, format));
        }

        private void registerInputStream(Format format) {
            Format formatBuild = format.buildUpon().setColorInfo(PlaybackVideoGraphWrapper.this.getAdjustedInputColorInfo(format.colorInfo)).build();
            int i3 = this.inputType != 1 ? 2 : 1;
            VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            videoGraph.registerInputStream(this.inputIndex, i3, formatBuild, this.videoEffects, 0L);
        }

        @Override
        public void allowReleaseFirstFrameBeforeStarted() {
            if (PlaybackVideoGraphWrapper.this.pendingStreamChanges.size() == 0) {
                PlaybackVideoGraphWrapper.this.allowReleaseFirstFrameBeforeStarted();
                return;
            }
            TimedValueQueue timedValueQueue = new TimedValueQueue();
            boolean z6 = true;
            while (PlaybackVideoGraphWrapper.this.pendingStreamChanges.size() > 0) {
                StreamChangeInfo streamChangeInfo = (StreamChangeInfo) PlaybackVideoGraphWrapper.this.pendingStreamChanges.pollFirst();
                streamChangeInfo.getClass();
                if (z6) {
                    int i3 = streamChangeInfo.firstFrameReleaseInstruction;
                    if (i3 == 0 || i3 == 1) {
                        streamChangeInfo = new StreamChangeInfo(streamChangeInfo.startPositionUs, 0, streamChangeInfo.fromTimestampUs);
                    } else {
                        PlaybackVideoGraphWrapper.this.allowReleaseFirstFrameBeforeStarted();
                    }
                    z6 = false;
                }
                timedValueQueue.add(streamChangeInfo.fromTimestampUs, streamChangeInfo);
            }
            PlaybackVideoGraphWrapper.this.pendingStreamChanges = timedValueQueue;
        }

        @Override
        public void clearOutputSurfaceInfo() {
            PlaybackVideoGraphWrapper.this.clearOutputSurfaceInfo();
        }

        @Override
        public void flush(boolean z6) {
            if (isInitialized()) {
                VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.flush();
            }
            this.lastFramePresentationTimeUs = C.TIME_UNSET;
            PlaybackVideoGraphWrapper.this.flush(z6);
            this.signaledEndOfStream = false;
        }

        @Override
        public Surface getInputSurface() {
            AbstractC1864o0.Y(isInitialized());
            VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            return videoGraph.getInputSurface(this.inputIndex);
        }

        @Override
        public boolean handleInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator) {
            AbstractC1864o0.Y(isInitialized());
            if (!PlaybackVideoGraphWrapper.this.shouldRenderToInputVideoSink()) {
                return false;
            }
            ShiftingTimestampIterator shiftingTimestampIterator = new ShiftingTimestampIterator(timestampIterator, this.inputBufferTimestampAdjustmentUs);
            VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            if (!videoGraph.queueInputBitmap(this.inputIndex, bitmap, shiftingTimestampIterator)) {
                return false;
            }
            long lastTimestampUs = shiftingTimestampIterator.getLastTimestampUs();
            AbstractC1864o0.Y(lastTimestampUs != C.TIME_UNSET);
            this.lastFramePresentationTimeUs = lastTimestampUs;
            return true;
        }

        @Override
        public boolean handleInputFrame(long j, VideoSink.VideoFrameHandler videoFrameHandler) {
            int i3;
            AbstractC1864o0.Y(isInitialized());
            long j9 = j + this.inputBufferTimestampAdjustmentUs;
            long jPredictEarlyUs = PlaybackVideoGraphWrapper.this.videoFrameReleaseEarlyTimeForecaster.predictEarlyUs(j9);
            if (jPredictEarlyUs != C.TIME_UNSET && PlaybackVideoGraphWrapper.this.earlyThresholdToDropInputUs != C.TIME_UNSET && jPredictEarlyUs < PlaybackVideoGraphWrapper.this.earlyThresholdToDropInputUs && (i3 = this.consecutiveDroppedFrames) < 2) {
                this.consecutiveDroppedFrames = i3 + 1;
                videoFrameHandler.skip();
                return true;
            }
            if (!PlaybackVideoGraphWrapper.this.shouldRenderToInputVideoSink()) {
                return false;
            }
            VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph.getClass();
            if (videoGraph.getPendingInputFrameCount(this.inputIndex) >= this.videoFrameProcessorMaxPendingFrameCount) {
                return false;
            }
            VideoGraph videoGraph2 = PlaybackVideoGraphWrapper.this.videoGraph;
            videoGraph2.getClass();
            if (!videoGraph2.registerInputFrame(this.inputIndex)) {
                return false;
            }
            this.lastFramePresentationTimeUs = j9;
            videoFrameHandler.render(j9 * 1000);
            this.consecutiveDroppedFrames = 0;
            return true;
        }

        @Override
        public boolean initialize(Format format) throws VideoSink.VideoSinkException {
            AbstractC1864o0.Y(!isInitialized());
            boolean zRegisterInput = PlaybackVideoGraphWrapper.this.registerInput(format, this.inputIndex);
            this.isInitialized = zRegisterInput;
            return zRegisterInput;
        }

        @Override
        public boolean isEnded() {
            return isInitialized() && PlaybackVideoGraphWrapper.this.isEnded();
        }

        @Override
        public boolean isInitialized() {
            return this.isInitialized;
        }

        @Override
        public boolean isReady(boolean z6) {
            return PlaybackVideoGraphWrapper.this.isReady(z6 && isInitialized());
        }

        @Override
        public void join(boolean z6) {
            if (PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                PlaybackVideoGraphWrapper.this.joinPlayback(z6);
            }
        }

        @Override
        public void onError(VideoFrameProcessingException videoFrameProcessingException) {
            this.listenerExecutor.execute(new f(this, this.listener, videoFrameProcessingException, 0));
        }

        @Override
        public void onFirstFrameRendered() {
            VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new g(listener, 1));
        }

        @Override
        public void onFrameAvailableForRendering() {
            VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new g(listener, 2));
        }

        @Override
        public void onFrameDropped() {
            VideoSink.Listener listener = this.listener;
            Executor executor = this.listenerExecutor;
            Objects.requireNonNull(listener);
            executor.execute(new g(listener, 0));
        }

        @Override
        public void onInputStreamChanged(int i3, Format format, long j, int i9, List<Effect> list) {
            AbstractC1864o0.Y(isInitialized());
            this.videoEffects = AbstractC2186b0.u(list);
            this.inputType = i3;
            this.inputFormat = format;
            PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs = C.TIME_UNSET;
            PlaybackVideoGraphWrapper.this.hasSignaledEndOfVideoGraphOutputStream = false;
            registerInputStream(format);
            boolean z6 = this.lastFramePresentationTimeUs == C.TIME_UNSET;
            if (PlaybackVideoGraphWrapper.this.enablePlaylistMode || (this.inputIndex == 0 && z6)) {
                long j9 = z6 ? -4611686018427387904L : this.lastFramePresentationTimeUs + 1;
                PlaybackVideoGraphWrapper.this.pendingStreamChanges.add(j9, new StreamChangeInfo(this.inputBufferTimestampAdjustmentUs + j, i9, j9));
            }
        }

        @Override
        public void onVideoSizeChanged(VideoSize videoSize) {
            this.listenerExecutor.execute(new e(this.listener, videoSize, 1));
        }

        @Override
        public void redraw() {
            if (isInitialized()) {
                boolean z6 = this.signaledEndOfStream;
                long j = PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs;
                PlaybackVideoGraphWrapper.this.flush(false);
                VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.redraw();
                PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs = j;
                if (z6) {
                    signalEndOfCurrentInputStream();
                }
            }
        }

        @Override
        public void release() {
            PlaybackVideoGraphWrapper.this.release();
        }

        @Override
        public void render(long j, long j9) {
            PlaybackVideoGraphWrapper.this.render(j + this.inputBufferTimestampAdjustmentUs, j9);
        }

        @Override
        public void setBufferTimestampAdjustmentUs(long j) {
            this.inputBufferTimestampAdjustmentUs = j;
        }

        @Override
        public void setChangeFrameRateStrategy(int i3) {
            if (this.inputIndex == 0) {
                PlaybackVideoGraphWrapper.this.setChangeFrameRateStrategy(i3);
            }
        }

        @Override
        public void setListener(VideoSink.Listener listener, Executor executor) {
            this.listener = listener;
            this.listenerExecutor = executor;
        }

        @Override
        public void setOutputSurfaceInfo(Surface surface, Size size) {
            PlaybackVideoGraphWrapper.this.setOutputSurfaceInfo(surface, size);
        }

        @Override
        public void setPlaybackSpeed(float f9) {
            if (this.inputIndex == 0) {
                PlaybackVideoGraphWrapper.this.setPlaybackSpeed(f9);
            }
        }

        @Override
        public void setVideoEffects(List<Effect> list) {
            if (this.videoEffects.equals(list)) {
                return;
            }
            this.videoEffects = AbstractC2186b0.u(list);
            Format format = this.inputFormat;
            if (format != null) {
                registerInputStream(format);
            }
        }

        @Override
        public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
            if (this.inputIndex == 0) {
                PlaybackVideoGraphWrapper.this.setVideoFrameMetadataListener(videoFrameMetadataListener);
            }
        }

        @Override
        public void signalEndOfCurrentInputStream() {
            PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs = this.lastFramePresentationTimeUs;
            if (PlaybackVideoGraphWrapper.this.lastOutputFramePresentationTimeUs >= PlaybackVideoGraphWrapper.this.finalFramePresentationTimeUs) {
                PlaybackVideoGraphWrapper.this.signalEndOfVideoGraphOutputStream();
            }
        }

        @Override
        public void signalEndOfInput() {
            if (!this.signaledEndOfStream && isInitialized()) {
                VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.signalEndOfInput(this.inputIndex);
                this.signaledEndOfStream = true;
            }
        }

        @Override
        public void startRendering() {
            if (PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                PlaybackVideoGraphWrapper.this.startRendering();
            }
        }

        @Override
        public void stopRendering() {
            if (PlaybackVideoGraphWrapper.this.enablePlaylistMode) {
                PlaybackVideoGraphWrapper.this.stopRendering();
            }
        }
    }

    public interface Listener {
        default void onEnded(long j) {
        }

        default void onError(VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onFirstFrameRendered() {
        }

        default void onFrameAvailableForRendering() {
        }

        default void onFrameDropped() {
        }

        default void onVideoSizeChanged(VideoSize videoSize) {
        }
    }

    public static final class ReflectiveDefaultVideoFrameProcessorFactory implements VideoFrameProcessor.Factory {
        private static final v DEFAULT_VIDEO_FRAME_PROCESSOR_FACTORY_BUILDER_CLASS = V0.x(new h());
        private final boolean enableReplayableCache;

        public ReflectiveDefaultVideoFrameProcessorFactory(boolean z6) {
            this.enableReplayableCache = z6;
        }

        public static Class lambda$static$0() {
            try {
                return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            } catch (Exception e6) {
                throw new IllegalStateException(e6);
            }
        }

        @Override
        public VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z6, Executor executor, VideoFrameProcessor.Listener listener) throws VideoFrameProcessingException {
            try {
                Class cls = (Class) DEFAULT_VIDEO_FRAME_PROCESSOR_FACTORY_BUILDER_CLASS.get();
                Object objNewInstance = cls.getConstructor(null).newInstance(null);
                cls.getMethod("setEnableReplayableCache", Boolean.TYPE).invoke(objNewInstance, Boolean.valueOf(this.enableReplayableCache));
                Object objInvoke = cls.getMethod(OperatingSystem.JsonKeys.BUILD, null).invoke(objNewInstance, null);
                objInvoke.getClass();
                return ((VideoFrameProcessor.Factory) objInvoke).create(context, debugViewProvider, colorInfo, z6, executor, listener);
            } catch (Exception e6) {
                throw new VideoFrameProcessingException(e6);
            }
        }
    }

    public static final class ReflectiveSingleInputVideoGraphFactory implements VideoGraph.Factory {
        private final VideoFrameProcessor.Factory videoFrameProcessorFactory;

        public ReflectiveSingleInputVideoGraphFactory(boolean z6) {
            this.videoFrameProcessorFactory = new ReflectiveDefaultVideoFrameProcessorFactory(z6);
        }

        @Override
        public VideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, long j, boolean z6) {
            try {
                return ((VideoGraph.Factory) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class).newInstance(this.videoFrameProcessorFactory)).create(context, colorInfo, debugViewProvider, listener, executor, j, z6);
            } catch (Exception e6) {
                throw new IllegalStateException(e6);
            }
        }

        @Override
        public boolean supportsMultipleInputs() {
            return false;
        }
    }

    public static final class ShiftingTimestampIterator implements TimestampIterator {
        private final long shift;
        private final TimestampIterator timestampIterator;

        public ShiftingTimestampIterator(TimestampIterator timestampIterator, long j) {
            this.timestampIterator = timestampIterator;
            this.shift = j;
        }

        @Override
        public TimestampIterator copyOf() {
            return new ShiftingTimestampIterator(this.timestampIterator.copyOf(), this.shift);
        }

        @Override
        public long getLastTimestampUs() {
            long lastTimestampUs = this.timestampIterator.getLastTimestampUs();
            return lastTimestampUs == C.TIME_UNSET ? C.TIME_UNSET : lastTimestampUs + this.shift;
        }

        @Override
        public boolean hasNext() {
            return this.timestampIterator.hasNext();
        }

        @Override
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

    public void allowReleaseFirstFrameBeforeStarted() {
        this.defaultVideoSink.allowReleaseFirstFrameBeforeStarted();
    }

    public void flush(boolean z6) {
        if (isInitialized()) {
            this.pendingFlushCount++;
            this.defaultVideoSink.flush(z6);
            while (this.pendingStreamChanges.size() > 1) {
                this.pendingStreamChanges.pollFirst();
            }
            if (this.pendingStreamChanges.size() == 1) {
                StreamChangeInfo streamChangeInfoPollFirst = this.pendingStreamChanges.pollFirst();
                streamChangeInfoPollFirst.getClass();
                this.outputStreamStartPositionUs = streamChangeInfoPollFirst.startPositionUs;
                this.outputStreamFirstFrameReleaseInstruction = streamChangeInfoPollFirst.firstFrameReleaseInstruction;
                onOutputStreamChanged();
            }
            this.lastOutputFramePresentationTimeUs = C.TIME_UNSET;
            if (z6) {
                this.finalFramePresentationTimeUs = C.TIME_UNSET;
                this.hasSignaledEndOfVideoGraphOutputStream = false;
            }
            HandlerWrapper handlerWrapper = this.handler;
            handlerWrapper.getClass();
            handlerWrapper.post(new c(2, this));
        }
    }

    public ColorInfo getAdjustedInputColorInfo(ColorInfo colorInfo) {
        return (colorInfo == null || !colorInfo.isDataSpaceValid() || this.isInputSdrToneMapped) ? ColorInfo.SDR_BT709_LIMITED : colorInfo;
    }

    public boolean isEnded() {
        return this.pendingFlushCount == 0 && this.hasSignaledEndOfVideoGraphOutputStream && this.defaultVideoSink.isEnded();
    }

    private boolean isInitialized() {
        return this.state == 1;
    }

    public boolean isReady(boolean z6) {
        return this.defaultVideoSink.isReady(z6 && this.pendingFlushCount == 0);
    }

    public void joinPlayback(boolean z6) {
        this.defaultVideoSink.join(z6);
    }

    public void lambda$flush$1() {
        this.pendingFlushCount--;
    }

    public static void lambda$static$0(Runnable runnable) {
    }

    private void maybeSetOutputSurfaceInfo(Surface surface, int i3, int i9) {
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph == null) {
            return;
        }
        if (surface != null) {
            videoGraph.setOutputSurfaceInfo(new SurfaceInfo(surface, i3, i9));
            this.defaultVideoSink.setOutputSurfaceInfo(surface, new Size(i3, i9));
        } else {
            videoGraph.setOutputSurfaceInfo(null);
            this.defaultVideoSink.clearOutputSurfaceInfo();
        }
    }

    private void onOutputStreamChanged() {
        VideoSink videoSink = this.defaultVideoSink;
        Format format = this.videoGraphOutputFormat;
        long j = this.outputStreamStartPositionUs;
        int i3 = this.outputStreamFirstFrameReleaseInstruction;
        Z z6 = AbstractC2186b0.f22868i;
        videoSink.onInputStreamChanged(1, format, j, i3, S0.f22832l);
    }

    public boolean registerInput(Format format, int i3) throws VideoSink.VideoSinkException {
        PlaybackVideoGraphWrapper playbackVideoGraphWrapper;
        GlUtil.GlException glException;
        if (i3 == 0) {
            AbstractC1864o0.Y(this.state == 0);
            ColorInfo adjustedInputColorInfo = getAdjustedInputColorInfo(format.colorInfo);
            try {
                try {
                    if (this.requestOpenGlToneMapping) {
                        adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
                    } else if (adjustedInputColorInfo.colorTransfer == 7 && Build.VERSION.SDK_INT < 34 && GlUtil.isBt2020PqExtensionSupported()) {
                        adjustedInputColorInfo = adjustedInputColorInfo.buildUpon().setColorTransfer(6).build();
                    } else if (GlUtil.isColorTransferSupported(adjustedInputColorInfo.colorTransfer) || Build.VERSION.SDK_INT < 29) {
                        int i9 = adjustedInputColorInfo.colorTransfer;
                        if (i9 == 2 || i9 == 10) {
                            adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
                        }
                    } else {
                        Log.w(TAG, Util.formatInvariant("Color transfer %d is not supported. Falling back to OpenGl tone mapping.", Integer.valueOf(adjustedInputColorInfo.colorTransfer)));
                        adjustedInputColorInfo = ColorInfo.SDR_BT709_LIMITED;
                    }
                    ColorInfo colorInfo = adjustedInputColorInfo;
                    Clock clock = this.clock;
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    HandlerWrapper handlerWrapperCreateHandler = clock.createHandler(looperMyLooper, null);
                    this.handler = handlerWrapperCreateHandler;
                    try {
                        VideoGraph.Factory factory = this.videoGraphFactory;
                        Context context = this.context;
                        DebugViewProvider debugViewProvider = DebugViewProvider.NONE;
                        Objects.requireNonNull(handlerWrapperCreateHandler);
                        playbackVideoGraphWrapper = this;
                        try {
                            VideoGraph videoGraphCreate = factory.create(context, colorInfo, debugViewProvider, playbackVideoGraphWrapper, new ExecutorC1550e(1, handlerWrapperCreateHandler), 0L, false);
                            playbackVideoGraphWrapper.videoGraph = videoGraphCreate;
                            videoGraphCreate.setCompositionEffects(playbackVideoGraphWrapper.compositionEffects);
                            playbackVideoGraphWrapper.videoGraph.setCompositorSettings(playbackVideoGraphWrapper.compositorSettings);
                            playbackVideoGraphWrapper.videoGraph.initialize();
                            Pair<Surface, Size> pair = playbackVideoGraphWrapper.currentSurfaceAndSize;
                            if (pair != null) {
                                Surface surface = (Surface) pair.first;
                                Size size = (Size) pair.second;
                                maybeSetOutputSurfaceInfo(surface, size.getWidth(), size.getHeight());
                            }
                            playbackVideoGraphWrapper.defaultVideoSink.initialize(format);
                            VideoSink videoSink = playbackVideoGraphWrapper.defaultVideoSink;
                            DefaultVideoSinkListener defaultVideoSinkListener = new DefaultVideoSinkListener();
                            HandlerWrapper handlerWrapper = playbackVideoGraphWrapper.handler;
                            Objects.requireNonNull(handlerWrapper);
                            videoSink.setListener(defaultVideoSinkListener, new ExecutorC1550e(1, handlerWrapper));
                            playbackVideoGraphWrapper.state = 1;
                        } catch (VideoFrameProcessingException e6) {
                            e = e6;
                            throw new VideoSink.VideoSinkException(e, format);
                        }
                    } catch (VideoFrameProcessingException e9) {
                        e = e9;
                    }
                } catch (GlUtil.GlException e10) {
                    glException = e10;
                    throw new VideoSink.VideoSinkException(glException, format);
                }
            } catch (GlUtil.GlException e11) {
                glException = e11;
            }
        } else {
            playbackVideoGraphWrapper = this;
            if (!isInitialized()) {
                return false;
            }
        }
        try {
            VideoGraph videoGraph = playbackVideoGraphWrapper.videoGraph;
            videoGraph.getClass();
            videoGraph.registerInput(i3);
            playbackVideoGraphWrapper.registeredVideoInputCount++;
            return true;
        } catch (VideoFrameProcessingException e12) {
            throw new VideoSink.VideoSinkException(e12, format);
        }
    }

    public void render(long j, long j9) {
        this.defaultVideoSink.render(j, j9);
    }

    public void setChangeFrameRateStrategy(int i3) {
        this.defaultVideoSink.setChangeFrameRateStrategy(i3);
    }

    public void setPlaybackSpeed(float f9) {
        this.videoFrameReleaseEarlyTimeForecaster.setPlaybackSpeed(f9);
        this.defaultVideoSink.setPlaybackSpeed(f9);
    }

    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        this.videoFrameMetadataListener = videoFrameMetadataListener;
        this.defaultVideoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
    }

    public boolean shouldRenderToInputVideoSink() {
        int i3 = this.totalVideoInputCount;
        return i3 != -1 && i3 == this.registeredVideoInputCount;
    }

    public void signalEndOfVideoGraphOutputStream() {
        this.defaultVideoSink.signalEndOfCurrentInputStream();
        this.hasSignaledEndOfVideoGraphOutputStream = true;
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    public void clearOutputSurfaceInfo() {
        Size size = Size.UNKNOWN;
        maybeSetOutputSurfaceInfo(null, size.getWidth(), size.getHeight());
        this.currentSurfaceAndSize = null;
    }

    public VideoSink getSink(int i3) {
        if (Util.contains(this.inputVideoSinks, i3)) {
            return this.inputVideoSinks.get(i3);
        }
        InputVideoSink inputVideoSink = new InputVideoSink(this.context, i3);
        if (i3 == 0) {
            addListener(inputVideoSink);
        }
        this.inputVideoSinks.put(i3, inputVideoSink);
        return inputVideoSink;
    }

    @Override
    public void onEnded(long j) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onEnded(j);
        }
    }

    @Override
    public void onError(VideoFrameProcessingException videoFrameProcessingException) {
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(videoFrameProcessingException);
        }
    }

    @Override
    public void onOutputFrameAvailableForRendering(long j, boolean z6) {
        if (this.pendingFlushCount > 0) {
            return;
        }
        Iterator<Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onFrameAvailableForRendering();
        }
        if (z6) {
            VideoFrameMetadataListener videoFrameMetadataListener = this.videoFrameMetadataListener;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, C.TIME_UNSET, this.videoGraphOutputFormat, null);
                return;
            }
            return;
        }
        this.lastOutputFramePresentationTimeUs = j;
        StreamChangeInfo streamChangeInfoPollFloor = this.pendingStreamChanges.pollFloor(j);
        if (streamChangeInfoPollFloor != null) {
            this.outputStreamStartPositionUs = streamChangeInfoPollFloor.startPositionUs;
            this.outputStreamFirstFrameReleaseInstruction = streamChangeInfoPollFloor.firstFrameReleaseInstruction;
            onOutputStreamChanged();
        }
        this.defaultVideoSink.handleInputFrame(j, this.videoFrameHandler);
        long j9 = this.finalFramePresentationTimeUs;
        if (j9 == C.TIME_UNSET || j < j9) {
            return;
        }
        signalEndOfVideoGraphOutputStream();
    }

    @Override
    public void onOutputFrameRateChanged(float f9) {
        this.videoGraphOutputFormat = this.videoGraphOutputFormat.buildUpon().setFrameRate(f9).build();
        onOutputStreamChanged();
    }

    @Override
    public void onOutputSizeChanged(int i3, int i9) {
        this.videoGraphOutputFormat = this.videoGraphOutputFormat.buildUpon().setWidth(i3).setHeight(i9).build();
        onOutputStreamChanged();
    }

    public void release() {
        if (this.state == 2) {
            return;
        }
        HandlerWrapper handlerWrapper = this.handler;
        if (handlerWrapper != null) {
            handlerWrapper.removeCallbacksAndMessages(null);
        }
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.release();
        }
        this.currentSurfaceAndSize = null;
        this.state = 2;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public void setCompositionEffects(List<Effect> list) {
        this.compositionEffects = AbstractC2186b0.u(list);
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.setCompositionEffects(list);
        }
    }

    public void setCompositorSettings(VideoCompositorSettings videoCompositorSettings) {
        this.compositorSettings = videoCompositorSettings;
        VideoGraph videoGraph = this.videoGraph;
        if (videoGraph != null) {
            videoGraph.setCompositorSettings(videoCompositorSettings);
        }
    }

    public void setIsInputSdrToneMapped(boolean z6) {
        this.isInputSdrToneMapped = z6;
    }

    public void setOutputSurfaceInfo(Surface surface, Size size) {
        Pair<Surface, Size> pair = this.currentSurfaceAndSize;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) this.currentSurfaceAndSize.second).equals(size)) {
            return;
        }
        this.currentSurfaceAndSize = Pair.create(surface, size);
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

    private PlaybackVideoGraphWrapper(Builder builder) {
        this.context = builder.context;
        this.pendingStreamChanges = new TimedValueQueue<>();
        VideoGraph.Factory factory = builder.videoGraphFactory;
        factory.getClass();
        this.videoGraphFactory = factory;
        this.inputVideoSinks = new SparseArray<>();
        Z z6 = AbstractC2186b0.f22868i;
        this.compositionEffects = S0.f22832l;
        this.compositorSettings = VideoCompositorSettings.DEFAULT;
        this.enablePlaylistMode = builder.enablePlaylistMode;
        Clock clock = builder.clock;
        this.clock = clock;
        this.earlyThresholdToDropInputUs = builder.lateThresholdToDropInputUs != C.TIME_UNSET ? -builder.lateThresholdToDropInputUs : -9223372036854775807L;
        VideoFrameReleaseEarlyTimeForecaster videoFrameReleaseEarlyTimeForecaster = builder.videoFrameReleaseEarlyTimeForecaster;
        this.videoFrameReleaseEarlyTimeForecaster = videoFrameReleaseEarlyTimeForecaster;
        this.defaultVideoSink = new DefaultVideoSink(builder.videoFrameReleaseControl, videoFrameReleaseEarlyTimeForecaster, clock);
        this.videoFrameHandler = new VideoSink.VideoFrameHandler() {
            @Override
            public void render(long j) {
                VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.renderOutputFrame(j);
            }

            @Override
            public void skip() {
                VideoGraph videoGraph = PlaybackVideoGraphWrapper.this.videoGraph;
                videoGraph.getClass();
                videoGraph.renderOutputFrame(-2L);
            }
        };
        this.listeners = new CopyOnWriteArraySet<>();
        this.videoGraphOutputFormat = new Format.Builder().build();
        this.outputStreamStartPositionUs = C.TIME_UNSET;
        this.lastOutputFramePresentationTimeUs = C.TIME_UNSET;
        this.finalFramePresentationTimeUs = C.TIME_UNSET;
        this.totalVideoInputCount = -1;
        this.state = 0;
    }
}
