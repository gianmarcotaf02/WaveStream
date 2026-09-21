package p190x2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile p190x2.a f31145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.lang.Object f31146e = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.Context f31149c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.HashSet f31148b = new java.util.HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f31147a = new java.util.HashMap();

    public a(android.content.Context context) {
        this.f31149c = context.getApplicationContext();
    }

    public static p190x2.a c(android.content.Context context) {
        if (f31145d == null) {
            synchronized (f31146e) {
                try {
                    if (f31145d == null) {
                        f31145d = new p190x2.a(context);
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return f31145d;
    }

    public final void a(android.os.Bundle bundle) {
        java.util.HashSet hashSet;
        java.lang.String string = this.f31149c.getString(com.kiptv.tv.R.string.androidx_startup);
        if (bundle != null) {
            try {
                java.util.HashSet hashSet2 = new java.util.HashSet();
                java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f31148b;
                    if (!zHasNext) {
                        break;
                    }
                    java.lang.String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        java.lang.Class<?> cls = java.lang.Class.forName(next);
                        if (p190x2.b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                java.util.Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((java.lang.Class) it2.next(), hashSet2);
                }
            } catch (java.lang.ClassNotFoundException e6) {
                throw new I3.b(e6);
            }
        }
    }

    public final java.lang.Object b(java.lang.Class cls, java.util.HashSet hashSet) {
        java.lang.Object objCreate;
        if (com.google.android.gms.internal.play_billing.AbstractC1833d1.C()) {
            try {
                com.google.android.gms.internal.play_billing.AbstractC1833d1.h(cls.getSimpleName());
            } catch (java.lang.Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new java.lang.IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        java.util.HashMap map = this.f31147a;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                p190x2.b bVar = (p190x2.b) cls.getDeclaredConstructor(null).newInstance(null);
                java.util.List<java.lang.Class> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (java.lang.Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f31149c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (java.lang.Throwable th2) {
                throw new I3.b(th2);
            }
        }
        android.os.Trace.endSection();
        return objCreate;
    }
}
