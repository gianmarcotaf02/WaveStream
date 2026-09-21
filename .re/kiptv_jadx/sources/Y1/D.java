package Y1;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public p046f.g f11154A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p046f.g f11155B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public java.util.ArrayDeque f11156C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f11157D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f11158E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f11159F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f11160G;
    public boolean H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public java.util.ArrayList f11161I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public java.util.ArrayList f11162J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public java.util.ArrayList f11163K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public Y1.G f11164L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final B3.r f11165M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11167b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f11169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f11170e;
    public p019c.u g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y1.v f11172h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final S2.a f11175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f11176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Y1.t f11177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Y1.t f11178o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Y1.t f11179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Y1.t f11180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Y1.w f11181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11182s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Y1.q f11183t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public E8.l f11184u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Y1.AbstractComponentCallbacksC1029n f11185v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Y1.AbstractComponentCallbacksC1029n f11186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Y1.x f11187x;
    public final V1.b y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p046f.g f11188z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f11166a = new java.util.ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A7.m f11168c = new A7.m(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y1.s f11171f = new Y1.s(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f11173i = new java.util.concurrent.atomic.AtomicInteger();
    public final java.util.Map j = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.Map f11174k = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [Y1.t] */
    /* JADX WARN: Type inference failed for: r0v13, types: [Y1.t] */
    /* JADX WARN: Type inference failed for: r0v14, types: [Y1.t] */
    /* JADX WARN: Type inference failed for: r0v15, types: [Y1.t] */
    public D() {
        final int i3 = 0;
        this.f11172h = new Y1.v(i3, this);
        java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.f11175l = new S2.a(this);
        this.f11176m = new java.util.concurrent.CopyOnWriteArrayList();
        this.f11177n = new C1.a(this) { // from class: Y1.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y1.D f11346b;

            {
                this.f11346b = this;
            }

            @Override // C1.a
            public final void accept(java.lang.Object obj) {
                switch (i3) {
                    case 0:
                        Y1.D d4 = this.f11346b;
                        if (d4.I()) {
                            d4.h(false);
                        }
                        break;
                    case 1:
                        java.lang.Integer num = (java.lang.Integer) obj;
                        Y1.D d6 = this.f11346b;
                        if (d6.I() && num.intValue() == 80) {
                            d6.l(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.C1486f c1486f = (androidx.core.app.C1486f) obj;
                        Y1.D d9 = this.f11346b;
                        if (d9.I()) {
                            boolean z6 = c1486f.f16024a;
                            d9.m(false);
                        }
                        break;
                    default:
                        androidx.core.app.L l2 = (androidx.core.app.L) obj;
                        Y1.D d10 = this.f11346b;
                        if (d10.I()) {
                            boolean z9 = l2.f16004a;
                            d10.r(false);
                        }
                        break;
                }
            }
        };
        final int i9 = 1;
        this.f11178o = new C1.a(this) { // from class: Y1.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y1.D f11346b;

            {
                this.f11346b = this;
            }

            @Override // C1.a
            public final void accept(java.lang.Object obj) {
                switch (i9) {
                    case 0:
                        Y1.D d4 = this.f11346b;
                        if (d4.I()) {
                            d4.h(false);
                        }
                        break;
                    case 1:
                        java.lang.Integer num = (java.lang.Integer) obj;
                        Y1.D d6 = this.f11346b;
                        if (d6.I() && num.intValue() == 80) {
                            d6.l(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.C1486f c1486f = (androidx.core.app.C1486f) obj;
                        Y1.D d9 = this.f11346b;
                        if (d9.I()) {
                            boolean z6 = c1486f.f16024a;
                            d9.m(false);
                        }
                        break;
                    default:
                        androidx.core.app.L l2 = (androidx.core.app.L) obj;
                        Y1.D d10 = this.f11346b;
                        if (d10.I()) {
                            boolean z9 = l2.f16004a;
                            d10.r(false);
                        }
                        break;
                }
            }
        };
        final int i10 = 2;
        this.f11179p = new C1.a(this) { // from class: Y1.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y1.D f11346b;

            {
                this.f11346b = this;
            }

            @Override // C1.a
            public final void accept(java.lang.Object obj) {
                switch (i10) {
                    case 0:
                        Y1.D d4 = this.f11346b;
                        if (d4.I()) {
                            d4.h(false);
                        }
                        break;
                    case 1:
                        java.lang.Integer num = (java.lang.Integer) obj;
                        Y1.D d6 = this.f11346b;
                        if (d6.I() && num.intValue() == 80) {
                            d6.l(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.C1486f c1486f = (androidx.core.app.C1486f) obj;
                        Y1.D d9 = this.f11346b;
                        if (d9.I()) {
                            boolean z6 = c1486f.f16024a;
                            d9.m(false);
                        }
                        break;
                    default:
                        androidx.core.app.L l2 = (androidx.core.app.L) obj;
                        Y1.D d10 = this.f11346b;
                        if (d10.I()) {
                            boolean z9 = l2.f16004a;
                            d10.r(false);
                        }
                        break;
                }
            }
        };
        final int i11 = 3;
        this.f11180q = new C1.a(this) { // from class: Y1.t

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Y1.D f11346b;

            {
                this.f11346b = this;
            }

            @Override // C1.a
            public final void accept(java.lang.Object obj) {
                switch (i11) {
                    case 0:
                        Y1.D d4 = this.f11346b;
                        if (d4.I()) {
                            d4.h(false);
                        }
                        break;
                    case 1:
                        java.lang.Integer num = (java.lang.Integer) obj;
                        Y1.D d6 = this.f11346b;
                        if (d6.I() && num.intValue() == 80) {
                            d6.l(false);
                            break;
                        }
                        break;
                    case 2:
                        androidx.core.app.C1486f c1486f = (androidx.core.app.C1486f) obj;
                        Y1.D d9 = this.f11346b;
                        if (d9.I()) {
                            boolean z6 = c1486f.f16024a;
                            d9.m(false);
                        }
                        break;
                    default:
                        androidx.core.app.L l2 = (androidx.core.app.L) obj;
                        Y1.D d10 = this.f11346b;
                        if (d10.I()) {
                            boolean z9 = l2.f16004a;
                            d10.r(false);
                        }
                        break;
                }
            }
        };
        this.f11181r = new Y1.w(this);
        this.f11182s = -1;
        this.f11187x = new Y1.x(this);
        this.y = new V1.b(3);
        this.f11156C = new java.util.ArrayDeque();
        this.f11165M = new B3.r(8, this);
    }

    public static boolean G(int i3) {
        return android.util.Log.isLoggable("FragmentManager", i3);
    }

    public static boolean H(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        abstractComponentCallbacksC1029n.getClass();
        boolean zH = false;
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n2 : abstractComponentCallbacksC1029n.f11295A.f11168c.D()) {
            if (abstractComponentCallbacksC1029n2 != null) {
                zH = H(abstractComponentCallbacksC1029n2);
            }
            if (zH) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (abstractComponentCallbacksC1029n == null) {
            return true;
        }
        if (abstractComponentCallbacksC1029n.f11302I) {
            return abstractComponentCallbacksC1029n.y == null || J(abstractComponentCallbacksC1029n.f11296B);
        }
        return false;
    }

    public static boolean K(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (abstractComponentCallbacksC1029n == null) {
            return true;
        }
        Y1.D d4 = abstractComponentCallbacksC1029n.y;
        return abstractComponentCallbacksC1029n.equals(d4.f11186w) && K(d4.f11185v);
    }

    public static void Y(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (G(2)) {
            android.util.Log.v("FragmentManager", "show: " + abstractComponentCallbacksC1029n);
        }
        if (abstractComponentCallbacksC1029n.f11300F) {
            abstractComponentCallbacksC1029n.f11300F = false;
            abstractComponentCallbacksC1029n.f11308O = !abstractComponentCallbacksC1029n.f11308O;
        }
    }

    public final Y1.AbstractComponentCallbacksC1029n A(int i3) {
        A7.m mVar = this.f11168c;
        java.util.ArrayList arrayList = (java.util.ArrayList) mVar.f321i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = (Y1.AbstractComponentCallbacksC1029n) arrayList.get(size);
            if (abstractComponentCallbacksC1029n != null && abstractComponentCallbacksC1029n.f11297C == i3) {
                return abstractComponentCallbacksC1029n;
            }
        }
        for (Y1.J j : ((java.util.HashMap) mVar.j).values()) {
            if (j != null) {
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n2 = j.f11217c;
                if (abstractComponentCallbacksC1029n2.f11297C == i3) {
                    return abstractComponentCallbacksC1029n2;
                }
            }
        }
        return null;
    }

    public final Y1.AbstractComponentCallbacksC1029n B(java.lang.String str) {
        A7.m mVar = this.f11168c;
        java.util.ArrayList arrayList = (java.util.ArrayList) mVar.f321i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = (Y1.AbstractComponentCallbacksC1029n) arrayList.get(size);
            if (abstractComponentCallbacksC1029n != null && str.equals(abstractComponentCallbacksC1029n.f11299E)) {
                return abstractComponentCallbacksC1029n;
            }
        }
        for (Y1.J j : ((java.util.HashMap) mVar.j).values()) {
            if (j != null) {
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n2 = j.f11217c;
                if (str.equals(abstractComponentCallbacksC1029n2.f11299E)) {
                    return abstractComponentCallbacksC1029n2;
                }
            }
        }
        return null;
    }

    public final android.view.ViewGroup C(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        android.view.ViewGroup viewGroup = abstractComponentCallbacksC1029n.f11304K;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC1029n.f11298D <= 0 || !this.f11184u.G()) {
            return null;
        }
        android.view.View viewF = this.f11184u.F(abstractComponentCallbacksC1029n.f11298D);
        if (viewF instanceof android.view.ViewGroup) {
            return (android.view.ViewGroup) viewF;
        }
        return null;
    }

    public final Y1.x D() {
        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = this.f11185v;
        return abstractComponentCallbacksC1029n != null ? abstractComponentCallbacksC1029n.y.D() : this.f11187x;
    }

    public final V1.b E() {
        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = this.f11185v;
        return abstractComponentCallbacksC1029n != null ? abstractComponentCallbacksC1029n.y.E() : this.y;
    }

    public final void F(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (G(2)) {
            android.util.Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC1029n);
        }
        if (abstractComponentCallbacksC1029n.f11300F) {
            return;
        }
        abstractComponentCallbacksC1029n.f11300F = true;
        abstractComponentCallbacksC1029n.f11308O = true ^ abstractComponentCallbacksC1029n.f11308O;
        X(abstractComponentCallbacksC1029n);
    }

    public final boolean I() {
        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = this.f11185v;
        if (abstractComponentCallbacksC1029n == null) {
            return true;
        }
        return abstractComponentCallbacksC1029n.f11331z != null && abstractComponentCallbacksC1029n.f11324r && abstractComponentCallbacksC1029n.n().I();
    }

    public final void L(int i3, boolean z6) {
        java.util.HashMap map;
        Y1.q qVar;
        if (this.f11183t == null && i3 != -1) {
            throw new java.lang.IllegalStateException("No activity");
        }
        if (z6 || i3 != this.f11182s) {
            this.f11182s = i3;
            A7.m mVar = this.f11168c;
            java.util.Iterator it = ((java.util.ArrayList) mVar.f321i).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = (java.util.HashMap) mVar.j;
                if (!zHasNext) {
                    break;
                }
                Y1.J j = (Y1.J) map.get(((Y1.AbstractComponentCallbacksC1029n) it.next()).f11318l);
                if (j != null) {
                    j.j();
                }
            }
            for (Y1.J j9 : map.values()) {
                if (j9 != null) {
                    j9.j();
                    Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = j9.f11217c;
                    if (abstractComponentCallbacksC1029n.f11325s && !abstractComponentCallbacksC1029n.r()) {
                        mVar.L(j9);
                    }
                }
            }
            Z();
            if (this.f11157D && (qVar = this.f11183t) != null && this.f11182s == 7) {
                qVar.f11340v.invalidateOptionsMenu();
                this.f11157D = false;
            }
        }
    }

    public final void M() {
        if (this.f11183t == null) {
            return;
        }
        this.f11158E = false;
        this.f11159F = false;
        this.f11164L.g = false;
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n : this.f11168c.F()) {
            if (abstractComponentCallbacksC1029n != null) {
                abstractComponentCallbacksC1029n.f11295A.M();
            }
        }
    }

    public final boolean N() {
        y(false);
        x(true);
        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = this.f11186w;
        if (abstractComponentCallbacksC1029n != null && abstractComponentCallbacksC1029n.l().N()) {
            return true;
        }
        boolean zO = O(this.f11161I, this.f11162J, -1, 0);
        if (zO) {
            this.f11167b = true;
            try {
                Q(this.f11161I, this.f11162J);
                d();
            } catch (java.lang.Throwable th) {
                d();
                throw th;
            }
        }
        b0();
        u();
        ((java.util.HashMap) this.f11168c.j).values().removeAll(java.util.Collections.singleton(null));
        return zO;
    }

    public final boolean O(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i3, int i9) {
        boolean z6 = (i9 & 1) != 0;
        java.util.ArrayList arrayList3 = this.f11169d;
        int size = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i3 < 0) {
                size = z6 ? 0 : this.f11169d.size() - 1;
            } else {
                int size2 = this.f11169d.size() - 1;
                while (size2 >= 0) {
                    Y1.C1016a c1016a = (Y1.C1016a) this.f11169d.get(size2);
                    if (i3 >= 0 && i3 == c1016a.f11245r) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z6) {
                    size = size2;
                    while (size > 0) {
                        Y1.C1016a c1016a2 = (Y1.C1016a) this.f11169d.get(size - 1);
                        if (i3 < 0 || i3 != c1016a2.f11245r) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f11169d.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f11169d.size() - 1; size3 >= size; size3--) {
            arrayList.add((Y1.C1016a) this.f11169d.remove(size3));
            arrayList2.add(java.lang.Boolean.TRUE);
        }
        return true;
    }

    public final void P(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (G(2)) {
            android.util.Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC1029n + " nesting=" + abstractComponentCallbacksC1029n.f11330x);
        }
        boolean zR = abstractComponentCallbacksC1029n.r();
        if (abstractComponentCallbacksC1029n.f11301G && zR) {
            return;
        }
        A7.m mVar = this.f11168c;
        synchronized (((java.util.ArrayList) mVar.f321i)) {
            ((java.util.ArrayList) mVar.f321i).remove(abstractComponentCallbacksC1029n);
        }
        abstractComponentCallbacksC1029n.f11324r = false;
        if (H(abstractComponentCallbacksC1029n)) {
            this.f11157D = true;
        }
        abstractComponentCallbacksC1029n.f11325s = true;
        X(abstractComponentCallbacksC1029n);
    }

    public final void Q(java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new java.lang.IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i3 = 0;
        int i9 = 0;
        while (i3 < size) {
            if (!((Y1.C1016a) arrayList.get(i3)).f11242o) {
                if (i9 != i3) {
                    z(arrayList, arrayList2, i9, i3);
                }
                i9 = i3 + 1;
                if (((java.lang.Boolean) arrayList2.get(i3)).booleanValue()) {
                    while (i9 < size && ((java.lang.Boolean) arrayList2.get(i9)).booleanValue() && !((Y1.C1016a) arrayList.get(i9)).f11242o) {
                        i9++;
                    }
                }
                z(arrayList, arrayList2, i3, i9);
                i3 = i9 - 1;
            }
            i3++;
        }
        if (i9 != size) {
            z(arrayList, arrayList2, i9, size);
        }
    }

    public final void R(android.os.Parcelable parcelable) {
        int i3;
        S2.a aVar;
        int i9;
        Y1.J j;
        android.os.Bundle bundle;
        android.os.Bundle bundle2;
        android.os.Bundle bundle3 = (android.os.Bundle) parcelable;
        for (java.lang.String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.f11183t.f11337s.getClassLoader());
                this.f11174k.put(str.substring(7), bundle2);
            }
        }
        java.util.ArrayList<Y1.I> arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.f11183t.f11337s.getClassLoader());
                arrayList.add((Y1.I) bundle.getParcelable(io.sentry.protocol.SentryThread.JsonKeys.STATE));
            }
        }
        A7.m mVar = this.f11168c;
        java.util.HashMap map = (java.util.HashMap) mVar.f322k;
        map.clear();
        for (Y1.I i10 : arrayList) {
            map.put(i10.f11204i, i10);
        }
        Y1.E e6 = (Y1.E) bundle3.getParcelable(io.sentry.protocol.SentryThread.JsonKeys.STATE);
        if (e6 == null) {
            return;
        }
        java.util.HashMap map2 = (java.util.HashMap) mVar.j;
        map2.clear();
        java.util.Iterator it = e6.f11189h.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i3 = 2;
            aVar = this.f11175l;
            if (!zHasNext) {
                break;
            }
            Y1.I i11 = (Y1.I) ((java.util.HashMap) mVar.f322k).remove((java.lang.String) it.next());
            if (i11 != null) {
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = (Y1.AbstractComponentCallbacksC1029n) this.f11164L.f11198b.get(i11.f11204i);
                if (abstractComponentCallbacksC1029n != null) {
                    if (G(2)) {
                        android.util.Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC1029n);
                    }
                    j = new Y1.J(aVar, mVar, abstractComponentCallbacksC1029n, i11);
                } else {
                    j = new Y1.J(this.f11175l, this.f11168c, this.f11183t.f11337s.getClassLoader(), D(), i11);
                }
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n2 = j.f11217c;
                abstractComponentCallbacksC1029n2.y = this;
                if (G(2)) {
                    android.util.Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC1029n2.f11318l + "): " + abstractComponentCallbacksC1029n2);
                }
                j.l(this.f11183t.f11337s.getClassLoader());
                mVar.K(j);
                j.f11219e = this.f11182s;
            }
        }
        Y1.G g = this.f11164L;
        g.getClass();
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n3 : new java.util.ArrayList(g.f11198b.values())) {
            if (map2.get(abstractComponentCallbacksC1029n3.f11318l) == null) {
                if (G(2)) {
                    android.util.Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC1029n3 + " that was not found in the set of active Fragments " + e6.f11189h);
                }
                this.f11164L.g(abstractComponentCallbacksC1029n3);
                abstractComponentCallbacksC1029n3.y = this;
                Y1.J j9 = new Y1.J(aVar, mVar, abstractComponentCallbacksC1029n3);
                j9.f11219e = 1;
                j9.j();
                abstractComponentCallbacksC1029n3.f11325s = true;
                j9.j();
            }
        }
        java.util.ArrayList<java.lang.String> arrayList2 = e6.f11190i;
        ((java.util.ArrayList) mVar.f321i).clear();
        if (arrayList2 != null) {
            for (java.lang.String str3 : arrayList2) {
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029nW = mVar.w(str3);
                if (abstractComponentCallbacksC1029nW == null) {
                    throw new java.lang.IllegalStateException(Y6.f.h("No instantiated fragment for (", str3, ")"));
                }
                if (G(2)) {
                    android.util.Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC1029nW);
                }
                mVar.l(abstractComponentCallbacksC1029nW);
            }
        }
        if (e6.j != null) {
            this.f11169d = new java.util.ArrayList(e6.j.length);
            int i12 = 0;
            while (true) {
                Y1.C1017b[] c1017bArr = e6.j;
                if (i12 >= c1017bArr.length) {
                    break;
                }
                Y1.C1017b c1017b = c1017bArr[i12];
                c1017b.getClass();
                Y1.C1016a c1016a = new Y1.C1016a(this);
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    int[] iArr = c1017b.f11246h;
                    if (i13 >= iArr.length) {
                        break;
                    }
                    Y1.K k9 = new Y1.K();
                    int i15 = i13 + 1;
                    int i16 = i3;
                    k9.f11220a = iArr[i13];
                    if (G(i16)) {
                        android.util.Log.v("FragmentManager", "Instantiate " + c1016a + " op #" + i14 + " base fragment #" + iArr[i15]);
                    }
                    k9.f11226h = androidx.lifecycle.EnumC1533o.values()[c1017b.j[i14]];
                    k9.f11227i = androidx.lifecycle.EnumC1533o.values()[c1017b.f11248k[i14]];
                    int i17 = i13 + 2;
                    k9.f11222c = iArr[i15] != 0;
                    int i18 = iArr[i17];
                    k9.f11223d = i18;
                    int i19 = iArr[i13 + 3];
                    k9.f11224e = i19;
                    int i20 = i13 + 5;
                    int i21 = iArr[i13 + 4];
                    k9.f11225f = i21;
                    i13 += 6;
                    int i22 = iArr[i20];
                    k9.g = i22;
                    c1016a.f11231b = i18;
                    c1016a.f11232c = i19;
                    c1016a.f11233d = i21;
                    c1016a.f11234e = i22;
                    c1016a.b(k9);
                    i14++;
                    i3 = i16;
                }
                int i23 = i3;
                c1016a.f11235f = c1017b.f11249l;
                c1016a.f11236h = c1017b.f11250m;
                c1016a.g = true;
                c1016a.f11237i = c1017b.f11252o;
                c1016a.j = c1017b.f11253p;
                c1016a.f11238k = c1017b.f11254q;
                c1016a.f11239l = c1017b.f11255r;
                c1016a.f11240m = c1017b.f11256s;
                c1016a.f11241n = c1017b.f11257t;
                c1016a.f11242o = c1017b.f11258u;
                c1016a.f11245r = c1017b.f11251n;
                int i24 = 0;
                while (true) {
                    java.util.ArrayList arrayList3 = c1017b.f11247i;
                    if (i24 >= arrayList3.size()) {
                        break;
                    }
                    java.lang.String str4 = (java.lang.String) arrayList3.get(i24);
                    if (str4 != null) {
                        ((Y1.K) c1016a.f11230a.get(i24)).f11221b = mVar.w(str4);
                    }
                    i24++;
                }
                c1016a.c(1);
                if (G(i23)) {
                    java.lang.StringBuilder sbT = p121o0.p.t(i12, "restoreAllState: back stack #", " (index ");
                    sbT.append(c1016a.f11245r);
                    sbT.append("): ");
                    sbT.append(c1016a);
                    android.util.Log.v("FragmentManager", sbT.toString());
                    java.io.PrintWriter printWriter = new java.io.PrintWriter(new Y1.M());
                    c1016a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f11169d.add(c1016a);
                i12++;
                i3 = i23;
            }
            i9 = 0;
        } else {
            i9 = 0;
            this.f11169d = null;
        }
        this.f11173i.set(e6.f11191k);
        java.lang.String str5 = e6.f11192l;
        if (str5 != null) {
            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029nW2 = mVar.w(str5);
            this.f11186w = abstractComponentCallbacksC1029nW2;
            q(abstractComponentCallbacksC1029nW2);
        }
        java.util.ArrayList arrayList4 = e6.f11193m;
        if (arrayList4 != null) {
            for (int i25 = i9; i25 < arrayList4.size(); i25++) {
                this.j.put((java.lang.String) arrayList4.get(i25), (Y1.C1018c) e6.f11194n.get(i25));
            }
        }
        this.f11156C = new java.util.ArrayDeque(e6.f11195o);
    }

    public final android.os.Bundle S() {
        int i3;
        java.util.ArrayList arrayList;
        Y1.C1017b[] c1017bArr;
        int size;
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Y1.C1021f c1021f = (Y1.C1021f) it.next();
            if (c1021f.f11265e) {
                if (G(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c1021f.f11265e = false;
                c1021f.b();
            }
        }
        java.util.Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((Y1.C1021f) it2.next()).c();
        }
        y(true);
        this.f11158E = true;
        this.f11164L.g = true;
        A7.m mVar = this.f11168c;
        mVar.getClass();
        java.util.HashMap map = (java.util.HashMap) mVar.j;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
        java.util.Iterator it3 = map.values().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Y1.J j = (Y1.J) it3.next();
            if (j != null) {
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = j.f11217c;
                Y1.I i9 = new Y1.I(abstractComponentCallbacksC1029n);
                if (abstractComponentCallbacksC1029n.f11315h <= -1 || i9.f11214t != null) {
                    i9.f11214t = abstractComponentCallbacksC1029n.f11316i;
                } else {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    abstractComponentCallbacksC1029n.B(bundle2);
                    abstractComponentCallbacksC1029n.V.Q0(bundle2);
                    bundle2.putParcelable("android:support:fragments", abstractComponentCallbacksC1029n.f11295A.S());
                    j.f11215a.u(false);
                    android.os.Bundle bundle3 = bundle2.isEmpty() ? null : bundle2;
                    if (abstractComponentCallbacksC1029n.j != null) {
                        if (bundle3 == null) {
                            bundle3 = new android.os.Bundle();
                        }
                        bundle3.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC1029n.j);
                    }
                    if (abstractComponentCallbacksC1029n.f11317k != null) {
                        if (bundle3 == null) {
                            bundle3 = new android.os.Bundle();
                        }
                        bundle3.putBundle("android:view_registry_state", abstractComponentCallbacksC1029n.f11317k);
                    }
                    if (!abstractComponentCallbacksC1029n.f11306M) {
                        if (bundle3 == null) {
                            bundle3 = new android.os.Bundle();
                        }
                        bundle3.putBoolean("android:user_visible_hint", abstractComponentCallbacksC1029n.f11306M);
                    }
                    i9.f11214t = bundle3;
                    if (abstractComponentCallbacksC1029n.f11321o != null) {
                        if (bundle3 == null) {
                            i9.f11214t = new android.os.Bundle();
                        }
                        i9.f11214t.putString("android:target_state", abstractComponentCallbacksC1029n.f11321o);
                        int i10 = abstractComponentCallbacksC1029n.f11322p;
                        if (i10 != 0) {
                            i9.f11214t.putInt("android:target_req_state", i10);
                        }
                    }
                }
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n2 = j.f11217c;
                arrayList2.add(abstractComponentCallbacksC1029n2.f11318l);
                if (G(2)) {
                    android.util.Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC1029n2 + ": " + abstractComponentCallbacksC1029n2.f11316i);
                }
            }
        }
        A7.m mVar2 = this.f11168c;
        mVar2.getClass();
        java.util.ArrayList<Y1.I> arrayList3 = new java.util.ArrayList(((java.util.HashMap) mVar2.f322k).values());
        if (!arrayList3.isEmpty()) {
            A7.m mVar3 = this.f11168c;
            synchronized (((java.util.ArrayList) mVar3.f321i)) {
                try {
                    if (((java.util.ArrayList) mVar3.f321i).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new java.util.ArrayList(((java.util.ArrayList) mVar3.f321i).size());
                        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n3 : (java.util.ArrayList) mVar3.f321i) {
                            arrayList.add(abstractComponentCallbacksC1029n3.f11318l);
                            if (G(2)) {
                                android.util.Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC1029n3.f11318l + "): " + abstractComponentCallbacksC1029n3);
                            }
                        }
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
            java.util.ArrayList arrayList4 = this.f11169d;
            if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                c1017bArr = null;
            } else {
                c1017bArr = new Y1.C1017b[size];
                for (i3 = 0; i3 < size; i3++) {
                    c1017bArr[i3] = new Y1.C1017b((Y1.C1016a) this.f11169d.get(i3));
                    if (G(2)) {
                        java.lang.StringBuilder sbT = p121o0.p.t(i3, "saveAllState: adding back stack #", ": ");
                        sbT.append(this.f11169d.get(i3));
                        android.util.Log.v("FragmentManager", sbT.toString());
                    }
                }
            }
            Y1.E e6 = new Y1.E();
            e6.f11192l = null;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            e6.f11193m = arrayList5;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            e6.f11194n = arrayList6;
            e6.f11189h = arrayList2;
            e6.f11190i = arrayList;
            e6.j = c1017bArr;
            e6.f11191k = this.f11173i.get();
            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n4 = this.f11186w;
            if (abstractComponentCallbacksC1029n4 != null) {
                e6.f11192l = abstractComponentCallbacksC1029n4.f11318l;
            }
            arrayList5.addAll(this.j.keySet());
            arrayList6.addAll(this.j.values());
            e6.f11195o = new java.util.ArrayList(this.f11156C);
            bundle.putParcelable(io.sentry.protocol.SentryThread.JsonKeys.STATE, e6);
            for (java.lang.String str : this.f11174k.keySet()) {
                bundle.putBundle(p121o0.p.C("result_", str), (android.os.Bundle) this.f11174k.get(str));
            }
            for (Y1.I i11 : arrayList3) {
                android.os.Bundle bundle4 = new android.os.Bundle();
                bundle4.putParcelable(io.sentry.protocol.SentryThread.JsonKeys.STATE, i11);
                bundle.putBundle("fragment_" + i11.f11204i, bundle4);
            }
        } else if (G(2)) {
            android.util.Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle;
        }
        return bundle;
    }

    public final void T() {
        synchronized (this.f11166a) {
            try {
                if (this.f11166a.size() == 1) {
                    this.f11183t.f11338t.removeCallbacks(this.f11165M);
                    this.f11183t.f11338t.post(this.f11165M);
                    b0();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void U(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n, boolean z6) {
        android.view.ViewGroup viewGroupC = C(abstractComponentCallbacksC1029n);
        if (viewGroupC == null || !(viewGroupC instanceof Y1.r)) {
            return;
        }
        ((Y1.r) viewGroupC).setDrawDisappearingViewsLast(!z6);
    }

    public final void V(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n, androidx.lifecycle.EnumC1533o enumC1533o) {
        if (abstractComponentCallbacksC1029n.equals(this.f11168c.w(abstractComponentCallbacksC1029n.f11318l)) && (abstractComponentCallbacksC1029n.f11331z == null || abstractComponentCallbacksC1029n.y == this)) {
            abstractComponentCallbacksC1029n.f11311R = enumC1533o;
            return;
        }
        throw new java.lang.IllegalArgumentException("Fragment " + abstractComponentCallbacksC1029n + " is not an active fragment of FragmentManager " + this);
    }

    public final void W(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (abstractComponentCallbacksC1029n != null) {
            if (!abstractComponentCallbacksC1029n.equals(this.f11168c.w(abstractComponentCallbacksC1029n.f11318l)) || (abstractComponentCallbacksC1029n.f11331z != null && abstractComponentCallbacksC1029n.y != this)) {
                throw new java.lang.IllegalArgumentException("Fragment " + abstractComponentCallbacksC1029n + " is not an active fragment of FragmentManager " + this);
            }
        }
        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n2 = this.f11186w;
        this.f11186w = abstractComponentCallbacksC1029n;
        q(abstractComponentCallbacksC1029n2);
        q(this.f11186w);
    }

    public final void X(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        android.view.ViewGroup viewGroupC = C(abstractComponentCallbacksC1029n);
        if (viewGroupC != null) {
            Y1.C1028m c1028m = abstractComponentCallbacksC1029n.f11307N;
            if ((c1028m == null ? 0 : c1028m.f11290e) + (c1028m == null ? 0 : c1028m.f11289d) + (c1028m == null ? 0 : c1028m.f11288c) + (c1028m == null ? 0 : c1028m.f11287b) > 0) {
                if (viewGroupC.getTag(com.kiptv.tv.R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupC.setTag(com.kiptv.tv.R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC1029n);
                }
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n2 = (Y1.AbstractComponentCallbacksC1029n) viewGroupC.getTag(com.kiptv.tv.R.id.visible_removing_fragment_view_tag);
                Y1.C1028m c1028m2 = abstractComponentCallbacksC1029n.f11307N;
                boolean z6 = c1028m2 != null ? c1028m2.f11286a : false;
                if (abstractComponentCallbacksC1029n2.f11307N == null) {
                    return;
                }
                abstractComponentCallbacksC1029n2.k().f11286a = z6;
            }
        }
    }

    public final void Z() {
        for (Y1.J j : this.f11168c.C()) {
            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = j.f11217c;
            if (abstractComponentCallbacksC1029n.f11305L) {
                if (this.f11167b) {
                    this.H = true;
                } else {
                    abstractComponentCallbacksC1029n.f11305L = false;
                    j.j();
                }
            }
        }
    }

    public final Y1.J a(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        java.lang.String str = abstractComponentCallbacksC1029n.f11310Q;
        if (str != null) {
            Z1.d.c(abstractComponentCallbacksC1029n, str);
        }
        if (G(2)) {
            android.util.Log.v("FragmentManager", "add: " + abstractComponentCallbacksC1029n);
        }
        Y1.J jF = f(abstractComponentCallbacksC1029n);
        abstractComponentCallbacksC1029n.y = this;
        A7.m mVar = this.f11168c;
        mVar.K(jF);
        if (!abstractComponentCallbacksC1029n.f11301G) {
            mVar.l(abstractComponentCallbacksC1029n);
            abstractComponentCallbacksC1029n.f11325s = false;
            abstractComponentCallbacksC1029n.f11308O = false;
            if (H(abstractComponentCallbacksC1029n)) {
                this.f11157D = true;
            }
        }
        return jF;
    }

    public final void a0(java.lang.IllegalStateException illegalStateException) {
        android.util.Log.e("FragmentManager", illegalStateException.getMessage());
        android.util.Log.e("FragmentManager", "Activity state:");
        java.io.PrintWriter printWriter = new java.io.PrintWriter(new Y1.M());
        Y1.q qVar = this.f11183t;
        if (qVar == null) {
            try {
                v("  ", null, printWriter, new java.lang.String[0]);
                throw illegalStateException;
            } catch (java.lang.Exception e6) {
                android.util.Log.e("FragmentManager", "Failed dumping state", e6);
                throw illegalStateException;
            }
        }
        try {
            qVar.f11340v.dump("  ", null, printWriter, new java.lang.String[0]);
            throw illegalStateException;
        } catch (java.lang.Exception e9) {
            android.util.Log.e("FragmentManager", "Failed dumping state", e9);
            throw illegalStateException;
        }
    }

    public final void b(Y1.q qVar, E8.l lVar, Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (this.f11183t != null) {
            throw new java.lang.IllegalStateException("Already attached");
        }
        this.f11183t = qVar;
        this.f11184u = lVar;
        this.f11185v = abstractComponentCallbacksC1029n;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f11176m;
        if (abstractComponentCallbacksC1029n != null) {
            copyOnWriteArrayList.add(new Y1.y(abstractComponentCallbacksC1029n));
        } else if (qVar != null) {
            copyOnWriteArrayList.add(qVar);
        }
        if (this.f11185v != null) {
            b0();
        }
        if (qVar != null) {
            p019c.u uVarA = qVar.f11340v.a();
            this.g = uVarA;
            uVarA.a(abstractComponentCallbacksC1029n != null ? abstractComponentCallbacksC1029n : qVar, this.f11172h);
        }
        if (abstractComponentCallbacksC1029n != null) {
            Y1.G g = abstractComponentCallbacksC1029n.y.f11164L;
            java.util.HashMap map = g.f11199c;
            Y1.G g9 = (Y1.G) map.get(abstractComponentCallbacksC1029n.f11318l);
            if (g9 == null) {
                g9 = new Y1.G(g.f11201e);
                map.put(abstractComponentCallbacksC1029n.f11318l, g9);
            }
            this.f11164L = g9;
        } else if (qVar != null) {
            androidx.lifecycle.j0 j0VarE = qVar.f11340v.e();
            Y1.F f9 = Y1.G.f11197h;
            p040e2.a defaultCreationExtras = p040e2.a.f21364b;
            kotlin.jvm.internal.m.e(defaultCreationExtras, "defaultCreationExtras");
            A7.m mVar = new A7.m(j0VarE, f9, defaultCreationExtras);
            E6.InterfaceC0331d interfaceC0331dA = com.google.android.gms.internal.play_billing.AbstractC1833d1.A(Y1.G.class);
            java.lang.String strG = interfaceC0331dA.g();
            if (strG == null) {
                throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f11164L = (Y1.G) mVar.I(interfaceC0331dA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG));
        } else {
            this.f11164L = new Y1.G(false);
        }
        Y1.G g10 = this.f11164L;
        g10.g = this.f11158E || this.f11159F;
        this.f11168c.f323l = g10;
        Y1.q qVar2 = this.f11183t;
        if (qVar2 != null && abstractComponentCallbacksC1029n == null) {
            p079i7.f fVarG = qVar2.g();
            fVarG.R0("android:support:fragments", new R0.C0849t0(2, this));
            android.os.Bundle bundleI0 = fVarG.I0("android:support:fragments");
            if (bundleI0 != null) {
                R(bundleI0);
            }
        }
        Y1.q qVar3 = this.f11183t;
        if (qVar3 != null) {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = qVar3.f11340v;
            java.lang.String strC = p121o0.p.C("FragmentManager:", abstractComponentCallbacksC1029n != null ? Y6.f.m(new java.lang.StringBuilder(), abstractComponentCallbacksC1029n.f11318l, ":") : "");
            java.lang.String strO = p121o0.p.o(strC, "StartActivityForResult");
            Y1.z zVar = new Y1.z(3);
            A.a aVar = new A.a(26, this);
            p019c.i iVar = signInHubActivity.f18056p;
            this.f11188z = iVar.c(strO, zVar, aVar);
            this.f11154A = iVar.c(p121o0.p.o(strC, "StartIntentSenderForResult"), new Y1.z(0), new Y1.u(this, 1));
            this.f11155B = iVar.c(p121o0.p.o(strC, "RequestPermissions"), new Y1.z(1), new Y1.u(this, 0));
        }
        Y1.q qVar4 = this.f11183t;
        if (qVar4 != null) {
            qVar4.f11340v.i(this.f11177n);
        }
        Y1.q qVar5 = this.f11183t;
        if (qVar5 != null) {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity2 = qVar5.f11340v;
            Y1.t listener = this.f11178o;
            signInHubActivity2.getClass();
            kotlin.jvm.internal.m.e(listener, "listener");
            signInHubActivity2.f18058r.add(listener);
        }
        Y1.q qVar6 = this.f11183t;
        if (qVar6 != null) {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity3 = qVar6.f11340v;
            Y1.t listener2 = this.f11179p;
            signInHubActivity3.getClass();
            kotlin.jvm.internal.m.e(listener2, "listener");
            signInHubActivity3.f18060t.add(listener2);
        }
        Y1.q qVar7 = this.f11183t;
        if (qVar7 != null) {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity4 = qVar7.f11340v;
            Y1.t listener3 = this.f11180q;
            signInHubActivity4.getClass();
            kotlin.jvm.internal.m.e(listener3, "listener");
            signInHubActivity4.f18061u.add(listener3);
        }
        Y1.q qVar8 = this.f11183t;
        if (qVar8 == null || abstractComponentCallbacksC1029n != null) {
            return;
        }
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity5 = qVar8.f11340v;
        Y1.w provider = this.f11181r;
        signInHubActivity5.getClass();
        kotlin.jvm.internal.m.e(provider, "provider");
        android.support.v4.media.session.q qVar9 = signInHubActivity5.j;
        ((java.util.concurrent.CopyOnWriteArrayList) qVar9.j).add(provider);
        ((java.lang.Runnable) qVar9.f15617i).run();
    }

    public final void b0() {
        synchronized (this.f11166a) {
            try {
                if (!this.f11166a.isEmpty()) {
                    this.f11172h.f(true);
                    return;
                }
                Y1.v vVar = this.f11172h;
                java.util.ArrayList arrayList = this.f11169d;
                vVar.f((arrayList != null ? arrayList.size() : 0) > 0 && K(this.f11185v));
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (G(2)) {
            android.util.Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC1029n);
        }
        if (abstractComponentCallbacksC1029n.f11301G) {
            abstractComponentCallbacksC1029n.f11301G = false;
            if (abstractComponentCallbacksC1029n.f11324r) {
                return;
            }
            this.f11168c.l(abstractComponentCallbacksC1029n);
            if (G(2)) {
                android.util.Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC1029n);
            }
            if (H(abstractComponentCallbacksC1029n)) {
                this.f11157D = true;
            }
        }
    }

    public final void d() {
        this.f11167b = false;
        this.f11162J.clear();
        this.f11161I.clear();
    }

    public final java.util.HashSet e() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.f11168c.C().iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup = ((Y1.J) it.next()).f11217c.f11304K;
            if (viewGroup != null) {
                hashSet.add(Y1.C1021f.d(viewGroup, E()));
            }
        }
        return hashSet;
    }

    public final Y1.J f(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        java.lang.String str = abstractComponentCallbacksC1029n.f11318l;
        A7.m mVar = this.f11168c;
        Y1.J j = (Y1.J) ((java.util.HashMap) mVar.j).get(str);
        if (j != null) {
            return j;
        }
        Y1.J j9 = new Y1.J(this.f11175l, mVar, abstractComponentCallbacksC1029n);
        j9.l(this.f11183t.f11337s.getClassLoader());
        j9.f11219e = this.f11182s;
        return j9;
    }

    public final void g(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (G(2)) {
            android.util.Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC1029n);
        }
        if (abstractComponentCallbacksC1029n.f11301G) {
            return;
        }
        abstractComponentCallbacksC1029n.f11301G = true;
        if (abstractComponentCallbacksC1029n.f11324r) {
            if (G(2)) {
                android.util.Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC1029n);
            }
            A7.m mVar = this.f11168c;
            synchronized (((java.util.ArrayList) mVar.f321i)) {
                ((java.util.ArrayList) mVar.f321i).remove(abstractComponentCallbacksC1029n);
            }
            abstractComponentCallbacksC1029n.f11324r = false;
            if (H(abstractComponentCallbacksC1029n)) {
                this.f11157D = true;
            }
            X(abstractComponentCallbacksC1029n);
        }
    }

    public final void h(boolean z6) {
        if (z6 && this.f11183t != null) {
            a0(new java.lang.IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n : this.f11168c.F()) {
            if (abstractComponentCallbacksC1029n != null) {
                abstractComponentCallbacksC1029n.f11303J = true;
                if (z6) {
                    abstractComponentCallbacksC1029n.f11295A.h(true);
                }
            }
        }
    }

    public final boolean i() {
        if (this.f11182s < 1) {
            return false;
        }
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n : this.f11168c.F()) {
            if (abstractComponentCallbacksC1029n != null) {
                if (!abstractComponentCallbacksC1029n.f11300F ? abstractComponentCallbacksC1029n.f11295A.i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean j() {
        if (this.f11182s < 1) {
            return false;
        }
        java.util.ArrayList arrayList = null;
        boolean z6 = false;
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n : this.f11168c.F()) {
            if (abstractComponentCallbacksC1029n != null && J(abstractComponentCallbacksC1029n)) {
                if (!abstractComponentCallbacksC1029n.f11300F ? abstractComponentCallbacksC1029n.f11295A.j() : false) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC1029n);
                    z6 = true;
                }
            }
        }
        if (this.f11170e != null) {
            for (int i3 = 0; i3 < this.f11170e.size(); i3++) {
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n2 = (Y1.AbstractComponentCallbacksC1029n) this.f11170e.get(i3);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC1029n2)) {
                    abstractComponentCallbacksC1029n2.getClass();
                }
            }
        }
        this.f11170e = arrayList;
        return z6;
    }

    public final void k() {
        boolean zIsChangingConfigurations = true;
        this.f11160G = true;
        y(true);
        java.util.Iterator it = e().iterator();
        while (it.hasNext()) {
            ((Y1.C1021f) it.next()).c();
        }
        Y1.q qVar = this.f11183t;
        A7.m mVar = this.f11168c;
        if (qVar != null) {
            zIsChangingConfigurations = ((Y1.G) mVar.f323l).f11202f;
        } else {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity = qVar.f11337s;
            if (signInHubActivity != null) {
                zIsChangingConfigurations = true ^ signInHubActivity.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            java.util.Iterator it2 = this.j.values().iterator();
            while (it2.hasNext()) {
                for (java.lang.String str : ((Y1.C1018c) it2.next()).f11259h) {
                    Y1.G g = (Y1.G) mVar.f323l;
                    g.getClass();
                    if (G(3)) {
                        android.util.Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    g.f(str);
                }
            }
        }
        t(-1);
        Y1.q qVar2 = this.f11183t;
        if (qVar2 != null) {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity2 = qVar2.f11340v;
            Y1.t listener = this.f11178o;
            signInHubActivity2.getClass();
            kotlin.jvm.internal.m.e(listener, "listener");
            signInHubActivity2.f18058r.remove(listener);
        }
        Y1.q qVar3 = this.f11183t;
        if (qVar3 != null) {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity3 = qVar3.f11340v;
            Y1.t listener2 = this.f11177n;
            signInHubActivity3.getClass();
            kotlin.jvm.internal.m.e(listener2, "listener");
            signInHubActivity3.f18057q.remove(listener2);
        }
        Y1.q qVar4 = this.f11183t;
        if (qVar4 != null) {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity4 = qVar4.f11340v;
            Y1.t listener3 = this.f11179p;
            signInHubActivity4.getClass();
            kotlin.jvm.internal.m.e(listener3, "listener");
            signInHubActivity4.f18060t.remove(listener3);
        }
        Y1.q qVar5 = this.f11183t;
        if (qVar5 != null) {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity5 = qVar5.f11340v;
            Y1.t listener4 = this.f11180q;
            signInHubActivity5.getClass();
            kotlin.jvm.internal.m.e(listener4, "listener");
            signInHubActivity5.f18061u.remove(listener4);
        }
        Y1.q qVar6 = this.f11183t;
        if (qVar6 != null && this.f11185v == null) {
            com.google.android.gms.auth.api.signin.internal.SignInHubActivity signInHubActivity6 = qVar6.f11340v;
            Y1.w provider = this.f11181r;
            signInHubActivity6.getClass();
            kotlin.jvm.internal.m.e(provider, "provider");
            android.support.v4.media.session.q qVar7 = signInHubActivity6.j;
            ((java.util.concurrent.CopyOnWriteArrayList) qVar7.j).remove(provider);
            if (((java.util.HashMap) qVar7.f15618k).remove(provider) != null) {
                throw new java.lang.ClassCastException();
            }
            ((java.lang.Runnable) qVar7.f15617i).run();
        }
        this.f11183t = null;
        this.f11184u = null;
        this.f11185v = null;
        if (this.g != null) {
            this.f11172h.e();
            this.g = null;
        }
        p046f.g gVar = this.f11188z;
        if (gVar != null) {
            gVar.f21617e.e(gVar.f21618f);
            p046f.g gVar2 = this.f11154A;
            gVar2.f21617e.e(gVar2.f21618f);
            p046f.g gVar3 = this.f11155B;
            gVar3.f21617e.e(gVar3.f21618f);
        }
    }

    public final void l(boolean z6) {
        if (z6 && this.f11183t != null) {
            a0(new java.lang.IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n : this.f11168c.F()) {
            if (abstractComponentCallbacksC1029n != null) {
                abstractComponentCallbacksC1029n.f11303J = true;
                if (z6) {
                    abstractComponentCallbacksC1029n.f11295A.l(true);
                }
            }
        }
    }

    public final void m(boolean z6) {
        if (z6 && this.f11183t != null) {
            a0(new java.lang.IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n : this.f11168c.F()) {
            if (abstractComponentCallbacksC1029n != null && z6) {
                abstractComponentCallbacksC1029n.f11295A.m(true);
            }
        }
    }

    public final void n() {
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n : this.f11168c.D()) {
            if (abstractComponentCallbacksC1029n != null) {
                abstractComponentCallbacksC1029n.q();
                abstractComponentCallbacksC1029n.f11295A.n();
            }
        }
    }

    public final boolean o() {
        if (this.f11182s >= 1) {
            for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n : this.f11168c.F()) {
                if (abstractComponentCallbacksC1029n != null) {
                    if (!abstractComponentCallbacksC1029n.f11300F ? abstractComponentCallbacksC1029n.f11295A.o() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p() {
        if (this.f11182s < 1) {
            return;
        }
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n : this.f11168c.F()) {
            if (abstractComponentCallbacksC1029n != null && !abstractComponentCallbacksC1029n.f11300F) {
                abstractComponentCallbacksC1029n.f11295A.p();
            }
        }
    }

    public final void q(Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n) {
        if (abstractComponentCallbacksC1029n != null) {
            if (abstractComponentCallbacksC1029n.equals(this.f11168c.w(abstractComponentCallbacksC1029n.f11318l))) {
                abstractComponentCallbacksC1029n.y.getClass();
                boolean zK = K(abstractComponentCallbacksC1029n);
                java.lang.Boolean bool = abstractComponentCallbacksC1029n.f11323q;
                if (bool == null || bool.booleanValue() != zK) {
                    abstractComponentCallbacksC1029n.f11323q = java.lang.Boolean.valueOf(zK);
                    Y1.D d4 = abstractComponentCallbacksC1029n.f11295A;
                    d4.b0();
                    d4.q(d4.f11186w);
                }
            }
        }
    }

    public final void r(boolean z6) {
        if (z6 && this.f11183t != null) {
            a0(new java.lang.IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n : this.f11168c.F()) {
            if (abstractComponentCallbacksC1029n != null && z6) {
                abstractComponentCallbacksC1029n.f11295A.r(true);
            }
        }
    }

    public final boolean s() {
        if (this.f11182s < 1) {
            return false;
        }
        boolean z6 = false;
        for (Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n : this.f11168c.F()) {
            if (abstractComponentCallbacksC1029n != null && J(abstractComponentCallbacksC1029n)) {
                if (!abstractComponentCallbacksC1029n.f11300F ? abstractComponentCallbacksC1029n.f11295A.s() : false) {
                    z6 = true;
                }
            }
        }
        return z6;
    }

    public final void t(int i3) {
        try {
            this.f11167b = true;
            for (Y1.J j : ((java.util.HashMap) this.f11168c.j).values()) {
                if (j != null) {
                    j.f11219e = i3;
                }
            }
            L(i3, false);
            java.util.Iterator it = e().iterator();
            while (it.hasNext()) {
                ((Y1.C1021f) it.next()).c();
            }
            this.f11167b = false;
            y(true);
        } catch (java.lang.Throwable th) {
            this.f11167b = false;
            throw th;
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" in ");
        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = this.f11185v;
        if (abstractComponentCallbacksC1029n != null) {
            sb.append(abstractComponentCallbacksC1029n.getClass().getSimpleName());
            sb.append("{");
            sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.f11185v)));
            sb.append("}");
        } else {
            Y1.q qVar = this.f11183t;
            if (qVar != null) {
                sb.append(qVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this.f11183t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u() {
        if (this.H) {
            this.H = false;
            Z();
        }
    }

    public final void v(java.lang.String str, java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        int size;
        int size2;
        java.lang.String strO = p121o0.p.o(str, "    ");
        A7.m mVar = this.f11168c;
        mVar.getClass();
        java.lang.String str2 = str + "    ";
        java.util.HashMap map = (java.util.HashMap) mVar.j;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (Y1.J j : map.values()) {
                printWriter.print(str);
                if (j != null) {
                    Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = j.f11217c;
                    printWriter.println(abstractComponentCallbacksC1029n);
                    abstractComponentCallbacksC1029n.j(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) mVar.f321i;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size3; i3++) {
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n2 = (Y1.AbstractComponentCallbacksC1029n) arrayList.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1029n2.toString());
            }
        }
        java.util.ArrayList arrayList2 = this.f11170e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i9 = 0; i9 < size2; i9++) {
                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n3 = (Y1.AbstractComponentCallbacksC1029n) this.f11170e.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1029n3.toString());
            }
        }
        java.util.ArrayList arrayList3 = this.f11169d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i10 = 0; i10 < size; i10++) {
                Y1.C1016a c1016a = (Y1.C1016a) this.f11169d.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(c1016a.toString());
                c1016a.f(strO, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f11173i.get());
        synchronized (this.f11166a) {
            try {
                int size4 = this.f11166a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i11 = 0; i11 < size4; i11++) {
                        java.lang.Object obj = (Y1.B) this.f11166a.get(i11);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i11);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f11183t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f11184u);
        if (this.f11185v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f11185v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f11182s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f11158E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f11159F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f11160G);
        if (this.f11157D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f11157D);
        }
    }

    public final void w(Y1.B b9, boolean z6) {
        if (!z6) {
            if (this.f11183t == null) {
                if (!this.f11160G) {
                    throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f11158E || this.f11159F) {
                throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f11166a) {
            try {
                if (this.f11183t == null) {
                    if (!z6) {
                        throw new java.lang.IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f11166a.add(b9);
                    T();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void x(boolean z6) {
        if (this.f11167b) {
            throw new java.lang.IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f11183t == null) {
            if (!this.f11160G) {
                throw new java.lang.IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new java.lang.IllegalStateException("FragmentManager has been destroyed");
        }
        if (android.os.Looper.myLooper() != this.f11183t.f11338t.getLooper()) {
            throw new java.lang.IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z6 && (this.f11158E || this.f11159F)) {
            throw new java.lang.IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f11161I == null) {
            this.f11161I = new java.util.ArrayList();
            this.f11162J = new java.util.ArrayList();
        }
    }

    public final boolean y(boolean z6) {
        boolean zA;
        x(z6);
        boolean z9 = false;
        while (true) {
            java.util.ArrayList arrayList = this.f11161I;
            java.util.ArrayList arrayList2 = this.f11162J;
            synchronized (this.f11166a) {
                if (this.f11166a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f11166a.size();
                        zA = false;
                        for (int i3 = 0; i3 < size; i3++) {
                            zA |= ((Y1.B) this.f11166a.get(i3)).a(arrayList, arrayList2);
                        }
                        this.f11166a.clear();
                        this.f11183t.f11338t.removeCallbacks(this.f11165M);
                    } catch (java.lang.Throwable th) {
                        this.f11166a.clear();
                        this.f11183t.f11338t.removeCallbacks(this.f11165M);
                        throw th;
                    }
                }
            }
            if (!zA) {
                b0();
                u();
                ((java.util.HashMap) this.f11168c.j).values().removeAll(java.util.Collections.singleton(null));
                return z9;
            }
            z9 = true;
            this.f11167b = true;
            try {
                Q(this.f11161I, this.f11162J);
                d();
            } catch (java.lang.Throwable th2) {
                d();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x022a A[PHI: r13
  0x022a: PHI (r13v10 char) = (r13v9 char), (r13v11 char) binds: [B:106:0x021a, B:111:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0178  */
    public final void z(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i3, int i9) {
        android.view.ViewGroup viewGroup;
        boolean z6;
        int i10;
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        boolean z12 = ((Y1.C1016a) arrayList.get(i3)).f11242o;
        java.util.ArrayList arrayList3 = this.f11163K;
        if (arrayList3 == null) {
            this.f11163K = new java.util.ArrayList();
        } else {
            arrayList3.clear();
        }
        java.util.ArrayList arrayList4 = this.f11163K;
        A7.m mVar = this.f11168c;
        arrayList4.addAll(mVar.F());
        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n = this.f11186w;
        int i14 = i3;
        boolean z13 = false;
        while (true) {
            int i15 = 1;
            if (i14 >= i9) {
                boolean z14 = z12;
                this.f11163K.clear();
                if (!z14 && this.f11182s >= 1) {
                    for (int i16 = i3; i16 < i9; i16++) {
                        java.util.Iterator it = ((Y1.C1016a) arrayList.get(i16)).f11230a.iterator();
                        while (it.hasNext()) {
                            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n2 = ((Y1.K) it.next()).f11221b;
                            if (abstractComponentCallbacksC1029n2 != null && abstractComponentCallbacksC1029n2.y != null) {
                                mVar.K(f(abstractComponentCallbacksC1029n2));
                            }
                        }
                    }
                }
                for (int i17 = i3; i17 < i9; i17++) {
                    Y1.C1016a c1016a = (Y1.C1016a) arrayList.get(i17);
                    if (((java.lang.Boolean) arrayList2.get(i17)).booleanValue()) {
                        c1016a.c(-1);
                        java.util.ArrayList arrayList5 = c1016a.f11230a;
                        boolean z15 = true;
                        for (int size = arrayList5.size() - 1; size >= 0; size--) {
                            Y1.K k9 = (Y1.K) arrayList5.get(size);
                            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n3 = k9.f11221b;
                            if (abstractComponentCallbacksC1029n3 != null) {
                                if (abstractComponentCallbacksC1029n3.f11307N != null) {
                                    abstractComponentCallbacksC1029n3.k().f11286a = z15;
                                }
                                int i18 = c1016a.f11235f;
                                char c9 = 8194;
                                char c10 = 4097;
                                if (i18 != 4097) {
                                    if (i18 != 8194) {
                                        c9 = 4100;
                                        c10 = 8197;
                                        if (i18 != 8197) {
                                            if (i18 == 4099) {
                                                c9 = 4099;
                                            } else if (i18 != 4100) {
                                                c9 = 0;
                                            } else {
                                                c9 = c10;
                                            }
                                        }
                                    } else {
                                        c9 = c10;
                                    }
                                }
                                if (abstractComponentCallbacksC1029n3.f11307N != null || c9 != 0) {
                                    abstractComponentCallbacksC1029n3.k();
                                    abstractComponentCallbacksC1029n3.f11307N.getClass();
                                }
                                abstractComponentCallbacksC1029n3.k();
                                abstractComponentCallbacksC1029n3.f11307N.getClass();
                            }
                            int i19 = k9.f11220a;
                            Y1.D d4 = c1016a.f11243p;
                            switch (i19) {
                                case 1:
                                    abstractComponentCallbacksC1029n3.G(k9.f11223d, k9.f11224e, k9.f11225f, k9.g);
                                    z15 = true;
                                    d4.U(abstractComponentCallbacksC1029n3, true);
                                    d4.P(abstractComponentCallbacksC1029n3);
                                    break;
                                case 2:
                                default:
                                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + k9.f11220a);
                                case 3:
                                    abstractComponentCallbacksC1029n3.G(k9.f11223d, k9.f11224e, k9.f11225f, k9.g);
                                    d4.a(abstractComponentCallbacksC1029n3);
                                    z15 = true;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC1029n3.G(k9.f11223d, k9.f11224e, k9.f11225f, k9.g);
                                    d4.getClass();
                                    Y(abstractComponentCallbacksC1029n3);
                                    z15 = true;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC1029n3.G(k9.f11223d, k9.f11224e, k9.f11225f, k9.g);
                                    d4.U(abstractComponentCallbacksC1029n3, true);
                                    d4.F(abstractComponentCallbacksC1029n3);
                                    z15 = true;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC1029n3.G(k9.f11223d, k9.f11224e, k9.f11225f, k9.g);
                                    d4.c(abstractComponentCallbacksC1029n3);
                                    z15 = true;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC1029n3.G(k9.f11223d, k9.f11224e, k9.f11225f, k9.g);
                                    d4.U(abstractComponentCallbacksC1029n3, true);
                                    d4.g(abstractComponentCallbacksC1029n3);
                                    z15 = true;
                                    break;
                                case 8:
                                    d4.W(null);
                                    z15 = true;
                                    break;
                                case 9:
                                    d4.W(abstractComponentCallbacksC1029n3);
                                    z15 = true;
                                    break;
                                case 10:
                                    d4.V(abstractComponentCallbacksC1029n3, k9.f11226h);
                                    z15 = true;
                                    break;
                            }
                        }
                    } else {
                        c1016a.c(1);
                        java.util.ArrayList arrayList6 = c1016a.f11230a;
                        int size2 = arrayList6.size();
                        for (int i20 = 0; i20 < size2; i20++) {
                            Y1.K k10 = (Y1.K) arrayList6.get(i20);
                            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n4 = k10.f11221b;
                            if (abstractComponentCallbacksC1029n4 != null) {
                                if (abstractComponentCallbacksC1029n4.f11307N != null) {
                                    abstractComponentCallbacksC1029n4.k().f11286a = false;
                                }
                                int i21 = c1016a.f11235f;
                                if (abstractComponentCallbacksC1029n4.f11307N != null || i21 != 0) {
                                    abstractComponentCallbacksC1029n4.k();
                                    abstractComponentCallbacksC1029n4.f11307N.getClass();
                                }
                                abstractComponentCallbacksC1029n4.k();
                                abstractComponentCallbacksC1029n4.f11307N.getClass();
                            }
                            int i22 = k10.f11220a;
                            Y1.D d6 = c1016a.f11243p;
                            switch (i22) {
                                case 1:
                                    abstractComponentCallbacksC1029n4.G(k10.f11223d, k10.f11224e, k10.f11225f, k10.g);
                                    d6.U(abstractComponentCallbacksC1029n4, false);
                                    d6.a(abstractComponentCallbacksC1029n4);
                                    break;
                                case 2:
                                default:
                                    throw new java.lang.IllegalArgumentException("Unknown cmd: " + k10.f11220a);
                                case 3:
                                    abstractComponentCallbacksC1029n4.G(k10.f11223d, k10.f11224e, k10.f11225f, k10.g);
                                    d6.P(abstractComponentCallbacksC1029n4);
                                    break;
                                case 4:
                                    abstractComponentCallbacksC1029n4.G(k10.f11223d, k10.f11224e, k10.f11225f, k10.g);
                                    d6.F(abstractComponentCallbacksC1029n4);
                                    break;
                                case 5:
                                    abstractComponentCallbacksC1029n4.G(k10.f11223d, k10.f11224e, k10.f11225f, k10.g);
                                    d6.U(abstractComponentCallbacksC1029n4, false);
                                    Y(abstractComponentCallbacksC1029n4);
                                    break;
                                case 6:
                                    abstractComponentCallbacksC1029n4.G(k10.f11223d, k10.f11224e, k10.f11225f, k10.g);
                                    d6.g(abstractComponentCallbacksC1029n4);
                                    break;
                                case 7:
                                    abstractComponentCallbacksC1029n4.G(k10.f11223d, k10.f11224e, k10.f11225f, k10.g);
                                    d6.U(abstractComponentCallbacksC1029n4, false);
                                    d6.c(abstractComponentCallbacksC1029n4);
                                    break;
                                case 8:
                                    d6.W(abstractComponentCallbacksC1029n4);
                                    break;
                                case 9:
                                    d6.W(null);
                                    break;
                                case 10:
                                    d6.V(abstractComponentCallbacksC1029n4, k10.f11227i);
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((java.lang.Boolean) arrayList2.get(i9 - 1)).booleanValue();
                for (int i23 = i3; i23 < i9; i23++) {
                    Y1.C1016a c1016a2 = (Y1.C1016a) arrayList.get(i23);
                    if (zBooleanValue) {
                        for (int size3 = c1016a2.f11230a.size() - 1; size3 >= 0; size3--) {
                            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n5 = ((Y1.K) c1016a2.f11230a.get(size3)).f11221b;
                            if (abstractComponentCallbacksC1029n5 != null) {
                                f(abstractComponentCallbacksC1029n5).j();
                            }
                        }
                    } else {
                        java.util.Iterator it2 = c1016a2.f11230a.iterator();
                        while (it2.hasNext()) {
                            Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n6 = ((Y1.K) it2.next()).f11221b;
                            if (abstractComponentCallbacksC1029n6 != null) {
                                f(abstractComponentCallbacksC1029n6).j();
                            }
                        }
                    }
                }
                L(this.f11182s, true);
                java.util.HashSet<Y1.C1021f> hashSet = new java.util.HashSet();
                for (int i24 = i3; i24 < i9; i24++) {
                    java.util.Iterator it3 = ((Y1.C1016a) arrayList.get(i24)).f11230a.iterator();
                    while (it3.hasNext()) {
                        Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n7 = ((Y1.K) it3.next()).f11221b;
                        if (abstractComponentCallbacksC1029n7 != null && (viewGroup = abstractComponentCallbacksC1029n7.f11304K) != null) {
                            hashSet.add(Y1.C1021f.d(viewGroup, E()));
                        }
                    }
                }
                for (Y1.C1021f c1021f : hashSet) {
                    c1021f.f11264d = zBooleanValue;
                    synchronized (c1021f.f11262b) {
                        c1021f.e();
                        c1021f.f11265e = false;
                        int size4 = c1021f.f11262b.size() - 1;
                        if (size4 >= 0) {
                            ((Y1.N) c1021f.f11262b.get(size4)).getClass();
                            throw null;
                        }
                    }
                    c1021f.b();
                }
                for (int i25 = i3; i25 < i9; i25++) {
                    Y1.C1016a c1016a3 = (Y1.C1016a) arrayList.get(i25);
                    if (((java.lang.Boolean) arrayList2.get(i25)).booleanValue() && c1016a3.f11245r >= 0) {
                        c1016a3.f11245r = -1;
                    }
                    c1016a3.getClass();
                }
                return;
            }
            Y1.C1016a c1016a4 = (Y1.C1016a) arrayList.get(i14);
            if (((java.lang.Boolean) arrayList2.get(i14)).booleanValue()) {
                z6 = z12;
                i10 = i14;
                z9 = z13;
                int i26 = 1;
                java.util.ArrayList arrayList7 = this.f11163K;
                java.util.ArrayList arrayList8 = c1016a4.f11230a;
                int size5 = arrayList8.size() - 1;
                while (size5 >= 0) {
                    Y1.K k11 = (Y1.K) arrayList8.get(size5);
                    int i27 = k11.f11220a;
                    if (i27 != i26) {
                        if (i27 != 3) {
                            switch (i27) {
                                case 6:
                                    arrayList7.add(k11.f11221b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC1029n = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC1029n = k11.f11221b;
                                    break;
                                case 10:
                                    k11.f11227i = k11.f11226h;
                                    break;
                            }
                        } else {
                            arrayList7.add(k11.f11221b);
                        }
                        size5--;
                        i26 = 1;
                    }
                    arrayList7.remove(k11.f11221b);
                    size5--;
                    i26 = 1;
                }
            } else {
                java.util.ArrayList arrayList9 = this.f11163K;
                int i28 = 0;
                while (true) {
                    java.util.ArrayList arrayList10 = c1016a4.f11230a;
                    if (i28 < arrayList10.size()) {
                        Y1.K k12 = (Y1.K) arrayList10.get(i28);
                        int i29 = k12.f11220a;
                        if (i29 != i15) {
                            z10 = z12;
                            if (i29 != 2) {
                                if (i29 == 3 || i29 == 6) {
                                    arrayList9.remove(k12.f11221b);
                                    Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n8 = k12.f11221b;
                                    if (abstractComponentCallbacksC1029n8 == abstractComponentCallbacksC1029n) {
                                        arrayList10.add(i28, new Y1.K(9, abstractComponentCallbacksC1029n8));
                                        i28++;
                                        i12 = i14;
                                        z11 = z13;
                                        i11 = 1;
                                        abstractComponentCallbacksC1029n = null;
                                    }
                                } else if (i29 == 7) {
                                    i11 = 1;
                                } else if (i29 == 8) {
                                    arrayList10.add(i28, new Y1.K(9, abstractComponentCallbacksC1029n, 0));
                                    k12.f11222c = true;
                                    i28++;
                                    abstractComponentCallbacksC1029n = k12.f11221b;
                                }
                                i12 = i14;
                                z11 = z13;
                                i11 = 1;
                            } else {
                                Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n9 = k12.f11221b;
                                int i30 = abstractComponentCallbacksC1029n9.f11298D;
                                int size6 = arrayList9.size() - 1;
                                boolean z16 = false;
                                while (size6 >= 0) {
                                    int i31 = size6;
                                    Y1.AbstractComponentCallbacksC1029n abstractComponentCallbacksC1029n10 = (Y1.AbstractComponentCallbacksC1029n) arrayList9.get(size6);
                                    int i32 = i14;
                                    if (abstractComponentCallbacksC1029n10.f11298D != i30) {
                                        z13 = z13;
                                    } else if (abstractComponentCallbacksC1029n10 == abstractComponentCallbacksC1029n9) {
                                        z13 = z13;
                                        z16 = true;
                                    } else {
                                        if (abstractComponentCallbacksC1029n10 == abstractComponentCallbacksC1029n) {
                                            i13 = 0;
                                            arrayList10.add(i28, new Y1.K(9, abstractComponentCallbacksC1029n10, 0));
                                            i28++;
                                            abstractComponentCallbacksC1029n = null;
                                        } else {
                                            i13 = 0;
                                        }
                                        Y1.K k13 = new Y1.K(3, abstractComponentCallbacksC1029n10, i13);
                                        k13.f11223d = k12.f11223d;
                                        k13.f11225f = k12.f11225f;
                                        k13.f11224e = k12.f11224e;
                                        k13.g = k12.g;
                                        arrayList10.add(i28, k13);
                                        arrayList9.remove(abstractComponentCallbacksC1029n10);
                                        i28++;
                                        abstractComponentCallbacksC1029n = abstractComponentCallbacksC1029n;
                                    }
                                    size6 = i31 - 1;
                                    z13 = z13;
                                    i14 = i32;
                                }
                                i12 = i14;
                                z11 = z13;
                                i11 = 1;
                                if (z16) {
                                    arrayList10.remove(i28);
                                    i28--;
                                } else {
                                    k12.f11220a = 1;
                                    k12.f11222c = true;
                                    arrayList9.add(abstractComponentCallbacksC1029n9);
                                }
                            }
                            i28 += i11;
                            i15 = i11;
                            z12 = z10;
                            z13 = z11;
                            i14 = i12;
                        } else {
                            z10 = z12;
                            i11 = i15;
                        }
                        i12 = i14;
                        z11 = z13;
                        arrayList9.add(k12.f11221b);
                        i28 += i11;
                        i15 = i11;
                        z12 = z10;
                        z13 = z11;
                        i14 = i12;
                    } else {
                        z6 = z12;
                        i10 = i14;
                        z9 = z13;
                    }
                }
            }
            z13 = z9 || c1016a4.g;
            i14 = i10 + 1;
            z12 = z6;
        }
    }
}
