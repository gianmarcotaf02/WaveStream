package Y4;

public final class F2 {

    public final String f11591a;

    public final String f11592b;

    public final String f11593c;

    public final String f11594d;

    public F2(String baseUrl, String username, String password, String streamId) {
        kotlin.jvm.internal.m.e(baseUrl, "baseUrl");
        kotlin.jvm.internal.m.e(username, "username");
        kotlin.jvm.internal.m.e(password, "password");
        kotlin.jvm.internal.m.e(streamId, "streamId");
        this.f11591a = baseUrl;
        this.f11592b = username;
        this.f11593c = password;
        this.f11594d = streamId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F2)) {
            return false;
        }
        F2 f9 = (F2) obj;
        return kotlin.jvm.internal.m.a(this.f11591a, f9.f11591a) && kotlin.jvm.internal.m.a(this.f11592b, f9.f11592b) && kotlin.jvm.internal.m.a(this.f11593c, f9.f11593c) && kotlin.jvm.internal.m.a(this.f11594d, f9.f11594d);
    }

    public final int hashCode() {
        return this.f11594d.hashCode() + B2.a.a(B2.a.a(this.f11591a.hashCode() * 31, 31, this.f11592b), 31, this.f11593c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XtreamStreamParsed(baseUrl=");
        sb.append(this.f11591a);
        sb.append(", username=");
        sb.append(this.f11592b);
        sb.append(", password=");
        sb.append(this.f11593c);
        sb.append(", streamId=");
        return Y6.f.m(sb, this.f11594d, ")");
    }
}
