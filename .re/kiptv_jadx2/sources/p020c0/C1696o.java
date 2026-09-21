package p020c0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.E;
import p008a8.c;
import p089k0.j;
import p100l6.h;
import p136q.I;
import p194x6.m;
import p201y6.a;
import p201y6.b;

public final class C1696o extends AbstractC1709v {

    public final long f18290a;

    public final boolean f18291b;

    public final boolean f18292c;

    public HashSet f18293d;

    public final LinkedHashSet f18294e = new LinkedHashSet();

    public final C1681g0 f18295f = new C1681g0(j.f24422k, C1676e.f18241l);
    public final C1700q g;

    public C1696o(C1700q c1700q, long j, boolean z6, boolean z9, c cVar) {
        this.g = c1700q;
        this.f18290a = j;
        this.f18291b = z6;
        this.f18292c = z9;
    }

    @Override
    public final void a(C1715y c1715y, m mVar) {
        this.g.f18326b.a(c1715y, mVar);
    }

    @Override
    public final I b(C1715y c1715y, H0 h9, m mVar) {
        return this.g.f18326b.b(c1715y, h9, mVar);
    }

    @Override
    public final void c() {
        this.g.f18305A--;
    }

    @Override
    public final boolean d() {
        return this.g.f18326b.d();
    }

    @Override
    public final boolean e() {
        return this.f18291b;
    }

    @Override
    public final boolean f() {
        return this.f18292c;
    }

    @Override
    public final long g() {
        return this.f18290a;
    }

    @Override
    public final InterfaceC1707u h() {
        return this.g.f18331h;
    }

    @Override
    public final InterfaceC1691l0 i() {
        return (InterfaceC1691l0) this.f18295f.getValue();
    }

    @Override
    public final h j() {
        return this.g.f18326b.j();
    }

    @Override
    public final boolean k() {
        return this.g.f18326b.k();
    }

    @Override
    public final void l(C1715y c1715y) {
        C1700q c1700q = this.g;
        c1700q.f18326b.l(c1700q.f18331h);
        c1700q.f18326b.l(c1715y);
    }

    @Override
    public final V m(W w6) {
        return this.g.f18326b.m(w6);
    }

    @Override
    public final I n(C1715y c1715y, H0 h9, I i3) {
        return this.g.f18326b.n(c1715y, h9, i3);
    }

    @Override
    public final void o(Set set) {
        HashSet hashSet = this.f18293d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f18293d = hashSet;
        }
        hashSet.add(set);
    }

    @Override
    public final void p(C1700q c1700q) {
        this.f18294e.add(c1700q);
    }

    @Override
    public final void q(C1701q0 c1701q0) {
        this.g.f18326b.q(c1701q0);
    }

    @Override
    public final void r(C1715y c1715y) {
        this.g.f18326b.r(c1715y);
    }

    @Override
    public final InterfaceC1678f s(A8.m mVar) {
        return this.g.f18326b.s(mVar);
    }

    @Override
    public final void t() {
        this.g.f18305A++;
    }

    @Override
    public final void u(C1700q c1700q) {
        HashSet<Set> hashSet = this.f18293d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                kotlin.jvm.internal.m.c(c1700q, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(c1700q.z());
            }
        }
        LinkedHashSet linkedHashSet = this.f18294e;
        if ((linkedHashSet instanceof a) && !(linkedHashSet instanceof b)) {
            E.e(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
        linkedHashSet.remove(c1700q);
    }

    @Override
    public final void v(C1715y c1715y) {
        this.g.f18326b.v(c1715y);
    }

    public final void w() {
        LinkedHashSet<C1700q> linkedHashSet = this.f18294e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f18293d;
        if (hashSet != null) {
            for (C1700q c1700q : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(c1700q.z());
                }
            }
        }
        linkedHashSet.clear();
    }
}
