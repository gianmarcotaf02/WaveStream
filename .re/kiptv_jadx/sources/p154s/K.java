package p154s;

/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p163t.E0 f27069a = new p163t.E0(p154s.C2717c.f27120n, p154s.C2717c.f27121o);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p163t.C2761i0 f27070b = p163t.AbstractC2750d.o(0.0f, 400.0f, null, 5);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p163t.C2761i0 f27071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p163t.C2761i0 f27072d;

    static {
        p163t.AbstractC2750d.o(0.0f, 400.0f, null, 5);
        long j = 1;
        long j9 = (j & 4294967295L) | (j << 32);
        f27071c = p163t.AbstractC2750d.o(0.0f, 400.0f, new p113n1.k(j9), 1);
        f27072d = p163t.AbstractC2750d.o(0.0f, 400.0f, new p113n1.m(j9), 1);
    }

    public static final p137q0.p a(p163t.y0 y0Var, p154s.P p2, p154s.Q q9, java.lang.String str, p020c0.C1700q c1700q, int i3) {
        int i9;
        p163t.r0 r0Var;
        p163t.r0 r0Var2;
        p163t.r0 r0Var3;
        p020c0.C1700q c1700q2;
        p163t.y0 y0Var2;
        p163t.r0 r0VarB;
        java.lang.Object f9;
        p020c0.C1700q c1700q3;
        p154s.Q q10;
        p154s.P p9;
        p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
        java.lang.Object objQ = c1700q.Q();
        if (objQ == c1676e) {
            objQ = p154s.H.f27064h;
            c1700q.n0(objQ);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) objQ;
        int i10 = i3 & 14;
        boolean z6 = ((i10 ^ 6) > 4 && c1700q.f(y0Var)) || (i3 & 6) == 4;
        java.lang.Object objQ2 = c1700q.Q();
        if (z6 || objQ2 == c1676e) {
            objQ2 = p020c0.AbstractC1703s.y(p2);
            c1700q.n0(objQ2);
        }
        p020c0.X x9 = (p020c0.X) objQ2;
        java.lang.Object objS0 = y0Var.f27727a.s0();
        p020c0.C1681g0 c1681g0 = y0Var.f27730d;
        java.lang.Object value = c1681g0.getValue();
        D1.AbstractC0220e0 abstractC0220e0 = y0Var.f27727a;
        if (objS0 == value && abstractC0220e0.s0() == p154s.D.f27047i) {
            if (y0Var.g()) {
                x9.setValue(p2);
            } else {
                x9.setValue(p154s.P.f27091b);
            }
        } else if (c1681g0.getValue() == p154s.D.f27047i) {
            x9.setValue(((p154s.P) x9.getValue()).a(p2));
        }
        p154s.P p10 = (p154s.P) x9.getValue();
        int i11 = i3 >> 3;
        int i12 = (i11 & 112) | i10;
        boolean z9 = (((i12 & 14) ^ 6) > 4 && c1700q.f(y0Var)) || (i12 & 6) == 4;
        java.lang.Object objQ3 = c1700q.Q();
        if (z9 || objQ3 == c1676e) {
            objQ3 = p020c0.AbstractC1703s.y(q9);
            c1700q.n0(objQ3);
        }
        p020c0.X x10 = (p020c0.X) objQ3;
        if (abstractC0220e0.s0() == c1681g0.getValue() && abstractC0220e0.s0() == p154s.D.f27047i) {
            if (y0Var.g()) {
                x10.setValue(q9);
            } else {
                x10.setValue(p154s.Q.f27093b);
            }
        } else if (c1681g0.getValue() != p154s.D.f27047i) {
            x10.setValue(((p154s.Q) x10.getValue()).a(q9));
        }
        p154s.Q q11 = (p154s.Q) x10.getValue();
        p154s.b0 b0Var = p10.f27092a;
        p154s.b0 b0Var2 = q11.f27095a;
        boolean z10 = (b0Var.f27112b == null && b0Var2.f27112b == null) ? false : true;
        boolean z11 = (b0Var.f27113c == null && b0Var2.f27113c == null) ? false : true;
        p163t.E0 e6 = p163t.AbstractC2750d.f27574p;
        if (z10) {
            c1700q.c0(133792645);
            java.lang.Object objQ4 = c1700q.Q();
            if (objQ4 == c1676e) {
                objQ4 = str.concat(" slide");
                c1700q.n0(objQ4);
            }
            i9 = i11;
            p163t.r0 r0VarB2 = p163t.C0.b(y0Var, e6, (java.lang.String) objQ4, c1700q, i10 | androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            c1700q.p(false);
            r0Var = r0VarB2;
        } else {
            i9 = i11;
            c1700q.c0(133898448);
            c1700q.p(false);
            r0Var = null;
        }
        if (z11) {
            c1700q.c0(133990239);
            p163t.E0 e9 = p163t.AbstractC2750d.f27575q;
            java.lang.Object objQ5 = c1700q.Q();
            if (objQ5 == c1676e) {
                objQ5 = str.concat(" shrink/expand");
                c1700q.n0(objQ5);
            }
            p163t.r0 r0VarB3 = p163t.C0.b(y0Var, e9, (java.lang.String) objQ5, c1700q, i10 | androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            c1700q.p(false);
            r0Var2 = r0VarB3;
        } else {
            c1700q.c0(134101063);
            c1700q.p(false);
            r0Var2 = null;
        }
        if (z11) {
            c1700q.c0(134174689);
            java.lang.Object objQ6 = c1700q.Q();
            if (objQ6 == c1676e) {
                objQ6 = str.concat(" InterruptionHandlingOffset");
                c1700q.n0(objQ6);
            }
            p163t.r0 r0VarB4 = p163t.C0.b(y0Var, e6, (java.lang.String) objQ6, c1700q, i10 | androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            c1700q.p(false);
            r0Var3 = r0VarB4;
        } else {
            c1700q.c0(134345095);
            c1700q.p(false);
            r0Var3 = null;
        }
        boolean z12 = !z11;
        float[] fArr = p196y0.d.f31732a;
        c1700q.c0(135150476);
        c1700q.p(false);
        p137q0.m mVar = p137q0.m.f26474b;
        int i13 = i10 | (i9 & 7168);
        boolean z13 = (b0Var.f27111a == null && q11.f27095a.f27111a == null) ? false : true;
        p163t.E0 e10 = p163t.AbstractC2750d.j;
        if (z13) {
            c1700q.c0(-703879421);
            java.lang.Object objQ7 = c1700q.Q();
            if (objQ7 == c1676e) {
                objQ7 = str.concat(" alpha");
                c1700q.n0(objQ7);
            }
            y0Var2 = y0Var;
            r0VarB = p163t.C0.b(y0Var2, e10, (java.lang.String) objQ7, c1700q, (i13 & 14) | androidx.media3.exoplayer.RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            c1700q2 = c1700q;
            c1700q2.p(false);
        } else {
            c1700q2 = c1700q;
            y0Var2 = y0Var;
            c1700q2.c0(-703709976);
            c1700q2.p(false);
            r0VarB = null;
        }
        c1700q2.c0(-703472888);
        c1700q2.p(false);
        c1700q2.c0(-703222904);
        c1700q2.p(false);
        boolean zH = c1700q2.h(r0VarB) | c1700q2.f(p10) | c1700q2.f(q11) | c1700q2.h(null) | ((((i13 & 14) ^ 6) > 4 && c1700q2.f(y0Var2)) || (i13 & 6) == 4) | c1700q2.h(null);
        java.lang.Object objQ8 = c1700q2.Q();
        if (zH || objQ8 == c1676e) {
            c1700q3 = c1700q2;
            p163t.r0 r0Var4 = r0VarB;
            q10 = q11;
            p9 = p10;
            f9 = new p154s.F(r0Var4, null, y0Var, p9, q10, null);
            c1700q3.n0(f9);
        } else {
            c1700q3 = c1700q2;
            f9 = objQ8;
            q10 = q11;
            p9 = p10;
        }
        p154s.F f10 = (p154s.F) f9;
        boolean zG = c1700q3.g(z12) | ((((i3 & 7168) ^ 3072) > 2048 && c1700q3.f(function0)) || (i3 & 3072) == 2048);
        java.lang.Object objQ9 = c1700q3.Q();
        if (zG || objQ9 == c1676e) {
            objQ9 = new p154s.I(z12, function0);
            c1700q3.n0(objQ9);
        }
        return p188x0.z.s(mVar, (p194x6.j) objQ9).d(new p154s.E(y0Var, r0Var2, r0Var3, r0Var, p9, q10, function0, f10)).d(mVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static p154s.P b(p163t.A a2, int i3) {
        p137q0.h hVar;
        int i9 = 1;
        if ((i3 & 1) != 0) {
            long j = 1;
            a2 = p163t.AbstractC2750d.o(0.0f, 400.0f, new p113n1.m((j & 4294967295L) | (j << 32)), 1);
        }
        p137q0.g gVar = p137q0.c.f26459s;
        if (gVar.equals(p137q0.c.f26457q)) {
            hVar = p137q0.c.f26450i;
        } else {
            hVar = gVar.equals(gVar) ? p137q0.c.f26455o : p137q0.c.f26452l;
        }
        return new p154s.P(new p154s.b0((p154s.S) null, (p154s.Z) null, new p154s.C2739z(hVar, new p154s.C2717c(i9, 9), a2), (com.google.common.util.concurrent.D) null, (java.util.LinkedHashMap) null, 123));
    }

    public static p154s.P c(p163t.D0 d4, int i3) {
        p163t.A aO = d4;
        if ((i3 & 1) != 0) {
            aO = p163t.AbstractC2750d.o(0.0f, 400.0f, null, 5);
        }
        return new p154s.P(new p154s.b0(new p154s.S(aO), (p154s.Z) null, (p154s.C2739z) null, (com.google.common.util.concurrent.D) null, (java.util.LinkedHashMap) null, 126));
    }

    public static p154s.Q d(p163t.D0 d4, int i3) {
        p163t.A aO = d4;
        if ((i3 & 1) != 0) {
            aO = p163t.AbstractC2750d.o(0.0f, 400.0f, null, 5);
        }
        return new p154s.Q(new p154s.b0(new p154s.S(aO), (p154s.Z) null, (p154s.C2739z) null, (com.google.common.util.concurrent.D) null, (java.util.LinkedHashMap) null, 126));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static p154s.Q e(p163t.D0 d4, int i3) {
        p137q0.h hVar;
        int i9 = 1;
        p163t.A aO = d4;
        if ((i3 & 1) != 0) {
            long j = 1;
            aO = p163t.AbstractC2750d.o(0.0f, 400.0f, new p113n1.m((j & 4294967295L) | (j << 32)), 1);
        }
        p137q0.g gVar = p137q0.c.f26459s;
        if (gVar.equals(p137q0.c.f26457q)) {
            hVar = p137q0.c.f26450i;
        } else {
            hVar = gVar.equals(gVar) ? p137q0.c.f26455o : p137q0.c.f26452l;
        }
        return new p154s.Q(new p154s.b0((p154s.S) null, (p154s.Z) null, new p154s.C2739z(hVar, new p154s.C2717c(i9, 10), aO), (com.google.common.util.concurrent.D) null, (java.util.LinkedHashMap) null, 123));
    }

    public static p154s.P f(p194x6.j jVar) {
        long j = 1;
        return new p154s.P(new p154s.b0((p154s.S) null, new p154s.Z(new p154s.J(0, jVar), p163t.AbstractC2750d.o(0.0f, 400.0f, new p113n1.k((j & 4294967295L) | (j << 32)), 1)), (p154s.C2739z) null, (com.google.common.util.concurrent.D) null, (java.util.LinkedHashMap) null, 125));
    }

    public static p154s.P g(p194x6.j jVar) {
        long j = 1;
        return new p154s.P(new p154s.b0((p154s.S) null, new p154s.Z(new p154s.J(1, jVar), p163t.AbstractC2750d.o(0.0f, 400.0f, new p113n1.k((j & 4294967295L) | (j << 32)), 1)), (p154s.C2739z) null, (com.google.common.util.concurrent.D) null, (java.util.LinkedHashMap) null, 125));
    }

    public static p154s.Q h(p194x6.j jVar) {
        long j = 1;
        return new p154s.Q(new p154s.b0((p154s.S) null, new p154s.Z(new p154s.J(2, jVar), p163t.AbstractC2750d.o(0.0f, 400.0f, new p113n1.k((j & 4294967295L) | (j << 32)), 1)), (p154s.C2739z) null, (com.google.common.util.concurrent.D) null, (java.util.LinkedHashMap) null, 125));
    }

    public static p154s.Q i(p194x6.j jVar) {
        long j = 1;
        return new p154s.Q(new p154s.b0((p154s.S) null, new p154s.Z(new p154s.J(3, jVar), p163t.AbstractC2750d.o(0.0f, 400.0f, new p113n1.k((j & 4294967295L) | (j << 32)), 1)), (p154s.C2739z) null, (com.google.common.util.concurrent.D) null, (java.util.LinkedHashMap) null, 125));
    }
}
