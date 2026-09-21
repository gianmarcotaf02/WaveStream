package com.google.android.gms.internal.cast;

public final class RunnableC1786q2 extends AbstractC1750h2 implements Runnable {

    public final Runnable f19028r;

    public RunnableC1786q2(Runnable runnable) {
        super(11);
        runnable.getClass();
        this.f19028r = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f19028r.run();
        } catch (Throwable th) {
            if (AbstractC1750h2.f18920p.r(this, null, new C1722a2(th))) {
                AbstractC1750h2.x(this);
            }
            throw th;
        }
    }

    @Override
    public final String t() {
        return Y6.f.h("task=[", this.f19028r.toString(), "]");
    }
}
