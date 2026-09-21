package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class L1 implements U {

    public final WeakReference f19258h;

    public final K1 f19259i = new K1(this);

    public L1(J1 j9) {
        this.f19258h = new WeakReference(j9);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.f19259i.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z6) {
        J1 j9 = (J1) this.f19258h.get();
        boolean zCancel = this.f19259i.cancel(z6);
        if (!zCancel || j9 == null) {
            return zCancel;
        }
        j9.f19239a = null;
        j9.f19240b = null;
        j9.f19241c.h(null);
        return true;
    }

    @Override
    public final Object get() {
        return this.f19259i.get();
    }

    @Override
    public final boolean isCancelled() {
        return this.f19259i.f19231h instanceof C1832d0;
    }

    @Override
    public final boolean isDone() {
        return this.f19259i.isDone();
    }

    public final String toString() {
        return this.f19259i.toString();
    }

    @Override
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f19259i.get(j, timeUnit);
    }
}
