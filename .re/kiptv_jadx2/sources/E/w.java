package E;

import B.C0063a;
import C5.C0132n0;
import D.A;
import D.C0194a;
import F.AbstractC0349n;
import F.C0340e;
import F.C0347l;
import F.C0357w;
import F.K;
import F.M;
import F.N;
import Q0.F;
import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.P;
import p020c0.AbstractC1703s;
import p020c0.C1676e;
import p020c0.C1681g0;
import p020c0.X;
import v.n0;
import x.C3058o;
import x.EnumC3061p0;
import x.Q0;

public final class w implements Q0 {

    public static final p079i7.f f2713w = p112n0.l.b(new C0063a(6), new B5.r(27));

    public final C0194a f2714a;

    public boolean f2715b;

    public p f2716c;

    public final D.w f2717d;

    public final C1681g0 f2718e;

    public final p202z.k f2719f;
    public float g;

    public final C3058o f2720h;

    public final boolean f2721i;
    public F j;

    public final A f2722k;

    public final C0340e f2723l;

    public final C0357w f2724m;

    public final C0347l f2725n;

    public final N f2726o;

    public final A.a f2727p;

    public final K f2728q;

    public final X f2729r;

    public final X f2730s;

    public final C1681g0 f2731t;

    public final C1681g0 f2732u;

    public final S.p f2733v;

    public w(int i3, int i9) {
        C0194a c0194a = new C0194a();
        c0194a.f1664a = -1;
        c0194a.f1668e = new p038e0.e(new M[16]);
        c0194a.f1666c = -1;
        this.f2714a = c0194a;
        this.f2717d = new D.w(i3, i9, 1);
        this.f2718e = new C1681g0(y.f2734a, C1676e.f18240k);
        this.f2719f = new p202z.k();
        this.f2720h = new C3058o(new C0132n0(5, this));
        this.f2721i = true;
        this.f2722k = new A(this, 1);
        this.f2723l = new C0340e();
        this.f2724m = new C0357w();
        this.f2725n = new C0347l(0);
        this.f2726o = new N(new D.y(this, i3, 1));
        this.f2727p = new A.a(6, this);
        this.f2728q = new K();
        this.f2729r = AbstractC0349n.h();
        this.f2730s = AbstractC0349n.h();
        Boolean bool = Boolean.FALSE;
        this.f2731t = AbstractC1703s.y(bool);
        this.f2732u = AbstractC1703s.y(bool);
        this.f2733v = new S.p(11);
    }

    public static Object i(w wVar, int i3, p117n6.i iVar) {
        wVar.getClass();
        Object objC = wVar.c(n0.f28974h, new v(wVar, i3, null), iVar);
        return objC == p109m6.a.f25430h ? objC : p070h6.A.f22523a;
    }

    @Override
    public final boolean a() {
        return this.f2720h.a();
    }

    @Override
    public final boolean b() {
        return ((Boolean) this.f2732u.getValue()).booleanValue();
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(n0 n0Var, p194x6.m mVar, p100l6.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i3 = uVar.f2710l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uVar.f2710l = i3 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object obj = uVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = uVar.f2710l;
        if (i9 == 0) {
            P.u0(obj);
            if (this.f2718e.getValue() == y.f2734a) {
                uVar.f2707h = n0Var;
                uVar.f2708i = mVar;
                uVar.f2710l = 1;
                if (this.f2723l.g(uVar) != aVar) {
                }
            }
            return aVar;
        }
        if (i9 == 1) {
            mVar = uVar.f2708i;
            n0Var = uVar.f2707h;
            P.u0(obj);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
        }
        return p070h6.A.f22523a;
        uVar.f2707h = null;
        uVar.f2708i = null;
        uVar.f2710l = 2;
    }

    @Override
    public final boolean d() {
        return ((Boolean) this.f2731t.getValue()).booleanValue();
    }

    @Override
    public final float e(float f9) {
        return this.f2720h.e(f9);
    }

    public final void f(p pVar, boolean z6, boolean z9) {
        q qVar;
        q qVar2;
        ?? r9 = pVar.f2675m;
        this.f2726o.f3362e = r9.size();
        if (!z6 && this.f2715b) {
            this.f2716c = pVar;
            return;
        }
        if (z6) {
            this.f2715b = true;
        }
        this.g -= pVar.f2668d;
        this.f2718e.setValue(pVar);
        r rVar = pVar.f2665a;
        int i3 = rVar != null ? rVar.f2698a : 0;
        int i9 = pVar.f2666b;
        this.f2732u.setValue(Boolean.valueOf((i3 == 0 && i9 == 0) ? false : true));
        this.f2731t.setValue(Boolean.valueOf(pVar.f2667c));
        D.w wVar = this.f2717d;
        if (z9) {
            wVar.getClass();
            if (i9 < 0.0f) {
                A.b.c("scrollOffset should be non-negative");
            }
            wVar.f1780c.h(i9);
        } else {
            wVar.getClass();
            wVar.f1782e = (rVar == null || (qVar2 = (q) p078i6.m.n0(rVar.f2699b)) == null) ? null : qVar2.f2683b;
            boolean z10 = wVar.f1781d;
            int i10 = pVar.f2678p;
            if (z10 || i10 > 0) {
                wVar.f1781d = true;
                if (i9 < 0.0f) {
                    A.b.c("scrollOffset should be non-negative (" + i9 + ')');
                }
                wVar.a((rVar == null || (qVar = (q) p078i6.m.n0(rVar.f2699b)) == null) ? 0 : qVar.f2682a, i9);
            }
            if (this.f2721i) {
                C0194a c0194a = this.f2714a;
                int i11 = c0194a.f1664a;
                boolean z11 = c0194a.f1665b;
                p038e0.e eVar = (p038e0.e) c0194a.f1668e;
                if (i11 != -1 && !r9.isEmpty() && i11 != C0194a.c(pVar, z11)) {
                    c0194a.f1664a = -1;
                    Object[] objArr = eVar.f21324h;
                    int i12 = eVar.j;
                    for (int i13 = 0; i13 < i12; i13++) {
                        ((M) objArr[i13]).cancel();
                    }
                    eVar.i();
                }
                int i14 = c0194a.f1666c;
                if (i14 != -1 && c0194a.f1667d != 0.0f && i14 != i10 && !r9.isEmpty()) {
                    int iC = C0194a.c(pVar, c0194a.f1667d < 0.0f);
                    int iA = C0194a.a(pVar, c0194a.f1667d < 0.0f);
                    if (iA >= 0 && iA < i10 && iC != c0194a.f1664a && iC >= 0) {
                        c0194a.f1664a = iC;
                        eVar.i();
                        eVar.e(eVar.j, this.f2727p.L(iC));
                    }
                }
                c0194a.f1666c = i10;
            }
        }
        if (z6) {
            this.f2733v.s(pVar.f2670f, pVar.f2672i, pVar.f2671h);
        }
    }

    public final p g() {
        return (p) this.f2718e.getValue();
    }

    public final void h(float f9, p pVar) {
        if (this.f2721i) {
            C0194a c0194a = this.f2714a;
            c0194a.getClass();
            if (!pVar.f2675m.isEmpty()) {
                int i3 = 0;
                boolean z6 = f9 < 0.0f;
                int iC = C0194a.c(pVar, z6);
                int iA = C0194a.a(pVar, z6);
                if (iA >= 0 && iA < pVar.f2678p) {
                    int i9 = c0194a.f1664a;
                    p038e0.e eVar = (p038e0.e) c0194a.f1668e;
                    if (iC != i9 && iC >= 0) {
                        if (c0194a.f1665b != z6) {
                            Object[] objArr = eVar.f21324h;
                            int i10 = eVar.j;
                            for (int i11 = 0; i11 < i10; i11++) {
                                ((M) objArr[i11]).cancel();
                            }
                        }
                        c0194a.f1665b = z6;
                        c0194a.f1664a = iC;
                        eVar.i();
                        eVar.e(eVar.j, this.f2727p.L(iC));
                    }
                    EnumC3061p0 enumC3061p0 = pVar.f2679q;
                    ?? r9 = pVar.f2675m;
                    if (z6) {
                        q qVar = (q) p078i6.o.q1(r9);
                        if (((V0.y(qVar, enumC3061p0) + ((int) (enumC3061p0 == EnumC3061p0.f30978h ? qVar.f2693n & 4294967295L : qVar.f2693n >> 32))) + pVar.f2681s) - pVar.f2677o < (-f9)) {
                            Object[] objArr2 = eVar.f21324h;
                            int i12 = eVar.j;
                            while (i3 < i12) {
                                ((M) objArr2[i3]).a();
                                i3++;
                            }
                        }
                    } else if (pVar.f2676n - V0.y((q) p078i6.o.h1(r9), enumC3061p0) < f9) {
                        Object[] objArr3 = eVar.f21324h;
                        int i13 = eVar.j;
                        while (i3 < i13) {
                            ((M) objArr3[i3]).a();
                            i3++;
                        }
                    }
                }
            }
            c0194a.f1667d = f9;
        }
    }
}
