package j7;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends p110m7.o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j7.j f24314n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p062g7.C2154a f24315o = new p062g7.C2154a(27);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f24316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f24317i;
    public java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f24319l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f24320m;

    static {
        j7.j jVar = new j7.j();
        f24314n = jVar;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        jVar.f24317i = list;
        jVar.j = list;
    }

    public j() {
        this.f24318k = -1;
        this.f24319l = (byte) -1;
        this.f24320m = -1;
        this.f24316h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f24320m;
        if (i3 != -1) {
            return i3;
        }
        int iO = 0;
        for (int i9 = 0; i9 < this.f24317i.size(); i9++) {
            iO += Z2.M.o(1, (p110m7.AbstractC2629b) this.f24317i.get(i9));
        }
        int iN = 0;
        for (int i10 = 0; i10 < this.j.size(); i10++) {
            iN += Z2.M.n(((java.lang.Integer) this.j.get(i10)).intValue());
        }
        int iN2 = iO + iN;
        if (!this.j.isEmpty()) {
            iN2 = iN2 + 1 + Z2.M.n(iN);
        }
        this.f24318k = iN;
        int size = this.f24316h.size() + iN2;
        this.f24320m = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        j7.f fVar = new j7.f();
        java.util.List list = java.util.Collections.EMPTY_LIST;
        fVar.j = list;
        fVar.f24290k = list;
        return fVar;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        j7.f fVar = new j7.f();
        java.util.List list = java.util.Collections.EMPTY_LIST;
        fVar.j = list;
        fVar.f24290k = list;
        fVar.f(this);
        return fVar;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        for (int i3 = 0; i3 < this.f24317i.size(); i3++) {
            m8.b0(1, (p110m7.AbstractC2629b) this.f24317i.get(i3));
        }
        if (this.j.size() > 0) {
            m8.i0(42);
            m8.i0(this.f24318k);
        }
        for (int i9 = 0; i9 < this.j.size(); i9++) {
            m8.a0(((java.lang.Integer) this.j.get(i9)).intValue());
        }
        m8.e0(this.f24316h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        if (this.f24319l == 1) {
            return true;
        }
        this.f24319l = (byte) 1;
        return true;
    }

    public j(j7.f fVar) {
        this.f24318k = -1;
        this.f24319l = (byte) -1;
        this.f24320m = -1;
        this.f24316h = fVar.f25492h;
    }

    public j(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.f24318k = -1;
        this.f24319l = (byte) -1;
        this.f24320m = -1;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        this.f24317i = list;
        this.j = list;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        boolean z6 = false;
        int i3 = 0;
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i3 & 1) != 1) {
                                this.f24317i = new java.util.ArrayList();
                                i3 |= 1;
                            }
                            this.f24317i.add(c2633f.g(j7.i.f24302u, c2635h));
                        } else if (iN == 40) {
                            if ((i3 & 2) != 2) {
                                this.j = new java.util.ArrayList();
                                i3 |= 2;
                            }
                            this.j.add(java.lang.Integer.valueOf(c2633f.k()));
                        } else if (iN != 42) {
                            if (!c2633f.q(iN, mH)) {
                            }
                        } else {
                            int iD = c2633f.d(c2633f.k());
                            if ((i3 & 2) != 2 && c2633f.b() > 0) {
                                this.j = new java.util.ArrayList();
                                i3 |= 2;
                            }
                            while (c2633f.b() > 0) {
                                this.j.add(java.lang.Integer.valueOf(c2633f.k()));
                            }
                            c2633f.c(iD);
                        }
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
                if ((i3 & 1) == 1) {
                    this.f24317i = java.util.Collections.unmodifiableList(this.f24317i);
                }
                if ((i3 & 2) == 2) {
                    this.j = java.util.Collections.unmodifiableList(this.j);
                }
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f24316h = c2631d.i();
                }
                throw th;
            }
        }
        if ((i3 & 1) == 1) {
            this.f24317i = java.util.Collections.unmodifiableList(this.f24317i);
        }
        if ((i3 & 2) == 2) {
            this.j = java.util.Collections.unmodifiableList(this.j);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f24316h = c2631d.i();
        }
    }
}
