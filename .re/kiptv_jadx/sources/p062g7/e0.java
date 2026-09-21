package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 extends p110m7.o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p062g7.e0 f22184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p062g7.C2154a f22185m = new p062g7.C2154a(23);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f22187i;
    public byte j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22188k;

    static {
        p062g7.e0 e0Var = new p062g7.e0();
        f22184l = e0Var;
        e0Var.f22187i = java.util.Collections.EMPTY_LIST;
    }

    public e0() {
        this.j = (byte) -1;
        this.f22188k = -1;
        this.f22186h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22188k;
        if (i3 != -1) {
            return i3;
        }
        int iO = 0;
        for (int i9 = 0; i9 < this.f22187i.size(); i9++) {
            iO += Z2.M.o(1, (p110m7.AbstractC2629b) this.f22187i.get(i9));
        }
        int size = this.f22186h.size() + iO;
        this.f22188k = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        p062g7.C2166m c2166m = new p062g7.C2166m(2);
        c2166m.f22276k = java.util.Collections.EMPTY_LIST;
        return c2166m;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.C2166m c2166m = new p062g7.C2166m(2);
        c2166m.f22276k = java.util.Collections.EMPTY_LIST;
        c2166m.l(this);
        return c2166m;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        for (int i3 = 0; i3 < this.f22187i.size(); i3++) {
            m8.b0(1, (p110m7.AbstractC2629b) this.f22187i.get(i3));
        }
        m8.e0(this.f22186h);
    }

    public final p062g7.C2166m h() {
        p062g7.C2166m c2166m = new p062g7.C2166m(2);
        c2166m.f22276k = java.util.Collections.EMPTY_LIST;
        c2166m.l(this);
        return c2166m;
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        if (this.j == 1) {
            return true;
        }
        this.j = (byte) 1;
        return true;
    }

    public e0(p062g7.C2166m c2166m) {
        this.j = (byte) -1;
        this.f22188k = -1;
        this.f22186h = c2166m.f25492h;
    }

    public e0(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.j = (byte) -1;
        this.f22188k = -1;
        this.f22187i = java.util.Collections.EMPTY_LIST;
        p110m7.C2631d c2631d = new p110m7.C2631d();
        Z2.M mH = Z2.M.H(c2631d, 1);
        boolean z6 = false;
        boolean z9 = false;
        while (!z6) {
            try {
                try {
                    int iN = c2633f.n();
                    if (iN != 0) {
                        if (iN != 10) {
                            if (!c2633f.q(iN, mH)) {
                            }
                        } else {
                            if (!z9) {
                                this.f22187i = new java.util.ArrayList();
                                z9 = true;
                            }
                            this.f22187i.add(c2633f.g(p062g7.d0.f22167s, c2635h));
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
                if (z9) {
                    this.f22187i = java.util.Collections.unmodifiableList(this.f22187i);
                }
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f22186h = c2631d.i();
                }
                throw th;
            }
        }
        if (z9) {
            this.f22187i = java.util.Collections.unmodifiableList(this.f22187i);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22186h = c2631d.i();
        }
    }
}
