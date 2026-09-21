package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16784h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.preload.PreloadMediaSource f16785i;

    public /* synthetic */ r(androidx.media3.exoplayer.source.preload.PreloadMediaSource preloadMediaSource, int i3) {
        this.f16784h = i3;
        this.f16785i = preloadMediaSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16784h) {
            case 0:
                this.f16785i.lambda$releasePreloadMediaSource$3();
                break;
            case 1:
                this.f16785i.lambda$clear$1();
                break;
            default:
                this.f16785i.checkForPreloadError();
                break;
        }
    }
}
