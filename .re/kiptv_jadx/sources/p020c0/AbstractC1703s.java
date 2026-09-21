package p020c0;

/* JADX INFO: renamed from: c0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1703s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A1.b f18358a = new A1.b(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f18359b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p020c0.I f18360c = new p020c0.I();

    public static final p020c0.X A(java.lang.Object obj, java.lang.Object[] objArr, p194x6.m mVar, p020c0.C1700q c1700q) {
        java.lang.Object objQ = c1700q.Q();
        p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
        if (objQ == c1676e) {
            objQ = y(obj);
            c1700q.n0(objQ);
        }
        p020c0.X x9 = (p020c0.X) objQ;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        boolean zH = c1700q.h(mVar);
        java.lang.Object objQ2 = c1700q.Q();
        if (zH || objQ2 == c1676e) {
            objQ2 = new p020c0.X0(mVar, x9, null);
            c1700q.n0(objQ2);
        }
        h(objArrCopyOf, (p194x6.m) objQ2, c1700q);
        return x9;
    }

    public static final p020c0.X B(p188x0.C3086f c3086f, java.lang.Object obj, p194x6.m mVar, p020c0.C1700q c1700q, int i3) {
        java.lang.Object objQ = c1700q.Q();
        p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
        if (objQ == c1676e) {
            objQ = y(c3086f);
            c1700q.n0(objQ);
        }
        p020c0.X x9 = (p020c0.X) objQ;
        boolean zH = c1700q.h(mVar);
        java.lang.Object objQ2 = c1700q.Q();
        if (zH || objQ2 == c1676e) {
            objQ2 = new p020c0.V0(mVar, x9, null);
            c1700q.n0(objQ2);
        }
        e(c1700q, obj, (p194x6.m) objQ2);
        return x9;
    }

    public static final java.lang.Object C(p020c0.InterfaceC1691l0 interfaceC1691l0, p020c0.AbstractC1697o0 abstractC1697o0) {
        kotlin.jvm.internal.m.c(abstractC1697o0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        java.lang.Object objB = interfaceC1691l0.get(abstractC1697o0);
        if (objB == null) {
            objB = abstractC1697o0.b();
        }
        return ((p020c0.h1) objB).a(interfaceC1691l0);
    }

    public static final void D(p020c0.C1700q c1700q, Q0.C0768d c0768d) {
        c1700q.b(p070h6.A.f22523a, new B.d0(18, c0768d));
    }

    public static final p020c0.C1696o E(p020c0.C1700q c1700q) {
        p020c0.C1700q c1700q2;
        c1700q.Z(206, p020c0.AbstractC1705t.f18367e);
        if (c1700q.f18322S) {
            p020c0.N0.z(c1700q.f18312I);
        }
        java.lang.Object objI = c1700q.I();
        p020c0.D0 g9 = objI instanceof p020c0.D0 ? (p020c0.D0) objI : null;
        if (g9 == null) {
            c1700q2 = c1700q;
            g9 = new p020c0.G0(new p020c0.C1694n(new p020c0.C1696o(c1700q2, c1700q.f18323T, c1700q.f18339q, c1700q.f18307C, c1700q.f18331h.f18394A)), -1);
            c1700q2.o0(g9);
        } else {
            c1700q2 = c1700q;
        }
        p020c0.C0 c9 = g9.f18104a;
        kotlin.jvm.internal.m.c(c9, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl.CompositionContextHolder");
        p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q2.l();
        p020c0.C1696o c1696o = ((p020c0.C1694n) c9).f18287h;
        c1696o.f18295f.setValue(interfaceC1691l0L);
        c1700q2.p(false);
        return c1696o;
    }

    public static final p020c0.X F(java.lang.Object obj, p020c0.C1700q c1700q) {
        java.lang.Object objQ = c1700q.Q();
        if (objQ == p020c0.C1690l.f18284a) {
            objQ = y(obj);
            c1700q.n0(objQ);
        }
        p020c0.X x9 = (p020c0.X) objQ;
        x9.setValue(obj);
        return x9;
    }

    public static final void G(p020c0.N0 n3, int i3, java.lang.Object obj) {
        int iH = n3.h(i3);
        java.lang.Object[] objArr = n3.f18155c;
        java.lang.Object obj2 = objArr[iH];
        objArr[iH] = p020c0.C1690l.f18284a;
        if (obj == obj2) {
            return;
        }
        p020c0.AbstractC1705t.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void H(p020c0.C1700q c1700q, java.lang.Object obj, p194x6.m mVar) {
        if (c1700q.f18322S || !kotlin.jvm.internal.m.a(c1700q.Q(), obj)) {
            c1700q.n0(obj);
            c1700q.b(obj, mVar);
        }
    }

    public static final O1.C0754s I(kotlin.jvm.functions.Function0 function0) {
        return new O1.C0754s(new p020c0.b1(function0, null));
    }

    public static final int J(p136q.C2677v c2677v) {
        int iC;
        int i3 = c2677v.f26431b;
        int iC2 = c2677v.c(0);
        while (c2677v.f26431b != 0 && c2677v.c(0) == iC2) {
            int i9 = c2677v.f26431b;
            if (i9 == 0) {
                p144r.a.e("IntList is empty.");
                throw null;
            }
            c2677v.e(0, c2677v.f26430a[i9 - 1]);
            c2677v.d(c2677v.f26431b - 1);
            int i10 = c2677v.f26431b;
            int i11 = i10 >>> 1;
            int i12 = 0;
            while (i12 < i11) {
                int iC3 = c2677v.c(i12);
                int i13 = (i12 + 1) * 2;
                int i14 = i13 - 1;
                int iC4 = c2677v.c(i14);
                if (i13 < i10 && (iC = c2677v.c(i13)) > iC4) {
                    if (iC <= iC3) {
                        break;
                    }
                    c2677v.e(i12, iC);
                    c2677v.e(i13, iC3);
                    i12 = i13;
                } else {
                    if (iC4 <= iC3) {
                        break;
                    }
                    c2677v.e(i12, iC4);
                    c2677v.e(i14, iC3);
                    i12 = i14;
                }
            }
        }
        return iC2;
    }

    public static final int K(int i3) {
        int i9 = 306783378 & i3;
        int i10 = 613566756 & i3;
        return (i3 & (-920350135)) | (i10 >> 1) | i9 | ((i9 << 1) & i10);
    }

    public static final p089k0.j L(p020c0.C1699p0[] c1699p0Arr, p020c0.InterfaceC1691l0 interfaceC1691l0, p020c0.InterfaceC1691l0 interfaceC1691l1) {
        p089k0.i iVar = new p089k0.i(p089k0.j.f24422k);
        for (p020c0.C1699p0 c1699p0 : c1699p0Arr) {
            p020c0.AbstractC1697o0 abstractC1697o0 = (p020c0.AbstractC1697o0) c1699p0.f18302d;
            if (c1699p0.f18301c || !interfaceC1691l0.containsKey(abstractC1697o0)) {
                iVar.put(abstractC1697o0, abstractC1697o0.c(c1699p0, (p020c0.h1) interfaceC1691l1.get(abstractC1697o0)));
            }
        }
        return iVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
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
    public static final void a(p020c0.C1699p0 c1699p0, p194x6.m mVar, p020c0.C1700q c1700q, int i3) {
        p020c0.h1 h1Var;
        boolean z6;
        p020c0.C1701q0 c1701q0U;
        c1700q.e0(-149765515);
        p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
        c1700q.Z(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.CREATED, p020c0.AbstractC1705t.f18364b);
        java.lang.Object objQ = c1700q.Q();
        if (kotlin.jvm.internal.m.a(objQ, p020c0.C1690l.f18284a)) {
            h1Var = null;
        } else {
            kotlin.jvm.internal.m.c(objQ, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            h1Var = (p020c0.h1) objQ;
        }
        p020c0.AbstractC1697o0 abstractC1697o0 = (p020c0.AbstractC1697o0) c1699p0.f18302d;
        p020c0.h1 h1VarC = abstractC1697o0.c(c1699p0, h1Var);
        boolean zEquals = h1VarC.equals(h1Var);
        if (!zEquals) {
            c1700q.n0(h1VarC);
        }
        if (!c1700q.f18322S) {
            p020c0.J0 j9 = c1700q.f18311G;
            java.lang.Object objB = j9.b(j9.f18123b, j9.g);
            kotlin.jvm.internal.m.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            p020c0.InterfaceC1691l0 interfaceC1691l0 = (p020c0.InterfaceC1691l0) objB;
            if (!(c1700q.F() && zEquals) && (c1699p0.f18301c || !interfaceC1691l0L.containsKey(abstractC1697o0))) {
                interfaceC1691l0L = ((p089k0.j) interfaceC1691l0L).b(abstractC1697o0, h1VarC);
            } else if ((zEquals && !c1700q.f18345w) || !c1700q.f18345w) {
                interfaceC1691l0L = interfaceC1691l0;
            }
            if (c1700q.y || interfaceC1691l0 != interfaceC1691l0L) {
                z6 = true;
            }
            if (z6 && !c1700q.f18322S) {
                c1700q.O(interfaceC1691l0L);
            }
            boolean z9 = c1700q.f18345w;
            Q0.C0784s c0784s = c1700q.f18346x;
            c0784s.c(z9 ? 1 : 0);
            c1700q.f18345w = z6;
            c1700q.f18314K = interfaceC1691l0L;
            c1700q.X(p020c0.AbstractC1705t.f18365c, 202, interfaceC1691l0L, 0);
            mVar.invoke(c1700q, java.lang.Integer.valueOf((i3 >> 3) & 14));
            c1700q.p(false);
            c1700q.p(false);
            c1700q.f18345w = c0784s.b() != 0;
            c1700q.f18314K = null;
            c1701q0U = c1700q.u();
            if (c1701q0U != null) {
                c1701q0U.f18351d = new D.l(c1699p0, mVar, i3, 7);
            }
        }
        if (c1699p0.f18301c || !interfaceC1691l0L.containsKey(abstractC1697o0)) {
            interfaceC1691l0L = ((p089k0.j) interfaceC1691l0L).b(abstractC1697o0, h1VarC);
        }
        c1700q.f18313J = true;
        z6 = false;
        if (z6) {
            c1700q.O(interfaceC1691l0L);
        }
        boolean z10 = c1700q.f18345w;
        Q0.C0784s c0784s2 = c1700q.f18346x;
        c0784s2.c(z10 ? 1 : 0);
        c1700q.f18345w = z6;
        c1700q.f18314K = interfaceC1691l0L;
        c1700q.X(p020c0.AbstractC1705t.f18365c, 202, interfaceC1691l0L, 0);
        mVar.invoke(c1700q, java.lang.Integer.valueOf((i3 >> 3) & 14));
        c1700q.p(false);
        c1700q.p(false);
        c1700q.f18345w = c0784s2.b() != 0;
        c1700q.f18314K = null;
        c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new D.l(c1699p0, mVar, i3, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
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
    public static final void b(p020c0.C1699p0[] c1699p0Arr, p089k0.e eVar, p020c0.C1700q c1700q, int i3) {
        p020c0.InterfaceC1691l0 interfaceC1691l0M0;
        boolean z6;
        p020c0.C1701q0 c1701q0U;
        c1700q.e0(415205898);
        p020c0.InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
        c1700q.Z(com.revenuecat.purchases.common.networking.RCHTTPStatusCodes.CREATED, p020c0.AbstractC1705t.f18364b);
        if (c1700q.f18322S) {
            interfaceC1691l0M0 = c1700q.m0(interfaceC1691l0L, L(c1699p0Arr, interfaceC1691l0L, p089k0.j.f24422k));
            c1700q.f18313J = true;
        } else {
            p020c0.J0 j9 = c1700q.f18311G;
            java.lang.Object objH = j9.h(j9.g, 0);
            kotlin.jvm.internal.m.c(objH, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            p020c0.InterfaceC1691l0 interfaceC1691l0 = (p020c0.InterfaceC1691l0) objH;
            p020c0.J0 j10 = c1700q.f18311G;
            java.lang.Object objH2 = j10.h(j10.g, 1);
            kotlin.jvm.internal.m.c(objH2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            p020c0.InterfaceC1691l0 interfaceC1691l1 = (p020c0.InterfaceC1691l0) objH2;
            p089k0.j jVarL = L(c1699p0Arr, interfaceC1691l0L, interfaceC1691l1);
            if (!c1700q.F() || c1700q.y || !interfaceC1691l1.equals(jVarL)) {
                interfaceC1691l0M0 = c1700q.m0(interfaceC1691l0L, jVarL);
                if (c1700q.y || !kotlin.jvm.internal.m.a(interfaceC1691l0M0, interfaceC1691l0)) {
                    z6 = true;
                }
                if (z6 && !c1700q.f18322S) {
                    c1700q.O(interfaceC1691l0M0);
                }
                boolean z9 = c1700q.f18345w;
                Q0.C0784s c0784s = c1700q.f18346x;
                c0784s.c(z9 ? 1 : 0);
                c1700q.f18345w = z6;
                c1700q.f18314K = interfaceC1691l0M0;
                c1700q.X(p020c0.AbstractC1705t.f18365c, 202, interfaceC1691l0M0, 0);
                eVar.invoke(c1700q, java.lang.Integer.valueOf((i3 >> 3) & 14));
                c1700q.p(false);
                c1700q.p(false);
                c1700q.f18345w = c0784s.b() != 0;
                c1700q.f18314K = null;
                c1701q0U = c1700q.u();
                if (c1701q0U != null) {
                    c1701q0U.f18351d = new D.l(c1699p0Arr, eVar, i3, 8);
                }
            }
            c1700q.f18334l = c1700q.f18311G.s() + c1700q.f18334l;
            interfaceC1691l0M0 = interfaceC1691l0;
        }
        z6 = false;
        if (z6) {
            c1700q.O(interfaceC1691l0M0);
        }
        boolean z10 = c1700q.f18345w;
        Q0.C0784s c0784s2 = c1700q.f18346x;
        c0784s2.c(z10 ? 1 : 0);
        c1700q.f18345w = z6;
        c1700q.f18314K = interfaceC1691l0M0;
        c1700q.X(p020c0.AbstractC1705t.f18365c, 202, interfaceC1691l0M0, 0);
        eVar.invoke(c1700q, java.lang.Integer.valueOf((i3 >> 3) & 14));
        c1700q.p(false);
        c1700q.p(false);
        c1700q.f18345w = c0784s2.b() != 0;
        c1700q.f18314K = null;
        c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new D.l(c1699p0Arr, eVar, i3, 8);
        }
    }

    public static final void c(java.lang.Object obj, java.lang.Object obj2, p194x6.j jVar, p020c0.C1700q c1700q) {
        boolean zF = c1700q.f(obj) | c1700q.f(obj2);
        java.lang.Object objQ = c1700q.Q();
        if (zF || objQ == p020c0.C1690l.f18284a) {
            objQ = new p020c0.G(jVar);
            c1700q.n0(objQ);
        }
    }

    public static final void d(java.lang.Object obj, p194x6.j jVar, p020c0.C1700q c1700q) {
        boolean zF = c1700q.f(obj);
        java.lang.Object objQ = c1700q.Q();
        if (zF || objQ == p020c0.C1690l.f18284a) {
            objQ = new p020c0.G(jVar);
            c1700q.n0(objQ);
        }
    }

    public static final void e(p020c0.C1700q c1700q, java.lang.Object obj, p194x6.m mVar) {
        p100l6.h hVar = c1700q.f18321R;
        boolean zF = c1700q.f(obj);
        java.lang.Object objQ = c1700q.Q();
        if (zF || objQ == p020c0.C1690l.f18284a) {
            objQ = new p020c0.T(hVar, mVar);
            c1700q.n0(objQ);
        }
    }

    public static final void f(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, p194x6.m mVar, p020c0.C1700q c1700q) {
        p100l6.h hVar = c1700q.f18321R;
        boolean zF = c1700q.f(obj) | c1700q.f(obj2) | c1700q.f(obj3);
        java.lang.Object objQ = c1700q.Q();
        if (zF || objQ == p020c0.C1690l.f18284a) {
            objQ = new p020c0.T(hVar, mVar);
            c1700q.n0(objQ);
        }
    }

    public static final void g(java.lang.Object obj, java.lang.Object obj2, p194x6.m mVar, p020c0.C1700q c1700q) {
        p100l6.h hVar = c1700q.f18321R;
        boolean zF = c1700q.f(obj) | c1700q.f(obj2);
        java.lang.Object objQ = c1700q.Q();
        if (zF || objQ == p020c0.C1690l.f18284a) {
            objQ = new p020c0.T(hVar, mVar);
            c1700q.n0(objQ);
        }
    }

    public static final void h(java.lang.Object[] objArr, p194x6.m mVar, p020c0.C1700q c1700q) {
        p100l6.h hVar = c1700q.f18321R;
        boolean zF = false;
        for (java.lang.Object obj : java.util.Arrays.copyOf(objArr, objArr.length)) {
            zF |= c1700q.f(obj);
        }
        java.lang.Object objQ = c1700q.Q();
        if (zF || objQ == p020c0.C1690l.f18284a) {
            c1700q.n0(new p020c0.T(hVar, mVar));
        }
    }

    public static final void i(kotlin.jvm.functions.Function0 function0, p020c0.C1700q c1700q) {
        p030d0.C2106a c2106a = c1700q.f18316M.f21120b;
        c2106a.getClass();
        p030d0.B b9 = p030d0.B.f21102d;
        p030d0.L l2 = c2106a.f21118d;
        l2.J(b9);
        com.google.crypto.tink.shaded.protobuf.AbstractC1909d.f0(l2, 0, function0);
    }

    public static final void j(java.util.ArrayList arrayList, int i3, int i9) {
        int iS = s(i3, arrayList);
        if (iS < 0) {
            iS = -(iS + 1);
        }
        while (iS < arrayList.size() && ((p020c0.O) arrayList.get(iS)).f18176b < i9) {
        }
    }

    public static final void k(p136q.C2677v c2677v, int i3) {
        if (c2677v.f26431b == 0 || !(c2677v.c(0) == i3 || c2677v.c(c2677v.f26431b - 1) == i3)) {
            int i9 = c2677v.f26431b;
            c2677v.a(i3);
            while (i9 > 0) {
                int i10 = ((i9 + 1) >>> 1) - 1;
                int iC = c2677v.c(i10);
                if (i3 <= iC) {
                    break;
                }
                c2677v.e(i9, iC);
                i9 = i10;
            }
            c2677v.e(i9, i3);
        }
    }

    public static void l(p020c0.N0 n3, java.util.List list, p020c0.C1715y c1715y) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            int iC = n3.c((p020c0.C1668a) list.get(i3));
            int iN = n3.N(n3.f18154b, n3.r(iC));
            java.lang.Object obj = iN < n3.g(n3.f18154b, n3.r(iC + 1)) ? n3.f18155c[n3.h(iN)] : p020c0.C1690l.f18284a;
            p020c0.C1701q0 c1701q0 = obj instanceof p020c0.C1701q0 ? (p020c0.C1701q0) obj : null;
            if (c1701q0 != null) {
                c1701q0.f18348a = c1715y;
            }
        }
    }

    public static final p020c0.X m(V7.X x9, java.lang.Object obj, p100l6.h hVar, p020c0.C1700q c1700q, int i3, int i9) {
        if ((i9 & 2) != 0) {
            hVar = p100l6.i.f24820h;
        }
        boolean zH = c1700q.h(hVar) | c1700q.h(x9);
        java.lang.Object objQ = c1700q.Q();
        java.lang.Object obj2 = p020c0.C1690l.f18284a;
        if (zH || objQ == obj2) {
            objQ = new p020c0.a1(hVar, x9, null);
            c1700q.n0(objQ);
        }
        p194x6.m mVar = (p194x6.m) objQ;
        java.lang.Object objQ2 = c1700q.Q();
        if (objQ2 == obj2) {
            objQ2 = y(obj);
            c1700q.n0(objQ2);
        }
        p020c0.X x10 = (p020c0.X) objQ2;
        boolean zH2 = c1700q.h(mVar);
        java.lang.Object objQ3 = c1700q.Q();
        if (zH2 || objQ3 == obj2) {
            objQ3 = new p020c0.W0(mVar, x10, null);
            c1700q.n0(objQ3);
        }
        g(x9, hVar, (p194x6.m) objQ3, c1700q);
        return x10;
    }

    public static final p020c0.X n(V7.l0 l0Var, p020c0.C1700q c1700q) {
        return m(l0Var, l0Var.getValue(), p100l6.i.f24820h, c1700q, 0, 0);
    }

    public static final void o(p020c0.J0 j9, java.util.ArrayList arrayList, int i3) {
        if (j9.l(i3)) {
            arrayList.add(j9.n(i3));
            return;
        }
        int[] iArr = j9.f18123b;
        int i9 = iArr[(i3 * 5) + 3] + i3;
        for (int i10 = i3 + 1; i10 < i9; i10 += iArr[(i10 * 5) + 3]) {
            o(j9, arrayList, i10);
        }
    }

    public static final S7.A p(p020c0.C1700q c1700q) {
        return new p020c0.F0(c1700q.f18321R);
    }

    public static final p038e0.e q() {
        j1.l lVar = p020c0.T0.f18196b;
        p038e0.e eVar = (p038e0.e) lVar.i();
        if (eVar != null) {
            return eVar;
        }
        p038e0.e eVar2 = new p038e0.e(new p020c0.C1698p[0]);
        lVar.v(eVar2);
        return eVar2;
    }

    public static final p020c0.F r(kotlin.jvm.functions.Function0 function0) {
        j1.l lVar = p020c0.T0.f18195a;
        return new p020c0.F(function0, null);
    }

    public static final int s(int i3, java.util.ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            int iF = kotlin.jvm.internal.m.f(((p020c0.O) arrayList.get(i10)).f18176b, i3);
            if (iF < 0) {
                i9 = i10 + 1;
            } else {
                if (iF <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static final int t(p020c0.C1700q c1700q) {
        c1700q.getClass();
        return java.lang.Long.hashCode(c1700q.f18323T);
    }

    public static final long u(p020c0.C1700q c1700q) {
        return c1700q.f18323T;
    }

    public static final R0.Z v(p100l6.h hVar) {
        R0.Z z6 = (R0.Z) hVar.get(p020c0.C1676e.j);
        if (z6 != null) {
            return z6;
        }
        throw new java.lang.IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void w(p020c0.C1700q c1700q, java.lang.Integer num, Q0.C0770e c0770e) {
        if (c1700q.f18322S) {
            c1700q.b(num, c0770e);
        }
    }

    public static java.util.List x(p020c0.N0 n3, int i3, p020c0.N0 n9, boolean z6, boolean z9, boolean z10) {
        java.util.List list;
        boolean zI;
        int iU = n3.u(i3);
        int i9 = i3 + iU;
        int iF = n3.f(i3);
        int iF2 = n3.f(i9);
        int i10 = iF2 - iF;
        boolean z11 = i3 >= 0 && (n3.f18154b[(n3.r(i3) * 5) + 1] & 201326592) != 0;
        n9.w(iU);
        n9.x(i10, n9.f18170t);
        if (n3.g < i9) {
            n3.B(i9);
        }
        if (n3.f18161k < iF2) {
            n3.C(iF2, i9);
        }
        int[] iArr = n9.f18154b;
        int i11 = n9.f18170t;
        int i12 = i11 * 5;
        p078i6.m.Y(i12, i3 * 5, i9 * 5, n3.f18154b, iArr);
        java.lang.Object[] objArr = n9.f18155c;
        int i13 = n9.f18160i;
        java.lang.System.arraycopy(n3.f18155c, iF, objArr, i13, i10);
        int i14 = n9.f18172v;
        iArr[i12 + 2] = i14;
        int i15 = i11 - i3;
        int i16 = i11 + iU;
        int iG = i13 - n9.g(iArr, i11);
        int i17 = n9.f18163m;
        int i18 = n9.f18162l;
        int length = objArr.length;
        boolean z12 = z11;
        int i19 = i17;
        int i20 = i11;
        while (i20 < i16) {
            if (i20 != i11) {
                int i21 = (i20 * 5) + 2;
                iArr[i21] = iArr[i21] + i15;
            }
            int[] iArr2 = iArr;
            iArr2[(i20 * 5) + 4] = p020c0.N0.i(n9.g(iArr, i20) + iG, i19 < i20 ? 0 : n9.f18161k, i18, length);
            if (i20 == i19) {
                i19++;
            }
            i20++;
            i11 = i11;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        n9.f18163m = i19;
        int iB = p020c0.M0.b(n3.f18156d, i3, n3.p());
        int iB2 = p020c0.M0.b(n3.f18156d, i9, n3.p());
        if (iB < iB2) {
            java.util.ArrayList arrayList = n3.f18156d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(iB2 - iB);
            for (int i22 = iB; i22 < iB2; i22++) {
                p020c0.C1668a c1668a = (p020c0.C1668a) arrayList.get(i22);
                c1668a.f18215a += i15;
                arrayList2.add(c1668a);
            }
            n9.f18156d.addAll(p020c0.M0.b(n9.f18156d, n9.f18170t, n9.p()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = p078i6.w.f23205h;
        }
        if (!list.isEmpty()) {
            java.util.HashMap map = n3.f18157e;
            java.util.HashMap map2 = n9.f18157e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i23 = 0; i23 < size; i23++) {
                }
            }
        }
        int i24 = n9.f18172v;
        n9.O(i14);
        int iE = n3.E(n3.f18154b, i3);
        if (!z10) {
            zI = false;
        } else if (z6) {
            boolean z13 = iE >= 0;
            if (z13) {
                n3.P();
                n3.a(iE - n3.f18170t);
                n3.P();
            }
            n3.a(i3 - n3.f18170t);
            boolean zH = n3.H();
            if (z13) {
                n3.M();
                n3.j();
                n3.M();
                n3.j();
            }
            zI = zH;
        } else {
            zI = n3.I(i3, iU);
            n3.J(iF, i10, i3 - 1);
        }
        if (zI) {
            p020c0.AbstractC1705t.a("Unexpectedly removed anchors");
        }
        int i25 = n9.f18165o;
        int i26 = iArr3[i12 + 1];
        n9.f18165o = i25 + ((1073741824 & i26) == 0 ? i26 & 67108863 : 1);
        if (z9) {
            n9.f18170t = i16;
            n9.f18160i = i13 + i10;
        }
        if (z12) {
            n9.T(i14);
        }
        return list;
    }

    public static p020c0.C1681g0 y(java.lang.Object obj) {
        return new p020c0.C1681g0(obj, p020c0.C1676e.f18243n);
    }

    public static final p020c0.X z(p020c0.C1700q c1700q, java.lang.Object obj, p194x6.m mVar) {
        java.lang.Object objQ = c1700q.Q();
        p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
        if (objQ == c1676e) {
            objQ = y(obj);
            c1700q.n0(objQ);
        }
        p020c0.X x9 = (p020c0.X) objQ;
        p070h6.A a2 = p070h6.A.f22523a;
        boolean zH = c1700q.h(mVar);
        java.lang.Object objQ2 = c1700q.Q();
        if (zH || objQ2 == c1676e) {
            objQ2 = new p020c0.U0(mVar, x9, null);
            c1700q.n0(objQ2);
        }
        e(c1700q, a2, (p194x6.m) objQ2);
        return x9;
    }
}
