package p130p3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends java.lang.Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f26187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f26188i;
    public final java.util.concurrent.CountDownLatch j = new java.util.concurrent.CountDownLatch(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f26189k = false;

    public c(p130p3.a aVar, long j) {
        this.f26187h = new java.lang.ref.WeakReference(aVar);
        this.f26188i = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        p130p3.a aVar;
        java.lang.ref.WeakReference weakReference = this.f26187h;
        try {
            if (this.j.await(this.f26188i, java.util.concurrent.TimeUnit.MILLISECONDS) || (aVar = (p130p3.a) weakReference.get()) == null) {
                return;
            }
            aVar.c();
            this.f26189k = true;
        } catch (java.lang.InterruptedException unused) {
            p130p3.a aVar2 = (p130p3.a) weakReference.get();
            if (aVar2 != null) {
                aVar2.c();
                this.f26189k = true;
            }
        }
    }
}
