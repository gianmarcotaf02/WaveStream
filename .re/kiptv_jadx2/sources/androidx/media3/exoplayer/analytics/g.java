package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

public final class g implements ListenerSet.Event {

    public final int f16536h;

    public final AnalyticsListener.EventTime f16537i;
    public final int j;

    public final long f16538k;

    public final long f16539l;

    public g(AnalyticsListener.EventTime eventTime, int i3, long j, long j9, int i9) {
        this.f16536h = i9;
        this.f16537i = eventTime;
        this.j = i3;
        this.f16538k = j;
        this.f16539l = j9;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f16536h) {
            case 0:
                ((AnalyticsListener) obj).onBandwidthEstimate(this.f16537i, this.j, this.f16538k, this.f16539l);
                break;
            default:
                ((AnalyticsListener) obj).onAudioUnderrun(this.f16537i, this.j, this.f16538k, this.f16539l);
                break;
        }
    }
}
