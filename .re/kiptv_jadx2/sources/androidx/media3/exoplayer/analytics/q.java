package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;

public final class q implements ListenerSet.Event {

    public final int f16565h;

    public final AnalyticsListener.EventTime f16566i;
    public final LoadEventInfo j;

    public final MediaLoadData f16567k;

    public q(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i3) {
        this.f16565h = i3;
        this.f16566i = eventTime;
        this.j = loadEventInfo;
        this.f16567k = mediaLoadData;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16565h) {
            case 0:
                analyticsListener.onLoadCanceled(this.f16566i, this.j, this.f16567k);
                break;
            default:
                analyticsListener.onLoadCompleted(this.f16566i, this.j, this.f16567k);
                break;
        }
    }
}
