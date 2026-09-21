package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

public final class c implements ListenerSet.Event {

    public final int f16528h;

    public final AnalyticsListener.EventTime f16529i;
    public final long j;

    public c(AnalyticsListener.EventTime eventTime, long j, int i3) {
        this.f16528h = i3;
        this.f16529i = eventTime;
        this.j = j;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16528h) {
            case 0:
                analyticsListener.onSeekForwardIncrementChanged(this.f16529i, this.j);
                break;
            case 1:
                analyticsListener.onAudioPositionAdvancing(this.f16529i, this.j);
                break;
            case 2:
                analyticsListener.onSeekBackIncrementChanged(this.f16529i, this.j);
                break;
            default:
                analyticsListener.onMaxSeekToPreviousPositionChanged(this.f16529i, this.j);
                break;
        }
    }
}
