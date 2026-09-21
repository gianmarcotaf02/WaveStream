package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16559i;
    public final /* synthetic */ androidx.media3.common.PlaybackException j;

    public /* synthetic */ n(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.PlaybackException playbackException, int i3) {
        this.f16558h = i3;
        this.f16559i = eventTime;
        this.j = playbackException;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16558h) {
            case 0:
                analyticsListener.onPlayerErrorChanged(this.f16559i, this.j);
                break;
            default:
                analyticsListener.onPlayerError(this.f16559i, this.j);
                break;
        }
    }
}
