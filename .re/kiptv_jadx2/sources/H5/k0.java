package H5;

import java.util.List;
import java.util.Map;

public final class k0 {

    public final String f4242a;

    public final boolean f4243b;

    public final float f4244c;

    public final boolean f4245d;

    public final List f4246e;

    public final List f4247f;
    public final List g;

    public final Map f4248h;

    public final List f4249i;
    public final List j;

    public final List f4250k;

    public final M f4251l;

    public final String f4252m;

    public final Map f4253n;

    public final Map f4254o;

    public final List f4255p;

    public k0(String query, boolean z6, float f9, boolean z9, List movies, List series, List channels, Map categoryNames, List people, List programs, List recent, M filter, String tmdbImageBaseUrl, Map posterOverrides, Map variantCounts, List movieEntries) {
        kotlin.jvm.internal.m.e(query, "query");
        kotlin.jvm.internal.m.e(movies, "movies");
        kotlin.jvm.internal.m.e(series, "series");
        kotlin.jvm.internal.m.e(channels, "channels");
        kotlin.jvm.internal.m.e(categoryNames, "categoryNames");
        kotlin.jvm.internal.m.e(people, "people");
        kotlin.jvm.internal.m.e(programs, "programs");
        kotlin.jvm.internal.m.e(recent, "recent");
        kotlin.jvm.internal.m.e(filter, "filter");
        kotlin.jvm.internal.m.e(tmdbImageBaseUrl, "tmdbImageBaseUrl");
        kotlin.jvm.internal.m.e(posterOverrides, "posterOverrides");
        kotlin.jvm.internal.m.e(variantCounts, "variantCounts");
        kotlin.jvm.internal.m.e(movieEntries, "movieEntries");
        this.f4242a = query;
        this.f4243b = z6;
        this.f4244c = f9;
        this.f4245d = z9;
        this.f4246e = movies;
        this.f4247f = series;
        this.g = channels;
        this.f4248h = categoryNames;
        this.f4249i = people;
        this.j = programs;
        this.f4250k = recent;
        this.f4251l = filter;
        this.f4252m = tmdbImageBaseUrl;
        this.f4253n = posterOverrides;
        this.f4254o = variantCounts;
        this.f4255p = movieEntries;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.m.a(this.f4242a, k0Var.f4242a) && this.f4243b == k0Var.f4243b && Float.compare(this.f4244c, k0Var.f4244c) == 0 && this.f4245d == k0Var.f4245d && kotlin.jvm.internal.m.a(this.f4246e, k0Var.f4246e) && kotlin.jvm.internal.m.a(this.f4247f, k0Var.f4247f) && kotlin.jvm.internal.m.a(this.g, k0Var.g) && kotlin.jvm.internal.m.a(this.f4248h, k0Var.f4248h) && kotlin.jvm.internal.m.a(this.f4249i, k0Var.f4249i) && kotlin.jvm.internal.m.a(this.j, k0Var.j) && kotlin.jvm.internal.m.a(this.f4250k, k0Var.f4250k) && this.f4251l == k0Var.f4251l && kotlin.jvm.internal.m.a(this.f4252m, k0Var.f4252m) && kotlin.jvm.internal.m.a(this.f4253n, k0Var.f4253n) && kotlin.jvm.internal.m.a(this.f4254o, k0Var.f4254o) && kotlin.jvm.internal.m.a(this.f4255p, k0Var.f4255p);
    }

    public final int hashCode() {
        return this.f4255p.hashCode() + B2.a.c(B2.a.c(B2.a.a((this.f4251l.hashCode() + B2.a.b(B2.a.b(B2.a.b(B2.a.c(B2.a.b(B2.a.b(B2.a.b(p121o0.p.f(p121o0.p.c(this.f4244c, p121o0.p.f(this.f4242a.hashCode() * 31, 31, this.f4243b), 31), 31, this.f4245d), 31, this.f4246e), 31, this.f4247f), 31, this.g), 31, this.f4248h), 31, this.f4249i), 31, this.j), 31, this.f4250k)) * 31, 31, this.f4252m), 31, this.f4253n), 31, this.f4254o);
    }

    public final String toString() {
        return "TvSearchUiState(query=" + this.f4242a + ", isIndexing=" + this.f4243b + ", indexProgress=" + this.f4244c + ", isSearching=" + this.f4245d + ", movies=" + this.f4246e + ", series=" + this.f4247f + ", channels=" + this.g + ", categoryNames=" + this.f4248h + ", people=" + this.f4249i + ", programs=" + this.j + ", recent=" + this.f4250k + ", filter=" + this.f4251l + ", tmdbImageBaseUrl=" + this.f4252m + ", posterOverrides=" + this.f4253n + ", variantCounts=" + this.f4254o + ", movieEntries=" + this.f4255p + ")";
    }
}
