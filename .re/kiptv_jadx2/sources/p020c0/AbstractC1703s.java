package p020c0;

import A1.b;
import B.d0;
import D.l;
import O1.C0754s;
import Q0.C0768d;
import Q0.C0770e;
import Q0.C0784s;
import R0.Z;
import V7.X;
import V7.l0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p030d0.B;
import p030d0.C2106a;
import p030d0.L;
import p070h6.A;
import p078i6.w;
import p089k0.e;
import p089k0.i;
import p089k0.j;
import p100l6.h;
import p136q.C2677v;
import p144r.a;
import p188x0.C3086f;
import p194x6.m;

public abstract class AbstractC1703s {

    public static final b f18358a = new b(8);

    public static final Object f18359b = new Object();

    public static final I f18360c = new I();

    public static final X A(Object obj, Object[] objArr, m mVar, C1700q c1700q) {
        Object objQ = c1700q.Q();
        C1676e c1676e = C1690l.f18284a;
        if (objQ == c1676e) {
            objQ = y(obj);
            c1700q.n0(objQ);
        }
        X x9 = (X) objQ;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zH = c1700q.h(mVar);
        Object objQ2 = c1700q.Q();
        if (zH || objQ2 == c1676e) {
            objQ2 = new X0(mVar, x9, null);
            c1700q.n0(objQ2);
        }
        h(objArrCopyOf, (m) objQ2, c1700q);
        return x9;
    }

    public static final X B(C3086f c3086f, Object obj, m mVar, C1700q c1700q, int i3) {
        Object objQ = c1700q.Q();
        C1676e c1676e = C1690l.f18284a;
        if (objQ == c1676e) {
            objQ = y(c3086f);
            c1700q.n0(objQ);
        }
        X x9 = (X) objQ;
        boolean zH = c1700q.h(mVar);
        Object objQ2 = c1700q.Q();
        if (zH || objQ2 == c1676e) {
            objQ2 = new V0(mVar, x9, null);
            c1700q.n0(objQ2);
        }
        e(c1700q, obj, (m) objQ2);
        return x9;
    }

    public static final Object C(InterfaceC1691l0 interfaceC1691l0, AbstractC1697o0 abstractC1697o0) {
        kotlin.jvm.internal.m.c(abstractC1697o0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object objB = interfaceC1691l0.get(abstractC1697o0);
        if (objB == null) {
            objB = abstractC1697o0.b();
        }
        return ((h1) objB).a(interfaceC1691l0);
    }

    public static final void D(C1700q c1700q, C0768d c0768d) {
        c1700q.b(A.f22523a, new d0(18, c0768d));
    }

    public static final C1696o E(C1700q c1700q) {
        C1700q c1700q2;
        c1700q.Z(206, AbstractC1705t.f18367e);
        if (c1700q.f18322S) {
            N0.z(c1700q.f18312I);
        }
        Object objI = c1700q.I();
        D0 g9 = objI instanceof D0 ? (D0) objI : null;
        if (g9 == null) {
            c1700q2 = c1700q;
            g9 = new G0(new C1694n(new C1696o(c1700q2, c1700q.f18323T, c1700q.f18339q, c1700q.f18307C, c1700q.f18331h.f18394A)), -1);
            c1700q2.o0(g9);
        } else {
            c1700q2 = c1700q;
        }
        C0 c9 = g9.f18104a;
        kotlin.jvm.internal.m.c(c9, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl.CompositionContextHolder");
        InterfaceC1691l0 interfaceC1691l0L = c1700q2.l();
        C1696o c1696o = ((C1694n) c9).f18287h;
        c1696o.f18295f.setValue(interfaceC1691l0L);
        c1700q2.p(false);
        return c1696o;
    }

    public static final X F(Object obj, C1700q c1700q) {
        Object objQ = c1700q.Q();
        if (objQ == C1690l.f18284a) {
            objQ = y(obj);
            c1700q.n0(objQ);
        }
        X x9 = (X) objQ;
        x9.setValue(obj);
        return x9;
    }

    public static final void G(N0 n3, int i3, Object obj) {
        int iH = n3.h(i3);
        Object[] objArr = n3.f18155c;
        Object obj2 = objArr[iH];
        objArr[iH] = C1690l.f18284a;
        if (obj == obj2) {
            return;
        }
        AbstractC1705t.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void H(C1700q c1700q, Object obj, m mVar) {
        if (c1700q.f18322S || !kotlin.jvm.internal.m.a(c1700q.Q(), obj)) {
            c1700q.n0(obj);
            c1700q.b(obj, mVar);
        }
    }

    public static final C0754s I(Function0 function0) {
        return new C0754s(new b1(function0, null));
    }

    public static final int J(C2677v c2677v) {
        int iC;
        int i3 = c2677v.f26431b;
        int iC2 = c2677v.c(0);
        while (c2677v.f26431b != 0 && c2677v.c(0) == iC2) {
            int i9 = c2677v.f26431b;
            if (i9 == 0) {
                a.e("IntList is empty.");
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

    public static final j L(C1699p0[] c1699p0Arr, InterfaceC1691l0 interfaceC1691l0, InterfaceC1691l0 interfaceC1691l1) {
        i iVar = new i(j.f24422k);
        for (C1699p0 c1699p0 : c1699p0Arr) {
            AbstractC1697o0 abstractC1697o0 = (AbstractC1697o0) c1699p0.f18302d;
            if (c1699p0.f18301c || !interfaceC1691l0.containsKey(abstractC1697o0)) {
                iVar.put(abstractC1697o0, abstractC1697o0.c(c1699p0, (h1) interfaceC1691l1.get(abstractC1697o0)));
            }
        }
        return iVar.a();
    }

    public static final void a(C1699p0 c1699p0, m mVar, C1700q c1700q, int i3) {
        h1 h1Var;
        boolean z6;
        C1701q0 c1701q0U;
        c1700q.e0(-149765515);
        InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
        c1700q.Z(RCHTTPStatusCodes.CREATED, AbstractC1705t.f18364b);
        Object objQ = c1700q.Q();
        if (kotlin.jvm.internal.m.a(objQ, C1690l.f18284a)) {
            h1Var = null;
        } else {
            kotlin.jvm.internal.m.c(objQ, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            h1Var = (h1) objQ;
        }
        AbstractC1697o0 abstractC1697o0 = (AbstractC1697o0) c1699p0.f18302d;
        h1 h1VarC = abstractC1697o0.c(c1699p0, h1Var);
        boolean zEquals = h1VarC.equals(h1Var);
        if (!zEquals) {
            c1700q.n0(h1VarC);
        }
        if (!c1700q.f18322S) {
            J0 j9 = c1700q.f18311G;
            Object objB = j9.b(j9.f18123b, j9.g);
            kotlin.jvm.internal.m.c(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1691l0 interfaceC1691l0 = (InterfaceC1691l0) objB;
            if (!(c1700q.F() && zEquals) && (c1699p0.f18301c || !interfaceC1691l0L.containsKey(abstractC1697o0))) {
                interfaceC1691l0L = ((j) interfaceC1691l0L).b(abstractC1697o0, h1VarC);
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
            C0784s c0784s = c1700q.f18346x;
            c0784s.c(z9 ? 1 : 0);
            c1700q.f18345w = z6;
            c1700q.f18314K = interfaceC1691l0L;
            c1700q.X(AbstractC1705t.f18365c, 202, interfaceC1691l0L, 0);
            mVar.invoke(c1700q, Integer.valueOf((i3 >> 3) & 14));
            c1700q.p(false);
            c1700q.p(false);
            c1700q.f18345w = c0784s.b() != 0;
            c1700q.f18314K = null;
            c1701q0U = c1700q.u();
            if (c1701q0U != null) {
                c1701q0U.f18351d = new l(c1699p0, mVar, i3, 7);
            }
        }
        if (c1699p0.f18301c || !interfaceC1691l0L.containsKey(abstractC1697o0)) {
            interfaceC1691l0L = ((j) interfaceC1691l0L).b(abstractC1697o0, h1VarC);
        }
        c1700q.f18313J = true;
        z6 = false;
        if (z6) {
            c1700q.O(interfaceC1691l0L);
        }
        boolean z10 = c1700q.f18345w;
        C0784s c0784s2 = c1700q.f18346x;
        c0784s2.c(z10 ? 1 : 0);
        c1700q.f18345w = z6;
        c1700q.f18314K = interfaceC1691l0L;
        c1700q.X(AbstractC1705t.f18365c, 202, interfaceC1691l0L, 0);
        mVar.invoke(c1700q, Integer.valueOf((i3 >> 3) & 14));
        c1700q.p(false);
        c1700q.p(false);
        c1700q.f18345w = c0784s2.b() != 0;
        c1700q.f18314K = null;
        c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new l(c1699p0, mVar, i3, 7);
        }
    }

    public static final void b(C1699p0[] c1699p0Arr, e eVar, C1700q c1700q, int i3) {
        InterfaceC1691l0 interfaceC1691l0M0;
        boolean z6;
        C1701q0 c1701q0U;
        c1700q.e0(415205898);
        InterfaceC1691l0 interfaceC1691l0L = c1700q.l();
        c1700q.Z(RCHTTPStatusCodes.CREATED, AbstractC1705t.f18364b);
        if (c1700q.f18322S) {
            interfaceC1691l0M0 = c1700q.m0(interfaceC1691l0L, L(c1699p0Arr, interfaceC1691l0L, j.f24422k));
            c1700q.f18313J = true;
        } else {
            J0 j9 = c1700q.f18311G;
            Object objH = j9.h(j9.g, 0);
            kotlin.jvm.internal.m.c(objH, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1691l0 interfaceC1691l0 = (InterfaceC1691l0) objH;
            J0 j10 = c1700q.f18311G;
            Object objH2 = j10.h(j10.g, 1);
            kotlin.jvm.internal.m.c(objH2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC1691l0 interfaceC1691l1 = (InterfaceC1691l0) objH2;
            j jVarL = L(c1699p0Arr, interfaceC1691l0L, interfaceC1691l1);
            if (!c1700q.F() || c1700q.y || !interfaceC1691l1.equals(jVarL)) {
                interfaceC1691l0M0 = c1700q.m0(interfaceC1691l0L, jVarL);
                if (c1700q.y || !kotlin.jvm.internal.m.a(interfaceC1691l0M0, interfaceC1691l0)) {
                    z6 = true;
                }
                if (z6 && !c1700q.f18322S) {
                    c1700q.O(interfaceC1691l0M0);
                }
                boolean z9 = c1700q.f18345w;
                C0784s c0784s = c1700q.f18346x;
                c0784s.c(z9 ? 1 : 0);
                c1700q.f18345w = z6;
                c1700q.f18314K = interfaceC1691l0M0;
                c1700q.X(AbstractC1705t.f18365c, 202, interfaceC1691l0M0, 0);
                eVar.invoke(c1700q, Integer.valueOf((i3 >> 3) & 14));
                c1700q.p(false);
                c1700q.p(false);
                c1700q.f18345w = c0784s.b() != 0;
                c1700q.f18314K = null;
                c1701q0U = c1700q.u();
                if (c1701q0U != null) {
                    c1701q0U.f18351d = new l(c1699p0Arr, eVar, i3, 8);
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
        C0784s c0784s2 = c1700q.f18346x;
        c0784s2.c(z10 ? 1 : 0);
        c1700q.f18345w = z6;
        c1700q.f18314K = interfaceC1691l0M0;
        c1700q.X(AbstractC1705t.f18365c, 202, interfaceC1691l0M0, 0);
        eVar.invoke(c1700q, Integer.valueOf((i3 >> 3) & 14));
        c1700q.p(false);
        c1700q.p(false);
        c1700q.f18345w = c0784s2.b() != 0;
        c1700q.f18314K = null;
        c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new l(c1699p0Arr, eVar, i3, 8);
        }
    }

    public static final void c(Object obj, Object obj2, p194x6.j jVar, C1700q c1700q) {
        boolean zF = c1700q.f(obj) | c1700q.f(obj2);
        Object objQ = c1700q.Q();
        if (zF || objQ == C1690l.f18284a) {
            objQ = new G(jVar);
            c1700q.n0(objQ);
        }
    }

    public static final void d(Object obj, p194x6.j jVar, C1700q c1700q) {
        boolean zF = c1700q.f(obj);
        Object objQ = c1700q.Q();
        if (zF || objQ == C1690l.f18284a) {
            objQ = new G(jVar);
            c1700q.n0(objQ);
        }
    }

    public static final void e(C1700q c1700q, Object obj, m mVar) {
        h hVar = c1700q.f18321R;
        boolean zF = c1700q.f(obj);
        Object objQ = c1700q.Q();
        if (zF || objQ == C1690l.f18284a) {
            objQ = new T(hVar, mVar);
            c1700q.n0(objQ);
        }
    }

    public static final void f(Object obj, Object obj2, Object obj3, m mVar, C1700q c1700q) {
        h hVar = c1700q.f18321R;
        boolean zF = c1700q.f(obj) | c1700q.f(obj2) | c1700q.f(obj3);
        Object objQ = c1700q.Q();
        if (zF || objQ == C1690l.f18284a) {
            objQ = new T(hVar, mVar);
            c1700q.n0(objQ);
        }
    }

    public static final void g(Object obj, Object obj2, m mVar, C1700q c1700q) {
        h hVar = c1700q.f18321R;
        boolean zF = c1700q.f(obj) | c1700q.f(obj2);
        Object objQ = c1700q.Q();
        if (zF || objQ == C1690l.f18284a) {
            objQ = new T(hVar, mVar);
            c1700q.n0(objQ);
        }
    }

    public static final void h(Object[] objArr, m mVar, C1700q c1700q) {
        h hVar = c1700q.f18321R;
        boolean zF = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            zF |= c1700q.f(obj);
        }
        Object objQ = c1700q.Q();
        if (zF || objQ == C1690l.f18284a) {
            c1700q.n0(new T(hVar, mVar));
        }
    }

    public static final void i(Function0 function0, C1700q c1700q) {
        C2106a c2106a = c1700q.f18316M.f21120b;
        c2106a.getClass();
        B b9 = B.f21102d;
        L l2 = c2106a.f21118d;
        l2.J(b9);
        AbstractC1909d.f0(l2, 0, function0);
    }

    public static final void j(ArrayList arrayList, int i3, int i9) {
        int iS = s(i3, arrayList);
        if (iS < 0) {
            iS = -(iS + 1);
        }
        while (iS < arrayList.size() && ((O) arrayList.get(iS)).f18176b < i9) {
        }
    }

    public static final void k(C2677v c2677v, int i3) {
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

    public static void l(N0 n3, List list, C1715y c1715y) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            int iC = n3.c((C1668a) list.get(i3));
            int iN = n3.N(n3.f18154b, n3.r(iC));
            Object obj = iN < n3.g(n3.f18154b, n3.r(iC + 1)) ? n3.f18155c[n3.h(iN)] : C1690l.f18284a;
            C1701q0 c1701q0 = obj instanceof C1701q0 ? (C1701q0) obj : null;
            if (c1701q0 != null) {
                c1701q0.f18348a = c1715y;
            }
        }
    }

    public static final X m(X x9, Object obj, h hVar, C1700q c1700q, int i3, int i9) {
        if ((i9 & 2) != 0) {
            hVar = p100l6.i.f24820h;
        }
        boolean zH = c1700q.h(hVar) | c1700q.h(x9);
        Object objQ = c1700q.Q();
        Object obj2 = C1690l.f18284a;
        if (zH || objQ == obj2) {
            objQ = new a1(hVar, x9, null);
            c1700q.n0(objQ);
        }
        m mVar = (m) objQ;
        Object objQ2 = c1700q.Q();
        if (objQ2 == obj2) {
            objQ2 = y(obj);
            c1700q.n0(objQ2);
        }
        X x10 = (X) objQ2;
        boolean zH2 = c1700q.h(mVar);
        Object objQ3 = c1700q.Q();
        if (zH2 || objQ3 == obj2) {
            objQ3 = new W0(mVar, x10, null);
            c1700q.n0(objQ3);
        }
        g(x9, hVar, (m) objQ3, c1700q);
        return x10;
    }

    public static final X n(l0 l0Var, C1700q c1700q) {
        return m(l0Var, l0Var.getValue(), p100l6.i.f24820h, c1700q, 0, 0);
    }

    public static final void o(J0 j9, ArrayList arrayList, int i3) {
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

    public static final S7.A p(C1700q c1700q) {
        return new F0(c1700q.f18321R);
    }

    public static final p038e0.e q() {
        j1.l lVar = T0.f18196b;
        p038e0.e eVar = (p038e0.e) lVar.i();
        if (eVar != null) {
            return eVar;
        }
        p038e0.e eVar2 = new p038e0.e(new C1698p[0]);
        lVar.v(eVar2);
        return eVar2;
    }

    public static final F r(Function0 function0) {
        j1.l lVar = T0.f18195a;
        return new F(function0, null);
    }

    public static final int s(int i3, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            int iF = kotlin.jvm.internal.m.f(((O) arrayList.get(i10)).f18176b, i3);
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

    public static final int t(C1700q c1700q) {
        c1700q.getClass();
        return Long.hashCode(c1700q.f18323T);
    }

    public static final long u(C1700q c1700q) {
        return c1700q.f18323T;
    }

    public static final Z v(h hVar) {
        Z z6 = (Z) hVar.get(C1676e.j);
        if (z6 != null) {
            return z6;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void w(C1700q c1700q, Integer num, C0770e c0770e) {
        if (c1700q.f18322S) {
            c1700q.b(num, c0770e);
        }
    }

    public static List x(N0 n3, int i3, N0 n9, boolean z6, boolean z9, boolean z10) {
        List list;
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
        Object[] objArr = n9.f18155c;
        int i13 = n9.f18160i;
        System.arraycopy(n3.f18155c, iF, objArr, i13, i10);
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
            iArr2[(i20 * 5) + 4] = N0.i(n9.g(iArr, i20) + iG, i19 < i20 ? 0 : n9.f18161k, i18, length);
            if (i20 == i19) {
                i19++;
            }
            i20++;
            i11 = i11;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        n9.f18163m = i19;
        int iB = M0.b(n3.f18156d, i3, n3.p());
        int iB2 = M0.b(n3.f18156d, i9, n3.p());
        if (iB < iB2) {
            ArrayList arrayList = n3.f18156d;
            ArrayList arrayList2 = new ArrayList(iB2 - iB);
            for (int i22 = iB; i22 < iB2; i22++) {
                C1668a c1668a = (C1668a) arrayList.get(i22);
                c1668a.f18215a += i15;
                arrayList2.add(c1668a);
            }
            n9.f18156d.addAll(M0.b(n9.f18156d, n9.f18170t, n9.p()), arrayList2);
            arrayList.subList(iB, iB2).clear();
            list = arrayList2;
        } else {
            list = w.f23205h;
        }
        if (!list.isEmpty()) {
            HashMap map = n3.f18157e;
            HashMap map2 = n9.f18157e;
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
            AbstractC1705t.a("Unexpectedly removed anchors");
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

    public static C1681g0 y(Object obj) {
        return new C1681g0(obj, C1676e.f18243n);
    }

    public static final X z(C1700q c1700q, Object obj, m mVar) {
        Object objQ = c1700q.Q();
        C1676e c1676e = C1690l.f18284a;
        if (objQ == c1676e) {
            objQ = y(obj);
            c1700q.n0(objQ);
        }
        X x9 = (X) objQ;
        A a2 = A.f22523a;
        boolean zH = c1700q.h(mVar);
        Object objQ2 = c1700q.Q();
        if (zH || objQ2 == c1676e) {
            objQ2 = new U0(mVar, x9, null);
            c1700q.n0(objQ2);
        }
        e(c1700q, a2, (m) objQ2);
        return x9;
    }
}
