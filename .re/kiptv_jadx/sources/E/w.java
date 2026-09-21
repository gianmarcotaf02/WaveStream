package E;

/* JADX INFO: loaded from: classes.dex */
public final class w implements x.Q0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p079i7.f f2713w = p112n0.l.b(new B.C0063a(6), new B5.r(27));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D.C0194a f2714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E.p f2716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D.w f2717d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p020c0.C1681g0 f2718e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p202z.k f2719f;
    public float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x.C3058o f2720h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2721i;
    public Q0.F j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final D.A f2722k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F.C0340e f2723l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F.C0357w f2724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final F.C0347l f2725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final F.N f2726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final A.a f2727p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final F.K f2728q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p020c0.X f2729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p020c0.X f2730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p020c0.C1681g0 f2731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p020c0.C1681g0 f2732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final S.p f2733v;

    public w(int i3, int i9) {
        D.C0194a c0194a = new D.C0194a();
        c0194a.f1664a = -1;
        c0194a.f1668e = new p038e0.e(new F.M[16]);
        c0194a.f1666c = -1;
        this.f2714a = c0194a;
        this.f2717d = new D.w(i3, i9, 1);
        this.f2718e = new p020c0.C1681g0(E.y.f2734a, p020c0.C1676e.f18240k);
        this.f2719f = new p202z.k();
        this.f2720h = new x.C3058o(new C5.C0132n0(5, this));
        this.f2721i = true;
        this.f2722k = new D.A(this, 1);
        this.f2723l = new F.C0340e();
        this.f2724m = new F.C0357w();
        this.f2725n = new F.C0347l(0);
        this.f2726o = new F.N(new D.y(this, i3, 1));
        this.f2727p = new A.a(6, this);
        this.f2728q = new F.K();
        this.f2729r = F.AbstractC0349n.h();
        this.f2730s = F.AbstractC0349n.h();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f2731t = p020c0.AbstractC1703s.y(bool);
        this.f2732u = p020c0.AbstractC1703s.y(bool);
        this.f2733v = new S.p(11);
    }

    public static java.lang.Object i(E.w wVar, int i3, p117n6.i iVar) {
        wVar.getClass();
        java.lang.Object objC = wVar.c(v.n0.f28974h, new E.v(wVar, i3, null), iVar);
        return objC == p109m6.a.f25430h ? objC : p070h6.A.f22523a;
    }

    @Override // x.Q0
    public final boolean a() {
        return this.f2720h.a();
    }

    @Override // x.Q0
    public final boolean b() {
        return ((java.lang.Boolean) this.f2732u.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r5.f2720h.c(r6, r7, r0) == r1) goto L23;
     */
    @Override // x.Q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(v.n0 n0Var, p194x6.m mVar, p100l6.c cVar) {
        E.u uVar;
        if (cVar instanceof E.u) {
            uVar = (E.u) cVar;
            int i3 = uVar.f2710l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uVar.f2710l = i3 - Integer.MIN_VALUE;
            } else {
                uVar = new E.u(this, cVar);
            }
        } else {
            uVar = new E.u(this, cVar);
        }
        java.lang.Object obj = uVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = uVar.f2710l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (this.f2718e.getValue() == E.y.f2734a) {
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
            com.google.common.util.concurrent.P.u0(obj);
        } else {
            if (i9 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        return p070h6.A.f22523a;
        uVar.f2707h = null;
        uVar.f2708i = null;
        uVar.f2710l = 2;
    }

    @Override // x.Q0
    public final boolean d() {
        return ((java.lang.Boolean) this.f2731t.getValue()).booleanValue();
    }

    @Override // x.Q0
    public final float e(float f9) {
        return this.f2720h.e(f9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(E.p pVar, boolean z6, boolean z9) {
        E.q qVar;
        E.q qVar2;
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
        E.r rVar = pVar.f2665a;
        int i3 = rVar != null ? rVar.f2698a : 0;
        int i9 = pVar.f2666b;
        this.f2732u.setValue(java.lang.Boolean.valueOf((i3 == 0 && i9 == 0) ? false : true));
        this.f2731t.setValue(java.lang.Boolean.valueOf(pVar.f2667c));
        D.w wVar = this.f2717d;
        if (z9) {
            wVar.getClass();
            if (i9 < 0.0f) {
                A.b.c("scrollOffset should be non-negative");
            }
            wVar.f1780c.h(i9);
        } else {
            wVar.getClass();
            wVar.f1782e = (rVar == null || (qVar2 = (E.q) p078i6.m.n0(rVar.f2699b)) == null) ? null : qVar2.f2683b;
            boolean z10 = wVar.f1781d;
            int i10 = pVar.f2678p;
            if (z10 || i10 > 0) {
                wVar.f1781d = true;
                if (i9 < 0.0f) {
                    A.b.c("scrollOffset should be non-negative (" + i9 + ')');
                }
                wVar.a((rVar == null || (qVar = (E.q) p078i6.m.n0(rVar.f2699b)) == null) ? 0 : qVar.f2682a, i9);
            }
            if (this.f2721i) {
                D.C0194a c0194a = this.f2714a;
                int i11 = c0194a.f1664a;
                boolean z11 = c0194a.f1665b;
                p038e0.e eVar = (p038e0.e) c0194a.f1668e;
                if (i11 != -1 && !r9.isEmpty() && i11 != D.C0194a.c(pVar, z11)) {
                    c0194a.f1664a = -1;
                    java.lang.Object[] objArr = eVar.f21324h;
                    int i12 = eVar.j;
                    for (int i13 = 0; i13 < i12; i13++) {
                        ((F.M) objArr[i13]).cancel();
                    }
                    eVar.i();
                }
                int i14 = c0194a.f1666c;
                if (i14 != -1 && c0194a.f1667d != 0.0f && i14 != i10 && !r9.isEmpty()) {
                    int iC = D.C0194a.c(pVar, c0194a.f1667d < 0.0f);
                    int iA = D.C0194a.a(pVar, c0194a.f1667d < 0.0f);
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

    public final E.p g() {
        return (E.p) this.f2718e.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public final void h(float f9, E.p pVar) {
        if (this.f2721i) {
            D.C0194a c0194a = this.f2714a;
            c0194a.getClass();
            if (!pVar.f2675m.isEmpty()) {
                int i3 = 0;
                boolean z6 = f9 < 0.0f;
                int iC = D.C0194a.c(pVar, z6);
                int iA = D.C0194a.a(pVar, z6);
                if (iA >= 0 && iA < pVar.f2678p) {
                    int i9 = c0194a.f1664a;
                    p038e0.e eVar = (p038e0.e) c0194a.f1668e;
                    if (iC != i9 && iC >= 0) {
                        if (c0194a.f1665b != z6) {
                            java.lang.Object[] objArr = eVar.f21324h;
                            int i10 = eVar.j;
                            for (int i11 = 0; i11 < i10; i11++) {
                                ((F.M) objArr[i11]).cancel();
                            }
                        }
                        c0194a.f1665b = z6;
                        c0194a.f1664a = iC;
                        eVar.i();
                        eVar.e(eVar.j, this.f2727p.L(iC));
                    }
                    x.EnumC3061p0 enumC3061p0 = pVar.f2679q;
                    ?? r9 = pVar.f2675m;
                    if (z6) {
                        E.q qVar = (E.q) p078i6.o.q1(r9);
                        if (((com.google.android.gms.internal.play_billing.V0.y(qVar, enumC3061p0) + ((int) (enumC3061p0 == x.EnumC3061p0.f30978h ? qVar.f2693n & 4294967295L : qVar.f2693n >> 32))) + pVar.f2681s) - pVar.f2677o < (-f9)) {
                            java.lang.Object[] objArr2 = eVar.f21324h;
                            int i12 = eVar.j;
                            while (i3 < i12) {
                                ((F.M) objArr2[i3]).a();
                                i3++;
                            }
                        }
                    } else if (pVar.f2676n - com.google.android.gms.internal.play_billing.V0.y((E.q) p078i6.o.h1(r9), enumC3061p0) < f9) {
                        java.lang.Object[] objArr3 = eVar.f21324h;
                        int i13 = eVar.j;
                        while (i3 < i13) {
                            ((F.M) objArr3[i3]).a();
                            i3++;
                        }
                    }
                }
            }
            c0194a.f1667d = f9;
        }
    }
}
