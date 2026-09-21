package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16686i;
    public final /* synthetic */ java.lang.Object j;

    public /* synthetic */ a(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f16685h = i3;
        this.f16686i = obj;
        this.j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16685h) {
            case 0:
                ((androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter) this.f16686i).lambda$useInputBuffer$0((java.lang.Runnable) this.j);
                break;
            default:
                ((androidx.media3.exoplayer.mediacodec.MediaCodecRenderer) this.f16686i).lambda$feedInputBuffer$0((androidx.media3.exoplayer.FormatHolder) this.j);
                break;
        }
    }
}
