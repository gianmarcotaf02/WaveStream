package androidx.media3.exoplayer.analytics;

import androidx.media3.common.util.ListenerSet;

public final class l implements ListenerSet.Event {

    public final int f16551h;

    public final AnalyticsListener.EventTime f16552i;
    public final String j;

    public final long f16553k;

    public final long f16554l;

    public l(AnalyticsListener.EventTime eventTime, String str, long j, long j9, int i3) {
        this.f16551h = i3;
        this.f16552i = eventTime;
        this.j = str;
        this.f16553k = j;
        this.f16554l = j9;
    }

    @Override
    public final void invoke(Object obj) {
        switch (this.f16551h) {
            case 0:
                String str = this.j;
                long j = this.f16553k;
                DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$4(this.f16552i, str, j, this.f16554l, (AnalyticsListener) obj);
                break;
            default:
                String str2 = this.j;
                long j9 = this.f16553k;
                DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$16(this.f16552i, str2, j9, this.f16554l, (AnalyticsListener) obj);
                break;
        }
    }
}
