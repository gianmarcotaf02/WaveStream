package Q6;

/* JADX INFO: renamed from: Q6.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0799h extends Q6.AbstractC0805n implements N6.U {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C7.b0 f8624l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f8625m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f8626n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B7.i f8627o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B7.i f8628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final B7.m f8629q;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0799h(B7.p pVar, N6.InterfaceC0697k interfaceC0697k, O6.h hVar, p101l7.e eVar, C7.b0 b0Var, boolean z6, int i3, N6.Q q9) {
        N6.Q q10 = N6.P.f7377b;
        if (pVar == null) {
            i0(0);
            throw null;
        }
        if (interfaceC0697k == null) {
            i0(1);
            throw null;
        }
        if (hVar == null) {
            i0(2);
            throw null;
        }
        if (eVar == null) {
            i0(3);
            throw null;
        }
        if (b0Var == null) {
            i0(4);
            throw null;
        }
        if (q9 == null) {
            i0(6);
            throw null;
        }
        super(interfaceC0697k, hVar, eVar, q10);
        this.f8624l = b0Var;
        this.f8625m = z6;
        this.f8626n = i3;
        A7.w wVar = new A7.w(this, pVar, q9);
        B7.m mVar = (B7.m) pVar;
        this.f8627o = new B7.i(mVar, wVar);
        this.f8628p = new B7.i(mVar, new A7.l(26, this, eVar, false));
        this.f8629q = mVar;
    }

    public static /* synthetic */ void i0(int i3) {
        java.lang.String str;
        int i9;
        switch (i3) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i3) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i9 = 2;
                break;
            case 12:
            default:
                i9 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i9];
        switch (i3) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i3) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i3) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        switch (i3) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new java.lang.IllegalStateException(str2);
            case 12:
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    @Override // N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return interfaceC0699m.L(this, obj);
    }

    @Override // N6.U
    public final C7.b0 E() {
        C7.b0 b0Var = this.f8624l;
        if (b0Var != null) {
            return b0Var;
        }
        i0(7);
        throw null;
    }

    public abstract java.util.List H0();

    @Override // N6.U
    public final B7.p T() {
        B7.m mVar = this.f8629q;
        if (mVar != null) {
            return mVar;
        }
        i0(14);
        throw null;
    }

    @Override // N6.U
    public final boolean X() {
        return false;
    }

    @Override // Q6.AbstractC0805n, Q6.AbstractC0804m, N6.InterfaceC0697k
    public final N6.InterfaceC0694h a() {
        return this;
    }

    @Override // N6.U
    public final int getIndex() {
        return this.f8626n;
    }

    @Override // N6.U
    public final java.util.List getUpperBounds() {
        java.util.List listI = ((Q6.C0798g) o()).i();
        if (listI != null) {
            return listI;
        }
        i0(8);
        throw null;
    }

    @Override // N6.InterfaceC0694h
    public final C7.B j() {
        C7.B b9 = (C7.B) this.f8628p.invoke();
        if (b9 != null) {
            return b9;
        }
        i0(10);
        throw null;
    }

    @Override // N6.InterfaceC0694h
    public final C7.M o() {
        C7.M m8 = (C7.M) this.f8627o.invoke();
        if (m8 != null) {
            return m8;
        }
        i0(9);
        throw null;
    }

    @Override // N6.U
    public final boolean x() {
        return this.f8625m;
    }

    @Override // Q6.AbstractC0805n, Q6.AbstractC0804m, N6.InterfaceC0697k
    public final N6.InterfaceC0697k a() {
        return this;
    }

    @Override // Q6.AbstractC0805n, Q6.AbstractC0804m, N6.InterfaceC0697k
    public final N6.U a() {
        return this;
    }

    @Override // Q6.AbstractC0805n
    /* JADX INFO: renamed from: F0 */
    public final N6.InterfaceC0698l a() {
        return this;
    }

    public java.util.List G0(java.util.List list) {
        return list;
    }
}
