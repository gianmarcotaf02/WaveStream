package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

public final class d implements ListenerSet.Event {

    public final int f16530h;

    public final AnalyticsListener.EventTime f16531i;
    public final boolean j;

    public d(AnalyticsListener.EventTime eventTime, int i3, boolean z6) {
        this.f16530h = i3;
        this.f16531i = eventTime;
        this.j = z6;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16530h) {
            case 0:
                DefaultAnalyticsCollector.lambda$onIsLoadingChanged$35(this.f16531i, this.j, analyticsListener);
                break;
            case 1:
                analyticsListener.onSkipSilenceEnabledChanged(this.f16531i, this.j);
                break;
            case 2:
                analyticsListener.onIsPlayingChanged(this.f16531i, this.j);
                break;
            default:
                analyticsListener.onShuffleModeChanged(this.f16531i, this.j);
                break;
        }
    }
}
