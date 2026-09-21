package E;

/* JADX INFO: loaded from: classes.dex */
public final class q implements F.F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f2683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p113n1.n f2685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f2686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f2687f;
    public final java.lang.Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F.C0357w f2688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2689i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2692m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f2693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2697r;

    public q(int i3, java.lang.Object obj, int i9, int i10, p113n1.n nVar, int i11, int i12, java.util.List list, long j, java.lang.Object obj2, F.C0357w c0357w, long j9, int i13, int i14) {
        this.f2682a = i3;
        this.f2683b = obj;
        this.f2684c = i9;
        this.f2685d = nVar;
        this.f2686e = list;
        this.f2687f = j;
        this.g = obj2;
        this.f2688h = c0357w;
        this.f2689i = i13;
        this.j = i14;
        int size = list.size();
        int iMax = 0;
        for (int i15 = 0; i15 < size; i15++) {
            iMax = java.lang.Math.max(iMax, ((O0.g0) list.get(i15)).f7640i);
        }
        this.f2690k = iMax;
        int i16 = i10 + iMax;
        this.f2691l = i16 >= 0 ? i16 : 0;
        this.f2693n = (((long) this.f2684c) << 32) | (((long) iMax) & 4294967295L);
        this.f2694o = 0L;
        this.f2695p = -1;
        this.f2696q = -1;
    }

    @Override // F.F
    public final int a() {
        return this.f2686e.size();
    }

    @Override // F.F
    public final int b() {
        return this.f2691l;
    }

    @Override // F.F
    public final java.lang.Object c(int i3) {
        return ((O0.g0) this.f2686e.get(i3)).E();
    }

    @Override // F.F
    public final boolean d() {
        return true;
    }

    @Override // F.F
    public final void e() {
        this.f2697r = true;
    }

    @Override // F.F
    public final void f(int i3, int i9, int i10) {
        j(i3, 0, i9, i10, -1, -1);
    }

    @Override // F.F
    public final long g(int i3) {
        return this.f2694o;
    }

    @Override // F.F
    public final int getIndex() {
        return this.f2682a;
    }

    @Override // F.F
    public final java.lang.Object getKey() {
        return this.f2683b;
    }

    @Override // F.F
    public final int getSpan() {
        return this.j;
    }

    @Override // F.F
    public final int h() {
        return this.f2689i;
    }

    public final void i(O0.f0 f0Var) {
        if (this.f2692m == Integer.MIN_VALUE) {
            A.b.a("position() should be called first");
        }
        java.util.List list = this.f2686e;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            O0.g0 g0Var = (O0.g0) list.get(i3);
            int i9 = g0Var.f7640i;
            long j = this.f2694o;
            this.f2688h.a(i3, this.f2683b);
            O0.f0.o(f0Var, g0Var, p113n1.k.c(j, this.f2687f));
        }
    }

    public final void j(int i3, int i9, int i10, int i11, int i12, int i13) {
        this.f2692m = i11;
        if (this.f2685d == p113n1.n.f25567i) {
            i9 = (i10 - i9) - this.f2684c;
        }
        this.f2694o = (((long) i9) << 32) | (((long) i3) & 4294967295L);
        this.f2695p = i12;
        this.f2696q = i13;
    }
}
