package I7;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p194x6.j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final I7.h f5555i = new I7.h(0);
    public static final I7.h j = new I7.h(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final I7.h f5556k = new I7.h(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final I7.h f5557l = new I7.h(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final I7.h f5558m = new I7.h(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final I7.h f5559n = new I7.h(5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final I7.h f5560o = new I7.h(6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final I7.h f5561p = new I7.h(7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final I7.h f5562q = new I7.h(8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5563h;

    public /* synthetic */ h(int i3) {
        this.f5563h = i3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) throws java.io.IOException {
        boolean z6;
        C7.B bJ;
        C7.a0 a0VarM;
        C7.AbstractC0191x returnType;
        p101l7.b bVarF;
        C7.AbstractC0191x returnType2;
        boolean zB;
        boolean z9 = true;
        switch (this.f5563h) {
            case 0:
                kotlin.jvm.internal.m.e((N6.InterfaceC0706u) obj, "<this>");
                return null;
            case 1:
                kotlin.jvm.internal.m.e((N6.InterfaceC0706u) obj, "<this>");
                return null;
            case 2:
                kotlin.jvm.internal.m.e((N6.InterfaceC0706u) obj, "<this>");
                return null;
            case 3:
                N6.InterfaceC0706u Checks = (N6.InterfaceC0706u) obj;
                java.util.List list = I7.r.f5583p;
                kotlin.jvm.internal.m.e(Checks, "$this$Checks");
                java.util.List listO = Checks.O();
                kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                Q6.S s9 = (Q6.S) p078i6.o.s1(listO);
                if (s9 == null || p161s7.d.a(s9) || s9.f8609q != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 4:
                N6.InterfaceC0706u Checks2 = (N6.InterfaceC0706u) obj;
                java.util.List list2 = I7.r.f5583p;
                kotlin.jvm.internal.m.e(Checks2, "$this$Checks");
                N6.InterfaceC0697k interfaceC0697kH = Checks2.h();
                kotlin.jvm.internal.m.d(interfaceC0697kH, "getContainingDeclaration(...)");
                if (interfaceC0697kH instanceof N6.InterfaceC0691e) {
                    p101l7.e eVar = K6.i.f6871e;
                    if (K6.i.b((N6.InterfaceC0691e) interfaceC0697kH, K6.o.f6920a)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    return null;
                }
                java.util.Collection collectionI = Checks2.i();
                kotlin.jvm.internal.m.d(collectionI, "getOverriddenDescriptors(...)");
                java.util.Collection collection = collectionI;
                if (!collection.isEmpty()) {
                    java.util.Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        N6.InterfaceC0697k interfaceC0697kH2 = ((N6.InterfaceC0706u) it.next()).h();
                        kotlin.jvm.internal.m.d(interfaceC0697kH2, "getContainingDeclaration(...)");
                        if (interfaceC0697kH2 instanceof N6.InterfaceC0691e) {
                            p101l7.e eVar2 = K6.i.f6871e;
                            if (K6.i.b((N6.InterfaceC0691e) interfaceC0697kH2, K6.o.f6920a)) {
                                return null;
                            }
                        }
                    }
                }
                N6.InterfaceC0697k interfaceC0697kH3 = Checks2.h();
                N6.InterfaceC0691e interfaceC0691e = interfaceC0697kH3 instanceof N6.InterfaceC0691e ? (N6.InterfaceC0691e) interfaceC0697kH3 : null;
                if (interfaceC0691e != null) {
                    if (!p127o7.f.f(interfaceC0691e)) {
                        interfaceC0691e = null;
                    }
                    if (interfaceC0691e != null && (bJ = interfaceC0691e.j()) != null && (a0VarM = E6.G.M(bJ)) != null && (returnType = Checks2.getReturnType()) != null && kotlin.jvm.internal.m.a(((Q6.AbstractC0804m) Checks2).getName(), I7.s.f5587d)) {
                        p101l7.e eVar3 = K6.i.f6871e;
                        if ((K6.i.B(returnType, K6.o.f6930h) || K6.i.E(returnType)) && Checks2.O().size() == 1) {
                            C7.AbstractC0191x type = ((Q6.S) Checks2.O().get(0)).getType();
                            kotlin.jvm.internal.m.d(type, "getType(...)");
                            if (kotlin.jvm.internal.m.a(E6.G.M(type), a0VarM) && Checks2.Z().isEmpty() && Checks2.V() == null) {
                                return null;
                            }
                        }
                    }
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("must override ''equals()'' in Any");
                N6.InterfaceC0697k interfaceC0697kH4 = Checks2.h();
                kotlin.jvm.internal.m.d(interfaceC0697kH4, "getContainingDeclaration(...)");
                if (p127o7.f.f(interfaceC0697kH4)) {
                    p118n7.g gVar = p118n7.g.f25861d;
                    N6.InterfaceC0697k interfaceC0697kH5 = Checks2.h();
                    kotlin.jvm.internal.m.c(interfaceC0697kH5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    C7.B bJ2 = ((N6.InterfaceC0691e) interfaceC0697kH5).j();
                    kotlin.jvm.internal.m.d(bJ2, "getDefaultType(...)");
                    sb.append(" or define ''equals(other: " + gVar.W(E6.G.M(bJ2)) + "): Boolean''");
                }
                return sb.toString();
            case 5:
                N6.InterfaceC0706u Checks3 = (N6.InterfaceC0706u) obj;
                java.util.List list3 = I7.r.f5583p;
                kotlin.jvm.internal.m.e(Checks3, "$this$Checks");
                Q6.u uVarS = Checks3.S();
                if (uVarS == null) {
                    uVarS = Checks3.V();
                }
                if (uVarS == null) {
                    z9 = false;
                } else {
                    C7.AbstractC0191x returnType3 = Checks3.getReturnType();
                    if (!(returnType3 != null ? D7.d.f2472a.b(returnType3, uVarS.getType()) : false)) {
                        p187w7.d dVarG0 = uVarS.G0();
                        kotlin.jvm.internal.m.d(dVarG0, "getValue(...)");
                        if (dVarG0 instanceof p187w7.c) {
                            N6.InterfaceC0691e interfaceC0691e2 = ((p187w7.c) dVarG0).f30474h;
                            if (interfaceC0691e2.C() && (bVarF = p161s7.d.f(interfaceC0691e2)) != null) {
                                N6.InterfaceC0694h interfaceC0694hE = N6.AbstractC0709x.e(p161s7.d.j(interfaceC0691e2), bVarF);
                                N6.T t9 = interfaceC0694hE instanceof N6.T ? (N6.T) interfaceC0694hE : null;
                                if (t9 == null || (returnType2 = Checks3.getReturnType()) == null) {
                                    zB = false;
                                } else {
                                    zB = D7.d.f2472a.b(returnType2, ((A7.C) t9).H0());
                                }
                            } else {
                                zB = false;
                            }
                        } else {
                            zB = false;
                        }
                        if (!zB) {
                            z9 = false;
                        }
                    }
                }
                if (z9) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            case 6:
                K6.i iVar = (K6.i) obj;
                I7.t tVar = I7.t.f5602c;
                kotlin.jvm.internal.m.e(iVar, "<this>");
                return iVar.s(K6.k.BOOLEAN);
            case 7:
                K6.i iVar2 = (K6.i) obj;
                I7.u uVar = I7.u.f5603c;
                kotlin.jvm.internal.m.e(iVar2, "<this>");
                return iVar2.s(K6.k.INT);
            default:
                K6.i iVar3 = (K6.i) obj;
                I7.v vVar = I7.v.f5604c;
                kotlin.jvm.internal.m.e(iVar3, "<this>");
                return iVar3.w();
        }
    }
}
