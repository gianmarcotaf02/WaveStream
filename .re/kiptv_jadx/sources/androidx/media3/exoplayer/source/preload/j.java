package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements p068h4.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16770h;

    public /* synthetic */ j(int i3) {
        this.f16770h = i3;
    }

    @Override // p068h4.l
    public final boolean apply(java.lang.Object obj) {
        androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus preloadStatus = (androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadStatus) obj;
        switch (this.f16770h) {
            case 0:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceControl.lambda$onSourcePrepared$0(preloadStatus);
            case 1:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.PreloadMediaSourceControl.lambda$onTracksSelected$1(preloadStatus);
            default:
                return androidx.media3.exoplayer.source.preload.DefaultPreloadManager.lambda$preloadMediaSourceHolderInternal$1(preloadStatus);
        }
    }
}
