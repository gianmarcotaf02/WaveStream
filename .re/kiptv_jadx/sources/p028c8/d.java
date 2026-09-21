package p028c8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends p028c8.i implements p028c8.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f18520h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p028c8.d.class, java.lang.Object.class, "owner$volatile");
    private volatile /* synthetic */ java.lang.Object owner$volatile;

    public d() {
        super(1);
        this.owner$volatile = p028c8.e.f18521a;
    }

    public final boolean d() {
        return java.lang.Math.max(p028c8.i.g.get(this), 0) == 0;
    }

    public final java.lang.Object e(p100l6.c cVar) {
        boolean zF = f();
        p070h6.A a2 = p070h6.A.f22523a;
        if (!zF) {
            S7.C0895k c0895kU = S7.C.u(com.google.common.util.concurrent.P.h0(cVar));
            try {
                p028c8.c cVar2 = new p028c8.c(this, c0895kU);
                while (true) {
                    int andDecrement = p028c8.i.g.getAndDecrement(this);
                    if (andDecrement <= this.f18528a) {
                        if (andDecrement > 0) {
                            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18520h;
                            p028c8.d dVar = cVar2.f18519i;
                            atomicReferenceFieldUpdater.set(dVar, null);
                            p028c8.b bVar = new p028c8.b(dVar, cVar2, 0);
                            S7.C0895k c0895k = cVar2.f18518h;
                            c0895k.z(a2, c0895k.j, new J.n0(4, bVar));
                            break;
                        }
                        if (b(cVar2)) {
                            break;
                        }
                    }
                }
                java.lang.Object objQ = c0895kU.q();
                p109m6.a aVar = p109m6.a.f25430h;
                if (objQ != aVar) {
                    objQ = a2;
                }
                if (objQ == aVar) {
                    return objQ;
                }
            } catch (java.lang.Throwable th) {
                c0895kU.y();
                throw th;
            }
        }
        return a2;
    }

    public final boolean f() {
        int i3;
        char c9;
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = p028c8.i.g;
            int i9 = atomicIntegerFieldUpdater.get(this);
            int i10 = this.f18528a;
            if (i9 > i10) {
                do {
                    i3 = atomicIntegerFieldUpdater.get(this);
                    if (i3 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, i10));
            } else {
                if (i9 <= 0) {
                    c9 = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i9, i9 - 1)) {
                    f18520h.set(this, null);
                    c9 = 0;
                    break;
                }
            }
        }
        if (c9 == 0) {
            return true;
        }
        if (c9 == 1) {
            return false;
        }
        if (c9 != 2) {
            throw new java.lang.IllegalStateException("unexpected");
        }
        throw new java.lang.IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void g(java.lang.Object obj) {
        while (d()) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18520h;
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            N6.A a2 = p028c8.e.f18521a;
            if (obj2 != a2) {
                if (obj2 != obj && obj != null) {
                    throw new java.lang.IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                        c();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new java.lang.IllegalStateException("This mutex is not locked");
    }

    public final java.lang.String toString() {
        return "Mutex@" + S7.C.s(this) + "[isLocked=" + d() + ",owner=" + f18520h.get(this) + ']';
    }
}
