package D0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class H extends J implements Iterable, p201y6.a {

    public final String f1811h;

    public final float f1812i;
    public final float j;

    public final float f1813k;

    public final float f1814l;

    public final float f1815m;

    public final float f1816n;

    public final float f1817o;

    public final List f1818p;

    public final ArrayList f1819q;

    public H(String str, float f9, float f10, float f11, float f12, float f13, float f14, float f15, List list, ArrayList arrayList) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof H)) {
            return false;
        }
        H h9 = (H) obj;
        return kotlin.jvm.internal.m.a(this.f1811h, h9.f1811h) && this.f1812i == h9.f1812i && this.j == h9.j && this.f1813k == h9.f1813k && this.f1814l == h9.f1814l && this.f1815m == h9.f1815m && this.f1816n == h9.f1816n && this.f1817o == h9.f1817o && kotlin.jvm.internal.m.a(this.f1818p, h9.f1818p) && kotlin.jvm.internal.m.a(this.f1819q, h9.f1819q);
    }

    public final int hashCode() {
        return this.f1819q.hashCode() + B2.a.b(p121o0.p.c(this.f1817o, p121o0.p.c(this.f1816n, p121o0.p.c(this.f1815m, p121o0.p.c(this.f1814l, p121o0.p.c(this.f1813k, p121o0.p.c(this.j, p121o0.p.c(this.f1812i, this.f1811h.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f1818p);
    }

    @Override
    public final Iterator iterator() {
        return new G(this);
    }
}
