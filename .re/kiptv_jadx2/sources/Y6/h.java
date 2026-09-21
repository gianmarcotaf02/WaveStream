package Y6;

import C7.AbstractC0191x;
import C7.Y;
import K6.t;
import N6.C0701o;
import N6.EnumC0711z;
import N6.InterfaceC0687a;
import N6.InterfaceC0697k;
import N6.N;
import N6.P;
import N6.Q;
import Q6.I;
import Q6.J;
import Q6.K;
import Q6.S;
import W6.x;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p070h6.k;
import p078i6.w;

public class h extends I implements a {
    public final boolean H;

    public final k f12182I;

    public h(InterfaceC0697k interfaceC0697k, O6.h hVar, EnumC0711z enumC0711z, C0701o c0701o, boolean z6, p101l7.e eVar, P p2, N n3, int i3, boolean z9, k kVar) {
        super(interfaceC0697k, n3, hVar, enumC0711z, c0701o, z6, eVar, i3, p2, false, false, false, false, false);
        if (interfaceC0697k == null) {
            i0(0);
            throw null;
        }
        if (hVar == null) {
            i0(1);
            throw null;
        }
        if (enumC0711z == null) {
            i0(2);
            throw null;
        }
        if (c0701o == null) {
            i0(3);
            throw null;
        }
        if (eVar == null) {
            i0(4);
            throw null;
        }
        if (p2 == null) {
            i0(5);
            throw null;
        }
        if (i3 == 0) {
            i0(6);
            throw null;
        }
        this.H = z9;
        this.f12182I = kVar;
    }

    public static h O0(InterfaceC0697k interfaceC0697k, Z6.d dVar, C0701o c0701o, boolean z6, p101l7.e eVar, S6.f fVar, boolean z9) {
        EnumC0711z enumC0711z = EnumC0711z.f7427i;
        if (interfaceC0697k == null) {
            i0(7);
            throw null;
        }
        if (eVar != null) {
            return new h(interfaceC0697k, dVar, enumC0711z, c0701o, z6, eVar, fVar, null, 1, z9, null);
        }
        i0(11);
        throw null;
    }

    public static void i0(int i3) {
        String str = i3 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i3 != 21 ? 3 : 2];
        switch (i3) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i3 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i3) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i3 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override
    public final a G(AbstractC0191x abstractC0191x, ArrayList arrayList, AbstractC0191x abstractC0191x2, k kVar) {
        AbstractC0191x abstractC0191x3;
        J j;
        K k9;
        N nA = a() == this ? null : a();
        h hVar = new h(h(), getAnnotations(), e(), getVisibility(), this.f8579m, getName(), d(), nA, c(), this.H, kVar);
        J j9 = this.f8575D;
        if (j9 != null) {
            J j10 = new J(hVar, j9.getAnnotations(), j9.e(), j9.getVisibility(), j9.f8555l, j9.f8556m, j9.f8559p, c(), nA == null ? null : nA.getGetter(), j9.d());
            j10.f8562s = j9.f8562s;
            abstractC0191x3 = abstractC0191x2;
            j10.f8592t = abstractC0191x3;
            j = j10;
        } else {
            abstractC0191x3 = abstractC0191x2;
            j = null;
        }
        K k10 = this.f8576E;
        if (k10 != null) {
            k9 = new K(hVar, k10.getAnnotations(), k10.e(), k10.getVisibility(), k10.f8555l, k10.f8556m, k10.f8559p, c(), nA == null ? null : nA.getSetter(), k10.d());
            k9.f8562s = k9.f8562s;
            S s9 = (S) k10.O().get(0);
            if (s9 == null) {
                K.i0(6);
                throw null;
            }
            k9.f8594t = s9;
        } else {
            k9 = null;
        }
        hVar.K0(j, k9, this.f8577F, this.f8578G);
        Function0 function0 = this.f8581o;
        if (function0 != null) {
            hVar.L0(this.f8580n, function0);
        }
        hVar.f0(i());
        hVar.N0(abstractC0191x3, getTypeParameters(), this.f8572A, abstractC0191x != null ? p127o7.k.k(this, abstractC0191x, O6.g.f7987a) : null, w.f23205h);
        return hVar;
    }

    @Override
    public final I I0(InterfaceC0697k interfaceC0697k, EnumC0711z enumC0711z, C0701o c0701o, N n3, int i3, p101l7.e eVar) {
        Q q9 = P.f7377b;
        if (interfaceC0697k == null) {
            i0(13);
            throw null;
        }
        if (enumC0711z == null) {
            i0(14);
            throw null;
        }
        if (c0701o == null) {
            i0(15);
            throw null;
        }
        if (i3 == 0) {
            i0(16);
            throw null;
        }
        if (eVar == null) {
            i0(17);
            throw null;
        }
        return new h(interfaceC0697k, getAnnotations(), enumC0711z, c0701o, this.f8579m, eVar, q9, n3, i3, this.H, this.f12182I);
    }

    @Override
    public final boolean isConst() {
        AbstractC0191x type = getType();
        if (!this.H) {
            return false;
        }
        m.e(type, "type");
        if (((!K6.i.F(type) && !t.a(type)) || Y.e(type)) && !K6.i.G(type)) {
            return false;
        }
        O6.i iVar = p035d7.t.f21299a;
        p101l7.c ENHANCED_NULLABILITY_ANNOTATION = x.f10702p;
        m.d(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !D7.g.u(type, ENHANCED_NULLABILITY_ANNOTATION) || K6.i.G(type);
    }

    @Override
    public final Object r(InterfaceC0687a interfaceC0687a) {
        k kVar = this.f12182I;
        if (kVar == null || !((InterfaceC0687a) kVar.f22539h).equals(interfaceC0687a)) {
            return null;
        }
        return kVar.f22540i;
    }

    @Override
    public final boolean y() {
        return false;
    }

    @Override
    public final void M0(AbstractC0191x abstractC0191x) {
    }
}
