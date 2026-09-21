package S7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public abstract class W extends X implements H {

    public static final AtomicReferenceFieldUpdater f9559m = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_queue$volatile");

    public static final AtomicReferenceFieldUpdater f9560n = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_delayed$volatile");

    public static final AtomicIntegerFieldUpdater f9561o = AtomicIntegerFieldUpdater.newUpdater(W.class, "_isCompleted$volatile");
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile;
    private volatile Object _queue$volatile;

    @Override
    public final void G(long j, C0895k c0895k) {
        long j9 = 0;
        if (j > 0) {
            j9 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j9 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            S s9 = new S(this, j9 + jNanoTime, c0895k);
            k0(jNanoTime, s9);
            c0895k.u(new C0890h(2, s9));
        }
    }

    public O T(long j, Runnable runnable, p100l6.h hVar) {
        return E.f9539a.T(j, runnable, hVar);
    }

    @Override
    public final void V(p100l6.h hVar, Runnable runnable) {
        g0(runnable);
    }

    @Override
    public final long d0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        N6.A a2;
        Runnable runnable;
        U u6;
        if (!e0()) {
            h0();
            loop0: while (true) {
                atomicReferenceFieldUpdater = f9559m;
                Object obj = atomicReferenceFieldUpdater.get(this);
                a2 = C.f9528c;
                if (obj != null) {
                    if (obj instanceof X7.l) {
                        X7.l lVar = (X7.l) obj;
                        Object objD = lVar.d();
                        if (objD != X7.l.g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        X7.l lVarC = lVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != a2) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            p078i6.l lVar2 = this.f9564k;
            if (((lVar2 == null || lVar2.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof X7.l) {
                        long j = X7.l.f10925f.get((X7.l) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == a2) {
                        return Long.MAX_VALUE;
                    }
                }
                V v6 = (V) f9560n.get(this);
                if (v6 != null) {
                    synchronized (v6) {
                        U[] uArr = v6.f10938a;
                        u6 = uArr != null ? uArr[0] : null;
                    }
                    if (u6 != null) {
                        long jNanoTime = u6.f9556h - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void g0(Runnable runnable) {
        h0();
        if (!i0(runnable)) {
            D.f9535p.g0(runnable);
            return;
        }
        Thread threadB0 = b0();
        if (Thread.currentThread() != threadB0) {
            LockSupport.unpark(threadB0);
        }
    }

    public final void h0() {
        U uB;
        V v6 = (V) f9560n.get(this);
        if (v6 == null || X7.u.f10937b.get(v6) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (v6) {
                try {
                    U[] uArr = v6.f10938a;
                    uB = null;
                    U u6 = uArr != null ? uArr[0] : null;
                    if (u6 != null) {
                        uB = ((jNanoTime - u6.f9556h) > 0L ? 1 : ((jNanoTime - u6.f9556h) == 0L ? 0 : -1)) >= 0 ? i0(u6) : false ? v6.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (uB != null);
    }

    public final boolean i0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9559m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f9561o.get(this) == 1) {
                break;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof X7.l)) {
                if (obj == C.f9528c) {
                    break;
                }
                X7.l lVar = new X7.l(8, true);
                lVar.a((Runnable) obj);
                lVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            X7.l lVar2 = (X7.l) obj;
            int iA = lVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                X7.l lVarC = lVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                break;
            }
        }
        return false;
    }

    public final boolean j0() {
        V v6;
        p078i6.l lVar = this.f9564k;
        if (!(lVar != null ? lVar.isEmpty() : true) || ((v6 = (V) f9560n.get(this)) != null && X7.u.f10937b.get(v6) != 0)) {
            return false;
        }
        Object obj = f9559m.get(this);
        if (obj != null) {
            if (obj instanceof X7.l) {
                long j = X7.l.f10925f.get((X7.l) obj);
                return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
            }
            if (obj != C.f9528c) {
                return false;
            }
        }
        return true;
    }

    public final void k0(long j, U u6) {
        int iA;
        Thread threadB0;
        boolean z6 = f9561o.get(this) == 1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9560n;
        U u7 = null;
        if (z6) {
            iA = 1;
        } else {
            V v6 = (V) atomicReferenceFieldUpdater.get(this);
            if (v6 == null) {
                V v9 = new V();
                v9.f9558c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, v9) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.m.b(obj);
                v6 = (V) obj;
            }
            iA = u6.a(j, v6, this);
        }
        if (iA != 0) {
            if (iA == 1) {
                f0(j, u6);
                return;
            } else {
                if (iA != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        V v10 = (V) atomicReferenceFieldUpdater.get(this);
        if (v10 != null) {
            synchronized (v10) {
                U[] uArr = v10.f10938a;
                u7 = uArr != null ? uArr[0] : null;
            }
        }
        if (u7 != u6 || Thread.currentThread() == (threadB0 = b0())) {
            return;
        }
        LockSupport.unpark(threadB0);
    }

    @Override
    public void shutdown() {
        U uB;
        z0.f9629a.set(null);
        f9561o.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9559m;
            Object obj = atomicReferenceFieldUpdater.get(this);
            N6.A a2 = C.f9528c;
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, a2)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof X7.l) {
                ((X7.l) obj).b();
                break;
            } else {
                if (obj == a2) {
                    break;
                }
                X7.l lVar = new X7.l(8, true);
                lVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (d0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            V v6 = (V) f9560n.get(this);
            if (v6 == null) {
                return;
            }
            synchronized (v6) {
                uB = X7.u.f10937b.get(v6) > 0 ? v6.b(0) : null;
            }
            if (uB == null) {
                return;
            } else {
                f0(jNanoTime, uB);
            }
        }
    }
}
