package p105m2;

import android.os.Bundle;

public final class X extends AbstractC2621t implements U {

    public final String f25248a;

    public final String f25249b;

    public boolean f25250c;

    public int f25251d = -1;

    public int f25252e;

    public T f25253f;
    public int g;

    public final Y f25254h;

    public X(Y y, String str, String str2) {
        this.f25254h = y;
        this.f25248a = str;
        this.f25249b = str2;
    }

    @Override
    public final void a(T t9) {
        this.f25253f = t9;
        int i3 = t9.f25238e;
        t9.f25238e = i3 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f25248a);
        bundle.putString("routeGroupId", this.f25249b);
        int i9 = t9.f25237d;
        t9.f25237d = i9 + 1;
        t9.b(3, i9, i3, null, bundle);
        this.g = i3;
        if (this.f25250c) {
            t9.a(i3);
            int i10 = this.f25251d;
            if (i10 >= 0) {
                t9.c(this.g, i10);
                this.f25251d = -1;
            }
            int i11 = this.f25252e;
            if (i11 != 0) {
                t9.d(this.g, i11);
                this.f25252e = 0;
            }
        }
    }

    @Override
    public final int b() {
        return this.g;
    }

    @Override
    public final void c() {
        T t9 = this.f25253f;
        if (t9 != null) {
            int i3 = this.g;
            int i9 = t9.f25237d;
            t9.f25237d = i9 + 1;
            t9.b(4, i9, i3, null, null);
            this.f25253f = null;
            this.g = 0;
        }
    }

    @Override
    public final void d() {
        Y y = this.f25254h;
        y.f25258r.remove(this);
        c();
        y.m();
    }

    @Override
    public final void e() {
        this.f25250c = true;
        T t9 = this.f25253f;
        if (t9 != null) {
            t9.a(this.g);
        }
    }

    @Override
    public final void f(int i3) {
        T t9 = this.f25253f;
        if (t9 != null) {
            t9.c(this.g, i3);
        } else {
            this.f25251d = i3;
            this.f25252e = 0;
        }
    }

    @Override
    public final void g() {
        h(0);
    }

    @Override
    public final void h(int i3) {
        this.f25250c = false;
        T t9 = this.f25253f;
        if (t9 != null) {
            int i9 = this.g;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i3);
            int i10 = t9.f25237d;
            t9.f25237d = i10 + 1;
            t9.b(6, i10, i9, null, bundle);
        }
    }

    @Override
    public final void i(int i3) {
        T t9 = this.f25253f;
        if (t9 != null) {
            t9.d(this.g, i3);
        } else {
            this.f25252e += i3;
        }
    }
}
