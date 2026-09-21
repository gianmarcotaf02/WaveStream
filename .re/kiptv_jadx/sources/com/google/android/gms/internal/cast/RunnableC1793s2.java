package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1793s2 extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable {
    public static final com.google.android.gms.internal.cast.RunnableC1770m2 j = new com.google.android.gms.internal.cast.RunnableC1770m2();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.RunnableC1770m2 f19068k = new com.google.android.gms.internal.cast.RunnableC1770m2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.Callable f19069h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.cast.RunnableFutureC1797t2 f19070i;

    public RunnableC1793s2(com.google.android.gms.internal.cast.RunnableFutureC1797t2 runnableFutureC1797t2, java.util.concurrent.Callable callable) {
        this.f19070i = runnableFutureC1797t2;
        callable.getClass();
        this.f19069h = callable;
    }

    public final void a(java.lang.Thread thread) {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        com.google.android.gms.internal.cast.RunnableC1766l2 runnableC1766l2 = null;
        boolean z6 = false;
        int i3 = 0;
        while (true) {
            boolean z9 = runnable instanceof com.google.android.gms.internal.cast.RunnableC1766l2;
            com.google.android.gms.internal.cast.RunnableC1770m2 runnableC1770m2 = f19068k;
            if (!z9) {
                if (runnable != runnableC1770m2) {
                    break;
                }
            } else {
                runnableC1766l2 = (com.google.android.gms.internal.cast.RunnableC1766l2) runnable;
            }
            i3++;
            if (i3 <= 1000) {
                java.lang.Thread.yield();
            } else if (runnable == runnableC1770m2 || compareAndSet(runnable, runnableC1770m2)) {
                z6 = java.lang.Thread.interrupted() || z6;
                java.util.concurrent.locks.LockSupport.park(runnableC1766l2);
            }
            runnable = (java.lang.Runnable) get();
        }
        if (z6) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object objCall;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            com.google.android.gms.internal.cast.RunnableFutureC1797t2 runnableFutureC1797t2 = this.f19070i;
            boolean zIsDone = runnableFutureC1797t2.isDone();
            com.google.android.gms.internal.cast.RunnableC1770m2 runnableC1770m2 = j;
            if (zIsDone) {
                objCall = null;
            } else {
                try {
                    objCall = this.f19069h.call();
                } catch (java.lang.Throwable th) {
                    try {
                        if (th instanceof java.lang.InterruptedException) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, runnableC1770m2)) {
                            a(threadCurrentThread);
                        }
                        boolean zR = com.google.android.gms.internal.cast.AbstractC1750h2.f18920p.r(runnableFutureC1797t2, null, new com.google.android.gms.internal.cast.C1722a2(th));
                        if (zR) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (!compareAndSet(threadCurrentThread, runnableC1770m2)) {
                            a(threadCurrentThread);
                        }
                        runnableFutureC1797t2.getClass();
                        if (com.google.android.gms.internal.cast.AbstractC1750h2.f18920p.r(runnableFutureC1797t2, null, com.google.android.gms.internal.cast.AbstractC1750h2.f18921q)) {
                            com.google.android.gms.internal.cast.AbstractC1750h2.x(runnableFutureC1797t2);
                        }
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnableC1770m2)) {
                a(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            runnableFutureC1797t2.getClass();
            if (objCall == null) {
                objCall = com.google.android.gms.internal.cast.AbstractC1750h2.f18921q;
            }
            if (com.google.android.gms.internal.cast.AbstractC1750h2.f18920p.r(runnableFutureC1797t2, null, objCall)) {
                com.google.android.gms.internal.cast.AbstractC1750h2.x(runnableFutureC1797t2);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
        java.lang.String strH;
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable == j) {
            strH = "running=[DONE]";
        } else if (runnable instanceof com.google.android.gms.internal.cast.RunnableC1766l2) {
            strH = "running=[INTERRUPTED]";
        } else {
            strH = runnable instanceof java.lang.Thread ? Y6.f.h("running=[RUNNING ON ", ((java.lang.Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]";
        }
        return p121o0.p.p(strH, ", ", this.f19069h.toString());
    }
}
