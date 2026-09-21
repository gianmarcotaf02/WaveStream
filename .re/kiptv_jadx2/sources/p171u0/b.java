package p171u0;

import K0.C0656d;
import Q0.AbstractC0777k;
import Q0.H;
import Q0.InterfaceC0779m;
import Q0.j0;
import com.google.common.util.concurrent.AbstractC1903s;
import kotlin.jvm.internal.m;
import p020c0.C1704s0;
import p113n1.c;
import p113n1.n;
import p121o0.p;
import p137q0.o;
import p194x6.j;

public final class b extends o implements j0, a, InterfaceC0779m {

    public final c f28649v;

    public boolean f28650w;

    public j f28651x;

    public b(c cVar, j jVar) {
        this.f28649v = cVar;
        this.f28651x = jVar;
        cVar.f28652h = this;
    }

    @Override
    public final void H0() {
        N0();
    }

    @Override
    public final void I() {
        N0();
    }

    @Override
    public final void M() {
        N0();
    }

    public final void N0() {
        this.f28650w = false;
        this.f28649v.f28653i = null;
        AbstractC0777k.j(this);
    }

    @Override
    public final void T(H h9) {
        boolean z6 = this.f28650w;
        c cVar = this.f28649v;
        if (!z6) {
            cVar.f28653i = null;
            AbstractC0777k.p(this, new C0656d(this, cVar, 13));
            if (cVar.f28653i == null) {
                throw p.h("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f28650w = true;
        }
        C1704s0 c1704s0 = cVar.f28653i;
        m.b(c1704s0);
        ((j) c1704s0.f18362i).invoke(h9);
    }

    @Override
    public final void a() {
        N0();
    }

    @Override
    public final long d() {
        return AbstractC1903s.K(AbstractC0777k.r(this, 4).j);
    }

    @Override
    public final void f0() {
        N0();
    }

    @Override
    public final c getDensity() {
        return AbstractC0777k.t(this).f8226G;
    }

    @Override
    public final n getLayoutDirection() {
        return AbstractC0777k.t(this).H;
    }

    @Override
    public final void G0() {
    }
}
