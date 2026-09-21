package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p076i4.P implements java.util.concurrent.ScheduledFuture, com.google.common.util.concurrent.J, java.util.concurrent.Future {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.common.util.concurrent.AbstractC1902q f19416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ScheduledFuture f19417i;

    public M(com.google.common.util.concurrent.AbstractC1902q abstractC1902q, java.util.concurrent.ScheduledFuture scheduledFuture) {
        this.f19416h = abstractC1902q;
        this.f19417i = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.J
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f19416h.addListener(runnable, executor);
    }

    public final boolean b(boolean z6) {
        return this.f19416h.cancel(z6);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean zB = b(z6);
        if (zB) {
            this.f19417i.cancel(z6);
        }
        return zB;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.util.concurrent.Delayed delayed) {
        return this.f19417i.compareTo(delayed);
    }

    @Override // p076i4.P
    public final java.lang.Object delegate() {
        return this.f19416h;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f19416h.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.f19417i.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19416h.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19416h.isDone();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.f19416h.get(j, timeUnit);
    }
}
