package p188x0;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import kotlin.jvm.internal.m;
import p113n1.c;
import p113n1.n;

public final class L implements c {

    public int f31055A;

    public z f31056B;

    public int f31057h;

    public float f31058i = 1.0f;
    public float j = 1.0f;

    public float f31059k = 1.0f;

    public float f31060l;

    public float f31061m;

    public float f31062n;

    public long f31063o;

    public long f31064p;

    public float f31065q;

    public float f31066r;

    public float f31067s;

    public long f31068t;

    public O f31069u;

    public boolean f31070v;

    public int f31071w;

    public long f31072x;
    public c y;

    public n f31073z;

    public L() {
        long j = A.f31041a;
        this.f31063o = j;
        this.f31064p = j;
        this.f31067s = 8.0f;
        this.f31068t = T.f31094b;
        this.f31069u = z.f31141b;
        this.f31071w = 0;
        this.f31072x = 9205357640488583168L;
        this.y = AbstractC1864o0.c();
        this.f31073z = n.f25566h;
        this.f31055A = 3;
    }

    public final void A(long j) {
        if (T.a(this.f31068t, j)) {
            return;
        }
        this.f31057h |= 4096;
        this.f31068t = j;
    }

    public final void C(float f9) {
        if (this.f31060l == f9) {
            return;
        }
        this.f31057h |= 8;
        this.f31060l = f9;
    }

    public final void D(float f9) {
        if (this.f31061m == f9) {
            return;
        }
        this.f31057h |= 16;
        this.f31061m = f9;
    }

    @Override
    public final float S() {
        return this.y.S();
    }

    public final void a() {
        k(1.0f);
        n(1.0f);
        b(1.0f);
        C(0.0f);
        D(0.0f);
        o(0.0f);
        long j = A.f31041a;
        c(j);
        z(j);
        i(0.0f);
        j(0.0f);
        f(8.0f);
        A(T.f31094b);
        p(z.f31141b);
        g(false);
        if (this.f31055A != 3) {
            this.f31057h |= 524288;
            this.f31055A = 3;
        }
        h(0);
        this.f31072x = 9205357640488583168L;
        this.f31056B = null;
        this.f31057h = 0;
    }

    public final void b(float f9) {
        if (this.f31059k == f9) {
            return;
        }
        this.f31057h |= 4;
        this.f31059k = f9;
    }

    public final void c(long j) {
        if (C3098s.d(this.f31063o, j)) {
            return;
        }
        this.f31057h |= 64;
        this.f31063o = j;
    }

    public final void f(float f9) {
        if (this.f31067s == f9) {
            return;
        }
        this.f31057h |= 2048;
        this.f31067s = f9;
    }

    public final void g(boolean z6) {
        if (this.f31070v != z6) {
            this.f31057h |= 16384;
            this.f31070v = z6;
        }
    }

    @Override
    public final float getDensity() {
        return this.y.getDensity();
    }

    public final void h(int i3) {
        if (this.f31071w == i3) {
            return;
        }
        this.f31057h |= 32768;
        this.f31071w = i3;
    }

    public final void i(float f9) {
        if (this.f31065q == f9) {
            return;
        }
        this.f31057h |= 512;
        this.f31065q = f9;
    }

    public final void j(float f9) {
        if (this.f31066r == f9) {
            return;
        }
        this.f31057h |= 1024;
        this.f31066r = f9;
    }

    public final void k(float f9) {
        if (this.f31058i == f9) {
            return;
        }
        this.f31057h |= 1;
        this.f31058i = f9;
    }

    public final void n(float f9) {
        if (this.j == f9) {
            return;
        }
        this.f31057h |= 2;
        this.j = f9;
    }

    public final void o(float f9) {
        if (this.f31062n == f9) {
            return;
        }
        this.f31057h |= 32;
        this.f31062n = f9;
    }

    public final void p(O o8) {
        if (m.a(this.f31069u, o8)) {
            return;
        }
        this.f31057h |= 8192;
        this.f31069u = o8;
    }

    public final void z(long j) {
        if (C3098s.d(this.f31064p, j)) {
            return;
        }
        this.f31057h |= 128;
        this.f31064p = j;
    }
}
