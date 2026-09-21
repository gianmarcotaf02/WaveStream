package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends p110m7.o {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p062g7.J f21972o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p062g7.C2154a f21973p = new p062g7.C2154a(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f21974h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21975i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p062g7.I f21977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f21978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21979n;

    static {
        p062g7.J j = new p062g7.J();
        f21972o = j;
        j.j = -1;
        j.f21976k = 0;
        j.f21977l = p062g7.I.PACKAGE;
    }

    public J() {
        this.f21978m = (byte) -1;
        this.f21979n = -1;
        this.f21974h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f21979n;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f21975i & 1) == 1 ? Z2.M.m(1, this.j) : 0;
        if ((this.f21975i & 2) == 2) {
            iM += Z2.M.m(2, this.f21976k);
        }
        if ((this.f21975i & 4) == 4) {
            iM += Z2.M.l(3, this.f21977l.f21971h);
        }
        int size = this.f21974h.size() + iM;
        this.f21979n = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.H.f();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.H hF = p062g7.H.f();
        hF.g(this);
        return hF;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        if ((this.f21975i & 1) == 1) {
            m8.Z(1, this.j);
        }
        if ((this.f21975i & 2) == 2) {
            m8.Z(2, this.f21976k);
        }
        if ((this.f21975i & 4) == 4) {
            m8.Y(3, this.f21977l.f21971h);
        }
        m8.e0(this.f21974h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f21978m;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        if ((this.f21975i & 2) == 2) {
            this.f21978m = (byte) 1;
            return true;
        }
        this.f21978m = (byte) 0;
        return false;
    }

    public J(p062g7.H h9) {
        this.f21978m = (byte) -1;
        this.f21979n = -1;
        this.f21974h = h9.f25492h;
    }

    public J(p110m7.C2633f c2633f) {
        p062g7.I i3;
        this.f21978m = (byte) -1;
        this.f21979n = -1;
        this.j = -1;
        boolean z6 = false;
        this.f21976k = 0;
        p062g7.I i9 = p062g7.I.PACKAGE;
        this.f21977l = i9;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f21975i |= 1;
                                this.j = c2633f.k();
                            } else if (iN == 16) {
                                this.f21975i |= 2;
                                this.f21976k = c2633f.k();
                            } else if (iN != 24) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                int iK = c2633f.k();
                                if (iK == 0) {
                                    i3 = p062g7.I.CLASS;
                                } else if (iK != 1) {
                                    i3 = iK != 2 ? null : p062g7.I.LOCAL;
                                } else {
                                    i3 = i9;
                                }
                                if (i3 == null) {
                                    mH.i0(iN);
                                    mH.i0(iK);
                                } else {
                                    this.f21975i |= 4;
                                    this.f21977l = i3;
                                }
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
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f21974h = c2631d.i();
                }
                throw th;
            }
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f21974h = c2631d.i();
        }
    }
}
