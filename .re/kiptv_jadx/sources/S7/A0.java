package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class A0 extends S7.k0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f9518n = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(S7.A0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.Thread f9519l = java.lang.Thread.currentThread();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public S7.O f9520m;

    public static void l(int i3) {
        throw new java.lang.IllegalStateException(("Illegal state " + i3).toString());
    }

    @Override // S7.k0
    public final boolean i() {
        return true;
    }

    @Override // S7.k0
    public final void j(java.lang.Throwable th) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9518n;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        java.lang.Thread.interrupted();
                        return;
                    } else {
                        l(i3);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i3, 1)) {
                S7.O o8 = this.f9520m;
                if (o8 != null) {
                    o8.dispose();
                    return;
                }
                return;
            }
        }
    }
}
