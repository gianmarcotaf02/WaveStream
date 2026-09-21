package S7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k0 extends X7.i implements S7.O, S7.InterfaceC0881c0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public S7.p0 f9593k;

    @Override // S7.InterfaceC0881c0
    public final S7.r0 a() {
        return null;
    }

    @Override // S7.O
    public final void dispose() {
        S7.p0 p0VarH = h();
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = S7.p0.f9610h;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(p0VarH);
            if (obj instanceof S7.k0) {
                if (obj != this) {
                    return;
                }
                S7.Q q9 = S7.C.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(p0VarH, obj, q9)) {
                    if (atomicReferenceFieldUpdater.get(p0VarH) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof S7.InterfaceC0881c0) || ((S7.InterfaceC0881c0) obj).a() == null) {
                return;
            }
            while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = X7.i.f10920h;
                java.lang.Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof X7.n) {
                    X7.i iVar = ((X7.n) obj2).f10931a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                X7.i iVar2 = (X7.i) obj2;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = X7.i.j;
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

    public S7.InterfaceC0891h0 getParent() {
        return h();
    }

    public final S7.p0 h() {
        S7.p0 p0Var = this.f9593k;
        if (p0Var != null) {
            return p0Var;
        }
        kotlin.jvm.internal.m.k("job");
        throw null;
    }

    public abstract boolean i();

    @Override // S7.InterfaceC0881c0
    public final boolean isActive() {
        return true;
    }

    public abstract void j(java.lang.Throwable th);

    @Override // X7.i
    public final java.lang.String toString() {
        return getClass().getSimpleName() + '@' + S7.C.s(this) + "[job@" + S7.C.s(h()) + ']';
    }
}
