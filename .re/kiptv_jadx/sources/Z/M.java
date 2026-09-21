package Z;

/* JADX INFO: loaded from: classes.dex */
public final class M extends p137q0.o implements Q0.InterfaceC0774h, Q0.InterfaceC0788w {
    @Override // Q0.InterfaceC0788w
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        float f9 = ((p113n1.f) Q0.AbstractC0777k.h(this, Z.H.f12235a)).f25552h;
        float f10 = 0;
        if (f9 < f10) {
            f9 = f10;
        }
        O0.g0 g0VarC = q9.C(j);
        boolean z6 = this.f26487u && !java.lang.Float.isNaN(f9) && p113n1.f.b(f9, f10) > 0;
        int iK0 = java.lang.Float.isNaN(f9) ? 0 : u6.k0(f9);
        int iMax = z6 ? java.lang.Math.max(g0VarC.f7639h, iK0) : g0VarC.f7639h;
        int iMax2 = z6 ? java.lang.Math.max(g0VarC.f7640i, iK0) : g0VarC.f7640i;
        return u6.q0(iMax, iMax2, p078i6.x.f23206h, new Z.L(iMax, g0VarC, iMax2));
    }
}
