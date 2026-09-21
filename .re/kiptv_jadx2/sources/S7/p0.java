package S7;

import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.AbstractC1903s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class p0 implements InterfaceC0891h0, v0 {

    public static final AtomicReferenceFieldUpdater f9610h = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_state$volatile");

    public static final AtomicReferenceFieldUpdater f9611i = AtomicReferenceFieldUpdater.newUpdater(p0.class, Object.class, "_parentHandle$volatile");
    private volatile Object _parentHandle$volatile;
    private volatile Object _state$volatile;

    public p0(boolean z6) {
        this._state$volatile = z6 ? C.j : C.f9533i;
    }

    public static C0899o M(X7.i iVar) {
        while (iVar.g()) {
            X7.i iVarD = iVar.d();
            if (iVarD == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X7.i.f10921i;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (X7.i) obj;
                    if (!iVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = iVarD;
            }
        }
        while (true) {
            iVar = iVar.f();
            if (!iVar.g()) {
                if (iVar instanceof C0899o) {
                    return (C0899o) iVar;
                }
                if (iVar instanceof r0) {
                    return null;
                }
            }
        }
    }

    public static String W(Object obj) {
        if (!(obj instanceof n0)) {
            if (obj instanceof InterfaceC0881c0) {
                return ((InterfaceC0881c0) obj).isActive() ? "Active" : "New";
            }
            return obj instanceof C0903t ? "Cancelled" : "Completed";
        }
        n0 n0Var = (n0) obj;
        if (n0Var.d()) {
            return "Cancelling";
        }
        return n0.f9602i.get(n0Var) == 1 ? "Completing" : "Active";
    }

    public boolean A() {
        return true;
    }

    public boolean C() {
        return this instanceof C0901q;
    }

    public final r0 D(InterfaceC0881c0 interfaceC0881c0) {
        r0 r0VarA = interfaceC0881c0.a();
        if (r0VarA != null) {
            return r0VarA;
        }
        if (interfaceC0881c0 instanceof Q) {
            return new r0();
        }
        if (interfaceC0881c0 instanceof k0) {
            U((k0) interfaceC0881c0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0881c0).toString());
    }

    public boolean E(Throwable th) {
        return false;
    }

    public final void G(InterfaceC0891h0 interfaceC0891h0) {
        t0 t0Var = t0.f9621h;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9611i;
        if (interfaceC0891h0 == null) {
            atomicReferenceFieldUpdater.set(this, t0Var);
            return;
        }
        interfaceC0891h0.start();
        InterfaceC0898n interfaceC0898nV = interfaceC0891h0.v(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0898nV);
        if (P()) {
            interfaceC0898nV.dispose();
            atomicReferenceFieldUpdater.set(this, t0Var);
        }
    }

    public final O H(boolean z6, k0 k0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z9;
        boolean zC;
        k0Var.f9593k = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f9610h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z10 = obj instanceof Q;
            t0 t0Var = t0.f9621h;
            z9 = true;
            if (!z10) {
                if (!(obj instanceof InterfaceC0881c0)) {
                    z9 = false;
                    break;
                }
                InterfaceC0881c0 interfaceC0881c0 = (InterfaceC0881c0) obj;
                r0 r0VarA = interfaceC0881c0.a();
                if (r0VarA == null) {
                    kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    U((k0) obj);
                } else {
                    if (k0Var.i()) {
                        n0 n0Var = interfaceC0881c0 instanceof n0 ? (n0) interfaceC0881c0 : null;
                        Throwable thC = n0Var != null ? n0Var.c() : null;
                        if (thC == null) {
                            zC = r0VarA.c(k0Var, 5);
                        } else if (z6) {
                            k0Var.j(thC);
                            return t0Var;
                        }
                    } else {
                        zC = r0VarA.c(k0Var, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                Q q9 = (Q) obj;
                if (q9.f9554h) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, k0Var)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    T(q9);
                }
            }
            return t0Var;
        }
        if (z9) {
            return k0Var;
        }
        if (z6) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0903t c0903t = obj2 instanceof C0903t ? (C0903t) obj2 : null;
            k0Var.j(c0903t != null ? c0903t.f9620a : null);
        }
        return t0Var;
    }

    public boolean I() {
        return this instanceof C0886f;
    }

    public final boolean J(Object obj) {
        Object objX;
        do {
            objX = X(f9610h.get(this), obj);
            if (objX == C.f9529d) {
                return false;
            }
            if (objX == C.f9530e) {
                return true;
            }
        } while (objX == C.f9531f);
        f(objX);
        return true;
    }

    public final Object K(Object obj) {
        Object objX;
        do {
            objX = X(f9610h.get(this), obj);
            if (objX == C.f9529d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0903t c0903t = obj instanceof C0903t ? (C0903t) obj : null;
                throw new IllegalStateException(str, c0903t != null ? c0903t.f9620a : null);
            }
        } while (objX == C.f9531f);
        return objX;
    }

    public String L() {
        return getClass().getSimpleName();
    }

    @Override
    public final O N(boolean z6, boolean z9, p194x6.j jVar) {
        return H(z9, z6 ? new C0887f0(jVar) : new P(1, jVar));
    }

    public final void O(r0 r0Var, Throwable th) {
        Q(th);
        r0Var.c(new X7.h(4), 4);
        Object obj = X7.i.f10920h.get(r0Var);
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        I3.b bVar = null;
        for (X7.i iVarF = (X7.i) obj; !iVarF.equals(r0Var); iVarF = iVarF.f()) {
            if ((iVarF instanceof k0) && ((k0) iVarF).i()) {
                try {
                    ((k0) iVarF).j(th);
                } catch (Throwable th2) {
                    if (bVar != null) {
                        AbstractC1903s.j(bVar, th2);
                    } else {
                        bVar = new I3.b("Exception in completion handler " + iVarF + " for " + this, th2);
                    }
                }
            }
        }
        if (bVar != null) {
            F(bVar);
        }
        p(th);
    }

    @Override
    public final boolean P() {
        return !(f9610h.get(this) instanceof InterfaceC0881c0);
    }

    public final void T(Q q9) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r0 r0Var = new r0();
        Object c0879b0 = r0Var;
        if (!q9.f9554h) {
            c0879b0 = new C0879b0(r0Var);
        }
        do {
            atomicReferenceFieldUpdater = f9610h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, q9, c0879b0)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == q9);
    }

    public final void U(k0 k0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r0 r0Var = new r0();
        k0Var.getClass();
        X7.i.f10921i.set(r0Var, k0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = X7.i.f10920h;
        atomicReferenceFieldUpdater2.set(r0Var, k0Var);
        loop0: while (atomicReferenceFieldUpdater2.get(k0Var) == k0Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(k0Var, k0Var, r0Var)) {
                    r0Var.e(k0Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(k0Var) == k0Var);
        }
        X7.i iVarF = k0Var.f();
        do {
            atomicReferenceFieldUpdater = f9610h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, k0Var, iVarF)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == k0Var);
    }

    public final int V(Object obj) {
        boolean z6 = obj instanceof Q;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9610h;
        if (z6) {
            if (((Q) obj).f9554h) {
                return 0;
            }
            Q q9 = C.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, q9)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            S();
            return 1;
        }
        if (!(obj instanceof C0879b0)) {
            return 0;
        }
        r0 r0Var = ((C0879b0) obj).f9568h;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, r0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        S();
        return 1;
    }

    public final Object X(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC0881c0)) {
            return C.f9529d;
        }
        if (((obj instanceof Q) || (obj instanceof k0)) && !(obj instanceof C0899o) && !(obj2 instanceof C0903t)) {
            InterfaceC0881c0 interfaceC0881c0 = (InterfaceC0881c0) obj;
            Object c0883d0 = obj2 instanceof InterfaceC0881c0 ? new C0883d0((InterfaceC0881c0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f9610h;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0881c0, c0883d0)) {
                    Q(null);
                    R(obj2);
                    s(interfaceC0881c0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0881c0);
            return C.f9531f;
        }
        InterfaceC0881c0 interfaceC0881c1 = (InterfaceC0881c0) obj;
        r0 r0VarD = D(interfaceC0881c1);
        if (r0VarD == null) {
            return C.f9531f;
        }
        n0 n0Var = interfaceC0881c1 instanceof n0 ? (n0) interfaceC0881c1 : null;
        if (n0Var == null) {
            n0Var = new n0(r0VarD, null);
        }
        synchronized (n0Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = n0.f9602i;
                if (atomicIntegerFieldUpdater.get(n0Var) == 1) {
                    return C.f9529d;
                }
                atomicIntegerFieldUpdater.set(n0Var, 1);
                if (n0Var != interfaceC0881c1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9610h;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0881c1, n0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC0881c1) {
                            return C.f9531f;
                        }
                    }
                }
                boolean zD = n0Var.d();
                C0903t c0903t = obj2 instanceof C0903t ? (C0903t) obj2 : null;
                if (c0903t != null) {
                    n0Var.b(c0903t.f9620a);
                }
                Throwable thC = zD ? null : n0Var.c();
                if (thC != null) {
                    O(r0VarD, thC);
                }
                C0899o c0899oM = M(r0VarD);
                if (c0899oM != null && Y(n0Var, c0899oM, obj2)) {
                    return C.f9530e;
                }
                r0VarD.c(new X7.h(2), 2);
                C0899o c0899oM2 = M(r0VarD);
                return (c0899oM2 == null || !Y(n0Var, c0899oM2, obj2)) ? x(n0Var, obj2) : C.f9530e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean Y(n0 n0Var, C0899o c0899o, Object obj) {
        while (C.w(c0899o.f9605l, false, new m0(this, n0Var, c0899o, obj)) == t0.f9621h) {
            c0899o = M(c0899o);
            if (c0899o == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final N7.m b() {
        return new N7.p(new o0(this, null));
    }

    @Override
    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0893i0(q(), null, this);
        }
        m(cancellationException);
    }

    @Override
    public final Object fold(Object obj, p194x6.m mVar) {
        return mVar.invoke(obj, this);
    }

    @Override
    public final p100l6.f get(p100l6.g gVar) {
        return AbstractC1833d1.t(this, gVar);
    }

    @Override
    public final p100l6.g getKey() {
        return C0889g0.f9584h;
    }

    public void h(Object obj) {
        f(obj);
    }

    public Object i() throws Throwable {
        Object obj = f9610h.get(this);
        if (obj instanceof InterfaceC0881c0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C0903t) {
            throw ((C0903t) obj).f9620a;
        }
        return C.I(obj);
    }

    @Override
    public boolean isActive() {
        Object obj = f9610h.get(this);
        return (obj instanceof InterfaceC0881c0) && ((InterfaceC0881c0) obj).isActive();
    }

    @Override
    public final boolean isCancelled() {
        Object obj = f9610h.get(this);
        if (obj instanceof C0903t) {
            return true;
        }
        return (obj instanceof n0) && ((n0) obj).d();
    }

    @Override
    public final O j(p194x6.j jVar) {
        return H(true, new P(1, jVar));
    }

    public final Object k(p100l6.c cVar) throws Throwable {
        Object obj;
        int i3 = 2;
        do {
            obj = f9610h.get(this);
            if (!(obj instanceof InterfaceC0881c0)) {
                if (obj instanceof C0903t) {
                    throw ((C0903t) obj).f9620a;
                }
                return C.I(obj);
            }
        } while (V(obj) < 0);
        l0 l0Var = new l0(this, com.google.common.util.concurrent.P.h0(cVar));
        l0Var.r();
        l0Var.u(new C0890h(i3, C.w(this, true, new P(i3, l0Var))));
        Object objQ = l0Var.q();
        p109m6.a aVar = p109m6.a.f25430h;
        return objQ;
    }

    public final boolean l(Object obj) {
        Throwable thW;
        Object obj2;
        n0 n0Var;
        boolean z6;
        Throwable thC;
        N6.A a2;
        InterfaceC0881c0 interfaceC0881c0;
        r0 r0VarD;
        n0 n0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objX;
        Object objX2 = C.f9529d;
        if (C()) {
            do {
                Object obj3 = f9610h.get(this);
                if (obj3 instanceof InterfaceC0881c0) {
                    if (obj3 instanceof n0) {
                        n0 n0Var3 = (n0) obj3;
                        n0Var3.getClass();
                        if (n0.f9602i.get(n0Var3) == 1) {
                        }
                    }
                    objX2 = X(obj3, new C0903t(w(obj), false));
                }
                objX2 = C.f9529d;
                break;
            } while (objX2 == C.f9531f);
            if (objX2 != C.f9530e) {
                if (objX2 == C.f9529d) {
                    thW = null;
                    loop1: while (true) {
                        obj2 = f9610h.get(this);
                        if (obj2 instanceof n0) {
                            synchronized (obj2) {
                                try {
                                    n0Var = (n0) obj2;
                                    n0Var.getClass();
                                    if (n0.f9603k.get(n0Var) == C.f9532h) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        a2 = C.g;
                                    } else {
                                        boolean zD = ((n0) obj2).d();
                                        if (thW == null) {
                                            thW = w(obj);
                                        }
                                        ((n0) obj2).b(thW);
                                        thC = zD ? null : ((n0) obj2).c();
                                        if (thC != null) {
                                            O(((n0) obj2).f9604h, thC);
                                        }
                                        a2 = C.f9529d;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else if (obj2 instanceof InterfaceC0881c0) {
                            if (thW == null) {
                                thW = w(obj);
                            }
                            interfaceC0881c0 = (InterfaceC0881c0) obj2;
                            if (interfaceC0881c0.isActive()) {
                                r0VarD = D(interfaceC0881c0);
                                if (r0VarD == null) {
                                    continue;
                                } else {
                                    n0Var2 = new n0(r0VarD, thW);
                                    while (true) {
                                        atomicReferenceFieldUpdater = f9610h;
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0881c0, n0Var2)) {
                                            O(r0VarD, thW);
                                            a2 = C.f9529d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0881c0) {
                                        }
                                    }
                                }
                            } else {
                                objX = X(obj2, new C0903t(thW, false));
                                if (objX != C.f9529d) {
                                    throw new IllegalStateException(p121o0.p.n(obj2, "Cannot happen in "));
                                }
                                if (objX != C.f9531f) {
                                    objX2 = objX;
                                    break;
                                }
                            }
                        } else {
                            a2 = C.g;
                        }
                        objX2 = a2;
                        break;
                    }
                }
                if (objX2 != C.f9529d && objX2 != C.f9530e) {
                    if (objX2 == C.g) {
                        return false;
                    }
                    f(objX2);
                    return true;
                }
            }
        } else {
            if (objX2 == C.f9529d) {
                thW = null;
                loop1: while (true) {
                    obj2 = f9610h.get(this);
                    if (obj2 instanceof n0) {
                        synchronized (obj2) {
                            n0Var = (n0) obj2;
                            n0Var.getClass();
                            if (n0.f9603k.get(n0Var) == C.f9532h) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                a2 = C.g;
                            } else {
                                boolean zD2 = ((n0) obj2).d();
                                if (thW == null) {
                                    thW = w(obj);
                                }
                                ((n0) obj2).b(thW);
                                if (zD2) {
                                }
                                if (thC != null) {
                                    O(((n0) obj2).f9604h, thC);
                                }
                                a2 = C.f9529d;
                            }
                        }
                    } else if (obj2 instanceof InterfaceC0881c0) {
                        if (thW == null) {
                            thW = w(obj);
                        }
                        interfaceC0881c0 = (InterfaceC0881c0) obj2;
                        if (interfaceC0881c0.isActive()) {
                            r0VarD = D(interfaceC0881c0);
                            if (r0VarD == null) {
                                continue;
                            } else {
                                n0Var2 = new n0(r0VarD, thW);
                                while (true) {
                                    atomicReferenceFieldUpdater = f9610h;
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0881c0, n0Var2)) {
                                        O(r0VarD, thW);
                                        a2 = C.f9529d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0881c0) {
                                    }
                                }
                            }
                        } else {
                            objX = X(obj2, new C0903t(thW, false));
                            if (objX != C.f9529d) {
                                throw new IllegalStateException(p121o0.p.n(obj2, "Cannot happen in "));
                            }
                            if (objX != C.f9531f) {
                                objX2 = objX;
                                break;
                            }
                        }
                    } else {
                        a2 = C.g;
                    }
                    objX2 = a2;
                    break;
                }
            }
            if (objX2 != C.f9529d) {
                if (objX2 == C.g) {
                    return false;
                }
                f(objX2);
                return true;
            }
        }
        return true;
    }

    public void m(CancellationException cancellationException) {
        l(cancellationException);
    }

    @Override
    public final p100l6.h minusKey(p100l6.g gVar) {
        return AbstractC1833d1.G(this, gVar);
    }

    public final boolean p(Throwable th) {
        if (I()) {
            return true;
        }
        boolean z6 = th instanceof CancellationException;
        InterfaceC0898n interfaceC0898n = (InterfaceC0898n) f9611i.get(this);
        if (interfaceC0898n == null || interfaceC0898n == t0.f9621h) {
            return z6;
        }
        return interfaceC0898n.b(th) || z6;
    }

    @Override
    public final p100l6.h plus(p100l6.h hVar) {
        return AbstractC1833d1.H(this, hVar);
    }

    public String q() {
        return "Job was cancelled";
    }

    public boolean r(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return l(th) && A();
    }

    public final void s(InterfaceC0881c0 interfaceC0881c0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9611i;
        InterfaceC0898n interfaceC0898n = (InterfaceC0898n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0898n != null) {
            interfaceC0898n.dispose();
            atomicReferenceFieldUpdater.set(this, t0.f9621h);
        }
        I3.b bVar = null;
        C0903t c0903t = obj instanceof C0903t ? (C0903t) obj : null;
        Throwable th = c0903t != null ? c0903t.f9620a : null;
        if (interfaceC0881c0 instanceof k0) {
            try {
                ((k0) interfaceC0881c0).j(th);
                return;
            } catch (Throwable th2) {
                F(new I3.b("Exception in completion handler " + interfaceC0881c0 + " for " + this, th2));
                return;
            }
        }
        r0 r0VarA = interfaceC0881c0.a();
        if (r0VarA != null) {
            r0VarA.c(new X7.h(1), 1);
            Object obj2 = X7.i.f10920h.get(r0VarA);
            kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (X7.i iVarF = (X7.i) obj2; !iVarF.equals(r0VarA); iVarF = iVarF.f()) {
                if (iVarF instanceof k0) {
                    try {
                        ((k0) iVarF).j(th);
                    } catch (Throwable th3) {
                        if (bVar != null) {
                            AbstractC1903s.j(bVar, th3);
                        } else {
                            bVar = new I3.b("Exception in completion handler " + iVarF + " for " + this, th3);
                        }
                    }
                }
            }
            if (bVar != null) {
                F(bVar);
            }
        }
    }

    @Override
    public final boolean start() {
        int iV;
        do {
            iV = V(f9610h.get(this));
            if (iV == 0) {
                return false;
            }
        } while (iV != 1);
        return true;
    }

    @Override
    public final CancellationException t() {
        CancellationException c0893i0;
        Object obj = f9610h.get(this);
        if (!(obj instanceof n0)) {
            if (obj instanceof InterfaceC0881c0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0903t)) {
                return new C0893i0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0903t) obj).f9620a;
            c0893i0 = th instanceof CancellationException ? (CancellationException) th : null;
            return c0893i0 == null ? new C0893i0(q(), th, this) : c0893i0;
        }
        Throwable thC = ((n0) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        c0893i0 = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (c0893i0 == null) {
            if (strConcat == null) {
                strConcat = q();
            }
            c0893i0 = new C0893i0(strConcat, thC, this);
        }
        return c0893i0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(L() + '{' + W(f9610h.get(this)) + '}');
        sb.append('@');
        sb.append(C.s(this));
        return sb.toString();
    }

    @Override
    public final InterfaceC0898n v(p0 p0Var) {
        C0899o c0899o = new C0899o(p0Var);
        c0899o.f9593k = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9610h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Q) {
                Q q9 = (Q) obj;
                if (q9.f9554h) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0899o)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                T(q9);
            } else {
                boolean z6 = obj instanceof InterfaceC0881c0;
                t0 t0Var = t0.f9621h;
                Throwable thC = null;
                if (!z6) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0903t c0903t = obj2 instanceof C0903t ? (C0903t) obj2 : null;
                    c0899o.j(c0903t != null ? c0903t.f9620a : null);
                    return t0Var;
                }
                r0 r0VarA = ((InterfaceC0881c0) obj).a();
                if (r0VarA != null) {
                    if (r0VarA.c(c0899o, 7)) {
                        break;
                    }
                    boolean zC = r0VarA.c(c0899o, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof n0) {
                        thC = ((n0) obj3).c();
                    } else {
                        C0903t c0903t2 = obj3 instanceof C0903t ? (C0903t) obj3 : null;
                        if (c0903t2 != null) {
                            thC = c0903t2.f9620a;
                        }
                    }
                    c0899o.j(thC);
                    if (zC) {
                        break;
                    }
                    return t0Var;
                }
                kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                U((k0) obj);
            }
        }
        return c0899o;
    }

    public final Throwable w(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        p0 p0Var = (p0) ((v0) obj);
        Object obj2 = f9610h.get(p0Var);
        if (obj2 instanceof n0) {
            thC = ((n0) obj2).c();
        } else if (obj2 instanceof C0903t) {
            thC = ((C0903t) obj2).f9620a;
        } else {
            if (obj2 instanceof InterfaceC0881c0) {
                throw new IllegalStateException(p121o0.p.n(obj2, "Cannot be cancelling child in this state: "));
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new C0893i0("Parent job is ".concat(W(obj2)), thC, p0Var) : cancellationException;
    }

    public final Object x(n0 n0Var, Object obj) {
        boolean zD;
        Throwable thY;
        C0903t c0903t = obj instanceof C0903t ? (C0903t) obj : null;
        Throwable th = c0903t != null ? c0903t.f9620a : null;
        synchronized (n0Var) {
            zD = n0Var.d();
            ArrayList<Throwable> arrayListE = n0Var.e(th);
            thY = y(n0Var, arrayListE);
            if (thY != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th2 : arrayListE) {
                    if (th2 != thY && th2 != thY && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC1903s.j(thY, th2);
                    }
                }
            }
        }
        if (thY != null && thY != th) {
            obj = new C0903t(thY, false);
        }
        if (thY != null && (p(thY) || E(thY))) {
            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0903t.f9619b.compareAndSet((C0903t) obj, 0, 1);
        }
        if (!zD) {
            Q(thY);
        }
        R(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9610h;
        Object c0883d0 = obj instanceof InterfaceC0881c0 ? new C0883d0((InterfaceC0881c0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, n0Var, c0883d0) && atomicReferenceFieldUpdater.get(this) == n0Var) {
        }
        s(n0Var, obj);
        return obj;
    }

    public final Throwable y(n0 n0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (n0Var.d()) {
                return new C0893i0(q(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof B0) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof B0)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override
    public final Object z(p100l6.c cVar) {
        Object obj;
        p070h6.A a2;
        do {
            obj = f9610h.get(this);
            boolean z6 = obj instanceof InterfaceC0881c0;
            a2 = p070h6.A.f22523a;
            if (!z6) {
                C.p(cVar.getContext());
                return a2;
            }
        } while (V(obj) < 0);
        C0895k c0895k = new C0895k(1, com.google.common.util.concurrent.P.h0(cVar));
        c0895k.r();
        c0895k.u(new C0890h(2, C.w(this, true, new C0897m(c0895k, 1))));
        Object objQ = c0895k.q();
        p109m6.a aVar = p109m6.a.f25430h;
        if (objQ != aVar) {
            objQ = a2;
        }
        return objQ == aVar ? objQ : a2;
    }

    public void S() {
    }

    public void F(I3.b bVar) {
        throw bVar;
    }

    public void Q(Throwable th) {
    }

    public void R(Object obj) {
    }

    public void f(Object obj) {
    }
}
