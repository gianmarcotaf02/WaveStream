package p030d0;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p030d0.J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p030d0.E f21105d = new p030d0.E(1, 0, 2);

    @Override // p030d0.J
    public final void c(U.C0948v c0948v, p020c0.InterfaceC1672c interfaceC1672c, p020c0.N0 n3, p089k0.k kVar, p030d0.K k9) {
        int iF = c0948v.f(0);
        int i3 = n3.f18172v;
        int iN = n3.N(n3.f18154b, n3.r(i3));
        int iG = n3.g(n3.f18154b, n3.r(i3 + 1));
        for (int iMax = java.lang.Math.max(iN, iG - iF); iMax < iG; iMax++) {
            java.lang.Object obj = n3.f18155c[n3.h(iMax)];
            if (obj instanceof p020c0.D0) {
                kVar.e((p020c0.D0) obj);
            } else if (obj instanceof p020c0.C1701q0) {
                ((p020c0.C1701q0) obj).d();
            }
        }
        if (!(iF > 0)) {
            p020c0.AbstractC1705t.a("Check failed");
        }
        int i9 = n3.f18172v;
        int iN2 = n3.N(n3.f18154b, n3.r(i9));
        int iG2 = n3.g(n3.f18154b, n3.r(i9 + 1)) - iF;
        if (iG2 < iN2) {
            p020c0.AbstractC1705t.a("Check failed");
        }
        n3.J(iG2, iF, i9);
        int i10 = n3.f18160i;
        if (i10 >= iN2) {
            n3.f18160i = i10 - iF;
        }
    }
}
