package Q6;

import N6.InterfaceC0697k;

public abstract class AbstractC0801j extends AbstractC0793b {

    public final InterfaceC0697k f8631l;

    public final N6.P f8632m;

    public AbstractC0801j(B7.m mVar, InterfaceC0697k interfaceC0697k, p101l7.e eVar, N6.P p2) {
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

    public static void n0(int i3) {
        String str = (i3 == 4 || i3 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i3 == 4 || i3 == 5) ? 2 : 3];
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
        String str2 = String.format(str, objArr);
        if (i3 != 4 && i3 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final N6.P d() {
        N6.P p2 = this.f8632m;
        if (p2 != null) {
            return p2;
        }
        n0(5);
        throw null;
    }

    @Override
    public final InterfaceC0697k h() {
        InterfaceC0697k interfaceC0697k = this.f8631l;
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
