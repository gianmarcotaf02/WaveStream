package com.google.common.util.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class M extends p076i4.P implements ScheduledFuture, J, Future {

    public final AbstractC1902q f19416h;

    public final ScheduledFuture f19417i;

    public M(AbstractC1902q abstractC1902q, ScheduledFuture scheduledFuture) {
        this.f19416h = abstractC1902q;
        this.f19417i = scheduledFuture;
    }

    @Override
    public final void addListener(Runnable runnable, Executor executor) {
        this.f19416h.addListener(runnable, executor);
    }

    public final boolean b(boolean z6) {
        return this.f19416h.cancel(z6);
    }

    @Override
    public final boolean cancel(boolean z6) {
        boolean zB = b(z6);
        if (zB) {
            this.f19417i.cancel(z6);
        }
        return zB;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f19417i.compareTo(delayed);
    }

    @Override
    public final Object delegate() {
        return this.f19416h;
    }

    @Override
    public final Object get() {
        return this.f19416h.get();
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f19417i.getDelay(timeUnit);
    }

    @Override
    public final boolean isCancelled() {
        return this.f19416h.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.f19416h.isDone();
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f19416h.get(j, timeUnit);
    }
}
