package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16667i;
    public final /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16670m;

    public /* synthetic */ h(java.lang.Object obj, java.lang.Object obj2, int i3, int i9, java.lang.Object obj3, int i10) {
        this.f16666h = i10;
        this.f16669l = obj;
        this.f16667i = obj2;
        this.j = i3;
        this.f16668k = i9;
        this.f16670m = obj3;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.f16666h) {
            case 0:
                ((androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj).onMetadata((androidx.media3.common.MediaItem) this.f16669l, this.f16667i, this.j, this.f16668k, (androidx.media3.common.Metadata) this.f16670m);
                break;
            default:
                androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource = (androidx.media3.exoplayer.source.ads.AdsMediaSource) this.f16669l;
                int i3 = this.j;
                int i9 = this.f16668k;
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.lambda$handlePrepareError$3(adsMediaSource, this.f16667i, i3, i9, (java.io.IOException) this.f16670m, (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj);
                break;
        }
    }
}
