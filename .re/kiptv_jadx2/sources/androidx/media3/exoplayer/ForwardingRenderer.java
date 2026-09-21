package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;

public class ForwardingRenderer implements Renderer {
    private final Renderer renderer;

    public ForwardingRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    @Override
    public void disable() {
        this.renderer.disable();
    }

    @Override
    public void enable(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, long j, boolean z6, boolean z9, long j9, long j10, MediaSource.MediaPeriodId mediaPeriodId) {
        this.renderer.enable(rendererConfiguration, formatArr, sampleStream, j, z6, z9, j9, j10, mediaPeriodId);
    }

    @Override
    public void enableMayRenderStartOfStream() {
        this.renderer.enableMayRenderStartOfStream();
    }

    @Override
    public RendererCapabilities getCapabilities() {
        return this.renderer.getCapabilities();
    }

    @Override
    public long getDurationToProgressUs(long j, long j9) {
        return this.renderer.getDurationToProgressUs(j, j9);
    }

    @Override
    public MediaClock getMediaClock() {
        return this.renderer.getMediaClock();
    }

    @Override
    public String getName() {
        return this.renderer.getName();
    }

    @Override
    public long getReadingPositionUs() {
        return this.renderer.getReadingPositionUs();
    }

    @Override
    public int getState() {
        return this.renderer.getState();
    }

    @Override
    public SampleStream getStream() {
        return this.renderer.getStream();
    }

    @Override
    public int getTrackType() {
        return this.renderer.getTrackType();
    }

    @Override
    public void handleMessage(int i3, Object obj) {
        this.renderer.handleMessage(i3, obj);
    }

    @Override
    public boolean hasReadStreamToEnd() {
        return this.renderer.hasReadStreamToEnd();
    }

    @Override
    public void init(int i3, PlayerId playerId, Clock clock) {
        this.renderer.init(i3, playerId, clock);
    }

    @Override
    public boolean isCurrentStreamFinal() {
        return this.renderer.isCurrentStreamFinal();
    }

    @Override
    public boolean isEnded() {
        return this.renderer.isEnded();
    }

    @Override
    public boolean isReady() {
        return this.renderer.isReady();
    }

    @Override
    public void maybeThrowStreamError() {
        this.renderer.maybeThrowStreamError();
    }

    @Override
    public void release() {
        this.renderer.release();
    }

    @Override
    public void render(long j, long j9) {
        this.renderer.render(j, j9);
    }

    @Override
    public void replaceStream(Format[] formatArr, SampleStream sampleStream, long j, long j9, MediaSource.MediaPeriodId mediaPeriodId) {
        this.renderer.replaceStream(formatArr, sampleStream, j, j9, mediaPeriodId);
    }

    @Override
    public void reset() {
        this.renderer.reset();
    }

    @Override
    public void resetPosition(long j, boolean z6) {
        this.renderer.resetPosition(j, z6);
    }

    @Override
    public void setCurrentStreamFinal() {
        this.renderer.setCurrentStreamFinal();
    }

    @Override
    public void setPlaybackSpeed(float f9, float f10) {
        this.renderer.setPlaybackSpeed(f9, f10);
    }

    @Override
    public void setTimeline(Timeline timeline) {
        this.renderer.setTimeline(timeline);
    }

    @Override
    public void start() {
        this.renderer.start();
    }

    @Override
    public void stop() {
        this.renderer.stop();
    }

    @Override
    public boolean supportsResetPositionWithoutKeyFrameReset(long j) {
        return this.renderer.supportsResetPositionWithoutKeyFrameReset(j);
    }
}
