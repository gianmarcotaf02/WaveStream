package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1778o2 extends java.util.concurrent.AbstractExecutorService implements com.google.android.gms.internal.cast.InterfaceExecutorServiceC1774n2, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f19017h;

    public C1778o2(java.util.concurrent.ExecutorService executorService) {
        executorService.getClass();
        this.f19017h = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.f19017h.awaitTermination(j, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == java.util.concurrent.ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z6 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, java.util.concurrent.TimeUnit.DAYS);
            } catch (java.lang.InterruptedException unused) {
                if (!z6) {
                    shutdownNow();
                    z6 = true;
                }
            }
        }
        if (z6) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f19017h.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f19017h.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f19017h.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return new com.google.android.gms.internal.cast.RunnableFutureC1797t2(java.util.concurrent.Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f19017h.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        return this.f19017h.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return (com.google.common.util.concurrent.J) super.submit(runnable);
    }

    public final java.lang.String toString() {
        return super.toString() + "[" + java.lang.String.valueOf(this.f19017h) + "]";
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final java.util.concurrent.RunnableFuture newTaskFor(java.util.concurrent.Callable callable) {
        return new com.google.android.gms.internal.cast.RunnableFutureC1797t2(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return (com.google.common.util.concurrent.J) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return (com.google.common.util.concurrent.J) super.submit(callable);
    }
}
