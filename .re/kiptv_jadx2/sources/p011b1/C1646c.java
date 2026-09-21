package p011b1;

import Y6.f;
import kotlin.jvm.internal.m;
import p121o0.p;

public final class C1646c {

    public final Object f17797a;

    public final int f17798b;

    public final int f17799c;

    public final String f17800d;

    public C1646c(Object obj, int i3, int i9, String str) {
        this.f17797a = obj;
        this.f17798b = i3;
        this.f17799c = i9;
        this.f17800d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1646c)) {
            return false;
        }
        C1646c c1646c = (C1646c) obj;
        return m.a(this.f17797a, c1646c.f17797a) && this.f17798b == c1646c.f17798b && this.f17799c == c1646c.f17799c && m.a(this.f17800d, c1646c.f17800d);
    }

    public final int hashCode() {
        Object obj = this.f17797a;
        return this.f17800d.hashCode() + p.d(this.f17799c, p.d(this.f17798b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f17797a);
        sb.append(", start=");
        sb.append(this.f17798b);
        sb.append(", end=");
        sb.append(this.f17799c);
        sb.append(", tag=");
        return f.l(sb, this.f17800d, ')');
    }
}
