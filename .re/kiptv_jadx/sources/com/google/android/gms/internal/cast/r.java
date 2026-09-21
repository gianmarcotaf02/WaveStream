package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements p059g4.c, p059g4.b, p191x3.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.cast.C1794t f19029h;

    public /* synthetic */ r(com.google.android.gms.internal.cast.C1794t c1794t) {
        this.f19029h = c1794t;
    }

    @Override // p191x3.h
    public /* bridge */ /* synthetic */ void d(p191x3.f fVar, int i3) {
    }

    @Override // p191x3.h
    public /* bridge */ /* synthetic */ void e(p191x3.f fVar, java.lang.String str) {
    }

    @Override // p191x3.h
    public /* bridge */ /* synthetic */ void f(p191x3.f fVar, int i3) {
    }

    @Override // p191x3.h
    public /* bridge */ /* synthetic */ void h(p191x3.f fVar, boolean z6) {
    }

    @Override // p191x3.h
    public /* bridge */ /* synthetic */ void j(p191x3.f fVar, int i3) {
    }

    @Override // p191x3.h
    public void k(p191x3.f fVar, java.lang.String str) {
        p184w3.k kVar;
        B3.C0089b c0089b = com.google.android.gms.internal.cast.C1794t.f19071i;
        com.google.android.gms.internal.cast.C1794t c1794t = this.f19029h;
        c0089b.b("onSessionStarted with transferType = %d", java.lang.Integer.valueOf(c1794t.f19076e));
        if (c1794t.f19072a.f31180u && c1794t.f19076e == 2) {
            if (c1794t.f19078h == null) {
                c0089b.b("skip restoring session state due to null SessionState", new java.lang.Object[0]);
            } else {
                p199y3.g gVarA = c1794t.a();
                if (gVarA == null) {
                    c0089b.b("skip restoring session state due to null RemoteMediaClient", new java.lang.Object[0]);
                } else {
                    c0089b.b("resume SessionState to current session", new java.lang.Object[0]);
                    p184w3.r rVar = c1794t.f19078h;
                    if (rVar != null && (kVar = rVar.f29921h) != null) {
                        p199y3.g.f31861k.b("resume SessionState", new java.lang.Object[0]);
                        H3.q.d();
                        if (gVarA.t()) {
                            p199y3.g.u(new p199y3.i(gVarA, kVar, 1));
                        } else {
                            p199y3.g.q();
                        }
                    }
                }
            }
        }
        c1794t.c();
    }

    @Override // p191x3.h
    public /* bridge */ /* synthetic */ void n(p191x3.f fVar) {
    }

    @Override // p191x3.h
    public /* bridge */ /* synthetic */ void o(p191x3.f fVar) {
    }

    @Override // p059g4.b
    public void onFailure(java.lang.Exception exc) {
        com.google.android.gms.internal.cast.C1794t c1794t = this.f19029h;
        c1794t.getClass();
        B3.C0089b c0089b = com.google.android.gms.internal.cast.C1794t.f19071i;
        android.util.Log.w(c0089b.f617a, c0089b.d("Fail to store SessionState", new java.lang.Object[0]), exc);
        c1794t.b(100);
    }

    @Override // p059g4.c
    public void onSuccess(java.lang.Object obj) {
        com.google.android.gms.internal.cast.C1794t c1794t = this.f19029h;
        c1794t.f19078h = (p184w3.r) obj;
        p155s1.h hVar = c1794t.g;
        if (hVar != null) {
            hVar.a(null);
        }
    }

    @Override // p191x3.h
    public void q(p191x3.f fVar, int i3) {
        B3.C0089b c0089b = com.google.android.gms.internal.cast.C1794t.f19071i;
        c0089b.b("onSessionEnded with error = %d", java.lang.Integer.valueOf(i3));
        com.google.android.gms.internal.cast.C1794t c1794t = this.f19029h;
        int i9 = c1794t.f19076e;
        if (i9 == 0) {
            c0089b.b("No need to notify transferred if the transfer type is unknown", new java.lang.Object[0]);
        } else if (c1794t.f19078h != null) {
            c0089b.b("notify transferred with type = %d, sessionState = %s", java.lang.Integer.valueOf(i9), c1794t.f19078h);
            for (com.google.android.gms.internal.cast.C1784q0 c1784q0 : new java.util.HashSet(c1794t.f19073b)) {
                int i10 = c1794t.f19076e;
                switch (c1784q0.f19026a) {
                    case 0:
                        com.google.android.gms.internal.cast.C1791s0.j.b("onTransferred with type = %d", java.lang.Integer.valueOf(i10));
                        com.google.android.gms.internal.cast.C1791s0 c1791s0 = (com.google.android.gms.internal.cast.C1791s0) c1784q0.f19027b;
                        c1791s0.c();
                        com.google.android.gms.internal.cast.K0 k0B = c1791s0.f19062c.b(c1791s0.g);
                        com.google.android.gms.internal.cast.E0 e0O = com.google.android.gms.internal.cast.F0.o(k0B.d());
                        e0O.c();
                        com.google.android.gms.internal.cast.F0.z((com.google.android.gms.internal.cast.F0) e0O.f18766i, i10);
                        k0B.e((com.google.android.gms.internal.cast.F0) e0O.a());
                        c1791s0.f19060a.a((com.google.android.gms.internal.cast.L0) k0B.a(), 231);
                        c1791s0.f19067i = false;
                        c1791s0.g = null;
                        break;
                }
            }
        } else {
            c0089b.b("No need to notify with null sessionState", new java.lang.Object[0]);
        }
        if (c1794t.f19076e == 2) {
            return;
        }
        c1794t.c();
    }
}
