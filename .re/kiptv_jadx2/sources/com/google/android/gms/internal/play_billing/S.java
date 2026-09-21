package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public final class S implements U {

    public static final T f19282i = new T(S.class);

    public final Object f19283h;

    public S(Object obj) {
        this.f19283h = obj;
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            f19282i.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", B2.a.m("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e6);
        }
    }

    @Override
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override
    public final Object get() {
        return this.f19283h;
    }

    @Override
    public final boolean isCancelled() {
        return false;
    }

    @Override
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f19283h.toString() + "]]";
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f19283h;
    }
}
