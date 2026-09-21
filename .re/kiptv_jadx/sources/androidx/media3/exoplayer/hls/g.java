package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16663i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16665l;

    public /* synthetic */ g(int i3, int i9, int i10, java.lang.Object obj, java.lang.Object obj2) {
        this.f16662h = i10;
        this.f16665l = obj;
        this.f16663i = obj2;
        this.j = i3;
        this.f16664k = i9;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(java.lang.Object obj) {
        androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener listener = (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj;
        switch (this.f16662h) {
            case 0:
                listener.onAdCompleted((androidx.media3.common.MediaItem) this.f16665l, this.f16663i, this.j, this.f16664k);
                break;
            default:
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.lambda$handlePrepareComplete$2((androidx.media3.exoplayer.source.ads.AdsMediaSource) this.f16665l, this.f16663i, this.j, this.f16664k, listener);
                break;
        }
    }
}
