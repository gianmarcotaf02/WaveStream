package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements androidx.media3.common.util.ListenerSet.Event, androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.LoadEventInfo f16544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.MediaLoadData f16545i;
    public final /* synthetic */ java.io.IOException j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f16546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16547l;

    public /* synthetic */ j(java.lang.Object obj, androidx.media3.exoplayer.source.LoadEventInfo loadEventInfo, androidx.media3.exoplayer.source.MediaLoadData mediaLoadData, java.io.IOException iOException, boolean z6) {
        this.f16547l = obj;
        this.f16544h = loadEventInfo;
        this.f16545i = mediaLoadData;
        this.j = iOException;
        this.f16546k = z6;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher eventDispatcher = (androidx.media3.exoplayer.source.MediaSourceEventListener.EventDispatcher) this.f16547l;
        androidx.media3.exoplayer.source.MediaLoadData mediaLoadData = this.f16545i;
        java.io.IOException iOException = this.j;
        eventDispatcher.lambda$loadError$3(this.f16544h, mediaLoadData, iOException, this.f16546k, (androidx.media3.exoplayer.source.MediaSourceEventListener) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(java.lang.Object obj) {
        ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onLoadError((androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime) this.f16547l, this.f16544h, this.f16545i, this.j, this.f16546k);
    }
}
