package Q6;

/* JADX INFO: loaded from: classes4.dex */
public class L extends Q6.AbstractC0810t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N6.InterfaceC0697k interfaceC0697k, Q6.L l2, O6.h hVar, p101l7.e eVar, int i3, N6.P p2) {
        super(i3, interfaceC0697k, l2, p2, hVar, eVar);
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
        if (i3 == 0) {
            i0(3);
            throw null;
        }
        if (p2 != null) {
        } else {
            i0(4);
            throw null;
        }
    }

    public static Q6.L R0(N6.InterfaceC0691e interfaceC0691e, p101l7.e eVar, int i3, N6.P p2) {
        O6.f fVar = O6.g.f7987a;
        if (interfaceC0691e == null) {
            i0(5);
            throw null;
        }
        if (eVar == null) {
            i0(7);
            throw null;
        }
        if (i3 == 0) {
            i0(8);
            throw null;
        }
        if (p2 != null) {
            return new Q6.L(interfaceC0691e, null, fVar, eVar, i3, p2);
        }
        i0(9);
        throw null;
    }

    public static /* synthetic */ void i0(int i3) {
        java.lang.String str = (i3 == 13 || i3 == 18 || i3 == 23 || i3 == 24 || i3 == 29 || i3 == 30) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 13 || i3 == 18 || i3 == 23 || i3 == 24 || i3 == 29 || i3 == 30) ? 2 : 3];
        switch (i3) {
            case 1:
            case 6:
            case 27:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 26:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 28:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 15:
            case 20:
                objArr[0] = "typeParameters";
                break;
            case 11:
            case 16:
            case 21:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
            case 17:
            case 22:
                objArr[0] = io.sentry.protocol.ViewHierarchyNode.JsonKeys.VISIBILITY;
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
                break;
            case 14:
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 25:
                objArr[0] = "newOwner";
                break;
        }
        if (i3 == 13 || i3 == 18 || i3 == 23) {
            objArr[1] = "initialize";
        } else if (i3 == 24) {
            objArr[1] = "getOriginal";
        } else if (i3 == 29) {
            objArr[1] = "copy";
        } else if (i3 != 30) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "newCopyBuilder";
        }
        switch (i3) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = "create";
                break;
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 23:
            case 24:
            case 29:
            case 30:
                break;
            case 25:
            case 26:
            case 27:
            case 28:
                objArr[2] = "createSubstitutedCopy";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 13 && i3 != 18 && i3 != 23 && i3 != 24 && i3 != 29 && i3 != 30) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // Q6.AbstractC0810t
    public Q6.AbstractC0810t I0(int i3, N6.InterfaceC0697k interfaceC0697k, N6.InterfaceC0706u interfaceC0706u, N6.P p2, O6.h hVar, p101l7.e eVar) {
        if (interfaceC0697k == null) {
            i0(25);
            throw null;
        }
        if (i3 == 0) {
            i0(26);
            throw null;
        }
        if (hVar == null) {
            i0(27);
            throw null;
        }
        Q6.L l2 = (Q6.L) interfaceC0706u;
        if (eVar == null) {
            eVar = getName();
        }
        return new Q6.L(interfaceC0697k, l2, hVar, eVar, i3, p2);
    }

    @Override // Q6.AbstractC0810t, Q6.AbstractC0805n, Q6.AbstractC0804m, N6.InterfaceC0697k
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final Q6.L a() {
        Q6.L l2 = (Q6.L) super.a();
        if (l2 != null) {
            return l2;
        }
        i0(24);
        throw null;
    }

    @Override // Q6.AbstractC0810t
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final Q6.L L0(Q6.u uVar, Q6.u uVar2, java.util.List list, java.util.List list2, java.util.List list3, C7.AbstractC0191x abstractC0191x, N6.EnumC0711z enumC0711z, N6.C0701o c0701o) {
        if (list == null) {
            i0(14);
            throw null;
        }
        if (list2 == null) {
            i0(15);
            throw null;
        }
        if (list3 == null) {
            i0(16);
            throw null;
        }
        if (c0701o != null) {
            return U0(uVar, uVar2, list, list2, list3, abstractC0191x, enumC0711z, c0701o, null);
        }
        i0(17);
        throw null;
    }

    public Q6.L U0(Q6.u uVar, Q6.u uVar2, java.util.List list, java.util.List list2, java.util.List list3, C7.AbstractC0191x abstractC0191x, N6.EnumC0711z enumC0711z, N6.C0701o c0701o, p078i6.x xVar) {
        if (list == null) {
            i0(19);
            throw null;
        }
        if (list2 == null) {
            i0(20);
            throw null;
        }
        if (list3 == null) {
            i0(21);
            throw null;
        }
        if (c0701o != null) {
            super.L0(uVar, uVar2, list, list2, list3, abstractC0191x, enumC0711z, c0701o);
            return this;
        }
        i0(22);
        throw null;
    }

    @Override // Q6.AbstractC0810t, N6.InterfaceC0706u
    public N6.InterfaceC0705t k0() {
        return M0(C7.V.f1566b);
    }
}
