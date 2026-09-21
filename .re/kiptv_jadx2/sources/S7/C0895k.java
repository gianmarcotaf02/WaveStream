package S7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class C0895k extends L implements InterfaceC0894j, p117n6.d, H0 {

    public static final AtomicIntegerFieldUpdater f9588m = AtomicIntegerFieldUpdater.newUpdater(C0895k.class, "_decisionAndIndex$volatile");

    public static final AtomicReferenceFieldUpdater f9589n = AtomicReferenceFieldUpdater.newUpdater(C0895k.class, Object.class, "_state$volatile");

    public static final AtomicReferenceFieldUpdater f9590o = AtomicReferenceFieldUpdater.newUpdater(C0895k.class, Object.class, "_parentHandle$volatile");
    private volatile int _decisionAndIndex$volatile;
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public final p100l6.c f9591k;

    public final p100l6.h f9592l;

    public C0895k(int i3, p100l6.c cVar) {
        super(i3);
        this.f9591k = cVar;
        this.f9592l = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0878b.f9567h;
    }

    public static Object B(u0 u0Var, Object obj, int i3, p194x6.n nVar) {
        if (obj instanceof C0903t) {
            return obj;
        }
        if (i3 != 1 && i3 != 2) {
            return obj;
        }
        if (nVar != null || (u0Var instanceof InterfaceC0892i)) {
            return new C0902s(obj, u0Var instanceof InterfaceC0892i ? (InterfaceC0892i) u0Var : null, nVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void w(u0 u0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + u0Var + ", already has " + obj).toString());
    }

    public final void A(AbstractC0906w abstractC0906w) {
        p070h6.A a2 = p070h6.A.f22523a;
        p100l6.c cVar = this.f9591k;
        X7.f fVar = cVar instanceof X7.f ? (X7.f) cVar : null;
        z(a2, (fVar != null ? fVar.f10910k : null) == abstractC0906w ? 4 : this.j, null);
    }

    public final N6.A C(Object obj, p194x6.n nVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9589n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z6 = obj2 instanceof u0;
            N6.A a2 = C.f9526a;
            if (!z6) {
                boolean z9 = obj2 instanceof C0902s;
                return null;
            }
            Object objB = B((u0) obj2, obj, this.j, nVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objB)) {
                    if (!v()) {
                        l();
                    }
                    return a2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override
    public final void a(X7.q qVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = f9588m;
            i9 = atomicIntegerFieldUpdater.get(this);
            if ((i9 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, ((i9 >> 29) << 29) + i3));
        u(qVar);
    }

    @Override
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9589n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof u0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0903t) {
                return;
            }
            if (!(obj instanceof C0902s)) {
                cancellationException2 = cancellationException;
                C0902s c0902s = new C0902s(obj, (InterfaceC0892i) null, (p194x6.n) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0902s)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0902s c0902s2 = (C0902s) obj;
            if (c0902s2.f9617e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0902s c0902sA = C0902s.a(c0902s2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0902sA)) {
                    InterfaceC0892i interfaceC0892i = c0902s2.f9614b;
                    if (interfaceC0892i != null) {
                        i(interfaceC0892i, cancellationException);
                    }
                    p194x6.n nVar = c0902s2.f9615c;
                    if (nVar != null) {
                        j(nVar, cancellationException, c0902s2.f9613a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override
    public final p100l6.c c() {
        return this.f9591k;
    }

    @Override
    public final boolean cancel(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9589n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof u0)) {
                return false;
            }
            boolean z6 = (obj instanceof InterfaceC0892i) || (obj instanceof X7.q);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C0896l c0896l = new C0896l(cancellationException, z6);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0896l)) {
                    u0 u0Var = (u0) obj;
                    if (u0Var instanceof InterfaceC0892i) {
                        i((InterfaceC0892i) obj, th);
                    } else if (u0Var instanceof X7.q) {
                        k((X7.q) obj, th);
                    }
                    if (!v()) {
                        l();
                    }
                    m(this.j);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override
    public final Object e(Object obj) {
        return obj instanceof C0902s ? ((C0902s) obj).f9613a : obj;
    }

    @Override
    public final void g(Object obj, p194x6.n nVar) throws J {
        z(obj, this.j, nVar);
    }

    @Override
    public final p117n6.d getCallerFrame() {
        p100l6.c cVar = this.f9591k;
        if (cVar instanceof p117n6.d) {
            return (p117n6.d) cVar;
        }
        return null;
    }

    @Override
    public final p100l6.h getContext() {
        return this.f9592l;
    }

    @Override
    public final Object h() {
        return f9589n.get(this);
    }

    public final void i(InterfaceC0892i interfaceC0892i, Throwable th) {
        try {
            interfaceC0892i.b(th);
        } catch (Throwable th2) {
            C.v(this.f9592l, new I3.b("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override
    public final boolean isActive() {
        return f9589n.get(this) instanceof u0;
    }

    @Override
    public final boolean isCancelled() {
        return f9589n.get(this) instanceof C0896l;
    }

    public final void j(p194x6.n nVar, Throwable th, Object obj) {
        p100l6.h hVar = this.f9592l;
        try {
            nVar.invoke(th, obj, hVar);
        } catch (Throwable th2) {
            C.v(hVar, new I3.b("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void k(X7.q qVar, Throwable th) {
        p100l6.h hVar = this.f9592l;
        int i3 = f9588m.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            qVar.h(i3, hVar);
        } catch (Throwable th2) {
            C.v(hVar, new I3.b("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9590o;
        O o8 = (O) atomicReferenceFieldUpdater.get(this);
        if (o8 == null) {
            return;
        }
        o8.dispose();
        atomicReferenceFieldUpdater.set(this, t0.f9621h);
    }

    public final void m(int i3) throws J {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i9;
        do {
            atomicIntegerFieldUpdater = f9588m;
            i9 = atomicIntegerFieldUpdater.get(this);
            int i10 = i9 >> 29;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                p100l6.c cVar = this.f9591k;
                boolean z6 = i3 == 4;
                if (!z6 && (cVar instanceof X7.f)) {
                    boolean z9 = i3 == 1 || i3 == 2;
                    int i11 = this.j;
                    if (z9 == (i11 == 1 || i11 == 2)) {
                        X7.f fVar = (X7.f) cVar;
                        AbstractC0906w abstractC0906w = fVar.f10910k;
                        p100l6.h context = fVar.f10911l.getContext();
                        if (X7.a.j(abstractC0906w, context)) {
                            X7.a.i(abstractC0906w, context, this);
                            return;
                        }
                        X xA = z0.a();
                        if (xA.f9563i >= 4294967296L) {
                            xA.a0(this);
                            return;
                        }
                        xA.c0(true);
                        try {
                            C.D(this, cVar, true);
                            do {
                            } while (xA.e0());
                        } catch (Throwable th) {
                            try {
                                f(th);
                            } finally {
                                xA.Z(true);
                            }
                        }
                        return;
                    }
                }
                C.D(this, cVar, z6);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i9, 1073741824 + (536870911 & i9)));
    }

    @Override
    public final N6.A n(Object obj, p194x6.n nVar) {
        return C(obj, nVar);
    }

    @Override
    public final void o(Object obj) throws J {
        m(this.j);
    }

    public Throwable p(p0 p0Var) {
        return p0Var.t();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        boolean zV = v();
        do {
            atomicIntegerFieldUpdater = f9588m;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i9 = i3 >> 29;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zV) {
                    y();
                }
                Object obj = f9589n.get(this);
                if (obj instanceof C0903t) {
                    throw ((C0903t) obj).f9620a;
                }
                int i10 = this.j;
                if (i10 == 1 || i10 == 2) {
                    InterfaceC0891h0 interfaceC0891h0 = (InterfaceC0891h0) this.f9592l.get(C0889g0.f9584h);
                    if (interfaceC0891h0 != null && !interfaceC0891h0.isActive()) {
                        CancellationException cancellationExceptionT = interfaceC0891h0.t();
                        b(cancellationExceptionT);
                        throw cancellationExceptionT;
                    }
                }
                return e(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, androidx.media3.common.C.BUFFER_FLAG_LAST_SAMPLE + (536870911 & i3)));
        if (((O) f9590o.get(this)) == null) {
            s();
        }
        if (zV) {
            y();
        }
        return p109m6.a.f25430h;
    }

    public final void r() {
        O oS = s();
        if (oS == null || (f9589n.get(this) instanceof u0)) {
            return;
        }
        oS.dispose();
        f9590o.set(this, t0.f9621h);
    }

    @Override
    public final void resumeWith(Object obj) {
        Throwable thA = p070h6.n.a(obj);
        if (thA != null) {
            obj = new C0903t(thA, false);
        }
        z(obj, this.j, null);
    }

    public final O s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0891h0 interfaceC0891h0 = (InterfaceC0891h0) this.f9592l.get(C0889g0.f9584h);
        if (interfaceC0891h0 == null) {
            return null;
        }
        O oW = C.w(interfaceC0891h0, true, new C0897m(this, 0));
        do {
            atomicReferenceFieldUpdater = f9590o;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, oW)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return oW;
    }

    public final void t(p194x6.j jVar) {
        u(new C0890h(1, jVar));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(C.H(this.f9591k));
        sb.append("){");
        Object obj = f9589n.get(this);
        if (obj instanceof u0) {
            str = "Active";
        } else {
            str = obj instanceof C0896l ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(C.s(this));
        return sb.toString();
    }

    public final void u(u0 u0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9589n;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0878b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, u0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof InterfaceC0892i) || (obj instanceof X7.q)) {
                w(u0Var, obj);
                throw null;
            }
            if (obj instanceof C0903t) {
                C0903t c0903t = (C0903t) obj;
                c0903t.getClass();
                if (!C0903t.f9619b.compareAndSet(c0903t, 0, 1)) {
                    w(u0Var, obj);
                    throw null;
                }
                if (obj instanceof C0896l) {
                    if (obj == null) {
                        c0903t = null;
                    }
                    Throwable th = c0903t != null ? c0903t.f9620a : null;
                    if (u0Var instanceof InterfaceC0892i) {
                        i((InterfaceC0892i) u0Var, th);
                        return;
                    } else {
                        kotlin.jvm.internal.m.c(u0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        k((X7.q) u0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0902s)) {
                if (u0Var instanceof X7.q) {
                    return;
                }
                kotlin.jvm.internal.m.c(u0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                C0902s c0902s = new C0902s(obj, (InterfaceC0892i) u0Var, (p194x6.n) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0902s)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0902s c0902s2 = (C0902s) obj;
            if (c0902s2.f9614b != null) {
                w(u0Var, obj);
                throw null;
            }
            if (u0Var instanceof X7.q) {
                return;
            }
            kotlin.jvm.internal.m.c(u0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            InterfaceC0892i interfaceC0892i = (InterfaceC0892i) u0Var;
            Throwable th2 = c0902s2.f9617e;
            if (th2 != null) {
                i(interfaceC0892i, th2);
                return;
            }
            C0902s c0902sA = C0902s.a(c0902s2, interfaceC0892i, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0902sA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    public final boolean v() {
        if (this.j != 2) {
            return false;
        }
        p100l6.c cVar = this.f9591k;
        kotlin.jvm.internal.m.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return X7.f.f10909o.get((X7.f) cVar) != null;
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        p100l6.c cVar = this.f9591k;
        Throwable th = null;
        X7.f fVar = cVar instanceof X7.f ? (X7.f) cVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.f.f10909o;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                N6.A a2 = X7.a.f10900c;
                if (obj != a2) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(p121o0.p.n(obj, "Inconsistent state "));
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, a2, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == a2);
            }
            if (th == null) {
                return;
            }
            l();
            cancel(th);
        }
    }

    public final void z(Object obj, int i3, p194x6.n nVar) throws J {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9589n;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof u0)) {
                if (obj2 instanceof C0896l) {
                    C0896l c0896l = (C0896l) obj2;
                    c0896l.getClass();
                    if (C0896l.f9594c.compareAndSet(c0896l, 0, 1)) {
                        if (nVar != null) {
                            j(nVar, c0896l.f9620a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(p121o0.p.n(obj, "Already resumed, but proposed with update "));
            }
            Object objB = B((u0) obj2, obj, i3, nVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objB)) {
                    if (!v()) {
                        l();
                    }
                    m(i3);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }
}
