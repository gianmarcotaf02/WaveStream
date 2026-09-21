package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16787i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16788k;

    public /* synthetic */ s(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        this.f16786h = i3;
        this.f16787i = obj;
        this.j = obj2;
        this.f16788k = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16786h) {
            case 0:
                ((androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadMediaPeriodCallback) this.f16787i).lambda$maybeContinueLoading$2((androidx.media3.exoplayer.source.MediaPeriod) this.j, (androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) this.f16788k);
                break;
            case 1:
                ((androidx.media3.exoplayer.source.preload.BasePreloadManager) this.f16787i).lambda$onMediaSourceUpdated$9((androidx.media3.common.MediaItem) this.j, (androidx.media3.exoplayer.source.MediaSource) this.f16788k);
                break;
            default:
                ((androidx.media3.exoplayer.source.preload.BasePreloadManager) this.f16787i).lambda$onCompleted$3((androidx.media3.common.MediaItem) this.j, (p068h4.l) this.f16788k);
                break;
        }
    }
}
