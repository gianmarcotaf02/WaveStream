package p062g7;

/* JADX INFO: renamed from: g7.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2157d extends p110m7.o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p062g7.C2157d f22150w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p062g7.C2154a f22151x = new p062g7.C2154a(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22152h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22153i;
    public p062g7.EnumC2156c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f22155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f22156m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22157n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22159p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p062g7.C2160g f22160q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.util.List f22161r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22162s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22163t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f22164u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f22165v;

    static {
        p062g7.C2157d c2157d = new p062g7.C2157d();
        f22150w = c2157d;
        c2157d.h();
    }

    public C2157d() {
        this.f22164u = (byte) -1;
        this.f22165v = -1;
        this.f22152h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22165v;
        if (i3 != -1) {
            return i3;
        }
        int iL = (this.f22153i & 1) == 1 ? Z2.M.l(1, this.j.f22145h) : 0;
        if ((this.f22153i & 2) == 2) {
            long j = this.f22154k;
            iL += Z2.M.r((j >> 63) ^ (j << 1)) + Z2.M.s(2);
        }
        if ((this.f22153i & 4) == 4) {
            iL += Z2.M.s(3) + 4;
        }
        if ((this.f22153i & 8) == 8) {
            iL += Z2.M.s(4) + 8;
        }
        if ((this.f22153i & 16) == 16) {
            iL += Z2.M.m(5, this.f22157n);
        }
        if ((this.f22153i & 32) == 32) {
            iL += Z2.M.m(6, this.f22158o);
        }
        if ((this.f22153i & 64) == 64) {
            iL += Z2.M.m(7, this.f22159p);
        }
        if ((this.f22153i & 128) == 128) {
            iL += Z2.M.o(8, this.f22160q);
        }
        for (int i9 = 0; i9 < this.f22161r.size(); i9++) {
            iL += Z2.M.o(9, (p110m7.AbstractC2629b) this.f22161r.get(i9));
        }
        if ((this.f22153i & 512) == 512) {
            iL += Z2.M.m(10, this.f22163t);
        }
        if ((this.f22153i & 256) == 256) {
            iL += Z2.M.m(11, this.f22162s);
        }
        int size = this.f22152h.size() + iL;
        this.f22165v = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.C2155b.f();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.C2155b c2155bF = p062g7.C2155b.f();
        c2155bF.g(this);
        return c2155bF;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        if ((this.f22153i & 1) == 1) {
            m8.Y(1, this.j.f22145h);
        }
        if ((this.f22153i & 2) == 2) {
            long j = this.f22154k;
            m8.k0(2, 0);
            m8.j0((j >> 63) ^ (j << 1));
        }
        if ((this.f22153i & 4) == 4) {
            float f9 = this.f22155l;
            m8.k0(3, 5);
            m8.g0(java.lang.Float.floatToRawIntBits(f9));
        }
        if ((this.f22153i & 8) == 8) {
            double d4 = this.f22156m;
            m8.k0(4, 1);
            m8.h0(java.lang.Double.doubleToRawLongBits(d4));
        }
        if ((this.f22153i & 16) == 16) {
            m8.Z(5, this.f22157n);
        }
        if ((this.f22153i & 32) == 32) {
            m8.Z(6, this.f22158o);
        }
        if ((this.f22153i & 64) == 64) {
            m8.Z(7, this.f22159p);
        }
        if ((this.f22153i & 128) == 128) {
            m8.b0(8, this.f22160q);
        }
        for (int i3 = 0; i3 < this.f22161r.size(); i3++) {
            m8.b0(9, (p110m7.AbstractC2629b) this.f22161r.get(i3));
        }
        if ((this.f22153i & 512) == 512) {
            m8.Z(10, this.f22163t);
        }
        if ((this.f22153i & 256) == 256) {
            m8.Z(11, this.f22162s);
        }
        m8.e0(this.f22152h);
    }

    public final void h() {
        this.j = p062g7.EnumC2156c.BYTE;
        this.f22154k = 0L;
        this.f22155l = 0.0f;
        this.f22156m = 0.0d;
        this.f22157n = 0;
        this.f22158o = 0;
        this.f22159p = 0;
        this.f22160q = p062g7.C2160g.f22194n;
        this.f22161r = java.util.Collections.EMPTY_LIST;
        this.f22162s = 0;
        this.f22163t = 0;
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22164u;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        if ((this.f22153i & 128) == 128 && !this.f22160q.isInitialized()) {
            this.f22164u = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f22161r.size(); i3++) {
            if (!((p062g7.C2157d) this.f22161r.get(i3)).isInitialized()) {
                this.f22164u = (byte) 0;
                return false;
            }
        }
        this.f22164u = (byte) 1;
        return true;
    }

    public C2157d(p062g7.C2155b c2155b) {
        this.f22164u = (byte) -1;
        this.f22165v = -1;
        this.f22152h = c2155b.f25492h;
    }

    public C2157d(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        p062g7.C2159f c2159f;
        this.f22164u = (byte) -1;
        this.f22165v = -1;
        h();
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        boolean z6 = false;
        char c9 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            int iK = c2633f.k();
                            p062g7.EnumC2156c enumC2156cB = p062g7.EnumC2156c.b(iK);
                            if (enumC2156cB == null) {
                                mH.i0(iN);
                                mH.i0(iK);
                            } else {
                                this.f22153i |= 1;
                                this.j = enumC2156cB;
                                continue;
                            }
                            break;
                        case 16:
                            this.f22153i |= 2;
                            long jL = c2633f.l();
                            this.f22154k = (-(jL & 1)) ^ (jL >>> 1);
                            continue;
                        case 29:
                            this.f22153i |= 4;
                            this.f22155l = java.lang.Float.intBitsToFloat(c2633f.i());
                            continue;
                        case 33:
                            this.f22153i |= 8;
                            this.f22156m = java.lang.Double.longBitsToDouble(c2633f.j());
                            continue;
                        case 40:
                            this.f22153i |= 16;
                            this.f22157n = c2633f.k();
                            continue;
                        case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                            this.f22153i |= 32;
                            this.f22158o = c2633f.k();
                            continue;
                        case 56:
                            this.f22153i |= 64;
                            this.f22159p = c2633f.k();
                            continue;
                        case 66:
                            if ((this.f22153i & 128) == 128) {
                                p062g7.C2160g c2160g = this.f22160q;
                                c2160g.getClass();
                                c2159f = new p062g7.C2159f(0);
                                c2159f.f22190k = java.util.Collections.EMPTY_LIST;
                                c2159f.j(c2160g);
                            } else {
                                c2159f = null;
                            }
                            p062g7.C2160g c2160g2 = (p062g7.C2160g) c2633f.g(p062g7.C2160g.f22195o, c2635h);
                            this.f22160q = c2160g2;
                            if (c2159f != null) {
                                c2159f.j(c2160g2);
                                this.f22160q = c2159f.f();
                            }
                            this.f22153i |= 128;
                            continue;
                        case 74:
                            if ((c9 & 256) != 256) {
                                this.f22161r = new java.util.ArrayList();
                                c9 = 256;
                            }
                            this.f22161r.add(c2633f.g(f22151x, c2635h));
                            continue;
                        case com.revenuecat.purchases.utils.EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                            this.f22153i |= 512;
                            this.f22163t = c2633f.k();
                            continue;
                        case 88:
                            this.f22153i |= 256;
                            this.f22162s = c2633f.k();
                            continue;
                        default:
                            if (!c2633f.q(iN, mH)) {
                                break;
                            }
                            break;
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
                if ((c9 & 256) == 256) {
                    this.f22161r = java.util.Collections.unmodifiableList(this.f22161r);
                }
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f22152h = c2631d.i();
                }
                throw th;
            }
        }
        if ((c9 & 256) == 256) {
            this.f22161r = java.util.Collections.unmodifiableList(this.f22161r);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22152h = c2631d.i();
        }
    }
}
