package Y6;

import C7.AbstractC0191x;
import C7.V;
import I7.r;
import N6.C0701o;
import N6.EnumC0711z;
import N6.InterfaceC0687a;
import N6.InterfaceC0697k;
import N6.InterfaceC0706u;
import N6.P;
import O7.o;
import Q6.AbstractC0810t;
import Q6.C0809s;
import Q6.L;
import Q6.u;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m;
import p070h6.k;
import p078i6.x;

public final class g extends L implements a {

    public static final e f12178M = new e();

    public static final e f12179N = new e();

    public int f12180K;

    public final boolean f12181L;

    public g(InterfaceC0697k interfaceC0697k, L l2, O6.h hVar, p101l7.e eVar, int i3, P p2, boolean z6) {
        super(interfaceC0697k, l2, hVar, eVar, i3, p2);
        if (interfaceC0697k == null) {
            i0(0);
            throw null;
        }
        if (hVar == null) {
            i0(1);
            throw null;
        }
        if (eVar == null) {
            i0(2);
            throw null;
        }
        if (i3 == 0) {
            i0(3);
            throw null;
        }
        this.f12180K = 0;
        this.f12181L = z6;
    }

    public static g V0(InterfaceC0697k interfaceC0697k, Z6.d dVar, p101l7.e eVar, S6.f fVar, boolean z6) {
        if (interfaceC0697k == null) {
            i0(5);
            throw null;
        }
        if (eVar != null) {
            return new g(interfaceC0697k, null, dVar, eVar, 1, fVar, z6);
        }
        i0(7);
        throw null;
    }

    public static void i0(int i3) {
        String str = (i3 == 13 || i3 == 18 || i3 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i3 == 13 || i3 == 18 || i3 == 21) ? 2 : 3];
        switch (i3) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i3 == 13) {
            objArr[1] = "initialize";
        } else if (i3 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i3 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i3) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i3 != 13 && i3 != 18 && i3 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final a G(AbstractC0191x abstractC0191x, ArrayList arrayList, AbstractC0191x abstractC0191x2, k kVar) {
        ArrayList arrayListU = N3.a.u(arrayList, O(), this);
        u uVarK = abstractC0191x == null ? null : p127o7.k.k(this, abstractC0191x, O6.g.f7987a);
        C0809s c0809sM0 = M0(V.f1566b);
        c0809sM0.f8663n = arrayListU;
        c0809sM0.f8667r = abstractC0191x2;
        c0809sM0.f8665p = uVarK;
        c0809sM0.f8672w = true;
        c0809sM0.f8671v = true;
        g gVar = (g) c0809sM0.f8657E.J0(c0809sM0);
        if (kVar != null) {
            gVar.N0((InterfaceC0687a) kVar.f22539h, kVar.f22540i);
        }
        if (gVar != null) {
            return gVar;
        }
        i0(21);
        throw null;
    }

    @Override
    public final AbstractC0810t I0(int i3, InterfaceC0697k interfaceC0697k, InterfaceC0706u interfaceC0706u, P p2, O6.h hVar, p101l7.e eVar) {
        if (interfaceC0697k == null) {
            i0(14);
            throw null;
        }
        if (i3 == 0) {
            i0(15);
            throw null;
        }
        if (hVar == null) {
            i0(16);
            throw null;
        }
        L l2 = (L) interfaceC0706u;
        if (eVar == null) {
            eVar = getName();
        }
        g gVar = new g(interfaceC0697k, l2, hVar, eVar, i3, p2, this.f12181L);
        int i9 = this.f12180K;
        boolean z6 = false;
        if (i9 != 1) {
            if (i9 == 2) {
                z6 = true;
            } else if (i9 != 3) {
                if (i9 != 4) {
                    throw null;
                }
                z6 = true;
            }
        }
        gVar.W0(z6, f.a(i9));
        return gVar;
    }

    @Override
    public final L U0(u uVar, u uVar2, List list, List list2, List list3, AbstractC0191x abstractC0191x, EnumC0711z enumC0711z, C0701o c0701o, x xVar) {
        I7.f fVar;
        if (list == null) {
            i0(9);
            throw null;
        }
        if (list2 == null) {
            i0(10);
            throw null;
        }
        if (list3 == null) {
            i0(11);
            throw null;
        }
        if (c0701o == null) {
            i0(12);
            throw null;
        }
        super.U0(uVar, uVar2, list, list2, list3, abstractC0191x, enumC0711z, c0701o, xVar);
        for (I7.i iVar : r.f5583p) {
            iVar.getClass();
            p101l7.e eVar = iVar.f5564a;
            if (eVar == null || m.a(getName(), eVar)) {
                o oVar = iVar.f5565b;
                if (oVar != null) {
                    String strB = getName().b();
                    m.d(strB, "asString(...)");
                    if (!oVar.d(strB)) {
                        continue;
                    }
                }
                Collection collection = iVar.f5566c;
                if (collection == null || collection.contains(getName())) {
                    for (I7.e eVar2 : iVar.f5568e) {
                        if (eVar2.b(this) != null) {
                            fVar = new I7.f(false);
                            this.f8692t = fVar.f5554a;
                            return this;
                        }
                    }
                    fVar = ((String) iVar.f5567d.invoke(this)) != null ? new I7.f(false) : I7.f.f5553c;
                    this.f8692t = fVar.f5554a;
                    return this;
                }
            }
        }
        fVar = I7.f.f5552b;
        this.f8692t = fVar.f5554a;
        return this;
    }

    public final void W0(boolean z6, boolean z9) {
        int i3;
        if (z6) {
            i3 = z9 ? 4 : 2;
        } else {
            i3 = z9 ? 3 : 1;
        }
        this.f12180K = i3;
    }

    @Override
    public final boolean y() {
        return f.a(this.f12180K);
    }
}
