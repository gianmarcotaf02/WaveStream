package J5;

/* JADX INFO: renamed from: J5.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0646x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J5.EnumC0605l f6612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f6613e;

    public C0646x1(boolean z6, boolean z9, boolean z10, J5.EnumC0605l enumC0605l, java.lang.String str) {
        this.f6609a = z6;
        this.f6610b = z9;
        this.f6611c = z10;
        this.f6612d = enumC0605l;
        this.f6613e = str;
    }

    public static J5.C0646x1 a(J5.C0646x1 c0646x1, boolean z6, boolean z9, boolean z10, J5.EnumC0605l enumC0605l, java.lang.String str, int i3) {
        if ((i3 & 1) != 0) {
            z6 = c0646x1.f6609a;
        }
        boolean z11 = z6;
        if ((i3 & 2) != 0) {
            z9 = c0646x1.f6610b;
        }
        boolean z12 = z9;
        if ((i3 & 4) != 0) {
            z10 = c0646x1.f6611c;
        }
        boolean z13 = z10;
        if ((i3 & 8) != 0) {
            enumC0605l = c0646x1.f6612d;
        }
        J5.EnumC0605l enumC0605l2 = enumC0605l;
        if ((i3 & 16) != 0) {
            str = c0646x1.f6613e;
        }
        c0646x1.getClass();
        return new J5.C0646x1(z11, z12, z13, enumC0605l2, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J5.C0646x1)) {
            return false;
        }
        J5.C0646x1 c0646x1 = (J5.C0646x1) obj;
        return this.f6609a == c0646x1.f6609a && this.f6610b == c0646x1.f6610b && this.f6611c == c0646x1.f6611c && this.f6612d == c0646x1.f6612d && kotlin.jvm.internal.m.a(this.f6613e, c0646x1.f6613e);
    }

    public final int hashCode() {
        int iF = p121o0.p.f(p121o0.p.f(java.lang.Boolean.hashCode(this.f6609a) * 31, 31, this.f6610b), 31, this.f6611c);
        J5.EnumC0605l enumC0605l = this.f6612d;
        int iHashCode = (iF + (enumC0605l == null ? 0 : enumC0605l.hashCode())) * 31;
        java.lang.String str = this.f6613e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvParentalUiState(isEnabled=");
        sb.append(this.f6609a);
        sb.append(", hasPin=");
        sb.append(this.f6610b);
        sb.append(", requirePinForSettings=");
        sb.append(this.f6611c);
        sb.append(", pinDialog=");
        sb.append(this.f6612d);
        sb.append(", error=");
        return Y6.f.m(sb, this.f6613e, ")");
    }
}
