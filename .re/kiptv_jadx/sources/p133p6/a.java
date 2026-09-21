package p133p6;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Method f26247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Method f26248b;

    static {
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        java.lang.reflect.Method[] methods = java.lang.Throwable.class.getMethods();
        kotlin.jvm.internal.m.b(methods);
        int length = methods.length;
        int i3 = 0;
        while (true) {
            method = null;
            if (i3 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i3];
            if (kotlin.jvm.internal.m.a(method2.getName(), "addSuppressed")) {
                java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                kotlin.jvm.internal.m.d(parameterTypes, "getParameterTypes(...)");
                if (kotlin.jvm.internal.m.a(parameterTypes.length == 1 ? parameterTypes[0] : null, java.lang.Throwable.class)) {
                    break;
                }
            }
            i3++;
        }
        f26247a = method2;
        for (java.lang.reflect.Method method3 : methods) {
            if (kotlin.jvm.internal.m.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        f26248b = method;
    }
}
