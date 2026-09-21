package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends p110m7.AbstractC2639l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final p062g7.Q f22020A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final p062g7.C2154a f22021B = new p062g7.C2154a(16);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22022i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.List f22023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p062g7.Q f22026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f22030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p062g7.Q f22032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f22033u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p062g7.Q f22034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22036x;
    public byte y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f22037z;

    static {
        p062g7.Q q9 = new p062g7.Q();
        f22020A = q9;
        q9.o();
    }

    public Q(p062g7.P p2) {
        super(p2);
        this.y = (byte) -1;
        this.f22037z = -1;
        this.f22022i = p2.f25492h;
    }

    public static p062g7.P p(p062g7.Q q9) {
        p062g7.P pG = p062g7.P.g();
        pG.h(q9);
        return pG;
    }

    @Override // p110m7.v
    public final p110m7.AbstractC2629b a() {
        return f22020A;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22037z;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.j & 4096) == 4096 ? Z2.M.m(1, this.f22036x) : 0;
        for (int i9 = 0; i9 < this.f22023k.size(); i9++) {
            iM += Z2.M.o(2, (p110m7.AbstractC2629b) this.f22023k.get(i9));
        }
        if ((this.j & 1) == 1) {
            iM += Z2.M.s(3) + 1;
        }
        if ((this.j & 2) == 2) {
            iM += Z2.M.m(4, this.f22025m);
        }
        if ((this.j & 4) == 4) {
            iM += Z2.M.o(5, this.f22026n);
        }
        if ((this.j & 16) == 16) {
            iM += Z2.M.m(6, this.f22028p);
        }
        if ((this.j & 32) == 32) {
            iM += Z2.M.m(7, this.f22029q);
        }
        if ((this.j & 8) == 8) {
            iM += Z2.M.m(8, this.f22027o);
        }
        if ((this.j & 64) == 64) {
            iM += Z2.M.m(9, this.f22030r);
        }
        if ((this.j & 256) == 256) {
            iM += Z2.M.o(10, this.f22032t);
        }
        if ((this.j & 512) == 512) {
            iM += Z2.M.m(11, this.f22033u);
        }
        if ((this.j & 128) == 128) {
            iM += Z2.M.m(12, this.f22031s);
        }
        if ((this.j & 1024) == 1024) {
            iM += Z2.M.o(13, this.f22034v);
        }
        if ((this.j & 2048) == 2048) {
            iM += Z2.M.m(14, this.f22035w);
        }
        int size = this.f22022i.size() + i() + iM;
        this.f22037z = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.P.g();
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        p079i7.f fVar = new p079i7.f(this);
        if ((this.j & 4096) == 4096) {
            m8.Z(1, this.f22036x);
        }
        for (int i3 = 0; i3 < this.f22023k.size(); i3++) {
            m8.b0(2, (p110m7.AbstractC2629b) this.f22023k.get(i3));
        }
        if ((this.j & 1) == 1) {
            boolean z6 = this.f22024l;
            m8.k0(3, 0);
            m8.d0(z6 ? 1 : 0);
        }
        if ((this.j & 2) == 2) {
            m8.Z(4, this.f22025m);
        }
        if ((this.j & 4) == 4) {
            m8.b0(5, this.f22026n);
        }
        if ((this.j & 16) == 16) {
            m8.Z(6, this.f22028p);
        }
        if ((this.j & 32) == 32) {
            m8.Z(7, this.f22029q);
        }
        if ((this.j & 8) == 8) {
            m8.Z(8, this.f22027o);
        }
        if ((this.j & 64) == 64) {
            m8.Z(9, this.f22030r);
        }
        if ((this.j & 256) == 256) {
            m8.b0(10, this.f22032t);
        }
        if ((this.j & 512) == 512) {
            m8.Z(11, this.f22033u);
        }
        if ((this.j & 128) == 128) {
            m8.Z(12, this.f22031s);
        }
        if ((this.j & 1024) == 1024) {
            m8.b0(13, this.f22034v);
        }
        if ((this.j & 2048) == 2048) {
            m8.Z(14, this.f22035w);
        }
        fVar.X0(200, m8);
        m8.e0(this.f22022i);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.y;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        for (int i3 = 0; i3 < this.f22023k.size(); i3++) {
            if (!((p062g7.O) this.f22023k.get(i3)).isInitialized()) {
                this.y = (byte) 0;
                return false;
            }
        }
        if ((this.j & 4) == 4 && !this.f22026n.isInitialized()) {
            this.y = (byte) 0;
            return false;
        }
        if ((this.j & 256) == 256 && !this.f22032t.isInitialized()) {
            this.y = (byte) 0;
            return false;
        }
        if ((this.j & 1024) == 1024 && !this.f22034v.isInitialized()) {
            this.y = (byte) 0;
            return false;
        }
        if (h()) {
            this.y = (byte) 1;
            return true;
        }
        this.y = (byte) 0;
        return false;
    }

    public final void o() {
        this.f22023k = java.util.Collections.EMPTY_LIST;
        this.f22024l = false;
        this.f22025m = 0;
        p062g7.Q q9 = f22020A;
        this.f22026n = q9;
        this.f22027o = 0;
        this.f22028p = 0;
        this.f22029q = 0;
        this.f22030r = 0;
        this.f22031s = 0;
        this.f22032t = q9;
        this.f22033u = 0;
        this.f22034v = q9;
        this.f22035w = 0;
        this.f22036x = 0;
    }

    @Override // p110m7.AbstractC2629b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final p062g7.P d() {
        return p(this);
    }

    public Q() {
        this.y = (byte) -1;
        this.f22037z = -1;
        this.f22022i = p110m7.AbstractC2632e.f25476h;
    }

    public Q(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.y = (byte) -1;
        this.f22037z = -1;
        o();
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        boolean z6 = false;
        boolean z9 = false;
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    p062g7.C2154a c2154a = f22021B;
                    p062g7.P p2 = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.j |= 4096;
                            this.f22036x = c2633f.k();
                            continue;
                        case 18:
                            if (!z9) {
                                this.f22023k = new java.util.ArrayList();
                                z9 = true;
                            }
                            this.f22023k.add(c2633f.g(p062g7.O.f21999p, c2635h));
                            continue;
                        case 24:
                            this.j |= 1;
                            this.f22024l = c2633f.l() != 0;
                            continue;
                        case 32:
                            this.j |= 2;
                            this.f22025m = c2633f.k();
                            continue;
                        case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                            if ((this.j & 4) == 4) {
                                p062g7.Q q9 = this.f22026n;
                                q9.getClass();
                                p2 = p(q9);
                            }
                            p062g7.Q q10 = (p062g7.Q) c2633f.g(c2154a, c2635h);
                            this.f22026n = q10;
                            if (p2 != null) {
                                p2.h(q10);
                                this.f22026n = p2.f();
                            }
                            this.j |= 4;
                            continue;
                        case androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED /* 48 */:
                            this.j |= 16;
                            this.f22028p = c2633f.k();
                            continue;
                        case 56:
                            this.j |= 32;
                            this.f22029q = c2633f.k();
                            continue;
                        case 64:
                            this.j |= 8;
                            this.f22027o = c2633f.k();
                            continue;
                        case 72:
                            this.j |= 64;
                            this.f22030r = c2633f.k();
                            continue;
                        case 82:
                            if ((this.j & 256) == 256) {
                                p062g7.Q q11 = this.f22032t;
                                q11.getClass();
                                p2 = p(q11);
                            }
                            p062g7.Q q12 = (p062g7.Q) c2633f.g(c2154a, c2635h);
                            this.f22032t = q12;
                            if (p2 != null) {
                                p2.h(q12);
                                this.f22032t = p2.f();
                            }
                            this.j |= 256;
                            continue;
                        case 88:
                            this.j |= 512;
                            this.f22033u = c2633f.k();
                            continue;
                        case 96:
                            this.j |= 128;
                            this.f22031s = c2633f.k();
                            continue;
                        case 106:
                            if ((this.j & 1024) == 1024) {
                                p062g7.Q q13 = this.f22034v;
                                q13.getClass();
                                p2 = p(q13);
                            }
                            p062g7.Q q14 = (p062g7.Q) c2633f.g(c2154a, c2635h);
                            this.f22034v = q14;
                            if (p2 != null) {
                                p2.h(q14);
                                this.f22034v = p2.f();
                            }
                            this.j |= 1024;
                            continue;
                        case 112:
                            this.j |= 2048;
                            this.f22035w = c2633f.k();
                            continue;
                        default:
                            if (!m(c2633f, mH, c2635h, iN)) {
                                break;
                            }
                            break;
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    if (z9) {
                        this.f22023k = java.util.Collections.unmodifiableList(this.f22023k);
                    }
                    try {
                        mH.y();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f22022i = c2631d.i();
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
        if (z9) {
            this.f22023k = java.util.Collections.unmodifiableList(this.f22023k);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22022i = c2631d.i();
        }
        l();
    }
}
