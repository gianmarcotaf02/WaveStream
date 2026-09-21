package com.google.android.gms.internal.cast;

public final class Z extends AbstractC1720a0 {
    public final transient int j;

    public final transient int f18852k;

    public final AbstractC1720a0 f18853l;

    public Z(AbstractC1720a0 abstractC1720a0, int i3, int i9) {
        this.f18853l = abstractC1720a0;
        this.j = i3;
        this.f18852k = i9;
    }

    @Override
    public final int e() {
        return this.f18853l.f() + this.j + this.f18852k;
    }

    @Override
    public final int f() {
        return this.f18853l.f() + this.j;
    }

    @Override
    public final Object get(int i3) {
        H.i(i3, this.f18852k);
        return this.f18853l.get(i3 + this.j);
    }

    @Override
    public final Object[] n() {
        return this.f18853l.n();
    }

    @Override
    public final AbstractC1720a0 subList(int i3, int i9) {
        H.n(i3, i9, this.f18852k);
        int i10 = this.j;
        return this.f18853l.subList(i3 + i10, i9 + i10);
    }

    @Override
    public final int size() {
        return this.f18852k;
    }
}
