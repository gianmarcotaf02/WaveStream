package p184w3;

/* JADX INFO: loaded from: classes.dex */
public final class C extends E3.f {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final B3.C0089b f29793G = new B3.C0089b("CastClient", null);
    public static final S.p H = new S.p("Cast.API_CXLESS", new B3.v(11), B3.l.f636a);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final com.google.android.gms.cast.CastDevice f29794A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final java.util.HashMap f29795B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final java.util.HashMap f29796C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final p191x3.D f29797D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final java.util.List f29798E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f29799F;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p184w3.B f29800k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Z3.d f29801l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29802m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f29803n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p059g4.d f29804o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p059g4.d f29805p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f29806q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.lang.Object f29807r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.lang.Object f29808s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p184w3.C2969d f29809t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public java.lang.String f29810u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public double f29811v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f29812w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f29813x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public p184w3.w f29814z;

    public C(android.content.Context context, p184w3.e eVar) {
        super(context, null, H, eVar, E3.e.f2826c);
        this.f29800k = new p184w3.B(this);
        this.f29807r = new java.lang.Object();
        this.f29808s = new java.lang.Object();
        this.f29798E = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f29797D = eVar.f29848i;
        this.f29794A = eVar.f29847h;
        this.f29795B = new java.util.HashMap();
        this.f29796C = new java.util.HashMap();
        this.f29806q = new java.util.concurrent.atomic.AtomicLong(0L);
        this.f29799F = 1;
        j();
    }

    public static void d(p184w3.C c9, long j, int i3) {
        p059g4.d dVar;
        synchronized (c9.f29795B) {
            java.util.HashMap map = c9.f29795B;
            java.lang.Long lValueOf = java.lang.Long.valueOf(j);
            dVar = (p059g4.d) map.get(lValueOf);
            c9.f29795B.remove(lValueOf);
        }
        if (dVar != null) {
            if (i3 == 0) {
                dVar.b(null);
            } else {
                dVar.a(H3.q.k(new com.google.android.gms.common.api.Status(i3, null, null, null)));
            }
        }
    }

    public static void e(p184w3.C c9, int i3) {
        synchronized (c9.f29808s) {
            try {
                p059g4.d dVar = c9.f29805p;
                if (dVar == null) {
                    return;
                }
                if (i3 == 0) {
                    dVar.b(new com.google.android.gms.common.api.Status(0, null, null, null));
                } else {
                    dVar.a(H3.q.k(new com.google.android.gms.common.api.Status(i3, null, null, null)));
                }
                c9.f29805p = null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static android.os.Handler k(p184w3.C c9) {
        if (c9.f29801l == null) {
            c9.f29801l = new Z3.d(c9.f2834f, 2);
        }
        return c9.f29801l;
    }

    public final A0.a f(B3.j jVar) {
        F3.C0368h c0368h = b(jVar).f3599a;
        H3.q.h(c0368h, "Key must not be null");
        F3.C0366f c0366f = this.j;
        c0366f.getClass();
        p059g4.d dVar = new p059g4.d();
        c0366f.f(dVar, 8415, this);
        F3.A a2 = new F3.A(new F3.F(c0368h, dVar), c0366f.f3591p.get(), this);
        Z3.d dVar2 = c0366f.f3596u;
        dVar2.sendMessage(dVar2.obtainMessage(13, a2));
        return dVar.f21865a;
    }

    public final void g() {
        f29793G.b("removing all MessageReceivedCallbacks", new java.lang.Object[0]);
        synchronized (this.f29796C) {
            this.f29796C.clear();
        }
    }

    public final void h(int i3) {
        synchronized (this.f29807r) {
            try {
                p059g4.d dVar = this.f29804o;
                if (dVar != null) {
                    dVar.a(H3.q.k(new com.google.android.gms.common.api.Status(i3, null, null, null)));
                }
                this.f29804o = null;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final A0.a i() {
        F3.n nVarB = F3.n.b();
        nVarB.f3608d = new q2.i(11);
        nVarB.f3607c = 8403;
        A0.a aVarC = c(1, nVarB.a());
        g();
        f(this.f29800k);
        return aVarC;
    }

    public final void j() {
        com.google.android.gms.cast.CastDevice castDevice = this.f29794A;
        if (castDevice.f18624p.b(2048)) {
            return;
        }
        B3.z zVar = castDevice.f18624p;
        if (!zVar.b(4) || zVar.b(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f18620l);
    }
}
