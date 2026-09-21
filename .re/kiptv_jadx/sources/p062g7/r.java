package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends p110m7.o {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p062g7.r f22294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p062g7.C2154a f22295q = new p062g7.C2154a(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22296h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22297i;
    public p062g7.EnumC2169p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.List f22298k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p062g7.C2175w f22299l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p062g7.EnumC2170q f22300m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte f22301n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22302o;

    static {
        p062g7.r rVar = new p062g7.r();
        f22294p = rVar;
        rVar.j = p062g7.EnumC2169p.RETURNS_CONSTANT;
        rVar.f22298k = java.util.Collections.EMPTY_LIST;
        rVar.f22299l = p062g7.C2175w.f22322s;
        rVar.f22300m = p062g7.EnumC2170q.AT_MOST_ONCE;
    }

    public r() {
        this.f22301n = (byte) -1;
        this.f22302o = -1;
        this.f22296h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22302o;
        if (i3 != -1) {
            return i3;
        }
        int iL = (this.f22297i & 1) == 1 ? Z2.M.l(1, this.j.f22289h) : 0;
        for (int i9 = 0; i9 < this.f22298k.size(); i9++) {
            iL += Z2.M.o(2, (p110m7.AbstractC2629b) this.f22298k.get(i9));
        }
        if ((this.f22297i & 2) == 2) {
            iL += Z2.M.o(3, this.f22299l);
        }
        if ((this.f22297i & 4) == 4) {
            iL += Z2.M.l(4, this.f22300m.f22293h);
        }
        int size = this.f22296h.size() + iL;
        this.f22302o = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.C2168o.f();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.C2168o c2168oF = p062g7.C2168o.f();
        c2168oF.g(this);
        return c2168oF;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        if ((this.f22297i & 1) == 1) {
            m8.Y(1, this.j.f22289h);
        }
        for (int i3 = 0; i3 < this.f22298k.size(); i3++) {
            m8.b0(2, (p110m7.AbstractC2629b) this.f22298k.get(i3));
        }
        if ((this.f22297i & 2) == 2) {
            m8.b0(3, this.f22299l);
        }
        if ((this.f22297i & 4) == 4) {
            m8.Y(4, this.f22300m.f22293h);
        }
        m8.e0(this.f22296h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22301n;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        for (int i3 = 0; i3 < this.f22298k.size(); i3++) {
            if (!((p062g7.C2175w) this.f22298k.get(i3)).isInitialized()) {
                this.f22301n = (byte) 0;
                return false;
            }
        }
        if ((this.f22297i & 2) != 2 || this.f22299l.isInitialized()) {
            this.f22301n = (byte) 1;
            return true;
        }
        this.f22301n = (byte) 0;
        return false;
    }

    public r(p062g7.C2168o c2168o) {
        this.f22301n = (byte) -1;
        this.f22302o = -1;
        this.f22296h = c2168o.f25492h;
    }

    public r(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.f22301n = (byte) -1;
        this.f22302o = -1;
        p062g7.EnumC2169p enumC2169p = p062g7.EnumC2169p.RETURNS_CONSTANT;
        this.j = enumC2169p;
        this.f22298k = java.util.Collections.EMPTY_LIST;
        this.f22299l = p062g7.C2175w.f22322s;
        p062g7.EnumC2170q enumC2170q = p062g7.EnumC2170q.AT_MOST_ONCE;
        this.f22300m = enumC2170q;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        boolean z6 = false;
        char c9 = 0;
        while (!z6) {
            try {
                try {
                    try {
                        int iN = c2633f.n();
                        if (iN != 0) {
                            p062g7.EnumC2170q enumC2170q2 = null;
                            p062g7.EnumC2169p enumC2169p2 = null;
                            p062g7.C2173u c2173uF = null;
                            if (iN == 8) {
                                int iK = c2633f.k();
                                if (iK == 0) {
                                    enumC2169p2 = enumC2169p;
                                } else if (iK == 1) {
                                    enumC2169p2 = p062g7.EnumC2169p.CALLS;
                                } else if (iK == 2) {
                                    enumC2169p2 = p062g7.EnumC2169p.RETURNS_NOT_NULL;
                                }
                                if (enumC2169p2 == null) {
                                    mH.i0(iN);
                                    mH.i0(iK);
                                } else {
                                    this.f22297i |= 1;
                                    this.j = enumC2169p2;
                                }
                            } else if (iN == 18) {
                                int i3 = (c9 == true ? 1 : 0) & 2;
                                c9 = c9;
                                if (i3 != 2) {
                                    this.f22298k = new java.util.ArrayList();
                                    c9 = 2;
                                }
                                this.f22298k.add(c2633f.g(p062g7.C2175w.f22323t, c2635h));
                            } else if (iN == 26) {
                                if ((this.f22297i & 2) == 2) {
                                    p062g7.C2175w c2175w = this.f22299l;
                                    c2175w.getClass();
                                    c2173uF = p062g7.C2173u.f();
                                    c2173uF.g(c2175w);
                                }
                                p062g7.C2175w c2175w2 = (p062g7.C2175w) c2633f.g(p062g7.C2175w.f22323t, c2635h);
                                this.f22299l = c2175w2;
                                if (c2173uF != null) {
                                    c2173uF.g(c2175w2);
                                    this.f22299l = c2173uF.e();
                                }
                                this.f22297i |= 2;
                            } else if (iN != 32) {
                                if (!c2633f.q(iN, mH)) {
                                }
                            } else {
                                int iK2 = c2633f.k();
                                if (iK2 == 0) {
                                    enumC2170q2 = enumC2170q;
                                } else if (iK2 == 1) {
                                    enumC2170q2 = p062g7.EnumC2170q.EXACTLY_ONCE;
                                } else if (iK2 == 2) {
                                    enumC2170q2 = p062g7.EnumC2170q.AT_LEAST_ONCE;
                                }
                                if (enumC2170q2 == null) {
                                    mH.i0(iN);
                                    mH.i0(iK2);
                                } else {
                                    this.f22297i |= 4;
                                    this.f22300m = enumC2170q2;
                                }
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
                if (((c9 == true ? 1 : 0) & 2) == 2) {
                    this.f22298k = java.util.Collections.unmodifiableList(this.f22298k);
                }
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f22296h = c2631d.i();
                }
                throw th;
            }
        }
        if (((c9 == true ? 1 : 0) & 2) == 2) {
            this.f22298k = java.util.Collections.unmodifiableList(this.f22298k);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22296h = c2631d.i();
        }
    }
}
