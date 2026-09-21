package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

public final class T extends A implements RunnableFuture {

    public volatile S f19422h;

    public T(Callable callable) {
        this.f19422h = new S(this, callable);
    }

    @Override
    public final void afterDone() {
        S s9;
        super.afterDone();
        if (wasInterrupted() && (s9 = this.f19422h) != null) {
            s9.c();
        }
        this.f19422h = null;
    }

    @Override
    public final String pendingToString() {
        S s9 = this.f19422h;
        if (s9 == null) {
            return super.pendingToString();
        }
        return "task=[" + s9 + "]";
    }

    @Override
    public final void run() {
        S s9 = this.f19422h;
        if (s9 != null) {
            s9.run();
        }
        this.f19422h = null;
    }
}
