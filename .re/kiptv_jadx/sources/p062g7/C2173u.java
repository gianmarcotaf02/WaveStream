package p062g7;

/* JADX INFO: renamed from: g7.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2173u extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22311i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p062g7.EnumC2174v f22313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p062g7.Q f22314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.util.List f22316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.List f22317p;

    public static p062g7.C2173u f() {
        p062g7.C2173u c2173u = new p062g7.C2173u();
        c2173u.f22313l = p062g7.EnumC2174v.TRUE;
        c2173u.f22314m = p062g7.Q.f22020A;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        c2173u.f22316o = list;
        c2173u.f22317p = list;
        return c2173u;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.C2175w c2175wE = e();
        if (c2175wE.isInitialized()) {
            return c2175wE;
        }
        throw new I3.b(12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.C2175w c2175w = null;
        try {
            try {
                p062g7.C2175w.f22323t.getClass();
                g(new p062g7.C2175w(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                p062g7.C2175w c2175w2 = (p062g7.C2175w) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    c2175w = c2175w2;
                    if (c2175w != null) {
                        g(c2175w);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (c2175w != null) {
                g(c2175w);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.C2173u c2173uF = f();
        c2173uF.g(e());
        return c2173uF;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        g((p062g7.C2175w) oVar);
        return this;
    }

    public final p062g7.C2175w e() {
        p062g7.C2175w c2175w = new p062g7.C2175w(this);
        int i3 = this.f22311i;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        c2175w.j = this.j;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        c2175w.f22326k = this.f22312k;
        if ((i3 & 4) == 4) {
            i9 |= 4;
        }
        c2175w.f22327l = this.f22313l;
        if ((i3 & 8) == 8) {
            i9 |= 8;
        }
        c2175w.f22328m = this.f22314m;
        if ((i3 & 16) == 16) {
            i9 |= 16;
        }
        c2175w.f22329n = this.f22315n;
        if ((i3 & 32) == 32) {
            this.f22316o = java.util.Collections.unmodifiableList(this.f22316o);
            this.f22311i &= -33;
        }
        c2175w.f22330o = this.f22316o;
        if ((this.f22311i & 64) == 64) {
            this.f22317p = java.util.Collections.unmodifiableList(this.f22317p);
            this.f22311i &= -65;
        }
        c2175w.f22331p = this.f22317p;
        c2175w.f22325i = i9;
        return c2175w;
    }

    public final void g(p062g7.C2175w c2175w) {
        p062g7.Q q9;
        if (c2175w == p062g7.C2175w.f22322s) {
            return;
        }
        int i3 = c2175w.f22325i;
        if ((i3 & 1) == 1) {
            int i9 = c2175w.j;
            this.f22311i = 1 | this.f22311i;
            this.j = i9;
        }
        if ((i3 & 2) == 2) {
            int i10 = c2175w.f22326k;
            this.f22311i = 2 | this.f22311i;
            this.f22312k = i10;
        }
        if ((i3 & 4) == 4) {
            p062g7.EnumC2174v enumC2174v = c2175w.f22327l;
            enumC2174v.getClass();
            this.f22311i = 4 | this.f22311i;
            this.f22313l = enumC2174v;
        }
        if ((c2175w.f22325i & 8) == 8) {
            p062g7.Q q10 = c2175w.f22328m;
            if ((this.f22311i & 8) != 8 || (q9 = this.f22314m) == p062g7.Q.f22020A) {
                this.f22314m = q10;
            } else {
                p062g7.P p2 = p062g7.Q.p(q9);
                p2.h(q10);
                this.f22314m = p2.f();
            }
            this.f22311i |= 8;
        }
        if ((c2175w.f22325i & 16) == 16) {
            int i11 = c2175w.f22329n;
            this.f22311i = 16 | this.f22311i;
            this.f22315n = i11;
        }
        if (!c2175w.f22330o.isEmpty()) {
            if (this.f22316o.isEmpty()) {
                this.f22316o = c2175w.f22330o;
                this.f22311i &= -33;
            } else {
                if ((this.f22311i & 32) != 32) {
                    this.f22316o = new java.util.ArrayList(this.f22316o);
                    this.f22311i |= 32;
                }
                this.f22316o.addAll(c2175w.f22330o);
            }
        }
        if (!c2175w.f22331p.isEmpty()) {
            if (this.f22317p.isEmpty()) {
                this.f22317p = c2175w.f22331p;
                this.f22311i &= -65;
            } else {
                if ((this.f22311i & 64) != 64) {
                    this.f22317p = new java.util.ArrayList(this.f22317p);
                    this.f22311i |= 64;
                }
                this.f22317p.addAll(c2175w.f22331p);
            }
        }
        this.f25492h = this.f25492h.e(c2175w.f22324h);
    }
}
