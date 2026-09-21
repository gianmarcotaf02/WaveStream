package D;

/* JADX INFO: loaded from: classes.dex */
public final class D implements x.Q0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p079i7.f f1641x = p112n0.l.b(new B.C0063a(4), new B5.r(9));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D.C0194a f1642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D.t f1644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D.w f1646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p020c0.C1681g0 f1647f;
    public final p202z.k g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f1648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x.C3058o f1649i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Q0.F f1650k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D.A f1651l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F.C0340e f1652m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final F.C0357w f1653n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F.C0347l f1654o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final F.N f1655p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p166t3.i f1656q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final F.K f1657r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p020c0.X f1658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p020c0.C1681g0 f1659t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p020c0.C1681g0 f1660u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p020c0.X f1661v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final S.p f1662w;

    public D(int i3, int i9) {
        D.C0194a c0194a = new D.C0194a();
        c0194a.f1664a = -1;
        c0194a.f1666c = -1;
        this.f1642a = c0194a;
        this.f1646e = new D.w(i3, i9, 0);
        this.f1647f = new p020c0.C1681g0(D.F.f1663a, p020c0.C1676e.f18240k);
        this.g = new p202z.k();
        this.f1649i = new x.C3058o(new C5.C0132n0(2, this));
        this.j = true;
        this.f1651l = new D.A(this, 0);
        this.f1652m = new F.C0340e();
        this.f1653n = new F.C0357w();
        this.f1654o = new F.C0347l(0);
        this.f1655p = new F.N(new D.y(this, i3, 0));
        this.f1656q = new p166t3.i(4, this);
        this.f1657r = new F.K();
        this.f1658s = F.AbstractC0349n.h();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f1659t = p020c0.AbstractC1703s.y(bool);
        this.f1660u = p020c0.AbstractC1703s.y(bool);
        this.f1661v = F.AbstractC0349n.h();
        this.f1662w = new S.p(11);
    }

    public static java.lang.Object f(D.D d4, int i3, p117n6.i iVar) {
        d4.getClass();
        java.lang.Object objC = d4.c(v.n0.f28974h, new D.z(d4, i3, null), iVar);
        return objC == p109m6.a.f25430h ? objC : p070h6.A.f22523a;
    }

    public static java.lang.Object j(D.D d4, int i3, p100l6.c cVar) {
        d4.getClass();
        java.lang.Object objC = d4.c(v.n0.f28974h, new D.C(d4, i3, null), cVar);
        return objC == p109m6.a.f25430h ? objC : p070h6.A.f22523a;
    }

    @Override // x.Q0
    public final boolean a() {
        return this.f1649i.a();
    }

    @Override // x.Q0
    public final boolean b() {
        return ((java.lang.Boolean) this.f1660u.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r5.f1649i.c(r6, r7, r0) == r1) goto L23;
     */
    @Override // x.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(v.n0 n0Var, p194x6.m mVar, p100l6.c cVar) {
        D.B b9;
        if (cVar instanceof D.B) {
            b9 = (D.B) cVar;
            int i3 = b9.f1638l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b9.f1638l = i3 - Integer.MIN_VALUE;
            } else {
                b9 = new D.B(this, cVar);
            }
        } else {
            b9 = new D.B(this, cVar);
        }
        java.lang.Object obj = b9.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = b9.f1638l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (this.f1647f.getValue() == D.F.f1663a) {
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
            com.google.common.util.concurrent.P.u0(obj);
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        return p070h6.A.f22523a;
        b9.f1635h = null;
        b9.f1636i = null;
        b9.f1638l = 2;
    }

    @Override // x.Q0
    public final boolean d() {
        return ((java.lang.Boolean) this.f1659t.getValue()).booleanValue();
    }

    @Override // x.Q0
    public final float e(float f9) {
        return this.f1649i.e(f9);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void g(D.t tVar, boolean z6, boolean z9) {
        ?? r9 = tVar.f1754k;
        this.f1655p.f3362e = r9.size();
        S.p pVar = this.f1662w;
        D.w wVar = this.f1646e;
        int i3 = tVar.f1747b;
        D.u uVar = tVar.f1746a;
        if (!z6 && this.f1643b) {
            this.f1644c = tVar;
            p121o0.f fVarE = p121o0.o.e();
            p194x6.j jVarE = fVarE != null ? fVarE.e() : null;
            p121o0.f fVarH = p121o0.o.h(fVarE);
            try {
                if (((java.lang.Number) ((p163t.C2768m) pVar.j).f27640i.getValue()).floatValue() != 0.0f && uVar != null && uVar.f1761a == wVar.f1779b.g() && i3 == wVar.f1780c.g()) {
                    S7.w0 w0Var = (S7.w0) pVar.f9153i;
                    if (w0Var != null) {
                        w0Var.e(null);
                    }
                    pVar.j = new p163t.C2768m(p163t.AbstractC2750d.j, java.lang.Float.valueOf(0.0f), null, 60);
                }
                return;
            } finally {
                p121o0.o.k(fVarE, fVarH, jVarE);
            }
        }
        if (z6) {
            this.f1643b = true;
        }
        this.f1660u.setValue(java.lang.Boolean.valueOf(((uVar != null ? uVar.f1761a : 0) == 0 && i3 == 0) ? false : true));
        this.f1659t.setValue(java.lang.Boolean.valueOf(tVar.f1748c));
        this.f1648h -= tVar.f1749d;
        this.f1647f.setValue(tVar);
        if (z9) {
            wVar.getClass();
            if (!(((float) i3) >= 0.0f)) {
                A.b.c("scrollOffset should be non-negative");
            }
            wVar.f1780c.h(i3);
        } else {
            D.u uVar2 = (D.u) p078i6.o.j1(r9);
            D.u uVar3 = (D.u) p078i6.o.s1(r9);
            com.google.common.util.concurrent.P.v0(uVar2 != null ? uVar2.f1761a : -1L, "firstVisibleItem:index");
            com.google.common.util.concurrent.P.v0(uVar3 != null ? uVar3.f1761a : -1L, "lastVisibleItem:index");
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
                D.C0194a c0194a = this.f1642a;
                int i10 = c0194a.f1664a;
                boolean z11 = c0194a.f1665b;
                if (i10 != -1 && !r9.isEmpty() && i10 != D.C0194a.b(tVar, z11)) {
                    c0194a.f1664a = -1;
                    F.M m8 = (F.M) c0194a.f1668e;
                    if (m8 != null) {
                        m8.cancel();
                    }
                    c0194a.f1668e = null;
                }
                int i11 = c0194a.f1666c;
                if (i11 != -1 && c0194a.f1667d != 0.0f && i11 != i9 && !r9.isEmpty()) {
                    int iB = D.C0194a.b(tVar, c0194a.f1667d < 0.0f);
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

    public final D.t h() {
        return (D.t) this.f1647f.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void i(float f9, D.t tVar) {
        F.M m8;
        F.M m9;
        if (this.j) {
            D.C0194a c0194a = this.f1642a;
            if (!tVar.f1754k.isEmpty()) {
                boolean z6 = f9 < 0.0f;
                int iB = D.C0194a.b(tVar, z6);
                if (iB >= 0 && iB < tVar.f1757n) {
                    if (iB != c0194a.f1664a) {
                        if (c0194a.f1665b != z6) {
                            c0194a.f1664a = -1;
                            F.M m10 = (F.M) c0194a.f1668e;
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
                        D.u uVar = (D.u) p078i6.o.q1(r9);
                        if (((uVar.f1770l + uVar.f1771m) + tVar.f1760q) - tVar.f1756m < (-f9) && (m9 = (F.M) c0194a.f1668e) != null) {
                            m9.a();
                        }
                    } else if (tVar.f1755l - ((D.u) p078i6.o.h1(r9)).f1770l < f9 && (m8 = (F.M) c0194a.f1668e) != null) {
                        m8.a();
                    }
                }
            }
            c0194a.f1667d = f9;
        }
    }

    public final void k(int i3) {
        D.w wVar = this.f1646e;
        if (wVar.f1779b.g() != i3 || wVar.f1780c.g() != 0) {
            F.C0357w c0357w = this.f1653n;
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
