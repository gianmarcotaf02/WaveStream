package p030d0;

/* JADX INFO: renamed from: d0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2110e extends p030d0.J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p030d0.C2110e f21132d = new p030d0.C2110e(0, 2, 1);

    @Override // p030d0.J
    public final void c(U.C0948v c0948v, p020c0.InterfaceC1672c interfaceC1672c, p020c0.N0 n3, p089k0.k kVar, p030d0.K k9) {
        p020c0.C1668a c1668a = (p020c0.C1668a) c0948v.g(0);
        java.lang.Object objG = c0948v.g(1);
        if (objG instanceof p020c0.D0) {
            p020c0.D0 d4 = (p020c0.D0) objG;
            kVar.f24427e.c(d4);
            kVar.f24426d.a(d4);
        }
        if (n3.f18164n != 0) {
            p020c0.AbstractC1705t.a("Can only append a slot if not current inserting");
        }
        int i3 = n3.f18160i;
        int i9 = n3.j;
        int iC = n3.c(c1668a);
        int iG = n3.g(n3.f18154b, n3.r(iC + 1));
        n3.f18160i = iG;
        n3.j = iG;
        n3.x(1, iC);
        if (i3 >= iG) {
            i3++;
            i9++;
        }
        n3.f18155c[iG] = objG;
        n3.f18160i = i3;
        n3.j = i9;
    }
}
