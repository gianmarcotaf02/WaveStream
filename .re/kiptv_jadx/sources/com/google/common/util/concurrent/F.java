package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public final class F implements com.google.common.util.concurrent.J {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.common.util.concurrent.F f19407i = new com.google.common.util.concurrent.F(null);
    public static final com.google.common.util.concurrent.I j = new com.google.common.util.concurrent.I(com.google.common.util.concurrent.F.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f19408h;

    public F(java.lang.Object obj) {
        this.f19408h = obj;
    }

    @Override // com.google.common.util.concurrent.J
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        com.google.android.gms.internal.play_billing.AbstractC1864o0.U(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e6) {
            j.a().log(java.util.logging.Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (java.lang.Throwable) e6);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f19408h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final java.lang.String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f19408h + "]]";
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j9, java.util.concurrent.TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f19408h;
    }
}
