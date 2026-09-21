package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1794t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final B3.C0089b f19071i = new B3.C0089b("SessionTransController", null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p191x3.C3101b f19072a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p191x3.g f19077f;
    public p155s1.h g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p184w3.r f19078h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Set f19073b = java.util.Collections.synchronizedSet(new java.util.HashSet());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19076e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z3.d f19074c = new Z3.d(android.os.Looper.getMainLooper(), 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.android.gms.internal.cast.RunnableC1790s f19075d = new com.google.android.gms.internal.cast.RunnableC1790s(this, 0);

    public C1794t(p191x3.C3101b c3101b) {
        this.f19072a = c3101b;
    }

    public final p199y3.g a() {
        p191x3.g gVar = this.f19077f;
        B3.C0089b c0089b = f19071i;
        if (gVar == null) {
            c0089b.b("skip transferring as SessionManager is null", new java.lang.Object[0]);
            return null;
        }
        H3.q.d();
        p191x3.f fVarC = gVar.c();
        p191x3.C3102c c3102c = (fVarC == null || !(fVarC instanceof p191x3.C3102c)) ? null : (p191x3.C3102c) fVarC;
        if (c3102c == null) {
            c0089b.b("skip transferring as CastSession is null", new java.lang.Object[0]);
            return null;
        }
        H3.q.d();
        return c3102c.j;
    }

    public final void b(int i3) {
        p155s1.h hVar = this.g;
        if (hVar != null) {
            hVar.f27249d = true;
            p155s1.k kVar = hVar.f27247b;
            if (kVar != null && kVar.f27252i.cancel(true)) {
                hVar.f27246a = null;
                hVar.f27247b = null;
                hVar.f27248c = null;
            }
        }
        f19071i.b("notify failed transfer with type = %d, reason = %d", java.lang.Integer.valueOf(this.f19076e), java.lang.Integer.valueOf(i3));
        for (com.google.android.gms.internal.cast.C1784q0 c1784q0 : new java.util.HashSet(this.f19073b)) {
            int i9 = this.f19076e;
            switch (c1784q0.f19026a) {
                case 0:
                    com.google.android.gms.internal.cast.C1791s0.j.b("onTransferFailed with type = %d and reason = %d", java.lang.Integer.valueOf(i9), java.lang.Integer.valueOf(i3));
                    com.google.android.gms.internal.cast.C1791s0 c1791s0 = (com.google.android.gms.internal.cast.C1791s0) c1784q0.f19027b;
                    c1791s0.c();
                    com.google.android.gms.internal.cast.K0 k0B = c1791s0.f19062c.b(c1791s0.g);
                    com.google.android.gms.internal.cast.E0 e0O = com.google.android.gms.internal.cast.F0.o(k0B.d());
                    e0O.c();
                    com.google.android.gms.internal.cast.F0.z((com.google.android.gms.internal.cast.F0) e0O.f18766i, i9);
                    e0O.c();
                    com.google.android.gms.internal.cast.F0.y((com.google.android.gms.internal.cast.F0) e0O.f18766i, i3);
                    k0B.e((com.google.android.gms.internal.cast.F0) e0O.a());
                    c1791s0.f19060a.a((com.google.android.gms.internal.cast.L0) k0B.a(), 232);
                    c1791s0.f19067i = false;
                    break;
                default:
                    B8.h hVar2 = new B8.h(11);
                    hVar2.j = java.lang.Integer.valueOf(i3);
                    E2.d dVar = (E2.d) c1784q0.f19027b;
                    hVar2.f862k = java.lang.Boolean.valueOf(((com.google.android.gms.internal.cast.BinderC1727c) dVar.f2772i).f18879f == 2);
                    E2.d.C(dVar, new com.google.android.gms.internal.cast.A(hVar2));
                    break;
            }
        }
        c();
    }

    public final void c() {
        Z3.d dVar = this.f19074c;
        H3.q.g(dVar);
        com.google.android.gms.internal.cast.RunnableC1790s runnableC1790s = this.f19075d;
        H3.q.g(runnableC1790s);
        dVar.removeCallbacks(runnableC1790s);
        this.f19076e = 0;
        this.f19078h = null;
    }
}
