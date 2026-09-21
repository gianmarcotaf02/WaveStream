package androidx.media3.exoplayer.source.preload;

public final class j implements p068h4.l {

    public final int f16770h;

    public j(int i3) {
        this.f16770h = i3;
    }

    @Override
    public final boolean apply(Object obj) {
        DefaultPreloadManager.PreloadStatus preloadStatus = (DefaultPreloadManager.PreloadStatus) obj;
        switch (this.f16770h) {
            case 0:
                return DefaultPreloadManager.PreloadMediaSourceControl.lambda$onSourcePrepared$0(preloadStatus);
            case 1:
                return DefaultPreloadManager.PreloadMediaSourceControl.lambda$onTracksSelected$1(preloadStatus);
            default:
                return DefaultPreloadManager.lambda$preloadMediaSourceHolderInternal$1(preloadStatus);
        }
    }
}
