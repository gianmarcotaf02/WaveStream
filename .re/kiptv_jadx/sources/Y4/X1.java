package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f11774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f11775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11776c;

    public X1(java.lang.String baseUrl, java.lang.String username, java.lang.String password) {
        kotlin.jvm.internal.m.e(baseUrl, "baseUrl");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(password, "password");
        this.f11774a = baseUrl;
        this.f11775b = username;
        this.f11776c = password;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y4.X1)) {
            return false;
        }
        Y4.X1 x9 = (Y4.X1) obj;
        return kotlin.jvm.internal.m.a(this.f11774a, x9.f11774a) && kotlin.jvm.internal.m.a(this.f11775b, x9.f11775b) && kotlin.jvm.internal.m.a(this.f11776c, x9.f11776c);
    }

    public final int hashCode() {
        return this.f11776c.hashCode() + B2.a.a(this.f11774a.hashCode() * 31, 31, this.f11775b);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Credentials(baseUrl=");
        sb.append(this.f11774a);
        sb.append(", username=");
        sb.append(this.f11775b);
        sb.append(", password=");
        return Y6.f.m(sb, this.f11776c, ")");
    }
}
