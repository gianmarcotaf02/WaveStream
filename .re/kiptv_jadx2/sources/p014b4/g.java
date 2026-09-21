package p014b4;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class g extends p implements ListIterator {

    public final int f17884h;

    public int f17885i;
    public final j j;

    public g(j jVar, int i3) {
        int size = jVar.size();
        if (i3 < 0 || i3 > size) {
            throw new IndexOutOfBoundsException(AbstractC1659a.g(i3, size, "index"));
        }
        this.f17884h = size;
        this.f17885i = i3;
        this.j = jVar;
    }

    public final Object a(int i3) {
        return this.j.get(i3);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.f17885i < this.f17884h;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f17885i > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f17885i;
        this.f17885i = i3 + 1;
        return a(i3);
    }

    @Override
    public final int nextIndex() {
        return this.f17885i;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f17885i - 1;
        this.f17885i = i3;
        return a(i3);
    }

    @Override
    public final int previousIndex() {
        return this.f17885i - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
