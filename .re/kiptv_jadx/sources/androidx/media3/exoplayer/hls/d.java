package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16656i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16657k;

    public /* synthetic */ d(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        this.f16655h = i3;
        this.f16656i = obj;
        this.j = obj2;
        this.f16657k = obj3;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.f16655h) {
            case 0:
                ((androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.LoaderCallback) this.f16656i).lambda$onLoadCompleted$1((androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetList) this.j, (android.util.Pair) this.f16657k, (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj);
                break;
            case 1:
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.lambda$handleContentTimelineChanged$1((androidx.media3.exoplayer.source.ads.AdsMediaSource) this.f16656i, this.j, (androidx.media3.common.Timeline) this.f16657k, (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj);
                break;
            default:
                ((androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj).onStart((androidx.media3.common.MediaItem) this.f16656i, this.j, (androidx.media3.common.AdViewProvider) this.f16657k);
                break;
        }
    }
}
