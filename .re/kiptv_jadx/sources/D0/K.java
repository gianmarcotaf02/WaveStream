package D0;

/* JADX INFO: loaded from: classes.dex */
public final class K extends D0.J {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f1821h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f1822i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p188x0.AbstractC3095o f1823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f1824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p188x0.AbstractC3095o f1825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f1826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f1827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f1830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f1831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f1832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float f1833u;

    public K(java.lang.String str, java.util.List list, int i3, p188x0.AbstractC3095o abstractC3095o, float f9, p188x0.AbstractC3095o abstractC3095o2, float f10, float f11, int i9, int i10, float f12, float f13, float f14, float f15) {
        this.f1821h = str;
        this.f1822i = list;
        this.j = i3;
        this.f1823k = abstractC3095o;
        this.f1824l = f9;
        this.f1825m = abstractC3095o2;
        this.f1826n = f10;
        this.f1827o = f11;
        this.f1828p = i9;
        this.f1829q = i10;
        this.f1830r = f12;
        this.f1831s = f13;
        this.f1832t = f14;
        this.f1833u = f15;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D0.K.class != obj.getClass()) {
            return false;
        }
        D0.K k9 = (D0.K) obj;
        return this.f1821h.equals(k9.f1821h) && kotlin.jvm.internal.m.a(this.f1823k, k9.f1823k) && this.f1824l == k9.f1824l && kotlin.jvm.internal.m.a(this.f1825m, k9.f1825m) && this.f1826n == k9.f1826n && this.f1827o == k9.f1827o && this.f1828p == k9.f1828p && this.f1829q == k9.f1829q && this.f1830r == k9.f1830r && this.f1831s == k9.f1831s && this.f1832t == k9.f1832t && this.f1833u == k9.f1833u && this.j == k9.j && kotlin.jvm.internal.m.a(this.f1822i, k9.f1822i);
    }

    public final int hashCode() {
        int iHashCode = (this.f1822i.hashCode() + (this.f1821h.hashCode() * 31)) * 31;
        p188x0.AbstractC3095o abstractC3095o = this.f1823k;
        int iC = p121o0.p.c(this.f1824l, (iHashCode + (abstractC3095o != null ? abstractC3095o.hashCode() : 0)) * 31, 31);
        p188x0.AbstractC3095o abstractC3095o2 = this.f1825m;
        return java.lang.Integer.hashCode(this.j) + p121o0.p.c(this.f1833u, p121o0.p.c(this.f1832t, p121o0.p.c(this.f1831s, p121o0.p.c(this.f1830r, p121o0.p.d(this.f1829q, p121o0.p.d(this.f1828p, p121o0.p.c(this.f1827o, p121o0.p.c(this.f1826n, (iC + (abstractC3095o2 != null ? abstractC3095o2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
