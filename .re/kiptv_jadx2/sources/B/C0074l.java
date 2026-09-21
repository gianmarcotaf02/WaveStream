package B;

import O0.g0;
import Q0.InterfaceC0788w;

public final class C0074l extends p137q0.o implements InterfaceC0788w {

    public float f545v;

    @Override
    public final int A(Q0.N n3, O0.Q q9, int i3) {
        return i3 != Integer.MAX_VALUE ? Math.round(i3 / this.f545v) : q9.Z(i3);
    }

    public final long N0(long j, boolean z6) {
        int iRound;
        int iG = p113n1.a.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.f545v)) <= 0) {
            return 0L;
        }
        if (!z6 || AbstractC0065c.h(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long O0(long j, boolean z6) {
        int iRound;
        int iH = p113n1.a.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.f545v)) <= 0) {
            return 0L;
        }
        if (!z6 || AbstractC0065c.h(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long P0(long j, boolean z6) {
        int i3 = p113n1.a.i(j);
        int iRound = Math.round(i3 * this.f545v);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z6 || AbstractC0065c.h(iRound, i3, j)) {
            return (((long) iRound) << 32) | (((long) i3) & 4294967295L);
        }
        return 0L;
    }

    public final long Q0(long j, boolean z6) {
        int iJ = p113n1.a.j(j);
        int iRound = Math.round(iJ / this.f545v);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z6 || AbstractC0065c.h(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        long jO0 = O0(j, true);
        if (p113n1.m.a(jO0, 0L)) {
            jO0 = N0(j, true);
            if (p113n1.m.a(jO0, 0L)) {
                jO0 = Q0(j, true);
                if (p113n1.m.a(jO0, 0L)) {
                    jO0 = P0(j, true);
                    if (p113n1.m.a(jO0, 0L)) {
                        jO0 = O0(j, false);
                        if (p113n1.m.a(jO0, 0L)) {
                            jO0 = N0(j, false);
                            if (p113n1.m.a(jO0, 0L)) {
                                jO0 = Q0(j, false);
                                if (p113n1.m.a(jO0, 0L)) {
                                    jO0 = P0(j, false);
                                    if (p113n1.m.a(jO0, 0L)) {
                                        jO0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!p113n1.m.a(jO0, 0L)) {
            int i3 = (int) (jO0 >> 32);
            int i9 = (int) (jO0 & 4294967295L);
            if (!((i9 >= 0) & (i3 >= 0))) {
                p113n1.j.a("width and height must be >= 0");
            }
            j = p113n1.b.h(i3, i3, i9, i9);
        }
        g0 g0VarC = q9.C(j);
        return u6.q0(g0VarC.f7639h, g0VarC.f7640i, p078i6.x.f23206h, new C0073k(g0VarC, 0));
    }

    @Override
    public final int b0(Q0.N n3, O0.Q q9, int i3) {
        return i3 != Integer.MAX_VALUE ? Math.round(i3 * this.f545v) : q9.n(i3);
    }

    @Override
    public final int j(Q0.N n3, O0.Q q9, int i3) {
        return i3 != Integer.MAX_VALUE ? Math.round(i3 / this.f545v) : q9.a(i3);
    }

    @Override
    public final int t0(Q0.N n3, O0.Q q9, int i3) {
        return i3 != Integer.MAX_VALUE ? Math.round(i3 * this.f545v) : q9.z(i3);
    }
}
