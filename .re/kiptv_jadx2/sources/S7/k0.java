package S7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class k0 extends X7.i implements O, InterfaceC0881c0 {

    public p0 f9593k;

    @Override
    public final r0 a() {
        return null;
    }

    @Override
    public final void dispose() {
        p0 p0VarH = h();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.f9610h;
            Object obj = atomicReferenceFieldUpdater.get(p0VarH);
            if (obj instanceof k0) {
                if (obj != this) {
                    return;
                }
                Q q9 = C.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(p0VarH, obj, q9)) {
                    if (atomicReferenceFieldUpdater.get(p0VarH) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC0881c0) || ((InterfaceC0881c0) obj).a() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = X7.i.f10920h;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof X7.n) {
                    X7.i iVar = ((X7.n) obj2).f10931a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                X7.i iVar2 = (X7.i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = X7.i.j;
                X7.n nVar = (X7.n) atomicReferenceFieldUpdater3.get(iVar2);
                if (nVar == null) {
                    nVar = new X7.n(iVar2);
                    atomicReferenceFieldUpdater3.set(iVar2, nVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, nVar)) {
                        iVar2.d();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    public InterfaceC0891h0 getParent() {
        return h();
    }

    public final p0 h() {
        p0 p0Var = this.f9593k;
        if (p0Var != null) {
            return p0Var;
        }
        kotlin.jvm.internal.m.k("job");
        throw null;
    }

    public abstract boolean i();

    @Override
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th);

    @Override
    public final String toString() {
        return getClass().getSimpleName() + '@' + C.s(this) + "[job@" + C.s(h()) + ']';
    }
}
