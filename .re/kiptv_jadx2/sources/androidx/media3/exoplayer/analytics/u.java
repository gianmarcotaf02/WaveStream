package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Player;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSourceEventListener;

public final class u implements ListenerSet.Event, Consumer {

    public final int f16575h;

    public final Object f16576i;
    public final int j;

    public final Object f16577k;

    public final Object f16578l;

    public u(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i3) {
        this.f16575h = 0;
        this.f16576i = eventTime;
        this.j = i3;
        this.f16577k = positionInfo;
        this.f16578l = positionInfo2;
    }

    @Override
    public void accept(Object obj) {
        ((MediaSourceEventListener.EventDispatcher) this.f16576i).lambda$loadStarted$0((LoadEventInfo) this.f16577k, (MediaLoadData) this.f16578l, this.j, (MediaSourceEventListener) obj);
    }

    @Override
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16575h) {
            case 0:
                DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$46((AnalyticsListener.EventTime) this.f16576i, this.j, (Player.PositionInfo) this.f16577k, (Player.PositionInfo) this.f16578l, analyticsListener);
                break;
            default:
                DefaultAnalyticsCollector.lambda$onLoadStarted$26((AnalyticsListener.EventTime) this.f16576i, (LoadEventInfo) this.f16577k, (MediaLoadData) this.f16578l, this.j, analyticsListener);
                break;
        }
    }

    public u(Object obj, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i3, int i9) {
        this.f16575h = i9;
        this.f16576i = obj;
        this.f16577k = loadEventInfo;
        this.f16578l = mediaLoadData;
        this.j = i3;
    }
}
