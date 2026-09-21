package p030d0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p030d0.J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p030d0.o f21142d = new p030d0.o(0, 1, 1);

    @Override // p030d0.J
    public final void c(U.C0948v c0948v, p020c0.InterfaceC1672c interfaceC1672c, p020c0.N0 n3, p089k0.k kVar, p030d0.K k9) {
        p038e0.e eVar;
        p020c0.C1701q0 c1701q0 = (p020c0.C1701q0) c0948v.g(0);
        p136q.H h9 = kVar.f24430i;
        if (h9 == null || ((p089k0.h) h9.g(c1701q0)) == null) {
            return;
        }
        java.util.ArrayList arrayList = kVar.j;
        if (arrayList != null && (eVar = (p038e0.e) arrayList.remove(arrayList.size() - 1)) != null) {
            kVar.f24427e = eVar;
        }
        h9.k(c1701q0);
    }
}
