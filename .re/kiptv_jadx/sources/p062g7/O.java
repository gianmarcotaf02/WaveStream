package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class O extends p110m7.o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p062g7.O f21998o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p062g7.C2154a f21999p = new p062g7.C2154a(17);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22001i;
    public p062g7.N j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p062g7.Q f22002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f22004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22005n;

    static {
        p062g7.O o8 = new p062g7.O();
        f21998o = o8;
        o8.j = p062g7.N.INV;
        o8.f22002k = p062g7.Q.f22020A;
        o8.f22003l = 0;
    }

    public O() {
        this.f22004m = (byte) -1;
        this.f22005n = -1;
        this.f22000h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22005n;
        if (i3 != -1) {
            return i3;
        }
        int iL = (this.f22001i & 1) == 1 ? Z2.M.l(1, this.j.f21997h) : 0;
        if ((this.f22001i & 2) == 2) {
            iL += Z2.M.o(2, this.f22002k);
        }
        if ((this.f22001i & 4) == 4) {
            iL += Z2.M.m(3, this.f22003l);
        }
        int size = this.f22000h.size() + iL;
        this.f22005n = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.M.f();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.M mF = p062g7.M.f();
        mF.g(this);
        return mF;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        if ((this.f22001i & 1) == 1) {
            m8.Y(1, this.j.f21997h);
        }
        if ((this.f22001i & 2) == 2) {
            m8.b0(2, this.f22002k);
        }
        if ((this.f22001i & 4) == 4) {
            m8.Z(3, this.f22003l);
        }
        m8.e0(this.f22000h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22004m;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        if ((this.f22001i & 2) != 2 || this.f22002k.isInitialized()) {
            this.f22004m = (byte) 1;
            return true;
        }
        this.f22004m = (byte) 0;
        return false;
    }

    public O(p062g7.M m8) {
        this.f22004m = (byte) -1;
        this.f22005n = -1;
        this.f22000h = m8.f25492h;
    }

    public O(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.f22004m = (byte) -1;
        this.f22005n = -1;
        p062g7.N n3 = p062g7.N.INV;
        this.j = n3;
        this.f22002k = p062g7.Q.f22020A;
        boolean z6 = false;
        this.f22003l = 0;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        p062g7.P p2 = null;
                        p062g7.N n9 = null;
                        if (iN == 8) {
                            int iK = c2633f.k();
                            if (iK == 0) {
                                n9 = p062g7.N.IN;
                            } else if (iK == 1) {
                                n9 = p062g7.N.OUT;
                            } else if (iK == 2) {
                                n9 = n3;
                            } else if (iK == 3) {
                                n9 = p062g7.N.STAR;
                            }
                            if (n9 == null) {
                                mH.i0(iN);
                                mH.i0(iK);
                            } else {
                                this.f22001i |= 1;
                                this.j = n9;
                            }
                        } else if (iN == 18) {
                            if ((this.f22001i & 2) == 2) {
                                p062g7.Q q9 = this.f22002k;
                                q9.getClass();
                                p2 = p062g7.Q.p(q9);
                            }
                            p062g7.Q q10 = (p062g7.Q) c2633f.g(p062g7.Q.f22021B, c2635h);
                            this.f22002k = q10;
                            if (p2 != null) {
                                p2.h(q10);
                                this.f22002k = p2.f();
                            }
                            this.f22001i |= 2;
                        } else if (iN != 24) {
                            if (!c2633f.q(iN, mH)) {
                            }
                        } else {
                            this.f22001i |= 4;
                            this.f22003l = c2633f.k();
                        }
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    try {
                        mH.y();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f22000h = c2631d.i();
                    }
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
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22000h = c2631d.i();
        }
    }
}
