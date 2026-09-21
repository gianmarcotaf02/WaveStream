package Q6;

/* JADX INFO: renamed from: Q6.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0800i extends Q6.AbstractC0810t implements N6.InterfaceC0696j {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final boolean f8630K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0800i(N6.InterfaceC0691e interfaceC0691e, N6.InterfaceC0696j interfaceC0696j, O6.h hVar, boolean z6, int i3, N6.P p2) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    public static /* synthetic */ void i0(int i3) {
        java.lang.String str;
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
        java.lang.Object[] objArr = new java.lang.Object[i9];
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
                objArr[0] = io.sentry.protocol.ViewHierarchyNode.JsonKeys.VISIBILITY;
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
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 21 && i3 != 27) {
            switch (i3) {
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    throw new java.lang.IllegalArgumentException(str2);
            }
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // Q6.AbstractC0810t, N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return interfaceC0699m.h(this, obj);
    }

    @Override // Q6.AbstractC0810t, N6.InterfaceC0689c
    public final N6.InterfaceC0689c K(N6.InterfaceC0691e interfaceC0691e, N6.EnumC0711z enumC0711z, N6.C0701o c0701o) {
        return (Q6.C0800i) G0(interfaceC0691e, enumC0711z, c0701o);
    }

    @Override // Q6.AbstractC0810t
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public Q6.C0800i I0(int i3, N6.InterfaceC0697k interfaceC0697k, N6.InterfaceC0706u interfaceC0706u, N6.P p2, O6.h hVar, p101l7.e eVar) {
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
            return new Q6.C0800i((N6.InterfaceC0691e) interfaceC0697k, this, hVar, this.f8630K, 1, p2);
        }
        throw new java.lang.IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC0697k + "\nkind: " + B2.a.A(i3));
    }

    @Override // Q6.AbstractC0805n, N6.InterfaceC0697k
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public final N6.InterfaceC0691e h() {
        N6.InterfaceC0691e interfaceC0691e = (N6.InterfaceC0691e) super.h();
        if (interfaceC0691e != null) {
            return interfaceC0691e;
        }
        i0(17);
        throw null;
    }

    @Override // Q6.AbstractC0810t, Q6.AbstractC0805n, Q6.AbstractC0804m, N6.InterfaceC0697k
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Q6.C0800i a() {
        Q6.C0800i c0800i = (Q6.C0800i) super.a();
        if (c0800i != null) {
            return c0800i;
        }
        i0(19);
        throw null;
    }

    public final void U0(java.util.List list, N6.C0701o c0701o) {
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

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final void V0(java.util.List list, N6.C0701o c0701o, java.util.List list2) {
        Q6.u uVarR0;
        java.util.List listO0;
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
        N6.InterfaceC0691e interfaceC0691eH = h();
        if (interfaceC0691eH.D()) {
            N6.InterfaceC0697k interfaceC0697kH = interfaceC0691eH.h();
            if (interfaceC0697kH instanceof N6.InterfaceC0691e) {
                uVarR0 = ((N6.InterfaceC0691e) interfaceC0697kH).r0();
            } else {
                uVarR0 = null;
            }
        } else {
            uVarR0 = null;
        }
        N6.InterfaceC0691e interfaceC0691eH2 = h();
        if (interfaceC0691eH2.o0().isEmpty()) {
            listO0 = java.util.Collections.EMPTY_LIST;
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
        L0(null, uVarR0, listO0, list2, list, null, N6.EnumC0711z.f7427i, c0701o);
    }

    @Override // Q6.AbstractC0810t, N6.InterfaceC0706u, N6.S
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public final Q6.C0800i b(C7.V v6) {
        if (v6 != null) {
            return (Q6.C0800i) super.b(v6);
        }
        i0(20);
        throw null;
    }

    @Override // Q6.AbstractC0810t, N6.InterfaceC0689c
    public final void f0(java.util.Collection collection) {
        if (collection != null) {
            return;
        }
        i0(22);
        throw null;
    }

    @Override // Q6.AbstractC0810t, N6.InterfaceC0689c, N6.InterfaceC0688b
    public final java.util.Collection i() {
        java.util.Set set = java.util.Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        i0(21);
        throw null;
    }

    @Override // N6.InterfaceC0696j
    public final boolean t() {
        return this.f8630K;
    }

    @Override // N6.InterfaceC0696j
    public final N6.InterfaceC0691e u() {
        N6.InterfaceC0691e interfaceC0691eH = h();
        if (interfaceC0691eH != null) {
            return interfaceC0691eH;
        }
        i0(18);
        throw null;
    }
}
