package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16524h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16525i;

    public /* synthetic */ a(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, int i3) {
        this.f16524h = i3;
        this.f16525i = eventTime;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        switch (this.f16524h) {
            case 0:
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onPlayerReleased(this.f16525i);
                break;
            case 1:
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDrmKeysRemoved(this.f16525i);
                break;
            case 2:
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDrmKeysRestored(this.f16525i);
                break;
            case 3:
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onSeekStarted(this.f16525i);
                break;
            default:
                ((androidx.media3.exoplayer.analytics.AnalyticsListener) obj).onDrmSessionReleased(this.f16525i);
                break;
        }
    }
}
