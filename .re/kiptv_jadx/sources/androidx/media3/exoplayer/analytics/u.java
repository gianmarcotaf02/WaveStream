package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16576i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16578l;

    public /* synthetic */ u(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i3) {
        this.f16575h = 0;
        this.f16576i = eventTime;
        this.j = i3;
        this.f16577k = positionInfo;
        this.f16578l = positionInfo2;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        ((androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher) this.f16576i).lambda$loadStarted$0((androidx.media3.exoplayer.source.LoadEventInfo) this.f16577k, (androidx.media3.exoplayer.source.MediaLoadData) this.f16578l, this.j, (androidx.media3.exoplayer.source.MediaSourceEventListener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16575h) {
            case 0:
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onPositionDiscontinuity$46((androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime) this.f16576i, this.j, (androidx.media3.common.Player.PositionInfo) this.f16577k, (androidx.media3.common.Player.PositionInfo) this.f16578l, analyticsListener);
                break;
            default:
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onLoadStarted$26((androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime) this.f16576i, (androidx.media3.exoplayer.source.LoadEventInfo) this.f16577k, (androidx.media3.exoplayer.source.MediaLoadData) this.f16578l, this.j, analyticsListener);
                break;
        }
    }

    public /* synthetic */ u(java.lang.Object obj, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, int i3, int i9) {
        this.f16575h = i9;
        this.f16576i = obj;
        this.f16577k = loadEventInfo;
        this.f16578l = mediaLoadData;
        this.j = i3;
    }
}
