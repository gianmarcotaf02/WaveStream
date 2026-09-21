package P8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f8182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final R8.d f8183b = new R8.d(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final R8.d f8184c = new R8.d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f8185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile R8.d f8186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f8187f;

    static {
        java.lang.String property;
        try {
            property = java.lang.System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (java.lang.SecurityException unused) {
            property = null;
        }
        f8185d = property == null ? false : property.equalsIgnoreCase("true");
        f8187f = new java.lang.String[]{"2.0"};
    }

    public static java.util.ArrayList a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        final java.lang.ClassLoader classLoader = P8.d.class.getClassLoader();
        java.lang.String property = java.lang.System.getProperty("slf4j.provider");
        R8.d dVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                java.lang.String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i3 = R8.e.f9084a;
                if (Z.AbstractC1149h0.c(2) >= Z.AbstractC1149h0.c(R8.e.f9085b)) {
                    R8.e.c().println("SLF4J(I): " + str);
                }
                dVar = (R8.d) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (java.lang.ClassCastException e6) {
                R8.e.b("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e6);
            } catch (java.lang.ClassNotFoundException e9) {
                e = e9;
                R8.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (java.lang.IllegalAccessException e10) {
                e = e10;
                R8.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (java.lang.InstantiationException e11) {
                e = e11;
                R8.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (java.lang.NoSuchMethodException e12) {
                e = e12;
                R8.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (java.lang.reflect.InvocationTargetException e13) {
                e = e13;
                R8.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (dVar != null) {
            arrayList.add(dVar);
            return arrayList;
        }
        java.util.Iterator it = (java.lang.System.getSecurityManager() == null ? java.util.ServiceLoader.load(R8.d.class, classLoader) : (java.util.ServiceLoader) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction() { // from class: P8.c
            @Override // java.security.PrivilegedAction
            public final java.lang.Object run() {
                return java.util.ServiceLoader.load(R8.d.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((R8.d) it.next());
            } catch (java.util.ServiceConfigurationError e14) {
                R8.e.a("A service provider failed to instantiate:\n" + e14.getMessage());
            }
        }
        return arrayList;
    }

    public static R8.d b() {
        if (f8182a == 0) {
            synchronized (P8.d.class) {
                try {
                    if (f8182a == 0) {
                        f8182a = 1;
                        c();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        int i3 = f8182a;
        if (i3 == 1) {
            return f8183b;
        }
        if (i3 == 2) {
            throw new java.lang.IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i3 == 3) {
            return f8186e;
        }
        if (i3 == 4) {
            return f8184c;
        }
        throw new java.lang.IllegalStateException("Unreachable code");
    }

    public static final void c() {
        try {
            java.util.ArrayList arrayListA = a();
            g(arrayListA);
            if (arrayListA.isEmpty()) {
                f8182a = 4;
                R8.e.d("No SLF4J providers were found.");
                R8.e.d("Defaulting to no-operation (NOP) logger implementation");
                R8.e.d("See https://www.slf4j.org/codes.html#noProviders for further details.");
                java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                try {
                    java.lang.ClassLoader classLoader = P8.d.class.getClassLoader();
                    java.util.Enumeration<java.net.URL> systemResources = classLoader == null ? java.lang.ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (java.io.IOException e6) {
                    R8.e.b("Error getting resources from path", e6);
                }
                f(linkedHashSet);
            } else {
                f8186e = (R8.d) arrayListA.get(0);
                f8186e.getClass();
                f8182a = 3;
                e(arrayListA);
            }
            d();
            if (f8182a == 3) {
                try {
                    switch (f8186e.f9081a) {
                        case 0:
                            boolean z6 = false;
                            for (java.lang.String str : f8187f) {
                                if ("2.0.99".startsWith(str)) {
                                    z6 = true;
                                }
                            }
                            if (z6) {
                                return;
                            }
                            R8.e.d("The requested version 2.0.99 by your slf4j provider is not compatible with " + java.util.Arrays.asList(f8187f).toString());
                            R8.e.d("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new java.lang.UnsupportedOperationException();
                    }
                } catch (java.lang.Throwable th) {
                    R8.e.b("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (java.lang.Exception e9) {
            f8182a = 2;
            R8.e.b("Failed to instantiate SLF4J LoggerFactory", e9);
            throw new java.lang.IllegalStateException("Unexpected initialization failure", e9);
        }
    }

    public static void d() {
        R8.d dVar = f8183b;
        synchronized (dVar) {
            try {
                ((R8.g) dVar.f9082b).f9092a = true;
                R8.g gVar = (R8.g) dVar.f9082b;
                gVar.getClass();
                for (R8.f fVar : new java.util.ArrayList(gVar.f9093b.values())) {
                    fVar.f9087i = b().a().a(fVar.f9086h);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = ((R8.g) f8183b.f9082b).f9094c;
        int size = linkedBlockingQueue.size();
        java.util.ArrayList<Q8.b> arrayList = new java.util.ArrayList(128);
        int i3 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (Q8.b bVar : arrayList) {
                if (bVar != null) {
                    R8.f fVar2 = bVar.f8718b;
                    java.lang.String str = fVar2.f9086h;
                    if (fVar2.f9087i == null) {
                        throw new java.lang.IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(fVar2.f9087i instanceof R8.b)) {
                        if (!fVar2.l()) {
                            R8.e.d(str);
                        } else if (fVar2.j(bVar.f8717a) && fVar2.l()) {
                            try {
                                fVar2.f9088k.invoke(fVar2.f9087i, bVar);
                            } catch (java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException unused) {
                            }
                        }
                    }
                }
                int i9 = i3 + 1;
                if (i3 == 0) {
                    if (bVar.f8718b.l()) {
                        R8.e.d("A number (" + size + ") of logging calls during the initialization phase have been intercepted and are");
                        R8.e.d("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        R8.e.d("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(bVar.f8718b.f9087i instanceof R8.b)) {
                        R8.e.d("The following set of substitute loggers may have been accessed");
                        R8.e.d("during the initialization phase. Logging calls during this");
                        R8.e.d("phase were not honored. However, subsequent logging calls to these");
                        R8.e.d("loggers will work as normally expected.");
                        R8.e.d("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i3 = i9;
            }
            arrayList.clear();
        }
        R8.g gVar2 = (R8.g) f8183b.f9082b;
        gVar2.f9093b.clear();
        gVar2.f9094c.clear();
    }

    public static void e(java.util.ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new java.lang.IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            java.lang.String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i3 = R8.e.f9084a;
            if (Z.AbstractC1149h0.c(2) >= Z.AbstractC1149h0.c(R8.e.f9085b)) {
                R8.e.c().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        java.lang.String str2 = "Connected with provider of type [" + ((R8.d) arrayList.get(0)).getClass().getName() + "]";
        int i9 = R8.e.f9084a;
        if (Z.AbstractC1149h0.c(1) >= Z.AbstractC1149h0.c(R8.e.f9085b)) {
            R8.e.c().println("SLF4J(D): " + str2);
        }
    }

    public static void f(java.util.LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        R8.e.d("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            R8.e.d("Ignoring binding found at [" + ((java.net.URL) it.next()) + "]");
        }
        R8.e.d("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void g(java.util.ArrayList arrayList) {
        if (arrayList.size() > 1) {
            R8.e.d("Class path contains multiple SLF4J providers.");
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                R8.e.d("Found provider [" + ((R8.d) it.next()) + "]");
            }
            R8.e.d("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
