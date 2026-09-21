package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class L1 implements com.google.android.gms.internal.play_billing.U {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f19258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.internal.play_billing.K1 f19259i = new com.google.android.gms.internal.play_billing.K1(this);

    public L1(com.google.android.gms.internal.play_billing.J1 j9) {
        this.f19258h = new java.lang.ref.WeakReference(j9);
    }

    @Override // com.google.android.gms.internal.play_billing.U
    public final void a(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f19259i.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        com.google.android.gms.internal.play_billing.J1 j9 = (com.google.android.gms.internal.play_billing.J1) this.f19258h.get();
        boolean zCancel = this.f19259i.cancel(z6);
        if (!zCancel || j9 == null) {
            return zCancel;
        }
        j9.f19239a = null;
        j9.f19240b = null;
        j9.f19241c.h(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f19259i.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19259i.f19231h instanceof com.google.android.gms.internal.play_billing.C1832d0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19259i.isDone();
    }

    public final java.lang.String toString() {
        return this.f19259i.toString();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.f19259i.get(j, timeUnit);
    }
}
