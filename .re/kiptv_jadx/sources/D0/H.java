package D0;

/* JADX INFO: loaded from: classes.dex */
public final class H extends D0.J implements java.lang.Iterable, p201y6.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f1811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1812i;
    public final float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f1813k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f1814l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f1815m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f1816n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f1817o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.List f1818p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f1819q;

    public H(java.lang.String str, float f9, float f10, float f11, float f12, float f13, float f14, float f15, java.util.List list, java.util.ArrayList arrayList) {
        this.f1811h = str;
        this.f1812i = f9;
        this.j = f10;
        this.f1813k = f11;
        this.f1814l = f12;
        this.f1815m = f13;
        this.f1816n = f14;
        this.f1817o = f15;
        this.f1818p = list;
        this.f1819q = arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof D0.H)) {
            return false;
        }
        D0.H h9 = (D0.H) obj;
        return kotlin.jvm.internal.m.a(this.f1811h, h9.f1811h) && this.f1812i == h9.f1812i && this.j == h9.j && this.f1813k == h9.f1813k && this.f1814l == h9.f1814l && this.f1815m == h9.f1815m && this.f1816n == h9.f1816n && this.f1817o == h9.f1817o && kotlin.jvm.internal.m.a(this.f1818p, h9.f1818p) && kotlin.jvm.internal.m.a(this.f1819q, h9.f1819q);
    }

    public final int hashCode() {
        return this.f1819q.hashCode() + B2.a.b(p121o0.p.c(this.f1817o, p121o0.p.c(this.f1816n, p121o0.p.c(this.f1815m, p121o0.p.c(this.f1814l, p121o0.p.c(this.f1813k, p121o0.p.c(this.j, p121o0.p.c(this.f1812i, this.f1811h.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f1818p);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new D0.G(this);
    }
}
