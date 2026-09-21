package p076i4;

import java.util.Iterator;

public abstract class g1 implements Iterator {

    public final Iterator f22901h;

    public g1(Iterator it) {
        it.getClass();
        this.f22901h = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.f22901h.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.f22901h.next());
    }

    @Override
    public final void remove() {
        this.f22901h.remove();
    }
}
