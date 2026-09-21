package T6;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends T6.s implements p027c7.b, p027c7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f9865a;

    public o(java.lang.Class klass) {
        kotlin.jvm.internal.m.e(klass, "klass");
        this.f9865a = klass;
    }

    @Override // p027c7.b
    public final T6.C0927e a(p101l7.c fqName) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        kotlin.jvm.internal.m.e(fqName, "fqName");
        java.lang.Class cls = this.f9865a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C2.a.u(declaredAnnotations, fqName);
    }

    public final java.util.List b() {
        java.lang.reflect.Field[] declaredFields = this.f9865a.getDeclaredFields();
        kotlin.jvm.internal.m.d(declaredFields, "getDeclaredFields(...)");
        return N7.o.s0(N7.o.p0(new N7.i(p078i6.m.T(declaredFields), false, T6.l.f9862h), T6.m.f9863h));
    }

    public final p101l7.c c() {
        return T6.AbstractC0926d.a(this.f9865a).a();
    }

    public final java.util.List d() {
        java.lang.reflect.Method[] declaredMethods = this.f9865a.getDeclaredMethods();
        kotlin.jvm.internal.m.d(declaredMethods, "getDeclaredMethods(...)");
        return N7.o.s0(N7.o.p0(N7.o.k0(p078i6.m.T(declaredMethods), new C7.C0173e(9, this)), T6.n.f9864h));
    }

    public final p101l7.e e() {
        java.lang.Class cls = this.f9865a;
        if (!cls.isAnonymousClass()) {
            return p101l7.e.e(cls.getSimpleName());
        }
        java.lang.String name = cls.getName();
        int iP0 = O7.q.P0(0, 6, name, ".");
        if (iP0 != -1) {
            name = name.substring(1 + iP0, name.length());
            kotlin.jvm.internal.m.d(name, "substring(...)");
        }
        return p101l7.e.e(name);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof T6.o) {
            return kotlin.jvm.internal.m.a(this.f9865a, ((T6.o) obj).f9865a);
        }
        return false;
    }

    public final java.util.ArrayList f() {
        java.lang.Class clazz = this.f9865a;
        kotlin.jvm.internal.m.e(clazz, "clazz");
        A7.m mVar = O7.r.f8066e;
        java.lang.Object[] objArr = null;
        if (mVar == null) {
            try {
                mVar = new A7.m(java.lang.Class.class.getMethod("isSealed", null), java.lang.Class.class.getMethod("getPermittedSubclasses", null), java.lang.Class.class.getMethod("isRecord", null), java.lang.Class.class.getMethod("getRecordComponents", null), 7);
            } catch (java.lang.NoSuchMethodException unused) {
                mVar = new A7.m(objArr, objArr, objArr, objArr, 7);
            }
            O7.r.f8066e = mVar;
        }
        java.lang.reflect.Method method = (java.lang.reflect.Method) mVar.f323l;
        objArr = method != null ? (java.lang.Object[]) method.invoke(clazz, null) : null;
        if (objArr == null) {
            objArr = new java.lang.Object[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            arrayList.add(new T6.A(obj));
        }
        return arrayList;
    }

    public final boolean g() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Class clazz = this.f9865a;
        kotlin.jvm.internal.m.e(clazz, "clazz");
        A7.m mVar = O7.r.f8066e;
        java.lang.Boolean bool = null;
        if (mVar == null) {
            try {
                mVar = new A7.m(java.lang.Class.class.getMethod("isSealed", null), java.lang.Class.class.getMethod("getPermittedSubclasses", null), java.lang.Class.class.getMethod("isRecord", null), java.lang.Class.class.getMethod("getRecordComponents", null), 7);
            } catch (java.lang.NoSuchMethodException unused) {
                mVar = new A7.m(bool, bool, bool, bool, 7);
            }
            O7.r.f8066e = mVar;
        }
        java.lang.reflect.Method method = (java.lang.reflect.Method) mVar.f322k;
        if (method != null) {
            java.lang.Object objInvoke = method.invoke(clazz, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (java.lang.Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // p027c7.b
    public final java.util.Collection getAnnotations() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.lang.Class cls = this.f9865a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? p078i6.w.f23205h : C2.a.v(declaredAnnotations);
    }

    @Override // p027c7.e
    public final java.util.ArrayList getTypeParameters() {
        java.lang.reflect.TypeVariable[] typeParameters = this.f9865a.getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable typeVariable : typeParameters) {
            arrayList.add(new T6.C(typeVariable));
        }
        return arrayList;
    }

    public final boolean h() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Class clazz = this.f9865a;
        kotlin.jvm.internal.m.e(clazz, "clazz");
        A7.m mVar = O7.r.f8066e;
        java.lang.Boolean bool = null;
        if (mVar == null) {
            try {
                mVar = new A7.m(java.lang.Class.class.getMethod("isSealed", null), java.lang.Class.class.getMethod("getPermittedSubclasses", null), java.lang.Class.class.getMethod("isRecord", null), java.lang.Class.class.getMethod("getRecordComponents", null), 7);
            } catch (java.lang.NoSuchMethodException unused) {
                mVar = new A7.m(bool, bool, bool, bool, 7);
            }
            O7.r.f8066e = mVar;
        }
        java.lang.reflect.Method method = (java.lang.reflect.Method) mVar.f321i;
        if (method != null) {
            java.lang.Object objInvoke = method.invoke(clazz, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
            bool = (java.lang.Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return this.f9865a.hashCode();
    }

    public final java.lang.String toString() {
        return T6.o.class.getName() + ": " + this.f9865a;
    }
}
