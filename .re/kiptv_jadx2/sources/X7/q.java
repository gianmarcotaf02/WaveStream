package X7;

import S7.u0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class q extends b implements u0 {

    public static final AtomicIntegerFieldUpdater f10933k = AtomicIntegerFieldUpdater.newUpdater(q.class, "cleanedAndPointers$volatile");
    private volatile int cleanedAndPointers$volatile;
    public final long j;

    public q(long j, q qVar, int i3) {
        super(qVar);
        this.j = j;
        this.cleanedAndPointers$volatile = i3 << 16;
    }

    @Override
    public final boolean d() {
        return f10933k.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f10933k.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i3, p100l6.h hVar);

    public final void i() {
        if (f10933k.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f10933k;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
