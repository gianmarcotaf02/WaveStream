package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16564i;
    public final /* synthetic */ androidx.media3.exoplayer.source.MediaLoadData j;

    public /* synthetic */ p(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i3) {
        this.f16563h = i3;
        this.f16564i = eventTime;
        this.j = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16563h) {
            case 0:
                analyticsListener.onDownstreamFormatChanged(this.f16564i, this.j);
                break;
            default:
                analyticsListener.onUpstreamDiscarded(this.f16564i, this.j);
                break;
        }
    }
}
