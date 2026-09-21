package com.google.android.gms.internal.cast;

import java.util.AbstractMap;
import java.util.Objects;

public final class C1740f0 extends AbstractC1720a0 {
    public final C1744g0 j;

    public C1740f0(C1744g0 c1744g0) {
        this.j = c1744g0;
    }

    @Override
    public final Object get(int i3) {
        C1744g0 c1744g0 = this.j;
        H.i(i3, c1744g0.f18912m);
        int i9 = i3 + i3;
        Object[] objArr = c1744g0.f18911l;
        Object obj = objArr[i9];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final int size() {
        return this.j.f18912m;
    }
}
