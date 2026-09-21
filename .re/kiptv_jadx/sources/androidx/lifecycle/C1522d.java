package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1522d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.lifecycle.C1522d f16344c = new androidx.lifecycle.C1522d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f16345a = new java.util.HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f16346b = new java.util.HashMap();

    public static void b(java.util.HashMap map, androidx.lifecycle.C1521c c1521c, androidx.lifecycle.EnumC1532n enumC1532n, java.lang.Class cls) {
        androidx.lifecycle.EnumC1532n enumC1532n2 = (androidx.lifecycle.EnumC1532n) map.get(c1521c);
        if (enumC1532n2 == null || enumC1532n == enumC1532n2) {
            if (enumC1532n2 == null) {
                map.put(c1521c, enumC1532n);
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Method " + c1521c.f16341b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1532n2 + ", new value " + enumC1532n);
    }

    public final androidx.lifecycle.C1520b a(java.lang.Class cls, java.lang.reflect.Method[] methodArr) {
        int i3;
        java.lang.Class superclass = cls.getSuperclass();
        java.util.HashMap map = new java.util.HashMap();
        java.util.HashMap map2 = this.f16345a;
        if (superclass != null) {
            androidx.lifecycle.C1520b c1520bA = (androidx.lifecycle.C1520b) map2.get(superclass);
            if (c1520bA == null) {
                c1520bA = a(superclass, null);
            }
            map.putAll(c1520bA.f16337b);
        }
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            androidx.lifecycle.C1520b c1520bA2 = (androidx.lifecycle.C1520b) map2.get(cls2);
            if (c1520bA2 == null) {
                c1520bA2 = a(cls2, null);
            }
            for (java.util.Map.Entry entry : c1520bA2.f16337b.entrySet()) {
                b(map, (androidx.lifecycle.C1521c) entry.getKey(), (androidx.lifecycle.EnumC1532n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (java.lang.NoClassDefFoundError e6) {
                throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z6 = false;
        for (java.lang.reflect.Method method : methodArr) {
            androidx.lifecycle.I i9 = (androidx.lifecycle.I) method.getAnnotation(androidx.lifecycle.I.class);
            if (i9 != null) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i3 = 0;
                } else {
                    if (!androidx.lifecycle.InterfaceC1540w.class.isAssignableFrom(parameterTypes[0])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i3 = 1;
                }
                androidx.lifecycle.EnumC1532n enumC1532nValue = i9.value();
                if (parameterTypes.length > 1) {
                    if (!androidx.lifecycle.EnumC1532n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC1532nValue != androidx.lifecycle.EnumC1532n.ON_ANY) {
                        throw new java.lang.IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i3 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new java.lang.IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new androidx.lifecycle.C1521c(i3, method), enumC1532nValue, cls);
                z6 = true;
            }
        }
        androidx.lifecycle.C1520b c1520b = new androidx.lifecycle.C1520b(map);
        map2.put(cls, c1520b);
        this.f16346b.put(cls, java.lang.Boolean.valueOf(z6));
        return c1520b;
    }
}
