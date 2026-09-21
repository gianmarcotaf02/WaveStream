package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class L extends p110m7.o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p062g7.L f21985l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p062g7.C2154a f21986m = new p062g7.C2154a(15);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p110m7.AbstractC2632e f21987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p110m7.t f21988i;
    public byte j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21989k;

    static {
        p062g7.L l2 = new p062g7.L();
        f21985l = l2;
        l2.f21988i = p110m7.s.f25504i;
    }

    public L() {
        this.j = (byte) -1;
        this.f21989k = -1;
        this.f21987h = p110m7.AbstractC2632e.f25476h;
    }

    @Override // p110m7.AbstractC2629b
    public final int b() {
        int i3 = this.f21989k;
        if (i3 != -1) {
            return i3;
        }
        int size = 0;
        for (int i9 = 0; i9 < this.f21988i.size(); i9++) {
            p110m7.AbstractC2632e abstractC2632eI = this.f21988i.i(i9);
            size += abstractC2632eI.size() + Z2.M.q(abstractC2632eI.size());
        }
        int size2 = this.f21987h.size() + this.f21988i.size() + size;
        this.f21989k = size2;
        return size2;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j c() {
        p062g7.C2166m c2166m = new p062g7.C2166m(3);
        c2166m.f22276k = p110m7.s.f25504i;
        return c2166m;
    }

    @Override // p110m7.AbstractC2629b
    public final p110m7.AbstractC2637j d() {
        p062g7.C2166m c2166m = new p062g7.C2166m(3);
        c2166m.f22276k = p110m7.s.f25504i;
        c2166m.k(this);
        return c2166m;
    }

    @Override // p110m7.AbstractC2629b
    public final void e(Z2.M m8) throws java.io.IOException {
        b();
        for (int i3 = 0; i3 < this.f21988i.size(); i3++) {
            p110m7.AbstractC2632e abstractC2632eI = this.f21988i.i(i3);
            m8.k0(1, 2);
            m8.i0(abstractC2632eI.size());
            m8.e0(abstractC2632eI);
        }
        m8.e0(this.f21987h);
    }

    @Override // p110m7.v
    public final boolean isInitialized() {
        if (this.j == 1) {
            return true;
        }
        this.j = (byte) 1;
        return true;
    }

    public L(p062g7.C2166m c2166m) {
        this.j = (byte) -1;
        this.f21989k = -1;
        this.f21987h = c2166m.f25492h;
    }

    public L(p110m7.C2633f c2633f) {
        this.j = (byte) -1;
        this.f21989k = -1;
        this.f21988i = p110m7.s.f25504i;
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
                            p110m7.u uVarE = c2633f.e();
                            if (!z9) {
                                this.f21988i = new p110m7.s();
                                z9 = true;
                            }
                            this.f21988i.l(uVarE);
                        }
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    if (z9) {
                        this.f21988i = this.f21988i.c();
                    }
                    try {
                        mH.y();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f21987h = c2631d.i();
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
            this.f21988i = this.f21988i.c();
        }
        try {
            mH.y();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f21987h = c2631d.i();
        }
    }
}
