package D;

import B.C0063a;
import C5.C0132n0;
import F.AbstractC0349n;
import F.C0340e;
import F.C0347l;
import F.C0357w;
import F.K;
import F.M;
import F.N;
import S7.w0;
import com.google.common.util.concurrent.P;
import p020c0.AbstractC1703s;
import p020c0.C1676e;
import p020c0.C1681g0;
import p020c0.X;
import p163t.AbstractC2750d;
import p163t.C2768m;
import v.n0;
import x.C3058o;
import x.Q0;

public final class D implements Q0 {

    public static final p079i7.f f1641x = p112n0.l.b(new C0063a(4), new B5.r(9));

    public final C0194a f1642a;

    public boolean f1643b;

    public t f1644c;

    public boolean f1645d;

    public final w f1646e;

    public final C1681g0 f1647f;
    public final p202z.k g;

    public float f1648h;

    public final C3058o f1649i;
    public final boolean j;

    public Q0.F f1650k;

    public final A f1651l;

    public final C0340e f1652m;

    public final C0357w f1653n;

    public final C0347l f1654o;

    public final N f1655p;

    public final p166t3.i f1656q;

    public final K f1657r;

    public final X f1658s;

    public final C1681g0 f1659t;

    public final C1681g0 f1660u;

    public final X f1661v;

    public final S.p f1662w;

    public D(int i3, int i9) {
        C0194a c0194a = new C0194a();
        c0194a.f1664a = -1;
        c0194a.f1666c = -1;
        this.f1642a = c0194a;
        this.f1646e = new w(i3, i9, 0);
        this.f1647f = new C1681g0(F.f1663a, C1676e.f18240k);
        this.g = new p202z.k();
        this.f1649i = new C3058o(new C0132n0(2, this));
        this.j = true;
        this.f1651l = new A(this, 0);
        this.f1652m = new C0340e();
        this.f1653n = new C0357w();
        this.f1654o = new C0347l(0);
        this.f1655p = new N(new y(this, i3, 0));
        this.f1656q = new p166t3.i(4, this);
        this.f1657r = new K();
        this.f1658s = AbstractC0349n.h();
        Boolean bool = Boolean.FALSE;
        this.f1659t = AbstractC1703s.y(bool);
        this.f1660u = AbstractC1703s.y(bool);
        this.f1661v = AbstractC0349n.h();
        this.f1662w = new S.p(11);
    }

    public static Object f(D d4, int i3, p117n6.i iVar) {
        d4.getClass();
        Object objC = d4.c(n0.f28974h, new z(d4, i3, null), iVar);
        return objC == p109m6.a.f25430h ? objC : p070h6.A.f22523a;
    }

    public static Object j(D d4, int i3, p100l6.c cVar) {
        d4.getClass();
        Object objC = d4.c(n0.f28974h, new C(d4, i3, null), cVar);
        return objC == p109m6.a.f25430h ? objC : p070h6.A.f22523a;
    }

    @Override
    public final boolean a() {
        return this.f1649i.a();
    }

    @Override
    public final boolean b() {
        return ((Boolean) this.f1660u.getValue()).booleanValue();
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(n0 n0Var, p194x6.m mVar, p100l6.c cVar) {
        B b9;
        if (cVar instanceof B) {
            b9 = (B) cVar;
            int i3 = b9.f1638l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b9.f1638l = i3 - Integer.MIN_VALUE;
            } else {
                b9 = new B(this, cVar);
            }
        } else {
            b9 = new B(this, cVar);
        }
        Object obj = b9.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = b9.f1638l;
        if (i9 == 0) {
            P.u0(obj);
            if (this.f1647f.getValue() == F.f1663a) {
                b9.f1635h = n0Var;
                b9.f1636i = mVar;
                b9.f1638l = 1;
                if (this.f1652m.g(b9) != aVar) {
                }
            }
            return aVar;
        }
        if (i9 == 1) {
            mVar = b9.f1636i;
            n0Var = b9.f1635h;
            P.u0(obj);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P.u0(obj);
        }
        return p070h6.A.f22523a;
        b9.f1635h = null;
        b9.f1636i = null;
        b9.f1638l = 2;
    }

    @Override
    public final boolean d() {
        return ((Boolean) this.f1659t.getValue()).booleanValue();
    }

    @Override
    public final float e(float f9) {
        return this.f1649i.e(f9);
    }

    public final void g(t tVar, boolean z6, boolean z9) {
        ?? r9 = tVar.f1754k;
        this.f1655p.f3362e = r9.size();
        S.p pVar = this.f1662w;
        w wVar = this.f1646e;
        int i3 = tVar.f1747b;
        u uVar = tVar.f1746a;
        if (!z6 && this.f1643b) {
            this.f1644c = tVar;
            p121o0.f fVarE = p121o0.o.e();
            p194x6.j jVarE = fVarE != null ? fVarE.e() : null;
            p121o0.f fVarH = p121o0.o.h(fVarE);
            try {
                if (((Number) ((C2768m) pVar.j).f27640i.getValue()).floatValue() != 0.0f && uVar != null && uVar.f1761a == wVar.f1779b.g() && i3 == wVar.f1780c.g()) {
                    w0 w0Var = (w0) pVar.f9153i;
                    if (w0Var != null) {
                        w0Var.e(null);
                    }
                    pVar.j = new C2768m(AbstractC2750d.j, Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                p121o0.o.k(fVarE, fVarH, jVarE);
            }
        }
        if (z6) {
            this.f1643b = true;
        }
        this.f1660u.setValue(Boolean.valueOf(((uVar != null ? uVar.f1761a : 0) == 0 && i3 == 0) ? false : true));
        this.f1659t.setValue(Boolean.valueOf(tVar.f1748c));
        this.f1648h -= tVar.f1749d;
        this.f1647f.setValue(tVar);
        if (z9) {
            wVar.getClass();
            if (!(((float) i3) >= 0.0f)) {
                A.b.c("scrollOffset should be non-negative");
            }
            wVar.f1780c.h(i3);
        } else {
            u uVar2 = (u) p078i6.o.j1(r9);
            u uVar3 = (u) p078i6.o.s1(r9);
            P.v0(uVar2 != null ? uVar2.f1761a : -1L, "firstVisibleItem:index");
            P.v0(uVar3 != null ? uVar3.f1761a : -1L, "lastVisibleItem:index");
            wVar.getClass();
            wVar.f1782e = uVar != null ? uVar.f1768i : null;
            boolean z10 = wVar.f1781d;
            int i9 = tVar.f1757n;
            if (z10 || i9 > 0) {
                wVar.f1781d = true;
                if (!(((float) i3) >= 0.0f)) {
                    A.b.c("scrollOffset should be non-negative");
                }
                wVar.a(uVar != null ? uVar.f1761a : 0, i3);
            }
            if (this.j) {
                C0194a c0194a = this.f1642a;
                int i10 = c0194a.f1664a;
                boolean z11 = c0194a.f1665b;
                if (i10 != -1 && !r9.isEmpty() && i10 != C0194a.b(tVar, z11)) {
                    c0194a.f1664a = -1;
                    M m8 = (M) c0194a.f1668e;
                    if (m8 != null) {
                        m8.cancel();
                    }
                    c0194a.f1668e = null;
                }
                int i11 = c0194a.f1666c;
                if (i11 != -1 && c0194a.f1667d != 0.0f && i11 != i9 && !r9.isEmpty()) {
                    int iB = C0194a.b(tVar, c0194a.f1667d < 0.0f);
                    if (iB >= 0 && iB < i9) {
                        c0194a.f1664a = iB;
                        c0194a.f1668e = p166t3.i.D(this.f1656q, iB);
                    }
                }
                c0194a.f1666c = i9;
            }
        }
        if (z6) {
            pVar.s(tVar.f1751f, tVar.f1753i, tVar.f1752h);
        }
    }

    public final t h() {
        return (t) this.f1647f.getValue();
    }

    public final void i(float f9, t tVar) {
        M m8;
        M m9;
        if (this.j) {
            C0194a c0194a = this.f1642a;
            if (!tVar.f1754k.isEmpty()) {
                boolean z6 = f9 < 0.0f;
                int iB = C0194a.b(tVar, z6);
                if (iB >= 0 && iB < tVar.f1757n) {
                    if (iB != c0194a.f1664a) {
                        if (c0194a.f1665b != z6) {
                            c0194a.f1664a = -1;
                            M m10 = (M) c0194a.f1668e;
                            if (m10 != null) {
                                m10.cancel();
                            }
                            c0194a.f1668e = null;
                        }
                        c0194a.f1665b = z6;
                        c0194a.f1664a = iB;
                        c0194a.f1668e = p166t3.i.D(this.f1656q, iB);
                    }
                    ?? r9 = tVar.f1754k;
                    if (z6) {
                        u uVar = (u) p078i6.o.q1(r9);
                        if (((uVar.f1770l + uVar.f1771m) + tVar.f1760q) - tVar.f1756m < (-f9) && (m9 = (M) c0194a.f1668e) != null) {
                            m9.a();
                        }
                    } else if (tVar.f1755l - ((u) p078i6.o.h1(r9)).f1770l < f9 && (m8 = (M) c0194a.f1668e) != null) {
                        m8.a();
                    }
                }
            }
            c0194a.f1667d = f9;
        }
    }

    public final void k(int i3) {
        w wVar = this.f1646e;
        if (wVar.f1779b.g() != i3 || wVar.f1780c.g() != 0) {
            C0357w c0357w = this.f1653n;
            c0357w.d();
            c0357w.f3494b = null;
        }
        wVar.a(i3, 0);
        wVar.f1782e = null;
        Q0.F f9 = this.f1650k;
        if (f9 != null) {
            f9.k();
        }
    }
}
