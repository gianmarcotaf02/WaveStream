package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1767m extends p105m2.AbstractC2624w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B3.C0089b f18976f = new B3.C0089b("MRDiscoveryCallback", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.C1775o f18981e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Map f18979c = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.LinkedHashSet f18980d = new java.util.LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Set f18978b = java.util.Collections.synchronizedSet(new java.util.LinkedHashSet());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.C1763l f18977a = new com.google.android.gms.internal.cast.C1763l(this);

    public C1767m(android.content.Context context) {
        this.f18981e = new com.google.android.gms.internal.cast.C1775o(context);
    }

    @Override // p105m2.AbstractC2624w
    public final void a(p105m2.A a2) {
        f18976f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new java.lang.Object[0]);
        h(a2, true);
    }

    @Override // p105m2.AbstractC2624w
    public final void b(p105m2.A a2) {
        f18976f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new java.lang.Object[0]);
        h(a2, true);
    }

    @Override // p105m2.AbstractC2624w
    public final void c(p105m2.A a2) {
        f18976f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new java.lang.Object[0]);
        h(a2, false);
    }

    public final void f() {
        B3.C0089b c0089b = f18976f;
        c0089b.b(Y6.f.f(this.f18980d.size(), "Starting RouteDiscovery with ", " IDs"), new java.lang.Object[0]);
        c0089b.b("appIdToRouteInfo has these appId route keys: ".concat(java.lang.String.valueOf(this.f18979c.keySet())), new java.lang.Object[0]);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            g();
        } else {
            new Z3.d(android.os.Looper.getMainLooper(), 2).post(new com.google.android.gms.internal.cast.RunnableC1755j(this, 1));
        }
    }

    public final void g() {
        com.google.android.gms.internal.cast.C1775o c1775o = this.f18981e;
        if (((p105m2.C) c1775o.f19016i) == null) {
            c1775o.f19016i = p105m2.C.d((android.content.Context) c1775o.f19015h);
        }
        p105m2.C c9 = (p105m2.C) c1775o.f19016i;
        if (c9 != null) {
            c9.e(this);
        }
        synchronized (this.f18980d) {
            try {
                for (java.lang.String str : this.f18980d) {
                    java.lang.String strA = p184w3.x.a(str);
                    if (strA == null) {
                        throw new java.lang.IllegalArgumentException("category must not be null");
                    }
                    java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                    if (!arrayList.contains(strA)) {
                        arrayList.add(strA);
                    }
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    p105m2.C2623v c2623v = new p105m2.C2623v(bundle, arrayList);
                    if (((com.google.android.gms.internal.cast.C1759k) this.f18979c.get(str)) == null) {
                        this.f18979c.put(str, new com.google.android.gms.internal.cast.C1759k(c2623v));
                    }
                    f18976f.b("Adding mediaRouter callback for control category " + p184w3.x.a(str), new java.lang.Object[0]);
                    com.google.android.gms.internal.cast.C1775o c1775o2 = this.f18981e;
                    if (((p105m2.C) c1775o2.f19016i) == null) {
                        c1775o2.f19016i = p105m2.C.d((android.content.Context) c1775o2.f19015h);
                    }
                    ((p105m2.C) c1775o2.f19016i).a(c2623v, this, 4);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        f18976f.b("appIdToRouteInfo has these appId route keys: ".concat(java.lang.String.valueOf(this.f18979c.keySet())), new java.lang.Object[0]);
    }

    public final void h(p105m2.A a2, boolean z6) {
        boolean z9;
        java.util.Set setP;
        boolean zRemove;
        B3.C0089b c0089b = f18976f;
        c0089b.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", java.lang.Boolean.valueOf(z6), a2);
        synchronized (this.f18979c) {
            try {
                c0089b.b("appIdToRouteInfo has these appId route keys: ".concat(java.lang.String.valueOf(this.f18979c.keySet())), new java.lang.Object[0]);
                z9 = false;
                for (java.util.Map.Entry entry : this.f18979c.entrySet()) {
                    java.lang.String str = (java.lang.String) entry.getKey();
                    com.google.android.gms.internal.cast.C1759k c1759k = (com.google.android.gms.internal.cast.C1759k) entry.getValue();
                    if (a2.e(c1759k.f18938b)) {
                        if (z6) {
                            B3.C0089b c0089b2 = f18976f;
                            c0089b2.b("Adding/updating route for appId " + str, new java.lang.Object[0]);
                            zRemove = c1759k.f18937a.add(a2);
                            if (!zRemove) {
                                android.util.Log.w(c0089b2.f617a, c0089b2.d("Route " + java.lang.String.valueOf(a2) + " already exists for appId " + str, new java.lang.Object[0]));
                            }
                        } else {
                            B3.C0089b c0089b3 = f18976f;
                            c0089b3.b("Removing route for appId " + str, new java.lang.Object[0]);
                            zRemove = c1759k.f18937a.remove(a2);
                            if (!zRemove) {
                                android.util.Log.w(c0089b3.f617a, c0089b3.d("Route " + java.lang.String.valueOf(a2) + " already removed from appId " + str, new java.lang.Object[0]));
                            }
                        }
                        z9 = zRemove;
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (z9) {
            f18976f.b("Invoking callback.onRouteUpdated.", new java.lang.Object[0]);
            synchronized (this.f18978b) {
                try {
                    java.util.HashMap map = new java.util.HashMap();
                    synchronized (this.f18979c) {
                        try {
                            for (java.lang.String str2 : this.f18979c.keySet()) {
                                com.google.android.gms.internal.cast.C1759k c1759k2 = (com.google.android.gms.internal.cast.C1759k) this.f18979c.get(com.google.android.gms.internal.cast.H.f(str2));
                                if (c1759k2 == null) {
                                    int i3 = com.google.android.gms.internal.cast.AbstractC1728c0.j;
                                    setP = com.google.android.gms.internal.cast.C1760k0.f18940q;
                                } else {
                                    java.util.LinkedHashSet linkedHashSet = c1759k2.f18937a;
                                    int i9 = com.google.android.gms.internal.cast.AbstractC1728c0.j;
                                    java.lang.Object[] array = linkedHashSet.toArray();
                                    setP = com.google.android.gms.internal.cast.AbstractC1728c0.p(array, array.length);
                                }
                                if (!setP.isEmpty()) {
                                    map.put(str2, setP);
                                }
                            }
                        } catch (java.lang.Throwable th2) {
                            throw th2;
                        }
                    }
                    com.google.android.gms.internal.cast.C1756j0.a(map.entrySet());
                    java.util.Iterator it = this.f18978b.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new java.lang.ClassCastException();
                        }
                        throw null;
                    }
                } catch (java.lang.Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
