package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class Y extends p110m7.AbstractC2638k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22094m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p062g7.Q f22095n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22096o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p062g7.Q f22097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f22098q;

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.Z zF = f();
        if (zF.isInitialized()) {
            return zF;
        }
        throw new I3.b(12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.Z z6 = null;
        try {
            try {
                p062g7.Z.f22100t.getClass();
                g(new p062g7.Z(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                p062g7.Z z9 = (p062g7.Z) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    z6 = z9;
                    if (z6 != null) {
                        g(z6);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (z6 != null) {
                g(z6);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.Y y = new p062g7.Y();
        p062g7.Q q9 = p062g7.Q.f22020A;
        y.f22095n = q9;
        y.f22097p = q9;
        y.g(f());
        return y;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        g((p062g7.Z) oVar);
        return this;
    }

    public final p062g7.Z f() {
        p062g7.Z z6 = new p062g7.Z(this);
        int i3 = this.f22092k;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        z6.f22102k = this.f22093l;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        z6.f22103l = this.f22094m;
        if ((i3 & 4) == 4) {
            i9 |= 4;
        }
        z6.f22104m = this.f22095n;
        if ((i3 & 8) == 8) {
            i9 |= 8;
        }
        z6.f22105n = this.f22096o;
        if ((i3 & 16) == 16) {
            i9 |= 16;
        }
        z6.f22106o = this.f22097p;
        if ((i3 & 32) == 32) {
            i9 |= 32;
        }
        z6.f22107p = this.f22098q;
        z6.j = i9;
        return z6;
    }

    public final void g(p062g7.Z z6) {
        p062g7.Q q9;
        p062g7.Q q10;
        if (z6 == p062g7.Z.f22099s) {
            return;
        }
        int i3 = z6.j;
        if ((i3 & 1) == 1) {
            int i9 = z6.f22102k;
            this.f22092k = 1 | this.f22092k;
            this.f22093l = i9;
        }
        if ((i3 & 2) == 2) {
            int i10 = z6.f22103l;
            this.f22092k = 2 | this.f22092k;
            this.f22094m = i10;
        }
        if ((i3 & 4) == 4) {
            p062g7.Q q11 = z6.f22104m;
            if ((this.f22092k & 4) != 4 || (q10 = this.f22095n) == p062g7.Q.f22020A) {
                this.f22095n = q11;
            } else {
                p062g7.P p2 = p062g7.Q.p(q10);
                p2.h(q11);
                this.f22095n = p2.f();
            }
            this.f22092k |= 4;
        }
        int i11 = z6.j;
        if ((i11 & 8) == 8) {
            int i12 = z6.f22105n;
            this.f22092k = 8 | this.f22092k;
            this.f22096o = i12;
        }
        if ((i11 & 16) == 16) {
            p062g7.Q q12 = z6.f22106o;
            if ((this.f22092k & 16) != 16 || (q9 = this.f22097p) == p062g7.Q.f22020A) {
                this.f22097p = q12;
            } else {
                p062g7.P p9 = p062g7.Q.p(q9);
                p9.h(q12);
                this.f22097p = p9.f();
            }
            this.f22092k |= 16;
        }
        if ((z6.j & 32) == 32) {
            int i13 = z6.f22107p;
            this.f22092k = 32 | this.f22092k;
            this.f22098q = i13;
        }
        e(z6);
        this.f25492h = this.f25492h.e(z6.f22101i);
    }
}
