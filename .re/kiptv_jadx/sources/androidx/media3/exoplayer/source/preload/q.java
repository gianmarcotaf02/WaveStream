package androidx.media3.exoplayer.source.preload;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.preload.PreCacheHelper.ReleasableExecutorSupplier f16783i;

    public /* synthetic */ q(androidx.media3.exoplayer.source.preload.PreCacheHelper.ReleasableExecutorSupplier releasableExecutorSupplier, int i3) {
        this.f16782h = i3;
        this.f16783i = releasableExecutorSupplier;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16782h) {
            case 0:
                this.f16783i.lambda$onExecutorReleased$0();
                break;
            default:
                this.f16783i.onExecutorReleased();
                break;
        }
    }
}
