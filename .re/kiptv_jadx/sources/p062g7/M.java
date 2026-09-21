package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21990i;
    public p062g7.N j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p062g7.Q f21991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21992l;

    public static p062g7.M f() {
        p062g7.M m8 = new p062g7.M();
        m8.j = p062g7.N.INV;
        m8.f21991k = p062g7.Q.f22020A;
        return m8;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.O oE = e();
        if (oE.isInitialized()) {
            return oE;
        }
        throw new I3.b(12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.O o8 = null;
        try {
            try {
                p062g7.O.f21999p.getClass();
                g(new p062g7.O(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                p062g7.O o9 = (p062g7.O) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    o8 = o9;
                    if (o8 != null) {
                        g(o8);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (o8 != null) {
                g(o8);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.M mF = f();
        mF.g(e());
        return mF;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        g((p062g7.O) oVar);
        return this;
    }

    public final p062g7.O e() {
        p062g7.O o8 = new p062g7.O(this);
        int i3 = this.f21990i;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        o8.j = this.j;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        o8.f22002k = this.f21991k;
        if ((i3 & 4) == 4) {
            i9 |= 4;
        }
        o8.f22003l = this.f21992l;
        o8.f22001i = i9;
        return o8;
    }

    public final void g(p062g7.O o8) {
        p062g7.Q q9;
        if (o8 == p062g7.O.f21998o) {
            return;
        }
        if ((o8.f22001i & 1) == 1) {
            p062g7.N n3 = o8.j;
            n3.getClass();
            this.f21990i = 1 | this.f21990i;
            this.j = n3;
        }
        if ((o8.f22001i & 2) == 2) {
            p062g7.Q q10 = o8.f22002k;
            if ((this.f21990i & 2) != 2 || (q9 = this.f21991k) == p062g7.Q.f22020A) {
                this.f21991k = q10;
            } else {
                p062g7.P p2 = p062g7.Q.p(q9);
                p2.h(q10);
                this.f21991k = p2.f();
            }
            this.f21990i |= 2;
        }
        if ((o8.f22001i & 4) == 4) {
            int i3 = o8.f22003l;
            this.f21990i = 4 | this.f21990i;
            this.f21992l = i3;
        }
        this.f25492h = this.f25492h.e(o8.f22000h);
    }
}
