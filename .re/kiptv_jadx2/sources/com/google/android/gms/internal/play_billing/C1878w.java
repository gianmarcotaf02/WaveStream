package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

public final class C1878w extends r {
    public final C1880x j;

    public C1878w(C1880x c1880x) {
        Objects.requireNonNull(c1880x);
        this.j = c1880x;
    }

    @Override
    public final Object get(int i3) {
        C1880x c1880x = this.j;
        E8.d.b0(i3, c1880x.f19400l);
        int i9 = i3 + i3;
        Object[] objArr = c1880x.f19399k;
        Object obj = objArr[i9];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i9 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final int size() {
        return this.j.f19400l;
    }
}
