package A1;

/* JADX INFO: loaded from: classes.dex */
public final class m implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f155h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.os.Handler f156i;

    public /* synthetic */ m(android.os.Handler handler, int i3) {
        this.f155h = i3;
        this.f156i = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.f155h) {
            case 0:
                runnable.getClass();
                android.os.Handler handler = this.f156i;
                if (handler.post(runnable)) {
                    return;
                }
                throw new java.util.concurrent.RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                android.os.Handler handler2 = this.f156i;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new java.util.concurrent.RejectedExecutionException(handler2 + " is shutting down");
        }
    }
}
