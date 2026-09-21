package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements androidx.media3.common.util.Consumer, androidx.media3.exoplayer.PlayerMessage.Target {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16651h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16652i;

    public /* synthetic */ b(int i3, java.lang.Object obj) {
        this.f16651h = i3;
        this.f16652i = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(java.lang.Object obj) {
        switch (this.f16651h) {
            case 0:
                androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.lambda$startLoadingAssetList$5((androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.AssetListData) this.f16652i, (androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj);
                break;
            default:
                ((androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.LoaderCallback) this.f16652i).lambda$onLoadCompleted$0((androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.Listener) obj);
                break;
        }
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i3, java.lang.Object obj) {
        ((androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader.RunnableAtPosition) this.f16652i).run();
    }
}
