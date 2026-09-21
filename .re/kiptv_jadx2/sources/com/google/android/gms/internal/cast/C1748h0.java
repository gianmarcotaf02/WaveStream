package com.google.android.gms.internal.cast;

import java.util.Iterator;

public final class C1748h0 extends AbstractC1728c0 {

    public final transient C1756j0 f18916k;

    public final transient C1752i0 f18917l;

    public C1748h0(C1756j0 c1756j0, C1752i0 c1752i0) {
        this.f18916k = c1756j0;
        this.f18917l = c1752i0;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f18916k.get(obj) != null;
    }

    @Override
    public final int d(Object[] objArr) {
        return this.f18917l.d(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.f18917l.listIterator(0);
    }

    @Override
    public final int size() {
        return this.f18916k.f18936m;
    }
}
