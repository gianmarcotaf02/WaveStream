package p020c0;

import java.util.Iterator;
import p201y6.a;

public final class M implements Iterator, a {

    public final K0 f18149h;

    public final int f18150i;
    public int j;

    public final int f18151k;

    public M(K0 k1, int i3, int i9) {
        this.f18149h = k1;
        this.f18150i = i9;
        this.j = i3;
        this.f18151k = k1.f18140o;
        if (k1.f18139n) {
            M0.f();
        }
    }

    @Override
    public final boolean hasNext() {
        return this.j < this.f18150i;
    }

    @Override
    public final Object next() {
        K0 k1 = this.f18149h;
        int i3 = k1.f18140o;
        int i9 = this.f18151k;
        if (i3 != i9) {
            M0.f();
        }
        int i10 = this.j;
        this.j = M0.a(k1.f18134h, i10) + i10;
        return new L0(k1, i10, i9);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
