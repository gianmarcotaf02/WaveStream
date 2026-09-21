package p110m7;

import java.util.ListIterator;

public final class F implements ListIterator {

    public ListIterator f25450h;

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.f25450h.hasNext();
    }

    @Override
    public final boolean hasPrevious() {
        return this.f25450h.hasPrevious();
    }

    @Override
    public final Object next() {
        return (String) this.f25450h.next();
    }

    @Override
    public final int nextIndex() {
        return this.f25450h.nextIndex();
    }

    @Override
    public final Object previous() {
        return (String) this.f25450h.previous();
    }

    @Override
    public final int previousIndex() {
        return this.f25450h.previousIndex();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
