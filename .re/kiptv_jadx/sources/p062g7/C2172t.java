package p062g7;

/* JADX INFO: renamed from: g7.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2172t extends p110m7.AbstractC2639l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p062g7.C2172t f22305n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p062g7.C2154a f22306o = new p062g7.C2154a(7);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22307i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f22309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22310m;

    static {
        p062g7.C2172t c2172t = new p062g7.C2172t();
        f22305n = c2172t;
        c2172t.f22308k = 0;
    }

    public C2172t(p062g7.C2171s c2171s) {
        super(c2171s);
        this.f22309l = (byte) -1;
        this.f22310m = -1;
        this.f22307i = c2171s.f25492h;
    }

    @Override // p110m7.v
    public final p110m7.AbstractC2629b a() {
        return f22305n;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22310m;
        if (i3 != -1) {
            return i3;
        }
        int size = this.f22307i.size() + i() + ((this.j & 1) == 1 ? Z2.M.m(1, this.f22308k) : 0);
        this.f22310m = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return new p062g7.C2171s();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.C2171s c2171s = new p062g7.C2171s();
        c2171s.f(this);
        return c2171s;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        p079i7.f fVar = new p079i7.f(this);
        if ((this.j & 1) == 1) {
            m8.Z(1, this.f22308k);
        }
        fVar.X0(200, m8);
        m8.e0(this.f22307i);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22309l;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        if (h()) {
            this.f22309l = (byte) 1;
            return true;
        }
        this.f22309l = (byte) 0;
        return false;
    }

    public C2172t() {
        this.f22309l = (byte) -1;
        this.f22310m = -1;
        this.f22307i = p110m7.AbstractC2632e.f25476h;
    }

    public C2172t(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.f22309l = (byte) -1;
        this.f22310m = -1;
        boolean z6 = false;
        this.f22308k = 0;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        if (iN != 8) {
                            if (!m(c2633f, mH, c2635h, iN)) {
                            }
                        } else {
                            this.j |= 1;
                            this.f22308k = c2633f.k();
                        }
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    try {
                        mH.y();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f22307i = c2631d.i();
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
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22307i = c2631d.i();
        }
        l();
    }
}
