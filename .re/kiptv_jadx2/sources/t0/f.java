package t0;

import Q0.AbstractC0777k;
import Q0.C0;
import Q0.InterfaceC0787v;
import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.m;
import p020c0.C1704s0;
import p137q0.o;

public final class f extends o implements C0, InterfaceC0787v {

    public f f27750v;

    public f f27751w;

    public long f27752x;

    @Override
    public final void G0() {
        this.f27751w = null;
        this.f27750v = null;
    }

    public final boolean N0(C1704s0 c1704s0) {
        f fVar = this.f27750v;
        if (fVar != null) {
            return fVar.N0(c1704s0);
        }
        f fVar2 = this.f27751w;
        if (fVar2 != null) {
            return fVar2.N0(c1704s0);
        }
        return false;
    }

    public final void O0(C1704s0 c1704s0) {
        f fVar = this.f27751w;
        if (fVar != null) {
            fVar.O0(c1704s0);
            return;
        }
        f fVar2 = this.f27750v;
        if (fVar2 != null) {
            fVar2.O0(c1704s0);
        }
    }

    public final void P0(C1704s0 c1704s0) {
        f fVar = this.f27751w;
        if (fVar != null) {
            fVar.P0(c1704s0);
        }
        f fVar2 = this.f27750v;
        if (fVar2 != null) {
            fVar2.P0(c1704s0);
        }
        this.f27750v = null;
    }

    public final void Q0(C1704s0 c1704s0) {
        C0 c9;
        f fVar;
        f fVar2 = this.f27750v;
        if (fVar2 == null || !AbstractC1853k0.e(fVar2, AbstractC1864o0.g0(c1704s0))) {
            if (this.f26475h.f26487u) {
                A a2 = new A();
                AbstractC0777k.y(this, new p029d.b(a2, this, c1704s0, 6));
                c9 = (C0) a2.f24539h;
            } else {
                c9 = null;
            }
            fVar = (f) c9;
        } else {
            fVar = fVar2;
        }
        if (fVar != null && fVar2 == null) {
            fVar.O0(c1704s0);
            fVar.Q0(c1704s0);
            f fVar3 = this.f27751w;
            if (fVar3 != null) {
                fVar3.P0(c1704s0);
            }
        } else if (fVar == null && fVar2 != null) {
            f fVar4 = this.f27751w;
            if (fVar4 != null) {
                fVar4.O0(c1704s0);
                fVar4.Q0(c1704s0);
            }
            fVar2.P0(c1704s0);
        } else if (!m.a(fVar, fVar2)) {
            if (fVar != null) {
                fVar.O0(c1704s0);
                fVar.Q0(c1704s0);
            }
            if (fVar2 != null) {
                fVar2.P0(c1704s0);
            }
        } else if (fVar != null) {
            fVar.Q0(c1704s0);
        } else {
            f fVar5 = this.f27751w;
            if (fVar5 != null) {
                fVar5.Q0(c1704s0);
            }
        }
        this.f27750v = fVar;
    }

    public final void R0(C1704s0 c1704s0) {
        f fVar = this.f27751w;
        if (fVar != null) {
            fVar.R0(c1704s0);
            return;
        }
        f fVar2 = this.f27750v;
        if (fVar2 != null) {
            fVar2.R0(c1704s0);
        }
    }

    @Override
    public final Object g() {
        return e.f27749a;
    }

    @Override
    public final void k(long j) {
        this.f27752x = j;
    }
}
