package p020c0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import p129p0.c;
import p136q.w;
import p201y6.a;

public final class K0 implements c, Iterable, a {

    public int f18135i;

    public int f18136k;

    public int f18137l;

    public boolean f18139n;

    public int f18140o;

    public HashMap f18142q;

    public w f18143r;

    public int[] f18134h = new int[0];
    public Object[] j = new Object[0];

    public final Object f18138m = new Object();

    public ArrayList f18141p = new ArrayList();

    public final int d(C1668a c1668a) {
        if (this.f18139n) {
            AbstractC1705t.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!c1668a.a()) {
            AbstractC1693m0.a("Anchor refers to a group that was removed");
        }
        return c1668a.f18215a;
    }

    public final void e() {
        this.f18142q = new HashMap();
    }

    @Override
    public final Iterator iterator() {
        return new M(this, 0, this.f18135i);
    }

    public final J0 n() {
        if (this.f18139n) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f18137l++;
        return new J0(this);
    }

    public final N0 o() {
        if (this.f18139n) {
            AbstractC1705t.a("Cannot start a writer when another writer is pending");
        }
        if (this.f18137l > 0) {
            AbstractC1705t.a("Cannot start a writer when a reader is pending");
        }
        this.f18139n = true;
        this.f18140o++;
        return new N0(this);
    }

    public final boolean p(C1668a c1668a) {
        int iE;
        return c1668a.a() && (iE = M0.e(this.f18141p, c1668a.f18215a, this.f18135i)) >= 0 && m.a(this.f18141p.get(iE), c1668a);
    }

    public final N q(int i3) {
        int i9;
        ArrayList arrayList;
        int iE;
        HashMap map = this.f18142q;
        if (map != null) {
            if (this.f18139n) {
                AbstractC1705t.a("use active SlotWriter to crate an anchor for location instead");
            }
            C1668a c1668a = (i3 < 0 || i3 >= (i9 = this.f18135i) || (iE = M0.e((arrayList = this.f18141p), i3, i9)) < 0) ? null : (C1668a) arrayList.get(iE);
            if (c1668a != null) {
                return (N) map.get(c1668a);
            }
        }
        return null;
    }
}
