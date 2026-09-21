package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class T extends p110m7.AbstractC2639l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p062g7.T f22048v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p062g7.C2154a f22049w = new p062g7.C2154a(18);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22050i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.util.List f22053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p062g7.Q f22054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p062g7.Q f22056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.util.List f22058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.util.List f22059s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f22060t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f22061u;

    static {
        p062g7.T t9 = new p062g7.T();
        f22048v = t9;
        t9.f22051k = 6;
        t9.f22052l = 0;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        t9.f22053m = list;
        p062g7.Q q9 = p062g7.Q.f22020A;
        t9.f22054n = q9;
        t9.f22055o = 0;
        t9.f22056p = q9;
        t9.f22057q = 0;
        t9.f22058r = list;
        t9.f22059s = list;
    }

    public T(p062g7.S s9) {
        super(s9);
        this.f22060t = (byte) -1;
        this.f22061u = -1;
        this.f22050i = s9.f25492h;
    }

    @Override // p110m7.v
    public final p110m7.AbstractC2629b a() {
        return f22048v;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22061u;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.j & 1) == 1 ? Z2.M.m(1, this.f22051k) : 0;
        if ((this.j & 2) == 2) {
            iM += Z2.M.m(2, this.f22052l);
        }
        for (int i9 = 0; i9 < this.f22053m.size(); i9++) {
            iM += Z2.M.o(3, (p110m7.AbstractC2629b) this.f22053m.get(i9));
        }
        if ((this.j & 4) == 4) {
            iM += Z2.M.o(4, this.f22054n);
        }
        if ((this.j & 8) == 8) {
            iM += Z2.M.m(5, this.f22055o);
        }
        if ((this.j & 16) == 16) {
            iM += Z2.M.o(6, this.f22056p);
        }
        if ((this.j & 32) == 32) {
            iM += Z2.M.m(7, this.f22057q);
        }
        for (int i10 = 0; i10 < this.f22058r.size(); i10++) {
            iM += Z2.M.o(8, (p110m7.AbstractC2629b) this.f22058r.get(i10));
        }
        int iN = 0;
        for (int i11 = 0; i11 < this.f22059s.size(); i11++) {
            iN += Z2.M.n(((java.lang.Integer) this.f22059s.get(i11)).intValue());
        }
        int size = this.f22050i.size() + i() + (this.f22059s.size() * 2) + iM + iN;
        this.f22061u = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.S.g();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.S sG = p062g7.S.g();
        sG.h(this);
        return sG;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        p079i7.f fVar = new p079i7.f(this);
        if ((this.j & 1) == 1) {
            m8.Z(1, this.f22051k);
        }
        if ((this.j & 2) == 2) {
            m8.Z(2, this.f22052l);
        }
        for (int i3 = 0; i3 < this.f22053m.size(); i3++) {
            m8.b0(3, (p110m7.AbstractC2629b) this.f22053m.get(i3));
        }
        if ((this.j & 4) == 4) {
            m8.b0(4, this.f22054n);
        }
        if ((this.j & 8) == 8) {
            m8.Z(5, this.f22055o);
        }
        if ((this.j & 16) == 16) {
            m8.b0(6, this.f22056p);
        }
        if ((this.j & 32) == 32) {
            m8.Z(7, this.f22057q);
        }
        for (int i9 = 0; i9 < this.f22058r.size(); i9++) {
            m8.b0(8, (p110m7.AbstractC2629b) this.f22058r.get(i9));
        }
        for (int i10 = 0; i10 < this.f22059s.size(); i10++) {
            m8.Z(31, ((java.lang.Integer) this.f22059s.get(i10)).intValue());
        }
        fVar.X0(200, m8);
        m8.e0(this.f22050i);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22060t;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        if ((this.j & 2) != 2) {
            this.f22060t = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f22053m.size(); i3++) {
            if (!((p062g7.W) this.f22053m.get(i3)).isInitialized()) {
                this.f22060t = (byte) 0;
                return false;
            }
        }
        if ((this.j & 4) == 4 && !this.f22054n.isInitialized()) {
            this.f22060t = (byte) 0;
            return false;
        }
        if ((this.j & 16) == 16 && !this.f22056p.isInitialized()) {
            this.f22060t = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.f22058r.size(); i9++) {
            if (!((p062g7.C2160g) this.f22058r.get(i9)).isInitialized()) {
                this.f22060t = (byte) 0;
                return false;
            }
        }
        if (h()) {
            this.f22060t = (byte) 1;
            return true;
        }
        this.f22060t = (byte) 0;
        return false;
    }

    public T() {
        this.f22060t = (byte) -1;
        this.f22061u = -1;
        this.f22050i = p110m7.AbstractC2632e.f25476h;
    }

    public T(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.f22060t = (byte) -1;
        this.f22061u = -1;
        this.f22051k = 6;
        boolean z6 = false;
        this.f22052l = 0;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        this.f22053m = list;
        p062g7.Q q9 = p062g7.Q.f22020A;
        this.f22054n = q9;
        this.f22055o = 0;
        this.f22056p = q9;
        this.f22057q = 0;
        this.f22058r = list;
        this.f22059s = list;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        int i3 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        p062g7.P p2 = null;
                        switch (iN) {
                            case 0:
                                break;
                            case 8:
                                this.j |= 1;
                                this.f22051k = c2633f.k();
                                continue;
                            case 16:
                                this.j |= 2;
                                this.f22052l = c2633f.k();
                                continue;
                            case 26:
                                if ((i3 & 4) != 4) {
                                    this.f22053m = new java.util.ArrayList();
                                    i3 |= 4;
                                }
                                this.f22053m.add(c2633f.g(p062g7.W.f22074u, c2635h));
                                continue;
                            case 34:
                                if ((this.j & 4) == 4) {
                                    p062g7.Q q10 = this.f22054n;
                                    q10.getClass();
                                    p2 = p062g7.Q.p(q10);
                                }
                                p062g7.Q q11 = (p062g7.Q) c2633f.g(p062g7.Q.f22021B, c2635h);
                                this.f22054n = q11;
                                if (p2 != null) {
                                    p2.h(q11);
                                    this.f22054n = p2.f();
                                }
                                this.j |= 4;
                                continue;
                            case 40:
                                this.j |= 8;
                                this.f22055o = c2633f.k();
                                continue;
                            case 50:
                                if ((this.j & 16) == 16) {
                                    p062g7.Q q12 = this.f22056p;
                                    q12.getClass();
                                    p2 = p062g7.Q.p(q12);
                                }
                                p062g7.Q q13 = (p062g7.Q) c2633f.g(p062g7.Q.f22021B, c2635h);
                                this.f22056p = q13;
                                if (p2 != null) {
                                    p2.h(q13);
                                    this.f22056p = p2.f();
                                }
                                this.j |= 16;
                                continue;
                            case 56:
                                this.j |= 32;
                                this.f22057q = c2633f.k();
                                continue;
                            case 66:
                                if ((i3 & 128) != 128) {
                                    this.f22058r = new java.util.ArrayList();
                                    i3 |= 128;
                                }
                                this.f22058r.add(c2633f.g(p062g7.C2160g.f22195o, c2635h));
                                continue;
                            case 248:
                                if ((i3 & 256) != 256) {
                                    this.f22059s = new java.util.ArrayList();
                                    i3 |= 256;
                                }
                                this.f22059s.add(java.lang.Integer.valueOf(c2633f.k()));
                                continue;
                            case 250:
                                int iD = c2633f.d(c2633f.k());
                                if ((i3 & 256) != 256 && c2633f.b() > 0) {
                                    this.f22059s = new java.util.ArrayList();
                                    i3 |= 256;
                                }
                                while (c2633f.b() > 0) {
                                    this.f22059s.add(java.lang.Integer.valueOf(c2633f.k()));
                                }
                                c2633f.c(iD);
                                continue;
                            default:
                                if (!m(c2633f, mH, c2635h, iN)) {
                                    break;
                                }
                                break;
                        }
                        z6 = true;
                    } catch (java.io.IOException e6) {
                        p110m7.r rVar = new p110m7.r(e6.getMessage());
                        rVar.f25503h = this;
                        throw rVar;
                    }
                } catch (p110m7.r e9) {
                    e9.f25503h = this;
                    throw e9;
                }
            } catch (java.lang.Throwable th) {
                if ((i3 & 4) == 4) {
                    this.f22053m = java.util.Collections.unmodifiableList(this.f22053m);
                }
                if ((i3 & 128) == 128) {
                    this.f22058r = java.util.Collections.unmodifiableList(this.f22058r);
                }
                if ((i3 & 256) == 256) {
                    this.f22059s = java.util.Collections.unmodifiableList(this.f22059s);
                }
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f22050i = c2631d.i();
                }
                l();
                throw th;
            }
        }
        if ((i3 & 4) == 4) {
            this.f22053m = java.util.Collections.unmodifiableList(this.f22053m);
        }
        if ((i3 & 128) == 128) {
            this.f22058r = java.util.Collections.unmodifiableList(this.f22058r);
        }
        if ((i3 & 256) == 256) {
            this.f22059s = java.util.Collections.unmodifiableList(this.f22059s);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22050i = c2631d.i();
        }
        l();
    }
}
