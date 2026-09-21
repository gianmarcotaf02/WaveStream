package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

public final class i implements ListenerSet.Event {

    public final int f16542h;

    public final AnalyticsListener.EventTime f16543i;
    public final Exception j;

    public i(AnalyticsListener.EventTime eventTime, Exception exc, int i3) {
        this.f16542h = i3;
        this.f16543i = eventTime;
        this.j = exc;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16542h) {
            case 0:
                analyticsListener.onVideoCodecError(this.f16543i, this.j);
                break;
            case 1:
                analyticsListener.onDrmSessionManagerError(this.f16543i, this.j);
                break;
            case 2:
                analyticsListener.onAudioCodecError(this.f16543i, this.j);
                break;
            default:
                analyticsListener.onAudioSinkError(this.f16543i, this.j);
                break;
        }
    }
}
