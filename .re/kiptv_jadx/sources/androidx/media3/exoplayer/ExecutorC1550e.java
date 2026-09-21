package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExecutorC1550e implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16639h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16640i;

    public /* synthetic */ ExecutorC1550e(int i3, java.lang.Object obj) {
        this.f16639h = i3;
        this.f16640i = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.f16639h) {
            case 0:
                ((androidx.media3.common.util.BackgroundThreadStateHandler) this.f16640i).runInBackground(runnable);
                break;
            default:
                ((androidx.media3.common.util.HandlerWrapper) this.f16640i).post(runnable);
                break;
        }
    }
}
