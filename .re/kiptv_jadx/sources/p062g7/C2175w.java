package p062g7;

/* JADX INFO: renamed from: g7.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2175w extends p110m7.o {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p062g7.C2175w f22322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p062g7.C2154a f22323t = new p062g7.C2154a(8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22324h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22325i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p062g7.EnumC2174v f22327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p062g7.Q f22328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.util.List f22330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.List f22331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte f22332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22333r;

    static {
        p062g7.C2175w c2175w = new p062g7.C2175w();
        f22322s = c2175w;
        c2175w.j = 0;
        c2175w.f22326k = 0;
        c2175w.f22327l = p062g7.EnumC2174v.TRUE;
        c2175w.f22328m = p062g7.Q.f22020A;
        c2175w.f22329n = 0;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        c2175w.f22330o = list;
        c2175w.f22331p = list;
    }

    public C2175w() {
        this.f22332q = (byte) -1;
        this.f22333r = -1;
        this.f22324h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22333r;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f22325i & 1) == 1 ? Z2.M.m(1, this.j) : 0;
        if ((this.f22325i & 2) == 2) {
            iM += Z2.M.m(2, this.f22326k);
        }
        if ((this.f22325i & 4) == 4) {
            iM += Z2.M.l(3, this.f22327l.f22321h);
        }
        if ((this.f22325i & 8) == 8) {
            iM += Z2.M.o(4, this.f22328m);
        }
        if ((this.f22325i & 16) == 16) {
            iM += Z2.M.m(5, this.f22329n);
        }
        for (int i9 = 0; i9 < this.f22330o.size(); i9++) {
            iM += Z2.M.o(6, (p110m7.AbstractC2629b) this.f22330o.get(i9));
        }
        for (int i10 = 0; i10 < this.f22331p.size(); i10++) {
            iM += Z2.M.o(7, (p110m7.AbstractC2629b) this.f22331p.get(i10));
        }
        int size = this.f22324h.size() + iM;
        this.f22333r = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.C2173u.f();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.C2173u c2173uF = p062g7.C2173u.f();
        c2173uF.g(this);
        return c2173uF;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        if ((this.f22325i & 1) == 1) {
            m8.Z(1, this.j);
        }
        if ((this.f22325i & 2) == 2) {
            m8.Z(2, this.f22326k);
        }
        if ((this.f22325i & 4) == 4) {
            m8.Y(3, this.f22327l.f22321h);
        }
        if ((this.f22325i & 8) == 8) {
            m8.b0(4, this.f22328m);
        }
        if ((this.f22325i & 16) == 16) {
            m8.Z(5, this.f22329n);
        }
        for (int i3 = 0; i3 < this.f22330o.size(); i3++) {
            m8.b0(6, (p110m7.AbstractC2629b) this.f22330o.get(i3));
        }
        for (int i9 = 0; i9 < this.f22331p.size(); i9++) {
            m8.b0(7, (p110m7.AbstractC2629b) this.f22331p.get(i9));
        }
        m8.e0(this.f22324h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22332q;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        if ((this.f22325i & 8) == 8 && !this.f22328m.isInitialized()) {
            this.f22332q = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f22330o.size(); i3++) {
            if (!((p062g7.C2175w) this.f22330o.get(i3)).isInitialized()) {
                this.f22332q = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.f22331p.size(); i9++) {
            if (!((p062g7.C2175w) this.f22331p.get(i9)).isInitialized()) {
                this.f22332q = (byte) 0;
                return false;
            }
        }
        this.f22332q = (byte) 1;
        return true;
    }

    public C2175w(p062g7.C2173u c2173u) {
        this.f22332q = (byte) -1;
        this.f22333r = -1;
        this.f22324h = c2173u.f25492h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2175w(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        p062g7.EnumC2174v enumC2174v;
        this.f22332q = (byte) -1;
        this.f22333r = -1;
        boolean z6 = false;
        this.j = 0;
        this.f22326k = 0;
        p062g7.EnumC2174v enumC2174v2 = p062g7.EnumC2174v.TRUE;
        this.f22327l = enumC2174v2;
        this.f22328m = p062g7.Q.f22020A;
        this.f22329n = 0;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        this.f22330o = list;
        this.f22331p = list;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        int i3 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f22325i |= 1;
                                this.j = c2633f.k();
                            } else if (iN != 16) {
                                java.lang.Object objP = null;
                                if (iN == 24) {
                                    int iK = c2633f.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            objP = p062g7.EnumC2174v.FALSE;
                                        } else if (iK == 2) {
                                            objP = p062g7.EnumC2174v.NULL;
                                        }
                                        enumC2174v = objP;
                                    } else {
                                        enumC2174v = enumC2174v2;
                                    }
                                    if (enumC2174v == 0) {
                                        mH.i0(iN);
                                        mH.i0(iK);
                                    } else {
                                        this.f22325i |= 4;
                                        this.f22327l = enumC2174v;
                                    }
                                } else if (iN == 34) {
                                    if ((this.f22325i & 8) == 8) {
                                        p062g7.Q q9 = this.f22328m;
                                        q9.getClass();
                                        objP = p062g7.Q.p(q9);
                                    }
                                    p062g7.P p2 = objP;
                                    p062g7.Q q10 = (p062g7.Q) c2633f.g(p062g7.Q.f22021B, c2635h);
                                    this.f22328m = q10;
                                    if (p2 != 0) {
                                        p2.h(q10);
                                        this.f22328m = p2.f();
                                    }
                                    this.f22325i |= 8;
                                } else if (iN != 40) {
                                    p062g7.C2154a c2154a = f22323t;
                                    if (iN == 50) {
                                        if ((i3 & 32) != 32) {
                                            this.f22330o = new java.util.ArrayList();
                                            i3 |= 32;
                                        }
                                        this.f22330o.add(c2633f.g(c2154a, c2635h));
                                    } else if (iN != 58) {
                                        if (!c2633f.q(iN, mH)) {
                                        }
                                    } else {
                                        if ((i3 & 64) != 64) {
                                            this.f22331p = new java.util.ArrayList();
                                            i3 |= 64;
                                        }
                                        this.f22331p.add(c2633f.g(c2154a, c2635h));
                                    }
                                } else {
                                    this.f22325i |= 16;
                                    this.f22329n = c2633f.k();
                                }
                            } else {
                                this.f22325i |= 2;
                                this.f22326k = c2633f.k();
                            }
                        }
                        z6 = true;
                    } catch (p110m7.r e6) {
                        e6.f25503h = this;
                        throw e6;
                    }
                } catch (java.io.IOException e9) {
                    p110m7.r rVar = new p110m7.r(e9.getMessage());
                    rVar.f25503h = this;
                    throw rVar;
                }
            } catch (java.lang.Throwable th) {
                if ((i3 & 32) == 32) {
                    this.f22330o = java.util.Collections.unmodifiableList(this.f22330o);
                }
                if ((i3 & 64) == 64) {
                    this.f22331p = java.util.Collections.unmodifiableList(this.f22331p);
                }
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f22324h = c2631d.i();
                }
                throw th;
            }
        }
        if ((i3 & 32) == 32) {
            this.f22330o = java.util.Collections.unmodifiableList(this.f22330o);
        }
        if ((i3 & 64) == 64) {
            this.f22331p = java.util.Collections.unmodifiableList(this.f22331p);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22324h = c2631d.i();
        }
    }
}
