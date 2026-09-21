package p005a5;

/* JADX INFO: renamed from: a5.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1402s6 extends p005a5.AbstractC1412t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f15074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f15075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15076c;

    public C1402s6(long j, java.lang.String userCode, java.lang.String str) {
        kotlin.jvm.internal.m.e(userCode, "userCode");
        this.f15074a = userCode;
        this.f15075b = str;
        this.f15076c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1402s6)) {
            return false;
        }
        p005a5.C1402s6 c1402s6 = (p005a5.C1402s6) obj;
        return kotlin.jvm.internal.m.a(this.f15074a, c1402s6.f15074a) && kotlin.jvm.internal.m.a(this.f15075b, c1402s6.f15075b) && this.f15076c == c1402s6.f15076c;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f15076c) + B2.a.a(this.f15074a.hashCode() * 31, 31, this.f15075b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Waiting(userCode=");
        sb.append(this.f15074a);
        sb.append(", verificationUrl=");
        sb.append(this.f15075b);
        sb.append(", expiresAtMs=");
        return Y6.f.g(this.f15076c, ")", sb);
    }
}
