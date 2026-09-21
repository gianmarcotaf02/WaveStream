package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16552i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f16553k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f16554l;

    public /* synthetic */ l(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, long j, long j9, int i3) {
        this.f16551h = i3;
        this.f16552i = eventTime;
        this.j = str;
        this.f16553k = j;
        this.f16554l = j9;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        switch (this.f16551h) {
            case 0:
                java.lang.String str = this.j;
                long j = this.f16553k;
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onAudioDecoderInitialized$4(this.f16552i, str, j, this.f16554l, (androidx.media3.exoplayer.analytics.AnalyticsListener) obj);
                break;
            default:
                java.lang.String str2 = this.j;
                long j9 = this.f16553k;
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onVideoDecoderInitialized$16(this.f16552i, str2, j9, this.f16554l, (androidx.media3.exoplayer.analytics.AnalyticsListener) obj);
                break;
        }
    }
}
