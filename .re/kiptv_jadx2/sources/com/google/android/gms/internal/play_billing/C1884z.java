package com.google.android.gms.internal.play_billing;

import java.util.Objects;

public final class C1884z extends r {
    public final transient Object[] j;

    public final transient int f19402k;

    public final transient int f19403l;

    public C1884z(Object[] objArr, int i3, int i9) {
        this.j = objArr;
        this.f19402k = i3;
        this.f19403l = i9;
    }

    @Override
    public final Object get(int i3) {
        E8.d.b0(i3, this.f19403l);
        Object obj = this.j[i3 + i3 + this.f19402k];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final int size() {
        return this.f19403l;
    }
}
