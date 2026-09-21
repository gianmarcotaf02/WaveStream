package S4;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class x {
    public static final v Companion = new v();

    public static final ConcurrentHashMap f9477k = new ConcurrentHashMap();

    public final Map f9478a;

    public final Map f9479b;

    public final Map f9480c;

    public final Map f9481d;

    public final Map f9482e;

    public final Map f9483f;
    public final List g;

    public final List f9484h;

    public final List f9485i;
    public final int j;

    public x(Map byNormalized, Map byYear, Map byTmdbId, Map byPrefix, Map byKeyword, Map byContains, List list, List list2, List list3, int i3) {
        kotlin.jvm.internal.m.e(byNormalized, "byNormalized");
        kotlin.jvm.internal.m.e(byYear, "byYear");
        kotlin.jvm.internal.m.e(byTmdbId, "byTmdbId");
        kotlin.jvm.internal.m.e(byPrefix, "byPrefix");
        kotlin.jvm.internal.m.e(byKeyword, "byKeyword");
        kotlin.jvm.internal.m.e(byContains, "byContains");
        this.f9478a = byNormalized;
        this.f9479b = byYear;
        this.f9480c = byTmdbId;
        this.f9481d = byPrefix;
        this.f9482e = byKeyword;
        this.f9483f = byContains;
        this.g = list;
        this.f9484h = list2;
        this.f9485i = list3;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.m.a(this.f9478a, xVar.f9478a) && kotlin.jvm.internal.m.a(this.f9479b, xVar.f9479b) && kotlin.jvm.internal.m.a(this.f9480c, xVar.f9480c) && kotlin.jvm.internal.m.a(this.f9481d, xVar.f9481d) && kotlin.jvm.internal.m.a(this.f9482e, xVar.f9482e) && kotlin.jvm.internal.m.a(this.f9483f, xVar.f9483f) && kotlin.jvm.internal.m.a(this.g, xVar.g) && kotlin.jvm.internal.m.a(this.f9484h, xVar.f9484h) && kotlin.jvm.internal.m.a(this.f9485i, xVar.f9485i) && this.j == xVar.j;
    }

    public final int hashCode() {
        int iB = B2.a.b(B2.a.c(B2.a.c(B2.a.c(B2.a.c(B2.a.c(this.f9478a.hashCode() * 31, 31, this.f9479b), 31, this.f9480c), 31, this.f9481d), 31, this.f9482e), 31, this.f9483f), 31, this.g);
        List list = this.f9484h;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f9485i;
        return Integer.hashCode(this.j) + ((iHashCode + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistIndex(byNormalized=");
        sb.append(this.f9478a);
        sb.append(", byYear=");
        sb.append(this.f9479b);
        sb.append(", byTmdbId=");
        sb.append(this.f9480c);
        sb.append(", byPrefix=");
        sb.append(this.f9481d);
        sb.append(", byKeyword=");
        sb.append(this.f9482e);
        sb.append(", byContains=");
        sb.append(this.f9483f);
        sb.append(", allEntries=");
        sb.append(this.g);
        sb.append(", movies=");
        sb.append(this.f9484h);
        sb.append(", series=");
        sb.append(this.f9485i);
        sb.append(", totalSize=");
        return Y6.f.k(sb, this.j, ")");
    }
}
