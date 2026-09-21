package B;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends p137q0.o implements Q0.InterfaceC0788w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f519v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f520w;

    @Override // Q0.InterfaceC0788w
    public final int A(Q0.N n3, O0.Q q9, int i3) {
        int iZ = q9.Z(i3);
        int iK0 = !java.lang.Float.isNaN(this.f520w) ? n3.k0(this.f520w) : 0;
        return iZ < iK0 ? iK0 : iZ;
    }

    @Override // Q0.InterfaceC0788w
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        int iJ;
        int i3;
        if (java.lang.Float.isNaN(this.f519v) || p113n1.a.j(j) != 0) {
            iJ = p113n1.a.j(j);
        } else {
            int iK0 = u6.k0(this.f519v);
            iJ = p113n1.a.h(j);
            if (iK0 < 0) {
                iK0 = 0;
            }
            if (iK0 <= iJ) {
                iJ = iK0;
            }
        }
        int iH = p113n1.a.h(j);
        if (java.lang.Float.isNaN(this.f520w) || p113n1.a.i(j) != 0) {
            i3 = p113n1.a.i(j);
        } else {
            int iK1 = u6.k0(this.f520w);
            i3 = p113n1.a.g(j);
            int i9 = iK1 >= 0 ? iK1 : 0;
            if (i9 <= i3) {
                i3 = i9;
            }
        }
        O0.g0 g0VarC = q9.C(p113n1.b.a(iJ, iH, i3, p113n1.a.g(j)));
        return u6.q0(g0VarC.f7639h, g0VarC.f7640i, p078i6.x.f23206h, new B.C0073k(g0VarC, 4));
    }

    @Override // Q0.InterfaceC0788w
    public final int b0(Q0.N n3, O0.Q q9, int i3) {
        int iN = q9.n(i3);
        int iK0 = !java.lang.Float.isNaN(this.f519v) ? n3.k0(this.f519v) : 0;
        return iN < iK0 ? iK0 : iN;
    }

    @Override // Q0.InterfaceC0788w
    public final int j(Q0.N n3, O0.Q q9, int i3) {
        int iA = q9.a(i3);
        int iK0 = !java.lang.Float.isNaN(this.f520w) ? n3.k0(this.f520w) : 0;
        return iA < iK0 ? iK0 : iA;
    }

    @Override // Q0.InterfaceC0788w
    public final int t0(Q0.N n3, O0.Q q9, int i3) {
        int iZ = q9.z(i3);
        int iK0 = !java.lang.Float.isNaN(this.f519v) ? n3.k0(this.f519v) : 0;
        return iZ < iK0 ? iK0 : iZ;
    }
}
