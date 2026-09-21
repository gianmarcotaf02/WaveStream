package S7;

/* JADX INFO: loaded from: classes4.dex */
public class j0 extends S7.p0 implements S7.r {
    public final boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(S7.InterfaceC0891h0 interfaceC0891h0) {
        super(true);
        boolean z6 = true;
        G(interfaceC0891h0);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = S7.p0.f9611i;
        S7.InterfaceC0898n interfaceC0898n = (S7.InterfaceC0898n) atomicReferenceFieldUpdater.get(this);
        S7.C0899o c0899o = interfaceC0898n instanceof S7.C0899o ? (S7.C0899o) interfaceC0898n : null;
        if (c0899o == null) {
            z6 = false;
            break;
        }
        S7.p0 p0VarH = c0899o.h();
        while (!p0VarH.A()) {
            S7.InterfaceC0898n interfaceC0898n2 = (S7.InterfaceC0898n) atomicReferenceFieldUpdater.get(p0VarH);
            S7.C0899o c0899o2 = interfaceC0898n2 instanceof S7.C0899o ? (S7.C0899o) interfaceC0898n2 : null;
            if (c0899o2 == null) {
                z6 = false;
                break;
            }
            p0VarH = c0899o2.h();
        }
        this.j = z6;
    }

    @Override // S7.p0
    public final boolean A() {
        return this.j;
    }

    @Override // S7.p0
    public final boolean C() {
        return true;
    }

    public final boolean Z() {
        return J(p070h6.A.f22523a);
    }

    public final boolean a0(java.lang.Throwable th) {
        return J(new S7.C0903t(th, false));
    }
}
