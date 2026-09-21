package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends p110m7.o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p062g7.X f22085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p062g7.C2154a f22086o = new p062g7.C2154a(20);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22087h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22088i;
    public java.util.List j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte f22090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22091m;

    static {
        p062g7.X x9 = new p062g7.X();
        f22085n = x9;
        x9.j = java.util.Collections.EMPTY_LIST;
        x9.f22089k = -1;
    }

    public X() {
        this.f22090l = (byte) -1;
        this.f22091m = -1;
        this.f22087h = p110m7.AbstractC2632e.f25476h;
    }

    public static p062g7.C2159f h(p062g7.X x9) {
        p062g7.C2159f c2159fH = p062g7.C2159f.h();
        c2159fH.k(x9);
        return c2159fH;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22091m;
        if (i3 != -1) {
            return i3;
        }
        int iM = 0;
        for (int i9 = 0; i9 < this.j.size(); i9++) {
            iM += Z2.M.o(1, (p110m7.AbstractC2629b) this.j.get(i9));
        }
        if ((this.f22088i & 1) == 1) {
            iM += Z2.M.m(2, this.f22089k);
        }
        int size = this.f22087h.size() + iM;
        this.f22091m = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        return p062g7.C2159f.h();
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        return h(this);
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            m8.b0(1, (p110m7.AbstractC2629b) this.j.get(i3));
        }
        if ((this.f22088i & 1) == 1) {
            m8.Z(2, this.f22089k);
        }
        m8.e0(this.f22087h);
    }

    public final p062g7.C2159f i() {
        return h(this);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.f22090l;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        for (int i3 = 0; i3 < this.j.size(); i3++) {
            if (!((p062g7.Q) this.j.get(i3)).isInitialized()) {
                this.f22090l = (byte) 0;
                return false;
            }
        }
        this.f22090l = (byte) 1;
        return true;
    }

    public X(p062g7.C2159f c2159f) {
        this.f22090l = (byte) -1;
        this.f22091m = -1;
        this.f22087h = c2159f.f25492h;
    }

    public X(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.f22090l = (byte) -1;
        this.f22091m = -1;
        this.j = java.util.Collections.EMPTY_LIST;
        this.f22089k = -1;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        boolean z6 = false;
        boolean z9 = false;
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if (!z9) {
                                this.j = new java.util.ArrayList();
                                z9 = true;
                            }
                            this.j.add(c2633f.g(p062g7.Q.f22021B, c2635h));
                        } else if (iN != 16) {
                            if (!c2633f.q(iN, mH)) {
                            }
                        } else {
                            this.f22088i |= 1;
                            this.f22089k = c2633f.k();
                        }
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    if (z9) {
                        this.j = java.util.Collections.unmodifiableList(this.j);
                    }
                    try {
                        mH.y();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f22087h = c2631d.i();
                    }
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
            this.j = java.util.Collections.unmodifiableList(this.j);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22087h = c2631d.i();
        }
    }
}
