package p136q;

import p078i6.A;

public final class U extends A {

    public int f26358h;

    public final T f26359i;

    public U(T t9) {
        this.f26359i = t9;
    }

    @Override
    public final int a() {
        int i3 = this.f26358h;
        this.f26358h = i3 + 1;
        return this.f26359i.e(i3);
    }

    @Override
    public final boolean hasNext() {
        return this.f26358h < this.f26359i.g();
    }
}
