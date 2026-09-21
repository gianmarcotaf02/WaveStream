package Q6;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends Q6.G implements N6.M {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C7.AbstractC0191x f8592t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Q6.J f8593u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(N6.N n3, O6.h hVar, N6.EnumC0711z enumC0711z, N6.C0701o c0701o, boolean z6, boolean z9, boolean z10, int i3, Q6.J j, N6.P p2) {
        super(enumC0711z, c0701o, n3, hVar, p101l7.e.g("<get-" + n3.getName() + ">"), z6, z9, z10, i3, p2);
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
        if (i3 == 0) {
            i0(4);
            throw null;
        }
        if (p2 == null) {
            i0(5);
            throw null;
        }
        this.f8593u = j != null ? j : this;
    }

    public static /* synthetic */ void i0(int i3) {
        java.lang.String str = (i3 == 6 || i3 == 7 || i3 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 6 || i3 == 7 || i3 == 8) ? 2 : 3];
        switch (i3) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = io.sentry.protocol.ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i3 == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i3 == 7) {
            objArr[1] = "getValueParameters";
        } else if (i3 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i3 != 6 && i3 != 7 && i3 != 8) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 6 && i3 != 7 && i3 != 8) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return interfaceC0699m.k(this, obj);
    }

    @Override // Q6.AbstractC0805n, Q6.AbstractC0804m, N6.InterfaceC0697k
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    public final Q6.J a() {
        Q6.J j = this.f8593u;
        if (j != null) {
            return j;
        }
        i0(8);
        throw null;
    }

    public final void J0(C7.AbstractC0191x abstractC0191x) {
        if (abstractC0191x == null) {
            abstractC0191x = G0().getType();
        }
        this.f8592t = abstractC0191x;
    }

    @Override // N6.InterfaceC0688b
    public final java.util.List O() {
        java.util.List list = java.util.Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        i0(7);
        throw null;
    }

    @Override // N6.InterfaceC0688b
    public final C7.AbstractC0191x getReturnType() {
        return this.f8592t;
    }

    @Override // N6.InterfaceC0689c, N6.InterfaceC0688b
    public final java.util.Collection i() {
        return H0(true);
    }
}
