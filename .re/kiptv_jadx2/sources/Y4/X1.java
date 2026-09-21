package Y4;

public final class X1 {

    public final String f11774a;

    public final String f11775b;

    public final String f11776c;

    public X1(String baseUrl, String username, String password) {
        kotlin.jvm.internal.m.e(baseUrl, "baseUrl");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(password, "password");
        this.f11774a = baseUrl;
        this.f11775b = username;
        this.f11776c = password;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X1)) {
            return false;
        }
        X1 x9 = (X1) obj;
        return kotlin.jvm.internal.m.a(this.f11774a, x9.f11774a) && kotlin.jvm.internal.m.a(this.f11775b, x9.f11775b) && kotlin.jvm.internal.m.a(this.f11776c, x9.f11776c);
    }

    public final int hashCode() {
        return this.f11776c.hashCode() + B2.a.a(this.f11774a.hashCode() * 31, 31, this.f11775b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Credentials(baseUrl=");
        sb.append(this.f11774a);
        sb.append(", username=");
        sb.append(this.f11775b);
        sb.append(", password=");
        return Y6.f.m(sb, this.f11776c, ")");
    }
}
