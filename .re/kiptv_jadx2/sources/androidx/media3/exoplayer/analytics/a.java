package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

public final class a implements ListenerSet.Event {

    public final int f16524h;

    public final AnalyticsListener.EventTime f16525i;

    public a(AnalyticsListener.EventTime eventTime, int i3) {
        this.f16524h = i3;
        this.f16525i = eventTime;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f16524h) {
            case 0:
                ((AnalyticsListener) obj).onPlayerReleased(this.f16525i);
                break;
            case 1:
                ((AnalyticsListener) obj).onDrmKeysRemoved(this.f16525i);
                break;
            case 2:
                ((AnalyticsListener) obj).onDrmKeysRestored(this.f16525i);
                break;
            case 3:
                ((AnalyticsListener) obj).onSeekStarted(this.f16525i);
                break;
            default:
                ((AnalyticsListener) obj).onDrmSessionReleased(this.f16525i);
                break;
        }
    }
}
