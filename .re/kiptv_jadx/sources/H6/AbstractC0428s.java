package H6;

/* JADX INFO: renamed from: H6.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0428s implements E6.InterfaceC0330c, H6.s0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final H6.v0 f4491h = p000a.a.A(null, new H6.C0427q(this, 0));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H6.v0 f4492i = p000a.a.A(null, new H6.C0427q(this, 1));
    public final H6.v0 j = p000a.a.A(null, new H6.C0427q(this, 2));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H6.v0 f4493k = p000a.a.A(null, new H6.C0427q(this, 3));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final H6.v0 f4494l = p000a.a.A(null, new H6.C0427q(this, 4));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.Object f4495m = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new H6.C0427q(this, 5));

    public static java.lang.Object j(H6.q0 q0Var) {
        java.lang.Class clsX = com.google.android.gms.internal.play_billing.AbstractC1833d1.x(O7.r.D(q0Var));
        if (clsX.isArray()) {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(clsX.getComponentType(), 0);
            kotlin.jvm.internal.m.d(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new H6.t0("Cannot instantiate the default empty array of type " + clsX.getSimpleName() + ", because it is not an array type");
    }

    @Override // E6.InterfaceC0330c
    public final java.lang.Object call(java.lang.Object... args) throws F6.a {
        kotlin.jvm.internal.m.e(args, "args");
        try {
            return k().call(args);
        } catch (java.lang.IllegalAccessException e6) {
            throw new F6.a(e6);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [h6.h, java.lang.Object] */
    @Override // E6.InterfaceC0330c
    public final java.lang.Object callBy(java.util.Map args) throws F6.a {
        boolean z6;
        java.lang.Object objJ;
        kotlin.jvm.internal.m.e(args, "args");
        boolean z9 = false;
        if (p()) {
            java.util.List<E6.o> parameters = getParameters();
            java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(parameters, 10));
            for (E6.o oVar : parameters) {
                if (args.containsKey(oVar)) {
                    objJ = args.get(oVar);
                    if (objJ == null) {
                        throw new java.lang.IllegalArgumentException("Annotation argument value cannot be null (" + oVar + ')');
                    }
                } else {
                    H6.Y y = (H6.Y) oVar;
                    if (y.j()) {
                        objJ = null;
                    } else {
                        if (!y.k()) {
                            throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: " + y);
                        }
                        objJ = j(y.e());
                    }
                }
                arrayList.add(objJ);
            }
            I6.g gVarM = m();
            if (gVarM != null) {
                try {
                    return gVarM.call(arrayList.toArray(new java.lang.Object[0]));
                } catch (java.lang.IllegalAccessException e6) {
                    throw new F6.a(e6);
                }
            }
            throw new H6.t0("This callable does not support a default call: " + n());
        }
        java.util.List<E6.o> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return k().call(isSuspend() ? new p100l6.c[]{null} : new p100l6.c[0]);
            } catch (java.lang.IllegalAccessException e9) {
                throw new F6.a(e9);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        java.lang.Object[] objArr = (java.lang.Object[]) ((java.lang.Object[]) this.f4494l.invoke()).clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((java.lang.Boolean) this.f4495m.getValue()).booleanValue();
        int i3 = 0;
        for (E6.o oVar2 : parameters2) {
            int iO = zBooleanValue ? o(oVar2) : 1;
            if (args.containsKey(oVar2)) {
                objArr[((H6.Y) oVar2).f4404i] = args.get(oVar2);
            } else {
                H6.Y y9 = (H6.Y) oVar2;
                if (y9.j()) {
                    if (zBooleanValue) {
                        int i9 = i3 + iO;
                        for (int i10 = i3; i10 < i9; i10++) {
                            int i11 = (i10 / 32) + size;
                            java.lang.Object obj = objArr[i11];
                            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlin.Int");
                            objArr[i11] = java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() | (1 << (i10 % 32)));
                        }
                        z6 = true;
                    } else {
                        z6 = true;
                        int i12 = (i3 / 32) + size;
                        java.lang.Object obj2 = objArr[i12];
                        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i12] = java.lang.Integer.valueOf(((java.lang.Integer) obj2).intValue() | (1 << (i3 % 32)));
                    }
                    z9 = z6;
                } else if (!y9.k()) {
                    throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: " + y9);
                }
            }
            if (((H6.Y) oVar2).j == E6.n.j) {
                i3 += iO;
            }
        }
        if (!z9) {
            try {
                I6.g gVarK = k();
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, size);
                kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                return gVarK.call(objArrCopyOf);
            } catch (java.lang.IllegalAccessException e10) {
                throw new F6.a(e10);
            }
        }
        I6.g gVarM2 = m();
        if (gVarM2 != null) {
            try {
                return gVarM2.call(objArr);
            } catch (java.lang.IllegalAccessException e11) {
                throw new F6.a(e11);
            }
        }
        throw new H6.t0("This callable does not support a default call: " + n());
    }

    @Override // E6.InterfaceC0329b
    public final java.util.List getAnnotations() {
        java.lang.Object objInvoke = this.f4491h.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        return (java.util.List) objInvoke;
    }

    @Override // E6.InterfaceC0330c
    public final java.util.List getParameters() {
        java.lang.Object objInvoke = this.f4492i.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        return (java.util.List) objInvoke;
    }

    @Override // E6.InterfaceC0330c
    public final E6.v getReturnType() {
        java.lang.Object objInvoke = this.j.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        return (E6.v) objInvoke;
    }

    @Override // E6.InterfaceC0330c
    public final java.util.List getTypeParameters() {
        java.lang.Object objInvoke = this.f4493k.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        return (java.util.List) objInvoke;
    }

    @Override // E6.InterfaceC0330c
    public final E6.A getVisibility() {
        N6.C0701o visibility = n().getVisibility();
        kotlin.jvm.internal.m.d(visibility, "getVisibility(...)");
        p101l7.c cVar = H6.B0.f4363a;
        if (visibility.equals(N6.AbstractC0702p.f7406e)) {
            return E6.A.f3190h;
        }
        if (visibility.equals(N6.AbstractC0702p.f7404c)) {
            return E6.A.f3191i;
        }
        if (visibility.equals(N6.AbstractC0702p.f7405d)) {
            return E6.A.j;
        }
        if (visibility.equals(N6.AbstractC0702p.f7402a) || visibility.equals(N6.AbstractC0702p.f7403b)) {
            return E6.A.f3192k;
        }
        return null;
    }

    @Override // E6.InterfaceC0330c
    public final boolean isAbstract() {
        return n().e() == N6.EnumC0711z.f7429l;
    }

    @Override // E6.InterfaceC0330c
    public final boolean isFinal() {
        return n().e() == N6.EnumC0711z.f7427i;
    }

    @Override // E6.InterfaceC0330c
    public final boolean isOpen() {
        return n().e() == N6.EnumC0711z.f7428k;
    }

    public abstract I6.g k();

    public abstract H6.G l();

    public abstract I6.g m();

    public abstract N6.InterfaceC0689c n();

    /* JADX WARN: Type inference failed for: r0v0, types: [h6.h, java.lang.Object] */
    public final int o(E6.o oVar) throws java.lang.NoSuchMethodException {
        if (!((java.lang.Boolean) this.f4495m.getValue()).booleanValue()) {
            throw new java.lang.IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        H6.Y y = (H6.Y) oVar;
        if (!H6.B0.h(y.e())) {
            return 1;
        }
        java.util.ArrayList arrayListD = C2.a.D(C7.AbstractC0171c.b(y.e().f4483h));
        kotlin.jvm.internal.m.b(arrayListD);
        return arrayListD.size();
    }

    public final boolean p() {
        return kotlin.jvm.internal.m.a(getName(), "<init>") && l().b().isAnnotation();
    }

    public abstract boolean q();
}
