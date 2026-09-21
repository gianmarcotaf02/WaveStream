package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseRenderer implements androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities {
    private androidx.media3.common.util.Clock clock;
    private androidx.media3.exoplayer.RendererConfiguration configuration;
    private int index;
    private long lastResetPositionUs;
    private androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
    private androidx.media3.exoplayer.analytics.PlayerId playerId;
    private androidx.media3.exoplayer.RendererCapabilities.Listener rendererCapabilitiesListener;
    private int state;
    private androidx.media3.exoplayer.source.SampleStream stream;
    private androidx.media3.common.Format[] streamFormats;
    private boolean streamIsFinal;
    private long streamOffsetUs;
    private boolean throwRendererExceptionIsExecuting;
    private final int trackType;
    private final java.lang.Object lock = new java.lang.Object();
    private final androidx.media3.exoplayer.FormatHolder formatHolder = new androidx.media3.exoplayer.FormatHolder();
    private long readingPositionUs = Long.MIN_VALUE;
    private androidx.media3.common.Timeline timeline = androidx.media3.common.Timeline.EMPTY;

    public BaseRenderer(int i3) {
        this.trackType = i3;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void clearListener() {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = null;
        }
    }

    public final androidx.media3.exoplayer.ExoPlaybackException createRendererException(java.lang.Throwable th, androidx.media3.common.Format format, int i3) {
        return createRendererException(th, format, false, i3);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void disable() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.state == 1);
        this.formatHolder.clear();
        this.state = 0;
        this.stream = null;
        this.streamFormats = null;
        this.streamIsFinal = false;
        onDisabled();
        this.mediaPeriodId = null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void enable(androidx.media3.exoplayer.RendererConfiguration rendererConfiguration, androidx.media3.common.Format[] formatArr, androidx.media3.exoplayer.source.SampleStream sampleStream, long j, boolean z6, boolean z9, long j9, long j10, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.state == 0);
        this.configuration = rendererConfiguration;
        this.mediaPeriodId = mediaPeriodId;
        this.state = 1;
        onEnabled(z6, z9);
        replaceStream(formatArr, sampleStream, j9, j10, mediaPeriodId);
        resetPosition(j9, z6, true);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final androidx.media3.exoplayer.RendererCapabilities getCapabilities() {
        return this;
    }

    public final androidx.media3.common.util.Clock getClock() {
        androidx.media3.common.util.Clock clock = this.clock;
        clock.getClass();
        return clock;
    }

    public final androidx.media3.exoplayer.RendererConfiguration getConfiguration() {
        androidx.media3.exoplayer.RendererConfiguration rendererConfiguration = this.configuration;
        rendererConfiguration.getClass();
        return rendererConfiguration;
    }

    public final androidx.media3.exoplayer.FormatHolder getFormatHolder() {
        this.formatHolder.clear();
        return this.formatHolder;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getLastResetPositionUs() {
        return this.lastResetPositionUs;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public androidx.media3.exoplayer.MediaClock getMediaClock() {
        return null;
    }

    public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId getMediaPeriodId() {
        return this.mediaPeriodId;
    }

    public final androidx.media3.exoplayer.analytics.PlayerId getPlayerId() {
        androidx.media3.exoplayer.analytics.PlayerId playerId = this.playerId;
        playerId.getClass();
        return playerId;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final long getReadingPositionUs() {
        return this.readingPositionUs;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final int getState() {
        return this.state;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final androidx.media3.exoplayer.source.SampleStream getStream() {
        return this.stream;
    }

    public final androidx.media3.common.Format[] getStreamFormats() {
        androidx.media3.common.Format[] formatArr = this.streamFormats;
        formatArr.getClass();
        return formatArr;
    }

    public final long getStreamOffsetUs() {
        return this.streamOffsetUs;
    }

    public final androidx.media3.common.Timeline getTimeline() {
        return this.timeline;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final int getTrackType() {
        return this.trackType;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i3, java.lang.Object obj) {
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean hasReadStreamToEnd() {
        return this.readingPositionUs == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void init(int i3, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.util.Clock clock) {
        this.index = i3;
        this.playerId = playerId;
        this.clock = clock;
        onInit();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isCurrentStreamFinal() {
        return this.streamIsFinal;
    }

    public final boolean isSourceReady() {
        if (hasReadStreamToEnd()) {
            return this.streamIsFinal;
        }
        androidx.media3.exoplayer.source.SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        return sampleStream.isReady();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void maybeThrowStreamError() {
        androidx.media3.exoplayer.source.SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        sampleStream.maybeThrowError();
    }

    public void onDisabled() {
    }

    public void onEnabled(boolean z6, boolean z9) {
    }

    public void onInit() {
    }

    public void onPositionReset(long j, boolean z6, boolean z9) {
    }

    public void onRelease() {
    }

    public final void onRendererCapabilitiesChanged() {
        androidx.media3.exoplayer.RendererCapabilities.Listener listener;
        synchronized (this.lock) {
            listener = this.rendererCapabilitiesListener;
        }
        if (listener != null) {
            listener.onRendererCapabilitiesChanged(this);
        }
    }

    public void onReset() {
    }

    public void onStarted() {
    }

    public void onStopped() {
    }

    public void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j9, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public void onTimelineChanged(androidx.media3.common.Timeline timeline) {
    }

    public final int readSource(androidx.media3.exoplayer.FormatHolder formatHolder, androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer, int i3) {
        androidx.media3.exoplayer.source.SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        int data = sampleStream.readData(formatHolder, decoderInputBuffer, i3);
        if (data != -4) {
            if (data == -5) {
                androidx.media3.common.Format format = formatHolder.format;
                format.getClass();
                if (format.subsampleOffsetUs != Long.MAX_VALUE) {
                    formatHolder.format = format.buildUpon().setSubsampleOffsetUs(format.subsampleOffsetUs + this.streamOffsetUs).build();
                }
            }
            return data;
        }
        if (decoderInputBuffer.isEndOfStream()) {
            this.readingPositionUs = Long.MIN_VALUE;
            return this.streamIsFinal ? -4 : -3;
        }
        long j = decoderInputBuffer.timeUs + this.streamOffsetUs;
        decoderInputBuffer.timeUs = j;
        this.readingPositionUs = java.lang.Math.max(this.readingPositionUs, j);
        return data;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void release() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.state == 0);
        onRelease();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void replaceStream(androidx.media3.common.Format[] formatArr, androidx.media3.exoplayer.source.SampleStream sampleStream, long j, long j9, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.streamIsFinal);
        this.stream = sampleStream;
        this.mediaPeriodId = mediaPeriodId;
        if (this.readingPositionUs == Long.MIN_VALUE) {
            this.readingPositionUs = j;
        }
        this.streamFormats = formatArr;
        this.streamOffsetUs = j9;
        onStreamChanged(formatArr, j, j9, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void reset() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.state == 0);
        this.formatHolder.clear();
        onReset();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void resetPosition(long j, boolean z6) {
        resetPosition(j, false, z6);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setCurrentStreamFinal() {
        this.streamIsFinal = true;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final void setListener(androidx.media3.exoplayer.RendererCapabilities.Listener listener) {
        synchronized (this.lock) {
            this.rendererCapabilitiesListener = listener;
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void setTimeline(androidx.media3.common.Timeline timeline) {
        if (java.util.Objects.equals(this.timeline, timeline)) {
            return;
        }
        this.timeline = timeline;
        onTimelineChanged(timeline);
    }

    public int skipSource(long j) {
        androidx.media3.exoplayer.source.SampleStream sampleStream = this.stream;
        sampleStream.getClass();
        return sampleStream.skipData(j - this.streamOffsetUs);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void start() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void stop() {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    private void resetPosition(long j, boolean z6, boolean z9) {
        this.streamIsFinal = false;
        this.lastResetPositionUs = j;
        this.readingPositionUs = j;
        if (!z9) {
            z9 = skipSource(j) != 0;
        }
        onPositionReset(j, z6, z9);
    }

    public final androidx.media3.exoplayer.ExoPlaybackException createRendererException(java.lang.Throwable th, androidx.media3.common.Format format, boolean z6, int i3) {
        int formatSupport;
        if (format == null || this.throwRendererExceptionIsExecuting) {
            formatSupport = 4;
        } else {
            this.throwRendererExceptionIsExecuting = true;
            try {
                formatSupport = androidx.media3.exoplayer.RendererCapabilities.getFormatSupport(supportsFormat(format));
                this.throwRendererExceptionIsExecuting = false;
            } catch (androidx.media3.exoplayer.ExoPlaybackException unused) {
                this.throwRendererExceptionIsExecuting = false;
                formatSupport = 4;
            } catch (java.lang.Throwable th2) {
                this.throwRendererExceptionIsExecuting = false;
                throw th2;
            }
        }
        return androidx.media3.exoplayer.ExoPlaybackException.createForRenderer(th, getName(), getIndex(), format, formatSupport, this.mediaPeriodId, z6, i3);
    }
}
