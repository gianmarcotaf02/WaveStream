package p191x3;

/* JADX INFO: renamed from: x3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3100a {
    public static final B3.C0089b j = new B3.C0089b("CastContext", null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.lang.Object f31156k = new java.lang.Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static volatile p191x3.C3100a f31157l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f31158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p191x3.g f31159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p191x3.i f31160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p191x3.C3101b f31161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B3.x f31162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.BinderC1727c f31163f;
    public final com.google.android.gms.internal.cast.C1767m g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.C1794t f31164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.C1735e f31165i;

    public C3100a(android.content.Context context, p191x3.C3101b c3101b, java.util.List list, com.google.android.gms.internal.cast.BinderC1783q binderC1783q, B3.x xVar) throws p191x3.C3103d {
        p191x3.p pVar;
        android.net.ConnectivityManager connectivityManager;
        android.net.LinkProperties linkProperties;
        this.f31158a = context;
        this.f31161d = c3101b;
        this.f31162e = xVar;
        this.g = new com.google.android.gms.internal.cast.C1767m(context);
        this.f31164h = binderC1783q.f19024h;
        p191x3.w wVar = null;
        if (android.text.TextUtils.isEmpty(c3101b.f31168h)) {
            this.f31165i = null;
        } else {
            this.f31165i = new com.google.android.gms.internal.cast.C1735e(context, c3101b, binderC1783q);
        }
        java.util.HashMap map = new java.util.HashMap();
        com.google.android.gms.internal.cast.C1735e c1735e = this.f31165i;
        if (c1735e != null) {
            map.put(c1735e.f18891b, c1735e.f18892c);
        }
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.C1735e c1735e2 = (com.google.android.gms.internal.cast.C1735e) it.next();
                H3.q.h(c1735e2, "Additional SessionProvider must not be null.");
                java.lang.String str = c1735e2.f18891b;
                H3.q.f(str, "Category for SessionProvider must not be null or empty string.");
                H3.q.a("SessionProvider for category " + str + " already added", !map.containsKey(str));
                map.put(str, c1735e2.f18892c);
            }
        }
        c3101b.f31182w = new p191x3.A(1);
        try {
            p191x3.l lVarA = com.google.android.gms.internal.cast.AbstractC1731d.a(context, c3101b, binderC1783q, map);
            try {
                p191x3.j jVar = (p191x3.j) lVarA;
                android.os.Parcel parcelZ = jVar.Z(jVar.Y(), 6);
                android.os.IBinder strongBinder = parcelZ.readStrongBinder();
                if (strongBinder == null) {
                    pVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    pVar = iInterfaceQueryLocalInterface instanceof p191x3.p ? (p191x3.p) iInterfaceQueryLocalInterface : new p191x3.p(strongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 3);
                }
                parcelZ.recycle();
                this.f31160c = new p191x3.i(pVar);
                try {
                    p191x3.j jVar2 = (p191x3.j) lVarA;
                    android.os.Parcel parcelZ2 = jVar2.Z(jVar2.Y(), 5);
                    android.os.IBinder strongBinder2 = parcelZ2.readStrongBinder();
                    if (strongBinder2 != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        wVar = iInterfaceQueryLocalInterface2 instanceof p191x3.w ? (p191x3.w) iInterfaceQueryLocalInterface2 : new p191x3.w(strongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 3);
                    }
                    parcelZ2.recycle();
                    p191x3.g gVar = new p191x3.g(wVar, context);
                    this.f31159b = gVar;
                    H3.q.f("PrecacheManager", "The log tag cannot be null or empty.");
                    com.google.android.gms.internal.cast.C1794t c1794t = this.f31164h;
                    if (c1794t != null) {
                        c1794t.f19077f = gVar;
                        Z3.d dVar = c1794t.f19074c;
                        H3.q.g(dVar);
                        dVar.post(new com.google.android.gms.internal.cast.RunnableC1790s(c1794t, 1));
                    }
                    java.util.concurrent.ExecutorService executorServiceNewFixedThreadPool = java.util.concurrent.Executors.newFixedThreadPool(3);
                    com.google.android.gms.internal.cast.C c9 = new com.google.android.gms.internal.cast.C(context, executorServiceNewFixedThreadPool instanceof com.google.android.gms.internal.cast.InterfaceExecutorServiceC1774n2 ? (com.google.android.gms.internal.cast.InterfaceExecutorServiceC1774n2) executorServiceNewFixedThreadPool : executorServiceNewFixedThreadPool instanceof java.util.concurrent.ScheduledExecutorService ? new com.google.android.gms.internal.cast.ScheduledExecutorServiceC1789r2((java.util.concurrent.ScheduledExecutorService) executorServiceNewFixedThreadPool) : new com.google.android.gms.internal.cast.C1778o2(executorServiceNewFixedThreadPool));
                    H3.q.f("BaseNetUtils", "The log tag cannot be null or empty.");
                    com.google.android.gms.internal.cast.C.j.b("Start monitoring connectivity changes", new java.lang.Object[0]);
                    if (!c9.f18752f && (connectivityManager = c9.f18749c) != null && com.google.common.util.concurrent.P.N(c9.g, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
                        if (activeNetwork != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
                            c9.a(activeNetwork, linkProperties);
                        }
                        connectivityManager.registerNetworkCallback(new android.net.NetworkRequest.Builder().addTransportType(1).build(), c9.f18748b);
                        c9.f18752f = true;
                    }
                    com.google.android.gms.internal.cast.BinderC1727c binderC1727c = new com.google.android.gms.internal.cast.BinderC1727c();
                    this.f31163f = binderC1727c;
                    try {
                        p191x3.j jVar3 = (p191x3.j) lVarA;
                        android.os.Parcel parcelY = jVar3.Y();
                        com.google.android.gms.internal.cast.AbstractC1818z.d(parcelY, binderC1727c);
                        jVar3.a0(parcelY, 3);
                        binderC1727c.f18878e.add(this.g.f18977a);
                        if (!java.util.Collections.unmodifiableList(c3101b.f31178s).isEmpty()) {
                            B3.C0089b c0089b = j;
                            android.util.Log.i(c0089b.f617a, c0089b.d("Setting Route Discovery for appIds: ".concat(java.lang.String.valueOf(java.util.Collections.unmodifiableList(this.f31161d.f31178s))), new java.lang.Object[0]));
                            com.google.android.gms.internal.cast.C1767m c1767m = this.g;
                            java.util.List listUnmodifiableList = java.util.Collections.unmodifiableList(this.f31161d.f31178s);
                            c1767m.getClass();
                            com.google.android.gms.internal.cast.C1767m.f18976f.b(Y6.f.f(listUnmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new java.lang.Object[0]);
                            java.util.LinkedHashSet<java.lang.String> linkedHashSet = new java.util.LinkedHashSet();
                            java.util.Iterator it2 = listUnmodifiableList.iterator();
                            while (it2.hasNext()) {
                                linkedHashSet.add(com.google.android.gms.internal.cast.H.f((java.lang.String) it2.next()));
                            }
                            com.google.android.gms.internal.cast.C1767m.f18976f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(java.lang.String.valueOf(c1767m.f18979c.keySet())), new java.lang.Object[0]);
                            java.util.HashMap map2 = new java.util.HashMap();
                            synchronized (c1767m.f18979c) {
                                try {
                                    for (java.lang.String str2 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.C1759k c1759k = (com.google.android.gms.internal.cast.C1759k) c1767m.f18979c.get(com.google.android.gms.internal.cast.H.f(str2));
                                        if (c1759k != null) {
                                            map2.put(str2, c1759k);
                                        }
                                    }
                                    c1767m.f18979c.clear();
                                    c1767m.f18979c.putAll(map2);
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            }
                            com.google.android.gms.internal.cast.C1767m.f18976f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(java.lang.String.valueOf(c1767m.f18979c.keySet())), new java.lang.Object[0]);
                            synchronized (c1767m.f18980d) {
                                c1767m.f18980d.clear();
                                c1767m.f18980d.addAll(linkedHashSet);
                            }
                            c1767m.f();
                        }
                        xVar.d(new java.lang.String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS"}).c(new p008a8.c(27, this));
                        F3.n nVarB = F3.n.b();
                        nVarB.f3608d = new B3.u(xVar, new java.lang.String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 1);
                        nVarB.f3605a = new D3.d[]{p184w3.x.f29947d};
                        nVarB.f3606b = false;
                        nVarB.f3607c = 8427;
                        xVar.c(0, nVarB.a()).c(new p020c0.C1704s0(29, this));
                    } catch (android.os.RemoteException e6) {
                        throw new java.lang.IllegalStateException("Failed to call addAppVisibilityListener", e6);
                    }
                } catch (android.os.RemoteException e9) {
                    throw new java.lang.IllegalStateException("Failed to call getSessionManagerImpl", e9);
                }
            } catch (android.os.RemoteException e10) {
                throw new java.lang.IllegalStateException("Failed to call getDiscoveryManagerImpl", e10);
            }
        } catch (android.os.RemoteException e11) {
            throw new java.lang.IllegalStateException("Failed to call newCastContextImpl", e11);
        }
    }

    public static p191x3.C3100a a(android.content.Context context) {
        H3.q.d();
        if (f31157l == null) {
            synchronized (f31156k) {
                if (f31157l == null) {
                    android.content.Context applicationContext = context.getApplicationContext();
                    com.kiptv.player.chromecast.CastOptionsProvider castOptionsProviderB = b(applicationContext);
                    p191x3.C3101b castOptions = castOptionsProviderB.getCastOptions(applicationContext);
                    B3.x xVar = new B3.x(applicationContext, null, B3.x.f675k, E3.b.f2824a, E3.e.f2826c);
                    try {
                        f31157l = new p191x3.C3100a(applicationContext, castOptions, castOptionsProviderB.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.BinderC1783q(applicationContext, p105m2.C.d(applicationContext), castOptions, xVar), xVar);
                    } catch (p191x3.C3103d e6) {
                        throw new java.lang.RuntimeException(e6);
                    }
                }
            }
        }
        return f31157l;
    }

    public static com.kiptv.player.chromecast.CastOptionsProvider b(android.content.Context context) {
        try {
            D3.j jVarA = N3.b.a(context);
            try {
                android.os.Bundle bundle = jVarA.f2115a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    j.c(new java.lang.Object[0]);
                }
                java.lang.String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
                if (string != null) {
                    return (com.kiptv.player.chromecast.CastOptionsProvider) java.lang.Class.forName(string).asSubclass(com.kiptv.player.chromecast.CastOptionsProvider.class).getDeclaredConstructor(null).newInstance(null);
                }
                throw new java.lang.IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
            } catch (java.lang.ClassNotFoundException e6) {
                e = e6;
                throw new java.lang.IllegalStateException("Failed to initialize CastContext.", e);
            } catch (java.lang.IllegalAccessException e9) {
                e = e9;
                throw new java.lang.IllegalStateException("Failed to initialize CastContext.", e);
            } catch (java.lang.InstantiationException e10) {
                e = e10;
                throw new java.lang.IllegalStateException("Failed to initialize CastContext.", e);
            } catch (java.lang.NoSuchMethodException e11) {
                e = e11;
                throw new java.lang.IllegalStateException("Failed to initialize CastContext.", e);
            } catch (java.lang.NullPointerException e12) {
                e = e12;
                throw new java.lang.IllegalStateException("Failed to initialize CastContext.", e);
            } catch (java.lang.reflect.InvocationTargetException e13) {
                e = e13;
                throw new java.lang.IllegalStateException("Failed to initialize CastContext.", e);
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.NullPointerException | java.lang.reflect.InvocationTargetException e14) {
            e = e14;
        }
    }
}
