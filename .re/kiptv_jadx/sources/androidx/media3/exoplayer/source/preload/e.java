package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16763i;

    public /* synthetic */ e(int i3, java.lang.Object obj) {
        this.f16762h = i3;
        this.f16763i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        switch (this.f16762h) {
            case 0:
                ((androidx.media3.exoplayer.source.preload.DefaultPreloadManager) this.f16763i).lambda$releasePreloadUtils$2();
                break;
            default:
                ((androidx.media3.exoplayer.source.preload.PreCacheHelper) this.f16763i).lambda$stop$1();
                break;
        }
    }
}
