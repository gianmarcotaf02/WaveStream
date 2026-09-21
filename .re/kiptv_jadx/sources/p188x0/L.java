package p188x0;

/* JADX INFO: loaded from: classes.dex */
public final class L implements p113n1.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f31055A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p188x0.z f31056B;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f31057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f31058i = 1.0f;
    public float j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f31059k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f31060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f31061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f31062n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f31063o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f31064p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f31065q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f31066r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f31067s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f31068t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p188x0.O f31069u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f31070v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f31071w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f31072x;
    public p113n1.c y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p113n1.n f31073z;

    public L() {
        long j = p188x0.A.f31041a;
        this.f31063o = j;
        this.f31064p = j;
        this.f31067s = 8.0f;
        this.f31068t = p188x0.T.f31094b;
        this.f31069u = p188x0.z.f31141b;
        this.f31071w = 0;
        this.f31072x = 9205357640488583168L;
        this.y = com.google.android.gms.internal.play_billing.AbstractC1864o0.c();
        this.f31073z = p113n1.n.f25566h;
        this.f31055A = 3;
    }

    public final void A(long j) {
        if (p188x0.T.a(this.f31068t, j)) {
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

    @Override // p113n1.c
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
        long j = p188x0.A.f31041a;
        c(j);
        z(j);
        i(0.0f);
        j(0.0f);
        f(8.0f);
        A(p188x0.T.f31094b);
        p(p188x0.z.f31141b);
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
        if (p188x0.C3098s.d(this.f31063o, j)) {
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

    @Override // p113n1.c
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

    public final void p(p188x0.O o8) {
        if (kotlin.jvm.internal.m.a(this.f31069u, o8)) {
            return;
        }
        this.f31057h |= 8192;
        this.f31069u = o8;
    }

    public final void z(long j) {
        if (p188x0.C3098s.d(this.f31064p, j)) {
            return;
        }
        this.f31057h |= 128;
        this.f31064p = j;
    }
}
