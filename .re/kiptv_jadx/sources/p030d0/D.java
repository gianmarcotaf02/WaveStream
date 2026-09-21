package p030d0;

/* JADX INFO: loaded from: classes.dex */
public final class D extends p030d0.J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p030d0.D f21104d = new p030d0.D(0, 1, 1);

    @Override // p030d0.J
    public final void c(U.C0948v c0948v, p020c0.InterfaceC1672c interfaceC1672c, p020c0.N0 n3, p089k0.k kVar, p030d0.K k9) {
        p020c0.C1701q0 c1701q0 = (p020c0.C1701q0) c0948v.g(0);
        p136q.H h9 = kVar.f24430i;
        p089k0.h hVar = h9 != null ? (p089k0.h) h9.g(c1701q0) : null;
        if (hVar != null) {
            java.util.ArrayList arrayList = kVar.j;
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                kVar.j = arrayList;
            }
            arrayList.add(kVar.f24427e);
            kVar.f24427e = hVar.f24416i;
        }
    }
}
