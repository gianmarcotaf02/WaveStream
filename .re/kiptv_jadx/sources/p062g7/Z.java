package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class Z extends p110m7.AbstractC2639l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p062g7.Z f22099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p062g7.C2154a f22100t = new p062g7.C2154a(21);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22101i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p062g7.Q f22104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p062g7.Q f22106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte f22108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22109r;

    static {
        p062g7.Z z6 = new p062g7.Z();
        f22099s = z6;
        z6.f22102k = 0;
        z6.f22103l = 0;
        p062g7.Q q9 = p062g7.Q.f22020A;
        z6.f22104m = q9;
        z6.f22105n = 0;
        z6.f22106o = q9;
        z6.f22107p = 0;
    }

    public Z(p062g7.Y y) {
        super(y);
        this.f22108q = (byte) -1;
        this.f22109r = -1;
        this.f22101i = y.f25492h;
    }

    @Override // p110m7.v
    public final p110m7.AbstractC2629b a() {
        return f22099s;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22109r;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.j & 1) == 1 ? Z2.M.m(1, this.f22102k) : 0;
        if ((this.j & 2) == 2) {
            iM += Z2.M.m(2, this.f22103l);
        }
        if ((this.j & 4) == 4) {
            iM += Z2.M.o(3, this.f22104m);
        }
        if ((this.j & 16) == 16) {
            iM += Z2.M.o(4, this.f22106o);
        }
        if ((this.j & 8) == 8) {
            iM += Z2.M.m(5, this.f22105n);
        }
        if ((this.j & 32) == 32) {
            iM += Z2.M.m(6, this.f22107p);
        }
        int size = this.f22101i.size() + i() + iM;
        this.f22109r = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        p062g7.Y y = new p062g7.Y();
        p062g7.Q q9 = p062g7.Q.f22020A;
        y.f22095n = q9;
        y.f22097p = q9;
        return y;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.Y y = new p062g7.Y();
        p062g7.Q q9 = p062g7.Q.f22020A;
        y.f22095n = q9;
        y.f22097p = q9;
        y.g(this);
        return y;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        p079i7.f fVar = new p079i7.f(this);
        if ((this.j & 1) == 1) {
            m8.Z(1, this.f22102k);
        }
        if ((this.j & 2) == 2) {
            m8.Z(2, this.f22103l);
        }
        if ((this.j & 4) == 4) {
            m8.b0(3, this.f22104m);
        }
        if ((this.j & 16) == 16) {
            m8.b0(4, this.f22106o);
        }
        if ((this.j & 8) == 8) {
            m8.Z(5, this.f22105n);
        }
        if ((this.j & 32) == 32) {
            m8.Z(6, this.f22107p);
        }
        fVar.X0(200, m8);
        m8.e0(this.f22101i);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22108q;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        int i3 = this.j;
        if ((i3 & 2) != 2) {
            this.f22108q = (byte) 0;
            return false;
        }
        if ((i3 & 4) == 4 && !this.f22104m.isInitialized()) {
            this.f22108q = (byte) 0;
            return false;
        }
        if ((this.j & 16) == 16 && !this.f22106o.isInitialized()) {
            this.f22108q = (byte) 0;
            return false;
        }
        if (h()) {
            this.f22108q = (byte) 1;
            return true;
        }
        this.f22108q = (byte) 0;
        return false;
    }

    public Z() {
        this.f22108q = (byte) -1;
        this.f22109r = -1;
        this.f22101i = p110m7.AbstractC2632e.f25476h;
    }

    public Z(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.f22108q = (byte) -1;
        this.f22109r = -1;
        boolean z6 = false;
        this.f22102k = 0;
        this.f22103l = 0;
        p062g7.Q q9 = p062g7.Q.f22020A;
        this.f22104m = q9;
        this.f22105n = 0;
        this.f22106o = q9;
        this.f22107p = 0;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.j |= 1;
                                this.f22102k = c2633f.k();
                            } else if (iN != 16) {
                                p062g7.P p2 = null;
                                if (iN == 26) {
                                    if ((this.j & 4) == 4) {
                                        p062g7.Q q10 = this.f22104m;
                                        q10.getClass();
                                        p2 = p062g7.Q.p(q10);
                                    }
                                    p062g7.Q q11 = (p062g7.Q) c2633f.g(p062g7.Q.f22021B, c2635h);
                                    this.f22104m = q11;
                                    if (p2 != null) {
                                        p2.h(q11);
                                        this.f22104m = p2.f();
                                    }
                                    this.j |= 4;
                                } else if (iN == 34) {
                                    if ((this.j & 16) == 16) {
                                        p062g7.Q q12 = this.f22106o;
                                        q12.getClass();
                                        p2 = p062g7.Q.p(q12);
                                    }
                                    p062g7.Q q13 = (p062g7.Q) c2633f.g(p062g7.Q.f22021B, c2635h);
                                    this.f22106o = q13;
                                    if (p2 != null) {
                                        p2.h(q13);
                                        this.f22106o = p2.f();
                                    }
                                    this.j |= 16;
                                } else if (iN == 40) {
                                    this.j |= 8;
                                    this.f22105n = c2633f.k();
                                } else if (iN != 48) {
                                    if (!m(c2633f, mH, c2635h, iN)) {
                                    }
                                } else {
                                    this.j |= 32;
                                    this.f22107p = c2633f.k();
                                }
                            } else {
                                this.j |= 2;
                                this.f22103l = c2633f.k();
                            }
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
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f22101i = c2631d.i();
                }
                l();
                throw th;
            }
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22101i = c2631d.i();
        }
        l();
    }
}
