package p056g0;

import java.util.ListIterator;

public abstract class a implements ListIterator, p201y6.a {

    public int f21748h;

    public int f21749i;

    public a(int i3, int i9) {
        this.f21748h = i3;
        this.f21749i = i9;
    }

    @Override
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasNext() {
        return this.f21748h < this.f21749i;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f21748h > 0;
    }

    @Override
    public final int nextIndex() {
        return this.f21748h;
    }

    @Override
    public final int previousIndex() {
        return this.f21748h - 1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
