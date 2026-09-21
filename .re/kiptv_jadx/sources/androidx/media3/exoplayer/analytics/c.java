package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16529i;
    public final /* synthetic */ long j;

    public /* synthetic */ c(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j, int i3) {
        this.f16528h = i3;
        this.f16529i = eventTime;
        this.j = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16528h) {
            case 0:
                analyticsListener.onSeekForwardIncrementChanged(this.f16529i, this.j);
                break;
            case 1:
                analyticsListener.onAudioPositionAdvancing(this.f16529i, this.j);
                break;
            case 2:
                analyticsListener.onSeekBackIncrementChanged(this.f16529i, this.j);
                break;
            default:
                analyticsListener.onMaxSeekToPreviousPositionChanged(this.f16529i, this.j);
                break;
        }
    }
}
