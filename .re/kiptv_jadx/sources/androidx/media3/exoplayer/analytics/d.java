package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16531i;
    public final /* synthetic */ boolean j;

    public /* synthetic */ d(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i3, boolean z6) {
        this.f16530h = i3;
        this.f16531i = eventTime;
        this.j = z6;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16530h) {
            case 0:
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onIsLoadingChanged$35(this.f16531i, this.j, analyticsListener);
                break;
            case 1:
                analyticsListener.onSkipSilenceEnabledChanged(this.f16531i, this.j);
                break;
            case 2:
                analyticsListener.onIsPlayingChanged(this.f16531i, this.j);
                break;
            default:
                analyticsListener.onShuffleModeChanged(this.f16531i, this.j);
                break;
        }
    }
}
