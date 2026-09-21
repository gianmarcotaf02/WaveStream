package E;

import F.C0357w;
import F.F;
import O0.f0;
import O0.g0;
import java.util.List;

public final class q implements F {

    public final int f2682a;

    public final Object f2683b;

    public final int f2684c;

    public final p113n1.n f2685d;

    public final List f2686e;

    public final long f2687f;
    public final Object g;

    public final C0357w f2688h;

    public final int f2689i;
    public final int j;

    public final int f2690k;

    public final int f2691l;

    public int f2692m = Integer.MIN_VALUE;

    public final long f2693n;

    public long f2694o;

    public int f2695p;

    public int f2696q;

    public boolean f2697r;

    public q(int i3, Object obj, int i9, int i10, p113n1.n nVar, int i11, int i12, List list, long j, Object obj2, C0357w c0357w, long j9, int i13, int i14) {
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
            iMax = Math.max(iMax, ((g0) list.get(i15)).f7640i);
        }
        this.f2690k = iMax;
        int i16 = i10 + iMax;
        this.f2691l = i16 >= 0 ? i16 : 0;
        this.f2693n = (((long) this.f2684c) << 32) | (((long) iMax) & 4294967295L);
        this.f2694o = 0L;
        this.f2695p = -1;
        this.f2696q = -1;
    }

    @Override
    public final int a() {
        return this.f2686e.size();
    }

    @Override
    public final int b() {
        return this.f2691l;
    }

    @Override
    public final Object c(int i3) {
        return ((g0) this.f2686e.get(i3)).E();
    }

    @Override
    public final boolean d() {
        return true;
    }

    @Override
    public final void e() {
        this.f2697r = true;
    }

    @Override
    public final void f(int i3, int i9, int i10) {
        j(i3, 0, i9, i10, -1, -1);
    }

    @Override
    public final long g(int i3) {
        return this.f2694o;
    }

    @Override
    public final int getIndex() {
        return this.f2682a;
    }

    @Override
    public final Object getKey() {
        return this.f2683b;
    }

    @Override
    public final int getSpan() {
        return this.j;
    }

    @Override
    public final int h() {
        return this.f2689i;
    }

    public final void i(f0 f0Var) {
        if (this.f2692m == Integer.MIN_VALUE) {
            A.b.a("position() should be called first");
        }
        List list = this.f2686e;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            g0 g0Var = (g0) list.get(i3);
            int i9 = g0Var.f7640i;
            long j = this.f2694o;
            this.f2688h.a(i3, this.f2683b);
            f0.o(f0Var, g0Var, p113n1.k.c(j, this.f2687f));
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
