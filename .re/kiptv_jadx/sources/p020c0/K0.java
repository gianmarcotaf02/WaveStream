package p020c0;

/* JADX INFO: loaded from: classes.dex */
public final class K0 implements p129p0.c, java.lang.Iterable, p201y6.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18135i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18137l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f18139n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18140o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.util.HashMap f18142q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p136q.w f18143r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f18134h = new int[0];
    public java.lang.Object[] j = new java.lang.Object[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.Object f18138m = new java.lang.Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f18141p = new java.util.ArrayList();

    public final int d(p020c0.C1668a c1668a) {
        if (this.f18139n) {
            p020c0.AbstractC1705t.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!c1668a.a()) {
            p020c0.AbstractC1693m0.a("Anchor refers to a group that was removed");
        }
        return c1668a.f18215a;
    }

    public final void e() {
        this.f18142q = new java.util.HashMap();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new p020c0.M(this, 0, this.f18135i);
    }

    public final p020c0.J0 n() {
        if (this.f18139n) {
            throw new java.lang.IllegalStateException("Cannot read while a writer is pending");
        }
        this.f18137l++;
        return new p020c0.J0(this);
    }

    public final p020c0.N0 o() {
        if (this.f18139n) {
            p020c0.AbstractC1705t.a("Cannot start a writer when another writer is pending");
        }
        if (this.f18137l > 0) {
            p020c0.AbstractC1705t.a("Cannot start a writer when a reader is pending");
        }
        this.f18139n = true;
        this.f18140o++;
        return new p020c0.N0(this);
    }

    public final boolean p(p020c0.C1668a c1668a) {
        int iE;
        return c1668a.a() && (iE = p020c0.M0.e(this.f18141p, c1668a.f18215a, this.f18135i)) >= 0 && kotlin.jvm.internal.m.a(this.f18141p.get(iE), c1668a);
    }

    public final p020c0.N q(int i3) {
        int i9;
        java.util.ArrayList arrayList;
        int iE;
        java.util.HashMap map = this.f18142q;
        if (map != null) {
            if (this.f18139n) {
                p020c0.AbstractC1705t.a("use active SlotWriter to crate an anchor for location instead");
            }
            p020c0.C1668a c1668a = (i3 < 0 || i3 >= (i9 = this.f18135i) || (iE = p020c0.M0.e((arrayList = this.f18141p), i3, i9)) < 0) ? null : (p020c0.C1668a) arrayList.get(iE);
            if (c1668a != null) {
                return (p020c0.N) map.get(c1668a);
            }
        }
        return null;
    }
}
