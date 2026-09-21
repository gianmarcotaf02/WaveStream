package com.kiptv.tv;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/kiptv/tv/KIPTVTvApplication;", "Landroid/app/Application;", "LE2/y;", "<init>", "()V", "Companion", "n5/i", "app-tv_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class KIPTVTvApplication extends android.app.Application implements E2.y, Z5.b {
    private static final p116n5.i Companion = new p116n5.i();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f20990t = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20991h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final X5.f f20992i = new X5.f(new p020c0.C1704s0(14, this));
    public p132p5.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p005a5.C1379q2 f20993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p015b5.k f20994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p015b5.w f20995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public U4.g f20996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p005a5.B3 f20997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p005a5.C1357o0 f20998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p005a5.D1 f20999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile int f21000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final X7.c f21001s;

    public KIPTVTvApplication() {
        Z7.e eVar = S7.M.f9549a;
        this.f21001s = S7.C.c(Z7.d.f13044i.plus(S7.C.e()));
    }

    @Override // E2.y
    public final E2.w a(android.content.Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        E2.d dVar = new E2.d(context, 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(new E2.C0276c(new U2.c(), 0));
        arrayList4.add(new C5.C0119j(new O2.j(new D5.C0261o(19, new io.ktor.http.a(16))), kotlin.jvm.internal.B.f24540a.b(E2.C.class), 8));
        dVar.f2773k = new E2.e(P3.e.m0(arrayList), P3.e.m0(arrayList2), P3.e.m0(arrayList3), P3.e.m0(arrayList4), P3.e.m0(arrayList5));
        dVar.j = com.google.common.util.concurrent.D.B(new io.ktor.http.a(17));
        return dVar.k();
    }

    @Override // Z5.b
    public final java.lang.Object b() {
        return this.f20992i.b();
    }

    public final void c() {
        if (!this.f20991h) {
            this.f20991h = true;
            p116n5.e eVar = (p116n5.e) ((p116n5.n) this.f20992i.b());
            this.j = (p132p5.a) eVar.f25733h.get();
            this.f20993k = (p005a5.C1379q2) eVar.y.get();
            this.f20994l = (p015b5.k) eVar.f25730f.get();
            this.f20995m = (p015b5.w) eVar.f25724c.get();
            this.f20996n = (U4.g) eVar.f25698A.get();
            this.f20997o = (p005a5.B3) eVar.f25709M.get();
            this.f20998p = (p005a5.C1357o0) eVar.f25712P.get();
            this.f20999q = (p005a5.D1) eVar.f25716T.get();
        }
        super.onCreate();
    }

    public final void d(P4.d dVar, java.lang.String str) {
        boolean z6 = dVar.f8140a;
        boolean z9 = dVar.f8141b;
        if (z6 || z9 || dVar.f8142c) {
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
            long j = 1048576;
            P4.a aVar = new P4.a((int) (jFreeMemory / j), (int) ((jMaxMemory - jFreeMemory) / j), (int) (jMaxMemory / j));
            android.util.Log.w("KIPTVTvApplication", str + " heap=" + aVar + " uiVisible=" + (this.f21000r > 0) + " — releasing " + dVar);
            if (dVar.f8140a) {
                try {
                    N2.c cVarC = ((E2.w) E2.z.a(this)).c();
                    if (cVarC != null) {
                        synchronized (cVarC.f7306c) {
                            cVarC.f7304a.clear();
                            Y2.L l2 = cVarC.f7305b;
                            l2.f11389i = 0;
                            ((java.util.LinkedHashMap) l2.j).clear();
                        }
                    }
                } catch (java.lang.Throwable th) {
                    com.google.common.util.concurrent.P.T(th);
                }
            }
            if (z9) {
                try {
                    p005a5.B3 b9 = this.f20997o;
                    if (b9 == null) {
                        kotlin.jvm.internal.m.k("searchRepository");
                        throw null;
                    }
                    b9.f();
                    try {
                        if (this.f20998p == null) {
                            kotlin.jvm.internal.m.k("homeFeedRepository");
                            throw null;
                        }
                    } catch (java.lang.Throwable th2) {
                        com.google.common.util.concurrent.P.T(th2);
                    }
                } catch (java.lang.Throwable th3) {
                    com.google.common.util.concurrent.P.T(th3);
                }
            }
            S7.C.A(this.f21001s, null, new p116n5.l(dVar, this, str, aVar, null), 3);
        }
    }

    @Override // android.app.Application
    public final void onCreate() {
        c();
        P4.c cVar = P4.c.f8138a;
        P4.b bVarB = cVar.b(this);
        java.util.Set set = p015b5.AbstractC1664a.f17935a;
        if (this.j == null) {
            kotlin.jvm.internal.m.k("appConfig");
            throw null;
        }
        if (!p015b5.AbstractC1664a.f17936b) {
            if (O7.q.N0("https://4o2LmyQzL91ppUUVAVVuaMoa@s2357704.eu-fsn-3.betterstackdata.com/2357704")) {
                android.util.Log.i("CrashReporting", "Sentry DSN blank — crash reporting disabled");
            } else {
                try {
                    p015b5.AbstractC1664a.f17938d = getApplicationContext();
                    io.sentry.android.core.SentryAndroid.init(this, new F1.e(14, this));
                    p015b5.AbstractC1664a.f17936b = true;
                    java.lang.String str = p015b5.AbstractC1664a.f17937c;
                    if (str != null) {
                        io.sentry.protocol.User user = new io.sentry.protocol.User();
                        user.setId(str);
                        io.sentry.Sentry.setUser(user);
                        io.sentry.Sentry.setTag("supabase_user_id", str);
                    }
                    android.util.Log.i("CrashReporting", "Sentry initialized");
                } catch (java.lang.Throwable th) {
                    android.util.Log.e("CrashReporting", "Sentry init failed: " + th.getMessage(), th);
                }
            }
        }
        java.util.Set set2 = p015b5.AbstractC1664a.f17935a;
        P4.b bVarB2 = cVar.b(this);
        long j = 1048576;
        java.util.Map mapN0 = p078i6.C.N0(new p070h6.k(io.sentry.ProfilingTraceData.JsonKeys.DEVICE_MODEL, android.os.Build.MODEL), new p070h6.k(io.sentry.ProfilingTraceData.JsonKeys.DEVICE_MANUFACTURER, android.os.Build.MANUFACTURER), new p070h6.k("device_name", android.os.Build.DEVICE), new p070h6.k("android_api", java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT)), new p070h6.k("low_ram_flag", java.lang.String.valueOf(bVarB2.f8133a)), new p070h6.k("low_memory_mode", java.lang.String.valueOf(bVarB2.f8137e)), new p070h6.k("memory_class_mb", java.lang.String.valueOf(bVarB2.f8134b)), new p070h6.k("large_memory_class_mb", java.lang.String.valueOf(bVarB2.f8135c)), new p070h6.k("total_ram_mb", java.lang.String.valueOf((int) (bVarB2.f8136d / j))));
        if (p015b5.AbstractC1664a.f17936b) {
            try {
                for (java.util.Map.Entry entry : mapN0.entrySet()) {
                    io.sentry.Sentry.setTag((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
            } catch (java.lang.Throwable th2) {
                B2.a.v("Sentry setDeviceContext failed: ", th2.getMessage(), "CrashReporting");
            }
        }
        int i3 = (int) (bVarB.f8136d / j);
        int i9 = bVarB.f8135c;
        boolean z6 = bVarB.f8133a;
        java.lang.String strB = P4.e.b();
        java.lang.StringBuilder sbS = p121o0.p.s(i3, i9, "Device memory: totalRam=", "MB heapLimit=", "MB lowRamFlag=");
        sbS.append(z6);
        sbS.append(" → policy=");
        sbS.append(strB);
        android.util.Log.i("KIPTVTvApplication", sbS.toString());
        final p005a5.C1379q2 c1379q2 = this.f20993k;
        if (c1379q2 == null) {
            kotlin.jvm.internal.m.k("purchaseRepository");
            throw null;
        }
        if (!c1379q2.f14996v) {
            c1379q2.f14981e.getClass();
            if (O7.q.N0("goog_pwtqqIXOdJMQjIRJqQzTGVewOuN")) {
                android.util.Log.i("PurchaseRepo", "RevenueCat API key blank — purchases disabled");
            } else {
                try {
                    com.revenuecat.purchases.Purchases.Companion companion = com.revenuecat.purchases.Purchases.INSTANCE;
                    companion.setLogLevel(com.revenuecat.purchases.LogLevel.WARN);
                    companion.configure(new com.revenuecat.purchases.PurchasesConfiguration.Builder(this, "goog_pwtqqIXOdJMQjIRJqQzTGVewOuN").build());
                    companion.getSharedInstance().setUpdatedCustomerInfoListener(new com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener() { // from class: a5.a2
                        @Override // com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener
                        public final void onReceived(com.revenuecat.purchases.CustomerInfo info) {
                            kotlin.jvm.internal.m.e(info, "info");
                            c1379q2.h(info);
                        }
                    });
                    c1379q2.f14996v = true;
                    android.util.Log.i("PurchaseRepo", "RevenueCat configured");
                } catch (java.lang.Throwable th3) {
                    android.util.Log.e("PurchaseRepo", "RevenueCat configure failed: " + th3.getMessage(), th3);
                }
            }
        }
        p015b5.w wVar = this.f20995m;
        if (wVar == null) {
            kotlin.jvm.internal.m.k("notificationService");
            throw null;
        }
        wVar.a();
        registerActivityLifecycleCallbacks(new p116n5.m(this));
        Z7.e eVar = S7.M.f9549a;
        S7.C.A(S7.C.c(Z7.d.f13044i.plus(S7.C.e())), null, new p116n5.k(this, null), 3);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        boolean z6 = !(this.f21000r > 0);
        d(new P4.d(true, z6, z6), io.sentry.protocol.Device.JsonKeys.LOW_MEMORY);
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i3) {
        P4.d dVar;
        super.onTrimMemory(i3);
        boolean z6 = this.f21000r > 0;
        if (i3 < 10) {
            dVar = P4.e.f8143a;
        } else if (z6 || i3 < 20) {
            dVar = i3 >= 15 ? new P4.d(true, false, false) : new P4.d(true, false, false);
        } else {
            dVar = new P4.d(true, true, true);
        }
        d(dVar, "trim_memory level=" + i3);
    }
}
