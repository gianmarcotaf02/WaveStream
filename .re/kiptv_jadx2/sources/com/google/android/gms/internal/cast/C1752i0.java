package com.google.android.gms.internal.cast;

import java.util.Objects;

public final class C1752i0 extends AbstractC1720a0 {
    public final transient Object[] j;

    public final transient int f18927k;

    public final transient int f18928l;

    public C1752i0(Object[] objArr, int i3, int i9) {
        this.j = objArr;
        this.f18927k = i3;
        this.f18928l = i9;
    }

    @Override
    public final Object get(int i3) {
        H.i(i3, this.f18928l);
        Object obj = this.j[i3 + i3 + this.f18927k];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.f18928l;
    }
}
