package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16527i;
    public final /* synthetic */ androidx.media3.exoplayer.DecoderCounters j;

    public /* synthetic */ b(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.DecoderCounters decoderCounters, int i3) {
        this.f16526h = i3;
        this.f16527i = eventTime;
        this.j = decoderCounters;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16526h) {
            case 0:
                analyticsListener.onAudioEnabled(this.f16527i, this.j);
                break;
            case 1:
                analyticsListener.onAudioDisabled(this.f16527i, this.j);
                break;
            case 2:
                analyticsListener.onVideoDisabled(this.f16527i, this.j);
                break;
            default:
                analyticsListener.onVideoEnabled(this.f16527i, this.j);
                break;
        }
    }
}
