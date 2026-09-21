package S7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class A0 extends k0 {

    public static final AtomicIntegerFieldUpdater f9518n = AtomicIntegerFieldUpdater.newUpdater(A0.class, "_state$volatile");
    private volatile int _state$volatile;

    public final Thread f9519l = Thread.currentThread();

    public O f9520m;

    public static void l(int i3) {
        throw new IllegalStateException(("Illegal state " + i3).toString());
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final void j(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f9518n;
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 == 1 || i3 == 2 || i3 == 3) {
                    return;
                }
                l(i3);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 2));
        this.f9519l.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9518n;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        l(i3);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, 1)) {
                O o8 = this.f9520m;
                if (o8 != null) {
                    o8.dispose();
                    return;
                }
                return;
            }
        }
    }
}
