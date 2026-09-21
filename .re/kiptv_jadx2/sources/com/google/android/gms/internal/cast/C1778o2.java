package com.google.android.gms.internal.cast;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

public class C1778o2 extends AbstractExecutorService implements InterfaceExecutorServiceC1774n2, AutoCloseable {

    public final ExecutorService f19017h;

    public C1778o2(ExecutorService executorService) {
        executorService.getClass();
        this.f19017h = executorService;
    }

    @Override
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f19017h.awaitTermination(j, timeUnit);
    }

    @Override
    public void close() {
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
    public final void execute(Runnable runnable) {
        this.f19017h.execute(runnable);
    }

    @Override
    public final boolean isShutdown() {
        return this.f19017h.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.f19017h.isTerminated();
    }

    @Override
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC1797t2(Executors.callable(runnable, obj));
    }

    @Override
    public final void shutdown() {
        this.f19017h.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return this.f19017h.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return (com.google.common.util.concurrent.J) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + String.valueOf(this.f19017h) + "]";
    }

    @Override
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC1797t2(callable);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return (com.google.common.util.concurrent.J) super.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return (com.google.common.util.concurrent.J) super.submit(callable);
    }
}
