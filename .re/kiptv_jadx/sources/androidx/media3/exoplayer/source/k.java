package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16746i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ k(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16745h = i3;
        this.f16746i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16745h) {
            case 0:
                ((androidx.media3.exoplayer.source.ProgressiveMediaPeriod) this.f16746i).lambda$seekMap$1((androidx.media3.extractor.SeekMap) this.j);
                break;
            default:
                ((androidx.media3.common.util.Consumer) this.f16746i).accept((androidx.media3.exoplayer.source.MediaSourceEventListener) this.j);
                break;
        }
    }
}
