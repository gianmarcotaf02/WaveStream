package Z2;

/* JADX INFO: renamed from: Z2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1194i implements Z2.InterfaceC1186e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.List f12889a;

    @Override // Z2.InterfaceC1186e
    public final boolean a(Z2.AbstractC1181b0 abstractC1181b0) {
        java.util.Iterator it = this.f12889a.iterator();
        while (it.hasNext()) {
            if (Y2.C1038h.n((Z2.C1204n) it.next(), abstractC1181b0)) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String toString() {
        return "not(" + this.f12889a + ")";
    }
}
