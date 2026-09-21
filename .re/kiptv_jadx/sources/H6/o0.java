package H6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 extends H6.AbstractC0428s implements E6.u {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final java.lang.Object f4469t = new java.lang.Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final H6.G f4470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.String f4471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.String f4472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.Object f4473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.Object f4474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final H6.v0 f4475s;

    public o0(H6.G g, java.lang.String str, java.lang.String str2, Q6.I i3, java.lang.Object obj) {
        this.f4470n = g;
        this.f4471o = str;
        this.f4472p = str2;
        this.f4473q = obj;
        this.f4474r = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new H6.i0(this, 0));
        this.f4475s = p000a.a.A(i3, new H6.i0(this, 1));
    }

    public final boolean equals(java.lang.Object obj) {
        H6.o0 o0VarC = H6.B0.c(obj);
        return o0VarC != null && kotlin.jvm.internal.m.a(this.f4470n, o0VarC.f4470n) && kotlin.jvm.internal.m.a(this.f4471o, o0VarC.f4471o) && kotlin.jvm.internal.m.a(this.f4472p, o0VarC.f4472p) && kotlin.jvm.internal.m.a(this.f4473q, o0VarC.f4473q);
    }

    @Override // E6.InterfaceC0330c
    public final java.lang.String getName() {
        return this.f4471o;
    }

    public final int hashCode() {
        return this.f4472p.hashCode() + B2.a.a(this.f4470n.hashCode() * 31, 31, this.f4471o);
    }

    @Override // E6.u
    public final boolean isConst() {
        return n().isConst();
    }

    @Override // E6.u
    public final boolean isLateinit() {
        return n().b0();
    }

    @Override // E6.InterfaceC0330c
    public final boolean isSuspend() {
        return false;
    }

    @Override // H6.AbstractC0428s
    public final I6.g k() {
        return u().k();
    }

    @Override // H6.AbstractC0428s
    public final H6.G l() {
        return this.f4470n;
    }

    @Override // H6.AbstractC0428s
    public final I6.g m() {
        u().getClass();
        return null;
    }

    @Override // H6.AbstractC0428s
    public final boolean q() {
        return this.f4473q != kotlin.jvm.internal.AbstractC2538c.NO_RECEIVER;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h6.h, java.lang.Object] */
    public final java.lang.reflect.Member r() {
        if (!n().F()) {
            return null;
        }
        p101l7.b bVar = H6.z0.f4517a;
        P3.e eVarB = H6.z0.b(n());
        if (eVarB instanceof H6.C0425o) {
            H6.C0425o c0425o = (H6.C0425o) eVarB;
            j7.e eVar = c0425o.f4465p;
            if ((eVar.f24282i & 16) == 16) {
                j7.c cVar = eVar.f24286n;
                int i3 = cVar.f24270i;
                if ((i3 & 1) != 1 || (i3 & 2) != 2) {
                    return null;
                }
                int i9 = cVar.j;
                p079i7.e eVar2 = c0425o.f4466q;
                return this.f4470n.k(eVar2.n0(i9), eVar2.n0(cVar.f24271k));
            }
        }
        return (java.lang.reflect.Field) this.f4474r.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object s(java.lang.reflect.Member member, java.lang.Object obj) throws F6.a {
        java.lang.Object objE;
        try {
            java.lang.Object obj2 = f4469t;
            if (obj == obj2 && n().V() == null) {
                throw new java.lang.RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            if (q()) {
                objE = C2.a.h(this.f4473q, n());
            } else {
                objE = obj;
            }
            if (objE == obj2) {
                objE = null;
            }
            if (!q()) {
                obj = null;
            }
            if (obj == obj2) {
                obj = null;
            }
            java.lang.reflect.AccessibleObject accessibleObject = member instanceof java.lang.reflect.AccessibleObject ? (java.lang.reflect.AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(p199y3.e.z(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof java.lang.reflect.Field) {
                return ((java.lang.reflect.Field) member).get(objE);
            }
            if (!(member instanceof java.lang.reflect.Method)) {
                throw new java.lang.AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((java.lang.reflect.Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((java.lang.reflect.Method) member).invoke(null, null);
            }
            if (length == 1) {
                java.lang.reflect.Method method = (java.lang.reflect.Method) member;
                if (objE == null) {
                    java.lang.Class<?> cls = ((java.lang.reflect.Method) member).getParameterTypes()[0];
                    kotlin.jvm.internal.m.d(cls, "get(...)");
                    objE = H6.B0.e(cls);
                }
                return method.invoke(null, objE);
            }
            if (length != 2) {
                throw new java.lang.AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
            }
            java.lang.reflect.Method method2 = (java.lang.reflect.Method) member;
            if (obj == null) {
                java.lang.Class<?> cls2 = ((java.lang.reflect.Method) member).getParameterTypes()[1];
                kotlin.jvm.internal.m.d(cls2, "get(...)");
                obj = H6.B0.e(cls2);
            }
            return method2.invoke(null, objE, obj);
        } catch (java.lang.IllegalAccessException e6) {
            throw new F6.a("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e6);
        }
    }

    @Override // H6.AbstractC0428s
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final N6.N n() {
        java.lang.Object objInvoke = this.f4475s.invoke();
        kotlin.jvm.internal.m.d(objInvoke, "invoke(...)");
        return (N6.N) objInvoke;
    }

    public final java.lang.String toString() {
        p118n7.g gVar = H6.y0.f4516a;
        return H6.y0.c(n());
    }

    public abstract H6.l0 u();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(H6.G container, java.lang.String name, java.lang.String signature, java.lang.Object obj) {
        this(container, name, signature, null, obj);
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o0(H6.G container, Q6.I descriptor) {
        kotlin.jvm.internal.m.e(container, "container");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        java.lang.String strB = descriptor.getName().b();
        kotlin.jvm.internal.m.d(strB, "asString(...)");
        this(container, strB, H6.z0.b(descriptor).N(), descriptor, kotlin.jvm.internal.AbstractC2538c.NO_RECEIVER);
    }
}
