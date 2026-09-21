package B;

/* JADX INFO: loaded from: classes.dex */
public final class B extends p137q0.o implements Q0.InterfaceC0788w {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public B.A f461v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f462w;

    @Override // Q0.InterfaceC0788w
    public final O0.T b(O0.U u6, O0.Q q9, long j) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!p113n1.a.d(j) || this.f461v == B.A.f458h) {
            iJ = p113n1.a.j(j);
            iH = p113n1.a.h(j);
        } else {
            int iRound = java.lang.Math.round(p113n1.a.h(j) * this.f462w);
            int iJ2 = p113n1.a.j(j);
            iJ = p113n1.a.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!p113n1.a.c(j) || this.f461v == B.A.f459i) {
            int i3 = p113n1.a.i(j);
            iG = p113n1.a.g(j);
            iG2 = i3;
        } else {
            int iRound2 = java.lang.Math.round(p113n1.a.g(j) * this.f462w);
            int i9 = p113n1.a.i(j);
            iG2 = p113n1.a.g(j);
            if (iRound2 < i9) {
                iRound2 = i9;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        O0.g0 g0VarC = q9.C(p113n1.b.a(iJ, iH, iG2, iG));
        return u6.q0(g0VarC.f7639h, g0VarC.f7640i, p078i6.x.f23206h, new B.C0073k(g0VarC, 1));
    }
}
