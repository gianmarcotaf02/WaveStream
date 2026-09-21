package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16572i;
    public final /* synthetic */ androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig j;

    public /* synthetic */ s(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.exoplayer.audio.AudioSink.AudioTrackConfig audioTrackConfig, int i3) {
        this.f16571h = i3;
        this.f16572i = eventTime;
        this.j = audioTrackConfig;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16571h) {
            case 0:
                analyticsListener.onAudioTrackInitialized(this.f16572i, this.j);
                break;
            default:
                analyticsListener.onAudioTrackReleased(this.f16572i, this.j);
                break;
        }
    }
}
