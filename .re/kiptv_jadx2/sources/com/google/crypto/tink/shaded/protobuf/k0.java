package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class k0 extends AbstractList implements G, RandomAccess {

    public final F f19550h;

    public k0(F f9) {
        this.f19550h = f9;
    }

    @Override
    public final List b() {
        return Collections.unmodifiableList(this.f19550h.f19480i);
    }

    @Override
    public final G c() {
        return this;
    }

    @Override
    public final Object get(int i3) {
        return (String) this.f19550h.get(i3);
    }

    @Override
    public final Iterator iterator() {
        j0 j0Var = new j0();
        j0Var.f19543h = this.f19550h.iterator();
        return j0Var;
    }

    @Override
    public final void j(AbstractC1915j abstractC1915j) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final ListIterator listIterator(int i3) {
        i0 i0Var = new i0();
        i0Var.f19540h = this.f19550h.listIterator(i3);
        return i0Var;
    }

    @Override
    public final Object m(int i3) {
        return this.f19550h.f19480i.get(i3);
    }

    @Override
    public final int size() {
        return this.f19550h.size();
    }
}
