package J5;

/* JADX INFO: renamed from: J5.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0639v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f6586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f6587b;

    public C0639v0(java.lang.String str) {
        this.f6586a = str;
        this.f6587b = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J5.C0639v0)) {
            return false;
        }
        J5.C0639v0 c0639v0 = (J5.C0639v0) obj;
        return kotlin.jvm.internal.m.a(this.f6586a, c0639v0.f6586a) && kotlin.jvm.internal.m.a(this.f6587b, c0639v0.f6587b);
    }

    public final int hashCode() {
        int iHashCode = this.f6586a.hashCode() * 31;
        java.lang.String str = this.f6587b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TvCredit(name=");
        sb.append(this.f6586a);
        sb.append(", license=");
        return Y6.f.m(sb, this.f6587b, ")");
    }

    public C0639v0(java.lang.String str, java.lang.String str2) {
        this.f6586a = str;
        this.f6587b = str2;
    }
}
