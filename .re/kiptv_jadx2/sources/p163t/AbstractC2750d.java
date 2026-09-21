package p163t;

import A5.d;
import H5.O;
import R0.C0861z0;
import U.M;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.m;
import p020c0.AbstractC1703s;
import p020c0.C1676e;
import p020c0.C1690l;
import p020c0.C1700q;
import p028c8.b;
import p100l6.h;
import p109m6.a;
import p117n6.c;
import p137q0.q;
import p194x6.j;
import q5.i;

public abstract class AbstractC2750d {

    public static final C2770n f27561a = new C2770n(Float.POSITIVE_INFINITY);

    public static final C2771o f27562b = new C2771o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    public static final C2772p f27563c = new C2772p(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    public static final C2773q f27564d = new C2773q(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    public static final C2770n f27565e = new C2770n(Float.NEGATIVE_INFINITY);

    public static final C2771o f27566f = new C2771o(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final C2772p g = new C2772p(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final C2773q f27567h = new C2773q(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final float[] f27568i = new float[91];
    public static final E0 j = new E0(new i(17), new F0(4));

    public static final E0 f27569k = new E0(new i(18), new i(19));

    public static final E0 f27570l = new E0(new i(20), new i(21));

    public static final E0 f27571m = new E0(new i(22), new i(23));

    public static final E0 f27572n = new E0(new i(24), new i(25));

    public static final E0 f27573o = new E0(new i(26), new i(27));

    public static final E0 f27574p = new E0(new i(28), new i(29));

    public static final E0 f27575q = new E0(new F0(0), new F0(1));

    public static final E0 f27576r = new E0(new F0(2), new F0(3));

    public static C2748c a(float f9) {
        return new C2748c(Float.valueOf(f9), j, Float.valueOf(0.01f), 8);
    }

    public static C2768m b(float f9, int i3) {
        if ((i3 & 2) != 0) {
            f9 = 0.0f;
        }
        return new C2768m(j, Float.valueOf(0.0f), new C2770n(f9), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final Object c(C2768m c2768m, InterfaceC2758h interfaceC2758h, long j9, final j jVar, c cVar) {
        n0 n0Var;
        final A a2;
        final C2768m c2768m2;
        C2768m c2768m3;
        A a9;
        Object objA;
        j jVar2;
        C2764k c2764k;
        C2764k c2764k2;
        Object objA2;
        final InterfaceC2758h interfaceC2758h2 = interfaceC2758h;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i3 = n0Var.f27653m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n0Var.f27653m = i3 - Integer.MIN_VALUE;
            } else {
                n0Var = new n0(cVar);
            }
        } else {
            n0Var = new n0(cVar);
        }
        n0 n0Var2 = n0Var;
        Object obj = n0Var2.f27652l;
        a aVar = a.f25430h;
        int i9 = n0Var2.f27653m;
        C0861z0 c0861z0 = C0861z0.f9034h;
        if (i9 == 0) {
            P.u0(obj);
            final Object objF = interfaceC2758h2.f(0L);
            final r rVarD = interfaceC2758h2.d(0L);
            a2 = new A();
            if (j9 == Long.MIN_VALUE) {
                try {
                    final float fL = l(n0Var2.getContext());
                    c2768m2 = c2768m;
                    try {
                        j jVar3 = new j() {
                            @Override
                            public final Object invoke(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                InterfaceC2758h interfaceC2758h3 = interfaceC2758h2;
                                E0 e0C = interfaceC2758h3.c();
                                Object objG = interfaceC2758h3.g();
                                C2768m c2768m4 = c2768m2;
                                C2764k c2764k3 = new C2764k(objF, e0C, rVarD, jLongValue, objG, jLongValue, new M(2, c2768m4));
                                AbstractC2750d.k(c2764k3, jLongValue, fL, interfaceC2758h3, c2768m4, jVar);
                                a2.f24539h = c2764k3;
                                return p070h6.A.f22523a;
                            }
                        };
                        a9 = a2;
                        try {
                            n0Var2.f27649h = c2768m2;
                            n0Var2.f27650i = interfaceC2758h2;
                            n0Var2.j = jVar;
                            n0Var2.f27651k = a9;
                            n0Var2.f27653m = 1;
                            if (!interfaceC2758h2.a()) {
                                objA = AbstractC1703s.v(n0Var2.getContext()).a(new O(16, jVar3), n0Var2);
                            } else {
                                if (n0Var2.getContext().get(c0861z0) != null) {
                                    throw new ClassCastException();
                                }
                                objA = AbstractC1703s.v(n0Var2.getContext()).a(jVar3, n0Var2);
                            }
                            if (objA != aVar) {
                                c2768m3 = c2768m2;
                                jVar2 = jVar;
                                a2 = a9;
                            }
                            return aVar;
                        } catch (CancellationException e6) {
                            e = e6;
                            c2768m3 = c2768m2;
                            a2 = a9;
                            c2764k = (C2764k) a2.f24539h;
                            if (c2764k != null) {
                                c2764k.f27630i.setValue(Boolean.FALSE);
                            }
                            c2764k2 = (C2764k) a2.f24539h;
                            if (c2764k2 != null) {
                                c2768m3.f27643m = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e9) {
                        e = e9;
                        c2768m3 = c2768m2;
                        c2764k = (C2764k) a2.f24539h;
                        if (c2764k != null) {
                            c2764k.f27630i.setValue(Boolean.FALSE);
                        }
                        c2764k2 = (C2764k) a2.f24539h;
                        if (c2764k2 != null) {
                            c2768m3.f27643m = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e10) {
                    e = e10;
                    c2768m2 = c2768m;
                }
            } else {
                a9 = a2;
                try {
                    C2764k c2764k3 = new C2764k(objF, interfaceC2758h2.c(), rVarD, j9, interfaceC2758h2.g(), j9, new M(1, c2768m));
                    k(c2764k3, j9, l(n0Var2.getContext()), interfaceC2758h2, c2768m, jVar);
                    a9.f24539h = c2764k3;
                    c2768m3 = c2768m;
                    interfaceC2758h2 = interfaceC2758h;
                    jVar2 = jVar;
                    a2 = a9;
                } catch (CancellationException e11) {
                    e = e11;
                    c2768m3 = c2768m;
                    a2 = a9;
                    c2764k = (C2764k) a2.f24539h;
                    if (c2764k != null) {
                        c2764k.f27630i.setValue(Boolean.FALSE);
                    }
                    c2764k2 = (C2764k) a2.f24539h;
                    if (c2764k2 != null && c2764k2.g == c2768m3.f27641k) {
                        c2768m3.f27643m = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i9 != 1 && i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a2 = n0Var2.f27651k;
            jVar2 = n0Var2.j;
            interfaceC2758h2 = n0Var2.f27650i;
            c2768m3 = n0Var2.f27649h;
            try {
                P.u0(obj);
            } catch (CancellationException e12) {
                e = e12;
                c2764k = (C2764k) a2.f24539h;
                if (c2764k != null) {
                    c2764k.f27630i.setValue(Boolean.FALSE);
                }
                c2764k2 = (C2764k) a2.f24539h;
                if (c2764k2 != null) {
                    c2768m3.f27643m = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = a2.f24539h;
            m.b(obj2);
            if (!((Boolean) ((C2764k) obj2).f27630i.getValue()).booleanValue()) {
                return p070h6.A.f22523a;
            }
            final float fL2 = l(n0Var2.getContext());
            final A a10 = a2;
            final j jVar4 = jVar2;
            final InterfaceC2758h interfaceC2758h3 = interfaceC2758h2;
            final C2768m c2768m4 = c2768m3;
            try {
                j jVar5 = new j() {
                    @Override
                    public final Object invoke(Object obj3) {
                        long jLongValue = ((Long) obj3).longValue();
                        Object obj4 = a10.f24539h;
                        m.b(obj4);
                        AbstractC2750d.k((C2764k) obj4, jLongValue, fL2, interfaceC2758h3, c2768m4, jVar4);
                        return p070h6.A.f22523a;
                    }
                };
                a2 = a10;
                interfaceC2758h2 = interfaceC2758h3;
                c2768m3 = c2768m4;
                jVar2 = jVar4;
                n0Var2.f27649h = c2768m3;
                n0Var2.f27650i = interfaceC2758h2;
                n0Var2.j = jVar2;
                n0Var2.f27651k = a2;
                n0Var2.f27653m = 2;
                if (!interfaceC2758h2.a()) {
                    objA2 = AbstractC1703s.v(n0Var2.getContext()).a(new O(16, jVar5), n0Var2);
                } else {
                    if (n0Var2.getContext().get(c0861z0) != null) {
                        throw new ClassCastException();
                    }
                    objA2 = AbstractC1703s.v(n0Var2.getContext()).a(jVar5, n0Var2);
                }
            } catch (CancellationException e13) {
                e = e13;
                a2 = a10;
                c2768m3 = c2768m4;
                c2764k = (C2764k) a2.f24539h;
                if (c2764k != null) {
                    c2764k.f27630i.setValue(Boolean.FALSE);
                }
                c2764k2 = (C2764k) a2.f24539h;
                if (c2764k2 != null) {
                    c2768m3.f27643m = false;
                }
                throw e;
            }
        } while (objA2 != aVar);
        return aVar;
    }

    public static Object d(float f9, float f10, A a2, p194x6.m mVar, p117n6.i iVar, int i3) {
        if ((i3 & 8) != 0) {
            a2 = o(0.0f, 0.0f, null, 7);
        }
        A a9 = a2;
        E0 e6 = j;
        Float f11 = new Float(f9);
        Float f12 = new Float(f10);
        Float f13 = new Float(0.0f);
        j jVar = e6.f27453a;
        r rVarC = (r) jVar.invoke(f13);
        if (rVarC == null) {
            rVarC = ((r) jVar.invoke(f11)).c();
        }
        r rVar = rVarC;
        Object objC = c(new C2768m(e6, f11, rVar, 56), new o0(a9, e6, f11, f12, rVar), Long.MIN_VALUE, new io.ktor.client.plugins.logging.a(2, mVar), iVar);
        a aVar = a.f25430h;
        p070h6.A a10 = p070h6.A.f22523a;
        if (objC != aVar) {
            objC = a10;
        }
        return objC == aVar ? objC : a10;
    }

    public static final F e(I i3, float f9, float f10, E e6, String str, C1700q c1700q, int i9, int i10) {
        if ((i10 & 8) != 0) {
            str = "FloatAnimation";
        }
        return h(i3, Float.valueOf(f9), Float.valueOf(f10), j, e6, str, c1700q, (i9 & AnalyticsListener.EVENT_DRM_SESSION_ACQUIRED) | 32768 | ((i9 << 3) & 458752), 0);
    }

    public static final Object f(C2768m c2768m, Float f9, InterfaceC2766l interfaceC2766l, boolean z6, j jVar, c cVar) {
        Object objC = c(c2768m, new o0(interfaceC2766l, c2768m.f27639h, c2768m.f27640i.getValue(), f9, c2768m.j), z6 ? c2768m.f27641k : Long.MIN_VALUE, jVar, cVar);
        return objC == a.f25430h ? objC : p070h6.A.f22523a;
    }

    public static Object g(C2768m c2768m, Float f9, C2761i0 c2761i0, boolean z6, j jVar, c cVar, int i3) {
        if ((i3 & 2) != 0) {
            c2761i0 = o(0.0f, 0.0f, null, 7);
        }
        C2761i0 c2761i1 = c2761i0;
        if ((i3 & 8) != 0) {
            jVar = new i(14);
        }
        return f(c2768m, f9, c2761i1, z6, jVar, cVar);
    }

    public static final F h(I i3, Number number, Number number2, E0 e6, E e9, String str, C1700q c1700q, int i9, int i10) {
        I i11;
        Number number3;
        Object objQ = c1700q.Q();
        C1676e c1676e = C1690l.f18284a;
        if (objQ == c1676e) {
            i11 = i3;
            F f9 = new F(i11, number, number2, e6, e9);
            number3 = number2;
            c1700q.n0(f9);
            objQ = f9;
        } else {
            i11 = i3;
            number3 = number2;
        }
        F f10 = (F) objQ;
        boolean z6 = true;
        boolean z9 = (((i9 & 112) ^ 48) > 32 && c1700q.h(number)) || (i9 & 48) == 32;
        if ((((57344 & i9) ^ 24576) <= 16384 || !c1700q.h(e9)) && (i9 & 24576) != 16384) {
            z6 = false;
        }
        boolean z10 = z9 | z6;
        Object objQ2 = c1700q.Q();
        if (z10 || objQ2 == c1676e) {
            d dVar = new d(number, f10, number3, e9, 6);
            c1700q.n0(dVar);
            objQ2 = dVar;
        }
        AbstractC1703s.i((Function0) objQ2, c1700q);
        boolean zH = c1700q.h(i11);
        Object objQ3 = c1700q.Q();
        if (zH || objQ3 == c1676e) {
            objQ3 = new b(i11, f10, 18);
            c1700q.n0(objQ3);
        }
        AbstractC1703s.d(f10, (j) objQ3, c1700q);
        return f10;
    }

    public static final r i(r rVar) {
        r rVarC = rVar.c();
        int iB = rVarC.b();
        for (int i3 = 0; i3 < iB; i3++) {
            rVarC.e(rVar.a(i3), i3);
        }
        return rVarC;
    }

    public static C2768m j(C2768m c2768m, float f9) {
        float f10 = ((C2770n) c2768m.j).f27648a;
        return new C2768m(c2768m.f27639h, Float.valueOf(f9), new C2770n(f10), c2768m.f27641k, c2768m.f27642l, c2768m.f27643m);
    }

    public static final void k(C2764k c2764k, long j9, float f9, InterfaceC2758h interfaceC2758h, C2768m c2768m, j jVar) {
        long jB = f9 == 0.0f ? interfaceC2758h.b() : (long) ((j9 - c2764k.f27625c) / f9);
        c2764k.g = j9;
        c2764k.f27627e.setValue(interfaceC2758h.f(jB));
        c2764k.f27628f = interfaceC2758h.d(jB);
        if (interfaceC2758h.e(jB)) {
            c2764k.f27629h = c2764k.g;
            c2764k.f27630i.setValue(Boolean.FALSE);
        }
        q(c2764k, c2768m);
        jVar.invoke(c2764k);
    }

    public static final float l(h hVar) {
        q qVar = (q) hVar.get(p137q0.c.f26463w);
        float fU = qVar != null ? qVar.u() : 1.0f;
        if (fU >= 0.0f) {
            return fU;
        }
        S.b("negative scale factor");
        return fU;
    }

    public static E m(InterfaceC2779x interfaceC2779x, T t9, int i3) {
        if ((i3 & 2) != 0) {
            t9 = T.f27506h;
        }
        return new E(interfaceC2779x, t9, 0);
    }

    public static final I n(String str, C1700q c1700q, int i3) {
        Object objQ = c1700q.Q();
        if (objQ == C1690l.f18284a) {
            objQ = new I();
            c1700q.n0(objQ);
        }
        I i9 = (I) objQ;
        i9.a(0, c1700q);
        return i9;
    }

    public static C2761i0 o(float f9, float f10, Object obj, int i3) {
        if ((i3 & 1) != 0) {
            f9 = 1.0f;
        }
        if ((i3 & 2) != 0) {
            f10 = 1500.0f;
        }
        if ((i3 & 4) != 0) {
            obj = null;
        }
        return new C2761i0(f9, f10, obj);
    }

    public static D0 p(int i3, int i9, InterfaceC2780y interfaceC2780y, int i10) {
        if ((i10 & 1) != 0) {
            i3 = RCHTTPStatusCodes.UNSUCCESSFUL;
        }
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        if ((i10 & 4) != 0) {
            interfaceC2780y = AbstractC2781z.f27737a;
        }
        return new D0(i3, i9, interfaceC2780y);
    }

    public static final void q(C2764k c2764k, C2768m c2768m) {
        c2768m.f27640i.setValue(c2764k.f27627e.getValue());
        r rVar = c2768m.j;
        r rVar2 = c2764k.f27628f;
        int iB = rVar.b();
        for (int i3 = 0; i3 < iB; i3++) {
            rVar.e(rVar2.a(i3), i3);
        }
        c2768m.f27642l = c2764k.f27629h;
        c2768m.f27641k = c2764k.g;
        c2768m.f27643m = ((Boolean) c2764k.f27630i.getValue()).booleanValue();
    }
}
