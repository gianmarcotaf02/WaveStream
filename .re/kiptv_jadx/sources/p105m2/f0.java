package p105m2;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends p105m2.g0 implements p105m2.L, p105m2.E, p105m2.I {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final java.util.ArrayList f25311A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final java.util.ArrayList f25312z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p105m2.C2608f f25313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final android.media.MediaRouter f25314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final android.media.MediaRouter.Callback f25315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final android.media.MediaRouter.VolumeCallback f25316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final android.media.MediaRouter.RouteCategory f25317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f25318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f25319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f25320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final java.util.ArrayList f25321x;
    public final java.util.ArrayList y;

    static {
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f25312z = arrayList;
        arrayList.add(intentFilter);
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        f25311A = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public f0(android.content.Context context, p105m2.C2608f c2608f) {
        super(context, new p008a8.c(14, new android.content.ComponentName(com.revenuecat.purchases.common.events.BackendEvent.Workflows.Context.WORKFLOW_CONTEXT_PLATFORM, p105m2.g0.class.getName())));
        this.f25321x = new java.util.ArrayList();
        this.y = new java.util.ArrayList();
        this.f25313p = c2608f;
        android.media.MediaRouter mediaRouterG = p105m2.K.g(context);
        this.f25314q = mediaRouterG;
        this.f25315r = new p105m2.M(this);
        this.f25316s = p105m2.K.f(this);
        this.f25317t = p105m2.K.d(mediaRouterG, context.getResources().getString(com.kiptv.tv.R.string.mr_user_route_category_name), false);
        x();
    }

    public static p105m2.e0 o(android.media.MediaRouter.RouteInfo routeInfo) {
        java.lang.Object objE = p105m2.G.e(routeInfo);
        if (objE instanceof p105m2.e0) {
            return (p105m2.e0) objE;
        }
        return null;
    }

    @Override // p105m2.I
    public final void a(android.media.MediaRouter.RouteInfo routeInfo, int i3) {
        p105m2.e0 e0VarO = o(routeInfo);
        if (e0VarO != null) {
            e0VarO.f25281a.g(i3);
        }
    }

    @Override // p105m2.I
    public final void b(android.media.MediaRouter.RouteInfo routeInfo, int i3) {
        p105m2.e0 e0VarO = o(routeInfo);
        if (e0VarO != null) {
            e0VarO.f25281a.h(i3);
        }
    }

    @Override // p105m2.AbstractC2622u
    public final p105m2.AbstractC2621t d(java.lang.String str) {
        int iK = k(str);
        if (iK >= 0) {
            return new p105m2.c0(((p105m2.d0) this.f25321x.get(iK)).f25278a);
        }
        return null;
    }

    @Override // p105m2.AbstractC2622u
    public final void f(p105m2.C2618p c2618p) {
        boolean zB;
        int i3 = 0;
        if (c2618p != null) {
            c2618p.a();
            java.util.ArrayList arrayListB = c2618p.f25351b.b();
            int size = arrayListB.size();
            int i9 = 0;
            while (i3 < size) {
                java.lang.String str = (java.lang.String) arrayListB.get(i3);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i9 |= 1;
                } else {
                    i9 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i9 | 2 : i9 | 8388608;
                }
                i3++;
            }
            zB = c2618p.b();
            i3 = i9;
        } else {
            zB = false;
        }
        if (this.f25318u == i3 && this.f25319v == zB) {
            return;
        }
        this.f25318u = i3;
        this.f25319v = zB;
        x();
    }

    public final boolean i(android.media.MediaRouter.RouteInfo routeInfo) {
        java.lang.String str;
        java.lang.String str2;
        if (o(routeInfo) != null || j(routeInfo) >= 0) {
            return false;
        }
        java.lang.Object objN = n();
        android.content.Context context = this.f25363h;
        if (objN == routeInfo) {
            str = "DEFAULT_ROUTE";
        } else {
            java.util.Locale locale = java.util.Locale.US;
            java.lang.CharSequence charSequenceA = p105m2.G.a(routeInfo, context);
            str = java.lang.String.format(locale, "ROUTE_%08x", java.lang.Integer.valueOf((charSequenceA != null ? charSequenceA.toString() : "").hashCode()));
        }
        if (k(str) >= 0) {
            int i3 = 2;
            while (true) {
                java.util.Locale locale2 = java.util.Locale.US;
                str2 = str + "_" + i3;
                if (k(str2) < 0) {
                    break;
                }
                i3++;
            }
            str = str2;
        }
        p105m2.d0 d0Var = new p105m2.d0(routeInfo, str);
        java.lang.CharSequence charSequenceA2 = p105m2.G.a(routeInfo, context);
        p105m2.C2616n c2616n = new p105m2.C2616n(str, charSequenceA2 != null ? charSequenceA2.toString() : "");
        q(d0Var, c2616n);
        d0Var.f25280c = c2616n.b();
        this.f25321x.add(d0Var);
        return true;
    }

    public final int j(android.media.MediaRouter.RouteInfo routeInfo) {
        java.util.ArrayList arrayList = this.f25321x;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((p105m2.d0) arrayList.get(i3)).f25278a == routeInfo) {
                return i3;
            }
        }
        return -1;
    }

    public final int k(java.lang.String str) {
        java.util.ArrayList arrayList = this.f25321x;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((p105m2.d0) arrayList.get(i3)).f25279b.equals(str)) {
                return i3;
            }
        }
        return -1;
    }

    public final int l(p105m2.A a2) {
        java.util.ArrayList arrayList = this.y;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((p105m2.e0) arrayList.get(i3)).f25281a == a2) {
                return i3;
            }
        }
        return -1;
    }

    public android.media.MediaRouter.RouteInfo m() {
        return this.f25314q.getDefaultRoute();
    }

    public /* bridge */ java.lang.Object n() {
        return m();
    }

    public boolean p(p105m2.d0 d0Var) {
        return d0Var.f25278a.isConnecting();
    }

    public void q(p105m2.d0 d0Var, p105m2.C2616n c2616n) {
        int iD = p105m2.G.d(d0Var.f25278a);
        if ((iD & 1) != 0) {
            c2616n.a(f25312z);
        }
        if ((iD & 2) != 0) {
            c2616n.a(f25311A);
        }
        android.media.MediaRouter.RouteInfo routeInfo = d0Var.f25278a;
        c2616n.f25345a.putInt("playbackType", p105m2.G.c(routeInfo));
        int iB = p105m2.G.b(routeInfo);
        android.os.Bundle bundle = c2616n.f25345a;
        bundle.putInt("playbackStream", iB);
        bundle.putInt("volume", p105m2.G.f(routeInfo));
        bundle.putInt("volumeMax", p105m2.G.h(routeInfo));
        bundle.putInt("volumeHandling", p105m2.G.g(routeInfo));
        android.media.MediaRouter.RouteInfo routeInfo2 = d0Var.f25278a;
        boolean zB = p105m2.N.b(routeInfo2);
        android.os.Bundle bundle2 = c2616n.f25345a;
        if (!zB) {
            bundle2.putBoolean("enabled", false);
        }
        if (p(d0Var)) {
            bundle2.putInt("connectionState", 1);
        }
        android.view.Display displayA = p105m2.N.a(routeInfo2);
        if (displayA != null) {
            bundle2.putInt("presentationDisplayId", displayA.getDisplayId());
        }
        java.lang.CharSequence description = d0Var.f25278a.getDescription();
        if (description != null) {
            c2616n.f25345a.putString("status", description.toString());
        }
    }

    public final void r(p105m2.A a2) {
        p105m2.AbstractC2622u abstractC2622uA = a2.a();
        android.media.MediaRouter mediaRouter = this.f25314q;
        if (abstractC2622uA == this) {
            int iJ = j(p105m2.K.i(mediaRouter, 8388611));
            if (iJ < 0 || !((p105m2.d0) this.f25321x.get(iJ)).f25279b.equals(a2.f25194b)) {
                return;
            }
            p105m2.C.b();
            p105m2.C.c().i(a2, 3);
            return;
        }
        android.media.MediaRouter.UserRouteInfo userRouteInfoE = p105m2.K.e(mediaRouter, this.f25317t);
        p105m2.e0 e0Var = new p105m2.e0(a2, userRouteInfoE);
        p105m2.G.k(userRouteInfoE, e0Var);
        p105m2.H.f(userRouteInfoE, this.f25316s);
        y(e0Var);
        this.y.add(e0Var);
        p105m2.K.b(mediaRouter, userRouteInfoE);
    }

    public final void s(p105m2.A a2) {
        int iL;
        if (a2.a() == this || (iL = l(a2)) < 0) {
            return;
        }
        p105m2.e0 e0Var = (p105m2.e0) this.y.remove(iL);
        p105m2.G.k(e0Var.f25282b, null);
        android.media.MediaRouter.UserRouteInfo userRouteInfo = e0Var.f25282b;
        p105m2.H.f(userRouteInfo, null);
        p105m2.K.k(this.f25314q, userRouteInfo);
    }

    public final void t(p105m2.A a2) {
        a2.getClass();
        p105m2.C.b();
        if (p105m2.C.c().e() == a2) {
            if (a2.a() != this) {
                int iL = l(a2);
                if (iL >= 0) {
                    v(((p105m2.e0) this.y.get(iL)).f25282b);
                    return;
                }
                return;
            }
            int iK = k(a2.f25194b);
            if (iK >= 0) {
                v(((p105m2.d0) this.f25321x.get(iK)).f25278a);
            }
        }
    }

    public final void u() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f25321x;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            p105m2.C2617o c2617o = ((p105m2.d0) arrayList2.get(i3)).f25280c;
            if (c2617o == null) {
                throw new java.lang.IllegalArgumentException("route must not be null");
            }
            if (arrayList.contains(c2617o)) {
                throw new java.lang.IllegalArgumentException("route descriptor already added");
            }
            arrayList.add(c2617o);
        }
        g(new p007a7.z(arrayList, false));
    }

    public void v(android.media.MediaRouter.RouteInfo routeInfo) {
        p105m2.K.l(this.f25314q, 8388611, routeInfo);
    }

    public void w() {
        boolean z6 = this.f25320w;
        android.media.MediaRouter.Callback callback = this.f25315r;
        android.media.MediaRouter mediaRouter = this.f25314q;
        if (z6) {
            p105m2.K.j(mediaRouter, callback);
        }
        this.f25320w = true;
        mediaRouter.addCallback(this.f25318u, callback, (this.f25319v ? 1 : 0) | 2);
    }

    public final void x() {
        w();
        java.util.Iterator<android.media.MediaRouter.RouteInfo> it = p105m2.K.h(this.f25314q).iterator();
        boolean zI = false;
        while (it.hasNext()) {
            zI |= i(it.next());
        }
        if (zI) {
            u();
        }
    }

    public void y(p105m2.e0 e0Var) {
        android.media.MediaRouter.UserRouteInfo userRouteInfo = e0Var.f25282b;
        p105m2.A a2 = e0Var.f25281a;
        p105m2.H.a(userRouteInfo, a2.f25196d);
        int i3 = a2.f25201k;
        android.media.MediaRouter.UserRouteInfo userRouteInfo2 = e0Var.f25282b;
        p105m2.H.c(userRouteInfo2, i3);
        p105m2.H.b(userRouteInfo2, a2.f25202l);
        p105m2.H.e(userRouteInfo2, a2.f25205o);
        p105m2.H.h(userRouteInfo2, a2.f25206p);
        p105m2.H.g(userRouteInfo2, a2.b());
        e0Var.f25282b.setDescription(e0Var.f25281a.f25197e);
    }
}
