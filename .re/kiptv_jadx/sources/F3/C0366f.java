package F3;

/* JADX INFO: renamed from: F3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0366f implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f3581w = new com.google.android.gms.common.api.Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final com.google.android.gms.common.api.Status f3582x = new com.google.android.gms.common.api.Status(4, "The user must be signed in to make this API call.", null, null);
    public static final java.lang.Object y = new java.lang.Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static F3.C0366f f3583z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3585i;
    public H3.i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public J3.b f3586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final android.content.Context f3587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final D3.e f3588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final S.p f3589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f3590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f3591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f3592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public F3.p f3593r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p136q.C2662f f3594s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p136q.C2662f f3595t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Z3.d f3596u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f3597v;

    public C0366f(android.content.Context context, android.os.Looper looper) {
        D3.e eVar = D3.e.f2106d;
        this.f3584h = androidx.media3.exoplayer.Renderer.DEFAULT_DURATION_TO_PROGRESS_US;
        this.f3585i = false;
        this.f3590o = new java.util.concurrent.atomic.AtomicInteger(1);
        this.f3591p = new java.util.concurrent.atomic.AtomicInteger(0);
        this.f3592q = new java.util.concurrent.ConcurrentHashMap(5, 0.75f, 1);
        this.f3593r = null;
        this.f3594s = new p136q.C2662f(0);
        this.f3595t = new p136q.C2662f(0);
        this.f3597v = true;
        this.f3587l = context;
        Z3.d dVar = new Z3.d(looper, this, 0);
        android.os.Looper.getMainLooper();
        this.f3596u = dVar;
        this.f3588m = eVar;
        this.f3589n = new S.p(17);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (O7.r.f8065d == null) {
            O7.r.f8065d = java.lang.Boolean.valueOf(C2.a.H() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (O7.r.f8065d.booleanValue()) {
            this.f3597v = false;
        }
        dVar.sendMessage(dVar.obtainMessage(6));
    }

    public static com.google.android.gms.common.api.Status d(F3.C0362b c0362b, D3.b bVar) {
        return new com.google.android.gms.common.api.Status(17, B2.a.m("API: ", (java.lang.String) c0362b.f3574b.j, " is not available on this device. Connection failed with: ", java.lang.String.valueOf(bVar)), bVar.j, bVar);
    }

    public static F3.C0366f g(android.content.Context context) {
        F3.C0366f c0366f;
        android.os.HandlerThread handlerThread;
        synchronized (y) {
            if (f3583z == null) {
                synchronized (H3.C.g) {
                    try {
                        handlerThread = H3.C.f3933i;
                        if (handlerThread == null) {
                            android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("GoogleApiHandler", 9);
                            H3.C.f3933i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = H3.C.f3933i;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                android.os.Looper looper = handlerThread.getLooper();
                android.content.Context applicationContext = context.getApplicationContext();
                java.lang.Object obj = D3.e.f2105c;
                f3583z = new F3.C0366f(applicationContext, looper);
            }
            c0366f = f3583z;
        }
        return c0366f;
    }

    public final void a(F3.p pVar) {
        synchronized (y) {
            try {
                if (this.f3593r != pVar) {
                    this.f3593r = pVar;
                    this.f3594s.clear();
                }
                this.f3594s.addAll(pVar.f3616m);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        if (this.f3585i) {
            return false;
        }
        H3.h hVar = (H3.h) H3.g.b().f3974a;
        if (hVar != null && !hVar.f3976i) {
            return false;
        }
        int i3 = ((android.util.SparseIntArray) this.f3589n.f9153i).get(203400000, -1);
        return i3 == -1 || i3 == 0;
    }

    public final boolean c(D3.b bVar, int i3) {
        boolean zBooleanValue;
        android.app.PendingIntent activity;
        java.lang.Boolean bool;
        D3.e eVar = this.f3588m;
        android.content.Context context = this.f3587l;
        eVar.getClass();
        synchronized (N3.a.class) {
            try {
                android.content.Context applicationContext = context.getApplicationContext();
                android.content.Context context2 = N3.a.f7316a;
                if (context2 == null || (bool = N3.a.f7317b) == null || context2 != applicationContext) {
                    N3.a.f7317b = null;
                    if (C2.a.H()) {
                        N3.a.f7317b = java.lang.Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                    } else {
                        try {
                            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                            N3.a.f7317b = java.lang.Boolean.TRUE;
                        } catch (java.lang.ClassNotFoundException unused) {
                            N3.a.f7317b = java.lang.Boolean.FALSE;
                        }
                    }
                    N3.a.f7316a = applicationContext;
                    zBooleanValue = N3.a.f7317b.booleanValue();
                } else {
                    zBooleanValue = bool.booleanValue();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (zBooleanValue) {
            return false;
        }
        int i9 = bVar.f2097i;
        if (i9 == 0 || (activity = bVar.j) == null) {
            android.content.Intent intentA = eVar.a(context, i9, null);
            activity = intentA != null ? android.app.PendingIntent.getActivity(context, 0, intentA, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i10 = bVar.f2097i;
        int i11 = com.google.android.gms.common.api.GoogleApiActivity.f18681i;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.google.android.gms.common.api.GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i3);
        intent.putExtra("notify_manager", true);
        eVar.f(context, i10, android.app.PendingIntent.getActivity(context, 0, intent, Z3.c.f12984a | androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE));
        return true;
    }

    public final F3.s e(E3.f fVar) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f3592q;
        F3.C0362b c0362b = fVar.f2833e;
        F3.s sVar = (F3.s) concurrentHashMap.get(c0362b);
        if (sVar == null) {
            sVar = new F3.s(this, fVar);
            concurrentHashMap.put(c0362b, sVar);
        }
        if (sVar.f3622d.k()) {
            this.f3595t.add(c0362b);
        }
        sVar.k();
        return sVar;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public final void f(p059g4.d dVar, int i3, E3.f fVar) {
        F3.y yVar;
        F3.C0366f c0366f;
        if (i3 != 0) {
            F3.C0362b c0362b = fVar.f2833e;
            if (b()) {
                H3.h hVar = (H3.h) H3.g.b().f3974a;
                boolean z6 = true;
                if (hVar != null) {
                    if (hVar.f3976i) {
                        F3.s sVar = (F3.s) this.f3592q.get(c0362b);
                        if (sVar != null) {
                            E3.c cVar = sVar.f3622d;
                            if (cVar instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                                if (aVar.f18710C == null || aVar.d()) {
                                    z6 = hVar.j;
                                } else {
                                    H3.C0374c c0374cA = F3.y.a(sVar, aVar, i3);
                                    if (c0374cA != null) {
                                        sVar.f3630n++;
                                        z6 = c0374cA.j;
                                    }
                                }
                            }
                        } else {
                            z6 = hVar.j;
                        }
                    }
                    yVar = null;
                    c0366f = this;
                }
                c0366f = this;
                yVar = new F3.y(c0366f, i3, c0362b, z6 ? java.lang.System.currentTimeMillis() : 0L, z6 ? android.os.SystemClock.elapsedRealtime() : 0L);
            } else {
                yVar = null;
                c0366f = this;
            }
            if (yVar != null) {
                A0.a aVar2 = dVar.f21865a;
                Z3.d dVar2 = c0366f.f3596u;
                dVar2.getClass();
                F3.q qVar = new F3.q(0, dVar2);
                aVar2.getClass();
                ((K0.C0661i) aVar2.f14c).g(new p059g4.f(qVar, yVar));
                aVar2.l();
            }
        }
    }

    public final void h(D3.b bVar, int i3) {
        if (c(bVar, i3)) {
            return;
        }
        Z3.d dVar = this.f3596u;
        dVar.sendMessage(dVar.obtainMessage(5, i3, 0, bVar));
    }

    /* JADX WARN: Code duplicated, block: B:185:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:187:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:189:0x040c  */
    /* JADX WARN: Code duplicated, block: B:191:0x0416  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v7 F3.s, still in use, count: 2, list:
          (r4v7 F3.s) from 0x03e0: IGET (r4v7 F3.s) A[WRAPPED] (LINE:993) F3.s.i int
          (r4v7 F3.s) from 0x03e6: PHI (r4 I:??) = (r4v4 F3.s), (r4v7 F3.s) binds: [B:183:0x03e5, B:242:0x03e6] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r18) {
        /*
            Method dump skipped, instruction units count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.C0366f.handleMessage(android.os.Message):boolean");
    }
}
