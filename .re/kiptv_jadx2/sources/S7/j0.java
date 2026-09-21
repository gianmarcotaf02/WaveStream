package S7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class j0 extends p0 implements r {
    public final boolean j;

    public j0(InterfaceC0891h0 interfaceC0891h0) {
        super(true);
        boolean z6 = true;
        G(interfaceC0891h0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p0.f9611i;
        InterfaceC0898n interfaceC0898n = (InterfaceC0898n) atomicReferenceFieldUpdater.get(this);
        C0899o c0899o = interfaceC0898n instanceof C0899o ? (C0899o) interfaceC0898n : null;
        if (c0899o == null) {
            z6 = false;
            break;
        }
        p0 p0VarH = c0899o.h();
        while (!p0VarH.A()) {
            InterfaceC0898n interfaceC0898n2 = (InterfaceC0898n) atomicReferenceFieldUpdater.get(p0VarH);
            C0899o c0899o2 = interfaceC0898n2 instanceof C0899o ? (C0899o) interfaceC0898n2 : null;
            if (c0899o2 == null) {
                z6 = false;
                break;
            }
            p0VarH = c0899o2.h();
        }
        this.j = z6;
    }

    @Override
    public final boolean A() {
        return this.j;
    }

    @Override
    public final boolean C() {
        return true;
    }

    public final boolean Z() {
        return J(p070h6.A.f22523a);
    }

    public final boolean a0(Throwable th) {
        return J(new C0903t(th, false));
    }
}
