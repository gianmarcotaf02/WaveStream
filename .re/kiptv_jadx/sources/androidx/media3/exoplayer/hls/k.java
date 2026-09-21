package androidx.media3.exoplayer.hls;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16672i;

    public /* synthetic */ k(int i3, java.lang.Object obj) {
        this.f16671h = i3;
        this.f16672i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16671h) {
            case 0:
                ((androidx.media3.exoplayer.hls.HlsSampleStreamWrapper) this.f16672i).maybeFinishPrepare();
                break;
            case 1:
                ((androidx.media3.exoplayer.hls.HlsSampleStreamWrapper) this.f16672i).onTracksEnded();
                break;
            default:
                ((androidx.media3.exoplayer.hls.HlsSampleStreamWrapper.Callback) this.f16672i).onPrepared();
                break;
        }
    }
}
