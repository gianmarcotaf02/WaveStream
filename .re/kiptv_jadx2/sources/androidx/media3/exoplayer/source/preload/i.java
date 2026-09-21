package androidx.media3.exoplayer.source.preload;

public final class i implements p068h4.l {

    public final int f16768h;

    public final DefaultPreloadManager.PreloadStatus f16769i;

    public i(DefaultPreloadManager.PreloadStatus preloadStatus, int i3) {
        this.f16768h = i3;
        this.f16769i = preloadStatus;
    }

    @Override
    public final boolean apply(Object obj) {
        switch (this.f16768h) {
            case 0:
                return DefaultPreloadManager.PreCacheHelperListener.lambda$onPrepareError$1(this.f16769i, (DefaultPreloadManager.PreloadStatus) obj);
            case 1:
                return DefaultPreloadManager.PreCacheHelperListener.lambda$onPreCacheProgress$0(this.f16769i, (DefaultPreloadManager.PreloadStatus) obj);
            case 2:
                return DefaultPreloadManager.PreCacheHelperListener.lambda$onDownloadError$2(this.f16769i, (DefaultPreloadManager.PreloadStatus) obj);
            case 3:
                return DefaultPreloadManager.PreloadMediaSourceControl.lambda$onUsedByPlayer$3(this.f16769i, (DefaultPreloadManager.PreloadStatus) obj);
            case 4:
                return DefaultPreloadManager.PreloadMediaSourceControl.lambda$onPreloadError$5(this.f16769i, (DefaultPreloadManager.PreloadStatus) obj);
            case 5:
                return DefaultPreloadManager.PreloadMediaSourceControl.lambda$onLoadedToTheEndOfSource$4(this.f16769i, (DefaultPreloadManager.PreloadStatus) obj);
            default:
                return DefaultPreloadManager.PreloadMediaSourceControl.lambda$continueOrCompletePreloading$6(this.f16769i, (DefaultPreloadManager.PreloadStatus) obj);
        }
    }
}
