package com.google.common.util.concurrent;

public final class RunnableC1892g implements Runnable {

    public final AbstractC1902q f19440h;

    public final J f19441i;

    public RunnableC1892g(AbstractC1902q abstractC1902q, J j) {
        this.f19440h = abstractC1902q;
        this.f19441i = j;
    }

    @Override
    public final void run() {
        AbstractC1902q abstractC1902q = this.f19440h;
        if (abstractC1902q.value != this) {
            return;
        }
        if (AbstractC1902q.ATOMIC_HELPER.b(abstractC1902q, this, AbstractC1902q.g(this.f19441i))) {
            AbstractC1902q.d(abstractC1902q, false);
        }
    }
}
