package p062g7;

/* JADX INFO: renamed from: g7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2155b extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22117i;
    public p062g7.EnumC2156c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f22119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f22120m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22121n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22122o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22123p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p062g7.C2160g f22124q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.util.List f22125r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f22126s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22127t;

    public static p062g7.C2155b f() {
        p062g7.C2155b c2155b = new p062g7.C2155b();
        c2155b.j = p062g7.EnumC2156c.BYTE;
        c2155b.f22124q = p062g7.C2160g.f22194n;
        c2155b.f22125r = java.util.Collections.EMPTY_LIST;
        return c2155b;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.C2157d c2157dE = e();
        if (c2157dE.isInitialized()) {
            return c2157dE;
        }
        throw new I3.b(12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.C2157d c2157d = null;
        try {
            try {
                p062g7.C2157d.f22151x.getClass();
                g(new p062g7.C2157d(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                p062g7.C2157d c2157d2 = (p062g7.C2157d) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    c2157d = c2157d2;
                    if (c2157d != null) {
                        g(c2157d);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (c2157d != null) {
                g(c2157d);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.C2155b c2155bF = f();
        c2155bF.g(e());
        return c2155bF;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        g((p062g7.C2157d) oVar);
        return this;
    }

    public final p062g7.C2157d e() {
        p062g7.C2157d c2157d = new p062g7.C2157d(this);
        int i3 = this.f22117i;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        c2157d.j = this.j;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        c2157d.f22154k = this.f22118k;
        if ((i3 & 4) == 4) {
            i9 |= 4;
        }
        c2157d.f22155l = this.f22119l;
        if ((i3 & 8) == 8) {
            i9 |= 8;
        }
        c2157d.f22156m = this.f22120m;
        if ((i3 & 16) == 16) {
            i9 |= 16;
        }
        c2157d.f22157n = this.f22121n;
        if ((i3 & 32) == 32) {
            i9 |= 32;
        }
        c2157d.f22158o = this.f22122o;
        if ((i3 & 64) == 64) {
            i9 |= 64;
        }
        c2157d.f22159p = this.f22123p;
        if ((i3 & 128) == 128) {
            i9 |= 128;
        }
        c2157d.f22160q = this.f22124q;
        if ((i3 & 256) == 256) {
            this.f22125r = java.util.Collections.unmodifiableList(this.f22125r);
            this.f22117i &= -257;
        }
        c2157d.f22161r = this.f22125r;
        if ((i3 & 512) == 512) {
            i9 |= 256;
        }
        c2157d.f22162s = this.f22126s;
        if ((i3 & 1024) == 1024) {
            i9 |= 512;
        }
        c2157d.f22163t = this.f22127t;
        c2157d.f22153i = i9;
        return c2157d;
    }

    public final void g(p062g7.C2157d c2157d) {
        p062g7.C2160g c2160g;
        if (c2157d == p062g7.C2157d.f22150w) {
            return;
        }
        if ((c2157d.f22153i & 1) == 1) {
            p062g7.EnumC2156c enumC2156c = c2157d.j;
            enumC2156c.getClass();
            this.f22117i = 1 | this.f22117i;
            this.j = enumC2156c;
        }
        int i3 = c2157d.f22153i;
        if ((i3 & 2) == 2) {
            long j = c2157d.f22154k;
            this.f22117i |= 2;
            this.f22118k = j;
        }
        if ((i3 & 4) == 4) {
            float f9 = c2157d.f22155l;
            this.f22117i = 4 | this.f22117i;
            this.f22119l = f9;
        }
        if ((i3 & 8) == 8) {
            double d4 = c2157d.f22156m;
            this.f22117i |= 8;
            this.f22120m = d4;
        }
        if ((i3 & 16) == 16) {
            int i9 = c2157d.f22157n;
            this.f22117i = 16 | this.f22117i;
            this.f22121n = i9;
        }
        if ((i3 & 32) == 32) {
            int i10 = c2157d.f22158o;
            this.f22117i = 32 | this.f22117i;
            this.f22122o = i10;
        }
        if ((i3 & 64) == 64) {
            int i11 = c2157d.f22159p;
            this.f22117i = 64 | this.f22117i;
            this.f22123p = i11;
        }
        if ((i3 & 128) == 128) {
            p062g7.C2160g c2160g2 = c2157d.f22160q;
            if ((this.f22117i & 128) != 128 || (c2160g = this.f22124q) == p062g7.C2160g.f22194n) {
                this.f22124q = c2160g2;
            } else {
                p062g7.C2159f c2159f = new p062g7.C2159f(0);
                c2159f.f22190k = java.util.Collections.EMPTY_LIST;
                c2159f.j(c2160g);
                c2159f.j(c2160g2);
                this.f22124q = c2159f.f();
            }
            this.f22117i |= 128;
        }
        if (!c2157d.f22161r.isEmpty()) {
            if (this.f22125r.isEmpty()) {
                this.f22125r = c2157d.f22161r;
                this.f22117i &= -257;
            } else {
                if ((this.f22117i & 256) != 256) {
                    this.f22125r = new java.util.ArrayList(this.f22125r);
                    this.f22117i |= 256;
                }
                this.f22125r.addAll(c2157d.f22161r);
            }
        }
        int i12 = c2157d.f22153i;
        if ((i12 & 256) == 256) {
            int i13 = c2157d.f22162s;
            this.f22117i |= 512;
            this.f22126s = i13;
        }
        if ((i12 & 512) == 512) {
            int i14 = c2157d.f22163t;
            this.f22117i |= 1024;
            this.f22127t = i14;
        }
        this.f25492h = this.f25492h.e(c2157d.f22152h);
    }
}
