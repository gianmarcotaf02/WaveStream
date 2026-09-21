package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

public final class m implements ListenerSet.Event {

    public final int f16555h = 0;

    public final AnalyticsListener.EventTime f16556i;
    public final long j;

    public final int f16557k;

    public m(AnalyticsListener.EventTime eventTime, int i3, long j) {
        this.f16556i = eventTime;
        this.f16557k = i3;
        this.j = j;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16555h) {
            case 0:
                analyticsListener.onDroppedVideoFrames(this.f16556i, this.f16557k, this.j);
                break;
            default:
                analyticsListener.onVideoFrameProcessingOffset(this.f16556i, this.j, this.f16557k);
                break;
        }
    }

    public m(AnalyticsListener.EventTime eventTime, long j, int i3) {
        this.f16556i = eventTime;
        this.j = j;
        this.f16557k = i3;
    }
}
