package U;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final K0.C0661i f10007A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f10008B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J.z0 f10009a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public J.X f10012d;
    public kotlin.jvm.functions.Function0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public R0.InterfaceC0834l0 f10015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public S7.A f10016i;
    public U.C0945s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public F0.a f10017k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p175v0.y f10018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p020c0.C1681g0 f10019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p020c0.C1681g0 f10020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10021o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p011b1.L f10022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f10023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p020c0.C1681g0 f10024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p020c0.C1681g0 f10025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10026t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g1.x f10027u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public K0.C0661i f10028v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p011b1.L f10029w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p020c0.C1681g0 f10030x;
    public final S.p y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final U.g0 f10031z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g1.q f10010b = J.A0.f5623a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p194x6.j f10011c = new I5.W0(19);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p020c0.C1681g0 f10013e = p020c0.AbstractC1703s.y(new g1.x((java.lang.String) null, 0, 7));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g1.F f10014f = g1.E.f21788h;

    public i0(J.z0 z0Var) {
        this.f10009a = z0Var;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.f10019m = p020c0.AbstractC1703s.y(bool);
        this.f10020n = p020c0.AbstractC1703s.y(bool);
        this.f10021o = 0L;
        this.f10023q = 0L;
        this.f10024r = p020c0.AbstractC1703s.y(null);
        this.f10025s = p020c0.AbstractC1703s.y(null);
        this.f10026t = -1;
        this.f10027u = new g1.x((java.lang.String) null, 0L, 7);
        this.f10030x = p020c0.AbstractC1703s.y(java.lang.Boolean.FALSE);
        S.p pVar = new S.p(24, false);
        pVar.j = P.m.f8097h;
        this.y = pVar;
        this.f10031z = new U.g0(this);
        this.f10007A = new K0.C0661i(this);
    }

    public static final p070h6.k a(U.i0 i0Var) {
        java.lang.String str;
        p011b1.L l2;
        p011b1.C1650g c1650gM = i0Var.m();
        if (c1650gM == null || (str = c1650gM.f17809i) == null || (l2 = i0Var.f10029w) == null) {
            return null;
        }
        g1.q qVar = i0Var.f10010b;
        long j = l2.f17784a;
        return new p070h6.k(str, new p011b1.L(p011b1.D.b(qVar.n((int) (j >> 32)), i0Var.f10010b.n((int) (4294967295L & j)))));
    }

    public static final void b(U.i0 i0Var, p011b1.L l2) {
        p011b1.C1650g c1650gM;
        java.lang.String str;
        S7.A a2;
        if (l2 == null) {
            i0Var.getClass();
            return;
        }
        U.C0945s c0945s = i0Var.j;
        if (c0945s == null || (c1650gM = i0Var.m()) == null || (str = c1650gM.f17809i) == null) {
            return;
        }
        g1.q qVar = i0Var.f10010b;
        long j = l2.f17784a;
        long jB = p011b1.D.b(qVar.n((int) (j >> 32)), qVar.n((int) (j & 4294967295L)));
        if (str.length() <= 0 || p011b1.L.c(jB) || (a2 = i0Var.f10016i) == null) {
            return;
        }
        S7.C.A(a2, null, new U.e0(c0945s, str, jB, l2, i0Var, qVar, null), 3);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r27v1 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public static final long c(U.i0 r25, g1.x r26, long r27, boolean r29, boolean r30, D1.C0223h r31, boolean r32) {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U.i0.c(U.i0, g1.x, long, boolean, boolean, D1.h, boolean):long");
    }

    public static g1.x e(p011b1.C1650g c1650g, long j) {
        return new g1.x(c1650g, j, (p011b1.L) null);
    }

    public final S7.w0 d(boolean z6) {
        S7.A a2 = this.f10016i;
        if (a2 == null) {
            return null;
        }
        S7.B b9 = S7.B.f9521h;
        return S7.C.A(a2, null, new U.a0(this, z6, null), 1);
    }

    public final void f() {
        S7.A a2 = this.f10016i;
        if (a2 != null) {
            S7.B b9 = S7.B.f9521h;
            S7.C.A(a2, null, new U.c0(this, null), 1);
        }
    }

    public final void g(p181w0.a aVar) {
        if (!p011b1.L.c(n().f21848b)) {
            J.X x9 = this.f10012d;
            J.y0 y0VarD = x9 != null ? x9.d() : null;
            int iE = (aVar == null || y0VarD == null) ? p011b1.L.e(n().f21848b) : this.f10010b.i(y0VarD.b(aVar.f29744a, true));
            g1.x xVarA = g1.x.a(n(), null, p011b1.D.b(iE, iE), 5);
            this.f10011c.invoke(xVarA);
            this.f10029w = new p011b1.L(xVarA.f21848b);
        }
        q((aVar == null || n().f21847a.f17809i.length() <= 0) ? J.M.f5654h : J.M.j);
        t(false);
    }

    public final void h(boolean z6) {
        p175v0.y yVar;
        J.X x9 = this.f10012d;
        if (x9 != null && !x9.b() && (yVar = this.f10018l) != null) {
            p175v0.y.a(yVar);
        }
        this.f10027u = n();
        t(z6);
        q(J.M.f5655i);
    }

    public final p181w0.a i() {
        return (p181w0.a) this.f10025s.getValue();
    }

    public final boolean j() {
        return ((java.lang.Boolean) this.f10019m.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((java.lang.Boolean) this.f10020n.getValue()).booleanValue();
    }

    public final long l(boolean z6) {
        J.y0 y0VarD;
        long j;
        J.X x9 = this.f10012d;
        if (x9 == null || (y0VarD = x9.d()) == null) {
            return 9205357640488583168L;
        }
        p011b1.J j9 = y0VarD.f5963a;
        p011b1.C1650g c1650gM = m();
        if (c1650gM == null) {
            return 9205357640488583168L;
        }
        if (!kotlin.jvm.internal.m.a(c1650gM.f17809i, j9.f17772a.f17764a.f17809i)) {
            return 9205357640488583168L;
        }
        g1.x xVarN = n();
        if (z6) {
            long j10 = xVarN.f21848b;
            int i3 = p011b1.L.f17783c;
            j = j10 >> 32;
        } else {
            long j11 = xVarN.f21848b;
            int i9 = p011b1.L.f17783c;
            j = j11 & 4294967295L;
        }
        int iN = this.f10010b.n((int) j);
        boolean zG = p011b1.L.g(n().f21848b);
        p011b1.C1658o c1658o = j9.f17773b;
        int iD = c1658o.d(iN);
        if (iD >= c1658o.f17833f) {
            return 9205357640488583168L;
        }
        float fD = j9.d(iN, j9.a(((!z6 || zG) && (z6 || !zG)) ? java.lang.Math.max(iN + (-1), 0) : iN) == j9.h(iN));
        long j12 = j9.f17774c;
        return (((long) java.lang.Float.floatToRawIntBits(O7.r.r(c1658o.b(iD), 0.0f, (int) (j12 & 4294967295L)))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(O7.r.r(fD, 0.0f, (int) (j12 >> 32)))) << 32);
    }

    public final p011b1.C1650g m() {
        J.f0 f0Var;
        J.X x9 = this.f10012d;
        if (x9 == null || (f0Var = x9.f5720a) == null) {
            return null;
        }
        return f0Var.f5770a;
    }

    public final g1.x n() {
        return (g1.x) this.f10013e.getValue();
    }

    public final void o() {
        S7.w0 w0Var;
        P.l lVar = (P.l) this.y.f9153i;
        if (lVar == null || (w0Var = lVar.f8092B) == null) {
            return;
        }
        w0Var.e(null);
        lVar.f8092B = null;
    }

    public final void p() {
        S7.A a2 = this.f10016i;
        if (a2 != null) {
            S7.B b9 = S7.B.f9521h;
            S7.C.A(a2, null, new U.f0(this, null), 1);
        }
    }

    public final void q(J.M m8) {
        J.X x9 = this.f10012d;
        if (x9 != null) {
            if (x9.a() == m8) {
                x9 = null;
            }
            if (x9 != null) {
                x9.f5728k.setValue(m8);
            }
        }
    }

    public final void r() {
        J.X x9;
        Q.f fVar;
        p121o0.f fVarE = p121o0.o.e();
        p194x6.j jVarE = fVarE != null ? fVarE.e() : null;
        p121o0.f fVarH = p121o0.o.h(fVarE);
        try {
            if (!k() || ((x9 = this.f10012d) != null && !((java.lang.Boolean) x9.f5734q.getValue()).booleanValue())) {
                p121o0.o.k(fVarE, fVarH, jVarE);
                return;
            }
            p121o0.o.k(fVarE, fVarH, jVarE);
            S.p pVar = this.y;
            if (((P.m) pVar.j) == P.m.f8097h) {
                A.b.c("ToolbarRequester is not initialized.");
            }
            P.l lVar = (P.l) pVar.f9153i;
            if (lVar == null || !lVar.f26487u) {
                return;
            }
            S7.w0 w0Var = lVar.f8092B;
            if ((w0Var == null || !w0Var.isActive()) && (fVar = (Q.f) Q0.AbstractC0777k.h(lVar, Q.g.f8199b)) != null) {
                S7.A aB0 = lVar.B0();
                S7.B b9 = S7.B.f9521h;
                lVar.f8092B = S7.C.A(aB0, null, new P.k(lVar, fVar, null), 1);
            }
        } catch (java.lang.Throwable th) {
            p121o0.o.k(fVarE, fVarH, jVarE);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(p117n6.c cVar) {
        U.h0 h0Var;
        U.i0 i0Var;
        if (cVar instanceof U.h0) {
            h0Var = (U.h0) cVar;
            int i3 = h0Var.f10002k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h0Var.f10002k = i3 - Integer.MIN_VALUE;
            } else {
                h0Var = new U.h0(this, cVar);
            }
        } else {
            h0Var = new U.h0(this, cVar);
        }
        java.lang.Object objValueOf = h0Var.f10001i;
        java.lang.Object obj = p109m6.a.f25430h;
        int i9 = h0Var.f10002k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objValueOf);
            R0.InterfaceC0834l0 interfaceC0834l0 = this.f10015h;
            if (interfaceC0834l0 != null) {
                h0Var.f10000h = this;
                h0Var.f10002k = 1;
                android.content.ClipDescription primaryClipDescription = ((R0.C0829j) interfaceC0834l0).f8927a.f8931a.getPrimaryClipDescription();
                objValueOf = java.lang.Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                if (objValueOf == obj) {
                    return obj;
                }
                i0Var = this;
            }
            return p070h6.A.f22523a;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i0Var = h0Var.f10000h;
        com.google.common.util.concurrent.P.u0(objValueOf);
        java.lang.Boolean bool = (java.lang.Boolean) objValueOf;
        bool.getClass();
        i0Var.f10030x.setValue(bool);
        return p070h6.A.f22523a;
    }

    public final void t(boolean z6) {
        J.X x9 = this.f10012d;
        if (x9 != null) {
            x9.f5729l.setValue(java.lang.Boolean.valueOf(z6));
        }
        if (z6) {
            r();
        } else {
            o();
        }
    }
}
