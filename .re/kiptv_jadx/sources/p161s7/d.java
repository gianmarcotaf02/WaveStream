package p161s7;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f27382a = 0;

    static {
        p101l7.e.e("value");
    }

    public static final boolean a(Q6.S s9) {
        java.lang.Boolean boolG = L7.k.g(com.google.common.util.concurrent.P.i0(s9), p161s7.a.f27377i, p161s7.c.f27381h);
        kotlin.jvm.internal.m.d(boolG, "ifAny(...)");
        return boolG.booleanValue();
    }

    public static N6.InterfaceC0689c b(N6.InterfaceC0689c interfaceC0689c, p194x6.j jVar) {
        kotlin.jvm.internal.m.e(interfaceC0689c, "<this>");
        return (N6.InterfaceC0689c) L7.k.e(com.google.common.util.concurrent.P.i0(interfaceC0689c), new p161s7.a(1), new L7.a(new kotlin.jvm.internal.A(), jVar));
    }

    public static final p101l7.c c(N6.InterfaceC0698l interfaceC0698l) {
        kotlin.jvm.internal.m.e(interfaceC0698l, "<this>");
        p101l7.d dVarH = h(interfaceC0698l);
        if (!dVarH.d()) {
            dVarH = null;
        }
        if (dVarH != null) {
            return dVarH.g();
        }
        return null;
    }

    public static final N6.InterfaceC0691e d(O6.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "<this>");
        N6.InterfaceC0694h interfaceC0694hH = bVar.getType().u0().h();
        if (interfaceC0694hH instanceof N6.InterfaceC0691e) {
            return (N6.InterfaceC0691e) interfaceC0694hH;
        }
        return null;
    }

    public static final K6.i e(N6.InterfaceC0697k interfaceC0697k) {
        kotlin.jvm.internal.m.e(interfaceC0697k, "<this>");
        return j(interfaceC0697k).g();
    }

    public static final p101l7.b f(N6.InterfaceC0694h interfaceC0694h) {
        N6.InterfaceC0697k interfaceC0697kH;
        p101l7.b bVarF;
        if (interfaceC0694h == null || (interfaceC0697kH = interfaceC0694h.h()) == null) {
            return null;
        }
        if (interfaceC0697kH instanceof N6.G) {
            p101l7.e name = interfaceC0694h.getName();
            kotlin.jvm.internal.m.d(name, "getName(...)");
            return new p101l7.b(((Q6.C) ((N6.G) interfaceC0697kH)).f8549l, name);
        }
        if (!(interfaceC0697kH instanceof N6.InterfaceC0695i) || (bVarF = f((N6.InterfaceC0694h) interfaceC0697kH)) == null) {
            return null;
        }
        p101l7.e name2 = interfaceC0694h.getName();
        kotlin.jvm.internal.m.d(name2, "getName(...)");
        return bVarF.d(name2);
    }

    public static final p101l7.c g(N6.InterfaceC0697k interfaceC0697k) {
        kotlin.jvm.internal.m.e(interfaceC0697k, "<this>");
        p101l7.c cVarH = p127o7.d.h(interfaceC0697k);
        return cVarH != null ? cVarH : p127o7.d.g(interfaceC0697k.h()).a(interfaceC0697k.getName()).g();
    }

    public static final p101l7.d h(N6.InterfaceC0697k interfaceC0697k) {
        kotlin.jvm.internal.m.e(interfaceC0697k, "<this>");
        p101l7.d dVarG = p127o7.d.g(interfaceC0697k);
        kotlin.jvm.internal.m.d(dVarG, "getFqName(...)");
        return dVarG;
    }

    public static final void i(N6.B b9) {
        kotlin.jvm.internal.m.e(b9, "<this>");
        if (b9.d0(D7.g.f2475a) != null) {
            throw new java.lang.ClassCastException();
        }
    }

    public static final N6.B j(N6.InterfaceC0697k interfaceC0697k) {
        kotlin.jvm.internal.m.e(interfaceC0697k, "<this>");
        N6.B bD = p127o7.d.d(interfaceC0697k);
        kotlin.jvm.internal.m.d(bD, "getContainingModule(...)");
        return bD;
    }

    public static final N6.InterfaceC0689c k(N6.InterfaceC0689c interfaceC0689c) {
        kotlin.jvm.internal.m.e(interfaceC0689c, "<this>");
        if (!(interfaceC0689c instanceof N6.M)) {
            return interfaceC0689c;
        }
        N6.N nG0 = ((Q6.G) ((N6.M) interfaceC0689c)).G0();
        kotlin.jvm.internal.m.d(nG0, "getCorrespondingProperty(...)");
        return nG0;
    }

    public static final N7.j l(N6.InterfaceC0689c interfaceC0689c) {
        kotlin.jvm.internal.m.e(interfaceC0689c, "<this>");
        N7.m mVarT = p078i6.m.T(new N6.InterfaceC0689c[]{interfaceC0689c});
        java.util.Collection collectionI = interfaceC0689c.i();
        kotlin.jvm.internal.m.d(collectionI, "getOverriddenDescriptors(...)");
        return N7.o.l0(p078i6.m.T(new N7.m[]{mVarT, new N7.j(p078i6.o.Y0(collectionI), new p161s7.b(1), N7.s.f7466h)}), new J5.t2(2));
    }
}
