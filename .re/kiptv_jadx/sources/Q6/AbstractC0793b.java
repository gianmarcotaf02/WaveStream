package Q6;

/* JADX INFO: renamed from: Q6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0793b extends Q6.y {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p101l7.e f8614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B7.i f8615i;
    public final B7.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B7.i f8616k;

    public AbstractC0793b(B7.m mVar, p101l7.e eVar) {
        if (mVar == null) {
            n0(0);
            throw null;
        }
        if (eVar == null) {
            n0(1);
            throw null;
        }
        this.f8614h = eVar;
        this.f8615i = new B7.i(mVar, new Q6.C0792a(this, 0));
        this.j = new B7.i(mVar, new Q6.C0792a(this, 1));
        this.f8616k = new B7.i(mVar, new Q6.C0792a(this, 2));
    }

    public static /* synthetic */ void n0(int i3) {
        java.lang.String str = (i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6 || i3 == 9 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 17 || i3 == 19 || i3 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 2 || i3 == 3 || i3 == 4 || i3 == 5 || i3 == 6 || i3 == 9 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 17 || i3 == 19 || i3 == 20) ? 2 : 3];
        switch (i3) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i3 == 2) {
            objArr[1] = "getName";
        } else if (i3 == 3) {
            objArr[1] = "getOriginal";
        } else if (i3 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i3 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i3 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i3 == 9 || i3 == 12 || i3 == 14 || i3 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i3 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i3 == 19) {
            objArr[1] = "substitute";
        } else if (i3 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i3) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5 && i3 != 6 && i3 != 9 && i3 != 12 && i3 != 14 && i3 != 16 && i3 != 17 && i3 != 19 && i3 != 20) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    @Override // N6.InterfaceC0697k
    public final java.lang.Object B(N6.InterfaceC0699m interfaceC0699m, java.lang.Object obj) {
        return interfaceC0699m.B(this, obj);
    }

    @Override // Q6.y, N6.InterfaceC0691e, N6.InterfaceC0697k
    public final N6.InterfaceC0694h a() {
        return this;
    }

    @Override // N6.InterfaceC0691e
    public p180v7.o g0() {
        p180v7.o oVar = (p180v7.o) this.j.invoke();
        if (oVar != null) {
            return oVar;
        }
        n0(4);
        throw null;
    }

    @Override // N6.InterfaceC0697k
    public final p101l7.e getName() {
        p101l7.e eVar = this.f8614h;
        if (eVar != null) {
            return eVar;
        }
        n0(2);
        throw null;
    }

    @Override // N6.InterfaceC0691e, N6.InterfaceC0694h
    public final C7.B j() {
        C7.B b9 = (C7.B) this.f8615i.invoke();
        if (b9 != null) {
            return b9;
        }
        n0(20);
        throw null;
    }

    @Override // N6.InterfaceC0691e
    public p180v7.o l0() {
        p161s7.d.i(p127o7.d.d(this));
        p180v7.o oVarI0 = i0(D7.f.f2474a);
        if (oVarI0 != null) {
            return oVarI0;
        }
        n0(17);
        throw null;
    }

    @Override // N6.InterfaceC0691e
    public java.util.List o0() {
        java.util.List list = java.util.Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        n0(6);
        throw null;
    }

    @Override // N6.S
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public N6.InterfaceC0691e b(C7.V v6) {
        if (v6 != null) {
            return v6.f1567a.e() ? this : new Q6.x(this, v6);
        }
        n0(18);
        throw null;
    }

    @Override // N6.InterfaceC0691e
    public final Q6.u r0() {
        Q6.u uVar = (Q6.u) this.f8616k.invoke();
        if (uVar != null) {
            return uVar;
        }
        n0(5);
        throw null;
    }

    @Override // N6.InterfaceC0691e
    public final p180v7.o s(C7.T t9) {
        p161s7.d.i(p127o7.d.d(this));
        p180v7.o oVarZ = z(t9, D7.f.f2474a);
        if (oVarZ != null) {
            return oVarZ;
        }
        n0(16);
        throw null;
    }

    @Override // Q6.y
    public p180v7.o z(C7.T t9, D7.f fVar) {
        if (!t9.e()) {
            return new p180v7.t(i0(fVar), new C7.V(t9));
        }
        p180v7.o oVarI0 = i0(fVar);
        if (oVarI0 != null) {
            return oVarI0;
        }
        n0(12);
        throw null;
    }

    @Override // Q6.y, N6.InterfaceC0697k
    public final N6.InterfaceC0697k a() {
        return this;
    }

    @Override // Q6.y, N6.InterfaceC0691e, N6.InterfaceC0697k
    public final N6.InterfaceC0691e a() {
        return this;
    }
}
