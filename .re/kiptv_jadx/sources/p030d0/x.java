package p030d0;

/* JADX INFO: loaded from: classes.dex */
public final class x extends p030d0.J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p030d0.x f21154d = new p030d0.x(0, 1, 1);

    @Override // p030d0.J
    public final void c(U.C0948v c0948v, p020c0.InterfaceC1672c interfaceC1672c, p020c0.N0 n3, p089k0.k kVar, p030d0.K k9) {
        p020c0.C1701q0 c1701q0 = (p020c0.C1701q0) c0948v.g(0);
        java.util.Set set = kVar.f24423a;
        if (set == null) {
            return;
        }
        p089k0.h hVar = new p089k0.h(set);
        p136q.H h9 = kVar.f24430i;
        if (h9 == null) {
            long[] jArr = p136q.P.f26351a;
            h9 = new p136q.H();
            kVar.f24430i = h9;
        }
        h9.m(c1701q0, hVar);
        kVar.f24427e.c(new p020c0.D0(hVar, -1));
    }
}
