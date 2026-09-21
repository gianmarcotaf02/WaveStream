package p062g7;

/* JADX INFO: renamed from: g7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2159f extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22189i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f22190k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22191l;

    public /* synthetic */ C2159f(int i3) {
        this.f22189i = i3;
    }

    public static p062g7.C2159f h() {
        p062g7.C2159f c2159f = new p062g7.C2159f(1);
        c2159f.f22190k = java.util.Collections.EMPTY_LIST;
        c2159f.f22191l = -1;
        return c2159f;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        switch (this.f22189i) {
            case 0:
                p062g7.C2160g c2160gF = f();
                if (c2160gF.isInitialized()) {
                    return c2160gF;
                }
                throw new I3.b(12);
            case 1:
                p062g7.X xG = g();
                if (xG.isInitialized()) {
                    return xG;
                }
                throw new I3.b(12);
            default:
                p062g7.C2158e c2158eE = e();
                if (c2158eE.isInitialized()) {
                    return c2158eE;
                }
                throw new I3.b(12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    /* JADX WARN: Code duplicated, block: B:44:0x005c  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        switch (this.f22189i) {
            case 0:
                p062g7.C2160g c2160g = null;
                try {
                    try {
                        j((p062g7.C2160g) p062g7.C2160g.f22195o.a(c2633f, c2635h));
                        return this;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (c2160g != null) {
                            j(c2160g);
                        }
                        throw th;
                    }
                } catch (p110m7.r e6) {
                    p062g7.C2160g c2160g2 = (p062g7.C2160g) e6.f25503h;
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        c2160g = c2160g2;
                        if (c2160g != null) {
                            j(c2160g);
                        }
                        throw th;
                    }
                }
            case 1:
                p062g7.X x9 = null;
                try {
                    try {
                        p062g7.X.f22086o.getClass();
                        k(new p062g7.X(c2633f, c2635h));
                        return this;
                    } catch (p110m7.r e9) {
                        p062g7.X x10 = (p062g7.X) e9.f25503h;
                        try {
                            throw e9;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            x9 = x10;
                            if (x9 != null) {
                                k(x9);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    if (x9 != null) {
                        k(x9);
                    }
                    throw th;
                }
            default:
                p062g7.C2158e c2158e = null;
                try {
                    try {
                        p062g7.C2158e.f22178o.getClass();
                        i(new p062g7.C2158e(c2633f, c2635h));
                        return this;
                    } catch (p110m7.r e10) {
                        p062g7.C2158e c2158e2 = (p062g7.C2158e) e10.f25503h;
                        try {
                            throw e10;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            c2158e = c2158e2;
                            if (c2158e != null) {
                                i(c2158e);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    if (c2158e != null) {
                        i(c2158e);
                    }
                    throw th;
                }
        }
    }

    public final java.lang.Object clone() {
        switch (this.f22189i) {
            case 0:
                p062g7.C2159f c2159f = new p062g7.C2159f(0);
                c2159f.f22190k = java.util.Collections.EMPTY_LIST;
                c2159f.j(f());
                return c2159f;
            case 1:
                p062g7.C2159f c2159fH = h();
                c2159fH.k(g());
                return c2159fH;
            default:
                p062g7.C2159f c2159f2 = new p062g7.C2159f(2);
                c2159f2.f22190k = p062g7.C2157d.f22150w;
                c2159f2.i(e());
                return c2159f2;
        }
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        switch (this.f22189i) {
            case 0:
                j((p062g7.C2160g) oVar);
                break;
            case 1:
                k((p062g7.X) oVar);
                break;
            default:
                i((p062g7.C2158e) oVar);
                break;
        }
        return this;
    }

    public p062g7.C2158e e() {
        p062g7.C2158e c2158e = new p062g7.C2158e(this);
        int i3 = this.j;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        c2158e.j = this.f22191l;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        c2158e.f22181k = (p062g7.C2157d) this.f22190k;
        c2158e.f22180i = i9;
        return c2158e;
    }

    public p062g7.C2160g f() {
        p062g7.C2160g c2160g = new p062g7.C2160g(this);
        int i3 = this.j;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        c2160g.j = this.f22191l;
        if ((i3 & 2) == 2) {
            this.f22190k = java.util.Collections.unmodifiableList((java.util.List) this.f22190k);
            this.j &= -3;
        }
        c2160g.f22198k = (java.util.List) this.f22190k;
        c2160g.f22197i = i9;
        return c2160g;
    }

    public p062g7.X g() {
        p062g7.X x9 = new p062g7.X(this);
        int i3 = this.j;
        if ((i3 & 1) == 1) {
            this.f22190k = java.util.Collections.unmodifiableList((java.util.List) this.f22190k);
            this.j &= -2;
        }
        x9.j = (java.util.List) this.f22190k;
        int i9 = (i3 & 2) != 2 ? 0 : 1;
        x9.f22089k = this.f22191l;
        x9.f22088i = i9;
        return x9;
    }

    public void i(p062g7.C2158e c2158e) {
        p062g7.C2157d c2157d;
        if (c2158e == p062g7.C2158e.f22177n) {
            return;
        }
        int i3 = c2158e.f22180i;
        if ((i3 & 1) == 1) {
            int i9 = c2158e.j;
            this.j = 1 | this.j;
            this.f22191l = i9;
        }
        if ((i3 & 2) == 2) {
            p062g7.C2157d c2157d2 = c2158e.f22181k;
            if ((this.j & 2) != 2 || (c2157d = (p062g7.C2157d) this.f22190k) == p062g7.C2157d.f22150w) {
                this.f22190k = c2157d2;
            } else {
                p062g7.C2155b c2155bF = p062g7.C2155b.f();
                c2155bF.g(c2157d);
                c2155bF.g(c2157d2);
                this.f22190k = c2155bF.e();
            }
            this.j |= 2;
        }
        this.f25492h = this.f25492h.e(c2158e.f22179h);
    }

    public void j(p062g7.C2160g c2160g) {
        if (c2160g == p062g7.C2160g.f22194n) {
            return;
        }
        if ((c2160g.f22197i & 1) == 1) {
            int i3 = c2160g.j;
            this.j = 1 | this.j;
            this.f22191l = i3;
        }
        if (!c2160g.f22198k.isEmpty()) {
            if (((java.util.List) this.f22190k).isEmpty()) {
                this.f22190k = c2160g.f22198k;
                this.j &= -3;
            } else {
                if ((this.j & 2) != 2) {
                    this.f22190k = new java.util.ArrayList((java.util.List) this.f22190k);
                    this.j |= 2;
                }
                ((java.util.List) this.f22190k).addAll(c2160g.f22198k);
            }
        }
        this.f25492h = this.f25492h.e(c2160g.f22196h);
    }

    public void k(p062g7.X x9) {
        if (x9 == p062g7.X.f22085n) {
            return;
        }
        if (!x9.j.isEmpty()) {
            if (((java.util.List) this.f22190k).isEmpty()) {
                this.f22190k = x9.j;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.f22190k = new java.util.ArrayList((java.util.List) this.f22190k);
                    this.j |= 1;
                }
                ((java.util.List) this.f22190k).addAll(x9.j);
            }
        }
        if ((x9.f22088i & 1) == 1) {
            int i3 = x9.f22089k;
            this.j |= 2;
            this.f22191l = i3;
        }
        this.f25492h = this.f25492h.e(x9.f22087h);
    }
}
