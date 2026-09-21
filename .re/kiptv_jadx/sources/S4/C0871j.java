package S4;

/* JADX INFO: renamed from: S4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0871j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f9402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f9403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f9404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f9405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f9406f;
    public final S4.C0870i g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9407h;

    public C0871j(int i3, java.lang.String name, java.lang.String str, java.lang.String str2, java.util.List list, java.util.ArrayList arrayList, S4.C0870i c0870i, java.lang.String str3) {
        kotlin.jvm.internal.m.e(name, "name");
        this.f9401a = i3;
        this.f9402b = name;
        this.f9403c = str;
        this.f9404d = str2;
        this.f9405e = list;
        this.f9406f = arrayList;
        this.g = c0870i;
        this.f9407h = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S4.C0871j)) {
            return false;
        }
        S4.C0871j c0871j = (S4.C0871j) obj;
        return this.f9401a == c0871j.f9401a && kotlin.jvm.internal.m.a(this.f9402b, c0871j.f9402b) && kotlin.jvm.internal.m.a(this.f9403c, c0871j.f9403c) && kotlin.jvm.internal.m.a(this.f9404d, c0871j.f9404d) && this.f9405e.equals(c0871j.f9405e) && this.f9406f.equals(c0871j.f9406f) && kotlin.jvm.internal.m.a(this.g, c0871j.g) && kotlin.jvm.internal.m.a(this.f9407h, c0871j.f9407h);
    }

    public final int hashCode() {
        int iA = B2.a.a(java.lang.Integer.hashCode(this.f9401a) * 31, 31, this.f9402b);
        java.lang.String str = this.f9403c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f9404d;
        int iHashCode2 = (this.f9406f.hashCode() + B2.a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f9405e)) * 31;
        S4.C0870i c0870i = this.g;
        int iHashCode3 = (iHashCode2 + (c0870i == null ? 0 : c0870i.hashCode())) * 31;
        java.lang.String str3 = this.f9407h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentVariantRow(id=");
        sb.append(this.f9401a);
        sb.append(", name=");
        sb.append(this.f9402b);
        sb.append(", categoryName=");
        sb.append(this.f9403c);
        sb.append(", qualityBadge=");
        sb.append(this.f9404d);
        sb.append(", languageBadges=");
        sb.append(this.f9405e);
        sb.append(", regionFlags=");
        sb.append(this.f9406f);
        sb.append(", progress=");
        sb.append(this.g);
        sb.append(", posterUrl=");
        return Y6.f.m(sb, this.f9407h, ")");
    }
}
