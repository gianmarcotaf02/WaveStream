package com.google.android.gms.internal.play_billing;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class C1865p extends p004a4.g implements ListIterator {

    public final int f19369i;
    public int j;

    public final r f19370k;

    public C1865p(r rVar, int i3) {
        super(1);
        int size = rVar.size();
        E8.d.d0(i3, size);
        this.f19369i = size;
        this.j = i3;
        this.f19370k = rVar;
    }

    public final Object a(int i3) {
        return this.f19370k.get(i3);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.j < this.f19369i;
    }

    @Override
    public final boolean hasPrevious() {
        return this.j > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.j;
        this.j = i3 + 1;
        return a(i3);
    }

    @Override
    public final int nextIndex() {
        return this.j;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.j - 1;
        this.j = i3;
        return a(i3);
    }

    @Override
    public final int previousIndex() {
        return this.j - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
