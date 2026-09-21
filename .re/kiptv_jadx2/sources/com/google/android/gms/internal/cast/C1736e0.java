package com.google.android.gms.internal.cast;

import java.util.Objects;

public final class C1736e0 extends AbstractC1720a0 {

    public static final C1736e0 f18895l = new C1736e0(new Object[0], 0);
    public final transient Object[] j;

    public final transient int f18896k;

    public C1736e0(Object[] objArr, int i3) {
        this.j = objArr;
        this.f18896k = i3;
    }

    @Override
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.j;
        int i3 = this.f18896k;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override
    public final int e() {
        return this.f18896k;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final Object get(int i3) {
        H.i(i3, this.f18896k);
        Object obj = this.j[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final Object[] n() {
        return this.j;
    }

    @Override
    public final int size() {
        return this.f18896k;
    }
}
