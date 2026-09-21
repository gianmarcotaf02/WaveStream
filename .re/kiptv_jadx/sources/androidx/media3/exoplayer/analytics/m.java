package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16555h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16556i;
    public final /* synthetic */ long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16557k;

    public /* synthetic */ m(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i3, long j) {
        this.f16556i = eventTime;
        this.f16557k = i3;
        this.j = j;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16555h) {
            case 0:
                analyticsListener.onDroppedVideoFrames(this.f16556i, this.f16557k, this.j);
                break;
            default:
                analyticsListener.onVideoFrameProcessingOffset(this.f16556i, this.j, this.f16557k);
                break;
        }
    }

    public /* synthetic */ m(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, long j, int i3) {
        this.f16556i = eventTime;
        this.j = j;
        this.f16557k = i3;
    }
}
