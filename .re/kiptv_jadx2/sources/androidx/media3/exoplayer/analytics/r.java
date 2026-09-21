package androidx.media3.exoplayer.analytics;

import androidx.media3.common.Format;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

public final class r implements ListenerSet.Event {

    public final int f16568h;

    public final AnalyticsListener.EventTime f16569i;
    public final Format j;

    public final DecoderReuseEvaluation f16570k;

    public r(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, int i3) {
        this.f16568h = i3;
        this.f16569i = eventTime;
        this.j = format;
        this.f16570k = decoderReuseEvaluation;
    }

    @Override
    public final void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.f16568h) {
            case 0:
                analyticsListener.onVideoInputFormatChanged(this.f16569i, this.j, this.f16570k);
                break;
            default:
                analyticsListener.onAudioInputFormatChanged(this.f16569i, this.j, this.f16570k);
                break;
        }
    }
}
