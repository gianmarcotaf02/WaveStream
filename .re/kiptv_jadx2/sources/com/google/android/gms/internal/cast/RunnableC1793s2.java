package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

public final class RunnableC1793s2 extends AtomicReference implements Runnable {
    public static final RunnableC1770m2 j = new RunnableC1770m2();

    public static final RunnableC1770m2 f19068k = new RunnableC1770m2();

    public final Callable f19069h;

    public final RunnableFutureC1797t2 f19070i;

    public RunnableC1793s2(RunnableFutureC1797t2 runnableFutureC1797t2, Callable callable) {
        this.f19070i = runnableFutureC1797t2;
        callable.getClass();
        this.f19069h = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC1766l2 runnableC1766l2 = null;
        boolean z6 = false;
        int i3 = 0;
        while (true) {
            boolean z9 = runnable instanceof RunnableC1766l2;
            RunnableC1770m2 runnableC1770m2 = f19068k;
            if (!z9) {
                if (runnable != runnableC1770m2) {
                    break;
                }
            } else {
                runnableC1766l2 = (RunnableC1766l2) runnable;
            }
            i3++;
            if (i3 <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC1770m2 || compareAndSet(runnable, runnableC1770m2)) {
                z6 = Thread.interrupted() || z6;
                LockSupport.park(runnableC1766l2);
            }
            runnable = (Runnable) get();
        }
        if (z6) {
            thread.interrupt();
        }
    }

    @Override
    public final void run() {
        Object objCall;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            RunnableFutureC1797t2 runnableFutureC1797t2 = this.f19070i;
            boolean zIsDone = runnableFutureC1797t2.isDone();
            RunnableC1770m2 runnableC1770m2 = j;
            if (zIsDone) {
                objCall = null;
            } else {
                try {
                    objCall = this.f19069h.call();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, runnableC1770m2)) {
                            a(threadCurrentThread);
                        }
                        boolean zR = AbstractC1750h2.f18920p.r(runnableFutureC1797t2, null, new C1722a2(th));
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
                        if (AbstractC1750h2.f18920p.r(runnableFutureC1797t2, null, AbstractC1750h2.f18921q)) {
                            AbstractC1750h2.x(runnableFutureC1797t2);
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
                objCall = AbstractC1750h2.f18921q;
            }
            if (AbstractC1750h2.f18920p.r(runnableFutureC1797t2, null, objCall)) {
                AbstractC1750h2.x(runnableFutureC1797t2);
            }
        }
    }

    @Override
    public final String toString() {
        String strH;
        Runnable runnable = (Runnable) get();
        if (runnable == j) {
            strH = "running=[DONE]";
        } else if (runnable instanceof RunnableC1766l2) {
            strH = "running=[INTERRUPTED]";
        } else {
            strH = runnable instanceof Thread ? Y6.f.h("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]";
        }
        return p121o0.p.p(strH, ", ", this.f19069h.toString());
    }
}
