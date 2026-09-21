package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public class ForwardingRenderer implements androidx.media3.exoplayer.Renderer {
    private final androidx.media3.exoplayer.Renderer renderer;

    public ForwardingRenderer(androidx.media3.exoplayer.Renderer renderer) {
        this.renderer = renderer;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void disable() {
        this.renderer.disable();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void enable(androidx.media3.exoplayer.RendererConfiguration rendererConfiguration, androidx.media3.common.Format[] formatArr, androidx.media3.exoplayer.source.SampleStream sampleStream, long j, boolean z6, boolean z9, long j9, long j10, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.renderer.enable(rendererConfiguration, formatArr, sampleStream, j, z6, z9, j9, j10, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        this.renderer.enableMayRenderStartOfStream();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public androidx.media3.exoplayer.RendererCapabilities getCapabilities() {
        return this.renderer.getCapabilities();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public long getDurationToProgressUs(long j, long j9) {
        return this.renderer.getDurationToProgressUs(j, j9);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public androidx.media3.exoplayer.MediaClock getMediaClock() {
        return this.renderer.getMediaClock();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public java.lang.String getName() {
        return this.renderer.getName();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public long getReadingPositionUs() {
        return this.renderer.getReadingPositionUs();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public int getState() {
        return this.renderer.getState();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public androidx.media3.exoplayer.source.SampleStream getStream() {
        return this.renderer.getStream();
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public int getTrackType() {
        return this.renderer.getTrackType();
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i3, java.lang.Object obj) {
        this.renderer.handleMessage(i3, obj);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean hasReadStreamToEnd() {
        return this.renderer.hasReadStreamToEnd();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void init(int i3, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.util.Clock clock) {
        this.renderer.init(i3, playerId, clock);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isCurrentStreamFinal() {
        return this.renderer.isCurrentStreamFinal();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return this.renderer.isEnded();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return this.renderer.isReady();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void maybeThrowStreamError() {
        this.renderer.maybeThrowStreamError();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void release() {
        this.renderer.release();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j9) {
        this.renderer.render(j, j9);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void replaceStream(androidx.media3.common.Format[] formatArr, androidx.media3.exoplayer.source.SampleStream sampleStream, long j, long j9, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.renderer.replaceStream(formatArr, sampleStream, j, j9, mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void reset() {
        this.renderer.reset();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void resetPosition(long j, boolean z6) {
        this.renderer.resetPosition(j, z6);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setCurrentStreamFinal() {
        this.renderer.setCurrentStreamFinal();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f9, float f10) {
        this.renderer.setPlaybackSpeed(f9, f10);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void setTimeline(androidx.media3.common.Timeline timeline) {
        this.renderer.setTimeline(timeline);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void start() {
        this.renderer.start();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void stop() {
        this.renderer.stop();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean supportsResetPositionWithoutKeyFrameReset(long j) {
        return this.renderer.supportsResetPositionWithoutKeyFrameReset(j);
    }
}
