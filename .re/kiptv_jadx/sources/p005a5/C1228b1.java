package p005a5;

/* JADX INFO: renamed from: a5.b1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1228b1 implements p005a5.InterfaceC1268f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f14239b;

    public C1228b1(java.lang.String accessToken, java.lang.String refreshToken) {
        kotlin.jvm.internal.m.e(accessToken, "accessToken");
        kotlin.jvm.internal.m.e(refreshToken, "refreshToken");
        this.f14238a = accessToken;
        this.f14239b = refreshToken;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1228b1)) {
            return false;
        }
        p005a5.C1228b1 c1228b1 = (p005a5.C1228b1) obj;
        return kotlin.jvm.internal.m.a(this.f14238a, c1228b1.f14238a) && kotlin.jvm.internal.m.a(this.f14239b, c1228b1.f14239b);
    }

    public final int hashCode() {
        return this.f14239b.hashCode() + (this.f14238a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Authenticated(accessToken=");
        sb.append(this.f14238a);
        sb.append(", refreshToken=");
        return Y6.f.m(sb, this.f14239b, ")");
    }
}
