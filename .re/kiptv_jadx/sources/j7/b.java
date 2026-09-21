package j7;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends p110m7.o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j7.b f24260n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p062g7.C2154a f24261o = new p062g7.C2154a(24);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f24262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24263i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f24265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24266m;

    static {
        j7.b bVar = new j7.b();
        f24260n = bVar;
        bVar.j = 0;
        bVar.f24264k = 0;
    }

    public b() {
        this.f24265l = (byte) -1;
        this.f24266m = -1;
        this.f24262h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f24266m;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f24263i & 1) == 1 ? Z2.M.m(1, this.j) : 0;
        if ((this.f24263i & 2) == 2) {
            iM += Z2.M.m(2, this.f24264k);
        }
        int size = this.f24262h.size() + iM;
        this.f24266m = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return new j7.a(0);
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        j7.a aVar = new j7.a(0);
        aVar.g(this);
        return aVar;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        if ((this.f24263i & 1) == 1) {
            m8.Z(1, this.j);
        }
        if ((this.f24263i & 2) == 2) {
            m8.Z(2, this.f24264k);
        }
        m8.e0(this.f24262h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        if (this.f24265l == 1) {
            return true;
        }
        this.f24265l = (byte) 1;
        return true;
    }

    public b(j7.a aVar) {
        this.f24265l = (byte) -1;
        this.f24266m = -1;
        this.f24262h = aVar.f25492h;
    }

    public b(p110m7.C2633f c2633f) {
        this.f24265l = (byte) -1;
        this.f24266m = -1;
        boolean z6 = false;
        this.j = 0;
        this.f24264k = 0;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f24263i |= 1;
                                this.j = c2633f.k();
                            } else if (iN != 16) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                this.f24263i |= 2;
                                this.f24264k = c2633f.k();
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
                    this.f24262h = c2631d.i();
                }
                throw th;
            }
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f24262h = c2631d.i();
        }
    }
}
