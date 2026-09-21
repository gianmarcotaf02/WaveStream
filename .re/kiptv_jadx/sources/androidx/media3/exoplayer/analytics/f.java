package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16534h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16535i;
    public final /* synthetic */ int j;

    public /* synthetic */ f(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i3, int i9) {
        this.f16534h = i9;
        this.f16535i = eventTime;
        this.j = i3;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16534h) {
            case 0:
                analyticsListener.onTimelineChanged(this.f16535i, this.j);
                break;
            case 1:
                analyticsListener.onPlaybackSuppressionReasonChanged(this.f16535i, this.j);
                break;
            case 2:
                analyticsListener.onDroppedSeeksWhileScrubbing(this.f16535i, this.j);
                break;
            case 3:
                analyticsListener.onPlaybackStateChanged(this.f16535i, this.j);
                break;
            case 4:
                androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector.lambda$onDrmSessionAcquired$64(this.f16535i, this.j, analyticsListener);
                break;
            case 5:
                analyticsListener.onAudioSessionIdChanged(this.f16535i, this.j);
                break;
            default:
                analyticsListener.onRepeatModeChanged(this.f16535i, this.j);
                break;
        }
    }
}
