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
import p110m7.v;

public final class C2159f extends AbstractC2637j implements v {

    public final int f22189i;
    public int j;

    public Object f22190k;

    public int f22191l;

    public C2159f(int i3) {
        this.f22189i = i3;
    }

    public static C2159f h() {
        C2159f c2159f = new C2159f(1);
        c2159f.f22190k = Collections.EMPTY_LIST;
        c2159f.f22191l = -1;
        return c2159f;
    }

    @Override
    public final AbstractC2629b b() {
        switch (this.f22189i) {
            case 0:
                C2160g c2160gF = f();
                if (c2160gF.isInitialized()) {
                    return c2160gF;
                }
                throw new b(12);
            case 1:
                X xG = g();
                if (xG.isInitialized()) {
                    return xG;
                }
                throw new b(12);
            default:
                C2158e c2158eE = e();
                if (c2158eE.isInitialized()) {
                    return c2158eE;
                }
                throw new b(12);
        }
    }

    @Override
    public final AbstractC2637j c(C2633f c2633f, C2635h c2635h) throws Throwable {
        switch (this.f22189i) {
            case 0:
                C2160g c2160g = null;
                try {
                    try {
                        j((C2160g) C2160g.f22195o.a(c2633f, c2635h));
                        return this;
                    } catch (Throwable th) {
                        th = th;
                        if (c2160g != null) {
                            j(c2160g);
                        }
                        throw th;
                    }
                } catch (r e6) {
                    C2160g c2160g2 = (C2160g) e6.f25503h;
                    try {
                        throw e6;
                    } catch (Throwable th2) {
                        th = th2;
                        c2160g = c2160g2;
                        if (c2160g != null) {
                            j(c2160g);
                        }
                        throw th;
                    }
                }
            case 1:
                X x9 = null;
                try {
                    try {
                        X.f22086o.getClass();
                        k(new X(c2633f, c2635h));
                        return this;
                    } catch (r e9) {
                        X x10 = (X) e9.f25503h;
                        try {
                            throw e9;
                        } catch (Throwable th3) {
                            th = th3;
                            x9 = x10;
                            if (x9 != null) {
                                k(x9);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (x9 != null) {
                        k(x9);
                    }
                    throw th;
                }
            default:
                C2158e c2158e = null;
                try {
                    try {
                        C2158e.f22178o.getClass();
                        i(new C2158e(c2633f, c2635h));
                        return this;
                    } catch (r e10) {
                        C2158e c2158e2 = (C2158e) e10.f25503h;
                        try {
                            throw e10;
                        } catch (Throwable th5) {
                            th = th5;
                            c2158e = c2158e2;
                            if (c2158e != null) {
                                i(c2158e);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (c2158e != null) {
                        i(c2158e);
                    }
                    throw th;
                }
        }
    }

    public final Object clone() {
        switch (this.f22189i) {
            case 0:
                C2159f c2159f = new C2159f(0);
                c2159f.f22190k = Collections.EMPTY_LIST;
                c2159f.j(f());
                return c2159f;
            case 1:
                C2159f c2159fH = h();
                c2159fH.k(g());
                return c2159fH;
            default:
                C2159f c2159f2 = new C2159f(2);
                c2159f2.f22190k = C2157d.f22150w;
                c2159f2.i(e());
                return c2159f2;
        }
    }

    @Override
    public final AbstractC2637j d(o oVar) {
        switch (this.f22189i) {
            case 0:
                j((C2160g) oVar);
                break;
            case 1:
                k((X) oVar);
                break;
            default:
                i((C2158e) oVar);
                break;
        }
        return this;
    }

    public C2158e e() {
        C2158e c2158e = new C2158e(this);
        int i3 = this.j;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        c2158e.j = this.f22191l;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        c2158e.f22181k = (C2157d) this.f22190k;
        c2158e.f22180i = i9;
        return c2158e;
    }

    public C2160g f() {
        C2160g c2160g = new C2160g(this);
        int i3 = this.j;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        c2160g.j = this.f22191l;
        if ((i3 & 2) == 2) {
            this.f22190k = Collections.unmodifiableList((List) this.f22190k);
            this.j &= -3;
        }
        c2160g.f22198k = (List) this.f22190k;
        c2160g.f22197i = i9;
        return c2160g;
    }

    public X g() {
        X x9 = new X(this);
        int i3 = this.j;
        if ((i3 & 1) == 1) {
            this.f22190k = Collections.unmodifiableList((List) this.f22190k);
            this.j &= -2;
        }
        x9.j = (List) this.f22190k;
        int i9 = (i3 & 2) != 2 ? 0 : 1;
        x9.f22089k = this.f22191l;
        x9.f22088i = i9;
        return x9;
    }

    public void i(C2158e c2158e) {
        C2157d c2157d;
        if (c2158e == C2158e.f22177n) {
            return;
        }
        int i3 = c2158e.f22180i;
        if ((i3 & 1) == 1) {
            int i9 = c2158e.j;
            this.j = 1 | this.j;
            this.f22191l = i9;
        }
        if ((i3 & 2) == 2) {
            C2157d c2157d2 = c2158e.f22181k;
            if ((this.j & 2) != 2 || (c2157d = (C2157d) this.f22190k) == C2157d.f22150w) {
                this.f22190k = c2157d2;
            } else {
                C2155b c2155bF = C2155b.f();
                c2155bF.g(c2157d);
                c2155bF.g(c2157d2);
                this.f22190k = c2155bF.e();
            }
            this.j |= 2;
        }
        this.f25492h = this.f25492h.e(c2158e.f22179h);
    }

    public void j(C2160g c2160g) {
        if (c2160g == C2160g.f22194n) {
            return;
        }
        if ((c2160g.f22197i & 1) == 1) {
            int i3 = c2160g.j;
            this.j = 1 | this.j;
            this.f22191l = i3;
        }
        if (!c2160g.f22198k.isEmpty()) {
            if (((List) this.f22190k).isEmpty()) {
                this.f22190k = c2160g.f22198k;
                this.j &= -3;
            } else {
                if ((this.j & 2) != 2) {
                    this.f22190k = new ArrayList((List) this.f22190k);
                    this.j |= 2;
                }
                ((List) this.f22190k).addAll(c2160g.f22198k);
            }
        }
        this.f25492h = this.f25492h.e(c2160g.f22196h);
    }

    public void k(X x9) {
        if (x9 == X.f22085n) {
            return;
        }
        if (!x9.j.isEmpty()) {
            if (((List) this.f22190k).isEmpty()) {
                this.f22190k = x9.j;
                this.j &= -2;
            } else {
                if ((this.j & 1) != 1) {
                    this.f22190k = new ArrayList((List) this.f22190k);
                    this.j |= 1;
                }
                ((List) this.f22190k).addAll(x9.j);
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
