package j7;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends p110m7.o {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j7.i f24301t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p062g7.C2154a f24302u = new p062g7.C2154a(28);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f24303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24304i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f24306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j7.h f24307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.List f24308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f24309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.List f24310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f24311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f24312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24313s;

    static {
        j7.i iVar = new j7.i();
        f24301t = iVar;
        iVar.j = 1;
        iVar.f24305k = 0;
        iVar.f24306l = "";
        iVar.f24307m = j7.h.NONE;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        iVar.f24308n = list;
        iVar.f24310p = list;
    }

    public i() {
        this.f24309o = -1;
        this.f24311q = -1;
        this.f24312r = (byte) -1;
        this.f24313s = -1;
        this.f24303h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        p110m7.AbstractC2632e uVar;
        int i3 = this.f24313s;
        if (i3 != -1) {
            return i3;
        }
        int iM = (this.f24304i & 1) == 1 ? Z2.M.m(1, this.j) : 0;
        if ((this.f24304i & 2) == 2) {
            iM += Z2.M.m(2, this.f24305k);
        }
        if ((this.f24304i & 8) == 8) {
            iM += Z2.M.l(3, this.f24307m.f24300h);
        }
        int iN = 0;
        for (int i9 = 0; i9 < this.f24308n.size(); i9++) {
            iN += Z2.M.n(((java.lang.Integer) this.f24308n.get(i9)).intValue());
        }
        int iN2 = iM + iN;
        if (!this.f24308n.isEmpty()) {
            iN2 = iN2 + 1 + Z2.M.n(iN);
        }
        this.f24309o = iN;
        int iN3 = 0;
        for (int i10 = 0; i10 < this.f24310p.size(); i10++) {
            iN3 += Z2.M.n(((java.lang.Integer) this.f24310p.get(i10)).intValue());
        }
        int size = iN2 + iN3;
        if (!this.f24310p.isEmpty()) {
            size = size + 1 + Z2.M.n(iN3);
        }
        this.f24311q = iN3;
        if ((this.f24304i & 4) == 4) {
            java.lang.Object obj = this.f24306l;
            if (obj instanceof java.lang.String) {
                try {
                    uVar = new p110m7.u(((java.lang.String) obj).getBytes("UTF-8"));
                    this.f24306l = uVar;
                } catch (java.io.UnsupportedEncodingException e6) {
                    throw new java.lang.RuntimeException("UTF-8 not supported?", e6);
                }
            } else {
                uVar = (p110m7.AbstractC2632e) obj;
            }
            size += uVar.size() + Z2.M.q(uVar.size()) + Z2.M.s(6);
        }
        int size2 = this.f24303h.size() + size;
        this.f24313s = size2;
        return size2;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return j7.g.f();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        j7.g gVarF = j7.g.f();
        gVarF.g(this);
        return gVarF;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        p110m7.AbstractC2632e uVar;
        b();
        if ((this.f24304i & 1) == 1) {
            m8.Z(1, this.j);
        }
        if ((this.f24304i & 2) == 2) {
            m8.Z(2, this.f24305k);
        }
        if ((this.f24304i & 8) == 8) {
            m8.Y(3, this.f24307m.f24300h);
        }
        if (this.f24308n.size() > 0) {
            m8.i0(34);
            m8.i0(this.f24309o);
        }
        for (int i3 = 0; i3 < this.f24308n.size(); i3++) {
            m8.a0(((java.lang.Integer) this.f24308n.get(i3)).intValue());
        }
        if (this.f24310p.size() > 0) {
            m8.i0(42);
            m8.i0(this.f24311q);
        }
        for (int i9 = 0; i9 < this.f24310p.size(); i9++) {
            m8.a0(((java.lang.Integer) this.f24310p.get(i9)).intValue());
        }
        if ((this.f24304i & 4) == 4) {
            java.lang.Object obj = this.f24306l;
            if (obj instanceof java.lang.String) {
                try {
                    uVar = new p110m7.u(((java.lang.String) obj).getBytes("UTF-8"));
                    this.f24306l = uVar;
                } catch (java.io.UnsupportedEncodingException e6) {
                    throw new java.lang.RuntimeException("UTF-8 not supported?", e6);
                }
            } else {
                uVar = (p110m7.AbstractC2632e) obj;
            }
            m8.k0(6, 2);
            m8.i0(uVar.size());
            m8.e0(uVar);
        }
        m8.e0(this.f24303h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        if (this.f24312r == 1) {
            return true;
        }
        this.f24312r = (byte) 1;
        return true;
    }

    public i(j7.g gVar) {
        this.f24309o = -1;
        this.f24311q = -1;
        this.f24312r = (byte) -1;
        this.f24313s = -1;
        this.f24303h = gVar.f25492h;
    }

    public i(p110m7.C2633f c2633f) {
        j7.h hVar;
        this.f24309o = -1;
        this.f24311q = -1;
        this.f24312r = (byte) -1;
        this.f24313s = -1;
        this.j = 1;
        boolean z6 = false;
        this.f24305k = 0;
        this.f24306l = "";
        j7.h hVar2 = j7.h.NONE;
        this.f24307m = hVar2;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        this.f24308n = list;
        this.f24310p = list;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        int i3 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f24304i |= 1;
                                this.j = c2633f.k();
                            } else if (iN == 16) {
                                this.f24304i |= 2;
                                this.f24305k = c2633f.k();
                            } else if (iN == 24) {
                                int iK = c2633f.k();
                                if (iK == 0) {
                                    hVar = hVar2;
                                } else if (iK != 1) {
                                    hVar = iK != 2 ? null : j7.h.DESC_TO_CLASS_ID;
                                } else {
                                    hVar = j7.h.INTERNAL_TO_CLASS_ID;
                                }
                                if (hVar == null) {
                                    mH.i0(iN);
                                    mH.i0(iK);
                                } else {
                                    this.f24304i |= 8;
                                    this.f24307m = hVar;
                                }
                            } else if (iN == 32) {
                                if ((i3 & 16) != 16) {
                                    this.f24308n = new java.util.ArrayList();
                                    i3 |= 16;
                                }
                                this.f24308n.add(java.lang.Integer.valueOf(c2633f.k()));
                            } else if (iN == 34) {
                                int iD = c2633f.d(c2633f.k());
                                if ((i3 & 16) != 16 && c2633f.b() > 0) {
                                    this.f24308n = new java.util.ArrayList();
                                    i3 |= 16;
                                }
                                while (c2633f.b() > 0) {
                                    this.f24308n.add(java.lang.Integer.valueOf(c2633f.k()));
                                }
                                c2633f.c(iD);
                            } else if (iN == 40) {
                                if ((i3 & 32) != 32) {
                                    this.f24310p = new java.util.ArrayList();
                                    i3 |= 32;
                                }
                                this.f24310p.add(java.lang.Integer.valueOf(c2633f.k()));
                            } else if (iN == 42) {
                                int iD2 = c2633f.d(c2633f.k());
                                if ((i3 & 32) != 32 && c2633f.b() > 0) {
                                    this.f24310p = new java.util.ArrayList();
                                    i3 |= 32;
                                }
                                while (c2633f.b() > 0) {
                                    this.f24310p.add(java.lang.Integer.valueOf(c2633f.k()));
                                }
                                c2633f.c(iD2);
                            } else if (iN != 50) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                p110m7.u uVarE = c2633f.e();
                                this.f24304i |= 4;
                                this.f24306l = uVarE;
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
                if ((i3 & 16) == 16) {
                    this.f24308n = java.util.Collections.unmodifiableList(this.f24308n);
                }
                if ((i3 & 32) == 32) {
                    this.f24310p = java.util.Collections.unmodifiableList(this.f24310p);
                }
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f24303h = c2631d.i();
                }
                throw th;
            }
        }
        if ((i3 & 16) == 16) {
            this.f24308n = java.util.Collections.unmodifiableList(this.f24308n);
        }
        if ((i3 & 32) == 32) {
            this.f24310p = java.util.Collections.unmodifiableList(this.f24310p);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f24303h = c2631d.i();
        }
    }
}
