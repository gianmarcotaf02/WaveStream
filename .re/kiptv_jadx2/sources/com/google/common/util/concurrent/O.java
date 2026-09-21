package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class O extends L implements ScheduledExecutorService {

    public final ScheduledExecutorService f19419i;

    public O(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f19419i = scheduledExecutorService;
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        T t9 = new T(callable);
        return new M(t9, this.f19419i.schedule(t9, j, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j9, TimeUnit timeUnit) {
        N n3 = new N(runnable);
        return new M(n3, this.f19419i.scheduleAtFixedRate(n3, j, j9, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j9, TimeUnit timeUnit) {
        N n3 = new N(runnable);
        return new M(n3, this.f19419i.scheduleWithFixedDelay(n3, j, j9, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        T t9 = new T(Executors.callable(runnable, null));
        return new M(t9, this.f19419i.schedule(t9, j, timeUnit));
    }
}
