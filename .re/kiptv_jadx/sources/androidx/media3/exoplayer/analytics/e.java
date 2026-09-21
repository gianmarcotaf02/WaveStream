package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16533i;
    public final /* synthetic */ java.lang.String j;

    public /* synthetic */ e(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.String str, int i3) {
        this.f16532h = i3;
        this.f16533i = eventTime;
        this.j = str;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16532h) {
            case 0:
                analyticsListener.onAudioDecoderReleased(this.f16533i, this.j);
                break;
            default:
                analyticsListener.onVideoDecoderReleased(this.f16533i, this.j);
                break;
        }
    }
}
