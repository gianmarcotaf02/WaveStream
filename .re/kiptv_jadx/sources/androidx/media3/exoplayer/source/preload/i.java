package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements p068h4.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus f16769i;

    public /* synthetic */ i(androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus, int i3) {
        this.f16768h = i3;
        this.f16769i = preloadStatus;
    }

    @Override // p068h4.l
    public final boolean apply(java.lang.Object obj) {
        switch (this.f16768h) {
            case 0:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreCacheHelperListener.lambda$onPrepareError$1(this.f16769i, (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus) obj);
            case 1:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreCacheHelperListener.lambda$onPreCacheProgress$0(this.f16769i, (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus) obj);
            case 2:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreCacheHelperListener.lambda$onDownloadError$2(this.f16769i, (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus) obj);
            case 3:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceControl.lambda$onUsedByPlayer$3(this.f16769i, (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus) obj);
            case 4:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceControl.lambda$onPreloadError$5(this.f16769i, (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus) obj);
            case 5:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceControl.lambda$onLoadedToTheEndOfSource$4(this.f16769i, (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus) obj);
            default:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceControl.lambda$continueOrCompletePreloading$6(this.f16769i, (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus) obj);
        }
    }
}
