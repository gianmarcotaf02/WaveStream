package p075i2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f22760b;

    public b(int i3) {
        this.f22759a = i3;
        switch (i3) {
            case 1:
                this.f22760b = new java.util.concurrent.atomic.AtomicInteger(0);
                break;
            default:
                this.f22760b = new java.util.concurrent.atomic.AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        switch (this.f22759a) {
            case 0:
                return new java.lang.Thread(runnable, "ModernAsyncTask #" + this.f22760b.getAndIncrement());
            default:
                java.lang.Thread thread = new java.lang.Thread(runnable);
                thread.setName("arch_disk_io_" + this.f22760b.getAndIncrement());
                return thread;
        }
    }
}
