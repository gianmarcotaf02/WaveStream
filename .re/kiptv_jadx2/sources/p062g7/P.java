package p062g7;

import I3.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p110m7.AbstractC2629b;
import p110m7.AbstractC2637j;
import p110m7.AbstractC2638k;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.o;
import p110m7.r;

public final class P extends AbstractC2638k {

    public int f22006k;

    public List f22007l;

    public boolean f22008m;

    public int f22009n;

    public Q f22010o;

    public int f22011p;

    public int f22012q;

    public int f22013r;

    public int f22014s;

    public int f22015t;

    public Q f22016u;

    public int f22017v;

    public Q f22018w;

    public int f22019x;
    public int y;

    public static P g() {
        P p2 = new P();
        p2.f22007l = Collections.EMPTY_LIST;
        Q q9 = Q.f22020A;
        p2.f22010o = q9;
        p2.f22016u = q9;
        p2.f22018w = q9;
        return p2;
    }

    @Override
    public final AbstractC2629b b() {
        Q qF = f();
        if (qF.isInitialized()) {
            return qF;
        }
        throw new b(12);
    }

    @Override
    public final AbstractC2637j c(C2633f c2633f, C2635h c2635h) throws Throwable {
        Q q9 = null;
        try {
            try {
                Q.f22021B.getClass();
                h(new Q(c2633f, c2635h));
                return this;
            } catch (r e6) {
                Q q10 = (Q) e6.f25503h;
                try {
                    throw e6;
                } catch (Throwable th) {
                    th = th;
                    q9 = q10;
                    if (q9 != null) {
                        h(q9);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (q9 != null) {
                h(q9);
            }
            throw th;
        }
    }

    public final Object clone() {
        P pG = g();
        pG.h(f());
        return pG;
    }

    @Override
    public final AbstractC2637j d(o oVar) {
        h((Q) oVar);
        return this;
    }

    public final Q f() {
        Q q9 = new Q(this);
        int i3 = this.f22006k;
        if ((i3 & 1) == 1) {
            this.f22007l = Collections.unmodifiableList(this.f22007l);
            this.f22006k &= -2;
        }
        q9.f22023k = this.f22007l;
        int i9 = (i3 & 2) != 2 ? 0 : 1;
        q9.f22024l = this.f22008m;
        if ((i3 & 4) == 4) {
            i9 |= 2;
        }
        q9.f22025m = this.f22009n;
        if ((i3 & 8) == 8) {
            i9 |= 4;
        }
        q9.f22026n = this.f22010o;
        if ((i3 & 16) == 16) {
            i9 |= 8;
        }
        q9.f22027o = this.f22011p;
        if ((i3 & 32) == 32) {
            i9 |= 16;
        }
        q9.f22028p = this.f22012q;
        if ((i3 & 64) == 64) {
            i9 |= 32;
        }
        q9.f22029q = this.f22013r;
        if ((i3 & 128) == 128) {
            i9 |= 64;
        }
        q9.f22030r = this.f22014s;
        if ((i3 & 256) == 256) {
            i9 |= 128;
        }
        q9.f22031s = this.f22015t;
        if ((i3 & 512) == 512) {
            i9 |= 256;
        }
        q9.f22032t = this.f22016u;
        if ((i3 & 1024) == 1024) {
            i9 |= 512;
        }
        q9.f22033u = this.f22017v;
        if ((i3 & 2048) == 2048) {
            i9 |= 1024;
        }
        q9.f22034v = this.f22018w;
        if ((i3 & 4096) == 4096) {
            i9 |= 2048;
        }
        q9.f22035w = this.f22019x;
        if ((i3 & 8192) == 8192) {
            i9 |= 4096;
        }
        q9.f22036x = this.y;
        q9.j = i9;
        return q9;
    }

    public final P h(Q q9) {
        Q q10;
        Q q11;
        Q q12;
        Q q13 = Q.f22020A;
        if (q9 == q13) {
            return this;
        }
        if (!q9.f22023k.isEmpty()) {
            if (this.f22007l.isEmpty()) {
                this.f22007l = q9.f22023k;
                this.f22006k &= -2;
            } else {
                if ((this.f22006k & 1) != 1) {
                    this.f22007l = new ArrayList(this.f22007l);
                    this.f22006k |= 1;
                }
                this.f22007l.addAll(q9.f22023k);
            }
        }
        int i3 = q9.j;
        if ((i3 & 1) == 1) {
            boolean z6 = q9.f22024l;
            this.f22006k |= 2;
            this.f22008m = z6;
        }
        if ((i3 & 2) == 2) {
            int i9 = q9.f22025m;
            this.f22006k |= 4;
            this.f22009n = i9;
        }
        if ((i3 & 4) == 4) {
            Q q14 = q9.f22026n;
            if ((this.f22006k & 8) != 8 || (q12 = this.f22010o) == q13) {
                this.f22010o = q14;
            } else {
                P p2 = Q.p(q12);
                p2.h(q14);
                this.f22010o = p2.f();
            }
            this.f22006k |= 8;
        }
        int i10 = q9.j;
        if ((i10 & 8) == 8) {
            int i11 = q9.f22027o;
            this.f22006k |= 16;
            this.f22011p = i11;
        }
        if ((i10 & 16) == 16) {
            int i12 = q9.f22028p;
            this.f22006k |= 32;
            this.f22012q = i12;
        }
        if ((i10 & 32) == 32) {
            int i13 = q9.f22029q;
            this.f22006k |= 64;
            this.f22013r = i13;
        }
        if ((i10 & 64) == 64) {
            int i14 = q9.f22030r;
            this.f22006k |= 128;
            this.f22014s = i14;
        }
        if ((i10 & 128) == 128) {
            int i15 = q9.f22031s;
            this.f22006k |= 256;
            this.f22015t = i15;
        }
        if ((i10 & 256) == 256) {
            Q q15 = q9.f22032t;
            if ((this.f22006k & 512) != 512 || (q11 = this.f22016u) == q13) {
                this.f22016u = q15;
            } else {
                P p9 = Q.p(q11);
                p9.h(q15);
                this.f22016u = p9.f();
            }
            this.f22006k |= 512;
        }
        int i16 = q9.j;
        if ((i16 & 512) == 512) {
            int i17 = q9.f22033u;
            this.f22006k |= 1024;
            this.f22017v = i17;
        }
        if ((i16 & 1024) == 1024) {
            Q q16 = q9.f22034v;
            if ((this.f22006k & 2048) != 2048 || (q10 = this.f22018w) == q13) {
                this.f22018w = q16;
            } else {
                P p10 = Q.p(q10);
                p10.h(q16);
                this.f22018w = p10.f();
            }
            this.f22006k |= 2048;
        }
        int i18 = q9.j;
        if ((i18 & 2048) == 2048) {
            int i19 = q9.f22035w;
            this.f22006k |= 4096;
            this.f22019x = i19;
        }
        if ((i18 & 4096) == 4096) {
            int i20 = q9.f22036x;
            this.f22006k |= 8192;
            this.y = i20;
        }
        e(q9);
        this.f25492h = this.f25492h.e(q9.f22022i);
        return this;
    }
}
