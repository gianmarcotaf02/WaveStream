package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadMediaPeriodCallback f16790i;
    public final /* synthetic */ androidx.media3.exoplayer.source.MediaPeriod j;

    public /* synthetic */ t(androidx.media3.exoplayer.source.preload.PreloadMediaSource.PreloadMediaPeriodCallback preloadMediaPeriodCallback, androidx.media3.exoplayer.source.MediaPeriod mediaPeriod, int i3) {
        this.f16789h = i3;
        this.f16790i = preloadMediaPeriodCallback;
        this.j = mediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16789h) {
            case 0:
                this.f16790i.lambda$onPrepared$0(this.j);
                break;
            default:
                this.f16790i.lambda$onContinueLoadingRequested$1(this.j);
                break;
        }
    }
}
