package com.google.android.gms.internal.play_billing;

import java.util.Objects;

public final class C1876v extends r {

    public static final C1876v f19394l = new C1876v(new Object[0], 0);
    public final transient Object[] j;

    public final transient int f19395k;

    public C1876v(Object[] objArr, int i3) {
        this.j = objArr;
        this.f19395k = i3;
    }

    @Override
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.j;
        int i3 = this.f19395k;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override
    public final int e() {
        return this.f19395k;
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final Object get(int i3) {
        E8.d.b0(i3, this.f19395k);
        Object obj = this.j[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final Object[] p() {
        return this.j;
    }

    @Override
    public final int size() {
        return this.f19395k;
    }
}
