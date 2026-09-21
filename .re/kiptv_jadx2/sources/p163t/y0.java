package p163t;

import D.l;
import D1.AbstractC0220e0;
import O7.r;
import S7.A;
import kotlin.jvm.internal.m;
import p020c0.AbstractC1703s;
import p020c0.C1676e;
import p020c0.C1677e0;
import p020c0.C1681g0;
import p020c0.C1690l;
import p020c0.C1700q;
import p020c0.C1701q0;
import p020c0.F;
import p020c0.e1;
import p028c8.b;
import p121o0.n;
import p194x6.j;

public final class y0 {

    public final AbstractC0220e0 f27727a;

    public final y0 f27728b;

    public final String f27729c;

    public final C1681g0 f27730d;

    public final C1681g0 f27731e;

    public final C1677e0 f27732f = new C1677e0(0);
    public final C1677e0 g = new C1677e0(Long.MIN_VALUE);

    public final C1681g0 f27733h;

    public final n f27734i;
    public final n j;

    public final C1681g0 f27735k;

    public final F f27736l;

    public y0(AbstractC0220e0 abstractC0220e0, y0 y0Var, String str) {
        this.f27727a = abstractC0220e0;
        this.f27728b = y0Var;
        this.f27729c = str;
        this.f27730d = AbstractC1703s.y(abstractC0220e0.s0());
        this.f27731e = AbstractC1703s.y(new t0(abstractC0220e0.s0(), abstractC0220e0.s0()));
        Boolean bool = Boolean.FALSE;
        this.f27733h = AbstractC1703s.y(bool);
        this.f27734i = new n();
        this.j = new n();
        this.f27735k = AbstractC1703s.y(bool);
        this.f27736l = AbstractC1703s.r(new p0(this, 1));
        abstractC0220e0.B0(this);
    }

    public final void a(Object obj, C1700q c1700q, int i3) {
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
                Object objQ = c1700q.Q();
                C1676e c1676e = C1690l.f18284a;
                if (z6 || objQ == c1676e) {
                    objQ = AbstractC1703s.r(new p0(this, 0));
                    c1700q.n0(objQ);
                }
                if (((Boolean) ((e1) objQ).getValue()).booleanValue()) {
                    c1700q.c0(466470356);
                    Object objQ2 = c1700q.Q();
                    if (objQ2 == c1676e) {
                        objQ2 = AbstractC1703s.p(c1700q);
                        c1700q.n0(objQ2);
                    }
                    A a2 = (A) objQ2;
                    boolean zH = c1700q.h(a2) | (i10 == 32);
                    Object objQ3 = c1700q.Q();
                    if (zH || objQ3 == c1676e) {
                        objQ3 = new b(a2, this, 19);
                        c1700q.n0(objQ3);
                    }
                    AbstractC1703s.c(a2, this, (j) objQ3, c1700q);
                } else {
                    c1700q.c0(416369985);
                }
                c1700q.p(false);
            }
            c1700q.p(false);
        } else {
            c1700q.W();
        }
        C1701q0 c1701q0U = c1700q.u();
        if (c1701q0U != null) {
            c1701q0U.f18351d = new l(this, obj, i3, 13);
        }
    }

    public final long b() {
        n nVar = this.f27734i;
        int size = nVar.size();
        long jMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jMax = Math.max(jMax, ((u0) nVar.get(i3)).f27710s.g());
        }
        n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            jMax = Math.max(jMax, ((y0) nVar2.get(i9)).b());
        }
        return jMax;
    }

    public final void c() {
        n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            u0 u0Var = (u0) nVar.get(i3);
            u0Var.f27704m = null;
            u0Var.f27703l = null;
            u0Var.f27707p = false;
        }
        n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((y0) nVar2.get(i9)).c();
        }
    }

    public final boolean d() {
        n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((u0) nVar.get(i3)).f27703l != null) {
                return true;
            }
        }
        n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            if (((y0) nVar2.get(i9)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        y0 y0Var = this.f27728b;
        return y0Var != null ? y0Var.e() : this.f27732f.g();
    }

    public final s0 f() {
        return (s0) this.f27731e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.f27735k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z6) {
        C1677e0 c1677e0 = this.g;
        long jG = c1677e0.g();
        AbstractC0220e0 abstractC0220e0 = this.f27727a;
        if (jG == Long.MIN_VALUE) {
            c1677e0.h(j);
            ((C1681g0) abstractC0220e0.f2006h).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C1681g0) abstractC0220e0.f2006h).getValue()).booleanValue()) {
            ((C1681g0) abstractC0220e0.f2006h).setValue(Boolean.TRUE);
        }
        this.f27733h.setValue(Boolean.FALSE);
        n nVar = this.f27734i;
        int size = nVar.size();
        boolean z9 = true;
        for (int i3 = 0; i3 < size; i3++) {
            u0 u0Var = (u0) nVar.get(i3);
            boolean zBooleanValue = ((Boolean) u0Var.f27705n.getValue()).booleanValue();
            C1681g0 c1681g0 = u0Var.f27705n;
            if (!zBooleanValue) {
                long jB = z6 ? u0Var.c().b() : j;
                u0Var.e(u0Var.c().f(jB));
                u0Var.f27709r = u0Var.c().d(jB);
                if (u0Var.c().e(jB)) {
                    c1681g0.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) c1681g0.getValue()).booleanValue()) {
                z9 = false;
            }
        }
        n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            y0 y0Var = (y0) nVar2.get(i9);
            Object value = y0Var.f27730d.getValue();
            AbstractC0220e0 abstractC0220e1 = y0Var.f27727a;
            if (!m.a(value, abstractC0220e1.s0())) {
                y0Var.h(j, z6);
            }
            if (!m.a(y0Var.f27730d.getValue(), abstractC0220e1.s0())) {
                z9 = false;
            }
        }
        if (z9) {
            i();
        }
    }

    public final void i() {
        this.g.h(Long.MIN_VALUE);
        AbstractC0220e0 abstractC0220e0 = this.f27727a;
        if (abstractC0220e0 instanceof L) {
            ((L) abstractC0220e0).A0(this.f27730d.getValue());
        }
        n(0L);
        ((C1681g0) abstractC0220e0.f2006h).setValue(Boolean.FALSE);
        n nVar = this.j;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((y0) nVar.get(i3)).i();
        }
    }

    public final void j(float f9) {
        n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            u0 u0Var = (u0) nVar.get(i3);
            u0Var.getClass();
            if (f9 == -4.0f || f9 == -5.0f) {
                o0 o0Var = u0Var.f27704m;
                if (o0Var != null) {
                    u0Var.c().h(o0Var.f27658c);
                    u0Var.f27703l = null;
                    u0Var.f27704m = null;
                }
                Object obj = f9 == -4.0f ? u0Var.c().f27659d : u0Var.c().f27658c;
                u0Var.c().h(obj);
                u0Var.c().i(obj);
                u0Var.e(obj);
                u0Var.f27710s.h(u0Var.c().b());
            } else {
                u0Var.f27706o.h(f9);
            }
        }
        n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((y0) nVar2.get(i9)).j(f9);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.h(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        AbstractC0220e0 abstractC0220e0 = this.f27727a;
        ((C1681g0) abstractC0220e0.f2006h).setValue(bool);
        boolean zG = g();
        C1681g0 c1681g0 = this.f27730d;
        if (!zG || !m.a(abstractC0220e0.s0(), obj) || !m.a(c1681g0.getValue(), obj2)) {
            if (!m.a(abstractC0220e0.s0(), obj) && (abstractC0220e0 instanceof L)) {
                ((L) abstractC0220e0).A0(obj);
            }
            c1681g0.setValue(obj2);
            this.f27735k.setValue(Boolean.TRUE);
            this.f27731e.setValue(new t0(obj, obj2));
        }
        n nVar = this.j;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            y0 y0Var = (y0) nVar.get(i3);
            m.c(y0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (y0Var.g()) {
                y0Var.k(y0Var.f27727a.s0(), y0Var.f27730d.getValue());
            }
        }
        n nVar2 = this.f27734i;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((u0) nVar2.get(i9)).d(0L);
        }
    }

    public final void l(long j) {
        C1677e0 c1677e0 = this.g;
        if (c1677e0.g() == Long.MIN_VALUE) {
            c1677e0.h(j);
        }
        n(j);
        this.f27733h.setValue(Boolean.FALSE);
        n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((u0) nVar.get(i3)).d(j);
        }
        n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            y0 y0Var = (y0) nVar2.get(i9);
            if (!m.a(y0Var.f27730d.getValue(), y0Var.f27727a.s0())) {
                y0Var.l(j);
            }
        }
    }

    public final void m(V v6) {
        n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            u0 u0Var = (u0) nVar.get(i3);
            if (!m.a(u0Var.c().f27658c, u0Var.c().f27659d)) {
                u0Var.f27704m = u0Var.c();
                u0Var.f27703l = v6;
            }
            C1681g0 c1681g0 = u0Var.f27708q;
            u0Var.f27702k.setValue(new o0(u0Var.f27712u, u0Var.f27700h, c1681g0.getValue(), c1681g0.getValue(), u0Var.f27709r.c()));
            u0Var.f27710s.h(u0Var.c().b());
            u0Var.f27707p = true;
        }
        n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((y0) nVar2.get(i9)).m(v6);
        }
    }

    public final void n(long j) {
        if (this.f27728b == null) {
            this.f27732f.h(j);
        }
    }

    public final void o() {
        o0 o0Var;
        n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            u0 u0Var = (u0) nVar.get(i3);
            V v6 = u0Var.f27703l;
            if (v6 != null && (o0Var = u0Var.f27704m) != null) {
                long jR = r.R(v6.g * ((double) v6.f27513d));
                Object objF = o0Var.f(jR);
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
        n nVar2 = this.j;
        int size2 = nVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((y0) nVar2.get(i9)).o();
        }
    }

    public final void p(Object obj) {
        C1681g0 c1681g0 = this.f27730d;
        if (m.a(c1681g0.getValue(), obj)) {
            return;
        }
        this.f27731e.setValue(new t0(c1681g0.getValue(), obj));
        AbstractC0220e0 abstractC0220e0 = this.f27727a;
        if (!m.a(abstractC0220e0.s0(), c1681g0.getValue())) {
            abstractC0220e0.A0(c1681g0.getValue());
        }
        c1681g0.setValue(obj);
        if (this.g.g() == Long.MIN_VALUE) {
            this.f27733h.setValue(Boolean.TRUE);
        }
        n nVar = this.f27734i;
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((u0) nVar.get(i3)).f27706o.h(-2.0f);
        }
    }

    public final String toString() {
        n nVar = this.f27734i;
        int size = nVar.size();
        String str = "Transition animation values: ";
        for (int i3 = 0; i3 < size; i3++) {
            str = str + ((u0) nVar.get(i3)) + ", ";
        }
        return str;
    }
}
