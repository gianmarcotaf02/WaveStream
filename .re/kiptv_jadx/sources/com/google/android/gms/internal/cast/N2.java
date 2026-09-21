package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes.dex */
public final class N2 implements p191x3.h, com.google.android.gms.internal.cast.P2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.google.android.gms.internal.cast.C1799u0 f18802i = new com.google.android.gms.internal.cast.C1799u0(13);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f18803h;

    public /* synthetic */ N2(java.lang.Object obj) {
        this.f18803h = obj;
    }

    @Override // com.google.android.gms.internal.cast.P2
    public com.google.android.gms.internal.cast.W2 a(java.lang.Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            com.google.android.gms.internal.cast.P2 p2 = ((com.google.android.gms.internal.cast.P2[]) this.f18803h)[i3];
            if (p2.b(cls)) {
                return p2.a(cls);
            }
        }
        throw new java.lang.UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.cast.P2
    public boolean b(java.lang.Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (((com.google.android.gms.internal.cast.P2[]) this.f18803h)[i3].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i3, java.lang.Object obj, com.google.android.gms.internal.cast.X2 x9) throws androidx.datastore.preferences.protobuf.C1504k {
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) this.f18803h;
        a2.E(i3, 3);
        x9.d((com.google.android.gms.internal.cast.AbstractC1801u2) obj, a2.f18741k);
        a2.E(i3, 4);
    }

    @Override // p191x3.h
    public void d(p191x3.f fVar, int i3) {
        com.google.android.gms.internal.cast.C1791s0.j.b("onSessionSuspended with reason = %d", java.lang.Integer.valueOf(i3));
        com.google.android.gms.internal.cast.C1791s0 c1791s0 = (com.google.android.gms.internal.cast.C1791s0) this.f18803h;
        c1791s0.f19066h = (p191x3.C3102c) fVar;
        c1791s0.c();
        H3.q.g(c1791s0.g);
        c1791s0.f19060a.a(c1791s0.f19062c.a(c1791s0.g, i3), 225);
        com.google.android.gms.internal.cast.C1791s0.b(c1791s0);
        c1791s0.f19064e.removeCallbacks(c1791s0.f19063d);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ea  */
    @Override // p191x3.h
    public void e(p191x3.f fVar, java.lang.String str) {
        com.google.android.gms.internal.cast.C1795t0 c1795t0;
        p191x3.C3102c c3102c;
        B3.C0089b c0089b = com.google.android.gms.internal.cast.C1791s0.j;
        c0089b.b("onSessionResuming with sessionId = %s", str);
        com.google.android.gms.internal.cast.C1791s0 c1791s0 = (com.google.android.gms.internal.cast.C1791s0) this.f18803h;
        c1791s0.f19066h = (p191x3.C3102c) fVar;
        android.content.SharedPreferences sharedPreferences = c1791s0.f19065f;
        boolean z6 = false;
        if (c1791s0.h(str)) {
            c0089b.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new java.lang.Object[0]);
            H3.q.g(c1791s0.g);
        } else {
            com.google.android.gms.internal.cast.BinderC1727c binderC1727c = c1791s0.f19061b;
            if (sharedPreferences == null) {
                B3.C0089b c0089b2 = com.google.android.gms.internal.cast.C1795t0.f19079p;
            } else {
                c1795t0 = new com.google.android.gms.internal.cast.C1795t0(binderC1727c);
                c1795t0.f19092n = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    c1795t0.f19082b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        c1795t0.f19083c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            c1795t0.f19084d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                c1795t0.f19085e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    c1795t0.f19086f = sharedPreferences.getString("receiver_session_id", "");
                                    c1795t0.g = sharedPreferences.getInt("device_capabilities", 0);
                                    c1795t0.f19087h = sharedPreferences.getString("device_model_name", "");
                                    c1795t0.f19088i = sharedPreferences.getString(io.sentry.protocol.Device.JsonKeys.MANUFACTURER, "");
                                    c1795t0.j = sharedPreferences.getString("product_name", "");
                                    c1795t0.f19089k = sharedPreferences.getString(io.sentry.protocol.App.JsonKeys.BUILD_TYPE, "");
                                    c1795t0.f19090l = sharedPreferences.getString("cast_build_version", "");
                                    c1795t0.f19091m = sharedPreferences.getString("system_build_number", "");
                                    c1795t0.f19093o = sharedPreferences.getInt("analytics_session_start_type", 0);
                                }
                            }
                        }
                    }
                }
                c1791s0.g = c1795t0;
                if (c1791s0.h(str)) {
                    c0089b.b("Use the restored ApplicationAnalyticsSession if it is valid.", new java.lang.Object[0]);
                    H3.q.g(c1791s0.g);
                    com.google.android.gms.internal.cast.C1795t0.f19080q = c1791s0.g.f19084d + 1;
                } else {
                    c0089b.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new java.lang.Object[0]);
                    com.google.android.gms.internal.cast.C1795t0 c1795t1 = new com.google.android.gms.internal.cast.C1795t0(binderC1727c);
                    com.google.android.gms.internal.cast.C1795t0.f19080q++;
                    c1791s0.g = c1795t1;
                    c3102c = c1791s0.f19066h;
                    if (c3102c != null && c3102c.g.f19025i) {
                        z6 = true;
                    }
                    c1795t1.f19092n = z6;
                    B3.C0089b c0089b3 = p191x3.C3100a.j;
                    H3.q.d();
                    p191x3.C3100a c3100a = p191x3.C3100a.f31157l;
                    H3.q.g(c3100a);
                    H3.q.d();
                    c1795t1.f19082b = c3100a.f31161d.f31168h;
                    com.google.android.gms.internal.cast.C1795t0 c1795t2 = c1791s0.g;
                    H3.q.g(c1795t2);
                    c1795t2.f19086f = str;
                }
            }
            c1795t0 = null;
            c1791s0.g = c1795t0;
            if (c1791s0.h(str)) {
                c0089b.b("Use the restored ApplicationAnalyticsSession if it is valid.", new java.lang.Object[0]);
                H3.q.g(c1791s0.g);
                com.google.android.gms.internal.cast.C1795t0.f19080q = c1791s0.g.f19084d + 1;
            } else {
                c0089b.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new java.lang.Object[0]);
                com.google.android.gms.internal.cast.C1795t0 c1795t3 = new com.google.android.gms.internal.cast.C1795t0(binderC1727c);
                com.google.android.gms.internal.cast.C1795t0.f19080q++;
                c1791s0.g = c1795t3;
                c3102c = c1791s0.f19066h;
                if (c3102c != null) {
                    z6 = true;
                }
                c1795t3.f19092n = z6;
                B3.C0089b c0089b4 = p191x3.C3100a.j;
                H3.q.d();
                p191x3.C3100a c3100a2 = p191x3.C3100a.f31157l;
                H3.q.g(c3100a2);
                H3.q.d();
                c1795t3.f19082b = c3100a2.f31161d.f31168h;
                com.google.android.gms.internal.cast.C1795t0 c1795t4 = c1791s0.g;
                H3.q.g(c1795t4);
                c1795t4.f19086f = str;
            }
        }
        H3.q.g(c1791s0.g);
        com.google.android.gms.internal.cast.K0 k0B = c1791s0.f19062c.b(c1791s0.g);
        com.google.android.gms.internal.cast.E0 e0O = com.google.android.gms.internal.cast.F0.o(k0B.d());
        e0O.c();
        com.google.android.gms.internal.cast.F0.w((com.google.android.gms.internal.cast.F0) e0O.f18766i, 10);
        k0B.e((com.google.android.gms.internal.cast.F0) e0O.a());
        com.google.android.gms.internal.cast.E0 e0O2 = com.google.android.gms.internal.cast.F0.o(k0B.d());
        e0O2.c();
        com.google.android.gms.internal.cast.F0.v((com.google.android.gms.internal.cast.F0) e0O2.f18766i, true);
        k0B.c();
        com.google.android.gms.internal.cast.L0.s((com.google.android.gms.internal.cast.L0) k0B.f18766i, (com.google.android.gms.internal.cast.F0) e0O2.a());
        c1791s0.f19060a.a((com.google.android.gms.internal.cast.L0) k0B.a(), 226);
    }

    @Override // p191x3.h
    public /* bridge */ /* synthetic */ void f(p191x3.f fVar, int i3) {
        com.google.android.gms.internal.cast.C1791s0 c1791s0 = (com.google.android.gms.internal.cast.C1791s0) this.f18803h;
        c1791s0.f19066h = (p191x3.C3102c) fVar;
        com.google.android.gms.internal.cast.C1791s0.a(c1791s0, i3);
    }

    public void g(int i3, java.lang.Object obj, com.google.android.gms.internal.cast.X2 x9) throws androidx.datastore.preferences.protobuf.C1504k {
        com.google.android.gms.internal.cast.AbstractC1801u2 abstractC1801u2 = (com.google.android.gms.internal.cast.AbstractC1801u2) obj;
        com.google.android.gms.internal.cast.A2 a2 = (com.google.android.gms.internal.cast.A2) this.f18803h;
        a2.G((i3 << 3) | 2);
        a2.G(abstractC1801u2.a(x9));
        x9.d(abstractC1801u2, a2.f18741k);
    }

    @Override // p191x3.h
    public void h(p191x3.f fVar, boolean z6) {
        com.google.android.gms.internal.cast.C1791s0.j.b("onSessionResumed with wasSuspended = %b", java.lang.Boolean.valueOf(z6));
        com.google.android.gms.internal.cast.C1791s0 c1791s0 = (com.google.android.gms.internal.cast.C1791s0) this.f18803h;
        c1791s0.f19066h = (p191x3.C3102c) fVar;
        c1791s0.c();
        H3.q.g(c1791s0.g);
        com.google.android.gms.internal.cast.K0 k0B = c1791s0.f19062c.b(c1791s0.g);
        com.google.android.gms.internal.cast.E0 e0O = com.google.android.gms.internal.cast.F0.o(k0B.d());
        e0O.c();
        com.google.android.gms.internal.cast.F0.v((com.google.android.gms.internal.cast.F0) e0O.f18766i, z6);
        k0B.c();
        com.google.android.gms.internal.cast.L0.s((com.google.android.gms.internal.cast.L0) k0B.f18766i, (com.google.android.gms.internal.cast.F0) e0O.a());
        c1791s0.f19060a.a((com.google.android.gms.internal.cast.L0) k0B.a(), 227);
        com.google.android.gms.internal.cast.C1791s0.b(c1791s0);
        c1791s0.e();
    }

    @Override // p191x3.h
    public /* bridge */ /* synthetic */ void j(p191x3.f fVar, int i3) {
        com.google.android.gms.internal.cast.C1791s0 c1791s0 = (com.google.android.gms.internal.cast.C1791s0) this.f18803h;
        c1791s0.f19066h = (p191x3.C3102c) fVar;
        com.google.android.gms.internal.cast.C1791s0.a(c1791s0, i3);
    }

    @Override // p191x3.h
    public void k(p191x3.f fVar, java.lang.String str) {
        com.google.android.gms.internal.cast.C1791s0.j.b("onSessionStarted with sessionId = %s", str);
        com.google.android.gms.internal.cast.C1791s0 c1791s0 = (com.google.android.gms.internal.cast.C1791s0) this.f18803h;
        c1791s0.f19066h = (p191x3.C3102c) fVar;
        c1791s0.c();
        com.google.android.gms.internal.cast.C1795t0 c1795t0 = c1791s0.g;
        c1795t0.f19086f = str;
        c1791s0.f19060a.a((com.google.android.gms.internal.cast.L0) c1791s0.f19062c.b(c1795t0).a(), 222);
        com.google.android.gms.internal.cast.C1791s0.b(c1791s0);
        c1791s0.e();
    }

    @Override // p191x3.h
    public /* synthetic */ void n(p191x3.f fVar) {
        ((com.google.android.gms.internal.cast.C1791s0) this.f18803h).f19066h = (p191x3.C3102c) fVar;
    }

    @Override // p191x3.h
    public void o(p191x3.f fVar) {
        B3.C0089b c0089b = com.google.android.gms.internal.cast.C1791s0.j;
        c0089b.b("onSessionStarting", new java.lang.Object[0]);
        com.google.android.gms.internal.cast.C1791s0 c1791s0 = (com.google.android.gms.internal.cast.C1791s0) this.f18803h;
        c1791s0.f19066h = (p191x3.C3102c) fVar;
        if (c1791s0.g != null) {
            android.util.Log.w(c0089b.f617a, c0089b.d("Start a session while there's already an active session. Create a new one.", new java.lang.Object[0]));
        }
        c1791s0.d();
        com.google.android.gms.internal.cast.C1795t0 c1795t0 = c1791s0.g;
        com.google.android.gms.internal.cast.K0 k0B = c1791s0.f19062c.b(c1795t0);
        if (c1795t0.f19093o == 1) {
            com.google.android.gms.internal.cast.E0 e0O = com.google.android.gms.internal.cast.F0.o(k0B.d());
            e0O.c();
            com.google.android.gms.internal.cast.F0.w((com.google.android.gms.internal.cast.F0) e0O.f18766i, 17);
            k0B.e((com.google.android.gms.internal.cast.F0) e0O.a());
        }
        c1791s0.f19060a.a((com.google.android.gms.internal.cast.L0) k0B.a(), 221);
    }

    @Override // p191x3.h
    public /* bridge */ /* synthetic */ void q(p191x3.f fVar, int i3) {
        com.google.android.gms.internal.cast.C1791s0 c1791s0 = (com.google.android.gms.internal.cast.C1791s0) this.f18803h;
        c1791s0.f19066h = (p191x3.C3102c) fVar;
        com.google.android.gms.internal.cast.C1791s0.a(c1791s0, i3);
    }

    public N2() {
        com.google.android.gms.internal.cast.U2 u6 = com.google.android.gms.internal.cast.U2.f18826c;
        com.google.android.gms.internal.cast.N2 n3 = new com.google.android.gms.internal.cast.N2(new com.google.android.gms.internal.cast.P2[]{com.google.android.gms.internal.cast.C1799u0.f19098l, f18802i});
        java.nio.charset.Charset charset = com.google.android.gms.internal.cast.J2.f18779a;
        this.f18803h = n3;
    }

    public N2(com.google.android.gms.internal.cast.A2 a2) {
        java.nio.charset.Charset charset = com.google.android.gms.internal.cast.J2.f18779a;
        this.f18803h = a2;
        a2.f18741k = this;
    }
}
