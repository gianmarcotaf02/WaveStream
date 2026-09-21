package androidx.media3.exoplayer.analytics;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.ListenerSet;

public final class t implements ListenerSet.Event {

    public final int f16573h;

    public final AnalyticsListener.EventTime f16574i;
    public final MediaMetadata j;

    public t(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata, int i3) {
        this.f16573h = i3;
        this.f16574i = eventTime;
        this.j = mediaMetadata;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16573h) {
            case 0:
                analyticsListener.onPlaylistMetadataChanged(this.f16574i, this.j);
                break;
            default:
                analyticsListener.onMediaMetadataChanged(this.f16574i, this.j);
                break;
        }
    }
}
