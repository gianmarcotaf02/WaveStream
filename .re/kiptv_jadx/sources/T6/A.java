package T6;

/* JADX INFO: loaded from: classes4.dex */
public final class A extends T6.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f9834a;

    public A(java.lang.Object recordComponent) {
        kotlin.jvm.internal.m.e(recordComponent, "recordComponent");
        this.f9834a = recordComponent;
    }

    @Override // T6.w
    public final java.lang.reflect.Member b() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Object recordComponent = this.f9834a;
        kotlin.jvm.internal.m.e(recordComponent, "recordComponent");
        T6.C0923a c0923a = p199y3.e.f31823d;
        java.lang.reflect.Method method = null;
        if (c0923a == null) {
            java.lang.Class<?> cls = recordComponent.getClass();
            try {
                c0923a = new T6.C0923a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (java.lang.NoSuchMethodException unused) {
                c0923a = new T6.C0923a(null, null);
            }
            p199y3.e.f31823d = c0923a;
        }
        java.lang.reflect.Method method2 = c0923a.f9842b;
        if (method2 != null) {
            java.lang.Object objInvoke = method2.invoke(recordComponent, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (java.lang.reflect.Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new java.lang.NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final p027c7.d f() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Object recordComponent = this.f9834a;
        kotlin.jvm.internal.m.e(recordComponent, "recordComponent");
        T6.C0923a c0923a = p199y3.e.f31823d;
        java.lang.Class cls = null;
        if (c0923a == null) {
            java.lang.Class<?> cls2 = recordComponent.getClass();
            try {
                c0923a = new T6.C0923a(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (java.lang.NoSuchMethodException unused) {
                c0923a = new T6.C0923a(null, null);
            }
            p199y3.e.f31823d = c0923a;
        }
        java.lang.reflect.Method method = c0923a.f9841a;
        if (method != null) {
            java.lang.Object objInvoke = method.invoke(recordComponent, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (java.lang.Class) objInvoke;
        }
        if (cls != null) {
            return new T6.q(cls);
        }
        throw new java.lang.NoSuchMethodError("Can't find `getType` method");
    }
}
