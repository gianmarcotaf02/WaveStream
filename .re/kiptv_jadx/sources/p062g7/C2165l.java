package p062g7;

/* JADX INFO: renamed from: g7.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2165l extends p110m7.AbstractC2639l {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p062g7.C2165l f22267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p062g7.C2154a f22268q = new p062g7.C2154a(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22269i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22270k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.util.List f22271l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.util.List f22272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f22273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22274o;

    static {
        p062g7.C2165l c2165l = new p062g7.C2165l();
        f22267p = c2165l;
        c2165l.f22270k = 6;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        c2165l.f22271l = list;
        c2165l.f22272m = list;
    }

    public C2165l(p062g7.C2164k c2164k) {
        super(c2164k);
        this.f22273n = (byte) -1;
        this.f22274o = -1;
        this.f22269i = c2164k.f25492h;
    }

    @Override // p110m7.v
    public final p110m7.AbstractC2629b a() {
        return f22267p;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22274o;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.j & 1) == 1 ? Z2.M.m(1, this.f22270k) : 0;
        for (int i9 = 0; i9 < this.f22271l.size(); i9++) {
            iM += Z2.M.o(2, (p110m7.AbstractC2629b) this.f22271l.get(i9));
        }
        int iN = 0;
        for (int i10 = 0; i10 < this.f22272m.size(); i10++) {
            iN += Z2.M.n(((java.lang.Integer) this.f22272m.get(i10)).intValue());
        }
        int size = this.f22269i.size() + i() + (this.f22272m.size() * 2) + iM + iN;
        this.f22274o = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.C2164k.g();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.C2164k c2164kG = p062g7.C2164k.g();
        c2164kG.h(this);
        return c2164kG;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        p079i7.f fVar = new p079i7.f(this);
        if ((this.j & 1) == 1) {
            m8.Z(1, this.f22270k);
        }
        for (int i3 = 0; i3 < this.f22271l.size(); i3++) {
            m8.b0(2, (p110m7.AbstractC2629b) this.f22271l.get(i3));
        }
        for (int i9 = 0; i9 < this.f22272m.size(); i9++) {
            m8.Z(31, ((java.lang.Integer) this.f22272m.get(i9)).intValue());
        }
        fVar.X0(19000, m8);
        m8.e0(this.f22269i);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22273n;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        for (int i3 = 0; i3 < this.f22271l.size(); i3++) {
            if (!((p062g7.Z) this.f22271l.get(i3)).isInitialized()) {
                this.f22273n = (byte) 0;
                return false;
            }
        }
        if (h()) {
            this.f22273n = (byte) 1;
            return true;
        }
        this.f22273n = (byte) 0;
        return false;
    }

    public C2165l() {
        this.f22273n = (byte) -1;
        this.f22274o = -1;
        this.f22269i = p110m7.AbstractC2632e.f25476h;
    }

    public C2165l(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.f22273n = (byte) -1;
        this.f22274o = -1;
        this.f22270k = 6;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        this.f22271l = list;
        this.f22272m = list;
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
                            this.f22270k = c2633f.k();
                        } else if (iN == 18) {
                            if ((i3 & 2) != 2) {
                                this.f22271l = new java.util.ArrayList();
                                i3 |= 2;
                            }
                            this.f22271l.add(c2633f.g(p062g7.Z.f22100t, c2635h));
                        } else if (iN == 248) {
                            if ((i3 & 4) != 4) {
                                this.f22272m = new java.util.ArrayList();
                                i3 |= 4;
                            }
                            this.f22272m.add(java.lang.Integer.valueOf(c2633f.k()));
                        } else if (iN != 250) {
                            if (!m(c2633f, mH, c2635h, iN)) {
                            }
                        } else {
                            int iD = c2633f.d(c2633f.k());
                            if ((i3 & 4) != 4 && c2633f.b() > 0) {
                                this.f22272m = new java.util.ArrayList();
                                i3 |= 4;
                            }
                            while (c2633f.b() > 0) {
                                this.f22272m.add(java.lang.Integer.valueOf(c2633f.k()));
                            }
                            c2633f.c(iD);
                        }
                    }
                    z6 = true;
                } catch (p110m7.r e6) {
                    e6.f25503h = this;
                    throw e6;
                } catch (java.io.IOException e9) {
                    p110m7.r rVar = new p110m7.r(e9.getMessage());
                    rVar.f25503h = this;
                    throw rVar;
                }
            } catch (java.lang.Throwable th) {
                if ((i3 & 2) == 2) {
                    this.f22271l = java.util.Collections.unmodifiableList(this.f22271l);
                }
                if ((i3 & 4) == 4) {
                    this.f22272m = java.util.Collections.unmodifiableList(this.f22272m);
                }
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f22269i = c2631d.i();
                }
                l();
                throw th;
            }
        }
        if ((i3 & 2) == 2) {
            this.f22271l = java.util.Collections.unmodifiableList(this.f22271l);
        }
        if ((i3 & 4) == 4) {
            this.f22272m = java.util.Collections.unmodifiableList(this.f22272m);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22269i = c2631d.i();
        }
        l();
    }
}
