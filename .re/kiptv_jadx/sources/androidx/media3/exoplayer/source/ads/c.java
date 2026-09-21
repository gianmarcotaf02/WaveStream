package androidx.media3.exoplayer.source.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16726i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ c(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16725h = i3;
        this.f16726i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16725h) {
            case 0:
                ((androidx.media3.exoplayer.source.ads.AdsMediaSource.AdPrepareListener) this.f16726i).lambda$onPrepareComplete$0((androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) this.j);
                break;
            case 1:
                ((androidx.media3.exoplayer.source.ads.AdsMediaSource.ComponentListener) this.f16726i).lambda$onAdPlaybackState$0((androidx.media3.common.AdPlaybackState) this.j);
                break;
            default:
                ((androidx.media3.exoplayer.source.ads.AdsMediaSource) this.f16726i).lambda$onChildSourceInfoRefreshed$2((androidx.media3.common.Timeline) this.j);
                break;
        }
    }
}
