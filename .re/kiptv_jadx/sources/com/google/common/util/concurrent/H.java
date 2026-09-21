package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes.dex */
public abstract class H extends java.util.concurrent.atomic.AtomicReference implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final T1.m f19410h = new T1.m(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final T1.m f19411i = new T1.m(1);

    public abstract void a(java.lang.Throwable th);

    public abstract void b(java.lang.Object obj);

    public final void c() {
        T1.m mVar = f19411i;
        T1.m mVar2 = f19410h;
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable instanceof java.lang.Thread) {
            com.google.common.util.concurrent.G g = new com.google.common.util.concurrent.G(this);
            com.google.common.util.concurrent.G.a(g, java.lang.Thread.currentThread());
            if (compareAndSet(runnable, g)) {
                try {
                    ((java.lang.Thread) runnable).interrupt();
                } finally {
                    if (((java.lang.Runnable) getAndSet(mVar2)) == mVar) {
                        java.util.concurrent.locks.LockSupport.unpark((java.lang.Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract java.lang.Object e();

    public abstract java.lang.String f();

    public final void g(java.lang.Thread thread) {
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        com.google.common.util.concurrent.G g = null;
        boolean z6 = false;
        int i3 = 0;
        while (true) {
            boolean z9 = runnable instanceof com.google.common.util.concurrent.G;
            T1.m mVar = f19411i;
            if (!z9 && runnable != mVar) {
                break;
            }
            if (z9) {
                g = (com.google.common.util.concurrent.G) runnable;
            }
            i3++;
            if (i3 <= 1000) {
                java.lang.Thread.yield();
            } else if (runnable == mVar || compareAndSet(runnable, mVar)) {
                z6 = java.lang.Thread.interrupted() || z6;
                java.util.concurrent.locks.LockSupport.park(g);
            }
            runnable = (java.lang.Runnable) get();
        }
        if (z6) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            T1.m mVar = f19410h;
            if (!zD) {
                try {
                    objE = e();
                } catch (java.lang.Throwable th) {
                    try {
                        if (th instanceof java.lang.InterruptedException) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, mVar)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } catch (java.lang.Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, mVar)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, mVar)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(objE);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.Runnable runnable = (java.lang.Runnable) get();
        if (runnable == f19410h) {
            str = "running=[DONE]";
        } else if (runnable instanceof com.google.common.util.concurrent.G) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof java.lang.Thread) {
            str = "running=[RUNNING ON " + ((java.lang.Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        java.lang.StringBuilder sbN = Y6.f.n(str, ", ");
        sbN.append(f());
        return sbN.toString();
    }
}
