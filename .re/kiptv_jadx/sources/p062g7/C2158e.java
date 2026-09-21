package p062g7;

/* JADX INFO: renamed from: g7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2158e extends p110m7.o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p062g7.C2158e f22177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p062g7.C2154a f22178o = new p062g7.C2154a(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22179h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22180i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p062g7.C2157d f22181k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f22182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22183m;

    static {
        p062g7.C2158e c2158e = new p062g7.C2158e();
        f22177n = c2158e;
        c2158e.j = 0;
        c2158e.f22181k = p062g7.C2157d.f22150w;
    }

    public C2158e() {
        this.f22182l = (byte) -1;
        this.f22183m = -1;
        this.f22179h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22183m;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f22180i & 1) == 1 ? Z2.M.m(1, this.j) : 0;
        if ((this.f22180i & 2) == 2) {
            iM += Z2.M.o(2, this.f22181k);
        }
        int size = this.f22179h.size() + iM;
        this.f22183m = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        p062g7.C2159f c2159f = new p062g7.C2159f(2);
        c2159f.f22190k = p062g7.C2157d.f22150w;
        return c2159f;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.C2159f c2159f = new p062g7.C2159f(2);
        c2159f.f22190k = p062g7.C2157d.f22150w;
        c2159f.i(this);
        return c2159f;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        if ((this.f22180i & 1) == 1) {
            m8.Z(1, this.j);
        }
        if ((this.f22180i & 2) == 2) {
            m8.b0(2, this.f22181k);
        }
        m8.e0(this.f22179h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22182l;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        int i3 = this.f22180i;
        if ((i3 & 1) != 1) {
            this.f22182l = (byte) 0;
            return false;
        }
        if ((i3 & 2) != 2) {
            this.f22182l = (byte) 0;
            return false;
        }
        if (this.f22181k.isInitialized()) {
            this.f22182l = (byte) 1;
            return true;
        }
        this.f22182l = (byte) 0;
        return false;
    }

    public C2158e(p062g7.C2159f c2159f) {
        this.f22182l = (byte) -1;
        this.f22183m = -1;
        this.f22179h = c2159f.f25492h;
    }

    public C2158e(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        p062g7.C2155b c2155bF;
        this.f22182l = (byte) -1;
        this.f22183m = -1;
        boolean z6 = false;
        this.j = 0;
        this.f22181k = p062g7.C2157d.f22150w;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f22180i |= 1;
                                this.j = c2633f.k();
                            } else if (iN != 18) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                if ((this.f22180i & 2) == 2) {
                                    p062g7.C2157d c2157d = this.f22181k;
                                    c2157d.getClass();
                                    c2155bF = p062g7.C2155b.f();
                                    c2155bF.g(c2157d);
                                } else {
                                    c2155bF = null;
                                }
                                p062g7.C2157d c2157d2 = (p062g7.C2157d) c2633f.g(p062g7.C2157d.f22151x, c2635h);
                                this.f22181k = c2157d2;
                                if (c2155bF != null) {
                                    c2155bF.g(c2157d2);
                                    this.f22181k = c2155bF.e();
                                }
                                this.f22180i |= 2;
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
                    this.f22179h = c2631d.i();
                }
                throw th;
            }
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22179h = c2631d.i();
        }
    }
}
