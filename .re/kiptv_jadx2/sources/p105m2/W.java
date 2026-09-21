package p105m2;

import android.os.Bundle;

public final class W extends AbstractC2620s implements U {

    public final String f25243f;
    public boolean g;

    public int f25245i;
    public T j;

    public final Y f25247l;

    public int f25244h = -1;

    public int f25246k = -1;

    public W(Y y, String str) {
        this.f25247l = y;
        this.f25243f = str;
    }

    @Override
    public final void a(T t9) {
        V v6 = new V(this);
        this.j = t9;
        int i3 = t9.f25238e;
        t9.f25238e = i3 + 1;
        int i9 = t9.f25237d;
        t9.f25237d = i9 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f25243f);
        t9.b(11, i9, i3, null, bundle);
        t9.f25240h.put(i9, v6);
        this.f25246k = i3;
        if (this.g) {
            t9.a(i3);
            int i10 = this.f25244h;
            if (i10 >= 0) {
                t9.c(this.f25246k, i10);
                this.f25244h = -1;
            }
            int i11 = this.f25245i;
            if (i11 != 0) {
                t9.d(this.f25246k, i11);
                this.f25245i = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.f25246k;
    }

    @Override
    public final void c() {
        T t9 = this.j;
        if (t9 != null) {
            int i3 = this.f25246k;
            int i9 = t9.f25237d;
            t9.f25237d = i9 + 1;
            t9.b(4, i9, i3, null, null);
            this.j = null;
            this.f25246k = 0;
        }
    }

    @Override
    public final void d() {
        Y y = this.f25247l;
        y.f25258r.remove(this);
        c();
        y.m();
    }

    @Override
    public final void e() {
        this.g = true;
        T t9 = this.j;
        if (t9 != null) {
            t9.a(this.f25246k);
        }
    }

    @Override
    public final void f(int i3) {
        T t9 = this.j;
        if (t9 != null) {
            t9.c(this.f25246k, i3);
        } else {
            this.f25244h = i3;
            this.f25245i = 0;
        }
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i3) {
        this.g = false;
        T t9 = this.j;
        if (t9 != null) {
            int i9 = this.f25246k;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i3);
            int i10 = t9.f25237d;
            t9.f25237d = i10 + 1;
            t9.b(6, i10, i9, null, bundle);
        }
    }

    @Override
    public final void i(int i3) {
        T t9 = this.j;
        if (t9 != null) {
            t9.d(this.f25246k, i3);
        } else {
            this.f25245i += i3;
        }
    }
}
