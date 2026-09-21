package androidx.media3.exoplayer.source.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16723i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16724k;

    public /* synthetic */ b(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i3) {
        this.f16722h = i3;
        this.f16723i = obj;
        this.j = obj2;
        this.f16724k = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16722h) {
            case 0:
                ((androidx.media3.exoplayer.source.ads.AdsMediaSource.AdPrepareListener) this.f16723i).lambda$onPrepareError$1((androidx.media3.exoplayer.source.MediaSource.MediaPeriodId) this.j, (java.io.IOException) this.f16724k);
                break;
            default:
                ((androidx.media3.exoplayer.source.ads.ServerSideAdInsertionMediaSource) this.f16723i).lambda$setAdPlaybackStates$0((p076i4.AbstractC2194f0) this.j, (androidx.media3.common.Timeline) this.f16724k);
                break;
        }
    }
}
