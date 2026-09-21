package Y2;

/* JADX INFO: renamed from: Y2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1033c extends Y2.AbstractC1032b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f11431A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f11432B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final X2.e f11433C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f11434D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f11435E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final java.lang.Long f11436F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final N3.a f11437G;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f11441d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile F3.u f11443f;
    public final android.content.Context g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final S2.a f11444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile com.google.android.gms.internal.play_billing.InterfaceC1828c f11445i;
    public volatile Y2.H j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11447l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f11453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f11455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f11456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11457v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f11458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11459x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11460z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f11438a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile int f11439b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.os.Handler f11442e = new android.os.Handler(android.os.Looper.getMainLooper());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11448m = 0;

    public C1033c(X2.e eVar, android.content.Context context, Y2.InterfaceC1049t interfaceC1049t, T1.f fVar) {
        long jNextLong = new java.util.Random().nextLong();
        this.f11436F = java.lang.Long.valueOf(jNextLong);
        this.f11437G = com.google.android.gms.internal.play_billing.AbstractC1849j.f19338a;
        this.f11440c = com.revenuecat.purchases.api.BuildConfig.BILLING_CLIENT_VERSION;
        java.lang.String strM = m();
        this.f11441d = strM;
        this.g = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.q1 q1VarZ = com.google.android.gms.internal.play_billing.r1.z();
        q1VarZ.c();
        com.google.android.gms.internal.play_billing.r1.x((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i);
        if (strM != null) {
            q1VarZ.c();
            com.google.android.gms.internal.play_billing.r1.y((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i, strM);
        }
        java.lang.String packageName = this.g.getPackageName();
        q1VarZ.c();
        com.google.android.gms.internal.play_billing.r1.q((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i, packageName);
        q1VarZ.c();
        com.google.android.gms.internal.play_billing.r1.D((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i, jNextLong);
        fVar.getClass();
        q1VarZ.c();
        com.google.android.gms.internal.play_billing.r1.w((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i);
        int i3 = android.os.Build.VERSION.SDK_INT;
        q1VarZ.c();
        com.google.android.gms.internal.play_billing.r1.A((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i, i3);
        q1VarZ.d();
        G(q1VarZ, context);
        try {
            int i9 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            q1VarZ.c();
            com.google.android.gms.internal.play_billing.r1.B((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i, i9);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Error getting app version code.", th);
        }
        this.f11444h = new S2.a(this.g, (com.google.android.gms.internal.play_billing.r1) q1VarZ.a());
        if (interfaceC1049t == null) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f11443f = new F3.u(this.g, interfaceC1049t, this.f11444h);
        this.f11433C = eVar;
        this.f11434D = false;
        this.g.getPackageName();
    }

    public static final void G(com.google.android.gms.internal.play_billing.q1 q1Var, android.content.Context context) {
        try {
            android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                int i3 = (int) (memoryInfo.totalMem / androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
                q1Var.c();
                com.google.android.gms.internal.play_billing.r1.v((com.google.android.gms.internal.play_billing.r1) q1Var.f19393i, i3);
                java.lang.String str = android.os.Build.BRAND;
                q1Var.c();
                com.google.android.gms.internal.play_billing.r1.r((com.google.android.gms.internal.play_billing.r1) q1Var.f19393i);
                java.lang.String str2 = android.os.Build.MODEL;
                q1Var.c();
                com.google.android.gms.internal.play_billing.r1.u((com.google.android.gms.internal.play_billing.r1) q1Var.f19393i);
                java.lang.String str3 = android.os.Build.MANUFACTURER;
                q1Var.c();
                com.google.android.gms.internal.play_billing.r1.t((com.google.android.gms.internal.play_billing.r1) q1Var.f19393i);
                java.lang.String str4 = android.os.Build.FINGERPRINT;
                q1Var.c();
                com.google.android.gms.internal.play_billing.r1.s((com.google.android.gms.internal.play_billing.r1) q1Var.f19393i);
            }
        } catch (java.lang.RuntimeException e6) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Runtime error while populating device info.", e6);
        }
    }

    public static java.util.concurrent.Future k(java.util.concurrent.Callable callable, long j, java.lang.Runnable runnable, android.os.Handler handler, java.util.concurrent.ExecutorService executorService) {
        try {
            java.util.concurrent.Future futureSubmit = executorService.submit(callable);
            handler.postDelayed(new com.google.common.util.concurrent.C(futureSubmit, runnable, 14), (long) (j * 0.95d));
            return futureSubmit;
        } catch (java.lang.Exception e6) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Async task throws exception!", e6);
            return null;
        }
    }

    public static java.lang.String m() {
        try {
            return (java.lang.String) java.lang.Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void q(Y2.C1033c c1033c, int i3) {
        c1033c.f11448m = i3;
        c1033c.f11432B = i3 >= 26;
        c1033c.f11431A = i3 >= 24;
        c1033c.f11460z = i3 >= 23;
        c1033c.y = i3 >= 21;
        c1033c.f11459x = i3 >= 20;
        c1033c.f11458w = i3 >= 19;
        c1033c.f11457v = i3 >= 18;
        c1033c.f11456u = i3 >= 17;
        c1033c.f11455t = i3 >= 16;
        c1033c.f11454s = i3 >= 15;
        c1033c.f11453r = i3 >= 14;
        c1033c.f11452q = i3 >= 12;
        c1033c.f11451p = i3 >= 9;
        c1033c.f11450o = i3 >= 8;
        c1033c.f11449n = i3 >= 6;
    }

    public static void r(Y2.C1033c c1033c, int i3) {
        if (i3 != 0) {
            c1033c.A(0);
            return;
        }
        synchronized (c1033c.f11438a) {
            try {
                if (c1033c.f11439b == 3) {
                    return;
                }
                c1033c.A(2);
                F3.u uVar = c1033c.f11443f != null ? c1033c.f11443f : null;
                if (uVar != null) {
                    boolean z6 = c1033c.y;
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
                    android.content.IntentFilter intentFilter2 = new android.content.IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
                    intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
                    uVar.f3634a = z6;
                    Y2.B b9 = (Y2.B) uVar.f3639f;
                    android.content.Context context = (android.content.Context) uVar.f3635b;
                    b9.a(context, intentFilter2);
                    if (!uVar.f3634a) {
                        ((Y2.B) uVar.f3638e).a(context, intentFilter);
                        return;
                    }
                    Y2.B b10 = (Y2.B) uVar.f3638e;
                    synchronized (b10) {
                        try {
                            if (b10.f11361a) {
                                return;
                            }
                            if (android.os.Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(b10, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != b10.f11362b ? 4 : 2);
                            } else {
                                context.registerReceiver(b10, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                            }
                            b10.f11361a = true;
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public final void A(int i3) {
        java.lang.String str;
        java.lang.String str2;
        synchronized (this.f11438a) {
            try {
                if (this.f11439b == 3) {
                    return;
                }
                int i9 = this.f11439b;
                if (i9 == 0) {
                    str = "DISCONNECTED";
                } else if (i9 != 1) {
                    str = i9 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str = "CONNECTING";
                }
                if (i3 == 0) {
                    str2 = "DISCONNECTED";
                } else if (i3 != 1) {
                    str2 = i3 != 2 ? "CLOSED" : "CONNECTED";
                } else {
                    str2 = "CONNECTING";
                }
                com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "Setting clientState from " + str + " to " + str2);
                this.f11439b = i3;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final void B(Y2.InterfaceC1034d interfaceC1034d) {
        int i3;
        Y2.C1040j c1040jU;
        synchronized (this.f11438a) {
            try {
                if (F()) {
                    c1040jU = u();
                } else if (this.f11439b == 1) {
                    com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Client is already in the process of connecting to billing service.");
                    c1040jU = Y2.S.f11406d;
                    z(37, c1040jU);
                } else if (this.f11439b == 3) {
                    com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
                    c1040jU = Y2.S.j;
                    z(38, c1040jU);
                } else {
                    A(1);
                    C();
                    com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "Starting in-app billing setup.");
                    this.j = new Y2.H(this, interfaceC1034d);
                    Y2.H h9 = this.j;
                    synchronized (h9.f11380k.f11438a) {
                        com.google.android.gms.internal.play_billing.C1858m c1858m = h9.f11379i;
                        c1858m.f19357c = 0L;
                        c1858m.f19356b = false;
                        c1858m.a();
                    }
                    android.content.Intent intent = new android.content.Intent("com.android.vending.billing.InAppBillingService.BIND");
                    intent.setPackage("com.android.vending");
                    java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = this.g.getPackageManager().queryIntentServices(intent, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        i3 = 41;
                    } else {
                        android.content.pm.ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                        i3 = 40;
                        if (serviceInfo != null) {
                            java.lang.String str = serviceInfo.packageName;
                            java.lang.String str2 = serviceInfo.name;
                            if (!java.util.Objects.equals(str, "com.android.vending") || str2 == null) {
                                com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "The device doesn't have valid Play Store.");
                            } else {
                                android.content.ComponentName componentName = new android.content.ComponentName(str, str2);
                                android.content.Intent intent2 = new android.content.Intent(intent);
                                intent2.setComponent(componentName);
                                intent2.putExtra("playBillingLibraryVersion", this.f11440c);
                                synchronized (this.f11438a) {
                                    try {
                                        if (this.f11439b == 2) {
                                            c1040jU = u();
                                        } else if (this.f11439b != 1) {
                                            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                                            c1040jU = Y2.S.j;
                                            z(105, c1040jU);
                                        } else {
                                            Y2.H h10 = this.j;
                                            if (this.g.bindService(intent2, h10, 1)) {
                                                com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "Service was bonded successfully.");
                                                c1040jU = null;
                                            } else {
                                                com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Connection to Billing service is blocked.");
                                                i3 = 39;
                                            }
                                        }
                                    } catch (java.lang.Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        } else {
                            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "The device doesn't have valid Play Store.");
                        }
                    }
                    A(0);
                    com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "Billing service unavailable on device.");
                    c1040jU = Y2.S.f11404b;
                    z(i3, c1040jU);
                }
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
        if (c1040jU != null) {
            interfaceC1034d.onBillingSetupFinished(c1040jU);
        }
    }

    public final void C() {
        synchronized (this.f11438a) {
            if (this.j != null) {
                try {
                    this.g.unbindService(this.j);
                    this.f11445i = null;
                    this.j = null;
                } catch (java.lang.Throwable th) {
                    try {
                        com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "There was an exception while unbinding service!", th);
                        this.f11445i = null;
                        this.j = null;
                    } catch (java.lang.Throwable th2) {
                        this.f11445i = null;
                        this.j = null;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean D() {
        try {
            com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "Already connected or not opted into auto reconnection.");
            Y2.C1040j c1040j = Y2.S.f11410i;
            java.util.concurrent.TimeUnit.MILLISECONDS.getClass();
            int i3 = c1040j.f11477a;
            if (i3 == 0) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "Reconnection succeeded with result: " + i3);
            } else {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Reconnection failed with result: " + i3);
            }
        } catch (java.lang.Exception e6) {
            if (e6 instanceof java.lang.InterruptedException) {
                java.lang.Thread.currentThread().interrupt();
            }
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Error during reconnection attempt: ", e6);
        }
        return F();
    }

    public final boolean E() {
        N3.a aVar = this.f11437G;
        if (aVar == null) {
            throw new java.lang.NullPointerException("ticker");
        }
        long jH = aVar.H();
        long j = 30000;
        int i3 = 1;
        long jConvert = 30000;
        while (i3 <= 3) {
            try {
                if (java.lang.Math.max(0L, jConvert) <= 0) {
                    com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "No time remaining for reconnection attempt.");
                    return F();
                }
                com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "Already connected or not opted into auto reconnection.");
                Y2.C1040j c1040j = Y2.S.f11410i;
                java.util.concurrent.TimeUnit.MILLISECONDS.getClass();
                int i9 = c1040j.f11477a;
                if (i9 == 0) {
                    com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "Reconnection succeeded with result: " + i9);
                    return F();
                }
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Reconnection failed with result: " + i9);
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                long jH2 = (aVar.H() - jH) + 0;
                java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
                jConvert = j - timeUnit.convert(jH2, timeUnit2);
                long j9 = j;
                long jPow = ((long) java.lang.Math.pow(2.0d, i3 - 1)) * 1000;
                if (jConvert < jPow) {
                    com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Reconnection failed due to timeout limit reached.");
                    return F();
                }
                if (i3 < 3 && jPow > 0) {
                    try {
                        java.lang.Thread.sleep(jPow);
                        jConvert = j9 - timeUnit.convert((aVar.H() - jH) + 0, timeUnit2);
                    } catch (java.lang.InterruptedException e6) {
                        java.lang.Thread.currentThread().interrupt();
                        com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Error sleeping during reconnection attempt: ", e6);
                    }
                }
                i3++;
                j = j9;
            } catch (java.lang.Exception e9) {
                if (e9 instanceof java.lang.InterruptedException) {
                    java.lang.Thread.currentThread().interrupt();
                }
                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Error during reconnection attempt: ", e9);
            }
        }
        com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Max retries reached.");
        return F();
    }

    public final boolean F() {
        boolean z6;
        synchronized (this.f11438a) {
            try {
                z6 = false;
                if (this.f11439b == 2 && this.f11445i != null && this.j != null) {
                    z6 = true;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    public final S2.a H(Y2.C1040j c1040j, int i3, java.lang.String str, java.lang.Exception exc) {
        L(i3, 9, c1040j, Y2.P.a(exc));
        com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", str, exc);
        return new S2.a(11, c1040j, null, false);
    }

    public final void I(int i3, int i9, Y2.C1040j c1040j) {
        com.google.android.gms.internal.play_billing.C1854k1 c1854k1 = null;
        com.google.android.gms.internal.play_billing.C1845h1 c1845h1 = null;
        if (c1040j.f11477a == 0) {
            int i10 = Y2.P.f11396a;
            try {
                com.google.android.gms.internal.play_billing.C1848i1 c1848i1Q = com.google.android.gms.internal.play_billing.C1854k1.q();
                c1848i1Q.c();
                com.google.android.gms.internal.play_billing.C1854k1.p((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.f19393i, 5);
                com.google.android.gms.internal.play_billing.t1 t1VarP = com.google.android.gms.internal.play_billing.u1.p();
                t1VarP.c();
                com.google.android.gms.internal.play_billing.u1.q((com.google.android.gms.internal.play_billing.u1) t1VarP.f19393i, i9);
                com.google.android.gms.internal.play_billing.u1 u1Var = (com.google.android.gms.internal.play_billing.u1) t1VarP.a();
                c1848i1Q.c();
                com.google.android.gms.internal.play_billing.C1854k1.t((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.f19393i, u1Var);
                c1854k1 = (com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.a();
            } catch (java.lang.Exception e6) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingLogger", "Unable to create logging payload", e6);
            }
            y(c1854k1);
            return;
        }
        int i11 = Y2.P.f11396a;
        try {
            com.google.android.gms.internal.play_billing.C1842g1 c1842g1S = com.google.android.gms.internal.play_billing.C1845h1.s();
            com.google.android.gms.internal.play_billing.C1857l1 c1857l1Q = com.google.android.gms.internal.play_billing.C1860m1.q();
            c1857l1Q.e(c1040j.f11477a);
            java.lang.String str = c1040j.f11479c;
            c1857l1Q.c();
            com.google.android.gms.internal.play_billing.C1860m1.s((com.google.android.gms.internal.play_billing.C1860m1) c1857l1Q.f19393i, str);
            c1857l1Q.d(i3);
            c1842g1S.d(c1857l1Q);
            c1842g1S.f(5);
            com.google.android.gms.internal.play_billing.t1 t1VarP2 = com.google.android.gms.internal.play_billing.u1.p();
            t1VarP2.c();
            com.google.android.gms.internal.play_billing.u1.q((com.google.android.gms.internal.play_billing.u1) t1VarP2.f19393i, i9);
            com.google.android.gms.internal.play_billing.u1 u1Var2 = (com.google.android.gms.internal.play_billing.u1) t1VarP2.a();
            c1842g1S.c();
            com.google.android.gms.internal.play_billing.C1845h1.x((com.google.android.gms.internal.play_billing.C1845h1) c1842g1S.f19393i, u1Var2);
            c1845h1 = (com.google.android.gms.internal.play_billing.C1845h1) c1842g1S.a();
        } catch (java.lang.Exception e9) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingLogger", "Unable to create logging payload", e9);
        }
        x(c1845h1);
    }

    public final void J(int i3, int i9, Y2.C1040j c1040j) {
        try {
            int i10 = Y2.P.f11396a;
            x(Y2.P.b(i3, i9, c1040j, null, com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void K(int i3, Y2.C1040j c1040j, long j) {
        try {
            int i9 = Y2.P.f11396a;
            try {
                this.f11444h.V(Y2.P.b(i3, 2, c1040j, null, com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED), this.f11448m, j);
            } catch (java.lang.Throwable th) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th);
            }
        } catch (java.lang.Throwable th2) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void L(int i3, int i9, Y2.C1040j c1040j, java.lang.String str) {
        try {
            int i10 = Y2.P.f11396a;
            x(Y2.P.b(i3, i9, c1040j, str, com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void M(int i3, Y2.C1040j c1040j, long j, boolean z6) {
        try {
            int i9 = Y2.P.f11396a;
            try {
                this.f11444h.X(Y2.P.b(i3, 2, c1040j, null, com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED), this.f11448m, j, z6);
            } catch (java.lang.Throwable th) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th);
            }
        } catch (java.lang.Throwable th2) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void N(int i3, Y2.C1040j c1040j, java.lang.String str, long j, boolean z6) {
        try {
            int i9 = Y2.P.f11396a;
            try {
                this.f11444h.X(Y2.P.b(i3, 2, c1040j, str, com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED), this.f11448m, j, z6);
            } catch (java.lang.Throwable th) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th);
            }
        } catch (java.lang.Throwable th2) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th2);
        }
    }

    public final void O(Y2.C1040j c1040j) {
        if (java.lang.Thread.interrupted()) {
            return;
        }
        this.f11442e.post(new com.google.common.util.concurrent.C(this, c1040j, 12));
    }

    @Override // Y2.AbstractC1032b
    public void a(Y2.C1031a c1031a, com.revenuecat.purchases.google.usecase.a aVar) {
        if (k(new V3.a(this, aVar, c1031a, 5), 30000L, new com.google.common.util.concurrent.C(this, aVar, 11), s(), j()) == null) {
            Y2.C1040j c1040jV = v();
            J(25, 3, c1040jV);
            aVar.c(c1040jV);
        }
    }

    @Override // Y2.AbstractC1032b
    public void b(N6.A a2, com.revenuecat.purchases.google.usecase.a aVar) {
        if (k(new V3.a(this, aVar, a2, 6), 30000L, new A1.n(this, aVar, a2, 2), s(), j()) == null) {
            Y2.C1040j c1040jV = v();
            J(25, 4, c1040jV);
            aVar.d(c1040jV, a2.f7359i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054 A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #5 {, blocks: (B:20:0x0050, B:22:0x0054), top: B:50:0x0050, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // Y2.AbstractC1032b
    public void c() {
        java.util.concurrent.ExecutorService executorService;
        try {
            int i3 = Y2.P.f11396a;
            y(Y2.P.c(12, com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED));
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th);
        }
        synchronized (this.f11438a) {
            try {
                if (this.f11443f != null) {
                    F3.u uVar = this.f11443f;
                    Y2.B b9 = (Y2.B) uVar.f3638e;
                    android.content.Context context = (android.content.Context) uVar.f3635b;
                    b9.b(context);
                    ((Y2.B) uVar.f3639f).b(context);
                    try {
                        com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "Unbinding from service.");
                        C();
                    } catch (java.lang.Throwable th2) {
                        com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "There was an exception while unbinding from the service while ending connection!", th2);
                    }
                    try {
                        synchronized (this) {
                            executorService = this.f11435E;
                            if (executorService != null) {
                                executorService.shutdownNow();
                                this.f11435E = null;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        try {
                            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "There was an exception while shutting down the executor service while ending connection!", th3);
                        } catch (java.lang.Throwable th4) {
                            A(3);
                            throw th4;
                        }
                    }
                    A(3);
                } else {
                    com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "Unbinding from service.");
                    C();
                    synchronized (this) {
                        executorService = this.f11435E;
                        if (executorService != null) {
                            executorService.shutdownNow();
                            this.f11435E = null;
                        }
                        A(3);
                    }
                }
            } catch (java.lang.Throwable th5) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "There was an exception while shutting down broadcast manager while ending connection!", th5);
            }
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    @Override // Y2.AbstractC1032b
    public final Y2.C1040j d(java.lang.String str) {
        if (!D()) {
            Y2.C1040j c1040j = Y2.S.j;
            if (c1040j.f11477a != 0) {
                J(2, 5, c1040j);
                return c1040j;
            }
            try {
                int i3 = Y2.P.f11396a;
                y(Y2.P.c(5, com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED));
                return c1040j;
            } catch (java.lang.Throwable th) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th);
                return c1040j;
            }
        }
        Y2.C1040j c1040j2 = Y2.S.f11403a;
        switch (str) {
            case "subscriptions":
                Y2.C1040j c1040j3 = this.f11446k ? Y2.S.f11410i : Y2.S.f11412l;
                I(9, 2, c1040j3);
                return c1040j3;
            case "subscriptionsUpdate":
                Y2.C1040j c1040j4 = this.f11447l ? Y2.S.f11410i : Y2.S.f11413m;
                I(10, 3, c1040j4);
                return c1040j4;
            case "priceChangeConfirmation":
                Y2.C1040j c1040j5 = this.f11450o ? Y2.S.f11410i : Y2.S.f11414n;
                I(35, 4, c1040j5);
                return c1040j5;
            case "bbb":
                Y2.C1040j c1040j6 = this.f11452q ? Y2.S.f11410i : Y2.S.f11419s;
                I(30, 5, c1040j6);
                return c1040j6;
            case "aaa":
                Y2.C1040j c1040j7 = this.f11454s ? Y2.S.f11410i : Y2.S.f11415o;
                I(31, 6, c1040j7);
                return c1040j7;
            case "ddd":
                Y2.C1040j c1040j8 = this.f11453r ? Y2.S.f11410i : Y2.S.f11417q;
                I(21, 7, c1040j8);
                return c1040j8;
            case "ccc":
                Y2.C1040j c1040j9 = this.f11455t ? Y2.S.f11410i : Y2.S.f11416p;
                I(19, 8, c1040j9);
                return c1040j9;
            case "eee":
                Y2.C1040j c1040j10 = this.f11455t ? Y2.S.f11410i : Y2.S.f11416p;
                I(61, 9, c1040j10);
                return c1040j10;
            case "fff":
                Y2.C1040j c1040j11 = this.f11456u ? Y2.S.f11410i : Y2.S.f11418r;
                I(20, 10, c1040j11);
                return c1040j11;
            case "ggg":
                Y2.C1040j c1040j12 = this.f11457v ? Y2.S.f11410i : Y2.S.y;
                I(32, 11, c1040j12);
                return c1040j12;
            case "hhh":
                Y2.C1040j c1040j13 = this.f11457v ? Y2.S.f11410i : Y2.S.f11425z;
                I(33, 12, c1040j13);
                return c1040j13;
            case "iii":
                Y2.C1040j c1040j14 = this.f11459x ? Y2.S.f11410i : Y2.S.f11399B;
                I(60, 13, c1040j14);
                return c1040j14;
            case "jjj":
                Y2.C1040j c1040j15 = this.y ? Y2.S.f11410i : Y2.S.f11400C;
                I(66, 14, c1040j15);
                return c1040j15;
            case "kkk":
                Y2.C1040j c1040j16 = this.f11431A ? Y2.S.f11410i : Y2.S.f11420t;
                I(83, 18, c1040j16);
                return c1040j16;
            case "lll":
                Y2.C1040j c1040j17 = this.f11460z ? Y2.S.f11410i : Y2.S.f11421u;
                I(104, 19, c1040j17);
                return c1040j17;
            case "mmm":
                Y2.C1040j c1040j18 = this.f11431A ? Y2.S.f11410i : Y2.S.f11422v;
                I(119, 20, c1040j18);
                return c1040j18;
            case "nnn":
                Y2.C1040j c1040j19 = this.f11432B ? Y2.S.f11410i : Y2.S.f11423w;
                I(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS, 21, c1040j19);
                return c1040j19;
            default:
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Unsupported feature: ".concat(str));
                Y2.C1040j c1040j20 = Y2.S.f11424x;
                I(34, 1, c1040j20);
                return c1040j20;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x029c A[EDGE_INSN: B:118:0x029c->B:75:0x0175 BREAK  A[LOOP:4: B:68:0x013a->B:76:0x0178]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [Y2.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r5v3, types: [long] */
    /* JADX WARN: Type inference failed for: r5v4, types: [long] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v85 */
    /* JADX WARN: Type inference failed for: r6v86 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    @Override // Y2.AbstractC1032b
    public Y2.C1040j e(android.app.Activity activity, final Y2.C1039i c1039i) {
        boolean z6;
        java.lang.String str;
        java.lang.String str2;
        long j;
        java.lang.String str3;
        Y2.C1040j c1040jA;
        Y2.C1044n c1044n;
        Y2.C1040j c1040j;
        long j9;
        boolean z9;
        java.lang.String str4;
        java.util.concurrent.Future futureK;
        java.lang.String str5;
        ?? r9;
        ?? r10;
        ?? r11;
        ?? r12;
        int iA;
        int i3;
        java.lang.String string;
        java.lang.String str6;
        boolean z10;
        long j10;
        java.lang.String str7;
        java.util.ArrayList arrayList;
        boolean z11;
        int i9;
        boolean z12 = true;
        long jNextLong = new java.util.Random().nextLong();
        if (this.f11443f == null || ((Y2.InterfaceC1049t) this.f11443f.f3636c) == null) {
            Y2.C1040j c1040j2 = Y2.S.f11401D;
            K(12, c1040j2, jNextLong);
            return c1040j2;
        }
        c1039i.getClass();
        if (!D()) {
            Y2.C1040j c1040j3 = Y2.S.j;
            K(2, c1040j3, jNextLong);
            O(c1040j3);
            return c1040j3;
        }
        synchronized (this.f11438a) {
            try {
                if (this.j != null) {
                    this.j.getClass();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(c1039i.f11475e);
        com.google.android.gms.internal.play_billing.r rVar = c1039i.f11474d;
        java.util.Iterator it = arrayList2.iterator();
        if ((it.hasNext() ? it.next() : null) != null) {
            throw new java.lang.ClassCastException();
        }
        com.google.android.gms.internal.play_billing.C1865p c1865p = (com.google.android.gms.internal.play_billing.C1865p) rVar.iterator();
        Y2.C1037g c1037g = (Y2.C1037g) (c1865p.hasNext() ? c1865p.next() : null);
        Y2.C1047q c1047q = c1037g.f11466a;
        java.lang.String str8 = c1047q.f11504c;
        java.lang.String str9 = c1047q.f11505d;
        if (str9.equals("subs") && !this.f11446k) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Current client doesn't support subscriptions.");
            Y2.C1040j c1040j4 = Y2.S.f11412l;
            M(9, c1040j4, jNextLong, false);
            O(c1040j4);
            return c1040j4;
        }
        if (c1039i.f11472b == null) {
            Y2.L l2 = c1039i.f11473c;
            l2.getClass();
            if (l2.f11389i == 0 && !c1039i.f11471a && !c1039i.f11476f) {
                com.google.android.gms.internal.play_billing.r rVar2 = c1039i.f11474d;
                if (rVar2 != null) {
                    int size = rVar2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((Y2.C1037g) rVar2.get(i10)).getClass();
                    }
                }
            } else if (!this.f11449n) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Current client doesn't support extra params for buy intent.");
                Y2.C1040j c1040j5 = Y2.S.f11408f;
                M(18, c1040j5, jNextLong, false);
                O(c1040j5);
                return c1040j5;
            }
        } else if (!this.f11449n) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Current client doesn't support extra params for buy intent.");
            Y2.C1040j c1040j6 = Y2.S.f11408f;
            M(18, c1040j6, jNextLong, false);
            O(c1040j6);
            return c1040j6;
        }
        if (arrayList2.size() > 1 && !this.f11455t) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Current client doesn't support multi-item purchases.");
            Y2.C1040j c1040j7 = Y2.S.f11416p;
            M(19, c1040j7, jNextLong, false);
            O(c1040j7);
            return c1040j7;
        }
        if (!rVar.isEmpty() && !this.f11456u) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Current client doesn't support purchases with ProductDetails.");
            Y2.C1040j c1040j8 = Y2.S.f11418r;
            M(20, c1040j8, jNextLong, false);
            O(c1040j8);
            return c1040j8;
        }
        if (c1039i.f11474d.isEmpty()) {
            str2 = str8;
            j = jNextLong;
            z6 = true;
            str3 = str9;
            c1040j = Y2.S.f11410i;
            str = null;
        } else {
            Y2.C1037g c1037g2 = (Y2.C1037g) c1039i.f11474d.get(0);
            int i11 = 1;
            while (true) {
                z6 = z12;
                if (i11 >= c1039i.f11474d.size()) {
                    str = null;
                    java.lang.String strOptString = c1037g2.f11466a.f11503b.optString("packageName");
                    java.util.HashMap map = new java.util.HashMap();
                    java.util.HashSet hashSet = new java.util.HashSet();
                    com.google.android.gms.internal.play_billing.r rVar3 = c1039i.f11474d;
                    str2 = str8;
                    int size2 = rVar3.size();
                    j = jNextLong;
                    int i12 = 0;
                    while (true) {
                        str3 = str9;
                        Y2.C1047q c1047q2 = c1037g2.f11466a;
                        if (i12 < size2) {
                            com.google.android.gms.internal.play_billing.r rVar4 = rVar3;
                            Y2.C1037g c1037g3 = (Y2.C1037g) rVar3.get(i12);
                            c1037g3.getClass();
                            int i13 = size2;
                            Y2.C1047q c1047q3 = c1037g3.f11466a;
                            int i14 = i12;
                            java.util.ArrayList arrayList3 = c1047q3.j;
                            java.lang.String str10 = c1047q3.f11504c;
                            if (arrayList3 != null && c1037g3.f11467b == null) {
                                c1040jA = Y2.S.a(5, "offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: " + str10);
                                break;
                            }
                            if (map.containsKey(str10)) {
                                c1040jA = Y2.S.a(5, "ProductId can not be duplicated. Invalid product id: " + str10 + ".");
                                break;
                            }
                            map.put(str10, c1037g3);
                            if (!c1047q2.f11505d.equals("play_pass_subs") && !c1047q3.f11505d.equals("play_pass_subs") && !strOptString.equals(c1047q3.f11503b.optString("packageName"))) {
                                c1040jA = Y2.S.a(5, "All products must have the same package name.");
                                break;
                            }
                            i12 = i14 + 1;
                            str9 = str3;
                            size2 = i13;
                            rVar3 = rVar4;
                            hashSet = hashSet;
                        } else {
                            java.util.Iterator it2 = hashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    java.util.ArrayList arrayList4 = c1047q2.f11510k;
                                    java.lang.String str11 = c1037g2.f11467b;
                                    if (str11 != null && arrayList4 != null) {
                                        java.util.Iterator it3 = arrayList4.iterator();
                                        do {
                                            if (!it3.hasNext()) {
                                                c1044n = null;
                                                break;
                                            }
                                            c1044n = (Y2.C1044n) it3.next();
                                        } while (!str11.equals(c1044n.f11487d));
                                        if (c1044n != null && c1044n.g != null) {
                                            c1040jA = Y2.S.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
                                            break;
                                        }
                                        c1040jA = Y2.S.f11410i;
                                        break;
                                    }
                                    c1040jA = Y2.S.f11410i;
                                    break;
                                }
                                java.lang.String str12 = (java.lang.String) it2.next();
                                if (map.containsKey(str12)) {
                                    ((Y2.C1037g) map.get(str12)).getClass();
                                    c1040jA = Y2.S.a(5, "OldProductId must not be one of the products to be purchased. Invalid old product id: " + str12 + ".");
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    Y2.C1037g c1037g4 = (Y2.C1037g) c1039i.f11474d.get(i11);
                    str = null;
                    if (!c1037g4.f11466a.f11505d.equals(c1037g2.f11466a.f11505d) && !c1037g4.f11466a.f11505d.equals("play_pass_subs")) {
                        c1040jA = Y2.S.a(5, "All products should have same ProductType.");
                        str2 = str8;
                        j = jNextLong;
                        str3 = str9;
                        break;
                    }
                    i11++;
                    z12 = z6;
                }
            }
            c1040j = c1040jA;
        }
        if (c1040j != Y2.S.f11410i) {
            M(108, c1040j, j, false);
            O(c1040j);
            return c1040j;
        }
        android.os.Bundle bundle = null;
        long j11 = j;
        if (this.f11449n) {
            boolean z13 = this.f11451p;
            boolean z14 = this.f11458w;
            this.f11433C.getClass();
            boolean z15 = this.f11433C.f10827a;
            boolean z16 = this.f11434D;
            java.lang.String str13 = this.f11440c;
            java.lang.String str14 = this.f11441d;
            long jLongValue = this.f11436F.longValue();
            this.g.getPackageName();
            int i15 = com.google.android.gms.internal.play_billing.AbstractC1872t.f19388a;
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.google.android.gms.internal.play_billing.AbstractC1872t.b(bundle2, str13, str14, jLongValue);
            bundle2.putLong("billingClientTransactionId", j11);
            int i16 = c1039i.f11473c.f11389i;
            if (i16 != 0) {
                bundle2.putInt("prorationMode", i16);
            }
            if (!android.text.TextUtils.isEmpty(c1039i.f11472b)) {
                bundle2.putString("accountId", c1039i.f11472b);
            }
            if (android.text.TextUtils.isEmpty(str)) {
                str6 = str;
            } else {
                str6 = str;
                bundle2.putString("obfuscatedProfileId", str6);
            }
            if (c1039i.f11476f) {
                bundle2.putBoolean("isOfferPersonalizedByDeveloper", z6);
            }
            if (!android.text.TextUtils.isEmpty(str6)) {
                bundle2.putStringArrayList("skusToReplace", new java.util.ArrayList<>(java.util.Arrays.asList(str6)));
            }
            if (!android.text.TextUtils.isEmpty((java.lang.String) c1039i.f11473c.j)) {
                bundle2.putString("oldSkuPurchaseToken", (java.lang.String) c1039i.f11473c.j);
            }
            if (!android.text.TextUtils.isEmpty(null)) {
                bundle2.putString("oldSkuPurchaseId", null);
            }
            c1039i.f11473c.getClass();
            if (!android.text.TextUtils.isEmpty(null)) {
                c1039i.f11473c.getClass();
                bundle2.putString("originalExternalTransactionId", null);
            }
            if (!android.text.TextUtils.isEmpty(null)) {
                bundle2.putString("paymentsPurchaseParams", null);
            }
            if (z13) {
                z10 = true;
                bundle2.putBoolean("enablePendingPurchases", true);
            } else {
                z10 = true;
            }
            if (z14 && z15) {
                bundle2.putBoolean("enablePendingPurchaseForSubscriptions", z10);
            }
            if (z16) {
                bundle2.putBoolean("enableAlternativeBilling", z10);
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            com.google.android.gms.internal.play_billing.C1865p c1865pListIterator = c1039i.f11474d.listIterator(0);
            while (c1865pListIterator.hasNext()) {
                ((Y2.C1037g) c1865pListIterator.next()).getClass();
            }
            if (!arrayList5.isEmpty()) {
                com.google.android.gms.internal.play_billing.C1826b0 c1826b0P = com.google.android.gms.internal.play_billing.C1829c0.p();
                c1826b0P.c();
                com.google.android.gms.internal.play_billing.C1829c0.q((com.google.android.gms.internal.play_billing.C1829c0) c1826b0P.f19393i, arrayList5);
                bundle2.putByteArray("subscriptionProductReplacementParamsList", ((com.google.android.gms.internal.play_billing.C1829c0) c1826b0P.a()).b());
            }
            if (arrayList2.isEmpty()) {
                java.util.ArrayList<java.lang.String> arrayList6 = new java.util.ArrayList<>(rVar.size() - 1);
                java.util.ArrayList<java.lang.String> arrayList7 = new java.util.ArrayList<>(rVar.size() - 1);
                java.util.ArrayList<java.lang.String> arrayList8 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList9 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.String> arrayList10 = new java.util.ArrayList<>();
                java.util.ArrayList<java.lang.Integer> arrayList11 = new java.util.ArrayList<>();
                int i17 = 0;
                while (i17 < rVar.size()) {
                    Y2.C1037g c1037g5 = (Y2.C1037g) rVar.get(i17);
                    Y2.C1047q c1047q4 = c1037g5.f11466a;
                    if (!c1047q4.f11508h.isEmpty()) {
                        arrayList8.add(c1047q4.f11508h);
                    }
                    java.lang.String str15 = c1037g5.f11467b;
                    arrayList9.add(str15);
                    if (android.text.TextUtils.isEmpty(str15) || (arrayList = c1047q4.f11510k) == null || arrayList.isEmpty()) {
                        j10 = j11;
                        str7 = c1047q4.f11509i;
                        break;
                    }
                    java.util.Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            j10 = j11;
                            str7 = c1047q4.f11509i;
                            break;
                        }
                        j10 = j11;
                        Y2.C1044n c1044n2 = (Y2.C1044n) it4.next();
                        if (!android.text.TextUtils.isEmpty(c1044n2.f11489f) && java.util.Objects.equals(c1044n2.f11487d, str15)) {
                            str7 = c1044n2.f11489f;
                            break;
                        }
                        j11 = j10;
                    }
                    if (!android.text.TextUtils.isEmpty(str7)) {
                        arrayList10.add(str7);
                    }
                    if (i17 > 0) {
                        arrayList6.add(((Y2.C1037g) rVar.get(i17)).f11466a.f11504c);
                        arrayList7.add(((Y2.C1037g) rVar.get(i17)).f11466a.f11505d);
                    }
                    i17++;
                    j11 = j10;
                }
                j9 = j11;
                bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList9);
                if (!arrayList11.isEmpty()) {
                    bundle2.putIntegerArrayList("autoPayBalanceThresholdList", arrayList11);
                }
                if (!arrayList8.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList8);
                }
                if (!arrayList10.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList10);
                }
                if (!arrayList6.isEmpty()) {
                    bundle2.putStringArrayList("additionalSkus", arrayList6);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList7);
                }
            } else {
                java.util.ArrayList<java.lang.String> arrayList12 = new java.util.ArrayList<>();
                new java.util.ArrayList();
                new java.util.ArrayList();
                new java.util.ArrayList();
                new java.util.ArrayList();
                java.util.Iterator it5 = arrayList2.iterator();
                if (it5.hasNext()) {
                    it5.next().getClass();
                    throw new java.lang.ClassCastException();
                }
                if (!arrayList12.isEmpty()) {
                    bundle2.putStringArrayList("skuDetailsTokens", arrayList12);
                }
                if (arrayList2.size() > 1) {
                    java.util.ArrayList<java.lang.String> arrayList13 = new java.util.ArrayList<>(arrayList2.size() - 1);
                    java.util.ArrayList<java.lang.String> arrayList14 = new java.util.ArrayList<>(arrayList2.size() - 1);
                    if (1 < arrayList2.size()) {
                        arrayList2.get(1).getClass();
                        throw new java.lang.ClassCastException();
                    }
                    bundle2.putStringArrayList("additionalSkus", arrayList13);
                    bundle2.putStringArrayList("additionalSkuTypes", arrayList14);
                }
                j9 = j11;
            }
            if (bundle2.containsKey("SKU_OFFER_ID_TOKEN_LIST") && !this.f11453r) {
                Y2.C1040j c1040j9 = Y2.S.f11417q;
                M(21, c1040j9, j9, false);
                O(c1040j9);
                return c1040j9;
            }
            z9 = false;
            if (android.text.TextUtils.isEmpty(c1037g.f11466a.f11503b.optString("packageName"))) {
                z11 = false;
            } else {
                bundle2.putString("skuPackageName", c1037g.f11466a.f11503b.optString("packageName"));
                z11 = true;
            }
            str4 = null;
            if (!android.text.TextUtils.isEmpty(null)) {
                bundle2.putString("accountName", null);
            }
            android.content.Intent intent = activity.getIntent();
            if (intent == null) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Activity's intent is null.");
            } else if (!android.text.TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                java.lang.String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                bundle2.putString("proxyPackage", stringExtra);
                try {
                    bundle2.putString("proxyPackageVersion", this.g.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    bundle2.putString("proxyPackageVersion", "package not found");
                }
            }
            if (this.f11456u && !rVar.isEmpty()) {
                i9 = 17;
            } else if (this.f11454s && z11) {
                i9 = 15;
            } else {
                i9 = this.f11451p ? 9 : 6;
            }
            final int i18 = i9;
            final android.os.Bundle bundle3 = bundle2;
            final java.lang.String str16 = str2;
            final java.lang.String str17 = str3;
            futureK = k(new java.util.concurrent.Callable(i18, str16, str17, c1039i, bundle3) { // from class: Y2.C

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f11365b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f11366c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ java.lang.String f11367d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ android.os.Bundle f11368e;

                {
                    this.f11368e = bundle3;
                }

                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    android.os.Bundle bundleC;
                    com.google.android.gms.internal.play_billing.InterfaceC1828c interfaceC1828c;
                    Y2.C1033c c1033c = this.f11364a;
                    int i19 = this.f11365b;
                    java.lang.String str18 = this.f11366c;
                    java.lang.String str19 = this.f11367d;
                    android.os.Bundle bundle4 = this.f11368e;
                    c1033c.getClass();
                    try {
                        synchronized (c1033c.f11438a) {
                            interfaceC1828c = c1033c.f11445i;
                        }
                        if (interfaceC1828c == null) {
                            return com.google.android.gms.internal.play_billing.AbstractC1872t.c(107, Y2.S.j);
                        }
                        return ((com.google.android.gms.internal.play_billing.C1822a) interfaceC1828c).j0(i19, c1033c.g.getPackageName(), str18, str19, bundle4);
                    } catch (android.os.DeadObjectException e6) {
                        Y2.C1040j c1040j10 = Y2.S.j;
                        java.lang.String strA = Y2.P.a(e6);
                        bundleC = com.google.android.gms.internal.play_billing.AbstractC1872t.c(5, c1040j10);
                        if (strA != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA);
                        }
                        return bundleC;
                    } catch (java.lang.Exception e9) {
                        Y2.C1040j c1040j11 = Y2.S.f11409h;
                        java.lang.String strA2 = Y2.P.a(e9);
                        bundleC = com.google.android.gms.internal.play_billing.AbstractC1872t.c(5, c1040j11);
                        if (strA2 != null) {
                            bundleC.putString("ADDITIONAL_LOG_DETAILS", strA2);
                        }
                        return bundleC;
                    }
                }
            }, 5000L, null, this.f11442e, j());
            str5 = str17;
            bundle = bundle3;
        } else {
            j9 = j11;
            z9 = false;
            str4 = str;
            java.lang.String str18 = str3;
            futureK = k(new V3.a(this, str2, str18, 4), 5000L, null, this.f11442e, j());
            str5 = str18;
        }
        try {
            if (futureK == null) {
                try {
                    Y2.C1040j c1040j10 = Y2.S.f11405c;
                    M(25, c1040j10, j9, z9);
                    O(c1040j10);
                    return c1040j10;
                } catch (java.util.concurrent.CancellationException e6) {
                    e = e6;
                    r11 = z9;
                    r12 = j9;
                    com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    Y2.C1040j c1040j11 = Y2.S.f11411k;
                    N(4, c1040j11, Y2.P.a(e), r12, r11);
                    O(c1040j11);
                    return c1040j11;
                } catch (java.util.concurrent.TimeoutException e9) {
                    e = e9;
                    r11 = z9;
                    r12 = j9;
                    com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                    Y2.C1040j c1040j12 = Y2.S.f11411k;
                    N(4, c1040j12, Y2.P.a(e), r12, r11);
                    O(c1040j12);
                    return c1040j12;
                } catch (java.lang.Exception e10) {
                    e = e10;
                    r9 = z9;
                    r10 = j9;
                    com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                    Y2.C1040j c1040j13 = Y2.S.j;
                    N(5, c1040j13, Y2.P.a(e), r10, r9);
                    O(c1040j13);
                    return c1040j13;
                }
            }
            boolean z17 = z9;
            long j12 = j9;
            android.os.Bundle bundle4 = (android.os.Bundle) futureK.get(5000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            int iA2 = com.google.android.gms.internal.play_billing.AbstractC1872t.a("BillingClient", bundle4);
            java.lang.String strF = com.google.android.gms.internal.play_billing.AbstractC1872t.f("BillingClient", bundle4);
            if (iA2 == 0) {
                android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.android.billingclient.api.ProxyBillingActivity.class);
                intent2.putExtra("BUY_INTENT", (android.app.PendingIntent) bundle4.getParcelable("BUY_INTENT"));
                intent2.putExtra("billingClientTransactionId", j12);
                intent2.putExtra("wasServiceAutoReconnected", z17);
                activity.startActivity(intent2);
                return Y2.S.f11410i;
            }
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Unable to buy item, Error response code: " + iA2);
            Y2.C1040j c1040jA2 = Y2.S.a(iA2, strF);
            if (bundle4 == null) {
                i3 = 1;
                iA = 1;
            } else {
                try {
                    java.lang.Object obj = bundle4.get("LOG_REASON");
                    if (obj != null) {
                        if (obj instanceof java.lang.Integer) {
                            iA = com.google.android.gms.internal.play_billing.M0.a(((java.lang.Integer) obj).intValue());
                            i3 = 1;
                        } else {
                            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Unexpected type for bundle log reason: " + obj.getClass().getName());
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Failed to get log reason from bundle: ".concat(java.lang.String.valueOf(th2.getMessage())));
                }
                i3 = 1;
                iA = 1;
            }
            if (iA == i3) {
                iA = 23;
            }
            if (bundle4 == null) {
                string = str4;
            } else {
                try {
                    string = bundle4.getString("ADDITIONAL_LOG_DETAILS");
                } catch (java.lang.Throwable th3) {
                    com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Failed to get additional log details from bundle: ".concat(java.lang.String.valueOf(th3.getMessage())));
                    string = str4;
                }
            }
            try {
                N(iA, c1040jA2, string, j12, z17);
                O(c1040jA2);
                return c1040jA2;
            } catch (java.util.concurrent.CancellationException e11) {
                e = e11;
                r12 = j12;
                r11 = z17;
                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                Y2.C1040j c1040j14 = Y2.S.f11411k;
                N(4, c1040j14, Y2.P.a(e), r12, r11);
                O(c1040j14);
                return c1040j14;
            } catch (java.util.concurrent.TimeoutException e12) {
                e = e12;
                r12 = j12;
                r11 = z17;
                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Time out while launching billing flow. Try to reconnect", e);
                Y2.C1040j c1040j15 = Y2.S.f11411k;
                N(4, c1040j15, Y2.P.a(e), r12, r11);
                O(c1040j15);
                return c1040j15;
            } catch (java.lang.Exception e13) {
                e = e13;
                r10 = j12;
                r9 = z17;
                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Exception while launching billing flow. Try to reconnect", e);
                Y2.C1040j c1040j16 = Y2.S.j;
                N(5, c1040j16, Y2.P.a(e), r10, r9);
                O(c1040j16);
                return c1040j16;
            }
        } catch (java.util.concurrent.CancellationException e14) {
            e = e14;
            r12 = str5;
            r11 = bundle;
        } catch (java.util.concurrent.TimeoutException e15) {
            e = e15;
            r12 = str5;
            r11 = bundle;
        } catch (java.lang.Exception e16) {
            e = e16;
            r10 = str5;
            r9 = bundle;
        }
    }

    @Override // Y2.AbstractC1032b
    public void f(Y2.w wVar, com.revenuecat.purchases.google.usecase.c cVar) {
        if (k(new V3.a(this, cVar, wVar, 7), 30000L, new com.google.common.util.concurrent.C(this, cVar, 15), s(), j()) == null) {
            Y2.C1040j c1040jV = v();
            J(25, 7, c1040jV);
            com.google.android.gms.internal.play_billing.C1865p c1865p = com.google.android.gms.internal.play_billing.r.f19379i;
            com.google.android.gms.internal.play_billing.C1876v c1876v = com.google.android.gms.internal.play_billing.C1876v.f19394l;
            cVar.a(c1040jV, new Y2.x(c1876v, c1876v));
        }
    }

    @Override // Y2.AbstractC1032b
    public final void g(Y2.z zVar, Y2.InterfaceC1048s interfaceC1048s) {
        if (k(new V3.a(this, interfaceC1048s, zVar.f11518a), 30000L, new com.google.common.util.concurrent.C(this, interfaceC1048s, 16), s(), j()) == null) {
            Y2.C1040j c1040jV = v();
            J(25, 9, c1040jV);
            com.google.android.gms.internal.play_billing.C1865p c1865p = com.google.android.gms.internal.play_billing.r.f19379i;
            interfaceC1048s.b(c1040jV, com.google.android.gms.internal.play_billing.C1876v.f19394l);
        }
    }

    @Override // Y2.AbstractC1032b
    public final Y2.C1040j h(final android.app.Activity activity, Y2.C1041k c1041k, com.revenuecat.purchases.google.c cVar) {
        if (!D()) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Service disconnected.");
            return Y2.S.j;
        }
        if (!this.f11452q) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Current client doesn't support showing in-app messages.");
            return Y2.S.f11419s;
        }
        android.view.View viewFindViewById = activity.findViewById(android.R.id.content);
        android.os.IBinder windowToken = viewFindViewById.getWindowToken();
        android.graphics.Rect rect = new android.graphics.Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBinder("KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f11440c);
        java.lang.String str = this.f11441d;
        if (str != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str);
        }
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", c1041k.f11480a);
        android.os.Handler handler = this.f11442e;
        final Y2.G g = new Y2.G(this, handler, cVar);
        k(new java.util.concurrent.Callable() { // from class: Y2.E
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                com.google.android.gms.internal.play_billing.InterfaceC1828c interfaceC1828c;
                Y2.C1033c c1033c = this.f11371a;
                android.os.Bundle bundle2 = bundle;
                android.app.Activity activity2 = activity;
                Y2.G g9 = g;
                c1033c.getClass();
                try {
                    synchronized (c1033c.f11438a) {
                        interfaceC1828c = c1033c.f11445i;
                    }
                    if (interfaceC1828c == null) {
                        c1033c.w(-1, 107, null);
                        return null;
                    }
                    ((com.google.android.gms.internal.play_billing.C1822a) interfaceC1828c).o0(c1033c.g.getPackageName(), bundle2, new Y2.J(new java.lang.ref.WeakReference(activity2), g9));
                    return null;
                } catch (android.os.DeadObjectException e6) {
                    c1033c.w(-1, 106, e6);
                    return null;
                } catch (java.lang.Exception e9) {
                    c1033c.w(6, 106, e9);
                    return null;
                }
            }
        }, 5000L, null, handler, j());
        return Y2.S.f11410i;
    }

    @Override // Y2.AbstractC1032b
    public void i(Y2.InterfaceC1034d interfaceC1034d) {
        B(interfaceC1034d);
    }

    public final synchronized java.util.concurrent.ExecutorService j() {
        try {
            if (this.f11435E == null) {
                this.f11435E = java.util.concurrent.Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.AbstractC1872t.f19388a, new Y2.F(this));
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f11435E;
    }

    public final void l() {
        if (android.text.TextUtils.isEmpty(null)) {
            this.g.getPackageName();
        }
    }

    public final void n(com.revenuecat.purchases.google.usecase.a aVar, Y2.C1040j c1040j, int i3, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Error in acknowledge purchase!", exc);
        L(i3, 3, c1040j, Y2.P.a(exc));
        aVar.c(c1040j);
    }

    public final void o(com.revenuecat.purchases.google.usecase.a aVar, java.lang.String str, Y2.C1040j c1040j, int i3, java.lang.String str2, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", str2, exc);
        L(i3, 4, c1040j, Y2.P.a(exc));
        aVar.d(c1040j, str);
    }

    public final void p(com.revenuecat.purchases.google.usecase.b bVar, Y2.C1040j c1040j, int i3, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "getBillingConfig got an exception.", exc);
        L(i3, 13, c1040j, Y2.P.a(exc));
        bVar.a(c1040j, null);
    }

    public final android.os.Handler s() {
        return android.os.Looper.myLooper() == null ? this.f11442e : new android.os.Handler(android.os.Looper.myLooper());
    }

    public final B4.t t(Y2.C1040j c1040j, int i3, java.lang.String str, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", str, exc);
        L(i3, 7, c1040j, Y2.P.a(exc));
        return new B4.t(c1040j.f11477a, c1040j.f11479c, new java.util.ArrayList(), new java.util.ArrayList());
    }

    public final Y2.C1040j u() {
        com.google.android.gms.internal.play_billing.AbstractC1872t.g("BillingClient", "Service connection is valid. No need to re-initialize.");
        com.google.android.gms.internal.play_billing.C1848i1 c1848i1Q = com.google.android.gms.internal.play_billing.C1854k1.q();
        c1848i1Q.c();
        com.google.android.gms.internal.play_billing.C1854k1.p((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.f19393i, 6);
        com.google.android.gms.internal.play_billing.E1 e1P = com.google.android.gms.internal.play_billing.F1.p();
        e1P.c();
        com.google.android.gms.internal.play_billing.F1.u((com.google.android.gms.internal.play_billing.F1) e1P.f19393i);
        e1P.d(false);
        e1P.e();
        c1848i1Q.c();
        com.google.android.gms.internal.play_billing.C1854k1.v((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.f19393i, (com.google.android.gms.internal.play_billing.F1) e1P.a());
        y((com.google.android.gms.internal.play_billing.C1854k1) c1848i1Q.a());
        return Y2.S.f11410i;
    }

    public final Y2.C1040j v() {
        int[] iArr = {0, 3};
        synchronized (this.f11438a) {
            for (int i3 = 0; i3 < 2; i3++) {
                if (this.f11439b == iArr[i3]) {
                    return Y2.S.j;
                }
            }
            return Y2.S.f11409h;
        }
    }

    public final void w(int i3, int i9, java.lang.Exception exc) {
        com.google.android.gms.internal.play_billing.C1845h1 c1845h1;
        com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "showInAppMessages error.", exc);
        S2.a aVar = this.f11444h;
        java.lang.String strA = Y2.P.a(exc);
        try {
            com.google.android.gms.internal.play_billing.C1857l1 c1857l1Q = com.google.android.gms.internal.play_billing.C1860m1.q();
            c1857l1Q.e(i3);
            if (i9 != 0) {
                c1857l1Q.d(i9);
            }
            if (strA != null) {
                c1857l1Q.c();
                com.google.android.gms.internal.play_billing.C1860m1.r((com.google.android.gms.internal.play_billing.C1860m1) c1857l1Q.f19393i, strA);
            }
            com.google.android.gms.internal.play_billing.C1842g1 c1842g1S = com.google.android.gms.internal.play_billing.C1845h1.s();
            c1842g1S.d(c1857l1Q);
            c1842g1S.f(30);
            c1845h1 = (com.google.android.gms.internal.play_billing.C1845h1) c1842g1S.a();
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingLogger", "Unable to create logging payload", th);
            c1845h1 = null;
        }
        aVar.T(c1845h1);
    }

    public final void x(com.google.android.gms.internal.play_billing.C1845h1 c1845h1) {
        try {
            this.f11444h.U(c1845h1, this.f11448m);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void y(com.google.android.gms.internal.play_billing.C1854k1 c1854k1) {
        try {
            S2.a aVar = this.f11444h;
            int i3 = this.f11448m;
            aVar.getClass();
            try {
                com.google.android.gms.internal.play_billing.q1 q1Var = (com.google.android.gms.internal.play_billing.q1) ((com.google.android.gms.internal.play_billing.r1) aVar.f9211i).l();
                q1Var.c();
                com.google.android.gms.internal.play_billing.r1.C((com.google.android.gms.internal.play_billing.r1) q1Var.f19393i, i3);
                com.google.android.gms.internal.play_billing.r1 r1Var = (com.google.android.gms.internal.play_billing.r1) q1Var.a();
                aVar.f9211i = r1Var;
                try {
                    aVar.c0(c1854k1, r1Var);
                } catch (java.lang.Throwable th) {
                    com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingLogger", "Unable to log.", th);
                }
            } catch (java.lang.Throwable th2) {
                com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingLogger", "Unable to log.", th2);
            }
        } catch (java.lang.Throwable th3) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th3);
        }
    }

    public final void z(int i3, Y2.C1040j c1040j) {
        try {
            int i9 = Y2.P.f11396a;
            com.google.android.gms.internal.play_billing.C1842g1 c1842g1 = (com.google.android.gms.internal.play_billing.C1842g1) Y2.P.b(i3, 6, c1040j, null, com.google.android.gms.internal.play_billing.o1.BROADCAST_ACTION_UNSPECIFIED).l();
            com.google.android.gms.internal.play_billing.E1 e1P = com.google.android.gms.internal.play_billing.F1.p();
            e1P.d(false);
            e1P.e();
            c1842g1.e(e1P);
            x((com.google.android.gms.internal.play_billing.C1845h1) c1842g1.a());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Unable to log.", th);
        }
    }

    public C1033c(X2.e eVar, android.content.Context context, T1.f fVar) {
        long jNextLong = new java.util.Random().nextLong();
        this.f11436F = java.lang.Long.valueOf(jNextLong);
        this.f11437G = com.google.android.gms.internal.play_billing.AbstractC1849j.f19338a;
        this.f11440c = com.revenuecat.purchases.api.BuildConfig.BILLING_CLIENT_VERSION;
        java.lang.String strM = m();
        this.f11441d = strM;
        this.g = context.getApplicationContext();
        com.google.android.gms.internal.play_billing.q1 q1VarZ = com.google.android.gms.internal.play_billing.r1.z();
        q1VarZ.c();
        com.google.android.gms.internal.play_billing.r1.x((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i);
        if (strM != null) {
            q1VarZ.c();
            com.google.android.gms.internal.play_billing.r1.y((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i, strM);
        }
        java.lang.String packageName = this.g.getPackageName();
        q1VarZ.c();
        com.google.android.gms.internal.play_billing.r1.q((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i, packageName);
        q1VarZ.c();
        com.google.android.gms.internal.play_billing.r1.D((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i, jNextLong);
        fVar.getClass();
        q1VarZ.c();
        com.google.android.gms.internal.play_billing.r1.w((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i);
        int i3 = android.os.Build.VERSION.SDK_INT;
        q1VarZ.c();
        com.google.android.gms.internal.play_billing.r1.A((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i, i3);
        q1VarZ.d();
        G(q1VarZ, context);
        try {
            int i9 = this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0).versionCode;
            q1VarZ.c();
            com.google.android.gms.internal.play_billing.r1.B((com.google.android.gms.internal.play_billing.r1) q1VarZ.f19393i, i9);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.AbstractC1872t.i("BillingClient", "Error getting app version code.", th);
        }
        this.f11444h = new S2.a(this.g, (com.google.android.gms.internal.play_billing.r1) q1VarZ.a());
        com.google.android.gms.internal.play_billing.AbstractC1872t.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f11443f = new F3.u(this.g, (Y2.InterfaceC1049t) null, this.f11444h);
        this.f11433C = eVar;
        this.g.getPackageName();
    }
}
