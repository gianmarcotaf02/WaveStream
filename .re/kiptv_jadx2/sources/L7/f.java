package L7;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class f implements Iterator {

    public boolean f7097h;

    public final int f7098i;
    public final g j;

    public f(g gVar) {
        this.j = gVar;
        this.f7098i = ((AbstractList) gVar).modCount;
    }

    public final void a() {
        g gVar = this.j;
        int i3 = ((AbstractList) gVar).modCount;
        int i9 = this.f7098i;
        if (i3 == i9) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) gVar).modCount + "; expected: " + i9);
    }

    @Override
    public final boolean hasNext() {
        return !this.f7097h;
    }

    @Override
    public final Object next() {
        if (this.f7097h) {
            throw new NoSuchElementException();
        }
        this.f7097h = true;
        a();
        return this.j.f7100i;
    }

    @Override
    public final void remove() {
        a();
        this.j.clear();
    }
}
