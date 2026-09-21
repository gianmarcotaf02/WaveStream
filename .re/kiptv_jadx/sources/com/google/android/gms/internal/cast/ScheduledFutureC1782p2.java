package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ScheduledFutureC1782p2 extends com.google.android.gms.internal.cast.H implements java.util.concurrent.ScheduledFuture, com.google.common.util.concurrent.J, java.util.concurrent.Future {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.AbstractC1750h2 f19020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ScheduledFuture f19021l;

    public ScheduledFutureC1782p2(com.google.android.gms.internal.cast.AbstractC1750h2 abstractC1750h2, java.util.concurrent.ScheduledFuture scheduledFuture) {
        super(6);
        this.f19020k = abstractC1750h2;
        this.f19021l = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.J
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f19020k.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        boolean zCancel = this.f19020k.cancel(z6);
        if (zCancel) {
            this.f19021l.cancel(z6);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.util.concurrent.Delayed delayed) {
        return this.f19021l.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f19020k.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.f19021l.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19020k.f18922k instanceof com.google.android.gms.internal.cast.Y1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19020k.isDone();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.f19020k.get(j, timeUnit);
    }
}
