package I7;

import A7.C;
import C7.AbstractC0191x;
import C7.B;
import C7.a0;
import E6.G;
import N6.AbstractC0709x;
import N6.InterfaceC0691e;
import N6.InterfaceC0694h;
import N6.InterfaceC0697k;
import N6.InterfaceC0706u;
import N6.T;
import Q6.AbstractC0804m;
import Q6.S;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class h implements p194x6.j {

    public static final h f5555i = new h(0);
    public static final h j = new h(1);

    public static final h f5556k = new h(2);

    public static final h f5557l = new h(3);

    public static final h f5558m = new h(4);

    public static final h f5559n = new h(5);

    public static final h f5560o = new h(6);

    public static final h f5561p = new h(7);

    public static final h f5562q = new h(8);

    public final int f5563h;

    public h(int i3) {
        this.f5563h = i3;
    }

    @Override
    public final Object invoke(Object obj) throws IOException {
        boolean z6;
        B bJ;
        a0 a0VarM;
        AbstractC0191x returnType;
        p101l7.b bVarF;
        AbstractC0191x returnType2;
        boolean zB;
        boolean z9 = true;
        switch (this.f5563h) {
            case 0:
                kotlin.jvm.internal.m.e((InterfaceC0706u) obj, "<this>");
                return null;
            case 1:
                kotlin.jvm.internal.m.e((InterfaceC0706u) obj, "<this>");
                return null;
            case 2:
                kotlin.jvm.internal.m.e((InterfaceC0706u) obj, "<this>");
                return null;
            case 3:
                InterfaceC0706u Checks = (InterfaceC0706u) obj;
                List list = r.f5583p;
                kotlin.jvm.internal.m.e(Checks, "$this$Checks");
                List listO = Checks.O();
                kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                S s9 = (S) p078i6.o.s1(listO);
                if (s9 == null || p161s7.d.a(s9) || s9.f8609q != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 4:
                InterfaceC0706u Checks2 = (InterfaceC0706u) obj;
                List list2 = r.f5583p;
                kotlin.jvm.internal.m.e(Checks2, "$this$Checks");
                InterfaceC0697k interfaceC0697kH = Checks2.h();
                kotlin.jvm.internal.m.d(interfaceC0697kH, "getContainingDeclaration(...)");
                if (interfaceC0697kH instanceof InterfaceC0691e) {
                    p101l7.e eVar = K6.i.f6871e;
                    if (K6.i.b((InterfaceC0691e) interfaceC0697kH, K6.o.f6920a)) {
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
                Collection collectionI = Checks2.i();
                kotlin.jvm.internal.m.d(collectionI, "getOverriddenDescriptors(...)");
                Collection collection = collectionI;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        InterfaceC0697k interfaceC0697kH2 = ((InterfaceC0706u) it.next()).h();
                        kotlin.jvm.internal.m.d(interfaceC0697kH2, "getContainingDeclaration(...)");
                        if (interfaceC0697kH2 instanceof InterfaceC0691e) {
                            p101l7.e eVar2 = K6.i.f6871e;
                            if (K6.i.b((InterfaceC0691e) interfaceC0697kH2, K6.o.f6920a)) {
                                return null;
                            }
                        }
                    }
                }
                InterfaceC0697k interfaceC0697kH3 = Checks2.h();
                InterfaceC0691e interfaceC0691e = interfaceC0697kH3 instanceof InterfaceC0691e ? (InterfaceC0691e) interfaceC0697kH3 : null;
                if (interfaceC0691e != null) {
                    if (!p127o7.f.f(interfaceC0691e)) {
                        interfaceC0691e = null;
                    }
                    if (interfaceC0691e != null && (bJ = interfaceC0691e.j()) != null && (a0VarM = G.M(bJ)) != null && (returnType = Checks2.getReturnType()) != null && kotlin.jvm.internal.m.a(((AbstractC0804m) Checks2).getName(), s.f5587d)) {
                        p101l7.e eVar3 = K6.i.f6871e;
                        if ((K6.i.B(returnType, K6.o.f6930h) || K6.i.E(returnType)) && Checks2.O().size() == 1) {
                            AbstractC0191x type = ((S) Checks2.O().get(0)).getType();
                            kotlin.jvm.internal.m.d(type, "getType(...)");
                            if (kotlin.jvm.internal.m.a(G.M(type), a0VarM) && Checks2.Z().isEmpty() && Checks2.V() == null) {
                                return null;
                            }
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                InterfaceC0697k interfaceC0697kH4 = Checks2.h();
                kotlin.jvm.internal.m.d(interfaceC0697kH4, "getContainingDeclaration(...)");
                if (p127o7.f.f(interfaceC0697kH4)) {
                    p118n7.g gVar = p118n7.g.f25861d;
                    InterfaceC0697k interfaceC0697kH5 = Checks2.h();
                    kotlin.jvm.internal.m.c(interfaceC0697kH5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    B bJ2 = ((InterfaceC0691e) interfaceC0697kH5).j();
                    kotlin.jvm.internal.m.d(bJ2, "getDefaultType(...)");
                    sb.append(" or define ''equals(other: " + gVar.W(G.M(bJ2)) + "): Boolean''");
                }
                return sb.toString();
            case 5:
                InterfaceC0706u Checks3 = (InterfaceC0706u) obj;
                List list3 = r.f5583p;
                kotlin.jvm.internal.m.e(Checks3, "$this$Checks");
                Q6.u uVarS = Checks3.S();
                if (uVarS == null) {
                    uVarS = Checks3.V();
                }
                if (uVarS == null) {
                    z9 = false;
                } else {
                    AbstractC0191x returnType3 = Checks3.getReturnType();
                    if (!(returnType3 != null ? D7.d.f2472a.b(returnType3, uVarS.getType()) : false)) {
                        p187w7.d dVarG0 = uVarS.G0();
                        kotlin.jvm.internal.m.d(dVarG0, "getValue(...)");
                        if (dVarG0 instanceof p187w7.c) {
                            InterfaceC0691e interfaceC0691e2 = ((p187w7.c) dVarG0).f30474h;
                            if (interfaceC0691e2.C() && (bVarF = p161s7.d.f(interfaceC0691e2)) != null) {
                                InterfaceC0694h interfaceC0694hE = AbstractC0709x.e(p161s7.d.j(interfaceC0691e2), bVarF);
                                T t9 = interfaceC0694hE instanceof T ? (T) interfaceC0694hE : null;
                                if (t9 == null || (returnType2 = Checks3.getReturnType()) == null) {
                                    zB = false;
                                } else {
                                    zB = D7.d.f2472a.b(returnType2, ((C) t9).H0());
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
                t tVar = t.f5602c;
                kotlin.jvm.internal.m.e(iVar, "<this>");
                return iVar.s(K6.k.BOOLEAN);
            case 7:
                K6.i iVar2 = (K6.i) obj;
                u uVar = u.f5603c;
                kotlin.jvm.internal.m.e(iVar2, "<this>");
                return iVar2.s(K6.k.INT);
            default:
                K6.i iVar3 = (K6.i) obj;
                v vVar = v.f5604c;
                kotlin.jvm.internal.m.e(iVar3, "<this>");
                return iVar3.w();
        }
    }
}
