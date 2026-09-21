package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.audio.AudioSink;

public final class s implements ListenerSet.Event {

    public final int f16571h;

    public final AnalyticsListener.EventTime f16572i;
    public final AudioSink.AudioTrackConfig j;

    public s(AnalyticsListener.EventTime eventTime, AudioSink.AudioTrackConfig audioTrackConfig, int i3) {
        this.f16571h = i3;
        this.f16572i = eventTime;
        this.j = audioTrackConfig;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16571h) {
            case 0:
                analyticsListener.onAudioTrackInitialized(this.f16572i, this.j);
                break;
            default:
                analyticsListener.onAudioTrackReleased(this.f16572i, this.j);
                break;
        }
    }
}
