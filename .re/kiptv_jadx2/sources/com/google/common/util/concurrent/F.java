package com.google.common.util.concurrent;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public final class F implements J {

    public static final F f19407i = new F(null);
    public static final I j = new I(F.class);

    public final Object f19408h;

    public F(Object obj) {
        this.f19408h = obj;
    }

    @Override
    public final void addListener(Runnable runnable, Executor executor) {
        AbstractC1864o0.U(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e6) {
            j.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    @Override
    public final boolean cancel(boolean z6) {
        return false;
    }

    @Override
    public final Object get() {
        return this.f19408h;
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
        return super.toString() + "[status=SUCCESS, result=[" + this.f19408h + "]]";
    }

    @Override
    public final Object get(long j9, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f19408h;
    }
}
