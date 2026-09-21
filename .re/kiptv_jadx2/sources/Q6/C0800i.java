package Q6;

import C7.V;
import N6.C0701o;
import N6.EnumC0711z;
import N6.InterfaceC0689c;
import N6.InterfaceC0691e;
import N6.InterfaceC0696j;
import N6.InterfaceC0697k;
import N6.InterfaceC0699m;
import N6.InterfaceC0706u;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class C0800i extends AbstractC0810t implements InterfaceC0696j {

    public final boolean f8630K;

    public C0800i(InterfaceC0691e interfaceC0691e, InterfaceC0696j interfaceC0696j, O6.h hVar, boolean z6, int i3, N6.P p2) {
        super(i3, interfaceC0691e, interfaceC0696j, p2, hVar, p101l7.g.f24844e);
        if (interfaceC0691e == null) {
            i0(0);
            throw null;
        }
        if (hVar == null) {
            i0(1);
            throw null;
        }
        if (i3 == 0) {
            i0(2);
            throw null;
        }
        if (p2 == null) {
            i0(3);
            throw null;
        }
        this.f8630K = z6;
    }

    public static void i0(int i3) {
        String str;
        int i9;
        if (i3 != 21 && i3 != 27) {
            switch (i3) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i3 != 21 && i3 != 27) {
            switch (i3) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    i9 = 2;
                    break;
                default:
                    i9 = 3;
                    break;
            }
        } else {
            i9 = 2;
        }
        Object[] objArr = new Object[i9];
        switch (i3) {
            case 1:
            case 5:
            case 8:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 9:
            case 26:
                objArr[0] = "source";
                break;
            case 4:
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 13:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
            case 14:
                objArr[0] = ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 12:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
        }
        if (i3 == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i3 != 27) {
            switch (i3) {
                case 15:
                case 16:
                    objArr[1] = "calculateContextReceiverParameters";
                    break;
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i3) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "create";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSynthesized";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                objArr[2] = "initialize";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i3 != 21 && i3 != 27) {
            switch (i3) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override
    public final Object B(InterfaceC0699m interfaceC0699m, Object obj) {
        return interfaceC0699m.h(this, obj);
    }

    @Override
    public final InterfaceC0689c K(InterfaceC0691e interfaceC0691e, EnumC0711z enumC0711z, C0701o c0701o) {
        return (C0800i) G0(interfaceC0691e, enumC0711z, c0701o);
    }

    @Override
    public C0800i I0(int i3, InterfaceC0697k interfaceC0697k, InterfaceC0706u interfaceC0706u, N6.P p2, O6.h hVar, p101l7.e eVar) {
        if (interfaceC0697k == null) {
            i0(23);
            throw null;
        }
        if (i3 == 0) {
            i0(24);
            throw null;
        }
        if (hVar == null) {
            i0(25);
            throw null;
        }
        if (i3 == 1 || i3 == 4) {
            return new C0800i((InterfaceC0691e) interfaceC0697k, this, hVar, this.f8630K, 1, p2);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0697k + "\nkind: " + B2.a.A(i3));
    }

    @Override
    public final InterfaceC0691e h() {
        InterfaceC0691e interfaceC0691e = (InterfaceC0691e) super.h();
        if (interfaceC0691e != null) {
            return interfaceC0691e;
        }
        i0(17);
        throw null;
    }

    @Override
    public final C0800i a() {
        C0800i c0800i = (C0800i) super.a();
        if (c0800i != null) {
            return c0800i;
        }
        i0(19);
        throw null;
    }

    public final void U0(List list, C0701o c0701o) {
        if (list == null) {
            i0(13);
            throw null;
        }
        if (c0701o != null) {
            V0(list, c0701o, h().l());
        } else {
            i0(14);
            throw null;
        }
    }

    public final void V0(List list, C0701o c0701o, List list2) {
        u uVarR0;
        List listO0;
        if (list == null) {
            i0(10);
            throw null;
        }
        if (c0701o == null) {
            i0(11);
            throw null;
        }
        if (list2 == null) {
            i0(12);
            throw null;
        }
        InterfaceC0691e interfaceC0691eH = h();
        if (interfaceC0691eH.D()) {
            InterfaceC0697k interfaceC0697kH = interfaceC0691eH.h();
            if (interfaceC0697kH instanceof InterfaceC0691e) {
                uVarR0 = ((InterfaceC0691e) interfaceC0697kH).r0();
            } else {
                uVarR0 = null;
            }
        } else {
            uVarR0 = null;
        }
        InterfaceC0691e interfaceC0691eH2 = h();
        if (interfaceC0691eH2.o0().isEmpty()) {
            listO0 = Collections.EMPTY_LIST;
            if (listO0 == null) {
                i0(16);
                throw null;
            }
        } else {
            listO0 = interfaceC0691eH2.o0();
            if (listO0 == null) {
                i0(15);
                throw null;
            }
        }
        L0(null, uVarR0, listO0, list2, list, null, EnumC0711z.f7427i, c0701o);
    }

    @Override
    public final C0800i b(V v6) {
        if (v6 != null) {
            return (C0800i) super.b(v6);
        }
        i0(20);
        throw null;
    }

    @Override
    public final void f0(Collection collection) {
        if (collection != null) {
            return;
        }
        i0(22);
        throw null;
    }

    @Override
    public final Collection i() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        i0(21);
        throw null;
    }

    @Override
    public final boolean t() {
        return this.f8630K;
    }

    @Override
    public final InterfaceC0691e u() {
        InterfaceC0691e interfaceC0691eH = h();
        if (interfaceC0691eH != null) {
            return interfaceC0691eH;
        }
        i0(18);
        throw null;
    }
}
