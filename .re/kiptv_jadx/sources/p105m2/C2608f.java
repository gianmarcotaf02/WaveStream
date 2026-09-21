package p105m2;

/* JADX INFO: renamed from: m2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2608f {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f25283E = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public com.google.android.gms.internal.cast.C1771n f25284A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p105m2.C2626y f25285B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public j1.l f25286C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p105m2.C2604b f25287D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f25288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p105m2.b0 f25289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p105m2.a0 f25290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25291d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p105m2.C2615m f25292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f25293f = new java.util.ArrayList();
    public final java.util.ArrayList g = new java.util.ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f25294h = new java.util.HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f25295i = new java.util.ArrayList();
    public final java.util.ArrayList j = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g1.h f25296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p105m2.C2604b f25297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p105m2.HandlerC2605c f25298m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f25299n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p105m2.D f25300o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p105m2.P f25301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p105m2.A f25302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p105m2.A f25303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p105m2.A f25304s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p105m2.AbstractC2621t f25305t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p105m2.A f25306u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p105m2.AbstractC2620s f25307v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final java.util.HashMap f25308w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p105m2.C2618p f25309x;
    public p105m2.C2618p y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f25310z;

    static {
        android.util.Log.isLoggable("GlobalMediaRouter", 3);
    }

    public C2608f(android.content.Context context) {
        g1.h hVar = new g1.h();
        boolean z6 = false;
        hVar.f21820d = 0;
        hVar.f21821e = 3;
        this.f25296k = hVar;
        this.f25297l = new p105m2.C2604b(this);
        this.f25298m = new p105m2.HandlerC2605c(this);
        this.f25308w = new java.util.HashMap();
        this.f25287D = new p105m2.C2604b(this);
        this.f25288a = context;
        this.f25299n = ((android.app.ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            int i9 = p105m2.Q.f25231b;
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) p105m2.Q.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z6 = true;
            }
        }
        this.f25291d = z6;
        this.f25292e = (i3 < 30 || !z6) ? null : new p105m2.C2615m(context, new p008a8.c(13, this));
        p105m2.b0 b0Var = new p105m2.b0(context, this);
        this.f25289b = b0Var;
        this.f25300o = new p105m2.D(new D1.RunnableC0239y(26, this));
        a(b0Var, true);
        p105m2.AbstractC2622u abstractC2622u = this.f25292e;
        if (abstractC2622u != null) {
            a(abstractC2622u, true);
        }
        p105m2.a0 a0Var = new p105m2.a0(context, this);
        this.f25290c = a0Var;
        if (a0Var.f25264a) {
            return;
        }
        a0Var.f25264a = true;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme(io.sentry.protocol.SentryStackFrame.JsonKeys.PACKAGE);
        android.os.Handler handler = (android.os.Handler) a0Var.f25267d;
        p072i.s sVar = (p072i.s) a0Var.g;
        android.content.Context context2 = (android.content.Context) a0Var.f25265b;
        if (i3 < 33) {
            context2.registerReceiver(sVar, intentFilter, null, handler);
        } else {
            p105m2.Z.a(context2, sVar, intentFilter, handler, 4);
        }
        handler.post((B3.r) a0Var.f25270h);
    }

    public final void a(p105m2.AbstractC2622u abstractC2622u, boolean z6) {
        if (d(abstractC2622u) == null) {
            p105m2.C2627z c2627z = new p105m2.C2627z(abstractC2622u, z6);
            this.f25295i.add(c2627z);
            this.f25298m.b(513, c2627z);
            m(c2627z, abstractC2622u.f25368n);
            p105m2.C.b();
            abstractC2622u.f25365k = this.f25297l;
            abstractC2622u.h(this.f25309x);
        }
    }

    public final java.lang.String b(p105m2.C2627z c2627z, java.lang.String str) {
        java.lang.String strFlattenToShortString = ((android.content.ComponentName) c2627z.f25389d.f15522i).flattenToShortString();
        boolean z6 = c2627z.f25388c;
        java.lang.String strP = z6 ? str : p121o0.p.p(strFlattenToShortString, ":", str);
        java.util.HashMap map = this.f25294h;
        if (!z6) {
            java.util.ArrayList arrayList = this.g;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                if (((p105m2.A) arrayList.get(i3)).f25195c.equals(strP)) {
                    break;
                }
                i3++;
            }
            if (i3 >= 0) {
                android.util.Log.w("GlobalMediaRouter", Y6.f.i("Either ", str, " isn't unique in ", strFlattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i9 = 2;
                while (true) {
                    java.util.Locale locale = java.util.Locale.US;
                    java.lang.String str2 = strP + "_" + i9;
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size2) {
                            i10 = -1;
                            break;
                        }
                        if (((p105m2.A) arrayList.get(i10)).f25195c.equals(str2)) {
                            break;
                        }
                        i10++;
                    }
                    if (i10 < 0) {
                        map.put(new C1.b(strFlattenToShortString, str), str2);
                        return str2;
                    }
                    i9++;
                }
            }
        }
        map.put(new C1.b(strFlattenToShortString, str), strP);
        return strP;
    }

    public final p105m2.A c() {
        for (p105m2.A a2 : this.g) {
            if (a2 != this.f25302q && a2.a() == this.f25289b && a2.i("android.media.intent.category.LIVE_AUDIO") && !a2.i("android.media.intent.category.LIVE_VIDEO") && a2.d()) {
                return a2;
            }
        }
        return this.f25302q;
    }

    public final p105m2.C2627z d(p105m2.AbstractC2622u abstractC2622u) {
        for (p105m2.C2627z c2627z : this.f25295i) {
            if (c2627z.f25386a == abstractC2622u) {
                return c2627z;
            }
        }
        return null;
    }

    public final p105m2.A e() {
        p105m2.A a2 = this.f25304s;
        if (a2 != null) {
            return a2;
        }
        throw new java.lang.IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (!this.f25291d) {
            return false;
        }
        p105m2.P p2 = this.f25301p;
        return p2 == null || p2.f25226a;
    }

    public final void g() {
        if (java.util.Collections.unmodifiableList(this.f25304s.f25211u).size() >= 1) {
            java.util.List<p105m2.A> listUnmodifiableList = java.util.Collections.unmodifiableList(this.f25304s.f25211u);
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((p105m2.A) it.next()).f25195c);
            }
            java.util.HashMap map = this.f25308w;
            java.util.Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    p105m2.AbstractC2621t abstractC2621t = (p105m2.AbstractC2621t) entry.getValue();
                    abstractC2621t.h(0);
                    abstractC2621t.d();
                    it2.remove();
                }
            }
            for (p105m2.A a2 : listUnmodifiableList) {
                if (!map.containsKey(a2.f25195c)) {
                    p105m2.AbstractC2621t abstractC2621tE = a2.a().e(a2.f25194b, this.f25304s.f25194b);
                    abstractC2621tE.e();
                    map.put(a2.f25195c, abstractC2621tE);
                }
            }
        }
    }

    public final void h(p105m2.C2608f c2608f, p105m2.A a2, p105m2.AbstractC2621t abstractC2621t, int i3, p105m2.A a9, java.util.ArrayList arrayList) {
        com.google.android.gms.internal.cast.C1771n c1771n;
        p105m2.C2626y c2626y = this.f25285B;
        if (c2626y != null) {
            c2626y.a();
            this.f25285B = null;
        }
        p105m2.C2626y c2626y2 = new p105m2.C2626y(c2608f, a2, abstractC2621t, i3, a9, arrayList);
        this.f25285B = c2626y2;
        if (c2626y2.f25379b != 3 || (c1771n = this.f25284A) == null) {
            c2626y2.b();
            return;
        }
        p105m2.A a10 = this.f25304s;
        p105m2.A a11 = c2626y2.f25381d;
        com.google.android.gms.internal.cast.C1771n.f19003c.b("Prepare transfer from Route(%s) to Route(%s)", a10, a11);
        p155s1.k kVarW = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.W(new android.support.v4.media.session.q(c1771n, a10, a11, 21));
        p105m2.C2626y c2626y3 = this.f25285B;
        p105m2.C2608f c2608f2 = (p105m2.C2608f) c2626y3.g.get();
        if (c2608f2 == null || c2608f2.f25285B != c2626y3) {
            android.util.Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            c2626y3.a();
        } else {
            if (c2626y3.f25384h != null) {
                throw new java.lang.IllegalStateException("future is already set");
            }
            c2626y3.f25384h = kVarW;
            D1.RunnableC0239y runnableC0239y = new D1.RunnableC0239y(28, c2626y3);
            p105m2.HandlerC2605c handlerC2605c = c2608f2.f25298m;
            java.util.Objects.requireNonNull(handlerC2605c);
            kVarW.f27252i.addListener(runnableC0239y, new androidx.media3.common.m(2, handlerC2605c));
        }
    }

    public final void i(p105m2.A a2, int i3) {
        if (!this.g.contains(a2)) {
            android.util.Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + a2);
            return;
        }
        if (!a2.g) {
            android.util.Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + a2);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            p105m2.AbstractC2622u abstractC2622uA = a2.a();
            p105m2.C2615m c2615m = this.f25292e;
            if (abstractC2622uA == c2615m && this.f25304s != a2) {
                java.lang.String str = a2.f25194b;
                android.media.MediaRoute2Info mediaRoute2Info = null;
                if (str != null) {
                    java.util.Iterator it = c2615m.f25343w.iterator();
                    while (it.hasNext()) {
                        android.media.MediaRoute2Info mediaRoute2InfoC = D1.A0.c(it.next());
                        if (android.text.TextUtils.equals(mediaRoute2InfoC.getId(), str)) {
                            mediaRoute2Info = mediaRoute2InfoC;
                            break;
                        }
                    }
                }
                if (mediaRoute2Info != null) {
                    c2615m.f25336p.transferTo(mediaRoute2Info);
                    return;
                }
                c2615m.getClass();
                android.util.Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
                return;
            }
        }
        j(a2, i3);
    }

    public final void j(p105m2.A a2, int i3) {
        p007a7.z zVar;
        if (this.f25304s == a2) {
            return;
        }
        if (this.f25306u != null) {
            this.f25306u = null;
            p105m2.AbstractC2620s abstractC2620s = this.f25307v;
            if (abstractC2620s != null) {
                abstractC2620s.h(3);
                this.f25307v.d();
                this.f25307v = null;
            }
        }
        if (f() && (zVar = a2.f25193a.f25390e) != null && zVar.f15518c) {
            p105m2.AbstractC2620s abstractC2620sC = a2.a().c(a2.f25194b);
            if (abstractC2620sC != null) {
                android.content.Context context = this.f25288a;
                java.util.concurrent.Executor executorG = android.os.Build.VERSION.SDK_INT >= 28 ? D1.AbstractC0225j.g(context) : new A1.m(new android.os.Handler(context.getMainLooper()), 1);
                p105m2.C2604b c2604b = this.f25287D;
                synchronized (abstractC2620sC.f25358a) {
                    try {
                        if (executorG == null) {
                            throw new java.lang.NullPointerException("Executor shouldn't be null");
                        }
                        if (c2604b == null) {
                            throw new java.lang.NullPointerException("Listener shouldn't be null");
                        }
                        abstractC2620sC.f25359b = executorG;
                        abstractC2620sC.f25360c = c2604b;
                        java.util.ArrayList arrayList = abstractC2620sC.f25362e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            p105m2.C2617o c2617o = abstractC2620sC.f25361d;
                            java.util.ArrayList arrayList2 = abstractC2620sC.f25362e;
                            abstractC2620sC.f25361d = null;
                            abstractC2620sC.f25362e = null;
                            abstractC2620sC.f25359b.execute(new p105m2.RunnableC2619q(abstractC2620sC, c2604b, c2617o, arrayList2, 0));
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                this.f25306u = a2;
                this.f25307v = abstractC2620sC;
                abstractC2620sC.e();
                return;
            }
            android.util.Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + a2);
        }
        p105m2.AbstractC2621t abstractC2621tD = a2.a().d(a2.f25194b);
        if (abstractC2621tD != null) {
            abstractC2621tD.e();
        }
        if (this.f25304s != null) {
            h(this, a2, abstractC2621tD, i3, null, null);
            return;
        }
        this.f25304s = a2;
        this.f25305t = abstractC2621tD;
        android.os.Message messageObtainMessage = this.f25298m.obtainMessage(org.videolan.libvlc.MediaPlayer.Event.Stopped, new C1.b(null, a2));
        messageObtainMessage.arg1 = i3;
        messageObtainMessage.sendToTarget();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:72:0x014a  */
    /* JADX WARN: Code duplicated, block: B:79:0x015f  */
    public final void k() {
        boolean z6;
        int i3;
        D0.C0206g c0206g = new D0.C0206g();
        p105m2.D d4 = this.f25300o;
        long j = 0;
        d4.f25218c = 0L;
        int i9 = 0;
        d4.f25220e = false;
        d4.f25219d = android.os.SystemClock.elapsedRealtime();
        d4.f25216a.removeCallbacks(d4.f25217b);
        java.util.ArrayList arrayList = this.f25293f;
        int size = arrayList.size();
        int i10 = 0;
        boolean z9 = false;
        while (true) {
            int i11 = size - 1;
            boolean z10 = this.f25299n;
            if (i11 < 0) {
                D0.C0206g c0206g2 = c0206g;
                long j9 = j;
                p105m2.D d6 = this.f25300o;
                if (d6.f25220e) {
                    long j10 = d6.f25218c;
                    if (j10 > j9) {
                        d6.f25216a.postDelayed(d6.f25217b, j10);
                    }
                }
                boolean z11 = d6.f25220e;
                this.f25310z = i10;
                p105m2.C2623v c2623vD = z9 ? c0206g2.d() : p105m2.C2623v.f25370c;
                p105m2.C2623v c2623vD2 = c0206g2.d();
                if (f()) {
                    p105m2.C2618p c2618p = this.y;
                    if (c2618p != null) {
                        c2618p.a();
                        if (!c2618p.f25351b.equals(c2623vD2) || this.y.b() != z11) {
                            c2623vD2.a();
                            if (c2623vD2.f25372b.isEmpty() || z11) {
                                this.y = new p105m2.C2618p(c2623vD2, z11);
                            } else if (this.y != null) {
                                this.y = null;
                            }
                            this.f25292e.h(this.y);
                        }
                    } else {
                        c2623vD2.a();
                        if (c2623vD2.f25372b.isEmpty()) {
                            this.y = new p105m2.C2618p(c2623vD2, z11);
                            this.f25292e.h(this.y);
                        } else {
                            this.y = new p105m2.C2618p(c2623vD2, z11);
                            this.f25292e.h(this.y);
                        }
                    }
                }
                p105m2.C2618p c2618p2 = this.f25309x;
                if (c2618p2 != null) {
                    c2618p2.a();
                    if (c2618p2.f25351b.equals(c2623vD) && this.f25309x.b() == z11) {
                        return;
                    }
                }
                c2623vD.a();
                if (!c2623vD.f25372b.isEmpty() || z11) {
                    this.f25309x = new p105m2.C2618p(c2623vD, z11);
                } else if (this.f25309x == null) {
                    return;
                } else {
                    this.f25309x = null;
                }
                if (z9 && !z11 && z10) {
                    android.util.Log.i("GlobalMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                java.util.Iterator it = this.f25295i.iterator();
                while (it.hasNext()) {
                    p105m2.AbstractC2622u abstractC2622u = ((p105m2.C2627z) it.next()).f25386a;
                    if (abstractC2622u != this.f25292e) {
                        abstractC2622u.h(this.f25309x);
                    }
                }
                return;
            }
            p105m2.C c9 = (p105m2.C) ((java.lang.ref.WeakReference) arrayList.get(i11)).get();
            if (c9 == null) {
                arrayList.remove(i11);
            } else {
                java.util.ArrayList arrayList2 = c9.f25215b;
                int size2 = arrayList2.size();
                i10 += size2;
                int i12 = i9;
                while (i12 < size2) {
                    p105m2.C2625x c2625x = (p105m2.C2625x) arrayList2.get(i12);
                    p105m2.C2623v c2623v = c2625x.f25375c;
                    if (c2623v == null) {
                        throw new java.lang.IllegalArgumentException("selector must not be null");
                    }
                    java.util.ArrayList<java.lang.String> arrayListB = c2623v.b();
                    if (!arrayListB.isEmpty()) {
                        for (java.lang.String str : arrayListB) {
                            if (str == null) {
                                throw new java.lang.IllegalArgumentException("category must not be null");
                            }
                            long j11 = j;
                            if (c0206g.f1884a == null) {
                                c0206g.f1884a = new java.util.ArrayList();
                            }
                            if (!c0206g.f1884a.contains(str)) {
                                c0206g.f1884a.add(str);
                            }
                            j = j11;
                        }
                    }
                    long j12 = j;
                    int i13 = (c2625x.f25376d & 1) != 0 ? 1 : i9;
                    p105m2.D d9 = this.f25300o;
                    int i14 = i11;
                    long j13 = c2625x.f25377e;
                    if (i13 == 0) {
                        d9.getClass();
                    } else {
                        long j14 = d9.f25219d;
                        if (j14 - j13 < 30000) {
                            d9.f25218c = java.lang.Math.max(d9.f25218c, (j13 + 30000) - j14);
                            z6 = true;
                            d9.f25220e = true;
                        }
                        if (i13 != 0) {
                            z9 = z6;
                        }
                        i3 = c2625x.f25376d;
                        if ((i3 & 4) != 0 && !z10) {
                            z9 = z6;
                        }
                        if ((i3 & 8) != 0) {
                            z9 = z6;
                        }
                        i12++;
                        c0206g = c0206g;
                        j = j12;
                        i11 = i14;
                        arrayList = arrayList;
                        i9 = 0;
                    }
                    z6 = true;
                    if (i13 != 0) {
                        z9 = z6;
                    }
                    i3 = c2625x.f25376d;
                    if ((i3 & 4) != 0) {
                        z9 = z6;
                    }
                    if ((i3 & 8) != 0) {
                        z9 = z6;
                    }
                    i12++;
                    c0206g = c0206g;
                    j = j12;
                    i11 = i14;
                    arrayList = arrayList;
                    i9 = 0;
                }
            }
            c0206g = c0206g;
            j = j;
            size = i11;
            arrayList = arrayList;
            i9 = 0;
        }
    }

    public final void l() {
        android.media.MediaRouter2.RoutingController routingController;
        p105m2.A a2 = this.f25304s;
        if (a2 == null) {
            j1.l lVar = this.f25286C;
            if (lVar != null) {
                lVar.g();
                return;
            }
            return;
        }
        int i3 = a2.f25205o;
        g1.h hVar = this.f25296k;
        hVar.f21818b = i3;
        hVar.f21819c = a2.f25206p;
        hVar.f21820d = a2.b();
        hVar.f21821e = this.f25304s.f25202l;
        if (f() && this.f25304s.a() == this.f25292e) {
            p105m2.AbstractC2621t abstractC2621t = this.f25305t;
            int i9 = p105m2.C2615m.y;
            hVar.f21822f = ((abstractC2621t instanceof p105m2.C2611i) && (routingController = ((p105m2.C2611i) abstractC2621t).g) != null) ? routingController.getId() : null;
        } else {
            hVar.f21822f = null;
        }
        java.util.Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((p105m2.AbstractC2607e) it.next()).getClass();
            throw null;
        }
        j1.l lVar2 = this.f25286C;
        if (lVar2 != null) {
            p105m2.A a9 = this.f25304s;
            p105m2.A a10 = this.f25302q;
            if (a10 == null) {
                throw new java.lang.IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (a9 == a10 || a9 == this.f25303r) {
                lVar2.g();
                return;
            }
            int i10 = hVar.f21820d == 1 ? 2 : 0;
            int i11 = hVar.f21819c;
            int i12 = hVar.f21818b;
            java.lang.String str = (java.lang.String) hVar.f21822f;
            android.support.v4.media.session.q qVar = (android.support.v4.media.session.q) lVar2.f23899i;
            if (qVar != null) {
                T1.q qVar2 = (T1.q) lVar2.j;
                if (qVar2 != null && i10 == 0 && i11 == 0) {
                    qVar2.f9702c = i12;
                    p082j2.f.a(qVar2.a(), i12);
                    return;
                }
                T1.q qVar3 = new T1.q(lVar2, i10, i11, i12, str);
                lVar2.j = qVar3;
                android.support.v4.media.session.m mVar = (android.support.v4.media.session.m) qVar.f15617i;
                mVar.getClass();
                mVar.f15605a.setPlaybackToRemote(qVar3.a());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    public final void m(p105m2.C2627z c2627z, p007a7.z zVar) {
        boolean z6;
        int i3;
        if (c2627z.f25390e != zVar) {
            c2627z.f25390e = zVar;
            java.util.ArrayList arrayList = this.g;
            java.util.ArrayList arrayList2 = c2627z.f25387b;
            p105m2.HandlerC2605c handlerC2605c = this.f25298m;
            if (zVar != null) {
                java.util.List<p105m2.C2617o> list = zVar.f15517b;
                int size = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        p105m2.C2617o c2617o = (p105m2.C2617o) list.get(i9);
                        if (c2617o != null && c2617o.e()) {
                            i9++;
                        } else if (zVar != this.f25289b.f25368n) {
                            android.util.Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + zVar);
                            z6 = false;
                            i3 = 0;
                        }
                    }
                    java.util.ArrayList<C1.b> arrayList3 = new java.util.ArrayList();
                    java.util.ArrayList<C1.b> arrayList4 = new java.util.ArrayList();
                    int i10 = 0;
                    boolean z9 = false;
                    for (p105m2.C2617o c2617o2 : list) {
                        if (c2617o2 == null || !c2617o2.e()) {
                            android.util.Log.w("GlobalMediaRouter", "Ignoring invalid system route descriptor: " + c2617o2);
                        } else {
                            java.lang.String strD = c2617o2.d();
                            int size2 = arrayList2.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size2) {
                                    i11 = -1;
                                    break;
                                } else if (((p105m2.A) arrayList2.get(i11)).f25194b.equals(strD)) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                            if (i11 < 0) {
                                p105m2.A a2 = new p105m2.A(c2627z, strD, b(c2627z, strD));
                                int i12 = i10 + 1;
                                arrayList2.add(i10, a2);
                                arrayList.add(a2);
                                if (c2617o2.c().size() > 0) {
                                    arrayList3.add(new C1.b(a2, c2617o2));
                                } else {
                                    a2.f(c2617o2);
                                    handlerC2605c.b(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AIT, a2);
                                }
                                i10 = i12;
                            } else if (i11 < i10) {
                                android.util.Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + c2617o2);
                            } else {
                                p105m2.A a9 = (p105m2.A) arrayList2.get(i11);
                                int i13 = i10 + 1;
                                java.util.Collections.swap(arrayList2, i11, i10);
                                if (c2617o2.c().size() > 0) {
                                    arrayList4.add(new C1.b(a9, c2617o2));
                                } else if (n(a9, c2617o2) != 0 && a9 == this.f25304s) {
                                    i10 = i13;
                                    z9 = true;
                                }
                                i10 = i13;
                            }
                        }
                    }
                    for (C1.b bVar : arrayList3) {
                        p105m2.A a10 = (p105m2.A) bVar.f867a;
                        a10.f((p105m2.C2617o) bVar.f868b);
                        handlerC2605c.b(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AIT, a10);
                    }
                    boolean z10 = z9;
                    for (C1.b bVar2 : arrayList4) {
                        p105m2.A a11 = (p105m2.A) bVar2.f867a;
                        if (n(a11, (p105m2.C2617o) bVar2.f868b) != 0 && a11 == this.f25304s) {
                            z10 = true;
                        }
                    }
                    z6 = z10;
                    i3 = i10;
                }
            } else {
                android.util.Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + zVar);
                z6 = false;
                i3 = 0;
            }
            for (int size3 = arrayList2.size() - 1; size3 >= i3; size3--) {
                p105m2.A a12 = (p105m2.A) arrayList2.get(size3);
                a12.f(null);
                arrayList.remove(a12);
            }
            o(z6);
            for (int size4 = arrayList2.size() - 1; size4 >= i3; size4--) {
                handlerC2605c.b(org.videolan.libvlc.MediaPlayer.Event.Opening, (p105m2.A) arrayList2.remove(size4));
            }
            handlerC2605c.b(515, c2627z);
        }
    }

    public final int n(p105m2.A a2, p105m2.C2617o c2617o) {
        int iF = a2.f(c2617o);
        if (iF != 0) {
            int i3 = iF & 1;
            p105m2.HandlerC2605c handlerC2605c = this.f25298m;
            if (i3 != 0) {
                handlerC2605c.b(org.videolan.libvlc.MediaPlayer.Event.Buffering, a2);
            }
            if ((iF & 2) != 0) {
                handlerC2605c.b(org.videolan.libvlc.MediaPlayer.Event.Playing, a2);
            }
            if ((iF & 4) != 0) {
                handlerC2605c.b(org.videolan.libvlc.MediaPlayer.Event.Paused, a2);
            }
        }
        return iF;
    }

    public final void o(boolean z6) {
        p105m2.A a2 = this.f25302q;
        if (a2 != null && !a2.d()) {
            android.util.Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.f25302q);
            this.f25302q = null;
        }
        p105m2.A a9 = this.f25302q;
        java.util.ArrayList<p105m2.A> arrayList = this.g;
        if (a9 == null && !arrayList.isEmpty()) {
            for (p105m2.A a10 : arrayList) {
                if (a10.a() == this.f25289b && a10.f25194b.equals("DEFAULT_ROUTE") && a10.d()) {
                    this.f25302q = a10;
                    android.util.Log.i("GlobalMediaRouter", "Found default route: " + this.f25302q);
                    break;
                }
            }
        }
        p105m2.A a11 = this.f25303r;
        if (a11 != null && !a11.d()) {
            android.util.Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f25303r);
            this.f25303r = null;
        }
        if (this.f25303r == null && !arrayList.isEmpty()) {
            for (p105m2.A a12 : arrayList) {
                if (a12.a() == this.f25289b && a12.i("android.media.intent.category.LIVE_AUDIO") && !a12.i("android.media.intent.category.LIVE_VIDEO") && a12.d()) {
                    this.f25303r = a12;
                    android.util.Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f25303r);
                    break;
                }
            }
        }
        p105m2.A a13 = this.f25304s;
        if (a13 == null || !a13.g) {
            android.util.Log.i("GlobalMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.f25304s);
            j(c(), 0);
            return;
        }
        if (z6) {
            g();
            l();
        }
    }
}
