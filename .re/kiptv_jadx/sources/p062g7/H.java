package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class H extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21965i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21966k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p062g7.I f21967l;

    public static p062g7.H f() {
        p062g7.H h9 = new p062g7.H();
        h9.j = -1;
        h9.f21967l = p062g7.I.PACKAGE;
        return h9;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.J jE = e();
        if (jE.isInitialized()) {
            return jE;
        }
        throw new I3.b(12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.J j = null;
        try {
            try {
                p062g7.J.f21973p.getClass();
                g(new p062g7.J(c2633f));
                return this;
            } catch (p110m7.r e6) {
                p062g7.J j9 = (p062g7.J) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    j = j9;
                    if (j != null) {
                        g(j);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (j != null) {
                g(j);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.H hF = f();
        hF.g(e());
        return hF;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        g((p062g7.J) oVar);
        return this;
    }

    public final p062g7.J e() {
        p062g7.J j = new p062g7.J(this);
        int i3 = this.f21965i;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        j.j = this.j;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        j.f21976k = this.f21966k;
        if ((i3 & 4) == 4) {
            i9 |= 4;
        }
        j.f21977l = this.f21967l;
        j.f21975i = i9;
        return j;
    }

    public final void g(p062g7.J j) {
        if (j == p062g7.J.f21972o) {
            return;
        }
        int i3 = j.f21975i;
        if ((i3 & 1) == 1) {
            int i9 = j.j;
            this.f21965i = 1 | this.f21965i;
            this.j = i9;
        }
        if ((i3 & 2) == 2) {
            int i10 = j.f21976k;
            this.f21965i = 2 | this.f21965i;
            this.f21966k = i10;
        }
        if ((i3 & 4) == 4) {
            p062g7.I i11 = j.f21977l;
            i11.getClass();
            this.f21965i = 4 | this.f21965i;
            this.f21967l = i11;
        }
        this.f25492h = this.f25492h.e(j.f21974h);
    }
}
