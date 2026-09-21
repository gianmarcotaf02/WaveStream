package p105m2;

/* JADX INFO: renamed from: m2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2615m extends p105m2.AbstractC2622u {
    public static final /* synthetic */ int y = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final android.media.MediaRouter2 f25336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p008a8.c f25337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final android.util.ArrayMap f25338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final android.media.MediaRouter2$RouteCallback f25339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p105m2.C2614l f25340t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p105m2.C2610h f25341u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final androidx.media3.common.util.d f25342v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public java.util.ArrayList f25343w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final android.util.ArrayMap f25344x;

    static {
        android.util.Log.isLoggable("MR2Provider", 3);
    }

    public C2615m(android.content.Context context, p008a8.c cVar) {
        super(context, null);
        this.f25338r = new android.util.ArrayMap();
        this.f25340t = new p105m2.C2614l(this);
        this.f25341u = new p105m2.C2610h(this);
        this.f25343w = new java.util.ArrayList();
        this.f25344x = new android.util.ArrayMap();
        this.f25336p = android.media.MediaRouter2.getInstance(context);
        this.f25337q = cVar;
        this.f25342v = new androidx.media3.common.util.d(new android.os.Handler(android.os.Looper.getMainLooper()));
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            this.f25339s = new p105m2.C2613k(this, 1);
        } else {
            this.f25339s = new p105m2.C2613k(this, 0);
        }
    }

    @Override // p105m2.AbstractC2622u
    public final p105m2.AbstractC2620s c(java.lang.String str) {
        java.util.Iterator it = this.f25338r.entrySet().iterator();
        while (it.hasNext()) {
            p105m2.C2611i c2611i = (p105m2.C2611i) ((java.util.Map.Entry) it.next()).getValue();
            if (android.text.TextUtils.equals(str, c2611i.f25323f)) {
                return c2611i;
            }
        }
        return null;
    }

    @Override // p105m2.AbstractC2622u
    public final p105m2.AbstractC2621t d(java.lang.String str) {
        return new p105m2.C2612j((java.lang.String) this.f25344x.get(str), null);
    }

    @Override // p105m2.AbstractC2622u
    public final p105m2.AbstractC2621t e(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = (java.lang.String) this.f25344x.get(str);
        for (p105m2.C2611i c2611i : this.f25338r.values()) {
            p105m2.C2617o c2617o = c2611i.f25330o;
            if (android.text.TextUtils.equals(str2, c2617o != null ? c2617o.d() : c2611i.g.getId())) {
                return new p105m2.C2612j(str3, c2611i);
            }
        }
        android.util.Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new p105m2.C2612j(str3, null);
    }

    @Override // p105m2.AbstractC2622u
    public final void f(p105m2.C2618p c2618p) {
        java.util.ArrayList<java.lang.String> arrayList;
        p105m2.C2623v c2623v;
        android.media.RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        android.media.MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.f25339s;
        int i3 = p105m2.C.f25213c == null ? 0 : p105m2.C.c().f25310z;
        p105m2.C2610h c2610h = this.f25341u;
        p105m2.C2614l c2614l = this.f25340t;
        if (i3 <= 0) {
            this.f25336p.unregisterRouteCallback(mediaRouter2$RouteCallback);
            this.f25336p.unregisterTransferCallback(c2614l);
            this.f25336p.unregisterControllerCallback(c2610h);
            return;
        }
        p105m2.P p2 = p105m2.C.c().f25301p;
        boolean z6 = p2 == null ? false : p2.f25228c;
        if (c2618p == null) {
            c2618p = new p105m2.C2618p(p105m2.C2623v.f25370c, false);
        }
        c2618p.a();
        java.util.ArrayList<java.lang.String> arrayListB = c2618p.f25351b.b();
        if (!z6) {
            arrayListB.remove("android.media.intent.category.LIVE_AUDIO");
        } else if (!arrayListB.contains("android.media.intent.category.LIVE_AUDIO")) {
            arrayListB.add("android.media.intent.category.LIVE_AUDIO");
        }
        if (arrayListB.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = null;
            for (java.lang.String str : arrayListB) {
                if (str == null) {
                    throw new java.lang.IllegalArgumentException("category must not be null");
                }
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        if (arrayList == null) {
            c2623v = p105m2.C2623v.f25370c;
        } else {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            c2623v = new p105m2.C2623v(bundle, arrayList);
        }
        boolean zB = c2618p.b();
        if (c2623v == null) {
            throw new java.lang.IllegalArgumentException("selector must not be null");
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putBundle("selector", c2623v.f25371a);
        bundle2.putBoolean("activeScan", zB);
        android.media.MediaRouter2 mediaRouter2 = this.f25336p;
        c2623v.a();
        if (c2623v.f25372b.contains(null)) {
            D1.A0.o();
            routeDiscoveryPreferenceBuild = p105m2.AbstractC2609g.c(new java.util.ArrayList()).build();
        } else {
            boolean z9 = bundle2.getBoolean("activeScan");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str2 : c2623v.b()) {
                str2.getClass();
                switch (str2) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str2 = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str2 = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str2 = "android.media.route.feature.LIVE_VIDEO";
                        break;
                }
                arrayList2.add(str2);
            }
            routeDiscoveryPreferenceBuild = p105m2.AbstractC2609g.d(arrayList2, z9).build();
        }
        androidx.media3.common.util.d dVar = this.f25342v;
        mediaRouter2.registerRouteCallback(dVar, mediaRouter2$RouteCallback, routeDiscoveryPreferenceBuild);
        this.f25336p.registerTransferCallback(dVar, c2614l);
        this.f25336p.registerControllerCallback(dVar, c2610h);
    }

    public final void i() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.ArraySet arraySet = new android.util.ArraySet();
        java.util.Iterator it = this.f25336p.getRoutes().iterator();
        while (it.hasNext()) {
            android.media.MediaRoute2Info mediaRoute2InfoC = D1.A0.c(it.next());
            if (mediaRoute2InfoC != null && !arraySet.contains(mediaRoute2InfoC) && !mediaRoute2InfoC.isSystemRoute()) {
                arraySet.add(mediaRoute2InfoC);
                arrayList.add(mediaRoute2InfoC);
            }
        }
        if (arrayList.equals(this.f25343w)) {
            return;
        }
        this.f25343w = arrayList;
        android.util.ArrayMap arrayMap = this.f25344x;
        arrayMap.clear();
        java.util.Iterator it2 = this.f25343w.iterator();
        while (it2.hasNext()) {
            android.media.MediaRoute2Info mediaRoute2InfoC2 = D1.A0.c(it2.next());
            android.os.Bundle extras = mediaRoute2InfoC2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                android.util.Log.w("MR2Provider", "Cannot find the original route Id. route=" + mediaRoute2InfoC2);
            } else {
                arrayMap.put(mediaRoute2InfoC2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        java.util.ArrayList<p105m2.C2617o> arrayList2 = new java.util.ArrayList();
        java.util.Iterator it3 = this.f25343w.iterator();
        while (it3.hasNext()) {
            android.media.MediaRoute2Info mediaRoute2InfoC3 = D1.A0.c(it3.next());
            p105m2.C2617o c2617oP0 = com.google.android.gms.internal.play_billing.AbstractC1864o0.p0(mediaRoute2InfoC3);
            if (mediaRoute2InfoC3 != null) {
                arrayList2.add(c2617oP0);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (!arrayList2.isEmpty()) {
            for (p105m2.C2617o c2617o : arrayList2) {
                if (c2617o == null) {
                    throw new java.lang.IllegalArgumentException("route must not be null");
                }
                if (arrayList3.contains(c2617o)) {
                    throw new java.lang.IllegalArgumentException("route descriptor already added");
                }
                arrayList3.add(c2617o);
            }
        }
        g(new p007a7.z(arrayList3, true));
    }

    public final void j(android.media.MediaRouter2.RoutingController routingController) {
        p105m2.C2616n c2616n;
        p105m2.C2611i c2611i = (p105m2.C2611i) this.f25338r.get(routingController);
        if (c2611i == null) {
            android.util.Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        java.util.List selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            android.util.Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        java.util.ArrayList<java.lang.String> arrayListH0 = com.google.android.gms.internal.play_billing.AbstractC1864o0.h0(selectedRoutes);
        p105m2.C2617o c2617oP0 = com.google.android.gms.internal.play_billing.AbstractC1864o0.p0(D1.A0.c(selectedRoutes.get(0)));
        android.os.Bundle controlHints = routingController.getControlHints();
        java.lang.String string = this.f25363h.getString(com.kiptv.tv.R.string.mr_dialog_default_group_name);
        p105m2.C2617o c2617o = null;
        if (controlHints != null) {
            try {
                java.lang.String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!android.text.TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                android.os.Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    c2617o = new p105m2.C2617o(bundle);
                }
            } catch (java.lang.Exception e6) {
                android.util.Log.w("MR2Provider", "Exception while unparceling control hints.", e6);
            }
        }
        if (c2617o == null) {
            c2616n = new p105m2.C2616n(routingController.getId(), string);
            android.os.Bundle bundle2 = c2616n.f25345a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            c2616n = new p105m2.C2616n(c2617o);
        }
        int volume = routingController.getVolume();
        android.os.Bundle bundle3 = c2616n.f25345a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        c2616n.f25347c.clear();
        c2616n.a(c2617oP0.b());
        java.util.ArrayList arrayList = c2616n.f25346b;
        arrayList.clear();
        if (!arrayListH0.isEmpty()) {
            for (java.lang.String str : arrayListH0) {
                if (android.text.TextUtils.isEmpty(str)) {
                    throw new java.lang.IllegalArgumentException("groupMemberId must not be empty");
                }
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        p105m2.C2617o c2617oB = c2616n.b();
        java.util.ArrayList arrayListH1 = com.google.android.gms.internal.play_billing.AbstractC1864o0.h0(routingController.getSelectableRoutes());
        java.util.ArrayList arrayListH2 = com.google.android.gms.internal.play_billing.AbstractC1864o0.h0(routingController.getDeselectableRoutes());
        p007a7.z zVar = this.f25368n;
        if (zVar == null) {
            android.util.Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List<p105m2.C2617o> list = zVar.f15517b;
        if (!list.isEmpty()) {
            for (p105m2.C2617o c2617o2 : list) {
                java.lang.String strD = c2617o2.d();
                int i3 = arrayListH0.contains(strD) ? 3 : 1;
                arrayListH1.contains(strD);
                arrayListH2.contains(strD);
                arrayList2.add(new p105m2.r(c2617o2, i3));
            }
        }
        c2611i.f25330o = c2617oB;
        c2611i.j(c2617oB, arrayList2);
    }
}
