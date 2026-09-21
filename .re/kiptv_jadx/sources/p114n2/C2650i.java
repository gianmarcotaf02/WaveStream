package p114n2;

/* JADX INFO: renamed from: n2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2650i implements androidx.lifecycle.InterfaceC1540w, androidx.lifecycle.k0, androidx.lifecycle.InterfaceC1528j, p165t2.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final D3.j f25624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p114n2.t f25625i;
    public final android.os.Bundle j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.lifecycle.EnumC1533o f25626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p114n2.C2654m f25627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f25628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final android.os.Bundle f25629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q2.c f25630o = new q2.c(this);

    public C2650i(D3.j jVar, p114n2.t tVar, android.os.Bundle bundle, androidx.lifecycle.EnumC1533o enumC1533o, p114n2.C2654m c2654m, java.lang.String str, android.os.Bundle bundle2) {
        this.f25624h = jVar;
        this.f25625i = tVar;
        this.j = bundle;
        this.f25626k = enumC1533o;
        this.f25627l = c2654m;
        this.f25628m = str;
        this.f25629n = bundle2;
        com.google.common.util.concurrent.D.B(new p077i5.C2237d(13, this));
    }

    public final void b(androidx.lifecycle.EnumC1533o enumC1533o) {
        q2.c cVar = this.f25630o;
        cVar.getClass();
        cVar.f26588k = enumC1533o;
        cVar.b();
    }

    @Override // androidx.lifecycle.InterfaceC1528j
    public final androidx.lifecycle.g0 c() {
        return this.f25630o.f26589l;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    @Override // androidx.lifecycle.InterfaceC1528j
    public final p040e2.d d() {
        android.app.Application application;
        q2.c cVar = this.f25630o;
        cVar.getClass();
        p040e2.d dVar = new p040e2.d(0);
        V1.b bVar = androidx.lifecycle.X.f16322a;
        java.util.LinkedHashMap linkedHashMap = dVar.f21365a;
        p114n2.C2650i c2650i = cVar.f26580a;
        linkedHashMap.put(bVar, c2650i);
        linkedHashMap.put(androidx.lifecycle.X.f16323b, c2650i);
        android.os.Bundle bundleA = cVar.a();
        if (bundleA != null) {
            linkedHashMap.put(androidx.lifecycle.X.f16324c, bundleA);
        }
        D3.j jVar = this.f25624h;
        if (jVar == null) {
            application = null;
        } else {
            android.content.Context context = jVar.f2115a;
            android.content.Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
            } else {
                application = null;
            }
        }
        android.app.Application application2 = application != null ? application : null;
        if (application2 != null) {
            linkedHashMap.put(androidx.lifecycle.f0.f16355d, application2);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.k0
    public final androidx.lifecycle.j0 e() {
        q2.c cVar = this.f25630o;
        if (!cVar.f26587i) {
            throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (cVar.j.f16379d == androidx.lifecycle.EnumC1533o.f16364h) {
            throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        p114n2.C2654m c2654m = cVar.f26584e;
        if (c2654m == null) {
            throw new java.lang.IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        java.lang.String backStackEntryId = cVar.f26585f;
        kotlin.jvm.internal.m.e(backStackEntryId, "backStackEntryId");
        java.util.LinkedHashMap linkedHashMap = c2654m.f25641b;
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) linkedHashMap.get(backStackEntryId);
        if (j0Var != null) {
            return j0Var;
        }
        androidx.lifecycle.j0 j0Var2 = new androidx.lifecycle.j0();
        linkedHashMap.put(backStackEntryId, j0Var2);
        return j0Var2;
    }

    public final boolean equals(java.lang.Object obj) {
        java.util.Set<java.lang.String> setKeySet;
        if (obj != null && (obj instanceof p114n2.C2650i)) {
            p114n2.C2650i c2650i = (p114n2.C2650i) obj;
            if (kotlin.jvm.internal.m.a(this.f25628m, c2650i.f25628m) && kotlin.jvm.internal.m.a(this.f25625i, c2650i.f25625i) && kotlin.jvm.internal.m.a(this.f25630o.j, c2650i.f25630o.j) && kotlin.jvm.internal.m.a(g(), c2650i.g())) {
                android.os.Bundle bundle = this.j;
                android.os.Bundle bundle2 = c2650i.j;
                if (kotlin.jvm.internal.m.a(bundle, bundle2)) {
                    return true;
                }
                if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                    java.util.Set<java.lang.String> set = setKeySet;
                    if ((set instanceof java.util.Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (java.lang.String str : set) {
                        if (!kotlin.jvm.internal.m.a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p165t2.e
    public final p079i7.f g() {
        return (p079i7.f) this.f25630o.f26586h.j;
    }

    @Override // androidx.lifecycle.InterfaceC1540w
    public final androidx.lifecycle.AbstractC1534p getLifecycle() {
        return this.f25630o.j;
    }

    public final int hashCode() {
        java.util.Set<java.lang.String> setKeySet;
        int iHashCode = this.f25625i.hashCode() + (this.f25628m.hashCode() * 31);
        android.os.Bundle bundle = this.j;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            java.util.Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i3 = iHashCode * 31;
                java.lang.Object obj = bundle.get((java.lang.String) it.next());
                iHashCode = i3 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return g().hashCode() + ((this.f25630o.j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final java.lang.String toString() {
        return this.f25630o.toString();
    }
}
