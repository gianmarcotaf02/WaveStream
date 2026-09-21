package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

public abstract class H extends AtomicReference implements Runnable {

    public static final T1.m f19410h = new T1.m(1);

    public static final T1.m f19411i = new T1.m(1);

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        T1.m mVar = f19411i;
        T1.m mVar2 = f19410h;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            G g = new G(this);
            G.a(g, Thread.currentThread());
            if (compareAndSet(runnable, g)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(mVar2)) == mVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        G g = null;
        boolean z6 = false;
        int i3 = 0;
        while (true) {
            boolean z9 = runnable instanceof G;
            T1.m mVar = f19411i;
            if (!z9 && runnable != mVar) {
                break;
            }
            if (z9) {
                g = (G) runnable;
            }
            i3++;
            if (i3 <= 1000) {
                Thread.yield();
            } else if (runnable == mVar || compareAndSet(runnable, mVar)) {
                z6 = Thread.interrupted() || z6;
                LockSupport.park(g);
            }
            runnable = (Runnable) get();
        }
        if (z6) {
            thread.interrupt();
        }
    }

    @Override
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            T1.m mVar = f19410h;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, mVar)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } catch (Throwable th2) {
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

    @Override
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f19410h) {
            str = "running=[DONE]";
        } else if (runnable instanceof G) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbN = Y6.f.n(str, ", ");
        sbN.append(f());
        return sbN.toString();
    }
}
