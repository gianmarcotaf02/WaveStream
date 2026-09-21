package H5;

import java.util.List;
import java.util.Map;

public final class p0 {

    public final List f4281a;

    public final List f4282b;

    public final List f4283c;

    public final List f4284d;

    public final Map f4285e;

    public final List f4286f;
    public final List g;

    public final List f4287h;

    public p0() {
        p078i6.w wVar = p078i6.w.f23205h;
        this(wVar, wVar, wVar, wVar, p078i6.x.f23206h, wVar, wVar, wVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.m.a(this.f4281a, p0Var.f4281a) && kotlin.jvm.internal.m.a(this.f4282b, p0Var.f4282b) && kotlin.jvm.internal.m.a(this.f4283c, p0Var.f4283c) && kotlin.jvm.internal.m.a(this.f4284d, p0Var.f4284d) && kotlin.jvm.internal.m.a(this.f4285e, p0Var.f4285e) && kotlin.jvm.internal.m.a(this.f4286f, p0Var.f4286f) && kotlin.jvm.internal.m.a(this.g, p0Var.g) && kotlin.jvm.internal.m.a(this.f4287h, p0Var.f4287h);
    }

    public final int hashCode() {
        return this.f4287h.hashCode() + B2.a.b(B2.a.b(B2.a.c(B2.a.b(B2.a.b(B2.a.b(this.f4281a.hashCode() * 31, 31, this.f4282b), 31, this.f4283c), 31, this.f4284d), 31, this.f4285e), 31, this.f4286f), 31, this.g);
    }

    public final String toString() {
        return "ResultBundle(movies=" + this.f4281a + ", movieHits=" + this.f4282b + ", movieEntries=" + this.f4283c + ", series=" + this.f4284d + ", variantCounts=" + this.f4285e + ", channels=" + this.f4286f + ", people=" + this.g + ", programs=" + this.f4287h + ")";
    }

    public p0(List movies, List movieHits, List movieEntries, List series, Map variantCounts, List channels, List people, List programs) {
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(movieHits, "movieHits");
        kotlin.jvm.internal.m.e(movieEntries, "movieEntries");
        kotlin.jvm.internal.m.e(series, "series");
        kotlin.jvm.internal.m.e(variantCounts, "variantCounts");
        kotlin.jvm.internal.m.e(channels, "channels");
        kotlin.jvm.internal.m.e(people, "people");
        kotlin.jvm.internal.m.e(programs, "programs");
        this.f4281a = movies;
        this.f4282b = movieHits;
        this.f4283c = movieEntries;
        this.f4284d = series;
        this.f4285e = variantCounts;
        this.f4286f = channels;
        this.g = people;
        this.f4287h = programs;
    }
}
