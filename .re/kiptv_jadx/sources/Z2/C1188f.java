package Z2;

/* JADX INFO: renamed from: Z2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1188f implements Z2.InterfaceC1186e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f12873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f12875e;

    public C1188f(int i3, int i9, boolean z6, boolean z9, java.lang.String str) {
        this.f12871a = i3;
        this.f12872b = i9;
        this.f12873c = z6;
        this.f12874d = z9;
        this.f12875e = str;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[RETURN] */
    @Override // Z2.InterfaceC1186e
    public final boolean a(Z2.AbstractC1181b0 abstractC1181b0) {
        int i3;
        int i9;
        boolean z6 = this.f12874d;
        java.lang.String strO = this.f12875e;
        if (z6 && strO == null) {
            strO = abstractC1181b0.o();
        }
        Z2.Z z9 = abstractC1181b0.f12870b;
        if (z9 != null) {
            java.util.Iterator it = z9.b().iterator();
            i9 = 0;
            i3 = 0;
            while (it.hasNext()) {
                Z2.AbstractC1181b0 abstractC1181b1 = (Z2.AbstractC1181b0) ((Z2.AbstractC1185d0) it.next());
                if (abstractC1181b1 == abstractC1181b0) {
                    i9 = i3;
                }
                if (strO == null || abstractC1181b1.o().equals(strO)) {
                    i3++;
                }
            }
        } else {
            i3 = 1;
            i9 = 0;
        }
        int i10 = this.f12873c ? i9 + 1 : i3 - i9;
        int i11 = this.f12871a;
        int i12 = this.f12872b;
        if (i11 == 0) {
            if (i10 == i12) {
                return true;
            }
            return false;
        }
        int i13 = i10 - i12;
        if (i13 % i11 == 0 && (java.lang.Integer.signum(i13) == 0 || java.lang.Integer.signum(i13) == java.lang.Integer.signum(i11))) {
            return true;
        }
        return false;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f12873c ? "" : "last-";
        boolean z6 = this.f12874d;
        int i3 = this.f12872b;
        int i9 = this.f12871a;
        return z6 ? java.lang.String.format("nth-%schild(%dn%+d of type <%s>)", str, java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i3), this.f12875e) : java.lang.String.format("nth-%schild(%dn%+d)", str, java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i3));
    }
}
