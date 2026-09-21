package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16537i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f16538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f16539l;

    public /* synthetic */ g(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i3, long j, long j9, int i9) {
        this.f16536h = i9;
        this.f16537i = eventTime;
        this.j = i3;
        this.f16538k = j;
        this.f16539l = j9;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        switch (this.f16536h) {
            case 0:
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onBandwidthEstimate(this.f16537i, this.j, this.f16538k, this.f16539l);
                break;
            default:
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onAudioUnderrun(this.f16537i, this.j, this.f16538k, this.f16539l);
                break;
        }
    }
}
