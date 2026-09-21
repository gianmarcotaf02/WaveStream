package Z;

import Q0.InterfaceC0788w;
import p163t.C2748c;

public final class Q0 extends p137q0.o implements InterfaceC0788w {

    public float f12302A;

    public float f12303B;

    public p202z.k f12304v;

    public boolean f12305w;

    public boolean f12306x;
    public C2748c y;

    public C2748c f12307z;

    @Override
    public final boolean C0() {
        return false;
    }

    @Override
    public final void F0() {
        S7.C.A(B0(), null, new P0(this, null), 3);
    }

    @Override
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        float f9;
        boolean z6 = (q9.a(p113n1.a.h(j)) == 0 || q9.z(p113n1.a.g(j)) == 0) ? false : true;
        if (this.f12306x) {
            f9 = p010b0.k.f17619a;
        } else {
            f9 = (z6 || this.f12305w) ? I0.f12246a : I0.f12247b;
        }
        float fY = u6.Y(f9);
        C2748c c2748c = this.f12307z;
        int iFloatValue = (int) (c2748c != null ? ((Number) c2748c.d()).floatValue() : fY);
        if (!((iFloatValue >= 0) & (iFloatValue >= 0))) {
            p113n1.j.a("width and height must be >= 0");
        }
        O0.g0 g0VarC = q9.C(p113n1.b.h(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fY2 = u6.Y((I0.f12249d - u6.N(fY)) / 2.0f);
        float fY3 = u6.Y((I0.f12248c - I0.f12246a) - I0.f12250e);
        boolean z9 = this.f12306x;
        if (z9 && this.f12305w) {
            fY2 = fY3 - u6.Y(p010b0.k.f17623e);
        } else if (z9 && !this.f12305w) {
            fY2 = u6.Y(p010b0.k.f17623e);
        } else if (this.f12305w) {
            fY2 = fY3;
        }
        C2748c c2748c2 = this.f12307z;
        Float f10 = c2748c2 != null ? (Float) c2748c2.f27553e.getValue() : null;
        if (f10 == null || f10.floatValue() != fY) {
            S7.C.A(B0(), null, new M0(this, fY, null), 3);
        }
        C2748c c2748c3 = this.y;
        Float f11 = c2748c3 != null ? (Float) c2748c3.f27553e.getValue() : null;
        if (f11 == null || f11.floatValue() != fY2) {
            S7.C.A(B0(), null, new N0(this, fY2, null), 3);
        }
        if (Float.isNaN(this.f12303B) && Float.isNaN(this.f12302A)) {
            this.f12303B = fY;
            this.f12302A = fY2;
        }
        return u6.q0(iFloatValue, iFloatValue, p078i6.x.f23206h, new O0(g0VarC, this, fY2));
    }
}
