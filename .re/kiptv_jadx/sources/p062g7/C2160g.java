package p062g7;

/* JADX INFO: renamed from: g7.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2160g extends p110m7.o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p062g7.C2160g f22194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p062g7.C2154a f22195o = new p062g7.C2154a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22196h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22197i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.List f22198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f22199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22200m;

    static {
        p062g7.C2160g c2160g = new p062g7.C2160g();
        f22194n = c2160g;
        c2160g.j = 0;
        c2160g.f22198k = java.util.Collections.EMPTY_LIST;
    }

    public C2160g() {
        this.f22199l = (byte) -1;
        this.f22200m = -1;
        this.f22196h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22200m;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f22197i & 1) == 1 ? Z2.M.m(1, this.j) : 0;
        for (int i9 = 0; i9 < this.f22198k.size(); i9++) {
            iM += Z2.M.o(2, (p110m7.AbstractC2629b) this.f22198k.get(i9));
        }
        int size = this.f22196h.size() + iM;
        this.f22200m = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        p062g7.C2159f c2159f = new p062g7.C2159f(0);
        c2159f.f22190k = java.util.Collections.EMPTY_LIST;
        return c2159f;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.C2159f c2159f = new p062g7.C2159f(0);
        c2159f.f22190k = java.util.Collections.EMPTY_LIST;
        c2159f.j(this);
        return c2159f;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        if ((this.f22197i & 1) == 1) {
            m8.Z(1, this.j);
        }
        for (int i3 = 0; i3 < this.f22198k.size(); i3++) {
            m8.b0(2, (p110m7.AbstractC2629b) this.f22198k.get(i3));
        }
        m8.e0(this.f22196h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22199l;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        if ((this.f22197i & 1) != 1) {
            this.f22199l = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f22198k.size(); i3++) {
            if (!((p062g7.C2158e) this.f22198k.get(i3)).isInitialized()) {
                this.f22199l = (byte) 0;
                return false;
            }
        }
        this.f22199l = (byte) 1;
        return true;
    }

    public C2160g(p062g7.C2159f c2159f) {
        this.f22199l = (byte) -1;
        this.f22200m = -1;
        this.f22196h = c2159f.f25492h;
    }

    public C2160g(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.f22199l = (byte) -1;
        this.f22200m = -1;
        boolean z6 = false;
        this.j = 0;
        this.f22198k = java.util.Collections.EMPTY_LIST;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        char c9 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f22197i |= 1;
                                this.j = c2633f.k();
                            } else if (iN != 18) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                if ((c9 & 2) != 2) {
                                    this.f22198k = new java.util.ArrayList();
                                    c9 = 2;
                                }
                                this.f22198k.add(c2633f.g(p062g7.C2158e.f22178o, c2635h));
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
                if ((c9 & 2) == 2) {
                    this.f22198k = java.util.Collections.unmodifiableList(this.f22198k);
                }
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f22196h = c2631d.i();
                }
                throw th;
            }
        }
        if ((c9 & 2) == 2) {
            this.f22198k = java.util.Collections.unmodifiableList(this.f22198k);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22196h = c2631d.i();
        }
    }
}
