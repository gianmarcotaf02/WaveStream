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

public final class C2164k extends AbstractC2638k {

    public int f22263k;

    public int f22264l;

    public List f22265m;

    public List f22266n;

    public static C2164k g() {
        C2164k c2164k = new C2164k();
        c2164k.f22264l = 6;
        List list = Collections.EMPTY_LIST;
        c2164k.f22265m = list;
        c2164k.f22266n = list;
        return c2164k;
    }

    @Override
    public final AbstractC2629b b() {
        C2165l c2165lF = f();
        if (c2165lF.isInitialized()) {
            return c2165lF;
        }
        throw new b(12);
    }

    @Override
    public final AbstractC2637j c(C2633f c2633f, C2635h c2635h) throws Throwable {
        C2165l c2165l = null;
        try {
            try {
                C2165l.f22268q.getClass();
                h(new C2165l(c2633f, c2635h));
                return this;
            } catch (r e6) {
                C2165l c2165l2 = (C2165l) e6.f25503h;
                try {
                    throw e6;
                } catch (Throwable th) {
                    th = th;
                    c2165l = c2165l2;
                    if (c2165l != null) {
                        h(c2165l);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c2165l != null) {
                h(c2165l);
            }
            throw th;
        }
    }

    public final Object clone() {
        C2164k c2164kG = g();
        c2164kG.h(f());
        return c2164kG;
    }

    @Override
    public final AbstractC2637j d(o oVar) {
        h((C2165l) oVar);
        return this;
    }

    public final C2165l f() {
        C2165l c2165l = new C2165l(this);
        int i3 = this.f22263k;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        c2165l.f22270k = this.f22264l;
        if ((i3 & 2) == 2) {
            this.f22265m = Collections.unmodifiableList(this.f22265m);
            this.f22263k &= -3;
        }
        c2165l.f22271l = this.f22265m;
        if ((this.f22263k & 4) == 4) {
            this.f22266n = Collections.unmodifiableList(this.f22266n);
            this.f22263k &= -5;
        }
        c2165l.f22272m = this.f22266n;
        c2165l.j = i9;
        return c2165l;
    }

    public final void h(C2165l c2165l) {
        if (c2165l == C2165l.f22267p) {
            return;
        }
        if ((c2165l.j & 1) == 1) {
            int i3 = c2165l.f22270k;
            this.f22263k = 1 | this.f22263k;
            this.f22264l = i3;
        }
        if (!c2165l.f22271l.isEmpty()) {
            if (this.f22265m.isEmpty()) {
                this.f22265m = c2165l.f22271l;
                this.f22263k &= -3;
            } else {
                if ((this.f22263k & 2) != 2) {
                    this.f22265m = new ArrayList(this.f22265m);
                    this.f22263k |= 2;
                }
                this.f22265m.addAll(c2165l.f22271l);
            }
        }
        if (!c2165l.f22272m.isEmpty()) {
            if (this.f22266n.isEmpty()) {
                this.f22266n = c2165l.f22272m;
                this.f22263k &= -5;
            } else {
                if ((this.f22263k & 4) != 4) {
                    this.f22266n = new ArrayList(this.f22266n);
                    this.f22263k |= 4;
                }
                this.f22266n.addAll(c2165l.f22272m);
            }
        }
        e(c2165l);
        this.f25492h = this.f25492h.e(c2165l.f22269i);
    }
}
