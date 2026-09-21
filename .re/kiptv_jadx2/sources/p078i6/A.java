package p078i6;

import java.util.Iterator;
import p201y6.a;

public abstract class A implements Iterator, a {
    public abstract int a();

    @Override
    public final Object next() {
        return Integer.valueOf(a());
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
