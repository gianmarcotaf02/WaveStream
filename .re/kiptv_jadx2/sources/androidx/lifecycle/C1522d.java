package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public final class C1522d {

    public static final C1522d f16344c = new C1522d();

    public final HashMap f16345a = new HashMap();

    public final HashMap f16346b = new HashMap();

    public static void b(HashMap map, C1521c c1521c, EnumC1532n enumC1532n, Class cls) {
        EnumC1532n enumC1532n2 = (EnumC1532n) map.get(c1521c);
        if (enumC1532n2 == null || enumC1532n == enumC1532n2) {
            if (enumC1532n2 == null) {
                map.put(c1521c, enumC1532n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c1521c.f16341b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1532n2 + ", new value " + enumC1532n);
    }

    public final C1520b a(Class cls, Method[] methodArr) {
        int i3;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f16345a;
        if (superclass != null) {
            C1520b c1520bA = (C1520b) map2.get(superclass);
            if (c1520bA == null) {
                c1520bA = a(superclass, null);
            }
            map.putAll(c1520bA.f16337b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C1520b c1520bA2 = (C1520b) map2.get(cls2);
            if (c1520bA2 == null) {
                c1520bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c1520bA2.f16337b.entrySet()) {
                b(map, (C1521c) entry.getKey(), (EnumC1532n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            I i9 = (I) method.getAnnotation(I.class);
            if (i9 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!InterfaceC1540w.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                EnumC1532n enumC1532nValue = i9.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC1532n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC1532nValue != EnumC1532n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C1521c(i3, method), enumC1532nValue, cls);
                z6 = true;
            }
        }
        C1520b c1520b = new C1520b(map);
        map2.put(cls, c1520b);
        this.f16346b.put(cls, Boolean.valueOf(z6));
        return c1520b;
    }
}
