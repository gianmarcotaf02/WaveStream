package Z2;

/* JADX INFO: renamed from: Z2.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1198k implements Z2.InterfaceC1186e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f12892b;

    public C1198k(boolean z6, java.lang.String str) {
        this.f12891a = z6;
        this.f12892b = str;
    }

    @Override // Z2.InterfaceC1186e
    public final boolean a(Z2.AbstractC1181b0 abstractC1181b0) {
        int i3;
        boolean z6 = this.f12891a;
        java.lang.String strO = this.f12892b;
        if (z6 && strO == null) {
            strO = abstractC1181b0.o();
        }
        Z2.Z z9 = abstractC1181b0.f12870b;
        if (z9 != null) {
            java.util.Iterator it = z9.b().iterator();
            i3 = 0;
            while (it.hasNext()) {
                Z2.AbstractC1181b0 abstractC1181b1 = (Z2.AbstractC1181b0) ((Z2.AbstractC1185d0) it.next());
                if (strO == null || abstractC1181b1.o().equals(strO)) {
                    i3++;
                }
            }
        } else {
            i3 = 1;
        }
        return i3 == 1;
    }

    public final java.lang.String toString() {
        return this.f12891a ? Y6.f.m(new java.lang.StringBuilder("only-of-type <"), this.f12892b, ">") : "only-child";
    }
}
