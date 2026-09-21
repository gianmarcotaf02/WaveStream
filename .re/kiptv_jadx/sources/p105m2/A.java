package p105m2;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p105m2.C2627z f25193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f25194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f25195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.String f25196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.String f25197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.net.Uri f25198f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25200i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f25204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f25205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25206p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public android.os.Bundle f25208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public android.content.IntentSender f25209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p105m2.C2617o f25210t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p136q.C2661e f25212v;
    public final java.util.ArrayList j = new java.util.ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f25207q = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public java.util.ArrayList f25211u = new java.util.ArrayList();

    public A(p105m2.C2627z c2627z, java.lang.String str, java.lang.String str2) {
        this.f25193a = c2627z;
        this.f25194b = str;
        this.f25195c = str2;
    }

    public final p105m2.AbstractC2622u a() {
        p105m2.C2627z c2627z = this.f25193a;
        c2627z.getClass();
        p105m2.C.b();
        return c2627z.f25386a;
    }

    public final int b() {
        android.os.Bundle bundle;
        if (java.util.Collections.unmodifiableList(this.f25211u).size() >= 1) {
            if (p105m2.C.f25213c == null) {
                return 0;
            }
            p105m2.P p2 = p105m2.C.c().f25301p;
            if (p2 != null && (bundle = p2.f25229d) != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true)) {
                return 0;
            }
        }
        return this.f25204n;
    }

    public final boolean c() {
        p105m2.C.b();
        p105m2.A a2 = p105m2.C.c().f25302q;
        if (a2 == null) {
            throw new java.lang.IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        if (a2 == this || this.f25203m == 3) {
            return true;
        }
        return android.text.TextUtils.equals(((android.content.ComponentName) a().f25364i.f15522i).getPackageName(), com.revenuecat.purchases.common.events.BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM) && i("android.media.intent.category.LIVE_AUDIO") && !i("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean d() {
        return this.f25210t != null && this.g;
    }

    public final boolean e(p105m2.C2623v c2623v) {
        if (c2623v == null) {
            throw new java.lang.IllegalArgumentException("selector must not be null");
        }
        p105m2.C.b();
        java.util.ArrayList<android.content.IntentFilter> arrayList = this.j;
        if (arrayList == null) {
            return false;
        }
        c2623v.a();
        if (c2623v.f25372b.isEmpty()) {
            return false;
        }
        for (android.content.IntentFilter intentFilter : arrayList) {
            if (intentFilter != null) {
                java.util.Iterator it = c2623v.f25372b.iterator();
                while (it.hasNext()) {
                    if (intentFilter.hasCategory((java.lang.String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int f(p105m2.C2617o c2617o) {
        int i3;
        p105m2.A a2;
        int iCountActions;
        if (this.f25210t != c2617o) {
            this.f25210t = c2617o;
            if (c2617o != null) {
                java.lang.String str = this.f25196d;
                android.os.Bundle bundle = c2617o.f25349a;
                if (java.util.Objects.equals(str, bundle.getString("name"))) {
                    i3 = 0;
                } else {
                    this.f25196d = bundle.getString("name");
                    i3 = 1;
                }
                if (!java.util.Objects.equals(this.f25197e, bundle.getString("status"))) {
                    this.f25197e = bundle.getString("status");
                    i3 = 1;
                }
                android.net.Uri uri = this.f25198f;
                java.lang.String string = bundle.getString("iconUri");
                if (!java.util.Objects.equals(uri, string == null ? null : android.net.Uri.parse(string))) {
                    java.lang.String string2 = bundle.getString("iconUri");
                    this.f25198f = string2 == null ? null : android.net.Uri.parse(string2);
                    i3 = 1;
                }
                if (this.g != bundle.getBoolean("enabled", true)) {
                    this.g = bundle.getBoolean("enabled", true);
                    i3 = 1;
                }
                if (this.f25199h != bundle.getInt("connectionState", 0)) {
                    this.f25199h = bundle.getInt("connectionState", 0);
                    i3 = 1;
                }
                java.util.ArrayList arrayList = this.j;
                java.util.ArrayList arrayListB = c2617o.b();
                if (arrayList != arrayListB) {
                    if (arrayList != null) {
                        java.util.ListIterator listIterator = arrayList.listIterator();
                        java.util.ListIterator listIterator2 = arrayListB.listIterator();
                        while (true) {
                            if (listIterator.hasNext() && listIterator2.hasNext()) {
                                android.content.IntentFilter intentFilter = (android.content.IntentFilter) listIterator.next();
                                android.content.IntentFilter intentFilter2 = (android.content.IntentFilter) listIterator2.next();
                                if (intentFilter != intentFilter2) {
                                    if (intentFilter != null && intentFilter2 != null && (iCountActions = intentFilter.countActions()) == intentFilter2.countActions()) {
                                        int i9 = 0;
                                        while (true) {
                                            if (i9 >= iCountActions) {
                                                int iCountCategories = intentFilter.countCategories();
                                                if (iCountCategories == intentFilter2.countCategories()) {
                                                    int i10 = 0;
                                                    while (true) {
                                                        if (i10 >= iCountCategories) {
                                                            continue;
                                                        } else if (intentFilter.getCategory(i10).equals(intentFilter2.getCategory(i10))) {
                                                            i10++;
                                                        }
                                                    }
                                                }
                                            } else if (intentFilter.getAction(i9).equals(intentFilter2.getAction(i9))) {
                                                i9++;
                                            }
                                        }
                                    }
                                }
                            } else if (listIterator.hasNext() || listIterator2.hasNext()) {
                            }
                            arrayList.clear();
                            arrayList.addAll(c2617o.b());
                            i3 = 1;
                        }
                    } else {
                        arrayList.clear();
                        arrayList.addAll(c2617o.b());
                        i3 = 1;
                    }
                }
                if (this.f25201k != bundle.getInt("playbackType", 1)) {
                    this.f25201k = bundle.getInt("playbackType", 1);
                    i3 = 1;
                }
                if (this.f25202l != bundle.getInt("playbackStream", -1)) {
                    this.f25202l = bundle.getInt("playbackStream", -1);
                    i3 = 1;
                }
                if (this.f25203m != bundle.getInt("deviceType")) {
                    this.f25203m = bundle.getInt("deviceType");
                    i3 = 1;
                }
                int i11 = 3;
                if (this.f25204n != bundle.getInt("volumeHandling", 0)) {
                    this.f25204n = bundle.getInt("volumeHandling", 0);
                    i3 = 3;
                }
                if (this.f25205o != bundle.getInt("volume")) {
                    this.f25205o = bundle.getInt("volume");
                    i3 = 3;
                }
                if (this.f25206p != bundle.getInt("volumeMax")) {
                    this.f25206p = bundle.getInt("volumeMax");
                } else {
                    i11 = i3;
                }
                if (this.f25207q != bundle.getInt("presentationDisplayId", -1)) {
                    this.f25207q = bundle.getInt("presentationDisplayId", -1);
                    i11 |= 5;
                }
                if (!java.util.Objects.equals(this.f25208r, bundle.getBundle("extras"))) {
                    this.f25208r = bundle.getBundle("extras");
                    i11 |= 1;
                }
                if (!java.util.Objects.equals(this.f25209s, (android.content.IntentSender) bundle.getParcelable("settingsIntent"))) {
                    this.f25209s = (android.content.IntentSender) bundle.getParcelable("settingsIntent");
                    i11 |= 1;
                }
                if (this.f25200i != bundle.getBoolean("canDisconnect", false)) {
                    this.f25200i = bundle.getBoolean("canDisconnect", false);
                    i11 |= 5;
                }
                java.util.ArrayList<java.lang.String> arrayListC = c2617o.c();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                boolean z6 = arrayListC.size() != this.f25211u.size();
                if (!arrayListC.isEmpty()) {
                    p105m2.C2608f c2608fC = p105m2.C.c();
                    for (java.lang.String str2 : arrayListC) {
                        c2608fC.getClass();
                        java.lang.String str3 = (java.lang.String) c2608fC.f25294h.get(new C1.b(((android.content.ComponentName) this.f25193a.f25389d.f15522i).flattenToShortString(), str2));
                        java.util.Iterator it = c2608fC.g.iterator();
                        do {
                            if (!it.hasNext()) {
                                a2 = null;
                                break;
                            }
                            a2 = (p105m2.A) it.next();
                        } while (!a2.f25195c.equals(str3));
                        if (a2 != null) {
                            arrayList2.add(a2);
                            if (!z6 && !this.f25211u.contains(a2)) {
                                z6 = true;
                            }
                        }
                    }
                }
                if (!z6) {
                    return i11;
                }
                this.f25211u = arrayList2;
                return i11 | 1;
            }
        }
        return 0;
    }

    public final void g(int i3) {
        p105m2.AbstractC2621t abstractC2621t;
        p105m2.AbstractC2621t abstractC2621t2;
        p105m2.C.b();
        p105m2.C2608f c2608fC = p105m2.C.c();
        int iMin = java.lang.Math.min(this.f25206p, java.lang.Math.max(0, i3));
        if (this == c2608fC.f25304s && (abstractC2621t2 = c2608fC.f25305t) != null) {
            abstractC2621t2.f(iMin);
            return;
        }
        java.util.HashMap map = c2608fC.f25308w;
        if (map.isEmpty() || (abstractC2621t = (p105m2.AbstractC2621t) map.get(this.f25195c)) == null) {
            return;
        }
        abstractC2621t.f(iMin);
    }

    public final void h(int i3) {
        p105m2.AbstractC2621t abstractC2621t;
        p105m2.AbstractC2621t abstractC2621t2;
        p105m2.C.b();
        if (i3 != 0) {
            p105m2.C2608f c2608fC = p105m2.C.c();
            if (this == c2608fC.f25304s && (abstractC2621t2 = c2608fC.f25305t) != null) {
                abstractC2621t2.i(i3);
                return;
            }
            java.util.HashMap map = c2608fC.f25308w;
            if (map.isEmpty() || (abstractC2621t = (p105m2.AbstractC2621t) map.get(this.f25195c)) == null) {
                return;
            }
            abstractC2621t.i(i3);
        }
    }

    public final boolean i(java.lang.String str) {
        p105m2.C.b();
        java.util.Iterator it = this.j.iterator();
        while (it.hasNext()) {
            if (((android.content.IntentFilter) it.next()).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void j(java.util.ArrayList arrayList) {
        p105m2.A a2;
        this.f25211u.clear();
        if (this.f25212v == null) {
            this.f25212v = new p136q.C2661e(0);
        }
        this.f25212v.clear();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p105m2.r rVar = (p105m2.r) it.next();
            java.lang.String strD = rVar.f25356a.d();
            java.util.Iterator it2 = this.f25193a.f25387b.iterator();
            do {
                if (!it2.hasNext()) {
                    a2 = null;
                    break;
                }
                a2 = (p105m2.A) it2.next();
            } while (!a2.f25194b.equals(strD));
            if (a2 != null) {
                this.f25212v.put(a2.f25195c, rVar);
                int i3 = rVar.f25357b;
                if (i3 == 2 || i3 == 3) {
                    this.f25211u.add(a2);
                }
            }
        }
        p105m2.C.c().f25298m.b(org.videolan.libvlc.MediaPlayer.Event.Buffering, this);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.f25195c);
        sb.append(", name=");
        sb.append(this.f25196d);
        sb.append(", description=");
        sb.append(this.f25197e);
        sb.append(", iconUri=");
        sb.append(this.f25198f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", connectionState=");
        sb.append(this.f25199h);
        sb.append(", canDisconnect=");
        sb.append(this.f25200i);
        sb.append(", playbackType=");
        sb.append(this.f25201k);
        sb.append(", playbackStream=");
        sb.append(this.f25202l);
        sb.append(", deviceType=");
        sb.append(this.f25203m);
        sb.append(", volumeHandling=");
        sb.append(this.f25204n);
        sb.append(", volume=");
        sb.append(this.f25205o);
        sb.append(", volumeMax=");
        sb.append(this.f25206p);
        sb.append(", presentationDisplayId=");
        sb.append(this.f25207q);
        sb.append(", extras=");
        sb.append(this.f25208r);
        sb.append(", settingsIntent=");
        sb.append(this.f25209s);
        sb.append(", providerPackageName=");
        sb.append(((android.content.ComponentName) this.f25193a.f25389d.f15522i).getPackageName());
        if (java.util.Collections.unmodifiableList(this.f25211u).size() >= 1) {
            sb.append(", members=[");
            int size = this.f25211u.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                if (this.f25211u.get(i3) != this) {
                    sb.append(((p105m2.A) this.f25211u.get(i3)).f25195c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
