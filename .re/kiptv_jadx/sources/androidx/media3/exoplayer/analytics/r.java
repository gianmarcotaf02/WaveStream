package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16569i;
    public final /* synthetic */ androidx.media3.common.Format j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.DecoderReuseEvaluation f16570k;

    public /* synthetic */ r(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Format format, androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluation, int i3) {
        this.f16568h = i3;
        this.f16569i = eventTime;
        this.j = format;
        this.f16570k = decoderReuseEvaluation;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
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
