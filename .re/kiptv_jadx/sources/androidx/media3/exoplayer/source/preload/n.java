package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.preload.PreCacheHelper.DownloadCallback f16777i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ n(androidx.media3.exoplayer.source.preload.PreCacheHelper.DownloadCallback downloadCallback, java.lang.Object obj, int i3) {
        this.f16776h = i3;
        this.f16777i = downloadCallback;
        this.j = obj;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(java.lang.Object obj) {
        androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener listener = (androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener) obj;
        switch (this.f16776h) {
            case 0:
                this.f16777i.lambda$onPrepared$0((androidx.media3.common.MediaItem) this.j, listener);
                break;
            default:
                this.f16777i.lambda$onDownloadProgress$4((androidx.media3.exoplayer.source.preload.PreCacheHelper.Task) this.j, listener);
                break;
        }
    }
}
