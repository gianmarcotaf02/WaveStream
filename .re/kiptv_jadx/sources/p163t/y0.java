package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D1.AbstractC0220e0 f27727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p163t.y0 f27728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f27729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p020c0.C1681g0 f27730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p020c0.C1681g0 f27731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p020c0.C1677e0 f27732f = new p020c0.C1677e0(0);
    public final p020c0.C1677e0 g = new p020c0.C1677e0(Long.MIN_VALUE);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p020c0.C1681g0 f27733h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p121o0.n f27734i;
    public final p121o0.n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p020c0.C1681g0 f27735k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p020c0.F f27736l;

    public y0(D1.AbstractC0220e0 abstractC0220e0, p163t.y0 y0Var, java.lang.String str) {
        this.f27727a = abstractC0220e0;
        this.f27728b = y0Var;
        this.f27729c = str;
        this.f27730d = p020c0.AbstractC1703s.y(abstractC0220e0.s0());
        this.f27731e = p020c0.AbstractC1703s.y(new p163t.t0(abstractC0220e0.s0(), abstractC0220e0.s0()));
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f27733h = p020c0.AbstractC1703s.y(bool);
        this.f27734i = new p121o0.n();
        this.j = new p121o0.n();
        this.f27735k = p020c0.AbstractC1703s.y(bool);
        this.f27736l = p020c0.AbstractC1703s.r(new p163t.p0(this, 1));
        abstractC0220e0.B0(this);
    }

    public final void a(java.lang.Object obj, p020c0.C1700q c1700q, int i3) {
        int i9;
        c1700q.e0(-1493585151);
        if ((i3 & 6) == 0) {
            i9 = ((i3 & 8) == 0 ? c1700q.f(obj) : c1700q.h(obj) ? 4 : 2) | i3;
        } else {
            i9 = i3;
        }
        if ((i3 & 48) == 0) {
            i9 |= c1700q.f(this) ? 32 : 16;
        }
        if (c1700q.T(i9 & 1, (i9 & 19) != 18)) {
            if (g()) {
                c1700q.c0(416369985);
            } else {
                c1700q.c0(466062241);
                p(obj);
                int i10 = i9 & 112;
                boolean z6 = i10 == 32;
                java.lang.Object objQ = c1700q.Q();
                p020c0.C1676e c1676e = p020c0.C1690l.f18284a;
                if (z6 || objQ == c1676e) {
                    objQ = p020c0.AbstractC1703s.r(new p163t.p0(this, 0));
                    c1700q.n0(objQ);
                }
                if (((java.lang.Boolean) ((p020c0.e1) objQ).getValue()).booleanValue()) {
                    c1700q.c0(466470356);
                    java.lang.Object objQ2 = c1700q.Q();
                    if (objQ2 == c1676e) {
                        objQ2 = p020c0.AbstractC1703s.p(c1700q);
                        c1700q.n0(objQ2);
                    }
                    S7.A a2 = (S7.A) objQ2;
                    boolean zH = c1700q.h(a2) | (i10 == 32);
                    java.lang.Object objQ3 = c1700q.Q();
                    if (zH || objQ3 == c1676e) {
                        objQ3 = new p028c8.b(a2, this, 19);
                        c1700q.n0(objQ3);
                    }
                    p020c0.AbstractC1703s.c(a2, this, (p194x6.j) objQ3, c1700q);
                } else {
                    c1700q.c0(416369985);
                }
                c1700q.p(false);
            }
            c1700q.p(false);
        } else {
            c1700q.W();
        }
        p020c0.C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new D.l(this, obj, i3, 13);
        }
    }

    public final long b() {
        p121o0.n nVar = this.f27734i;
        int size = nVar.size();
        long jMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jMax = java.lang.Math.max(jMax, ((p163t.u0) nVar.get(i3)).f27710s.g());
        }
        p121o0.n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            jMax = java.lang.Math.max(jMax, ((p163t.y0) nVar2.get(i9)).b());
        }
        return jMax;
    }

    public final void c() {
        p121o0.n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            p163t.u0 u0Var = (p163t.u0) nVar.get(i3);
            u0Var.f27704m = null;
            u0Var.f27703l = null;
            u0Var.f27707p = false;
        }
        p121o0.n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((p163t.y0) nVar2.get(i9)).c();
        }
    }

    public final boolean d() {
        p121o0.n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((p163t.u0) nVar.get(i3)).f27703l != null) {
                return true;
            }
        }
        p121o0.n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            if (((p163t.y0) nVar2.get(i9)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        p163t.y0 y0Var = this.f27728b;
        return y0Var != null ? y0Var.e() : this.f27732f.g();
    }

    public final p163t.s0 f() {
        return (p163t.s0) this.f27731e.getValue();
    }

    public final boolean g() {
        return ((java.lang.Boolean) this.f27735k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z6) {
        p020c0.C1677e0 c1677e0 = this.g;
        long jG = c1677e0.g();
        D1.AbstractC0220e0 abstractC0220e0 = this.f27727a;
        if (jG == Long.MIN_VALUE) {
            c1677e0.h(j);
            ((p020c0.C1681g0) abstractC0220e0.f2006h).setValue(java.lang.Boolean.TRUE);
        } else if (!((java.lang.Boolean) ((p020c0.C1681g0) abstractC0220e0.f2006h).getValue()).booleanValue()) {
            ((p020c0.C1681g0) abstractC0220e0.f2006h).setValue(java.lang.Boolean.TRUE);
        }
        this.f27733h.setValue(java.lang.Boolean.FALSE);
        p121o0.n nVar = this.f27734i;
        int size = nVar.size();
        boolean z9 = true;
        for (int i3 = 0; i3 < size; i3++) {
            p163t.u0 u0Var = (p163t.u0) nVar.get(i3);
            boolean zBooleanValue = ((java.lang.Boolean) u0Var.f27705n.getValue()).booleanValue();
            p020c0.C1681g0 c1681g0 = u0Var.f27705n;
            if (!zBooleanValue) {
                long jB = z6 ? u0Var.c().b() : j;
                u0Var.e(u0Var.c().f(jB));
                u0Var.f27709r = u0Var.c().d(jB);
                if (u0Var.c().e(jB)) {
                    c1681g0.setValue(java.lang.Boolean.TRUE);
                }
            }
            if (!((java.lang.Boolean) c1681g0.getValue()).booleanValue()) {
                z9 = false;
            }
        }
        p121o0.n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            p163t.y0 y0Var = (p163t.y0) nVar2.get(i9);
            java.lang.Object value = y0Var.f27730d.getValue();
            D1.AbstractC0220e0 abstractC0220e1 = y0Var.f27727a;
            if (!kotlin.jvm.internal.m.a(value, abstractC0220e1.s0())) {
                y0Var.h(j, z6);
            }
            if (!kotlin.jvm.internal.m.a(y0Var.f27730d.getValue(), abstractC0220e1.s0())) {
                z9 = false;
            }
        }
        if (z9) {
            i();
        }
    }

    public final void i() {
        this.g.h(Long.MIN_VALUE);
        D1.AbstractC0220e0 abstractC0220e0 = this.f27727a;
        if (abstractC0220e0 instanceof p163t.L) {
            ((p163t.L) abstractC0220e0).A0(this.f27730d.getValue());
        }
        n(0L);
        ((p020c0.C1681g0) abstractC0220e0.f2006h).setValue(java.lang.Boolean.FALSE);
        p121o0.n nVar = this.j;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((p163t.y0) nVar.get(i3)).i();
        }
    }

    public final void j(float f9) {
        p121o0.n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            p163t.u0 u0Var = (p163t.u0) nVar.get(i3);
            u0Var.getClass();
            if (f9 == -4.0f || f9 == -5.0f) {
                p163t.o0 o0Var = u0Var.f27704m;
                if (o0Var != null) {
                    u0Var.c().h(o0Var.f27658c);
                    u0Var.f27703l = null;
                    u0Var.f27704m = null;
                }
                java.lang.Object obj = f9 == -4.0f ? u0Var.c().f27659d : u0Var.c().f27658c;
                u0Var.c().h(obj);
                u0Var.c().i(obj);
                u0Var.e(obj);
                u0Var.f27710s.h(u0Var.c().b());
            } else {
                u0Var.f27706o.h(f9);
            }
        }
        p121o0.n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((p163t.y0) nVar2.get(i9)).j(f9);
        }
    }

    public final void k(java.lang.Object obj, java.lang.Object obj2) {
        this.g.h(Long.MIN_VALUE);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        D1.AbstractC0220e0 abstractC0220e0 = this.f27727a;
        ((p020c0.C1681g0) abstractC0220e0.f2006h).setValue(bool);
        boolean zG = g();
        p020c0.C1681g0 c1681g0 = this.f27730d;
        if (!zG || !kotlin.jvm.internal.m.a(abstractC0220e0.s0(), obj) || !kotlin.jvm.internal.m.a(c1681g0.getValue(), obj2)) {
            if (!kotlin.jvm.internal.m.a(abstractC0220e0.s0(), obj) && (abstractC0220e0 instanceof p163t.L)) {
                ((p163t.L) abstractC0220e0).A0(obj);
            }
            c1681g0.setValue(obj2);
            this.f27735k.setValue(java.lang.Boolean.TRUE);
            this.f27731e.setValue(new p163t.t0(obj, obj2));
        }
        p121o0.n nVar = this.j;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            p163t.y0 y0Var = (p163t.y0) nVar.get(i3);
            kotlin.jvm.internal.m.c(y0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (y0Var.g()) {
                y0Var.k(y0Var.f27727a.s0(), y0Var.f27730d.getValue());
            }
        }
        p121o0.n nVar2 = this.f27734i;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((p163t.u0) nVar2.get(i9)).d(0L);
        }
    }

    public final void l(long j) {
        p020c0.C1677e0 c1677e0 = this.g;
        if (c1677e0.g() == Long.MIN_VALUE) {
            c1677e0.h(j);
        }
        n(j);
        this.f27733h.setValue(java.lang.Boolean.FALSE);
        p121o0.n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((p163t.u0) nVar.get(i3)).d(j);
        }
        p121o0.n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            p163t.y0 y0Var = (p163t.y0) nVar2.get(i9);
            if (!kotlin.jvm.internal.m.a(y0Var.f27730d.getValue(), y0Var.f27727a.s0())) {
                y0Var.l(j);
            }
        }
    }

    public final void m(p163t.V v6) {
        p121o0.n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            p163t.u0 u0Var = (p163t.u0) nVar.get(i3);
            if (!kotlin.jvm.internal.m.a(u0Var.c().f27658c, u0Var.c().f27659d)) {
                u0Var.f27704m = u0Var.c();
                u0Var.f27703l = v6;
            }
            p020c0.C1681g0 c1681g0 = u0Var.f27708q;
            u0Var.f27702k.setValue(new p163t.o0(u0Var.f27712u, u0Var.f27700h, c1681g0.getValue(), c1681g0.getValue(), u0Var.f27709r.c()));
            u0Var.f27710s.h(u0Var.c().b());
            u0Var.f27707p = true;
        }
        p121o0.n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((p163t.y0) nVar2.get(i9)).m(v6);
        }
    }

    public final void n(long j) {
        if (this.f27728b == null) {
            this.f27732f.h(j);
        }
    }

    public final void o() {
        p163t.o0 o0Var;
        p121o0.n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            p163t.u0 u0Var = (p163t.u0) nVar.get(i3);
            p163t.V v6 = u0Var.f27703l;
            if (v6 != null && (o0Var = u0Var.f27704m) != null) {
                long jR = O7.r.R(v6.g * ((double) v6.f27513d));
                java.lang.Object objF = o0Var.f(jR);
                if (u0Var.f27707p) {
                    u0Var.c().i(objF);
                }
                u0Var.c().h(objF);
                u0Var.f27710s.h(u0Var.c().b());
                if (u0Var.f27706o.g() == -2.0f || u0Var.f27707p) {
                    u0Var.e(objF);
                } else {
                    u0Var.d(u0Var.f27713v.e());
                }
                if (jR >= v6.g) {
                    u0Var.f27703l = null;
                    u0Var.f27704m = null;
                } else {
                    v6.f27512c = false;
                }
            }
        }
        p121o0.n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((p163t.y0) nVar2.get(i9)).o();
        }
    }

    public final void p(java.lang.Object obj) {
        p020c0.C1681g0 c1681g0 = this.f27730d;
        if (kotlin.jvm.internal.m.a(c1681g0.getValue(), obj)) {
            return;
        }
        this.f27731e.setValue(new p163t.t0(c1681g0.getValue(), obj));
        D1.AbstractC0220e0 abstractC0220e0 = this.f27727a;
        if (!kotlin.jvm.internal.m.a(abstractC0220e0.s0(), c1681g0.getValue())) {
            abstractC0220e0.A0(c1681g0.getValue());
        }
        c1681g0.setValue(obj);
        if (this.g.g() == Long.MIN_VALUE) {
            this.f27733h.setValue(java.lang.Boolean.TRUE);
        }
        p121o0.n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((p163t.u0) nVar.get(i3)).f27706o.h(-2.0f);
        }
    }

    public final java.lang.String toString() {
        p121o0.n nVar = this.f27734i;
        int size = nVar.size();
        java.lang.String str = "Transition animation values: ";
        for (int i3 = 0; i3 < size; i3++) {
            str = str + ((p163t.u0) nVar.get(i3)) + ", ";
        }
        return str;
    }
}
