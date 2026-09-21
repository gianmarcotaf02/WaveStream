package p062g7;

/* JADX INFO: renamed from: g7.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2166m extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22275i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.List f22276k;

    public /* synthetic */ C2166m(int i3) {
        this.f22275i = i3;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        switch (this.f22275i) {
            case 0:
                p062g7.C2167n c2167nE = e();
                if (c2167nE.isInitialized()) {
                    return c2167nE;
                }
                throw new I3.b(12);
            case 1:
                p062g7.K kF = f();
                if (kF.isInitialized()) {
                    return kF;
                }
                throw new I3.b(12);
            case 2:
                p062g7.e0 e0VarH = h();
                e0VarH.isInitialized();
                return e0VarH;
            default:
                p062g7.L lG = g();
                lG.isInitialized();
                return lG;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX WARN: Code duplicated, block: B:58:0x007d  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        switch (this.f22275i) {
            case 0:
                p062g7.C2167n c2167n = null;
                try {
                    try {
                        p062g7.C2167n.f22278m.getClass();
                        i(new p062g7.C2167n(c2633f, c2635h));
                        return this;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        if (c2167n != null) {
                            i(c2167n);
                        }
                        throw th;
                    }
                } catch (p110m7.r e6) {
                    p062g7.C2167n c2167n2 = (p062g7.C2167n) e6.f25503h;
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        c2167n = c2167n2;
                        if (c2167n != null) {
                            i(c2167n);
                        }
                        throw th;
                    }
                }
            case 1:
                p062g7.K k9 = null;
                try {
                    try {
                        p062g7.K.f21981m.getClass();
                        j(new p062g7.K(c2633f, c2635h));
                        return this;
                    } catch (p110m7.r e9) {
                        p062g7.K k10 = (p062g7.K) e9.f25503h;
                        try {
                            throw e9;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            k9 = k10;
                            if (k9 != null) {
                                j(k9);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    if (k9 != null) {
                        j(k9);
                    }
                    throw th;
                }
            case 2:
                p062g7.e0 e0Var = null;
                try {
                    try {
                        p062g7.e0.f22185m.getClass();
                        l(new p062g7.e0(c2633f, c2635h));
                        return this;
                    } catch (p110m7.r e10) {
                        p062g7.e0 e0Var2 = (p062g7.e0) e10.f25503h;
                        try {
                            throw e10;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            e0Var = e0Var2;
                            if (e0Var != null) {
                                l(e0Var);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    if (e0Var != null) {
                        l(e0Var);
                    }
                    throw th;
                }
            default:
                p062g7.L l2 = null;
                try {
                    try {
                        p062g7.L.f21986m.getClass();
                        k(new p062g7.L(c2633f));
                        return this;
                    } catch (p110m7.r e11) {
                        p062g7.L l9 = (p062g7.L) e11.f25503h;
                        try {
                            throw e11;
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            l2 = l9;
                            if (l2 != null) {
                                k(l2);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    if (l2 != null) {
                        k(l2);
                    }
                    throw th;
                }
        }
    }

    public final java.lang.Object clone() {
        switch (this.f22275i) {
            case 0:
                p062g7.C2166m c2166m = new p062g7.C2166m(0);
                c2166m.f22276k = java.util.Collections.EMPTY_LIST;
                c2166m.i(e());
                return c2166m;
            case 1:
                p062g7.C2166m c2166m2 = new p062g7.C2166m(1);
                c2166m2.f22276k = java.util.Collections.EMPTY_LIST;
                c2166m2.j(f());
                return c2166m2;
            case 2:
                p062g7.C2166m c2166m3 = new p062g7.C2166m(2);
                c2166m3.f22276k = java.util.Collections.EMPTY_LIST;
                c2166m3.l(h());
                return c2166m3;
            default:
                p062g7.C2166m c2166m4 = new p062g7.C2166m(3);
                c2166m4.f22276k = p110m7.s.f25504i;
                c2166m4.k(g());
                return c2166m4;
        }
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        switch (this.f22275i) {
            case 0:
                i((p062g7.C2167n) oVar);
                break;
            case 1:
                j((p062g7.K) oVar);
                break;
            case 2:
                l((p062g7.e0) oVar);
                break;
            default:
                k((p062g7.L) oVar);
                break;
        }
        return this;
    }

    public p062g7.C2167n e() {
        p062g7.C2167n c2167n = new p062g7.C2167n(this);
        if ((this.j & 1) == 1) {
            this.f22276k = java.util.Collections.unmodifiableList(this.f22276k);
            this.j &= -2;
        }
        c2167n.f22280i = this.f22276k;
        return c2167n;
    }

    public p062g7.K f() {
        p062g7.K k9 = new p062g7.K(this);
        if ((this.j & 1) == 1) {
            this.f22276k = java.util.Collections.unmodifiableList(this.f22276k);
            this.j &= -2;
        }
        k9.f21983i = this.f22276k;
        return k9;
    }

    public p062g7.L g() {
        p062g7.L l2 = new p062g7.L(this);
        if ((this.j & 1) == 1) {
            this.f22276k = ((p110m7.t) this.f22276k).c();
            this.j &= -2;
        }
        l2.f21988i = (p110m7.t) this.f22276k;
        return l2;
    }

    public p062g7.e0 h() {
        p062g7.e0 e0Var = new p062g7.e0(this);
        if ((this.j & 1) == 1) {
            this.f22276k = java.util.Collections.unmodifiableList(this.f22276k);
            this.j &= -2;
        }
        e0Var.f22187i = this.f22276k;
        return e0Var;
    }

    public void i(p062g7.C2167n c2167n) {
        if (c2167n == p062g7.C2167n.f22277l) {
            return;
        }
        if (!c2167n.f22280i.isEmpty()) {
            if (this.f22276k.isEmpty()) {
                this.f22276k = c2167n.f22280i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.f22276k = new java.util.ArrayList(this.f22276k);
                    this.j |= 1;
                }
                this.f22276k.addAll(c2167n.f22280i);
            }
        }
        this.f25492h = this.f25492h.e(c2167n.f22279h);
    }

    public void j(p062g7.K k9) {
        if (k9 == p062g7.K.f21980l) {
            return;
        }
        if (!k9.f21983i.isEmpty()) {
            if (this.f22276k.isEmpty()) {
                this.f22276k = k9.f21983i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.f22276k = new java.util.ArrayList(this.f22276k);
                    this.j |= 1;
                }
                this.f22276k.addAll(k9.f21983i);
            }
        }
        this.f25492h = this.f25492h.e(k9.f21982h);
    }

    public void k(p062g7.L l2) {
        if (l2 == p062g7.L.f21985l) {
            return;
        }
        if (!l2.f21988i.isEmpty()) {
            if (((p110m7.t) this.f22276k).isEmpty()) {
                this.f22276k = l2.f21988i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.f22276k = new p110m7.s((p110m7.t) this.f22276k);
                    this.j |= 1;
                }
                ((p110m7.t) this.f22276k).addAll(l2.f21988i);
            }
        }
        this.f25492h = this.f25492h.e(l2.f21987h);
    }

    public void l(p062g7.e0 e0Var) {
        if (e0Var == p062g7.e0.f22184l) {
            return;
        }
        if (!e0Var.f22187i.isEmpty()) {
            if (this.f22276k.isEmpty()) {
                this.f22276k = e0Var.f22187i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.f22276k = new java.util.ArrayList(this.f22276k);
                    this.j |= 1;
                }
                this.f22276k.addAll(e0Var.f22187i);
            }
        }
        this.f25492h = this.f25492h.e(e0Var.f22186h);
    }
}
