package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final class O extends com.google.common.util.concurrent.L implements java.util.concurrent.ScheduledExecutorService {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ScheduledExecutorService f19419i;

    public O(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f19419i = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.util.concurrent.Callable callable, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.util.concurrent.T t9 = new com.google.common.util.concurrent.T(callable);
        return new com.google.common.util.concurrent.M(t9, this.f19419i.schedule(t9, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleAtFixedRate(java.lang.Runnable runnable, long j, long j9, java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.util.concurrent.N n3 = new com.google.common.util.concurrent.N(runnable);
        return new com.google.common.util.concurrent.M(n3, this.f19419i.scheduleAtFixedRate(n3, j, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture scheduleWithFixedDelay(java.lang.Runnable runnable, long j, long j9, java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.util.concurrent.N n3 = new com.google.common.util.concurrent.N(runnable);
        return new com.google.common.util.concurrent.M(n3, this.f19419i.scheduleWithFixedDelay(n3, j, j9, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final java.util.concurrent.ScheduledFuture schedule(java.lang.Runnable runnable, long j, java.util.concurrent.TimeUnit timeUnit) {
        com.google.common.util.concurrent.T t9 = new com.google.common.util.concurrent.T(java.util.concurrent.Executors.callable(runnable, null));
        return new com.google.common.util.concurrent.M(t9, this.f19419i.schedule(t9, j, timeUnit));
    }
}
