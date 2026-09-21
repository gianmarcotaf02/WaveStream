package com.google.android.gms.internal.cast;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class Y extends AbstractC1768m0 implements ListIterator {

    public final int f18845h;

    public int f18846i;
    public final AbstractC1720a0 j;

    public Y(AbstractC1720a0 abstractC1720a0, int i3) {
        int size = abstractC1720a0.size();
        H.l(i3, size);
        this.f18845h = size;
        this.f18846i = i3;
        this.j = abstractC1720a0;
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
        return this.f18846i < this.f18845h;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f18846i > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f18846i;
        this.f18846i = i3 + 1;
        return a(i3);
    }

    @Override
    public final int nextIndex() {
        return this.f18846i;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f18846i - 1;
        this.f18846i = i3;
        return a(i3);
    }

    @Override
    public final int previousIndex() {
        return this.f18846i - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
