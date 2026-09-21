package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class DefaultMediaClock implements androidx.media3.exoplayer.MediaClock {
    private boolean isUsingStandaloneClock = true;
    private final androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener listener;
    private androidx.media3.exoplayer.MediaClock rendererClock;
    private androidx.media3.exoplayer.Renderer rendererClockSource;
    private final androidx.media3.exoplayer.StandaloneMediaClock standaloneClock;
    private boolean standaloneClockIsStarted;

    public interface PlaybackParametersListener {
        void onPlaybackParametersChanged(androidx.media3.common.PlaybackParameters playbackParameters);
    }

    public DefaultMediaClock(androidx.media3.exoplayer.DefaultMediaClock.PlaybackParametersListener playbackParametersListener, androidx.media3.common.util.Clock clock) {
        this.listener = playbackParametersListener;
        this.standaloneClock = new androidx.media3.exoplayer.StandaloneMediaClock(clock);
    }

    private boolean shouldUseStandaloneClock(boolean z6) {
        androidx.media3.exoplayer.Renderer renderer = this.rendererClockSource;
        if (renderer == null || renderer.isEnded()) {
            return true;
        }
        if (z6 && this.rendererClockSource.getState() != 2) {
            return true;
        }
        if (this.rendererClockSource.isReady()) {
            return false;
        }
        return z6 || this.rendererClockSource.hasReadStreamToEnd();
    }

    private void syncClocks(boolean z6) {
        if (shouldUseStandaloneClock(z6)) {
            this.isUsingStandaloneClock = true;
            if (this.standaloneClockIsStarted) {
                this.standaloneClock.start();
                return;
            }
            return;
        }
        androidx.media3.exoplayer.MediaClock mediaClock = this.rendererClock;
        mediaClock.getClass();
        long positionUs = mediaClock.getPositionUs();
        if (this.isUsingStandaloneClock) {
            if (positionUs < this.standaloneClock.getPositionUs()) {
                this.standaloneClock.stop();
                return;
            } else {
                this.isUsingStandaloneClock = false;
                if (this.standaloneClockIsStarted) {
                    this.standaloneClock.start();
                }
            }
        }
        this.standaloneClock.resetPosition(positionUs);
        androidx.media3.common.PlaybackParameters playbackParameters = mediaClock.getPlaybackParameters();
        if (playbackParameters.equals(this.standaloneClock.getPlaybackParameters())) {
            return;
        }
        this.standaloneClock.setPlaybackParameters(playbackParameters);
        this.listener.onPlaybackParametersChanged(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public androidx.media3.common.PlaybackParameters getPlaybackParameters() {
        androidx.media3.exoplayer.MediaClock mediaClock = this.rendererClock;
        return mediaClock != null ? mediaClock.getPlaybackParameters() : this.standaloneClock.getPlaybackParameters();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public long getPositionUs() {
        if (this.isUsingStandaloneClock) {
            return this.standaloneClock.getPositionUs();
        }
        androidx.media3.exoplayer.MediaClock mediaClock = this.rendererClock;
        mediaClock.getClass();
        return mediaClock.getPositionUs();
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public boolean hasSkippedSilenceSinceLastCall() {
        if (this.isUsingStandaloneClock) {
            return this.standaloneClock.hasSkippedSilenceSinceLastCall();
        }
        androidx.media3.exoplayer.MediaClock mediaClock = this.rendererClock;
        mediaClock.getClass();
        return mediaClock.hasSkippedSilenceSinceLastCall();
    }

    public void onRendererDisabled(androidx.media3.exoplayer.Renderer renderer) {
        if (renderer == this.rendererClockSource) {
            this.rendererClock = null;
            this.rendererClockSource = null;
            this.isUsingStandaloneClock = true;
        }
    }

    public void onRendererEnabled(androidx.media3.exoplayer.Renderer renderer) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.MediaClock mediaClock;
        androidx.media3.exoplayer.MediaClock mediaClock2 = renderer.getMediaClock();
        if (mediaClock2 == null || mediaClock2 == (mediaClock = this.rendererClock)) {
            return;
        }
        if (mediaClock != null) {
            throw androidx.media3.exoplayer.ExoPlaybackException.createForUnexpected(new java.lang.IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.rendererClock = mediaClock2;
        this.rendererClockSource = renderer;
        mediaClock2.setPlaybackParameters(this.standaloneClock.getPlaybackParameters());
    }

    public void resetPosition(long j) {
        this.standaloneClock.resetPosition(j);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters) {
        androidx.media3.exoplayer.MediaClock mediaClock = this.rendererClock;
        if (mediaClock != null) {
            mediaClock.setPlaybackParameters(playbackParameters);
            playbackParameters = this.rendererClock.getPlaybackParameters();
        }
        this.standaloneClock.setPlaybackParameters(playbackParameters);
    }

    public void start() {
        this.standaloneClockIsStarted = true;
        this.standaloneClock.start();
    }

    public void stop() {
        this.standaloneClockIsStarted = false;
        this.standaloneClock.stop();
    }

    public long syncAndGetPositionUs(boolean z6) {
        syncClocks(z6);
        return getPositionUs();
    }
}
