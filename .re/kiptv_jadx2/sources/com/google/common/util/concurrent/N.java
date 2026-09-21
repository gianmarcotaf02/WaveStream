package com.google.common.util.concurrent;

public final class N extends AbstractC1895j implements Runnable {

    public final Runnable f19418h;

    public N(Runnable runnable) {
        runnable.getClass();
        this.f19418h = runnable;
    }

    @Override
    public final String pendingToString() {
        return "task=[" + this.f19418h + "]";
    }

    @Override
    public final void run() {
        try {
            this.f19418h.run();
        } catch (Throwable th) {
            setException(th);
            throw th;
        }
    }
}
