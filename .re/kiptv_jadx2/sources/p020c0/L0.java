package p020c0;

import java.util.Iterator;
import kotlin.jvm.internal.m;
import p129p0.c;
import p201y6.a;

public final class L0 implements c, Iterable, a {

    public final K0 f18147h;

    public final int f18148i;
    public final int j;

    public L0(K0 k1, int i3, int i9) {
        this.f18147h = k1;
        this.f18148i = i3;
        this.j = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l2 = (L0) obj;
        return l2.f18148i == this.f18148i && l2.j == this.j && m.a(l2.f18147h, this.f18147h);
    }

    public final int hashCode() {
        return (this.f18147h.hashCode() * 31) + this.f18148i;
    }

    @Override
    public final Iterator iterator() {
        K0 k1 = this.f18147h;
        if (k1.f18140o != this.j) {
            M0.f();
        }
        int i3 = this.f18148i;
        k1.q(i3);
        return new M(k1, i3 + 1, k1.f18134h[(i3 * 5) + 3] + i3);
    }
}
