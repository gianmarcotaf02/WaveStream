package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16779i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ o(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16778h = i3;
        this.f16779i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16778h) {
            case 0:
                ((androidx.media3.exoplayer.source.preload.PreCacheHelper.DownloadCallback) this.f16779i).lambda$notifyListeners$6((androidx.media3.common.util.Consumer) this.j);
                break;
            default:
                ((androidx.media3.exoplayer.source.preload.PreloadMediaSource) this.f16779i).lambda$onChildSourceInfoRefreshed$2((androidx.media3.common.Timeline) this.j);
                break;
        }
    }
}
