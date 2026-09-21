package F3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f3619i;

    public /* synthetic */ q(int i3, java.lang.Object obj) {
        this.f3618h = i3;
        this.f3619i = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        switch (this.f3618h) {
            case 0:
                ((Z3.d) this.f3619i).post(runnable);
                break;
            case 1:
                ((java.util.concurrent.ExecutorService) this.f3619i).execute(new B3.r(10, runnable));
                break;
            default:
                ((Z3.d) this.f3619i).post(runnable);
                break;
        }
    }

    public q() {
        this.f3618h = 2;
        Z3.d dVar = new Z3.d(android.os.Looper.getMainLooper(), 3, false);
        android.os.Looper.getMainLooper();
        this.f3619i = dVar;
    }
}
