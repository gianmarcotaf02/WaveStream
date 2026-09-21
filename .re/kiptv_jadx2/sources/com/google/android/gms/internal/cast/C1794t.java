package com.google.android.gms.internal.cast;

import B3.C0089b;
import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p191x3.C3101b;
import p191x3.C3102c;

public final class C1794t {

    public static final C0089b f19071i = new C0089b("SessionTransController", null);

    public final C3101b f19072a;

    public p191x3.g f19077f;
    public p155s1.h g;

    public p184w3.r f19078h;

    public final Set f19073b = Collections.synchronizedSet(new HashSet());

    public int f19076e = 0;

    public final Z3.d f19074c = new Z3.d(Looper.getMainLooper(), 2);

    public final RunnableC1790s f19075d = new RunnableC1790s(this, 0);

    public C1794t(C3101b c3101b) {
        this.f19072a = c3101b;
    }

    public final p199y3.g a() {
        p191x3.g gVar = this.f19077f;
        C0089b c0089b = f19071i;
        if (gVar == null) {
            c0089b.b("skip transferring as SessionManager is null", new Object[0]);
            return null;
        }
        H3.q.d();
        p191x3.f fVarC = gVar.c();
        C3102c c3102c = (fVarC == null || !(fVarC instanceof C3102c)) ? null : (C3102c) fVarC;
        if (c3102c == null) {
            c0089b.b("skip transferring as CastSession is null", new Object[0]);
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
        f19071i.b("notify failed transfer with type = %d, reason = %d", Integer.valueOf(this.f19076e), Integer.valueOf(i3));
        for (C1784q0 c1784q0 : new HashSet(this.f19073b)) {
            int i9 = this.f19076e;
            switch (c1784q0.f19026a) {
                case 0:
                    C1791s0.j.b("onTransferFailed with type = %d and reason = %d", Integer.valueOf(i9), Integer.valueOf(i3));
                    C1791s0 c1791s0 = (C1791s0) c1784q0.f19027b;
                    c1791s0.c();
                    K0 k0B = c1791s0.f19062c.b(c1791s0.g);
                    E0 e0O = F0.o(k0B.d());
                    e0O.c();
                    F0.z((F0) e0O.f18766i, i9);
                    e0O.c();
                    F0.y((F0) e0O.f18766i, i3);
                    k0B.e((F0) e0O.a());
                    c1791s0.f19060a.a((L0) k0B.a(), 232);
                    c1791s0.f19067i = false;
                    break;
                default:
                    B8.h hVar2 = new B8.h(11);
                    hVar2.j = Integer.valueOf(i3);
                    E2.d dVar = (E2.d) c1784q0.f19027b;
                    hVar2.f862k = Boolean.valueOf(((BinderC1727c) dVar.f2772i).f18879f == 2);
                    E2.d.C(dVar, new A(hVar2));
                    break;
            }
        }
        c();
    }

    public final void c() {
        Z3.d dVar = this.f19074c;
        H3.q.g(dVar);
        RunnableC1790s runnableC1790s = this.f19075d;
        H3.q.g(runnableC1790s);
        dVar.removeCallbacks(runnableC1790s);
        this.f19076e = 0;
        this.f19078h = null;
    }
}
