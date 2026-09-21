package Y6;

/* JADX INFO: loaded from: classes4.dex */
public class h extends Q6.I implements Y6.a {
    public final boolean H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final p070h6.k f12182I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(N6.InterfaceC0697k interfaceC0697k, O6.h hVar, N6.EnumC0711z enumC0711z, N6.C0701o c0701o, boolean z6, p101l7.e eVar, N6.P p2, N6.N n3, int i3, boolean z9, p070h6.k kVar) {
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

    public static Y6.h O0(N6.InterfaceC0697k interfaceC0697k, Z6.d dVar, N6.C0701o c0701o, boolean z6, p101l7.e eVar, S6.f fVar, boolean z9) {
        N6.EnumC0711z enumC0711z = N6.EnumC0711z.f7427i;
        if (interfaceC0697k == null) {
            i0(7);
            throw null;
        }
        if (eVar != null) {
            return new Y6.h(interfaceC0697k, dVar, enumC0711z, c0701o, z6, eVar, fVar, null, 1, z9, null);
        }
        i0(11);
        throw null;
    }

    public static /* synthetic */ void i0(int i3) {
        java.lang.String str = i3 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i3 != 21 ? 3 : 2];
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
                objArr[0] = io.sentry.protocol.ViewHierarchyNode.JsonKeys.VISIBILITY;
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
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 == 21) {
            throw new java.lang.IllegalStateException(str2);
        }
    }

    @Override // Y6.a
    public final Y6.a G(C7.AbstractC0191x abstractC0191x, java.util.ArrayList arrayList, C7.AbstractC0191x abstractC0191x2, p070h6.k kVar) {
        C7.AbstractC0191x abstractC0191x3;
        Q6.J j;
        Q6.K k9;
        N6.N nA = a() == this ? null : a();
        Y6.h hVar = new Y6.h(h(), getAnnotations(), e(), getVisibility(), this.f8579m, getName(), d(), nA, c(), this.H, kVar);
        Q6.J j9 = this.f8575D;
        if (j9 != null) {
            Q6.J j10 = new Q6.J(hVar, j9.getAnnotations(), j9.e(), j9.getVisibility(), j9.f8555l, j9.f8556m, j9.f8559p, c(), nA == null ? null : nA.getGetter(), j9.d());
            j10.f8562s = j9.f8562s;
            abstractC0191x3 = abstractC0191x2;
            j10.f8592t = abstractC0191x3;
            j = j10;
        } else {
            abstractC0191x3 = abstractC0191x2;
            j = null;
        }
        Q6.K k10 = this.f8576E;
        if (k10 != null) {
            k9 = new Q6.K(hVar, k10.getAnnotations(), k10.e(), k10.getVisibility(), k10.f8555l, k10.f8556m, k10.f8559p, c(), nA == null ? null : nA.getSetter(), k10.d());
            k9.f8562s = k9.f8562s;
            Q6.S s9 = (Q6.S) k10.O().get(0);
            if (s9 == null) {
                Q6.K.i0(6);
                throw null;
            }
            k9.f8594t = s9;
        } else {
            k9 = null;
        }
        hVar.K0(j, k9, this.f8577F, this.f8578G);
        kotlin.jvm.functions.Function0 function0 = this.f8581o;
        if (function0 != null) {
            hVar.L0(this.f8580n, function0);
        }
        hVar.f0(i());
        hVar.N0(abstractC0191x3, getTypeParameters(), this.f8572A, abstractC0191x != null ? p127o7.k.k(this, abstractC0191x, O6.g.f7987a) : null, p078i6.w.f23205h);
        return hVar;
    }

    @Override // Q6.I
    public final Q6.I I0(N6.InterfaceC0697k interfaceC0697k, N6.EnumC0711z enumC0711z, N6.C0701o c0701o, N6.N n3, int i3, p101l7.e eVar) {
        N6.Q q9 = N6.P.f7377b;
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
        return new Y6.h(interfaceC0697k, getAnnotations(), enumC0711z, c0701o, this.f8579m, eVar, q9, n3, i3, this.H, this.f12182I);
    }

    @Override // Q6.I, N6.X
    public final boolean isConst() {
        C7.AbstractC0191x type = getType();
        if (!this.H) {
            return false;
        }
        kotlin.jvm.internal.m.e(type, "type");
        if (((!K6.i.F(type) && !K6.t.a(type)) || C7.Y.e(type)) && !K6.i.G(type)) {
            return false;
        }
        O6.i iVar = p035d7.t.f21299a;
        p101l7.c ENHANCED_NULLABILITY_ANNOTATION = W6.x.f10702p;
        kotlin.jvm.internal.m.d(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return !D7.g.u(type, ENHANCED_NULLABILITY_ANNOTATION) || K6.i.G(type);
    }

    @Override // Q6.I, N6.InterfaceC0688b
    public final java.lang.Object r(N6.InterfaceC0687a interfaceC0687a) {
        p070h6.k kVar = this.f12182I;
        if (kVar == null || !((N6.InterfaceC0687a) kVar.f22539h).equals(interfaceC0687a)) {
            return null;
        }
        return kVar.f22540i;
    }

    @Override // Q6.T, N6.InterfaceC0688b
    public final boolean y() {
        return false;
    }

    @Override // Q6.I
    public final void M0(C7.AbstractC0191x abstractC0191x) {
    }
}
