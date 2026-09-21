package androidx.media3.exoplayer.source.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.ads.AdsMediaSource f16721i;
    public final /* synthetic */ androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener j;

    public /* synthetic */ a(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener componentListener, int i3) {
        this.f16720h = i3;
        this.f16721i = adsMediaSource;
        this.j = componentListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16720h) {
            case 0:
                this.f16721i.lambda$prepareSourceInternal$0(this.j);
                break;
            default:
                this.f16721i.lambda$releaseSourceInternal$1(this.j);
                break;
        }
    }
}
