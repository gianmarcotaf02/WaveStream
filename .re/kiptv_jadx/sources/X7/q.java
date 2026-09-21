package X7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q extends X7.b implements S7.u0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f10933k = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(X7.q.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;
    public final long j;

    public q(long j, X7.q qVar, int i3) {
        super(qVar);
        this.j = j;
        this.cleanedAndPointers$volatile = i3 << 16;
    }

    @Override // X7.b
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
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
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
