package B;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends p137q0.o implements Q0.InterfaceC0788w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f513v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f514w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f515x;
    public float y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f516z;

    @Override // Q0.InterfaceC0788w
    public final int A(Q0.N n3, O0.Q q9, int i3) {
        long jN0 = N0(n3);
        if (p113n1.a.e(jN0)) {
            return p113n1.a.g(jN0);
        }
        if (!this.f516z) {
            i3 = p113n1.b.g(i3, jN0);
        }
        return p113n1.b.f(q9.Z(i3), jN0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long N0(O0.InterfaceC0728q interfaceC0728q) {
        int iK0;
        int iK1;
        int iK2;
        int i3 = 0;
        if (java.lang.Float.isNaN(this.f515x)) {
            iK0 = Integer.MAX_VALUE;
        } else {
            iK0 = interfaceC0728q.k0(this.f515x);
            if (iK0 < 0) {
                iK0 = 0;
            }
        }
        if (java.lang.Float.isNaN(this.y)) {
            iK1 = Integer.MAX_VALUE;
        } else {
            iK1 = interfaceC0728q.k0(this.y);
            if (iK1 < 0) {
                iK1 = 0;
            }
        }
        if (java.lang.Float.isNaN(this.f513v)) {
            iK2 = 0;
        } else {
            iK2 = interfaceC0728q.k0(this.f513v);
            if (iK2 < 0) {
                iK2 = 0;
            }
            if (iK2 > iK0) {
                iK2 = iK0;
            }
            if (iK2 == Integer.MAX_VALUE) {
                iK2 = 0;
            }
        }
        if (!java.lang.Float.isNaN(this.f514w)) {
            int iK3 = interfaceC0728q.k0(this.f514w);
            if (iK3 < 0) {
                iK3 = 0;
            }
            if (iK3 > iK1) {
                iK3 = iK1;
            }
            if (iK3 != Integer.MAX_VALUE) {
                i3 = iK3;
            }
        }
        return p113n1.b.a(iK2, iK0, i3, iK1);
    }

    @Override // Q0.InterfaceC0788w
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        int iJ;
        int iH;
        int i3;
        int iG;
        long jA;
        long jN0 = N0(u6);
        if (this.f516z) {
            jA = p113n1.b.e(j, jN0);
        } else {
            if (java.lang.Float.isNaN(this.f513v)) {
                iJ = p113n1.a.j(j);
                int iH2 = p113n1.a.h(jN0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = p113n1.a.j(jN0);
            }
            if (java.lang.Float.isNaN(this.f515x)) {
                iH = p113n1.a.h(j);
                int iJ2 = p113n1.a.j(jN0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = p113n1.a.h(jN0);
            }
            if (java.lang.Float.isNaN(this.f514w)) {
                i3 = p113n1.a.i(j);
                int iG2 = p113n1.a.g(jN0);
                if (i3 > iG2) {
                    i3 = iG2;
                }
            } else {
                i3 = p113n1.a.i(jN0);
            }
            if (java.lang.Float.isNaN(this.y)) {
                iG = p113n1.a.g(j);
                int i9 = p113n1.a.i(jN0);
                if (iG < i9) {
                    iG = i9;
                }
            } else {
                iG = p113n1.a.g(jN0);
            }
            jA = p113n1.b.a(iJ, iH, i3, iG);
        }
        O0.g0 g0VarC = q9.C(jA);
        return u6.q0(g0VarC.f7639h, g0VarC.f7640i, p078i6.x.f23206h, new B.C0073k(g0VarC, 3));
    }

    @Override // Q0.InterfaceC0788w
    public final int b0(Q0.N n3, O0.Q q9, int i3) {
        long jN0 = N0(n3);
        if (p113n1.a.f(jN0)) {
            return p113n1.a.h(jN0);
        }
        if (!this.f516z) {
            i3 = p113n1.b.f(i3, jN0);
        }
        return p113n1.b.g(q9.n(i3), jN0);
    }

    @Override // Q0.InterfaceC0788w
    public final int j(Q0.N n3, O0.Q q9, int i3) {
        long jN0 = N0(n3);
        if (p113n1.a.e(jN0)) {
            return p113n1.a.g(jN0);
        }
        if (!this.f516z) {
            i3 = p113n1.b.g(i3, jN0);
        }
        return p113n1.b.f(q9.a(i3), jN0);
    }

    @Override // Q0.InterfaceC0788w
    public final int t0(Q0.N n3, O0.Q q9, int i3) {
        long jN0 = N0(n3);
        if (p113n1.a.f(jN0)) {
            return p113n1.a.h(jN0);
        }
        if (!this.f516z) {
            i3 = p113n1.b.f(i3, jN0);
        }
        return p113n1.b.g(q9.z(i3), jN0);
    }
}
