package D;

import F.C0357w;
import O0.f0;
import O0.g0;
import O0.h0;
import O0.i0;
import java.util.List;

public final class u implements F.F {

    public final int f1761a;

    public final List f1762b;

    public final boolean f1763c;

    public final p137q0.f f1764d;

    public final p137q0.g f1765e;

    public final p113n1.n f1766f;
    public final int g;

    public final long f1767h;

    public final Object f1768i;
    public final Object j;

    public final C0357w f1769k;

    public int f1770l;

    public final int f1771m;

    public final int f1772n;

    public final int f1773o;

    public boolean f1774p;

    public int f1775q = Integer.MIN_VALUE;

    public final int[] f1776r;

    public u(int i3, List list, boolean z6, p137q0.f fVar, p137q0.g gVar, p113n1.n nVar, int i9, int i10, int i11, long j, Object obj, Object obj2, C0357w c0357w, long j9) {
        this.f1761a = i3;
        this.f1762b = list;
        this.f1763c = z6;
        this.f1764d = fVar;
        this.f1765e = gVar;
        this.f1766f = nVar;
        this.g = i11;
        this.f1767h = j;
        this.f1768i = obj;
        this.j = obj2;
        this.f1769k = c0357w;
        int size = list.size();
        int i12 = 0;
        int iMax = 0;
        for (int i13 = 0; i13 < size; i13++) {
            g0 g0Var = (g0) list.get(i13);
            boolean z9 = this.f1763c;
            i12 += z9 ? g0Var.f7640i : g0Var.f7639h;
            iMax = Math.max(iMax, !z9 ? g0Var.f7640i : g0Var.f7639h);
        }
        this.f1771m = i12;
        int i14 = i12 + this.g;
        this.f1772n = i14 >= 0 ? i14 : 0;
        this.f1773o = iMax;
        this.f1776r = new int[this.f1762b.size() * 2];
    }

    @Override
    public final int a() {
        return this.f1762b.size();
    }

    @Override
    public final int b() {
        return this.f1772n;
    }

    @Override
    public final Object c(int i3) {
        return ((g0) this.f1762b.get(i3)).E();
    }

    @Override
    public final boolean d() {
        return this.f1763c;
    }

    @Override
    public final void e() {
        this.f1774p = true;
    }

    @Override
    public final void f(int i3, int i9, int i10) {
        j(i3, i9, i10);
    }

    @Override
    public final long g(int i3) {
        if (i3 == 0 && this.f1762b.size() == 0) {
            if (this.f1763c) {
                return (4294967295L & ((long) this.f1770l)) | (((long) 0) << 32);
            }
            return (4294967295L & ((long) 0)) | (((long) this.f1770l) << 32);
        }
        int i9 = i3 * 2;
        int[] iArr = this.f1776r;
        int i10 = iArr[i9];
        return (4294967295L & ((long) iArr[i9 + 1])) | (((long) i10) << 32);
    }

    @Override
    public final int getIndex() {
        return this.f1761a;
    }

    @Override
    public final Object getKey() {
        return this.f1768i;
    }

    @Override
    public final int getSpan() {
        return 1;
    }

    @Override
    public final int h() {
        return 0;
    }

    public final void i(f0 f0Var) {
        if (this.f1775q == Integer.MIN_VALUE) {
            A.b.a("position() should be called first");
        }
        List list = this.f1762b;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            g0 g0Var = (g0) list.get(i3);
            boolean z6 = this.f1763c;
            if (z6) {
                int i9 = g0Var.f7640i;
            } else {
                int i10 = g0Var.f7639h;
            }
            long jG = g(i3);
            this.f1769k.a(i3, this.f1768i);
            long jC = p113n1.k.c(jG, this.f1767h);
            if (z6) {
                f0.o(f0Var, g0Var, jC);
            } else {
                int i11 = i0.f7649b;
                h0 h0Var = h0.f7643i;
                if (f0Var.c() == p113n1.n.f25566h || f0Var.f() == 0) {
                    f0.a(f0Var, g0Var);
                    g0Var.h0(p113n1.k.c(jC, g0Var.f7642l), 0.0f, h0Var);
                } else {
                    int iF = (f0Var.f() - g0Var.f7639h) - ((int) (jC >> 32));
                    f0.a(f0Var, g0Var);
                    g0Var.h0(p113n1.k.c((((long) iF) << 32) | (4294967295L & ((long) ((int) (jC & 4294967295L)))), g0Var.f7642l), 0.0f, h0Var);
                }
            }
        }
    }

    public final void j(int i3, int i9, int i10) {
        int i11;
        this.f1770l = i3;
        boolean z6 = this.f1763c;
        this.f1775q = z6 ? i10 : i9;
        List list = this.f1762b;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            g0 g0Var = (g0) list.get(i12);
            int i13 = i12 * 2;
            int[] iArr = this.f1776r;
            if (z6) {
                p137q0.f fVar = this.f1764d;
                if (fVar == null) {
                    A.b.b("null horizontalAlignment when isVertical == true");
                    throw new I3.b();
                }
                iArr[i13] = fVar.a(g0Var.f7639h, i9, this.f1766f);
                iArr[i13 + 1] = i3;
                i11 = g0Var.f7640i;
            } else {
                iArr[i13] = i3;
                int i14 = i13 + 1;
                p137q0.g gVar = this.f1765e;
                if (gVar == null) {
                    A.b.b("null verticalAlignment when isVertical == false");
                    throw new I3.b();
                }
                iArr[i14] = gVar.a(g0Var.f7640i, i10);
                i11 = g0Var.f7639h;
            }
            i3 += i11;
        }
    }
}
