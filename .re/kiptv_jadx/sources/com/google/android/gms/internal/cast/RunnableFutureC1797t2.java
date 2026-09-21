package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableFutureC1797t2 extends com.google.android.gms.internal.cast.AbstractC1750h2 implements java.util.concurrent.RunnableFuture {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile com.google.android.gms.internal.cast.RunnableC1793s2 f19094r;

    public RunnableFutureC1797t2(java.util.concurrent.Callable callable) {
        super(11);
        this.f19094r = new com.google.android.gms.internal.cast.RunnableC1793s2(this, callable);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.cast.RunnableC1793s2 runnableC1793s2 = this.f19094r;
        if (runnableC1793s2 != null) {
            runnableC1793s2.run();
        }
        this.f19094r = null;
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1750h2
    public final java.lang.String t() {
        com.google.android.gms.internal.cast.RunnableC1793s2 runnableC1793s2 = this.f19094r;
        return runnableC1793s2 != null ? Y6.f.h("task=[", runnableC1793s2.toString(), "]") : super.t();
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1750h2
    public final void u() {
        com.google.android.gms.internal.cast.RunnableC1793s2 runnableC1793s2;
        java.lang.Object obj = this.f18922k;
        if ((obj instanceof com.google.android.gms.internal.cast.Y1) && ((com.google.android.gms.internal.cast.Y1) obj).f18849a && (runnableC1793s2 = this.f19094r) != null) {
            com.google.android.gms.internal.cast.RunnableC1770m2 runnableC1770m2 = com.google.android.gms.internal.cast.RunnableC1793s2.f19068k;
            com.google.android.gms.internal.cast.RunnableC1770m2 runnableC1770m3 = com.google.android.gms.internal.cast.RunnableC1793s2.j;
            java.lang.Runnable runnable = (java.lang.Runnable) runnableC1793s2.get();
            if (runnable instanceof java.lang.Thread) {
                com.google.android.gms.internal.cast.RunnableC1766l2 runnableC1766l2 = new com.google.android.gms.internal.cast.RunnableC1766l2(runnableC1793s2);
                runnableC1766l2.setExclusiveOwnerThread(java.lang.Thread.currentThread());
                if (runnableC1793s2.compareAndSet(runnable, runnableC1766l2)) {
                    try {
                        java.lang.Thread thread = (java.lang.Thread) runnable;
                        thread.interrupt();
                        if (((java.lang.Runnable) runnableC1793s2.getAndSet(runnableC1770m3)) == runnableC1770m2) {
                            java.util.concurrent.locks.LockSupport.unpark(thread);
                        }
                    } catch (java.lang.Throwable th) {
                        if (((java.lang.Runnable) runnableC1793s2.getAndSet(runnableC1770m3)) == runnableC1770m2) {
                            java.util.concurrent.locks.LockSupport.unpark((java.lang.Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f19094r = null;
    }
}
