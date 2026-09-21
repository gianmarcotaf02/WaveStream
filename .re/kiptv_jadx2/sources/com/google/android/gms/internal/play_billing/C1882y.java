package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

public final class C1882y extends AbstractC1874u {
    public final transient A j;

    public final transient C1884z f19401k;

    public C1882y(A a2, C1884z c1884z) {
        this.j = a2;
        this.f19401k = c1884z;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.j.get(obj) != null;
    }

    @Override
    public final int d(Object[] objArr) {
        return this.f19401k.d(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.f19401k.listIterator(0);
    }

    @Override
    public final r n() {
        return this.f19401k;
    }

    @Override
    public final int size() {
        return this.j.f19187m;
    }
}
