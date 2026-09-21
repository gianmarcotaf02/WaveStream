package com.google.android.gms.internal.cast;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class ScheduledFutureC1782p2 extends H implements ScheduledFuture, com.google.common.util.concurrent.J, Future {

    public final AbstractC1750h2 f19020k;

    public final ScheduledFuture f19021l;

    public ScheduledFutureC1782p2(AbstractC1750h2 abstractC1750h2, ScheduledFuture scheduledFuture) {
        super(6);
        this.f19020k = abstractC1750h2;
        this.f19021l = scheduledFuture;
    }

    @Override
    public final void addListener(Runnable runnable, Executor executor) {
        this.f19020k.addListener(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z6) {
        boolean zCancel = this.f19020k.cancel(z6);
        if (zCancel) {
            this.f19021l.cancel(z6);
        }
        return zCancel;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.f19021l.compareTo(delayed);
    }

    @Override
    public final Object get() {
        return this.f19020k.get();
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.f19021l.getDelay(timeUnit);
    }

    @Override
    public final boolean isCancelled() {
        return this.f19020k.f18922k instanceof Y1;
    }

    @Override
    public final boolean isDone() {
        return this.f19020k.isDone();
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f19020k.get(j, timeUnit);
    }
}
