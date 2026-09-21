package com.google.common.util.concurrent;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

public class L extends AbstractExecutorService implements K, AutoCloseable {

    public final ExecutorService f19415h;

    public L(ExecutorService executorService) {
        executorService.getClass();
        this.f19415h = executorService;
    }

    @Override
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f19415h.awaitTermination(j, timeUnit);
    }

    public final J b(Callable callable) {
        return (J) super.submit(callable);
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
    public final void execute(Runnable runnable) {
        this.f19415h.execute(runnable);
    }

    @Override
    public final boolean isShutdown() {
        return this.f19415h.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.f19415h.isTerminated();
    }

    @Override
    public final RunnableFuture newTaskFor(Callable callable) {
        return new T(callable);
    }

    @Override
    public final void shutdown() {
        this.f19415h.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return this.f19415h.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return (J) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + this.f19415h + "]";
    }

    @Override
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new T(Executors.callable(runnable, obj));
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return (J) super.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return (J) super.submit(callable);
    }
}
