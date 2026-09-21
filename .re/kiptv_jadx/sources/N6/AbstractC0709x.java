package N6;

/* JADX INFO: renamed from: N6.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0709x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N6.A f7425a = new N6.A("InvalidModuleNotifier", 0);

    public static final android.support.v4.media.session.q a(C7.B b9, N6.InterfaceC0695i interfaceC0695i, int i3) {
        if (interfaceC0695i == null || E7.l.f(interfaceC0695i)) {
            return null;
        }
        int size = interfaceC0695i.l().size() + i3;
        if (interfaceC0695i.D()) {
            java.util.List listSubList = b9.s0().subList(i3, size);
            N6.InterfaceC0697k interfaceC0697kH = interfaceC0695i.h();
            return new android.support.v4.media.session.q(interfaceC0695i, listSubList, a(b9, interfaceC0697kH instanceof N6.InterfaceC0695i ? (N6.InterfaceC0695i) interfaceC0697kH : null, size));
        }
        if (size != b9.s0().size()) {
            p127o7.d.o(interfaceC0695i);
        }
        return new android.support.v4.media.session.q(interfaceC0695i, b9.s0().subList(i3, b9.s0().size()), (android.support.v4.media.session.q) null);
    }

    public static final void b(N6.J j, p101l7.c fqName, java.util.ArrayList arrayList) {
        kotlin.jvm.internal.m.e(j, "<this>");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        j.b(fqName, arrayList);
    }

    public static final java.util.List c(N6.InterfaceC0695i interfaceC0695i) {
        java.util.List parameters;
        java.lang.Object next;
        C7.M mO;
        kotlin.jvm.internal.m.e(interfaceC0695i, "<this>");
        java.util.List listL = interfaceC0695i.l();
        kotlin.jvm.internal.m.d(listL, "getDeclaredTypeParameters(...)");
        if (!interfaceC0695i.D() && !(interfaceC0695i.h() instanceof N6.InterfaceC0688b)) {
            return listL;
        }
        int i3 = p161s7.d.f27382a;
        p161s7.b bVar = p161s7.b.f27379i;
        java.util.List listS0 = N7.o.s0(new N7.j(N7.o.k0(new N7.c(N7.o.j0(N7.o.m0(interfaceC0695i, bVar), 1), N6.r.f7417k, 1), N6.r.f7418l), N6.r.f7419m, N7.s.f7466h));
        java.util.Iterator it = N7.o.j0(N7.o.m0(interfaceC0695i, bVar), 1).iterator();
        do {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof N6.InterfaceC0691e));
        N6.InterfaceC0691e interfaceC0691e = (N6.InterfaceC0691e) next;
        if (interfaceC0691e != null && (mO = interfaceC0691e.o()) != null) {
            parameters = mO.getParameters();
        }
        if (parameters == null) {
            parameters = p078i6.w.f23205h;
        }
        if (listS0.isEmpty() && parameters.isEmpty()) {
            java.util.List listL2 = interfaceC0695i.l();
            kotlin.jvm.internal.m.d(listL2, "getDeclaredTypeParameters(...)");
            return listL2;
        }
        java.util.ArrayList<N6.U> arrayListA1 = p078i6.o.A1(listS0, parameters);
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(arrayListA1, 10));
        for (N6.U u6 : arrayListA1) {
            kotlin.jvm.internal.m.b(u6);
            arrayList.add(new N6.C0690d(u6, interfaceC0695i, listL.size()));
        }
        return p078i6.o.A1(listL, arrayList);
    }

    public static final N6.InterfaceC0691e d(N6.B b9, p101l7.b classId) {
        kotlin.jvm.internal.m.e(b9, "<this>");
        kotlin.jvm.internal.m.e(classId, "classId");
        N6.InterfaceC0694h interfaceC0694hE = e(b9, classId);
        if (interfaceC0694hE instanceof N6.InterfaceC0691e) {
            return (N6.InterfaceC0691e) interfaceC0694hE;
        }
        return null;
    }

    public static final N6.InterfaceC0694h e(N6.B b9, p101l7.b classId) {
        kotlin.jvm.internal.m.e(b9, "<this>");
        kotlin.jvm.internal.m.e(classId, "classId");
        if (b9.d0(p127o7.k.f26158a) != null) {
            throw new java.lang.ClassCastException();
        }
        N6.K kA0 = b9.a0(classId.f24825a);
        p101l7.d dVar = classId.f24826b.f24829a;
        dVar.getClass();
        java.util.List listE = p101l7.d.e(dVar);
        N6.InterfaceC0694h interfaceC0694hF = ((Q6.w) kA0).f8706n.f((p101l7.e) p078i6.o.h1(listE), V6.c.f10362n);
        if (interfaceC0694hF != null) {
            for (p101l7.e eVar : listE.subList(1, listE.size())) {
                if (interfaceC0694hF instanceof N6.InterfaceC0691e) {
                    N6.InterfaceC0694h interfaceC0694hF2 = ((N6.InterfaceC0691e) interfaceC0694hF).g0().f(eVar, V6.c.f10362n);
                    interfaceC0694hF = interfaceC0694hF2 instanceof N6.InterfaceC0691e ? (N6.InterfaceC0691e) interfaceC0694hF2 : null;
                    if (interfaceC0694hF != null) {
                    }
                }
            }
            return interfaceC0694hF;
        }
        return null;
    }

    public static final N6.InterfaceC0691e f(N6.B b9, p101l7.b classId, A7.m notFoundClasses) {
        kotlin.jvm.internal.m.e(b9, "<this>");
        kotlin.jvm.internal.m.e(classId, "classId");
        kotlin.jvm.internal.m.e(notFoundClasses, "notFoundClasses");
        N6.InterfaceC0691e interfaceC0691eD = d(b9, classId);
        return interfaceC0691eD != null ? interfaceC0691eD : notFoundClasses.E(classId, N7.o.s0(N7.o.p0(N7.o.m0(classId, N6.C0704s.f7421h), N6.r.f7416i)));
    }

    public static final N6.InterfaceC0694h g(N6.InterfaceC0697k interfaceC0697k) {
        kotlin.jvm.internal.m.e(interfaceC0697k, "<this>");
        N6.InterfaceC0697k interfaceC0697kH = interfaceC0697k.h();
        if (interfaceC0697kH == null || (interfaceC0697k instanceof N6.G)) {
            return null;
        }
        if (!(interfaceC0697kH.h() instanceof N6.G)) {
            return g(interfaceC0697kH);
        }
        if (interfaceC0697kH instanceof N6.InterfaceC0694h) {
            return (N6.InterfaceC0694h) interfaceC0697kH;
        }
        return null;
    }

    public static final boolean h(N6.J j, p101l7.c fqName) {
        kotlin.jvm.internal.m.e(j, "<this>");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        return j.a(fqName);
    }

    public static final java.util.ArrayList i(N6.J j, p101l7.c fqName) {
        kotlin.jvm.internal.m.e(j, "<this>");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        b(j, fqName, arrayList);
        return arrayList;
    }

    public static final N6.InterfaceC0691e j(Q6.A a2, p101l7.c fqName) {
        p180v7.o oVarG0;
        V6.c cVar = V6.c.f10357h;
        kotlin.jvm.internal.m.e(a2, "<this>");
        kotlin.jvm.internal.m.e(fqName, "fqName");
        p101l7.d dVar = fqName.f24829a;
        if (!dVar.c()) {
            N6.InterfaceC0694h interfaceC0694hF = ((Q6.w) a2.a0(fqName.b())).f8706n.f(dVar.f(), cVar);
            N6.InterfaceC0691e interfaceC0691e = interfaceC0694hF instanceof N6.InterfaceC0691e ? (N6.InterfaceC0691e) interfaceC0694hF : null;
            if (interfaceC0691e != null) {
                return interfaceC0691e;
            }
            N6.InterfaceC0691e interfaceC0691eJ = j(a2, fqName.b());
            N6.InterfaceC0694h interfaceC0694hF2 = (interfaceC0691eJ == null || (oVarG0 = interfaceC0691eJ.g0()) == null) ? null : oVarG0.f(dVar.f(), cVar);
            if (interfaceC0694hF2 instanceof N6.InterfaceC0691e) {
                return (N6.InterfaceC0691e) interfaceC0694hF2;
            }
        }
        return null;
    }
}
