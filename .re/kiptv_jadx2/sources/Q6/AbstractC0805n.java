package Q6;

import N6.InterfaceC0697k;
import N6.InterfaceC0698l;

public abstract class AbstractC0805n extends AbstractC0804m implements InterfaceC0698l {
    public final InterfaceC0697k j;

    public final N6.P f8642k;

    public AbstractC0805n(InterfaceC0697k interfaceC0697k, O6.h hVar, p101l7.e eVar, N6.P p2) {
        super(hVar, eVar);
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
        this.j = interfaceC0697k;
        this.f8642k = p2;
    }

    public static void i0(int i3) {
        String str = (i3 == 4 || i3 == 5 || i3 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i3 == 4 || i3 == 5 || i3 == 6) ? 2 : 3];
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
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i3 == 4) {
            objArr[1] = "getOriginal";
        } else if (i3 == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i3 != 6) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i3 != 4 && i3 != 5 && i3 != 6) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i3 != 4 && i3 != 5 && i3 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public N6.P d() {
        N6.P p2 = this.f8642k;
        if (p2 != null) {
            return p2;
        }
        i0(6);
        throw null;
    }

    public InterfaceC0697k h() {
        InterfaceC0697k interfaceC0697k = this.j;
        if (interfaceC0697k != null) {
            return interfaceC0697k;
        }
        i0(5);
        throw null;
    }

    @Override
    public InterfaceC0698l a() {
        return this;
    }
}
