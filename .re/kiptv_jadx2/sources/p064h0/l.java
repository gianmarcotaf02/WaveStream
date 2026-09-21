package p064h0;

import java.util.Iterator;
import p201y6.a;

public abstract class l implements Iterator, a {

    public Object[] f22451h = k.f22446e.f22450d;

    public int f22452i;
    public int j;

    public final void a(Object[] objArr, int i3, int i9) {
        this.f22451h = objArr;
        this.f22452i = i3;
        this.j = i9;
    }

    @Override
    public final boolean hasNext() {
        return this.j < this.f22452i;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
