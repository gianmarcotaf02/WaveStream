package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.MediaLoadData;

public final class p implements ListenerSet.Event {

    public final int f16563h;

    public final AnalyticsListener.EventTime f16564i;
    public final MediaLoadData j;

    public p(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData, int i3) {
        this.f16563h = i3;
        this.f16564i = eventTime;
        this.j = mediaLoadData;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16563h) {
            case 0:
                analyticsListener.onDownstreamFormatChanged(this.f16564i, this.j);
                break;
            default:
                analyticsListener.onUpstreamDiscarded(this.f16564i, this.j);
                break;
        }
    }
}
