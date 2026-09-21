package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

public final class f implements ListenerSet.Event {

    public final int f16534h;

    public final AnalyticsListener.EventTime f16535i;
    public final int j;

    public f(AnalyticsListener.EventTime eventTime, int i3, int i9) {
        this.f16534h = i9;
        this.f16535i = eventTime;
        this.j = i3;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16534h) {
            case 0:
                analyticsListener.onTimelineChanged(this.f16535i, this.j);
                break;
            case 1:
                analyticsListener.onPlaybackSuppressionReasonChanged(this.f16535i, this.j);
                break;
            case 2:
                analyticsListener.onDroppedSeeksWhileScrubbing(this.f16535i, this.j);
                break;
            case 3:
                analyticsListener.onPlaybackStateChanged(this.f16535i, this.j);
                break;
            case 4:
                DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$64(this.f16535i, this.j, analyticsListener);
                break;
            case 5:
                analyticsListener.onAudioSessionIdChanged(this.f16535i, this.j);
                break;
            default:
                analyticsListener.onRepeatModeChanged(this.f16535i, this.j);
                break;
        }
    }
}
