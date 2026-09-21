package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16543i;
    public final /* synthetic */ java.lang.Exception j;

    public /* synthetic */ i(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, java.lang.Exception exc, int i3) {
        this.f16542h = i3;
        this.f16543i = eventTime;
        this.j = exc;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16542h) {
            case 0:
                analyticsListener.onVideoCodecError(this.f16543i, this.j);
                break;
            case 1:
                analyticsListener.onDrmSessionManagerError(this.f16543i, this.j);
                break;
            case 2:
                analyticsListener.onAudioCodecError(this.f16543i, this.j);
                break;
            default:
                analyticsListener.onAudioSinkError(this.f16543i, this.j);
                break;
        }
    }
}
