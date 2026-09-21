package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends p110m7.AbstractC2638k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.List f22041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p062g7.Q f22042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p062g7.Q f22044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.util.List f22046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public java.util.List f22047t;

    public static p062g7.S g() {
        p062g7.S s9 = new p062g7.S();
        s9.f22039l = 6;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        s9.f22041n = list;
        p062g7.Q q9 = p062g7.Q.f22020A;
        s9.f22042o = q9;
        s9.f22044q = q9;
        s9.f22046s = list;
        s9.f22047t = list;
        return s9;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.T tF = f();
        if (tF.isInitialized()) {
            return tF;
        }
        throw new I3.b(12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.T t9 = null;
        try {
            try {
                p062g7.T.f22049w.getClass();
                h(new p062g7.T(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                p062g7.T t10 = (p062g7.T) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    t9 = t10;
                    if (t9 != null) {
                        h(t9);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (t9 != null) {
                h(t9);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.S sG = g();
        sG.h(f());
        return sG;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        h((p062g7.T) oVar);
        return this;
    }

    public final p062g7.T f() {
        p062g7.T t9 = new p062g7.T(this);
        int i3 = this.f22038k;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        t9.f22051k = this.f22039l;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        t9.f22052l = this.f22040m;
        if ((i3 & 4) == 4) {
            this.f22041n = java.util.Collections.unmodifiableList(this.f22041n);
            this.f22038k &= -5;
        }
        t9.f22053m = this.f22041n;
        if ((i3 & 8) == 8) {
            i9 |= 4;
        }
        t9.f22054n = this.f22042o;
        if ((i3 & 16) == 16) {
            i9 |= 8;
        }
        t9.f22055o = this.f22043p;
        if ((i3 & 32) == 32) {
            i9 |= 16;
        }
        t9.f22056p = this.f22044q;
        if ((i3 & 64) == 64) {
            i9 |= 32;
        }
        t9.f22057q = this.f22045r;
        if ((this.f22038k & 128) == 128) {
            this.f22046s = java.util.Collections.unmodifiableList(this.f22046s);
            this.f22038k &= -129;
        }
        t9.f22058r = this.f22046s;
        if ((this.f22038k & 256) == 256) {
            this.f22047t = java.util.Collections.unmodifiableList(this.f22047t);
            this.f22038k &= -257;
        }
        t9.f22059s = this.f22047t;
        t9.j = i9;
        return t9;
    }

    public final void h(p062g7.T t9) {
        p062g7.Q q9;
        p062g7.Q q10;
        if (t9 == p062g7.T.f22048v) {
            return;
        }
        int i3 = t9.j;
        if ((i3 & 1) == 1) {
            int i9 = t9.f22051k;
            this.f22038k = 1 | this.f22038k;
            this.f22039l = i9;
        }
        if ((i3 & 2) == 2) {
            int i10 = t9.f22052l;
            this.f22038k = 2 | this.f22038k;
            this.f22040m = i10;
        }
        if (!t9.f22053m.isEmpty()) {
            if (this.f22041n.isEmpty()) {
                this.f22041n = t9.f22053m;
                this.f22038k &= -5;
            } else {
                if ((this.f22038k & 4) != 4) {
                    this.f22041n = new java.util.ArrayList(this.f22041n);
                    this.f22038k |= 4;
                }
                this.f22041n.addAll(t9.f22053m);
            }
        }
        if ((t9.j & 4) == 4) {
            p062g7.Q q11 = t9.f22054n;
            if ((this.f22038k & 8) != 8 || (q10 = this.f22042o) == p062g7.Q.f22020A) {
                this.f22042o = q11;
            } else {
                p062g7.P p2 = p062g7.Q.p(q10);
                p2.h(q11);
                this.f22042o = p2.f();
            }
            this.f22038k |= 8;
        }
        int i11 = t9.j;
        if ((i11 & 8) == 8) {
            int i12 = t9.f22055o;
            this.f22038k |= 16;
            this.f22043p = i12;
        }
        if ((i11 & 16) == 16) {
            p062g7.Q q12 = t9.f22056p;
            if ((this.f22038k & 32) != 32 || (q9 = this.f22044q) == p062g7.Q.f22020A) {
                this.f22044q = q12;
            } else {
                p062g7.P p9 = p062g7.Q.p(q9);
                p9.h(q12);
                this.f22044q = p9.f();
            }
            this.f22038k |= 32;
        }
        if ((t9.j & 32) == 32) {
            int i13 = t9.f22057q;
            this.f22038k |= 64;
            this.f22045r = i13;
        }
        if (!t9.f22058r.isEmpty()) {
            if (this.f22046s.isEmpty()) {
                this.f22046s = t9.f22058r;
                this.f22038k &= -129;
            } else {
                if ((this.f22038k & 128) != 128) {
                    this.f22046s = new java.util.ArrayList(this.f22046s);
                    this.f22038k |= 128;
                }
                this.f22046s.addAll(t9.f22058r);
            }
        }
        if (!t9.f22059s.isEmpty()) {
            if (this.f22047t.isEmpty()) {
                this.f22047t = t9.f22059s;
                this.f22038k &= -257;
            } else {
                if ((this.f22038k & 256) != 256) {
                    this.f22047t = new java.util.ArrayList(this.f22047t);
                    this.f22038k |= 256;
                }
                this.f22047t.addAll(t9.f22059s);
            }
        }
        e(t9);
        this.f25492h = this.f25492h.e(t9.f22050i);
    }
}
