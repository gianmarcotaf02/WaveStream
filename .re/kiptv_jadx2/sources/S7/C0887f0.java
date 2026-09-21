package S7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class C0887f0 extends k0 {

    public static final AtomicIntegerFieldUpdater f9581m = AtomicIntegerFieldUpdater.newUpdater(C0887f0.class, "_invoked$volatile");
    private volatile int _invoked$volatile;

    public final p194x6.j f9582l;

    public C0887f0(p194x6.j jVar) {
        this.f9582l = jVar;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void j(Throwable th) {
        if (f9581m.compareAndSet(this, 0, 1)) {
            this.f9582l.invoke(th);
        }
    }
}
