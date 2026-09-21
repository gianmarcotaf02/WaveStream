package p133p6;

import java.lang.reflect.Method;
import kotlin.jvm.internal.m;

public abstract class a {

    public static final Method f26247a;

    public static final Method f26248b;

    static {
        Method method;
        Method method2;
        Method[] methods = Throwable.class.getMethods();
        m.b(methods);
        int length = methods.length;
        int i3 = 0;
        while (true) {
            method = null;
            if (i3 >= length) {
                method2 = null;
                break;
            }
            method2 = methods[i3];
            if (m.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                m.d(parameterTypes, "getParameterTypes(...)");
                if (m.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    break;
                }
            }
            i3++;
        }
        f26247a = method2;
        for (Method method3 : methods) {
            if (m.a(method3.getName(), "getSuppressed")) {
                method = method3;
                break;
            }
        }
        f26248b = method;
    }
}
