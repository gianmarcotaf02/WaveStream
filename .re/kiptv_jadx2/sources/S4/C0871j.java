package S4;

import java.util.ArrayList;
import java.util.List;

public final class C0871j {

    public final int f9401a;

    public final String f9402b;

    public final String f9403c;

    public final String f9404d;

    public final List f9405e;

    public final ArrayList f9406f;
    public final C0870i g;

    public final String f9407h;

    public C0871j(int i3, String name, String str, String str2, List list, ArrayList arrayList, C0870i c0870i, String str3) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0871j)) {
            return false;
        }
        C0871j c0871j = (C0871j) obj;
        return this.f9401a == c0871j.f9401a && kotlin.jvm.internal.m.a(this.f9402b, c0871j.f9402b) && kotlin.jvm.internal.m.a(this.f9403c, c0871j.f9403c) && kotlin.jvm.internal.m.a(this.f9404d, c0871j.f9404d) && this.f9405e.equals(c0871j.f9405e) && this.f9406f.equals(c0871j.f9406f) && kotlin.jvm.internal.m.a(this.g, c0871j.g) && kotlin.jvm.internal.m.a(this.f9407h, c0871j.f9407h);
    }

    public final int hashCode() {
        int iA = B2.a.a(Integer.hashCode(this.f9401a) * 31, 31, this.f9402b);
        String str = this.f9403c;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9404d;
        int iHashCode2 = (this.f9406f.hashCode() + B2.a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f9405e)) * 31;
        C0870i c0870i = this.g;
        int iHashCode3 = (iHashCode2 + (c0870i == null ? 0 : c0870i.hashCode())) * 31;
        String str3 = this.f9407h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentVariantRow(id=");
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
