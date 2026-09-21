package com.google.android.gms.internal.cast;

import B3.C0089b;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.datastore.preferences.protobuf.C1504k;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import java.nio.charset.Charset;
import p191x3.C3100a;
import p191x3.C3102c;

public final class N2 implements p191x3.h, P2 {

    public static final C1799u0 f18802i = new C1799u0(13);

    public final Object f18803h;

    public N2(Object obj) {
        this.f18803h = obj;
    }

    @Override
    public W2 a(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            P2 p2 = ((P2[]) this.f18803h)[i3];
            if (p2.b(cls)) {
                return p2.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override
    public boolean b(Class cls) {
        for (int i3 = 0; i3 < 2; i3++) {
            if (((P2[]) this.f18803h)[i3].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i3, Object obj, X2 x9) throws C1504k {
        A2 a2 = (A2) this.f18803h;
        a2.E(i3, 3);
        x9.d((AbstractC1801u2) obj, a2.f18741k);
        a2.E(i3, 4);
    }

    @Override
    public void d(p191x3.f fVar, int i3) {
        C1791s0.j.b("onSessionSuspended with reason = %d", Integer.valueOf(i3));
        C1791s0 c1791s0 = (C1791s0) this.f18803h;
        c1791s0.f19066h = (C3102c) fVar;
        c1791s0.c();
        H3.q.g(c1791s0.g);
        c1791s0.f19060a.a(c1791s0.f19062c.a(c1791s0.g, i3), 225);
        C1791s0.b(c1791s0);
        c1791s0.f19064e.removeCallbacks(c1791s0.f19063d);
    }

    @Override
    public void e(p191x3.f fVar, String str) {
        C1795t0 c1795t0;
        C3102c c3102c;
        C0089b c0089b = C1791s0.j;
        c0089b.b("onSessionResuming with sessionId = %s", str);
        C1791s0 c1791s0 = (C1791s0) this.f18803h;
        c1791s0.f19066h = (C3102c) fVar;
        SharedPreferences sharedPreferences = c1791s0.f19065f;
        boolean z6 = false;
        if (c1791s0.h(str)) {
            c0089b.b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            H3.q.g(c1791s0.g);
        } else {
            BinderC1727c binderC1727c = c1791s0.f19061b;
            if (sharedPreferences == null) {
                C0089b c0089b2 = C1795t0.f19079p;
            } else {
                c1795t0 = new C1795t0(binderC1727c);
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
                                    c1795t0.f19088i = sharedPreferences.getString(Device.JsonKeys.MANUFACTURER, "");
                                    c1795t0.j = sharedPreferences.getString("product_name", "");
                                    c1795t0.f19089k = sharedPreferences.getString(App.JsonKeys.BUILD_TYPE, "");
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
                    c0089b.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                    H3.q.g(c1791s0.g);
                    C1795t0.f19080q = c1791s0.g.f19084d + 1;
                } else {
                    c0089b.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                    C1795t0 c1795t1 = new C1795t0(binderC1727c);
                    C1795t0.f19080q++;
                    c1791s0.g = c1795t1;
                    c3102c = c1791s0.f19066h;
                    if (c3102c != null && c3102c.g.f19025i) {
                        z6 = true;
                    }
                    c1795t1.f19092n = z6;
                    C0089b c0089b3 = C3100a.j;
                    H3.q.d();
                    C3100a c3100a = C3100a.f31157l;
                    H3.q.g(c3100a);
                    H3.q.d();
                    c1795t1.f19082b = c3100a.f31161d.f31168h;
                    C1795t0 c1795t2 = c1791s0.g;
                    H3.q.g(c1795t2);
                    c1795t2.f19086f = str;
                }
            }
            c1795t0 = null;
            c1791s0.g = c1795t0;
            if (c1791s0.h(str)) {
                c0089b.b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                H3.q.g(c1791s0.g);
                C1795t0.f19080q = c1791s0.g.f19084d + 1;
            } else {
                c0089b.b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                C1795t0 c1795t3 = new C1795t0(binderC1727c);
                C1795t0.f19080q++;
                c1791s0.g = c1795t3;
                c3102c = c1791s0.f19066h;
                if (c3102c != null) {
                    z6 = true;
                }
                c1795t3.f19092n = z6;
                C0089b c0089b4 = C3100a.j;
                H3.q.d();
                C3100a c3100a2 = C3100a.f31157l;
                H3.q.g(c3100a2);
                H3.q.d();
                c1795t3.f19082b = c3100a2.f31161d.f31168h;
                C1795t0 c1795t4 = c1791s0.g;
                H3.q.g(c1795t4);
                c1795t4.f19086f = str;
            }
        }
        H3.q.g(c1791s0.g);
        K0 k0B = c1791s0.f19062c.b(c1791s0.g);
        E0 e0O = F0.o(k0B.d());
        e0O.c();
        F0.w((F0) e0O.f18766i, 10);
        k0B.e((F0) e0O.a());
        E0 e0O2 = F0.o(k0B.d());
        e0O2.c();
        F0.v((F0) e0O2.f18766i, true);
        k0B.c();
        L0.s((L0) k0B.f18766i, (F0) e0O2.a());
        c1791s0.f19060a.a((L0) k0B.a(), 226);
    }

    @Override
    public void f(p191x3.f fVar, int i3) {
        C1791s0 c1791s0 = (C1791s0) this.f18803h;
        c1791s0.f19066h = (C3102c) fVar;
        C1791s0.a(c1791s0, i3);
    }

    public void g(int i3, Object obj, X2 x9) throws C1504k {
        AbstractC1801u2 abstractC1801u2 = (AbstractC1801u2) obj;
        A2 a2 = (A2) this.f18803h;
        a2.G((i3 << 3) | 2);
        a2.G(abstractC1801u2.a(x9));
        x9.d(abstractC1801u2, a2.f18741k);
    }

    @Override
    public void h(p191x3.f fVar, boolean z6) {
        C1791s0.j.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z6));
        C1791s0 c1791s0 = (C1791s0) this.f18803h;
        c1791s0.f19066h = (C3102c) fVar;
        c1791s0.c();
        H3.q.g(c1791s0.g);
        K0 k0B = c1791s0.f19062c.b(c1791s0.g);
        E0 e0O = F0.o(k0B.d());
        e0O.c();
        F0.v((F0) e0O.f18766i, z6);
        k0B.c();
        L0.s((L0) k0B.f18766i, (F0) e0O.a());
        c1791s0.f19060a.a((L0) k0B.a(), 227);
        C1791s0.b(c1791s0);
        c1791s0.e();
    }

    @Override
    public void j(p191x3.f fVar, int i3) {
        C1791s0 c1791s0 = (C1791s0) this.f18803h;
        c1791s0.f19066h = (C3102c) fVar;
        C1791s0.a(c1791s0, i3);
    }

    @Override
    public void k(p191x3.f fVar, String str) {
        C1791s0.j.b("onSessionStarted with sessionId = %s", str);
        C1791s0 c1791s0 = (C1791s0) this.f18803h;
        c1791s0.f19066h = (C3102c) fVar;
        c1791s0.c();
        C1795t0 c1795t0 = c1791s0.g;
        c1795t0.f19086f = str;
        c1791s0.f19060a.a((L0) c1791s0.f19062c.b(c1795t0).a(), 222);
        C1791s0.b(c1791s0);
        c1791s0.e();
    }

    @Override
    public void n(p191x3.f fVar) {
        ((C1791s0) this.f18803h).f19066h = (C3102c) fVar;
    }

    @Override
    public void o(p191x3.f fVar) {
        C0089b c0089b = C1791s0.j;
        c0089b.b("onSessionStarting", new Object[0]);
        C1791s0 c1791s0 = (C1791s0) this.f18803h;
        c1791s0.f19066h = (C3102c) fVar;
        if (c1791s0.g != null) {
            Log.w(c0089b.f617a, c0089b.d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        c1791s0.d();
        C1795t0 c1795t0 = c1791s0.g;
        K0 k0B = c1791s0.f19062c.b(c1795t0);
        if (c1795t0.f19093o == 1) {
            E0 e0O = F0.o(k0B.d());
            e0O.c();
            F0.w((F0) e0O.f18766i, 17);
            k0B.e((F0) e0O.a());
        }
        c1791s0.f19060a.a((L0) k0B.a(), 221);
    }

    @Override
    public void q(p191x3.f fVar, int i3) {
        C1791s0 c1791s0 = (C1791s0) this.f18803h;
        c1791s0.f19066h = (C3102c) fVar;
        C1791s0.a(c1791s0, i3);
    }

    public N2() {
        U2 u6 = U2.f18826c;
        N2 n3 = new N2(new P2[]{C1799u0.f19098l, f18802i});
        Charset charset = J2.f18779a;
        this.f18803h = n3;
    }

    public N2(A2 a2) {
        Charset charset = J2.f18779a;
        this.f18803h = a2;
        a2.f18741k = this;
    }
}
