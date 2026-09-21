package androidx.media3.exoplayer.analytics;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.util.ListenerSet;

public final class n implements ListenerSet.Event {

    public final int f16558h;

    public final AnalyticsListener.EventTime f16559i;
    public final PlaybackException j;

    public n(AnalyticsListener.EventTime eventTime, PlaybackException playbackException, int i3) {
        this.f16558h = i3;
        this.f16559i = eventTime;
        this.j = playbackException;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16558h) {
            case 0:
                analyticsListener.onPlayerErrorChanged(this.f16559i, this.j);
                break;
            default:
                analyticsListener.onPlayerError(this.f16559i, this.j);
                break;
        }
    }
}
