package Y4;

/* JADX INFO: renamed from: Y4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1110s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f12070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f12071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f12072d;

    public C1110s(int i3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f12069a = i3;
        this.f12070b = str;
        this.f12071c = str2;
        this.f12072d = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y4.C1110s)) {
            return false;
        }
        Y4.C1110s c1110s = (Y4.C1110s) obj;
        return this.f12069a == c1110s.f12069a && kotlin.jvm.internal.m.a(this.f12070b, c1110s.f12070b) && kotlin.jvm.internal.m.a(this.f12071c, c1110s.f12071c) && kotlin.jvm.internal.m.a(this.f12072d, c1110s.f12072d);
    }

    public final int hashCode() {
        int iA = B2.a.a(B2.a.a(java.lang.Integer.hashCode(this.f12069a) * 31, 31, this.f12070b), 31, this.f12071c);
        java.lang.String str = this.f12072d;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DownloadHttpResponse(statusCode=");
        sb.append(this.f12069a);
        sb.append(", body=");
        sb.append(this.f12070b);
        sb.append(", protocol=");
        sb.append(this.f12071c);
        sb.append(", location=");
        return Y6.f.m(sb, this.f12072d, ")");
    }
}
