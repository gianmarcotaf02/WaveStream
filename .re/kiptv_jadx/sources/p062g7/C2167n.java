package p062g7;

/* JADX INFO: renamed from: g7.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2167n extends p110m7.o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p062g7.C2167n f22277l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p062g7.C2154a f22278m = new p062g7.C2154a(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f22279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f22280i;
    public byte j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22281k;

    static {
        p062g7.C2167n c2167n = new p062g7.C2167n();
        f22277l = c2167n;
        c2167n.f22280i = java.util.Collections.EMPTY_LIST;
    }

    public C2167n() {
        this.j = (byte) -1;
        this.f22281k = -1;
        this.f22279h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f22281k;
        if (i3 != -1) {
            return i3;
        }
        int iO = 0;
        for (int i9 = 0; i9 < this.f22280i.size(); i9++) {
            iO += Z2.M.o(1, (p110m7.AbstractC2629b) this.f22280i.get(i9));
        }
        int size = this.f22279h.size() + iO;
        this.f22281k = size;
        return size;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        p062g7.C2166m c2166m = new p062g7.C2166m(0);
        c2166m.f22276k = java.util.Collections.EMPTY_LIST;
        return c2166m;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.C2166m c2166m = new p062g7.C2166m(0);
        c2166m.f22276k = java.util.Collections.EMPTY_LIST;
        c2166m.i(this);
        return c2166m;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        for (int i3 = 0; i3 < this.f22280i.size(); i3++) {
            m8.b0(1, (p110m7.AbstractC2629b) this.f22280i.get(i3));
        }
        m8.e0(this.f22279h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        byte b9 = this.j;
        if (b9 == 1) {
            return true;
        }
        if (b9 == 0) {
            return false;
        }
        for (int i3 = 0; i3 < this.f22280i.size(); i3++) {
            if (!((p062g7.r) this.f22280i.get(i3)).isInitialized()) {
                this.j = (byte) 0;
                return false;
            }
        }
        this.j = (byte) 1;
        return true;
    }

    public C2167n(p062g7.C2166m c2166m) {
        this.j = (byte) -1;
        this.f22281k = -1;
        this.f22279h = c2166m.f25492h;
    }

    public C2167n(p110m7.C2633f c2633f, p110m7.C2635h c2635h) {
        this.j = (byte) -1;
        this.f22281k = -1;
        this.f22280i = java.util.Collections.EMPTY_LIST;
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
                                this.f22280i = new java.util.ArrayList();
                                z9 = true;
                            }
                            this.f22280i.add(c2633f.g(p062g7.r.f22295q, c2635h));
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
                    this.f22280i = java.util.Collections.unmodifiableList(this.f22280i);
                }
                try {
                    mH.y();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f22279h = c2631d.i();
                }
                throw th;
            }
        }
        if (z9) {
            this.f22280i = java.util.Collections.unmodifiableList(this.f22280i);
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f22279h = c2631d.i();
        }
    }
}
