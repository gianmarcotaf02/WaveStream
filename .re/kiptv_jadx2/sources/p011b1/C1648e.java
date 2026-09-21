package p011b1;

import Y6.f;
import kotlin.jvm.internal.m;
import p065h1.a;
import p121o0.p;

public final class C1648e {

    public final Object f17803a;

    public final int f17804b;

    public final int f17805c;

    public final String f17806d;

    public C1648e(Object obj, int i3, int i9, String str) {
        this.f17803a = obj;
        this.f17804b = i3;
        this.f17805c = i9;
        this.f17806d = str;
        if (i3 <= i9) {
            return;
        }
        a.a("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1648e)) {
            return false;
        }
        C1648e c1648e = (C1648e) obj;
        return m.a(this.f17803a, c1648e.f17803a) && this.f17804b == c1648e.f17804b && this.f17805c == c1648e.f17805c && m.a(this.f17806d, c1648e.f17806d);
    }

    public final int hashCode() {
        Object obj = this.f17803a;
        return this.f17806d.hashCode() + p.d(this.f17805c, p.d(this.f17804b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f17803a);
        sb.append(", start=");
        sb.append(this.f17804b);
        sb.append(", end=");
        sb.append(this.f17805c);
        sb.append(", tag=");
        return f.l(sb, this.f17806d, ')');
    }

    public C1648e(Object obj, int i3, int i9) {
        this(obj, i3, i9, "");
    }
}
