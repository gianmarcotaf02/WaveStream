package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.preload.PreCacheHelper.DownloadCallback f16781i;
    public final /* synthetic */ androidx.media3.exoplayer.source.preload.PreCacheHelper.Task j;

    public /* synthetic */ p(androidx.media3.exoplayer.source.preload.PreCacheHelper.DownloadCallback downloadCallback, androidx.media3.exoplayer.source.preload.PreCacheHelper.Task task, int i3) {
        this.f16780h = i3;
        this.f16781i = downloadCallback;
        this.j = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16780h) {
            case 0:
                this.f16781i.lambda$onDownloadProgress$5(this.j);
                break;
            default:
                this.f16781i.lambda$onDownloadStopped$3(this.j);
                break;
        }
    }
}
