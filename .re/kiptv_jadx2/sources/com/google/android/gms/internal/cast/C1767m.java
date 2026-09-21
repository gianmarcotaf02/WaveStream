package com.google.android.gms.internal.cast;

import B3.C0089b;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p105m2.AbstractC2624w;
import p105m2.C2623v;

public final class C1767m extends AbstractC2624w {

    public static final C0089b f18976f = new C0089b("MRDiscoveryCallback", null);

    public final C1775o f18981e;

    public final Map f18979c = Collections.synchronizedMap(new HashMap());

    public final LinkedHashSet f18980d = new LinkedHashSet();

    public final Set f18978b = Collections.synchronizedSet(new LinkedHashSet());

    public final C1763l f18977a = new C1763l(this);

    public C1767m(Context context) {
        this.f18981e = new C1775o(context);
    }

    @Override
    public final void a(p105m2.A a2) {
        f18976f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        h(a2, true);
    }

    @Override
    public final void b(p105m2.A a2) {
        f18976f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        h(a2, true);
    }

    @Override
    public final void c(p105m2.A a2) {
        f18976f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        h(a2, false);
    }

    public final void f() {
        C0089b c0089b = f18976f;
        c0089b.b(Y6.f.f(this.f18980d.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        c0089b.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f18979c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            g();
        } else {
            new Z3.d(Looper.getMainLooper(), 2).post(new RunnableC1755j(this, 1));
        }
    }

    public final void g() {
        C1775o c1775o = this.f18981e;
        if (((p105m2.C) c1775o.f19016i) == null) {
            c1775o.f19016i = p105m2.C.d((Context) c1775o.f19015h);
        }
        p105m2.C c9 = (p105m2.C) c1775o.f19016i;
        if (c9 != null) {
            c9.e(this);
        }
        synchronized (this.f18980d) {
            try {
                for (String str : this.f18980d) {
                    String strA = p184w3.x.a(str);
                    if (strA == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (!arrayList.contains(strA)) {
                        arrayList.add(strA);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("controlCategories", arrayList);
                    C2623v c2623v = new C2623v(bundle, arrayList);
                    if (((C1759k) this.f18979c.get(str)) == null) {
                        this.f18979c.put(str, new C1759k(c2623v));
                    }
                    f18976f.b("Adding mediaRouter callback for control category " + p184w3.x.a(str), new Object[0]);
                    C1775o c1775o2 = this.f18981e;
                    if (((p105m2.C) c1775o2.f19016i) == null) {
                        c1775o2.f19016i = p105m2.C.d((Context) c1775o2.f19015h);
                    }
                    ((p105m2.C) c1775o2.f19016i).a(c2623v, this, 4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f18976f.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f18979c.keySet())), new Object[0]);
    }

    public final void h(p105m2.A a2, boolean z6) {
        boolean z9;
        Set setP;
        boolean zRemove;
        C0089b c0089b = f18976f;
        c0089b.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z6), a2);
        synchronized (this.f18979c) {
            try {
                c0089b.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.f18979c.keySet())), new Object[0]);
                z9 = false;
                for (Map.Entry entry : this.f18979c.entrySet()) {
                    String str = (String) entry.getKey();
                    C1759k c1759k = (C1759k) entry.getValue();
                    if (a2.e(c1759k.f18938b)) {
                        if (z6) {
                            C0089b c0089b2 = f18976f;
                            c0089b2.b("Adding/updating route for appId " + str, new Object[0]);
                            zRemove = c1759k.f18937a.add(a2);
                            if (!zRemove) {
                                Log.w(c0089b2.f617a, c0089b2.d("Route " + String.valueOf(a2) + " already exists for appId " + str, new Object[0]));
                            }
                        } else {
                            C0089b c0089b3 = f18976f;
                            c0089b3.b("Removing route for appId " + str, new Object[0]);
                            zRemove = c1759k.f18937a.remove(a2);
                            if (!zRemove) {
                                Log.w(c0089b3.f617a, c0089b3.d("Route " + String.valueOf(a2) + " already removed from appId " + str, new Object[0]));
                            }
                        }
                        z9 = zRemove;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            f18976f.b("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.f18978b) {
                try {
                    HashMap map = new HashMap();
                    synchronized (this.f18979c) {
                        try {
                            for (String str2 : this.f18979c.keySet()) {
                                C1759k c1759k2 = (C1759k) this.f18979c.get(H.f(str2));
                                if (c1759k2 == null) {
                                    int i3 = AbstractC1728c0.j;
                                    setP = C1760k0.f18940q;
                                } else {
                                    LinkedHashSet linkedHashSet = c1759k2.f18937a;
                                    int i9 = AbstractC1728c0.j;
                                    Object[] array = linkedHashSet.toArray();
                                    setP = AbstractC1728c0.p(array, array.length);
                                }
                                if (!setP.isEmpty()) {
                                    map.put(str2, setP);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    C1756j0.a(map.entrySet());
                    Iterator it = this.f18978b.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new ClassCastException();
                        }
                        throw null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
