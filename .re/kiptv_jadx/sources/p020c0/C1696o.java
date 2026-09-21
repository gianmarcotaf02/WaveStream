package p020c0;

/* JADX INFO: renamed from: c0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1696o extends p020c0.AbstractC1709v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.HashSet f18293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.LinkedHashSet f18294e = new java.util.LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p020c0.C1681g0 f18295f = new p020c0.C1681g0(p089k0.j.f24422k, p020c0.C1676e.f18241l);
    public final /* synthetic */ p020c0.C1700q g;

    public C1696o(p020c0.C1700q c1700q, long j, boolean z6, boolean z9, p008a8.c cVar) {
        this.g = c1700q;
        this.f18290a = j;
        this.f18291b = z6;
        this.f18292c = z9;
    }

    @Override // p020c0.AbstractC1709v
    public final void a(p020c0.C1715y c1715y, p194x6.m mVar) {
        this.g.f18326b.a(c1715y, mVar);
    }

    @Override // p020c0.AbstractC1709v
    public final p136q.I b(p020c0.C1715y c1715y, p020c0.H0 h9, p194x6.m mVar) {
        return this.g.f18326b.b(c1715y, h9, mVar);
    }

    @Override // p020c0.AbstractC1709v
    public final void c() {
        this.g.f18305A--;
    }

    @Override // p020c0.AbstractC1709v
    public final boolean d() {
        return this.g.f18326b.d();
    }

    @Override // p020c0.AbstractC1709v
    public final boolean e() {
        return this.f18291b;
    }

    @Override // p020c0.AbstractC1709v
    public final boolean f() {
        return this.f18292c;
    }

    @Override // p020c0.AbstractC1709v
    public final long g() {
        return this.f18290a;
    }

    @Override // p020c0.AbstractC1709v
    public final p020c0.InterfaceC1707u h() {
        return this.g.f18331h;
    }

    @Override // p020c0.AbstractC1709v
    public final p020c0.InterfaceC1691l0 i() {
        return (p020c0.InterfaceC1691l0) this.f18295f.getValue();
    }

    @Override // p020c0.AbstractC1709v
    public final p100l6.h j() {
        return this.g.f18326b.j();
    }

    @Override // p020c0.AbstractC1709v
    public final boolean k() {
        return this.g.f18326b.k();
    }

    @Override // p020c0.AbstractC1709v
    public final void l(p020c0.C1715y c1715y) {
        p020c0.C1700q c1700q = this.g;
        c1700q.f18326b.l(c1700q.f18331h);
        c1700q.f18326b.l(c1715y);
    }

    @Override // p020c0.AbstractC1709v
    public final p020c0.V m(p020c0.W w6) {
        return this.g.f18326b.m(w6);
    }

    @Override // p020c0.AbstractC1709v
    public final p136q.I n(p020c0.C1715y c1715y, p020c0.H0 h9, p136q.I i3) {
        return this.g.f18326b.n(c1715y, h9, i3);
    }

    @Override // p020c0.AbstractC1709v
    public final void o(java.util.Set set) {
        java.util.HashSet hashSet = this.f18293d;
        if (hashSet == null) {
            hashSet = new java.util.HashSet();
            this.f18293d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // p020c0.AbstractC1709v
    public final void p(p020c0.C1700q c1700q) {
        this.f18294e.add(c1700q);
    }

    @Override // p020c0.AbstractC1709v
    public final void q(p020c0.C1701q0 c1701q0) {
        this.g.f18326b.q(c1701q0);
    }

    @Override // p020c0.AbstractC1709v
    public final void r(p020c0.C1715y c1715y) {
        this.g.f18326b.r(c1715y);
    }

    @Override // p020c0.AbstractC1709v
    public final p020c0.InterfaceC1678f s(A8.m mVar) {
        return this.g.f18326b.s(mVar);
    }

    @Override // p020c0.AbstractC1709v
    public final void t() {
        this.g.f18305A++;
    }

    @Override // p020c0.AbstractC1709v
    public final void u(p020c0.C1700q c1700q) {
        java.util.HashSet<java.util.Set> hashSet = this.f18293d;
        if (hashSet != null) {
            for (java.util.Set set : hashSet) {
                kotlin.jvm.internal.m.c(c1700q, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c1700q.z());
            }
        }
        java.util.LinkedHashSet linkedHashSet = this.f18294e;
        if ((linkedHashSet instanceof p201y6.a) && !(linkedHashSet instanceof p201y6.b)) {
            kotlin.jvm.internal.E.e(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
        linkedHashSet.remove(c1700q);
    }

    @Override // p020c0.AbstractC1709v
    public final void v(p020c0.C1715y c1715y) {
        this.g.f18326b.v(c1715y);
    }

    public final void w() {
        java.util.LinkedHashSet<p020c0.C1700q> linkedHashSet = this.f18294e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        java.util.HashSet hashSet = this.f18293d;
        if (hashSet != null) {
            for (p020c0.C1700q c1700q : linkedHashSet) {
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((java.util.Set) it.next()).remove(c1700q.z());
                }
            }
        }
        linkedHashSet.clear();
    }
}
