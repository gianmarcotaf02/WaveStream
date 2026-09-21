package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.preload.PreCacheHelper.DownloadCallback f16775i;
    public final /* synthetic */ java.io.IOException j;

    public /* synthetic */ m(androidx.media3.exoplayer.source.preload.PreCacheHelper.DownloadCallback downloadCallback, java.io.IOException iOException, int i3) {
        this.f16774h = i3;
        this.f16775i = downloadCallback;
        this.j = iOException;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.f16774h) {
            case 0:
                this.f16775i.lambda$onDownloadStopped$2(this.j, (androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener) obj);
                break;
            default:
                this.f16775i.lambda$onPrepareError$1(this.j, (androidx.media3.exoplayer.source.preload.PreCacheHelper.Listener) obj);
                break;
        }
    }
}
