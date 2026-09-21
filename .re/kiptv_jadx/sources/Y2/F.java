package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class F implements java.util.concurrent.ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ThreadFactory f11375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f11376b;

    public F(Y2.C1033c c1033c) {
        java.util.Objects.requireNonNull(c1033c);
        this.f11375a = java.util.concurrent.Executors.defaultThreadFactory();
        this.f11376b = new java.util.concurrent.atomic.AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f11376b;
        java.lang.Thread threadNewThread = this.f11375a.newThread(runnable);
        threadNewThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
        return threadNewThread;
    }
}
