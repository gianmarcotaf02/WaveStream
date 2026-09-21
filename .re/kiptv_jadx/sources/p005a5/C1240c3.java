package p005a5;

/* JADX INFO: renamed from: a5.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1240c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.kiptv.core.model.XtreamSeries f14290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f14291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14293d;

    public C1240c3(com.kiptv.core.model.XtreamSeries xtreamSeries, double d4, int i3, boolean z6) {
        this.f14290a = xtreamSeries;
        this.f14291b = d4;
        this.f14292c = i3;
        this.f14293d = z6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.C1240c3)) {
            return false;
        }
        p005a5.C1240c3 c1240c3 = (p005a5.C1240c3) obj;
        return kotlin.jvm.internal.m.a(this.f14290a, c1240c3.f14290a) && java.lang.Double.compare(this.f14291b, c1240c3.f14291b) == 0 && this.f14292c == c1240c3.f14292c && this.f14293d == c1240c3.f14293d;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.f14293d) + p121o0.p.d(this.f14292c, (java.lang.Double.hashCode(this.f14291b) + (this.f14290a.hashCode() * 31)) * 31, 31);
    }

    public final java.lang.String toString() {
        return "ScoredSeries(series=" + this.f14290a + ", score=" + this.f14291b + ", quality=" + this.f14292c + ", isAdult=" + this.f14293d + ")";
    }
}
