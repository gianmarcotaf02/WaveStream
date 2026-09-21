package P8;

import R8.f;
import R8.g;
import Z.AbstractC1149h0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

public abstract class d {

    public static volatile int f8182a;

    public static final R8.d f8183b = new R8.d(1);

    public static final R8.d f8184c = new R8.d(0);

    public static final boolean f8185d;

    public static volatile R8.d f8186e;

    public static final String[] f8187f;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        f8185d = property == null ? false : property.equalsIgnoreCase("true");
        f8187f = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = d.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        R8.d dVar = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                int i3 = R8.e.f9084a;
                if (AbstractC1149h0.c(2) >= AbstractC1149h0.c(R8.e.f9085b)) {
                    R8.e.c().println("SLF4J(I): " + str);
                }
                dVar = (R8.d) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e6) {
                R8.e.b("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e6);
            } catch (ClassNotFoundException e9) {
                e = e9;
                R8.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (IllegalAccessException e10) {
                e = e10;
                R8.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InstantiationException e11) {
                e = e11;
                R8.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (NoSuchMethodException e12) {
                e = e12;
                R8.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            } catch (InvocationTargetException e13) {
                e = e13;
                R8.e.b("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e);
            }
        }
        if (dVar != null) {
            arrayList.add(dVar);
            return arrayList;
        }
        Iterator it = (System.getSecurityManager() == null ? ServiceLoader.load(R8.d.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() {
            @Override
            public final Object run() {
                return ServiceLoader.load(R8.d.class, classLoader);
            }
        })).iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((R8.d) it.next());
            } catch (ServiceConfigurationError e14) {
                R8.e.a("A service provider failed to instantiate:\n" + e14.getMessage());
            }
        }
        return arrayList;
    }

    public static R8.d b() {
        if (f8182a == 0) {
            synchronized (d.class) {
                try {
                    if (f8182a == 0) {
                        f8182a = 1;
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i3 = f8182a;
        if (i3 == 1) {
            return f8183b;
        }
        if (i3 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i3 == 3) {
            return f8186e;
        }
        if (i3 == 4) {
            return f8184c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static final void c() {
        try {
            ArrayList arrayListA = a();
            g(arrayListA);
            if (arrayListA.isEmpty()) {
                f8182a = 4;
                R8.e.d("No SLF4J providers were found.");
                R8.e.d("Defaulting to no-operation (NOP) logger implementation");
                R8.e.d("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = d.class.getClassLoader();
                    Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    while (systemResources.hasMoreElements()) {
                        linkedHashSet.add(systemResources.nextElement());
                    }
                } catch (IOException e6) {
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
                            for (String str : f8187f) {
                                if ("2.0.99".startsWith(str)) {
                                    z6 = true;
                                }
                            }
                            if (z6) {
                                return;
                            }
                            R8.e.d("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(f8187f).toString());
                            R8.e.d("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    R8.e.b("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e9) {
            f8182a = 2;
            R8.e.b("Failed to instantiate SLF4J LoggerFactory", e9);
            throw new IllegalStateException("Unexpected initialization failure", e9);
        }
    }

    public static void d() {
        R8.d dVar = f8183b;
        synchronized (dVar) {
            try {
                ((g) dVar.f9082b).f9092a = true;
                g gVar = (g) dVar.f9082b;
                gVar.getClass();
                for (f fVar : new ArrayList(gVar.f9093b.values())) {
                    fVar.f9087i = b().a().a(fVar.f9086h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((g) f8183b.f9082b).f9094c;
        int size = linkedBlockingQueue.size();
        ArrayList<Q8.b> arrayList = new ArrayList(128);
        int i3 = 0;
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            for (Q8.b bVar : arrayList) {
                if (bVar != null) {
                    f fVar2 = bVar.f8718b;
                    String str = fVar2.f9086h;
                    if (fVar2.f9087i == null) {
                        throw new IllegalStateException("Delegate logger cannot be null at this state.");
                    }
                    if (!(fVar2.f9087i instanceof R8.b)) {
                        if (!fVar2.l()) {
                            R8.e.d(str);
                        } else if (fVar2.j(bVar.f8717a) && fVar2.l()) {
                            try {
                                fVar2.f9088k.invoke(fVar2.f9087i, bVar);
                            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
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
        g gVar2 = (g) f8183b.f9082b;
        gVar2.f9093b.clear();
        gVar2.f9094c.clear();
    }

    public static void e(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (arrayList.size() > 1) {
            String str = "Actual provider is of type [" + arrayList.get(0) + "]";
            int i3 = R8.e.f9084a;
            if (AbstractC1149h0.c(2) >= AbstractC1149h0.c(R8.e.f9085b)) {
                R8.e.c().println("SLF4J(I): " + str);
                return;
            }
            return;
        }
        String str2 = "Connected with provider of type [" + ((R8.d) arrayList.get(0)).getClass().getName() + "]";
        int i9 = R8.e.f9084a;
        if (AbstractC1149h0.c(1) >= AbstractC1149h0.c(R8.e.f9085b)) {
            R8.e.c().println("SLF4J(D): " + str2);
        }
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        R8.e.d("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            R8.e.d("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        R8.e.d("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void g(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            R8.e.d("Class path contains multiple SLF4J providers.");
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                R8.e.d("Found provider [" + ((R8.d) it.next()) + "]");
            }
            R8.e.d("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
