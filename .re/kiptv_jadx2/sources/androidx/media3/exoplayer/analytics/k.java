package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

public final class k implements ListenerSet.Event {

    public final int f16548h;

    public final AnalyticsListener.EventTime f16549i;
    public final int j;

    public final boolean f16550k;

    public k(AnalyticsListener.EventTime eventTime, int i3, int i9, boolean z6) {
        this.f16548h = i9;
        this.f16549i = eventTime;
        this.f16550k = z6;
        this.j = i3;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16548h) {
            case 0:
                analyticsListener.onPlayerStateChanged(this.f16549i, this.f16550k, this.j);
                break;
            case 1:
                analyticsListener.onDeviceVolumeChanged(this.f16549i, this.j, this.f16550k);
                break;
            default:
                analyticsListener.onPlayWhenReadyChanged(this.f16549i, this.f16550k, this.j);
                break;
        }
    }

    public k(AnalyticsListener.EventTime eventTime, int i3, boolean z6) {
        this.f16548h = 1;
        this.f16549i = eventTime;
        this.j = i3;
        this.f16550k = z6;
    }
}
