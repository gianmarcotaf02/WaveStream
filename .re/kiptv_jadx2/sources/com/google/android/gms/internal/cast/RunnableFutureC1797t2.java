package com.google.android.gms.internal.cast;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

public final class RunnableFutureC1797t2 extends AbstractC1750h2 implements RunnableFuture {

    public volatile RunnableC1793s2 f19094r;

    public RunnableFutureC1797t2(Callable callable) {
        super(11);
        this.f19094r = new RunnableC1793s2(this, callable);
    }

    @Override
    public final void run() {
        RunnableC1793s2 runnableC1793s2 = this.f19094r;
        if (runnableC1793s2 != null) {
            runnableC1793s2.run();
        }
        this.f19094r = null;
    }

    @Override
    public final String t() {
        RunnableC1793s2 runnableC1793s2 = this.f19094r;
        return runnableC1793s2 != null ? Y6.f.h("task=[", runnableC1793s2.toString(), "]") : super.t();
    }

    @Override
    public final void u() {
        RunnableC1793s2 runnableC1793s2;
        Object obj = this.f18922k;
        if ((obj instanceof Y1) && ((Y1) obj).f18849a && (runnableC1793s2 = this.f19094r) != null) {
            RunnableC1770m2 runnableC1770m2 = RunnableC1793s2.f19068k;
            RunnableC1770m2 runnableC1770m3 = RunnableC1793s2.j;
            Runnable runnable = (Runnable) runnableC1793s2.get();
            if (runnable instanceof Thread) {
                RunnableC1766l2 runnableC1766l2 = new RunnableC1766l2(runnableC1793s2);
                runnableC1766l2.setExclusiveOwnerThread(Thread.currentThread());
                if (runnableC1793s2.compareAndSet(runnable, runnableC1766l2)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) runnableC1793s2.getAndSet(runnableC1770m3)) == runnableC1770m2) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) runnableC1793s2.getAndSet(runnableC1770m3)) == runnableC1770m2) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.f19094r = null;
    }
}
