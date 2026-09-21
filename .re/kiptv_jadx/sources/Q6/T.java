package Q6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class T extends Q6.AbstractC0805n implements N6.X {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C7.AbstractC0191x f8611l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(N6.InterfaceC0697k interfaceC0697k, O6.h hVar, p101l7.e eVar, C7.AbstractC0191x abstractC0191x, N6.P p2) {
        super(interfaceC0697k, hVar, eVar, p2);
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
        if (p2 == null) {
            i0(3);
            throw null;
        }
        this.f8611l = abstractC0191x;
    }

    public static /* synthetic */ void i0(int i3) {
        java.lang.String str;
        int i9;
        switch (i3) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i3) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i9 = 2;
                break;
            default:
                i9 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i9];
        switch (i3) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i3) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i3) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i3) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new java.lang.IllegalStateException(str2);
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    @Override // N6.InterfaceC0688b
    public final java.util.List O() {
        java.util.List list = java.util.Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        i0(6);
        throw null;
    }

    public Q6.u S() {
        return null;
    }

    public Q6.u V() {
        return null;
    }

    public C7.AbstractC0191x getReturnType() {
        C7.AbstractC0191x type = getType();
        if (type != null) {
            return type;
        }
        i0(10);
        throw null;
    }

    @Override // D1.AbstractC0220e0, p187w7.d
    public final C7.AbstractC0191x getType() {
        C7.AbstractC0191x abstractC0191x = this.f8611l;
        if (abstractC0191x != null) {
            return abstractC0191x;
        }
        i0(4);
        throw null;
    }

    public java.util.List getTypeParameters() {
        java.util.List list = java.util.Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        i0(8);
        throw null;
    }

    @Override // N6.InterfaceC0688b
    public boolean y() {
        return false;
    }
}
