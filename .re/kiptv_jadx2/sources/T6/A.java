package T6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public final class A extends w {

    public final Object f9834a;

    public A(Object recordComponent) {
        kotlin.jvm.internal.m.e(recordComponent, "recordComponent");
        this.f9834a = recordComponent;
    }

    @Override
    public final Member b() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f9834a;
        kotlin.jvm.internal.m.e(recordComponent, "recordComponent");
        C0923a c0923a = p199y3.e.f31823d;
        Method method = null;
        if (c0923a == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                c0923a = new C0923a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c0923a = new C0923a(null, null);
            }
            p199y3.e.f31823d = c0923a;
        }
        Method method2 = c0923a.f9842b;
        if (method2 != null) {
            Object objInvoke = method2.invoke(recordComponent, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final p027c7.d f() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f9834a;
        kotlin.jvm.internal.m.e(recordComponent, "recordComponent");
        C0923a c0923a = p199y3.e.f31823d;
        Class cls = null;
        if (c0923a == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                c0923a = new C0923a(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c0923a = new C0923a(null, null);
            }
            p199y3.e.f31823d = c0923a;
        }
        Method method = c0923a.f9841a;
        if (method != null) {
            Object objInvoke = method.invoke(recordComponent, null);
            kotlin.jvm.internal.m.c(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new q(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
