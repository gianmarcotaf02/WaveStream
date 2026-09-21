package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16765i;

    public /* synthetic */ g(int i3, java.lang.Object obj) {
        this.f16764h = i3;
        this.f16765i = obj;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16764h) {
            case 0:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder.lambda$setLoadControl$3((androidx.media3.exoplayer.LoadControl) this.f16765i);
            case 1:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder.lambda$setRenderersFactory$2((androidx.media3.exoplayer.RenderersFactory) this.f16765i);
            default:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.Builder.lambda$setBandwidthMeter$4((androidx.media3.exoplayer.upstream.BandwidthMeter) this.f16765i);
        }
    }
}
