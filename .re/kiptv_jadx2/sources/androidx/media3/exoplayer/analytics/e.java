package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

public final class e implements ListenerSet.Event {

    public final int f16532h;

    public final AnalyticsListener.EventTime f16533i;
    public final String j;

    public e(AnalyticsListener.EventTime eventTime, String str, int i3) {
        this.f16532h = i3;
        this.f16533i = eventTime;
        this.j = str;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16532h) {
            case 0:
                analyticsListener.onAudioDecoderReleased(this.f16533i, this.j);
                break;
            default:
                analyticsListener.onVideoDecoderReleased(this.f16533i, this.j);
                break;
        }
    }
}
