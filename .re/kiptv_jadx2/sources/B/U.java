package B;

import O0.g0;
import Q0.InterfaceC0788w;

public final class U extends p137q0.o implements InterfaceC0788w {

    public S f499v;

    @Override
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        float fA = this.f499v.a(u6.getLayoutDirection());
        S s9 = this.f499v;
        float f9 = s9.f493b;
        float fB = s9.b(u6.getLayoutDirection());
        float f10 = this.f499v.f495d;
        float f11 = 0;
        if (!((p113n1.f.b(f10, f11) >= 0) & (p113n1.f.b(fA, f11) >= 0) & (p113n1.f.b(f9, f11) >= 0) & (p113n1.f.b(fB, f11) >= 0))) {
            C.a.a("Padding must be non-negative");
        }
        int iK0 = u6.k0(fA);
        int iK1 = u6.k0(fB) + iK0;
        int iK2 = u6.k0(f9);
        int iK3 = u6.k0(f10) + iK2;
        g0 g0VarC = q9.C(p113n1.b.i(-iK1, -iK3, j));
        return u6.q0(p113n1.b.g(g0VarC.f7639h + iK1, j), p113n1.b.f(g0VarC.f7640i + iK3, j), p078i6.x.f23206h, new T(iK0, iK2, 0, g0VarC));
    }
}
