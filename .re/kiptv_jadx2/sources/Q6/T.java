package Q6;

import C7.AbstractC0191x;
import N6.InterfaceC0697k;
import N6.X;
import java.util.Collections;
import java.util.List;

public abstract class T extends AbstractC0805n implements X {

    public AbstractC0191x f8611l;

    public T(InterfaceC0697k interfaceC0697k, O6.h hVar, p101l7.e eVar, AbstractC0191x abstractC0191x, N6.P p2) {
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

    public static void i0(int i3) {
        String str;
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
        Object[] objArr = new Object[i9];
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
        String str2 = String.format(str, objArr);
        switch (i3) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override
    public final List O() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        i0(6);
        throw null;
    }

    public u S() {
        return null;
    }

    public u V() {
        return null;
    }

    public AbstractC0191x getReturnType() {
        AbstractC0191x type = getType();
        if (type != null) {
            return type;
        }
        i0(10);
        throw null;
    }

    @Override
    public final AbstractC0191x getType() {
        AbstractC0191x abstractC0191x = this.f8611l;
        if (abstractC0191x != null) {
            return abstractC0191x;
        }
        i0(4);
        throw null;
    }

    public List getTypeParameters() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        i0(8);
        throw null;
    }

    @Override
    public boolean y() {
        return false;
    }
}
