package p110m7;

import java.util.Iterator;

public final class G implements Iterator {

    public Iterator f25451h;

    @Override
    public final boolean hasNext() {
        return this.f25451h.hasNext();
    }

    @Override
    public final Object next() {
        return (String) this.f25451h.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
