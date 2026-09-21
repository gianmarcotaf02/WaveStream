package p062g7;

import I3.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p110m7.AbstractC2629b;
import p110m7.AbstractC2637j;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.o;
import p110m7.r;
import p110m7.s;
import p110m7.t;
import p110m7.v;

public final class C2166m extends AbstractC2637j implements v {

    public final int f22275i;
    public int j;

    public List f22276k;

    public C2166m(int i3) {
        this.f22275i = i3;
    }

    @Override
    public final AbstractC2629b b() {
        switch (this.f22275i) {
            case 0:
                C2167n c2167nE = e();
                if (c2167nE.isInitialized()) {
                    return c2167nE;
                }
                throw new b(12);
            case 1:
                K kF = f();
                if (kF.isInitialized()) {
                    return kF;
                }
                throw new b(12);
            case 2:
                e0 e0VarH = h();
                e0VarH.isInitialized();
                return e0VarH;
            default:
                L lG = g();
                lG.isInitialized();
                return lG;
        }
    }

    @Override
    public final AbstractC2637j c(C2633f c2633f, C2635h c2635h) throws Throwable {
        switch (this.f22275i) {
            case 0:
                C2167n c2167n = null;
                try {
                    try {
                        C2167n.f22278m.getClass();
                        i(new C2167n(c2633f, c2635h));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (c2167n != null) {
                            i(c2167n);
                        }
                        throw th;
                    }
                } catch (r e6) {
                    C2167n c2167n2 = (C2167n) e6.f25503h;
                    try {
                        throw e6;
                    } catch (Throwable th2) {
                        th = th2;
                        c2167n = c2167n2;
                        if (c2167n != null) {
                            i(c2167n);
                        }
                        throw th;
                    }
                }
            case 1:
                K k9 = null;
                try {
                    try {
                        K.f21981m.getClass();
                        j(new K(c2633f, c2635h));
                        return this;
                    } catch (r e9) {
                        K k10 = (K) e9.f25503h;
                        try {
                            throw e9;
                        } catch (Throwable th3) {
                            th = th3;
                            k9 = k10;
                            if (k9 != null) {
                                j(k9);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (k9 != null) {
                        j(k9);
                    }
                    throw th;
                }
            case 2:
                e0 e0Var = null;
                try {
                    try {
                        e0.f22185m.getClass();
                        l(new e0(c2633f, c2635h));
                        return this;
                    } catch (r e10) {
                        e0 e0Var2 = (e0) e10.f25503h;
                        try {
                            throw e10;
                        } catch (Throwable th5) {
                            th = th5;
                            e0Var = e0Var2;
                            if (e0Var != null) {
                                l(e0Var);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (e0Var != null) {
                        l(e0Var);
                    }
                    throw th;
                }
            default:
                L l2 = null;
                try {
                    try {
                        L.f21986m.getClass();
                        k(new L(c2633f));
                        return this;
                    } catch (r e11) {
                        L l9 = (L) e11.f25503h;
                        try {
                            throw e11;
                        } catch (Throwable th7) {
                            th = th7;
                            l2 = l9;
                            if (l2 != null) {
                                k(l2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (l2 != null) {
                        k(l2);
                    }
                    throw th;
                }
        }
    }

    public final Object clone() {
        switch (this.f22275i) {
            case 0:
                C2166m c2166m = new C2166m(0);
                c2166m.f22276k = Collections.EMPTY_LIST;
                c2166m.i(e());
                return c2166m;
            case 1:
                C2166m c2166m2 = new C2166m(1);
                c2166m2.f22276k = Collections.EMPTY_LIST;
                c2166m2.j(f());
                return c2166m2;
            case 2:
                C2166m c2166m3 = new C2166m(2);
                c2166m3.f22276k = Collections.EMPTY_LIST;
                c2166m3.l(h());
                return c2166m3;
            default:
                C2166m c2166m4 = new C2166m(3);
                c2166m4.f22276k = s.f25504i;
                c2166m4.k(g());
                return c2166m4;
        }
    }

    @Override
    public final AbstractC2637j d(o oVar) {
        switch (this.f22275i) {
            case 0:
                i((C2167n) oVar);
                break;
            case 1:
                j((K) oVar);
                break;
            case 2:
                l((e0) oVar);
                break;
            default:
                k((L) oVar);
                break;
        }
        return this;
    }

    public C2167n e() {
        C2167n c2167n = new C2167n(this);
        if ((this.j & 1) == 1) {
            this.f22276k = Collections.unmodifiableList(this.f22276k);
            this.j &= -2;
        }
        c2167n.f22280i = this.f22276k;
        return c2167n;
    }

    public K f() {
        K k9 = new K(this);
        if ((this.j & 1) == 1) {
            this.f22276k = Collections.unmodifiableList(this.f22276k);
            this.j &= -2;
        }
        k9.f21983i = this.f22276k;
        return k9;
    }

    public L g() {
        L l2 = new L(this);
        if ((this.j & 1) == 1) {
            this.f22276k = ((t) this.f22276k).c();
            this.j &= -2;
        }
        l2.f21988i = (t) this.f22276k;
        return l2;
    }

    public e0 h() {
        e0 e0Var = new e0(this);
        if ((this.j & 1) == 1) {
            this.f22276k = Collections.unmodifiableList(this.f22276k);
            this.j &= -2;
        }
        e0Var.f22187i = this.f22276k;
        return e0Var;
    }

    public void i(C2167n c2167n) {
        if (c2167n == C2167n.f22277l) {
            return;
        }
        if (!c2167n.f22280i.isEmpty()) {
            if (this.f22276k.isEmpty()) {
                this.f22276k = c2167n.f22280i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.f22276k = new ArrayList(this.f22276k);
                    this.j |= 1;
                }
                this.f22276k.addAll(c2167n.f22280i);
            }
        }
        this.f25492h = this.f25492h.e(c2167n.f22279h);
    }

    public void j(K k9) {
        if (k9 == K.f21980l) {
            return;
        }
        if (!k9.f21983i.isEmpty()) {
            if (this.f22276k.isEmpty()) {
                this.f22276k = k9.f21983i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.f22276k = new ArrayList(this.f22276k);
                    this.j |= 1;
                }
                this.f22276k.addAll(k9.f21983i);
            }
        }
        this.f25492h = this.f25492h.e(k9.f21982h);
    }

    public void k(L l2) {
        if (l2 == L.f21985l) {
            return;
        }
        if (!l2.f21988i.isEmpty()) {
            if (((t) this.f22276k).isEmpty()) {
                this.f22276k = l2.f21988i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.f22276k = new s((t) this.f22276k);
                    this.j |= 1;
                }
                ((t) this.f22276k).addAll(l2.f21988i);
            }
        }
        this.f25492h = this.f25492h.e(l2.f21987h);
    }

    public void l(e0 e0Var) {
        if (e0Var == e0.f22184l) {
            return;
        }
        if (!e0Var.f22187i.isEmpty()) {
            if (this.f22276k.isEmpty()) {
                this.f22276k = e0Var.f22187i;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.f22276k = new ArrayList(this.f22276k);
                    this.j |= 1;
                }
                this.f22276k.addAll(e0Var.f22187i);
            }
        }
        this.f25492h = this.f25492h.e(e0Var.f22186h);
    }
}
