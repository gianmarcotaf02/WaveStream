package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16704h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16705i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ e(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16704h = i3;
        this.f16705i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16704h) {
            case 0:
                ((androidx.media3.exoplayer.offline.DownloadService.DownloadManagerHelper) this.f16705i).lambda$attachService$0((androidx.media3.exoplayer.offline.DownloadService) this.j);
                break;
            case 1:
                ((androidx.media3.exoplayer.offline.DownloadHelper) this.f16705i).lambda$onMediaPreparationFailed$3((java.io.IOException) this.j);
                break;
            default:
                ((androidx.media3.exoplayer.offline.DownloadHelper) this.f16705i).lambda$prepare$1((androidx.media3.exoplayer.offline.DownloadHelper.Callback) this.j);
                break;
        }
    }
}
