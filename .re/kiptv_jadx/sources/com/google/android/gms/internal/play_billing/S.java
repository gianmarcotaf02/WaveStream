package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class S implements com.google.android.gms.internal.play_billing.U {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.android.gms.internal.play_billing.T f19282i = new com.google.android.gms.internal.play_billing.T(com.google.android.gms.internal.play_billing.S.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f19283h;

    public S(java.lang.Object obj) {
        this.f19283h = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.U
    public final void a(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        if (executor == null) {
            throw new java.lang.NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (java.lang.Exception e6) {
            f19282i.a().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", B2.a.m("RuntimeException while executing runnable ", runnable.toString(), " with executor ", java.lang.String.valueOf(executor)), (java.lang.Throwable) e6);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f19283h;
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
        return super.toString() + "[status=SUCCESS, result=[" + this.f19283h.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f19283h;
    }
}
