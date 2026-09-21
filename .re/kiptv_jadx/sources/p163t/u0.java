package p163t;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements p020c0.e1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p163t.E0 f27700h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p020c0.C1681g0 f27701i;
    public final p020c0.C1681g0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p020c0.C1681g0 f27702k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p163t.V f27703l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p163t.o0 f27704m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p020c0.C1681g0 f27705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p020c0.C1673c0 f27706o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27707p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p020c0.C1681g0 f27708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p163t.r f27709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p020c0.C1677e0 f27710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f27711t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p163t.C2761i0 f27712u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p163t.y0 f27713v;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, java.util.Map] */
    public u0(p163t.y0 y0Var, java.lang.Object obj, p163t.r rVar, p163t.E0 e6) {
        this.f27713v = y0Var;
        this.f27700h = e6;
        p020c0.C1681g0 c1681g0Y = p020c0.AbstractC1703s.y(obj);
        this.f27701i = c1681g0Y;
        java.lang.Object objInvoke = null;
        p020c0.C1681g0 c1681g0Y2 = p020c0.AbstractC1703s.y(p163t.AbstractC2750d.o(0.0f, 0.0f, null, 7));
        this.j = c1681g0Y2;
        this.f27702k = p020c0.AbstractC1703s.y(new p163t.o0((p163t.A) c1681g0Y2.getValue(), e6, obj, c1681g0Y.getValue(), rVar));
        this.f27705n = p020c0.AbstractC1703s.y(java.lang.Boolean.TRUE);
        this.f27706o = new p020c0.C1673c0(-1.0f);
        this.f27708q = p020c0.AbstractC1703s.y(obj);
        this.f27709r = rVar;
        this.f27710s = new p020c0.C1677e0(c().b());
        java.lang.Float f9 = (java.lang.Float) p163t.M0.f27496a.get(e6);
        if (f9 != null) {
            float fFloatValue = f9.floatValue();
            p163t.r rVar2 = (p163t.r) e6.f27453a.invoke(obj);
            int iB = rVar2.b();
            for (int i3 = 0; i3 < iB; i3++) {
                rVar2.e(fFloatValue, i3);
            }
            objInvoke = this.f27700h.f27454b.invoke(rVar2);
        }
        this.f27712u = p163t.AbstractC2750d.o(0.0f, 0.0f, objInvoke, 3);
    }

    public final p163t.o0 c() {
        return (p163t.o0) this.f27702k.getValue();
    }

    public final void d(long j) {
        if (this.f27706o.g() == -1.0f) {
            this.f27711t = true;
            if (kotlin.jvm.internal.m.a(c().f27658c, c().f27659d)) {
                e(c().f27658c);
            } else {
                e(c().f(j));
                this.f27709r = c().d(j);
            }
        }
    }

    public final void e(java.lang.Object obj) {
        this.f27708q.setValue(obj);
    }

    public final void f(java.lang.Object obj, boolean z6) {
        p163t.A a2;
        p163t.o0 o0Var = this.f27704m;
        java.lang.Object obj2 = o0Var != null ? o0Var.f27658c : null;
        p020c0.C1681g0 c1681g0 = this.f27701i;
        boolean zA = kotlin.jvm.internal.m.a(obj2, c1681g0.getValue());
        p020c0.C1677e0 c1677e0 = this.f27710s;
        p020c0.C1681g0 c1681g1 = this.f27702k;
        p163t.E0 e6 = this.f27700h;
        p163t.C2761i0 c2761i0 = this.f27712u;
        if (zA) {
            c1681g1.setValue(new p163t.o0(c2761i0, e6, obj, obj, this.f27709r.c()));
            this.f27707p = true;
            c1677e0.h(c().b());
            return;
        }
        p020c0.C1681g0 c1681g2 = this.j;
        if (!z6 || this.f27711t) {
            a2 = (p163t.A) c1681g2.getValue();
        } else if (((p163t.A) c1681g2.getValue()) instanceof p163t.C2761i0) {
            a2 = c2761i0;
            a2 = (p163t.A) c1681g2.getValue();
        }
        a2 = c2761i0;
        p163t.y0 y0Var = this.f27713v;
        p163t.InterfaceC2766l c2763j0 = a2;
        if (y0Var.e() > 0) {
            c2763j0 = new p163t.C2763j0(a2, y0Var.e());
        }
        c1681g1.setValue(new p163t.o0(c2763j0, e6, obj, c1681g0.getValue(), this.f27709r));
        c1677e0.h(c().b());
        this.f27707p = false;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        p020c0.C1681g0 c1681g3 = y0Var.f27733h;
        c1681g3.setValue(bool);
        if (y0Var.g()) {
            p121o0.n nVar = y0Var.f27734i;
            int size = nVar.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                p163t.u0 u0Var = (p163t.u0) nVar.get(i3);
                jMax = java.lang.Math.max(jMax, u0Var.f27710s.g());
                u0Var.d(0L);
            }
            c1681g3.setValue(java.lang.Boolean.FALSE);
        }
    }

    public final void g(java.lang.Object obj, java.lang.Object obj2, p163t.A a2) {
        this.f27701i.setValue(obj2);
        this.j.setValue(a2);
        if (kotlin.jvm.internal.m.a(c().f27659d, obj) && kotlin.jvm.internal.m.a(c().f27658c, obj2)) {
            return;
        }
        f(obj, false);
    }

    @Override // p020c0.e1
    public final java.lang.Object getValue() {
        return this.f27708q.getValue();
    }

    public final void h(java.lang.Object obj, p163t.A a2) {
        if (this.f27707p) {
            p163t.o0 o0Var = this.f27704m;
            if (kotlin.jvm.internal.m.a(obj, o0Var != null ? o0Var.f27658c : null)) {
                return;
            }
        }
        p020c0.C1681g0 c1681g0 = this.f27701i;
        boolean zA = kotlin.jvm.internal.m.a(c1681g0.getValue(), obj);
        p020c0.C1673c0 c1673c0 = this.f27706o;
        if (zA && c1673c0.g() == -1.0f) {
            return;
        }
        c1681g0.setValue(obj);
        this.j.setValue(a2);
        java.lang.Object value = c1673c0.g() == -3.0f ? obj : this.f27708q.getValue();
        p020c0.C1681g0 c1681g1 = this.f27705n;
        f(value, !((java.lang.Boolean) c1681g1.getValue()).booleanValue());
        c1681g1.setValue(java.lang.Boolean.valueOf(c1673c0.g() == -3.0f));
        if (c1673c0.g() >= 0.0f) {
            e(c().f((long) (c1673c0.g() * c().b())));
        } else if (c1673c0.g() == -3.0f) {
            e(obj);
        }
        this.f27707p = false;
        c1673c0.h(-1.0f);
    }

    public final java.lang.String toString() {
        return "current value: " + this.f27708q.getValue() + ", target: " + this.f27701i.getValue() + ", spec: " + ((p163t.A) this.j.getValue());
    }
}
