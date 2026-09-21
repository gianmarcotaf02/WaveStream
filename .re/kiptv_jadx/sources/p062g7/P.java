package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class P extends p110m7.AbstractC2638k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.List f22007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22008m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22009n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p062g7.Q f22010o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22011p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22012q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22013r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22014s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22015t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p062g7.Q f22016u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22017v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p062g7.Q f22018w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22019x;
    public int y;

    public static p062g7.P g() {
        p062g7.P p2 = new p062g7.P();
        p2.f22007l = java.util.Collections.EMPTY_LIST;
        p062g7.Q q9 = p062g7.Q.f22020A;
        p2.f22010o = q9;
        p2.f22016u = q9;
        p2.f22018w = q9;
        return p2;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.Q qF = f();
        if (qF.isInitialized()) {
            return qF;
        }
        throw new I3.b(12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.Q q9 = null;
        try {
            try {
                p062g7.Q.f22021B.getClass();
                h(new p062g7.Q(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                p062g7.Q q10 = (p062g7.Q) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    q9 = q10;
                    if (q9 != null) {
                        h(q9);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (q9 != null) {
                h(q9);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.P pG = g();
        pG.h(f());
        return pG;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        h((p062g7.Q) oVar);
        return this;
    }

    public final p062g7.Q f() {
        p062g7.Q q9 = new p062g7.Q(this);
        int i3 = this.f22006k;
        if ((i3 & 1) == 1) {
            this.f22007l = java.util.Collections.unmodifiableList(this.f22007l);
            this.f22006k &= -2;
        }
        q9.f22023k = this.f22007l;
        int i9 = (i3 & 2) != 2 ? 0 : 1;
        q9.f22024l = this.f22008m;
        if ((i3 & 4) == 4) {
            i9 |= 2;
        }
        q9.f22025m = this.f22009n;
        if ((i3 & 8) == 8) {
            i9 |= 4;
        }
        q9.f22026n = this.f22010o;
        if ((i3 & 16) == 16) {
            i9 |= 8;
        }
        q9.f22027o = this.f22011p;
        if ((i3 & 32) == 32) {
            i9 |= 16;
        }
        q9.f22028p = this.f22012q;
        if ((i3 & 64) == 64) {
            i9 |= 32;
        }
        q9.f22029q = this.f22013r;
        if ((i3 & 128) == 128) {
            i9 |= 64;
        }
        q9.f22030r = this.f22014s;
        if ((i3 & 256) == 256) {
            i9 |= 128;
        }
        q9.f22031s = this.f22015t;
        if ((i3 & 512) == 512) {
            i9 |= 256;
        }
        q9.f22032t = this.f22016u;
        if ((i3 & 1024) == 1024) {
            i9 |= 512;
        }
        q9.f22033u = this.f22017v;
        if ((i3 & 2048) == 2048) {
            i9 |= 1024;
        }
        q9.f22034v = this.f22018w;
        if ((i3 & 4096) == 4096) {
            i9 |= 2048;
        }
        q9.f22035w = this.f22019x;
        if ((i3 & 8192) == 8192) {
            i9 |= 4096;
        }
        q9.f22036x = this.y;
        q9.j = i9;
        return q9;
    }

    public final p062g7.P h(p062g7.Q q9) {
        p062g7.Q q10;
        p062g7.Q q11;
        p062g7.Q q12;
        p062g7.Q q13 = p062g7.Q.f22020A;
        if (q9 == q13) {
            return this;
        }
        if (!q9.f22023k.isEmpty()) {
            if (this.f22007l.isEmpty()) {
                this.f22007l = q9.f22023k;
                this.f22006k &= -2;
            } else {
                if ((this.f22006k & 1) != 1) {
                    this.f22007l = new java.util.ArrayList(this.f22007l);
                    this.f22006k |= 1;
                }
                this.f22007l.addAll(q9.f22023k);
            }
        }
        int i3 = q9.j;
        if ((i3 & 1) == 1) {
            boolean z6 = q9.f22024l;
            this.f22006k |= 2;
            this.f22008m = z6;
        }
        if ((i3 & 2) == 2) {
            int i9 = q9.f22025m;
            this.f22006k |= 4;
            this.f22009n = i9;
        }
        if ((i3 & 4) == 4) {
            p062g7.Q q14 = q9.f22026n;
            if ((this.f22006k & 8) != 8 || (q12 = this.f22010o) == q13) {
                this.f22010o = q14;
            } else {
                p062g7.P p2 = p062g7.Q.p(q12);
                p2.h(q14);
                this.f22010o = p2.f();
            }
            this.f22006k |= 8;
        }
        int i10 = q9.j;
        if ((i10 & 8) == 8) {
            int i11 = q9.f22027o;
            this.f22006k |= 16;
            this.f22011p = i11;
        }
        if ((i10 & 16) == 16) {
            int i12 = q9.f22028p;
            this.f22006k |= 32;
            this.f22012q = i12;
        }
        if ((i10 & 32) == 32) {
            int i13 = q9.f22029q;
            this.f22006k |= 64;
            this.f22013r = i13;
        }
        if ((i10 & 64) == 64) {
            int i14 = q9.f22030r;
            this.f22006k |= 128;
            this.f22014s = i14;
        }
        if ((i10 & 128) == 128) {
            int i15 = q9.f22031s;
            this.f22006k |= 256;
            this.f22015t = i15;
        }
        if ((i10 & 256) == 256) {
            p062g7.Q q15 = q9.f22032t;
            if ((this.f22006k & 512) != 512 || (q11 = this.f22016u) == q13) {
                this.f22016u = q15;
            } else {
                p062g7.P p9 = p062g7.Q.p(q11);
                p9.h(q15);
                this.f22016u = p9.f();
            }
            this.f22006k |= 512;
        }
        int i16 = q9.j;
        if ((i16 & 512) == 512) {
            int i17 = q9.f22033u;
            this.f22006k |= 1024;
            this.f22017v = i17;
        }
        if ((i16 & 1024) == 1024) {
            p062g7.Q q16 = q9.f22034v;
            if ((this.f22006k & 2048) != 2048 || (q10 = this.f22018w) == q13) {
                this.f22018w = q16;
            } else {
                p062g7.P p10 = p062g7.Q.p(q10);
                p10.h(q16);
                this.f22018w = p10.f();
            }
            this.f22006k |= 2048;
        }
        int i18 = q9.j;
        if ((i18 & 2048) == 2048) {
            int i19 = q9.f22035w;
            this.f22006k |= 4096;
            this.f22019x = i19;
        }
        if ((i18 & 4096) == 4096) {
            int i20 = q9.f22036x;
            this.f22006k |= 8192;
            this.y = i20;
        }
        e(q9);
        this.f25492h = this.f25492h.e(q9.f22022i);
        return this;
    }
}
