package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16565h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16566i;
    public final /* synthetic */ androidx.media3.exoplayer.source.LoadEventInfo j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.MediaLoadData f16567k;

    public /* synthetic */ q(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i3) {
        this.f16565h = i3;
        this.f16566i = eventTime;
        this.j = loadEventInfo;
        this.f16567k = mediaLoadData;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16565h) {
            case 0:
                analyticsListener.onLoadCanceled(this.f16566i, this.j, this.f16567k);
                break;
            default:
                analyticsListener.onLoadCompleted(this.f16566i, this.j, this.f16567k);
                break;
        }
    }
}
