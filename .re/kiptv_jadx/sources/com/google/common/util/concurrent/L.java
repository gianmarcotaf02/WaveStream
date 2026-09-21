package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public class L extends java.util.concurrent.AbstractExecutorService implements com.google.common.util.concurrent.K, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f19415h;

    public L(java.util.concurrent.ExecutorService executorService) {
        executorService.getClass();
        this.f19415h = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.f19415h.awaitTermination(j, timeUnit);
    }

    public final com.google.common.util.concurrent.J b(java.util.concurrent.Callable callable) {
        return (com.google.common.util.concurrent.J) super.submit(callable);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
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
        this.f19415h.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f19415h.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f19415h.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final java.util.concurrent.RunnableFuture newTaskFor(java.util.concurrent.Callable callable) {
        return new com.google.common.util.concurrent.T(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f19415h.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        return this.f19415h.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable) {
        return (com.google.common.util.concurrent.J) super.submit(runnable);
    }

    public final java.lang.String toString() {
        return super.toString() + "[" + this.f19415h + "]";
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return new com.google.common.util.concurrent.T(java.util.concurrent.Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return (com.google.common.util.concurrent.J) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final java.util.concurrent.Future submit(java.util.concurrent.Callable callable) {
        return (com.google.common.util.concurrent.J) super.submit(callable);
    }
}
