package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends p110m7.o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p062g7.d0 f22166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p062g7.C2154a f22167s = new p062g7.C2154a(22);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22169i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22170k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p062g7.b0 f22171l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22172m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22173n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p062g7.c0 f22174o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte f22175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22176q;

    static {
        p062g7.d0 d0Var = new p062g7.d0();
        f22166r = d0Var;
        d0Var.j = 0;
        d0Var.f22170k = 0;
        d0Var.f22171l = p062g7.b0.ERROR;
        d0Var.f22172m = 0;
        d0Var.f22173n = 0;
        d0Var.f22174o = p062g7.c0.LANGUAGE_VERSION;
    }

    public d0() {
        this.f22175p = (byte) -1;
        this.f22176q = -1;
        this.f22168h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22176q;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f22169i & 1) == 1 ? Z2.M.m(1, this.j) : 0;
        if ((this.f22169i & 2) == 2) {
            iM += Z2.M.m(2, this.f22170k);
        }
        if ((this.f22169i & 4) == 4) {
            iM += Z2.M.l(3, this.f22171l.f22131h);
        }
        if ((this.f22169i & 8) == 8) {
            iM += Z2.M.m(4, this.f22172m);
        }
        if ((this.f22169i & 16) == 16) {
            iM += Z2.M.m(5, this.f22173n);
        }
        if ((this.f22169i & 32) == 32) {
            iM += Z2.M.l(6, this.f22174o.f22149h);
        }
        int size = this.f22168h.size() + iM;
        this.f22176q = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.a0.f();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.a0 a0VarF = p062g7.a0.f();
        a0VarF.g(this);
        return a0VarF;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        if ((this.f22169i & 1) == 1) {
            m8.Z(1, this.j);
        }
        if ((this.f22169i & 2) == 2) {
            m8.Z(2, this.f22170k);
        }
        if ((this.f22169i & 4) == 4) {
            m8.Y(3, this.f22171l.f22131h);
        }
        if ((this.f22169i & 8) == 8) {
            m8.Z(4, this.f22172m);
        }
        if ((this.f22169i & 16) == 16) {
            m8.Z(5, this.f22173n);
        }
        if ((this.f22169i & 32) == 32) {
            m8.Y(6, this.f22174o.f22149h);
        }
        m8.e0(this.f22168h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        if (this.f22175p == 1) {
            return true;
        }
        this.f22175p = (byte) 1;
        return true;
    }

    public d0(p062g7.a0 a0Var) {
        this.f22175p = (byte) -1;
        this.f22176q = -1;
        this.f22168h = a0Var.f25492h;
    }

    public d0(p110m7.C2633f c2633f) {
        this.f22175p = (byte) -1;
        this.f22176q = -1;
        boolean z6 = false;
        this.j = 0;
        this.f22170k = 0;
        p062g7.b0 b0Var = p062g7.b0.ERROR;
        this.f22171l = b0Var;
        this.f22172m = 0;
        this.f22173n = 0;
        p062g7.c0 c0Var = p062g7.c0.LANGUAGE_VERSION;
        this.f22174o = c0Var;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f22169i |= 1;
                            this.j = c2633f.k();
                        } else if (iN != 16) {
                            p062g7.c0 c0Var2 = null;
                            p062g7.b0 b0Var2 = null;
                            if (iN == 24) {
                                int iK = c2633f.k();
                                if (iK == 0) {
                                    b0Var2 = p062g7.b0.WARNING;
                                } else if (iK == 1) {
                                    b0Var2 = b0Var;
                                } else if (iK == 2) {
                                    b0Var2 = p062g7.b0.HIDDEN;
                                }
                                if (b0Var2 == null) {
                                    mH.i0(iN);
                                    mH.i0(iK);
                                } else {
                                    this.f22169i |= 4;
                                    this.f22171l = b0Var2;
                                }
                            } else if (iN == 32) {
                                this.f22169i |= 8;
                                this.f22172m = c2633f.k();
                            } else if (iN == 40) {
                                this.f22169i |= 16;
                                this.f22173n = c2633f.k();
                            } else if (iN != 48) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                int iK2 = c2633f.k();
                                if (iK2 == 0) {
                                    c0Var2 = c0Var;
                                } else if (iK2 == 1) {
                                    c0Var2 = p062g7.c0.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    c0Var2 = p062g7.c0.API_VERSION;
                                }
                                if (c0Var2 == null) {
                                    mH.i0(iN);
                                    mH.i0(iK2);
                                } else {
                                    this.f22169i |= 32;
                                    this.f22174o = c0Var2;
                                }
                            }
                        } else {
                            this.f22169i |= 2;
                            this.f22170k = c2633f.k();
                        }
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    try {
                        mH.y();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f22168h = c2631d.i();
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
            this.f22168h = c2631d.i();
        }
    }
}
