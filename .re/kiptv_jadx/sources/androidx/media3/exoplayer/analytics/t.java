package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements androidx.media3.common.util.ListenerSet.Event {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime f16574i;
    public final /* synthetic */ androidx.media3.common.MediaMetadata j;

    public /* synthetic */ t(androidx.media3.exoplayer.analytics.AnalyticsListener.EventTime eventTime, androidx.media3.common.MediaMetadata mediaMetadata, int i3) {
        this.f16573h = i3;
        this.f16574i = eventTime;
        this.j = mediaMetadata;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public final void invoke(java.lang.Object obj) {
        androidx.media3.exoplayer.analytics.AnalyticsListener analyticsListener = (androidx.media3.exoplayer.analytics.AnalyticsListener) obj;
        switch (this.f16573h) {
            case 0:
                analyticsListener.onPlaylistMetadataChanged(this.f16574i, this.j);
                break;
            default:
                analyticsListener.onMediaMetadataChanged(this.f16574i, this.j);
                break;
        }
    }
}
