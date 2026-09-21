package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class StandaloneMediaClock implements androidx.media3.exoplayer.MediaClock {
    private long baseElapsedMs;
    private long baseUs;
    private final androidx.media3.common.util.Clock clock;
    private androidx.media3.common.PlaybackParameters playbackParameters = androidx.media3.common.PlaybackParameters.DEFAULT;
    private boolean started;

    public StandaloneMediaClock(androidx.media3.common.util.Clock clock) {
        this.clock = clock;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        return this.playbackParameters;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        long j = this.baseUs;
        if (!this.started) {
            return j;
        }
        long jElapsedRealtime = this.clock.elapsedRealtime() - this.baseElapsedMs;
        androidx.media3.common.PlaybackParameters playbackParameters = this.playbackParameters;
        return (playbackParameters.speed == 1.0f ? androidx.media3.common.util.Util.msToUs(jElapsedRealtime) : playbackParameters.getMediaTimeUsForPlayoutTimeMs(jElapsedRealtime)) + j;
    }

    public void resetPosition(long j) {
        this.baseUs = j;
        if (this.started) {
            this.baseElapsedMs = this.clock.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        if (this.started) {
            resetPosition(getPositionUs());
        }
        this.playbackParameters = playbackParameters;
    }

    public void start() {
        if (this.started) {
            return;
        }
        this.baseElapsedMs = this.clock.elapsedRealtime();
        this.started = true;
    }

    public void stop() {
        if (this.started) {
            resetPosition(getPositionUs());
            this.started = false;
        }
    }
}
