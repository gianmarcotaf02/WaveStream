package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends p110m7.AbstractC2639l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p062g7.W f22073t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p062g7.C2154a f22074u = new p062g7.C2154a(19);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22075i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22077l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22078m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p062g7.V f22079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.util.List f22080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.List f22081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f22083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22084s;

    static {
        p062g7.W w6 = new p062g7.W();
        f22073t = w6;
        w6.f22076k = 0;
        w6.f22077l = 0;
        w6.f22078m = false;
        w6.f22079n = p062g7.V.INV;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        w6.f22080o = list;
        w6.f22081p = list;
    }

    public W(p062g7.U u6) {
        super(u6);
        this.f22082q = -1;
        this.f22083r = (byte) -1;
        this.f22084s = -1;
        this.f22075i = u6.f25492h;
    }

    @Override // p110m7.v
    public final p110m7.AbstractC2629b a() {
        return f22073t;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22084s;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.j & 1) == 1 ? Z2.M.m(1, this.f22076k) : 0;
        if ((this.j & 2) == 2) {
            iM += Z2.M.m(2, this.f22077l);
        }
        if ((this.j & 4) == 4) {
            iM += Z2.M.s(3) + 1;
        }
        if ((this.j & 8) == 8) {
            iM += Z2.M.l(4, this.f22079n.f22072h);
        }
        for (int i9 = 0; i9 < this.f22080o.size(); i9++) {
            iM += Z2.M.o(5, (p110m7.AbstractC2629b) this.f22080o.get(i9));
        }
        int iN = 0;
        for (int i10 = 0; i10 < this.f22081p.size(); i10++) {
            iN += Z2.M.n(((java.lang.Integer) this.f22081p.get(i10)).intValue());
        }
        int iN2 = iM + iN;
        if (!this.f22081p.isEmpty()) {
            iN2 = iN2 + 1 + Z2.M.n(iN);
        }
        this.f22082q = iN;
        int size = this.f22075i.size() + i() + iN2;
        this.f22084s = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.U.g();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.U uG = p062g7.U.g();
        uG.h(this);
        return uG;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        p079i7.f fVar = new p079i7.f(this);
        if ((this.j & 1) == 1) {
            m8.Z(1, this.f22076k);
        }
        if ((this.j & 2) == 2) {
            m8.Z(2, this.f22077l);
        }
        if ((this.j & 4) == 4) {
            boolean z6 = this.f22078m;
            m8.k0(3, 0);
            m8.d0(z6 ? 1 : 0);
        }
        if ((this.j & 8) == 8) {
            m8.Y(4, this.f22079n.f22072h);
        }
        for (int i3 = 0; i3 < this.f22080o.size(); i3++) {
            m8.b0(5, (p110m7.AbstractC2629b) this.f22080o.get(i3));
        }
        if (this.f22081p.size() > 0) {
            m8.i0(50);
            m8.i0(this.f22082q);
        }
        for (int i9 = 0; i9 < this.f22081p.size(); i9++) {
            m8.a0(((java.lang.Integer) this.f22081p.get(i9)).intValue());
        }
        fVar.X0(1000, m8);
        m8.e0(this.f22075i);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22083r;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        int i3 = this.j;
        if ((i3 & 1) != 1) {
            this.f22083r = (byte) 0;
            return false;
        }
        if ((i3 & 2) != 2) {
            this.f22083r = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.f22080o.size(); i9++) {
            if (!((p062g7.Q) this.f22080o.get(i9)).isInitialized()) {
                this.f22083r = (byte) 0;
                return false;
            }
        }
        if (h()) {
            this.f22083r = (byte) 1;
            return true;
        }
        this.f22083r = (byte) 0;
        return false;
    }

    public W() {
        this.f22082q = -1;
        this.f22083r = (byte) -1;
        this.f22084s = -1;
        this.f22075i = p110m7.AbstractC2632e.f25476h;
    }

    public W(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        p062g7.V v6;
        this.f22082q = -1;
        this.f22083r = (byte) -1;
        this.f22084s = -1;
        this.f22076k = 0;
        this.f22077l = 0;
        this.f22078m = false;
        p062g7.V v9 = p062g7.V.INV;
        this.f22079n = v9;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        this.f22080o = list;
        this.f22081p = list;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        boolean z6 = false;
        int i3 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.j |= 1;
                            this.f22076k = c2633f.k();
                        } else if (iN == 16) {
                            this.j |= 2;
                            this.f22077l = c2633f.k();
                        } else if (iN == 24) {
                            this.j |= 4;
                            this.f22078m = c2633f.l() != 0;
                        } else if (iN == 32) {
                            int iK = c2633f.k();
                            if (iK == 0) {
                                v6 = p062g7.V.IN;
                            } else if (iK != 1) {
                                v6 = iK != 2 ? null : v9;
                            } else {
                                v6 = p062g7.V.OUT;
                            }
                            if (v6 == null) {
                                mH.i0(iN);
                                mH.i0(iK);
                            } else {
                                this.j |= 8;
                                this.f22079n = v6;
                            }
                        } else if (iN == 42) {
                            if ((i3 & 16) != 16) {
                                this.f22080o = new java.util.ArrayList();
                                i3 |= 16;
                            }
                            this.f22080o.add(c2633f.g(p062g7.Q.f22021B, c2635h));
                        } else if (iN == 48) {
                            if ((i3 & 32) != 32) {
                                this.f22081p = new java.util.ArrayList();
                                i3 |= 32;
                            }
                            this.f22081p.add(java.lang.Integer.valueOf(c2633f.k()));
                        } else if (iN != 50) {
                            if (!m(c2633f, mH, c2635h, iN)) {
                            }
                        } else {
                            int iD = c2633f.d(c2633f.k());
                            if ((i3 & 32) != 32 && c2633f.b() > 0) {
                                this.f22081p = new java.util.ArrayList();
                                i3 |= 32;
                            }
                            while (c2633f.b() > 0) {
                                this.f22081p.add(java.lang.Integer.valueOf(c2633f.k()));
                            }
                            c2633f.c(iD);
                        }
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    if ((i3 & 16) == 16) {
                        this.f22080o = java.util.Collections.unmodifiableList(this.f22080o);
                    }
                    if ((i3 & 32) == 32) {
                        this.f22081p = java.util.Collections.unmodifiableList(this.f22081p);
                    }
                    try {
                        mH.y();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f22075i = c2631d.i();
                    }
                    l();
                    throw th;
                }
            } catch (p110m7.r e6) {
                e6.f25503h = this;
                throw e6;
            } catch (java.io.IOException e9) {
                p110m7.r rVar = new p110m7.r(e9.getMessage());
                rVar.f25503h = this;
                throw rVar;
            }
        }
        if ((i3 & 16) == 16) {
            this.f22080o = java.util.Collections.unmodifiableList(this.f22080o);
        }
        if ((i3 & 32) == 32) {
            this.f22081p = java.util.Collections.unmodifiableList(this.f22081p);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22075i = c2631d.i();
        }
        l();
    }
}
