package H5;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f4281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f4282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f4283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f4284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Map f4285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f4286f;
    public final java.util.List g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f4287h;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p0() {
        p078i6.w wVar = p078i6.w.f23205h;
        this(wVar, wVar, wVar, wVar, p078i6.x.f23206h, wVar, wVar, wVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H5.p0)) {
            return false;
        }
        H5.p0 p0Var = (H5.p0) obj;
        return kotlin.jvm.internal.m.a(this.f4281a, p0Var.f4281a) && kotlin.jvm.internal.m.a(this.f4282b, p0Var.f4282b) && kotlin.jvm.internal.m.a(this.f4283c, p0Var.f4283c) && kotlin.jvm.internal.m.a(this.f4284d, p0Var.f4284d) && kotlin.jvm.internal.m.a(this.f4285e, p0Var.f4285e) && kotlin.jvm.internal.m.a(this.f4286f, p0Var.f4286f) && kotlin.jvm.internal.m.a(this.g, p0Var.g) && kotlin.jvm.internal.m.a(this.f4287h, p0Var.f4287h);
    }

    public final int hashCode() {
        return this.f4287h.hashCode() + B2.a.b(B2.a.b(B2.a.c(B2.a.b(B2.a.b(B2.a.b(this.f4281a.hashCode() * 31, 31, this.f4282b), 31, this.f4283c), 31, this.f4284d), 31, this.f4285e), 31, this.f4286f), 31, this.g);
    }

    public final java.lang.String toString() {
        return "ResultBundle(movies=" + this.f4281a + ", movieHits=" + this.f4282b + ", movieEntries=" + this.f4283c + ", series=" + this.f4284d + ", variantCounts=" + this.f4285e + ", channels=" + this.f4286f + ", people=" + this.g + ", programs=" + this.f4287h + ")";
    }

    public p0(java.util.List movies, java.util.List movieHits, java.util.List movieEntries, java.util.List series, java.util.Map variantCounts, java.util.List channels, java.util.List people, java.util.List programs) {
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
