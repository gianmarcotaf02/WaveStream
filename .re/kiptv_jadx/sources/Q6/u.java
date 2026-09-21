package Q6;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends Q6.AbstractC0804m implements N6.L {
    public final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final N6.InterfaceC0697k f8698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p187w7.d f8699l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(N6.InterfaceC0691e interfaceC0691e) {
        super(O6.g.f7987a, p101l7.g.f24843d);
        if (interfaceC0691e == null) {
            i0(0);
            throw null;
        }
        this.f8698k = interfaceC0691e;
        this.f8699l = new p187w7.c(interfaceC0691e);
    }

    public static /* synthetic */ void F0(int i3) {
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
            case 11:
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
            case 11:
                i9 = 2;
                break;
            default:
                i9 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i9];
        switch (i3) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i3) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i3) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new java.lang.IllegalStateException(str2);
            default:
                throw new java.lang.IllegalArgumentException(str2);
        }
    }

    public static /* synthetic */ void i0(int i3) {
        java.lang.String str = (i3 == 1 || i3 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 1 || i3 == 2) ? 2 : 3];
        if (i3 == 1 || i3 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i3 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i3 == 1) {
            objArr[1] = "getValue";
        } else if (i3 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i3 != 1 && i3 != 2) {
            if (i3 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 1 && i3 != 2) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static /* synthetic */ void n0(int i3) {
        java.lang.String str = (i3 == 7 || i3 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 7 || i3 == 8) ? 2 : 3];
        switch (i3) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i3 == 7) {
            objArr[1] = "getValue";
        } else if (i3 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i3) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 7 && i3 != 8) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return interfaceC0699m.z(this, obj);
    }

    public final p187w7.d G0() {
        switch (this.j) {
            case 0:
                p187w7.c cVar = (p187w7.c) this.f8699l;
                if (cVar != null) {
                    return cVar;
                }
                i0(1);
                throw null;
            default:
                D1.AbstractC0220e0 abstractC0220e0 = (D1.AbstractC0220e0) this.f8699l;
                if (abstractC0220e0 != null) {
                    return abstractC0220e0;
                }
                n0(7);
                throw null;
        }
    }

    @Override // N6.S
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public final Q6.u b(C7.V v6) {
        if (v6 == null) {
            F0(3);
            throw null;
        }
        if (!v6.f1567a.e()) {
            C7.AbstractC0191x abstractC0191xI = h() instanceof N6.InterfaceC0691e ? v6.i(getType(), C7.b0.f1577l) : v6.i(getType(), C7.b0.j);
            if (abstractC0191xI == null) {
                return null;
            }
            if (abstractC0191xI != getType()) {
                return new Q6.u(h(), new p187w7.e(abstractC0191xI), getAnnotations());
            }
        }
        return this;
    }

    @Override // N6.InterfaceC0688b
    public final java.util.List O() {
        java.util.List list = java.util.Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        F0(7);
        throw null;
    }

    @Override // N6.InterfaceC0688b
    public final Q6.u S() {
        return null;
    }

    @Override // N6.InterfaceC0688b
    public final Q6.u V() {
        return null;
    }

    @Override // Q6.AbstractC0804m, N6.InterfaceC0697k
    public final N6.InterfaceC0688b a() {
        return this;
    }

    @Override // N6.InterfaceC0698l
    public final N6.P d() {
        return N6.P.f7377b;
    }

    @Override // N6.InterfaceC0688b
    public final C7.AbstractC0191x getReturnType() {
        return getType();
    }

    @Override // D1.AbstractC0220e0, p187w7.d
    public final C7.AbstractC0191x getType() {
        C7.AbstractC0191x type = G0().getType();
        if (type != null) {
            return type;
        }
        F0(6);
        throw null;
    }

    @Override // N6.InterfaceC0688b
    public final java.util.List getTypeParameters() {
        java.util.List list = java.util.Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        F0(5);
        throw null;
    }

    @Override // N6.InterfaceC0700n
    public final N6.C0701o getVisibility() {
        N6.C0701o c0701o = N6.AbstractC0702p.f7407f;
        if (c0701o != null) {
            return c0701o;
        }
        F0(9);
        throw null;
    }

    @Override // N6.InterfaceC0697k
    public final N6.InterfaceC0697k h() {
        switch (this.j) {
            case 0:
                N6.InterfaceC0691e interfaceC0691e = (N6.InterfaceC0691e) this.f8698k;
                if (interfaceC0691e != null) {
                    return interfaceC0691e;
                }
                i0(2);
                throw null;
            default:
                N6.InterfaceC0697k interfaceC0697k = this.f8698k;
                if (interfaceC0697k != null) {
                    return interfaceC0697k;
                }
                n0(8);
                throw null;
        }
    }

    @Override // N6.InterfaceC0688b
    public final java.util.Collection i() {
        java.util.Set set = java.util.Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        F0(8);
        throw null;
    }

    @Override // Q6.AbstractC0804m
    public java.lang.String toString() {
        switch (this.j) {
            case 0:
                return "class " + ((N6.InterfaceC0691e) this.f8698k).getName() + "::this";
            default:
                return super.toString();
        }
    }

    @Override // N6.InterfaceC0688b
    public final boolean y() {
        return false;
    }

    @Override // Q6.AbstractC0804m, N6.InterfaceC0697k
    public final N6.InterfaceC0697k a() {
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(N6.InterfaceC0697k interfaceC0697k, D1.AbstractC0220e0 abstractC0220e0, O6.h hVar) {
        this(interfaceC0697k, abstractC0220e0, hVar, p101l7.g.f24843d);
        if (interfaceC0697k == null) {
            n0(0);
            throw null;
        }
        if (hVar != null) {
        } else {
            n0(2);
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(N6.InterfaceC0697k interfaceC0697k, D1.AbstractC0220e0 abstractC0220e0, O6.h hVar, p101l7.e eVar) {
        super(hVar, eVar);
        if (interfaceC0697k == null) {
            n0(3);
            throw null;
        }
        if (hVar == null) {
            n0(5);
            throw null;
        }
        if (eVar != null) {
            this.f8698k = interfaceC0697k;
            this.f8699l = abstractC0220e0;
            return;
        }
        n0(6);
        throw null;
    }
}
