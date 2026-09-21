package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends p110m7.AbstractC2639l {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final p062g7.G f21946B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final p062g7.C2154a f21947C = new p062g7.C2154a(12);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f21948A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p110m7.AbstractC2632e f21949i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p062g7.Q f21953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.List f21955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p062g7.Q f21956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f21957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public java.util.List f21958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public java.util.List f21959t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21960u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p062g7.Z f21961v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f21962w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f21963x;
    public java.util.List y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public byte f21964z;

    static {
        p062g7.G g = new p062g7.G();
        f21946B = g;
        g.o();
    }

    public G(p062g7.F f9) {
        super(f9);
        this.f21960u = -1;
        this.f21964z = (byte) -1;
        this.f21948A = -1;
        this.f21949i = f9.f25492h;
    }

    @Override // p110m7.v
    public final p110m7.AbstractC2629b a() {
        return f21946B;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f21948A;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.j & 2) == 2 ? Z2.M.m(1, this.f21951l) : 0;
        if ((this.j & 4) == 4) {
            iM += Z2.M.m(2, this.f21952m);
        }
        if ((this.j & 8) == 8) {
            iM += Z2.M.o(3, this.f21953n);
        }
        for (int i9 = 0; i9 < this.f21955p.size(); i9++) {
            iM += Z2.M.o(4, (p110m7.AbstractC2629b) this.f21955p.get(i9));
        }
        if ((this.j & 32) == 32) {
            iM += Z2.M.o(5, this.f21956q);
        }
        if ((this.j & 128) == 128) {
            iM += Z2.M.o(6, this.f21961v);
        }
        if ((this.j & 256) == 256) {
            iM += Z2.M.m(7, this.f21962w);
        }
        if ((this.j & 512) == 512) {
            iM += Z2.M.m(8, this.f21963x);
        }
        if ((this.j & 16) == 16) {
            iM += Z2.M.m(9, this.f21954o);
        }
        if ((this.j & 64) == 64) {
            iM += Z2.M.m(10, this.f21957r);
        }
        if ((this.j & 1) == 1) {
            iM += Z2.M.m(11, this.f21950k);
        }
        for (int i10 = 0; i10 < this.f21958s.size(); i10++) {
            iM += Z2.M.o(12, (p110m7.AbstractC2629b) this.f21958s.get(i10));
        }
        int iN = 0;
        for (int i11 = 0; i11 < this.f21959t.size(); i11++) {
            iN += Z2.M.n(((java.lang.Integer) this.f21959t.get(i11)).intValue());
        }
        int iN2 = iM + iN;
        if (!this.f21959t.isEmpty()) {
            iN2 = iN2 + 1 + Z2.M.n(iN);
        }
        this.f21960u = iN;
        int iN3 = 0;
        for (int i12 = 0; i12 < this.y.size(); i12++) {
            iN3 += Z2.M.n(((java.lang.Integer) this.y.get(i12)).intValue());
        }
        int size = this.f21949i.size() + i() + (this.y.size() * 2) + iN2 + iN3;
        this.f21948A = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.F.g();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.F fG = p062g7.F.g();
        fG.h(this);
        return fG;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        p079i7.f fVar = new p079i7.f(this);
        if ((this.j & 2) == 2) {
            m8.Z(1, this.f21951l);
        }
        if ((this.j & 4) == 4) {
            m8.Z(2, this.f21952m);
        }
        if ((this.j & 8) == 8) {
            m8.b0(3, this.f21953n);
        }
        for (int i3 = 0; i3 < this.f21955p.size(); i3++) {
            m8.b0(4, (p110m7.AbstractC2629b) this.f21955p.get(i3));
        }
        if ((this.j & 32) == 32) {
            m8.b0(5, this.f21956q);
        }
        if ((this.j & 128) == 128) {
            m8.b0(6, this.f21961v);
        }
        if ((this.j & 256) == 256) {
            m8.Z(7, this.f21962w);
        }
        if ((this.j & 512) == 512) {
            m8.Z(8, this.f21963x);
        }
        if ((this.j & 16) == 16) {
            m8.Z(9, this.f21954o);
        }
        if ((this.j & 64) == 64) {
            m8.Z(10, this.f21957r);
        }
        if ((this.j & 1) == 1) {
            m8.Z(11, this.f21950k);
        }
        for (int i9 = 0; i9 < this.f21958s.size(); i9++) {
            m8.b0(12, (p110m7.AbstractC2629b) this.f21958s.get(i9));
        }
        if (this.f21959t.size() > 0) {
            m8.i0(106);
            m8.i0(this.f21960u);
        }
        for (int i10 = 0; i10 < this.f21959t.size(); i10++) {
            m8.a0(((java.lang.Integer) this.f21959t.get(i10)).intValue());
        }
        for (int i11 = 0; i11 < this.y.size(); i11++) {
            m8.Z(31, ((java.lang.Integer) this.y.get(i11)).intValue());
        }
        fVar.X0(19000, m8);
        m8.e0(this.f21949i);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f21964z;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        int i3 = this.j;
        if ((i3 & 4) != 4) {
            this.f21964z = (byte) 0;
            return false;
        }
        if ((i3 & 8) == 8 && !this.f21953n.isInitialized()) {
            this.f21964z = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.f21955p.size(); i9++) {
            if (!((p062g7.W) this.f21955p.get(i9)).isInitialized()) {
                this.f21964z = (byte) 0;
                return false;
            }
        }
        if ((this.j & 32) == 32 && !this.f21956q.isInitialized()) {
            this.f21964z = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f21958s.size(); i10++) {
            if (!((p062g7.Q) this.f21958s.get(i10)).isInitialized()) {
                this.f21964z = (byte) 0;
                return false;
            }
        }
        if ((this.j & 128) == 128 && !this.f21961v.isInitialized()) {
            this.f21964z = (byte) 0;
            return false;
        }
        if (h()) {
            this.f21964z = (byte) 1;
            return true;
        }
        this.f21964z = (byte) 0;
        return false;
    }

    public final void o() {
        this.f21950k = 518;
        this.f21951l = 2054;
        this.f21952m = 0;
        p062g7.Q q9 = p062g7.Q.f22020A;
        this.f21953n = q9;
        this.f21954o = 0;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        this.f21955p = list;
        this.f21956q = q9;
        this.f21957r = 0;
        this.f21958s = list;
        this.f21959t = list;
        this.f21961v = p062g7.Z.f22099s;
        this.f21962w = 0;
        this.f21963x = 0;
        this.y = list;
    }

    public G() {
        this.f21960u = -1;
        this.f21964z = (byte) -1;
        this.f21948A = -1;
        this.f21949i = p110m7.AbstractC2632e.f25476h;
    }

    public G(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.f21960u = -1;
        this.f21964z = (byte) -1;
        this.f21948A = -1;
        o();
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        boolean z6 = false;
        int i3 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        p062g7.P p2 = null;
                        p062g7.Y y = null;
                        p062g7.P p9 = null;
                        switch (iN) {
                            case 0:
                                break;
                            case 8:
                                this.j |= 2;
                                this.f21951l = c2633f.k();
                                continue;
                            case 16:
                                this.j |= 4;
                                this.f21952m = c2633f.k();
                                continue;
                            case 26:
                                if ((this.j & 8) == 8) {
                                    p062g7.Q q9 = this.f21953n;
                                    q9.getClass();
                                    p2 = p062g7.Q.p(q9);
                                }
                                p062g7.Q q10 = (p062g7.Q) c2633f.g(p062g7.Q.f22021B, c2635h);
                                this.f21953n = q10;
                                if (p2 != null) {
                                    p2.h(q10);
                                    this.f21953n = p2.f();
                                }
                                this.j |= 8;
                                continue;
                            case 34:
                                int i9 = (i3 == true ? 1 : 0) & 32;
                                i3 = i3;
                                if (i9 != 32) {
                                    this.f21955p = new java.util.ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 32;
                                }
                                this.f21955p.add(c2633f.g(p062g7.W.f22074u, c2635h));
                                continue;
                            case androidx.media3.extractor.AacUtil.AUDIO_OBJECT_TYPE_AAC_XHE /* 42 */:
                                if ((this.j & 32) == 32) {
                                    p062g7.Q q11 = this.f21956q;
                                    q11.getClass();
                                    p9 = p062g7.Q.p(q11);
                                }
                                p062g7.Q q12 = (p062g7.Q) c2633f.g(p062g7.Q.f22021B, c2635h);
                                this.f21956q = q12;
                                if (p9 != null) {
                                    p9.h(q12);
                                    this.f21956q = p9.f();
                                }
                                this.j |= 32;
                                continue;
                            case 50:
                                if ((this.j & 128) == 128) {
                                    p062g7.Z z9 = this.f21961v;
                                    z9.getClass();
                                    y = new p062g7.Y();
                                    p062g7.Q q13 = p062g7.Q.f22020A;
                                    y.f22095n = q13;
                                    y.f22097p = q13;
                                    y.g(z9);
                                }
                                p062g7.Z z10 = (p062g7.Z) c2633f.g(p062g7.Z.f22100t, c2635h);
                                this.f21961v = z10;
                                if (y != null) {
                                    y.g(z10);
                                    this.f21961v = y.f();
                                }
                                this.j |= 128;
                                continue;
                            case 56:
                                this.j |= 256;
                                this.f21962w = c2633f.k();
                                continue;
                            case 64:
                                this.j |= 512;
                                this.f21963x = c2633f.k();
                                continue;
                            case 72:
                                this.j |= 16;
                                this.f21954o = c2633f.k();
                                continue;
                            case com.revenuecat.purchases.utils.EventsFileHelper.MAX_EVENT_PROPERTY_SIZE /* 80 */:
                                this.j |= 64;
                                this.f21957r = c2633f.k();
                                continue;
                            case 88:
                                this.j |= 1;
                                this.f21950k = c2633f.k();
                                continue;
                            case 98:
                                int i10 = (i3 == true ? 1 : 0) & 256;
                                i3 = i3;
                                if (i10 != 256) {
                                    this.f21958s = new java.util.ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 256;
                                }
                                this.f21958s.add(c2633f.g(p062g7.Q.f22021B, c2635h));
                                continue;
                            case 104:
                                int i11 = (i3 == true ? 1 : 0) & 512;
                                i3 = i3;
                                if (i11 != 512) {
                                    this.f21959t = new java.util.ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 512;
                                }
                                this.f21959t.add(java.lang.Integer.valueOf(c2633f.k()));
                                continue;
                            case 106:
                                int iD = c2633f.d(c2633f.k());
                                int i12 = (i3 == true ? 1 : 0) & 512;
                                i3 = i3;
                                if (i12 != 512 && c2633f.b() > 0) {
                                    i3 = i3;
                                    this.f21959t = new java.util.ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 512;
                                }
                                i3 = i3;
                                while (c2633f.b() > 0) {
                                    this.f21959t.add(java.lang.Integer.valueOf(c2633f.k()));
                                }
                                c2633f.c(iD);
                                continue;
                            case 248:
                                int i13 = (i3 == true ? 1 : 0) & 8192;
                                i3 = i3;
                                if (i13 != 8192) {
                                    this.y = new java.util.ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 8192;
                                }
                                this.y.add(java.lang.Integer.valueOf(c2633f.k()));
                                continue;
                            case 250:
                                int iD2 = c2633f.d(c2633f.k());
                                int i14 = (i3 == true ? 1 : 0) & 8192;
                                i3 = i3;
                                if (i14 != 8192 && c2633f.b() > 0) {
                                    i3 = i3;
                                    this.y = new java.util.ArrayList();
                                    i3 = (i3 == true ? 1 : 0) | 8192;
                                }
                                i3 = i3;
                                while (c2633f.b() > 0) {
                                    this.y.add(java.lang.Integer.valueOf(c2633f.k()));
                                }
                                c2633f.c(iD2);
                                continue;
                            default:
                                if (!m(c2633f, mH, c2635h, iN)) {
                                    break;
                                }
                                break;
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
                if (((i3 == true ? 1 : 0) & 32) == 32) {
                    this.f21955p = java.util.Collections.unmodifiableList(this.f21955p);
                }
                if (((i3 == true ? 1 : 0) & 256) == 256) {
                    this.f21958s = java.util.Collections.unmodifiableList(this.f21958s);
                }
                if (((i3 == true ? 1 : 0) & 512) == 512) {
                    this.f21959t = java.util.Collections.unmodifiableList(this.f21959t);
                }
                if (((i3 == true ? 1 : 0) & 8192) == 8192) {
                    this.y = java.util.Collections.unmodifiableList(this.y);
                }
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f21949i = c2631d.i();
                }
                l();
                throw th;
            }
        }
        if (((i3 == true ? 1 : 0) & 32) == 32) {
            this.f21955p = java.util.Collections.unmodifiableList(this.f21955p);
        }
        if (((i3 == true ? 1 : 0) & 256) == 256) {
            this.f21958s = java.util.Collections.unmodifiableList(this.f21958s);
        }
        if (((i3 == true ? 1 : 0) & 512) == 512) {
            this.f21959t = java.util.Collections.unmodifiableList(this.f21959t);
        }
        if (((i3 == true ? 1 : 0) & 8192) == 8192) {
            this.y = java.util.Collections.unmodifiableList(this.y);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f21949i = c2631d.i();
        }
        l();
    }
}
