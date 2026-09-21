package Y4;

public final class C1110s {

    public final int f12069a;

    public final String f12070b;

    public final String f12071c;

    public final String f12072d;

    public C1110s(int i3, String str, String str2, String str3) {
        this.f12069a = i3;
        this.f12070b = str;
        this.f12071c = str2;
        this.f12072d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1110s)) {
            return false;
        }
        C1110s c1110s = (C1110s) obj;
        return this.f12069a == c1110s.f12069a && kotlin.jvm.internal.m.a(this.f12070b, c1110s.f12070b) && kotlin.jvm.internal.m.a(this.f12071c, c1110s.f12071c) && kotlin.jvm.internal.m.a(this.f12072d, c1110s.f12072d);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(Integer.hashCode(this.f12069a) * 31, 31, this.f12070b), 31, this.f12071c);
        String str = this.f12072d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DownloadHttpResponse(statusCode=");
        sb.append(this.f12069a);
        sb.append(", body=");
        sb.append(this.f12070b);
        sb.append(", protocol=");
        sb.append(this.f12071c);
        sb.append(", location=");
        return Y6.f.m(sb, this.f12072d, ")");
    }
}
