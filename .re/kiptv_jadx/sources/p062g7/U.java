package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends p110m7.AbstractC2638k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p062g7.V f22066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.List f22067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.util.List f22068q;

    public static p062g7.U g() {
        p062g7.U u6 = new p062g7.U();
        u6.f22066o = p062g7.V.INV;
        java.util.List list = java.util.Collections.EMPTY_LIST;
        u6.f22067p = list;
        u6.f22068q = list;
        return u6;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.W wF = f();
        if (wF.isInitialized()) {
            return wF;
        }
        throw new I3.b(12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.W w6 = null;
        try {
            try {
                p062g7.W.f22074u.getClass();
                h(new p062g7.W(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                p062g7.W w9 = (p062g7.W) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    w6 = w9;
                    if (w6 != null) {
                        h(w6);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (w6 != null) {
                h(w6);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.U uG = g();
        uG.h(f());
        return uG;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        h((p062g7.W) oVar);
        return this;
    }

    public final p062g7.W f() {
        p062g7.W w6 = new p062g7.W(this);
        int i3 = this.f22062k;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        w6.f22076k = this.f22063l;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        w6.f22077l = this.f22064m;
        if ((i3 & 4) == 4) {
            i9 |= 4;
        }
        w6.f22078m = this.f22065n;
        if ((i3 & 8) == 8) {
            i9 |= 8;
        }
        w6.f22079n = this.f22066o;
        if ((i3 & 16) == 16) {
            this.f22067p = java.util.Collections.unmodifiableList(this.f22067p);
            this.f22062k &= -17;
        }
        w6.f22080o = this.f22067p;
        if ((this.f22062k & 32) == 32) {
            this.f22068q = java.util.Collections.unmodifiableList(this.f22068q);
            this.f22062k &= -33;
        }
        w6.f22081p = this.f22068q;
        w6.j = i9;
        return w6;
    }

    public final void h(p062g7.W w6) {
        if (w6 == p062g7.W.f22073t) {
            return;
        }
        int i3 = w6.j;
        if ((i3 & 1) == 1) {
            int i9 = w6.f22076k;
            this.f22062k = 1 | this.f22062k;
            this.f22063l = i9;
        }
        if ((i3 & 2) == 2) {
            int i10 = w6.f22077l;
            this.f22062k = 2 | this.f22062k;
            this.f22064m = i10;
        }
        if ((i3 & 4) == 4) {
            boolean z6 = w6.f22078m;
            this.f22062k = 4 | this.f22062k;
            this.f22065n = z6;
        }
        if ((i3 & 8) == 8) {
            p062g7.V v6 = w6.f22079n;
            v6.getClass();
            this.f22062k = 8 | this.f22062k;
            this.f22066o = v6;
        }
        if (!w6.f22080o.isEmpty()) {
            if (this.f22067p.isEmpty()) {
                this.f22067p = w6.f22080o;
                this.f22062k &= -17;
            } else {
                if ((this.f22062k & 16) != 16) {
                    this.f22067p = new java.util.ArrayList(this.f22067p);
                    this.f22062k |= 16;
                }
                this.f22067p.addAll(w6.f22080o);
            }
        }
        if (!w6.f22081p.isEmpty()) {
            if (this.f22068q.isEmpty()) {
                this.f22068q = w6.f22081p;
                this.f22062k &= -33;
            } else {
                if ((this.f22062k & 32) != 32) {
                    this.f22068q = new java.util.ArrayList(this.f22068q);
                    this.f22062k |= 32;
                }
                this.f22068q.addAll(w6.f22081p);
            }
        }
        e(w6);
        this.f25492h = this.f25492h.e(w6.f22075i);
    }
}
