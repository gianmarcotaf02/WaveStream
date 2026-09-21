package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class ScheduledExecutorServiceC1789r2 extends C1778o2 implements ScheduledExecutorService {

    public final ScheduledExecutorService f19057i;

    public ScheduledExecutorServiceC1789r2(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f19057i = scheduledExecutorService;
    }

    @Override
    public final void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z6 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z6) {
                    shutdownNow();
                    z6 = true;
                }
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        RunnableFutureC1797t2 runnableFutureC1797t2 = new RunnableFutureC1797t2(Executors.callable(runnable, null));
        return new ScheduledFutureC1782p2(runnableFutureC1797t2, this.f19057i.schedule(runnableFutureC1797t2, j, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j9, TimeUnit timeUnit) {
        RunnableC1786q2 runnableC1786q2 = new RunnableC1786q2(runnable);
        return new ScheduledFutureC1782p2(runnableC1786q2, this.f19057i.scheduleAtFixedRate(runnableC1786q2, j, j9, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j9, TimeUnit timeUnit) {
        RunnableC1786q2 runnableC1786q2 = new RunnableC1786q2(runnable);
        return new ScheduledFutureC1782p2(runnableC1786q2, this.f19057i.scheduleWithFixedDelay(runnableC1786q2, j, j9, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        RunnableFutureC1797t2 runnableFutureC1797t2 = new RunnableFutureC1797t2(callable);
        return new ScheduledFutureC1782p2(runnableFutureC1797t2, this.f19057i.schedule(runnableFutureC1797t2, j, timeUnit));
    }
}
