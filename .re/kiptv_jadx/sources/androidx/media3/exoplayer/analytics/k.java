package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16549i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f16550k;

    public /* synthetic */ k(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i3, int i9, boolean z6) {
        this.f16548h = i9;
        this.f16549i = eventTime;
        this.f16550k = z6;
        this.j = i3;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16548h) {
            case 0:
                analyticsListener.onPlayerStateChanged(this.f16549i, this.f16550k, this.j);
                break;
            case 1:
                analyticsListener.onDeviceVolumeChanged(this.f16549i, this.j, this.f16550k);
                break;
            default:
                analyticsListener.onPlayWhenReadyChanged(this.f16549i, this.f16550k, this.j);
                break;
        }
    }

    public /* synthetic */ k(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i3, boolean z6) {
        this.f16548h = 1;
        this.f16549i = eventTime;
        this.j = i3;
        this.f16550k = z6;
    }
}
