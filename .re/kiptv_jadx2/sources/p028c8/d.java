package p028c8;

import J.n0;
import S7.C;
import S7.C0895k;
import com.google.common.util.concurrent.P;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p070h6.A;
import p100l6.c;
import p109m6.a;

public final class d extends i implements a {

    public static final AtomicReferenceFieldUpdater f18520h = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public d() {
        super(1);
        this.owner$volatile = e.f18521a;
    }

    public final boolean d() {
        return Math.max(i.g.get(this), 0) == 0;
    }

    public final Object e(c cVar) {
        boolean zF = f();
        A a2 = A.f22523a;
        if (!zF) {
            C0895k c0895kU = C.u(P.h0(cVar));
            try {
                c cVar2 = new c(this, c0895kU);
                while (true) {
                    int andDecrement = i.g.getAndDecrement(this);
                    if (andDecrement <= this.f18528a) {
                        if (andDecrement > 0) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18520h;
                            d dVar = cVar2.f18519i;
                            atomicReferenceFieldUpdater.set(dVar, null);
                            b bVar = new b(dVar, cVar2, 0);
                            C0895k c0895k = cVar2.f18518h;
                            c0895k.z(a2, c0895k.j, new n0(4, bVar));
                            break;
                        }
                        if (b(cVar2)) {
                            break;
                        }
                    }
                }
                Object objQ = c0895kU.q();
                a aVar = a.f25430h;
                if (objQ != aVar) {
                    objQ = a2;
                }
                if (objQ == aVar) {
                    return objQ;
                }
            } catch (Throwable th) {
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
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = i.g;
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
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException("This mutex is already locked by the specified owner: null".toString());
    }

    public final void g(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18520h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            N6.A a2 = e.f18521a;
            if (obj2 != a2) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                        c();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + C.s(this) + "[isLocked=" + d() + ",owner=" + f18520h.get(this) + ']';
    }
}
