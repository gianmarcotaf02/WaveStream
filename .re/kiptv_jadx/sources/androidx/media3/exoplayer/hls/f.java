package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16661i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ f(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16660h = i3;
        this.f16661i = obj;
        this.j = obj2;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(java.lang.Object obj) {
        androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener = (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj;
        switch (this.f16660h) {
            case 0:
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.PlayerListener.lambda$onPlaybackStateChanged$4((androidx.media3.exoplayer.ExoPlayer) this.f16661i, this.j, listener);
                break;
            default:
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.lambda$stop$4((androidx.media3.exoplayer.source.ads.AdsMediaSource) this.f16661i, (androidx.media3.common.AdPlaybackState) this.j, listener);
                break;
        }
    }
}
