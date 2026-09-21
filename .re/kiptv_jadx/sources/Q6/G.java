package Q6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class G extends Q6.AbstractC0805n implements N6.M {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f8556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final N6.EnumC0711z f8557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final N6.N f8558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f8559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f8560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public N6.C0701o f8561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public N6.InterfaceC0706u f8562s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(N6.EnumC0711z enumC0711z, N6.C0701o c0701o, N6.N n3, O6.h hVar, p101l7.e eVar, boolean z6, boolean z9, boolean z10, int i3, N6.P p2) {
        super(n3.h(), hVar, eVar, p2);
        if (enumC0711z == null) {
            i0(0);
            throw null;
        }
        if (c0701o == null) {
            i0(1);
            throw null;
        }
        if (hVar == null) {
            i0(3);
            throw null;
        }
        if (p2 == null) {
            i0(5);
            throw null;
        }
        this.f8562s = null;
        this.f8557n = enumC0711z;
        this.f8561r = c0701o;
        this.f8558o = n3;
        this.f8555l = z6;
        this.f8556m = z9;
        this.f8559p = z10;
        this.f8560q = i3;
    }

    public static /* synthetic */ void i0(int i3) {
        java.lang.String str;
        int i9;
        switch (i3) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i3) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i9 = 2;
                break;
            case 7:
            default:
                i9 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i9];
        switch (i3) {
            case 1:
                objArr[0] = io.sentry.protocol.ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i3) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i3) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i3) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new java.lang.IllegalStateException(str2);
            case 7:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    @Override // N6.InterfaceC0710y
    public final boolean C() {
        return false;
    }

    public final N6.N G0() {
        N6.N n3 = this.f8558o;
        if (n3 != null) {
            return n3;
        }
        i0(13);
        throw null;
    }

    @Override // N6.InterfaceC0706u
    public final boolean H() {
        return false;
    }

    public final java.util.ArrayList H0(boolean z6) {
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        for (N6.N n3 : G0().i()) {
            Q6.AbstractC0805n getter = z6 ? n3.getGetter() : n3.getSetter();
            if (getter != null) {
                arrayList.add(getter);
            }
        }
        return arrayList;
    }

    @Override // N6.InterfaceC0689c
    public final N6.InterfaceC0689c K(N6.InterfaceC0691e interfaceC0691e, N6.EnumC0711z enumC0711z, N6.C0701o c0701o) {
        throw new java.lang.UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // N6.InterfaceC0706u
    public final N6.InterfaceC0706u R() {
        return this.f8562s;
    }

    @Override // N6.InterfaceC0688b
    public final Q6.u S() {
        return G0().S();
    }

    @Override // N6.InterfaceC0688b
    public final Q6.u V() {
        return G0().V();
    }

    @Override // N6.InterfaceC0688b
    public final java.util.List Z() {
        java.util.List listZ = G0().Z();
        if (listZ != null) {
            return listZ;
        }
        i0(14);
        throw null;
    }

    @Override // N6.InterfaceC0706u, N6.S
    public final N6.InterfaceC0706u b(C7.V v6) {
        if (v6 != null) {
            return this;
        }
        i0(7);
        throw null;
    }

    @Override // N6.InterfaceC0689c
    public final int c() {
        int i3 = this.f8560q;
        if (i3 != 0) {
            return i3;
        }
        i0(6);
        throw null;
    }

    @Override // N6.InterfaceC0710y
    public final N6.EnumC0711z e() {
        N6.EnumC0711z enumC0711z = this.f8557n;
        if (enumC0711z != null) {
            return enumC0711z;
        }
        i0(10);
        throw null;
    }

    @Override // N6.InterfaceC0706u
    public final boolean e0() {
        return false;
    }

    @Override // N6.InterfaceC0689c
    public final void f0(java.util.Collection collection) {
        if (collection != null) {
            return;
        }
        i0(16);
        throw null;
    }

    @Override // N6.InterfaceC0688b
    public final java.util.List getTypeParameters() {
        java.util.List list = java.util.Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        i0(9);
        throw null;
    }

    @Override // N6.InterfaceC0700n
    public final N6.C0701o getVisibility() {
        N6.C0701o c0701o = this.f8561r;
        if (c0701o != null) {
            return c0701o;
        }
        i0(11);
        throw null;
    }

    @Override // N6.InterfaceC0710y
    public final boolean isExternal() {
        return this.f8556m;
    }

    @Override // N6.InterfaceC0706u
    public final boolean isInfix() {
        return false;
    }

    @Override // N6.InterfaceC0706u
    public final boolean isInline() {
        return this.f8559p;
    }

    @Override // N6.InterfaceC0706u
    public final boolean isOperator() {
        return false;
    }

    @Override // N6.InterfaceC0706u
    public final boolean isSuspend() {
        return false;
    }

    @Override // N6.InterfaceC0706u
    public final boolean j0() {
        return false;
    }

    @Override // N6.InterfaceC0710y
    public final boolean m0() {
        return false;
    }

    @Override // N6.InterfaceC0688b
    public final java.lang.Object r(N6.InterfaceC0687a interfaceC0687a) {
        return null;
    }

    @Override // N6.InterfaceC0688b
    public final boolean y() {
        return false;
    }

    @Override // N6.S
    public final /* bridge */ /* synthetic */ N6.InterfaceC0698l b(C7.V v6) {
        b(v6);
        return this;
    }
}
