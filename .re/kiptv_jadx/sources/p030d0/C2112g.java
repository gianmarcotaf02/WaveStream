package p030d0;

/* JADX INFO: renamed from: d0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2112g extends p030d0.J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p030d0.C2112g f21134d = new p030d0.C2112g(0, 2, 1);

    @Override // p030d0.J
    public final void c(U.C0948v c0948v, p020c0.InterfaceC1672c interfaceC1672c, p020c0.N0 n3, p089k0.k kVar, p030d0.K k9) {
        int i3 = ((p089k0.g) c0948v.g(0)).f24414a;
        java.util.List list = (java.util.List) c0948v.g(1);
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            java.lang.Object obj = list.get(i9);
            int i10 = i3 + i9;
            interfaceC1672c.c(i10, obj);
            interfaceC1672c.k(i10, obj);
        }
    }
}
