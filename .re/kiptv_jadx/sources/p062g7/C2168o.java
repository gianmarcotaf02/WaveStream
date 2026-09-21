package p062g7;

/* JADX INFO: renamed from: g7.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2168o extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22282i;
    public p062g7.EnumC2169p j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.List f22283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p062g7.C2175w f22284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p062g7.EnumC2170q f22285m;

    public static p062g7.C2168o f() {
        p062g7.C2168o c2168o = new p062g7.C2168o();
        c2168o.j = p062g7.EnumC2169p.RETURNS_CONSTANT;
        c2168o.f22283k = java.util.Collections.EMPTY_LIST;
        c2168o.f22284l = p062g7.C2175w.f22322s;
        c2168o.f22285m = p062g7.EnumC2170q.AT_MOST_ONCE;
        return c2168o;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.r rVarE = e();
        if (rVarE.isInitialized()) {
            return rVarE;
        }
        throw new I3.b(12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.r rVar = null;
        try {
            try {
                p062g7.r.f22295q.getClass();
                g(new p062g7.r(c2633f, c2635h));
                return this;
            } catch (p110m7.r e6) {
                p062g7.r rVar2 = (p062g7.r) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    rVar = rVar2;
                    if (rVar != null) {
                        g(rVar);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (rVar != null) {
                g(rVar);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.C2168o c2168oF = f();
        c2168oF.g(e());
        return c2168oF;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        g((p062g7.r) oVar);
        return this;
    }

    public final p062g7.r e() {
        p062g7.r rVar = new p062g7.r(this);
        int i3 = this.f22282i;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        rVar.j = this.j;
        if ((i3 & 2) == 2) {
            this.f22283k = java.util.Collections.unmodifiableList(this.f22283k);
            this.f22282i &= -3;
        }
        rVar.f22298k = this.f22283k;
        if ((i3 & 4) == 4) {
            i9 |= 2;
        }
        rVar.f22299l = this.f22284l;
        if ((i3 & 8) == 8) {
            i9 |= 4;
        }
        rVar.f22300m = this.f22285m;
        rVar.f22297i = i9;
        return rVar;
    }

    public final void g(p062g7.r rVar) {
        p062g7.C2175w c2175w;
        if (rVar == p062g7.r.f22294p) {
            return;
        }
        if ((rVar.f22297i & 1) == 1) {
            p062g7.EnumC2169p enumC2169p = rVar.j;
            enumC2169p.getClass();
            this.f22282i |= 1;
            this.j = enumC2169p;
        }
        if (!rVar.f22298k.isEmpty()) {
            if (this.f22283k.isEmpty()) {
                this.f22283k = rVar.f22298k;
                this.f22282i &= -3;
            } else {
                if ((this.f22282i & 2) != 2) {
                    this.f22283k = new java.util.ArrayList(this.f22283k);
                    this.f22282i |= 2;
                }
                this.f22283k.addAll(rVar.f22298k);
            }
        }
        if ((rVar.f22297i & 2) == 2) {
            p062g7.C2175w c2175w2 = rVar.f22299l;
            if ((this.f22282i & 4) != 4 || (c2175w = this.f22284l) == p062g7.C2175w.f22322s) {
                this.f22284l = c2175w2;
            } else {
                p062g7.C2173u c2173uF = p062g7.C2173u.f();
                c2173uF.g(c2175w);
                c2173uF.g(c2175w2);
                this.f22284l = c2173uF.e();
            }
            this.f22282i |= 4;
        }
        if ((rVar.f22297i & 4) == 4) {
            p062g7.EnumC2170q enumC2170q = rVar.f22300m;
            enumC2170q.getClass();
            this.f22282i |= 8;
            this.f22285m = enumC2170q;
        }
        this.f25492h = this.f25492h.e(rVar.f22296h);
    }
}
