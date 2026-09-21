package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledExecutorServiceC1789r2 extends com.google.android.gms.internal.cast.C1778o2 implements java.util.concurrent.ScheduledExecutorService {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f19057i;

    public ScheduledExecutorServiceC1789r2(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f19057i = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.cast.C1778o2, java.lang.AutoCloseable
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

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.cast.RunnableFutureC1797t2 runnableFutureC1797t2 = new com.google.android.gms.internal.cast.RunnableFutureC1797t2(java.util.concurrent.Executors.callable(runnable, null));
        return new com.google.android.gms.internal.cast.ScheduledFutureC1782p2(runnableFutureC1797t2, this.f19057i.schedule(runnableFutureC1797t2, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j9, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.cast.RunnableC1786q2 runnableC1786q2 = new com.google.android.gms.internal.cast.RunnableC1786q2(runnable);
        return new com.google.android.gms.internal.cast.ScheduledFutureC1782p2(runnableC1786q2, this.f19057i.scheduleAtFixedRate(runnableC1786q2, j, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j9, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.cast.RunnableC1786q2 runnableC1786q2 = new com.google.android.gms.internal.cast.RunnableC1786q2(runnable);
        return new com.google.android.gms.internal.cast.ScheduledFutureC1782p2(runnableC1786q2, this.f19057i.scheduleWithFixedDelay(runnableC1786q2, j, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.android.gms.internal.cast.RunnableFutureC1797t2 runnableFutureC1797t2 = new com.google.android.gms.internal.cast.RunnableFutureC1797t2(callable);
        return new com.google.android.gms.internal.cast.ScheduledFutureC1782p2(runnableFutureC1797t2, this.f19057i.schedule(runnableFutureC1797t2, j, timeUnit));
    }
}
