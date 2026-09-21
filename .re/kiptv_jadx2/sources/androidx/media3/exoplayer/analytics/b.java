package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;

public final class b implements ListenerSet.Event {

    public final int f16526h;

    public final AnalyticsListener.EventTime f16527i;
    public final DecoderCounters j;

    public b(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, int i3) {
        this.f16526h = i3;
        this.f16527i = eventTime;
        this.j = decoderCounters;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16526h) {
            case 0:
                analyticsListener.onAudioEnabled(this.f16527i, this.j);
                break;
            case 1:
                analyticsListener.onAudioDisabled(this.f16527i, this.j);
                break;
            case 2:
                analyticsListener.onVideoDisabled(this.f16527i, this.j);
                break;
            default:
                analyticsListener.onVideoEnabled(this.f16527i, this.j);
                break;
        }
    }
}
