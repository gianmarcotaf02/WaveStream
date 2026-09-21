package Q6;

/* JADX INFO: renamed from: Q6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0801j extends Q6.AbstractC0793b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N6.InterfaceC0697k f8631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N6.P f8632m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0801j(B7.m mVar, N6.InterfaceC0697k interfaceC0697k, p101l7.e eVar, N6.P p2) {
        super(mVar, eVar);
        if (mVar == null) {
            n0(0);
            throw null;
        }
        if (interfaceC0697k == null) {
            n0(1);
            throw null;
        }
        if (eVar == null) {
            n0(2);
            throw null;
        }
        this.f8631l = interfaceC0697k;
        this.f8632m = p2;
    }

    public static /* synthetic */ void n0(int i3) {
        java.lang.String str = (i3 == 4 || i3 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 4 || i3 == 5) ? 2 : 3];
        if (i3 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i3 == 2) {
            objArr[0] = "name";
        } else if (i3 == 3) {
            objArr[0] = "source";
        } else if (i3 == 4 || i3 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i3 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i3 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i3 != 4 && i3 != 5) {
            objArr[2] = "<init>";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 4 && i3 != 5) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // N6.InterfaceC0698l
    public final N6.P d() {
        N6.P p2 = this.f8632m;
        if (p2 != null) {
            return p2;
        }
        n0(5);
        throw null;
    }

    @Override // N6.InterfaceC0697k
    public final N6.InterfaceC0697k h() {
        N6.InterfaceC0697k interfaceC0697k = this.f8631l;
        if (interfaceC0697k != null) {
            return interfaceC0697k;
        }
        n0(4);
        throw null;
    }

    public boolean isExternal() {
        return false;
    }
}
