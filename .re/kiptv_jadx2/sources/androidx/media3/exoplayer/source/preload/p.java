package androidx.media3.exoplayer.source.preload;

public final class p implements Runnable {

    public final int f16780h;

    public final PreCacheHelper.DownloadCallback f16781i;
    public final PreCacheHelper.Task j;

    public p(PreCacheHelper.DownloadCallback downloadCallback, PreCacheHelper.Task task, int i3) {
        this.f16780h = i3;
        this.f16781i = downloadCallback;
        this.j = task;
    }

    @Override
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
