package j7;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends p110m7.o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j7.c f24267n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p062g7.C2154a f24268o = new p062g7.C2154a(25);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f24269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24270i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24271k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f24272l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24273m;

    static {
        j7.c cVar = new j7.c();
        f24267n = cVar;
        cVar.j = 0;
        cVar.f24271k = 0;
    }

    public c() {
        this.f24272l = (byte) -1;
        this.f24273m = -1;
        this.f24269h = p110m7.AbstractC2632e.f25476h;
    }

    public static j7.a h(j7.c cVar) {
        j7.a aVar = new j7.a(1);
        aVar.h(cVar);
        return aVar;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f24273m;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f24270i & 1) == 1 ? Z2.M.m(1, this.j) : 0;
        if ((this.f24270i & 2) == 2) {
            iM += Z2.M.m(2, this.f24271k);
        }
        int size = this.f24269h.size() + iM;
        this.f24273m = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return new j7.a(1);
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        return h(this);
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        if ((this.f24270i & 1) == 1) {
            m8.Z(1, this.j);
        }
        if ((this.f24270i & 2) == 2) {
            m8.Z(2, this.f24271k);
        }
        m8.e0(this.f24269h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        if (this.f24272l == 1) {
            return true;
        }
        this.f24272l = (byte) 1;
        return true;
    }

    public c(j7.a aVar) {
        this.f24272l = (byte) -1;
        this.f24273m = -1;
        this.f24269h = aVar.f25492h;
    }

    public c(p110m7.C2633f c2633f) {
        this.f24272l = (byte) -1;
        this.f24273m = -1;
        boolean z6 = false;
        this.j = 0;
        this.f24271k = 0;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f24270i |= 1;
                                this.j = c2633f.k();
                            } else if (iN != 16) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                this.f24270i |= 2;
                                this.f24271k = c2633f.k();
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
                    this.f24269h = c2631d.i();
                }
                throw th;
            }
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f24269h = c2631d.i();
        }
    }
}
