package p062g7;

import I3.b;
import p110m7.AbstractC2629b;
import p110m7.AbstractC2637j;
import p110m7.AbstractC2638k;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.o;
import p110m7.r;

public final class C2171s extends AbstractC2638k {

    public int f22303k;

    public int f22304l;

    @Override
    public final AbstractC2629b b() {
        C2172t c2172t = new C2172t(this);
        int i3 = (this.f22303k & 1) != 1 ? 0 : 1;
        c2172t.f22308k = this.f22304l;
        c2172t.j = i3;
        if (c2172t.isInitialized()) {
            return c2172t;
        }
        throw new b(12);
    }

    @Override
    public final AbstractC2637j c(C2633f c2633f, C2635h c2635h) throws Throwable {
        C2172t c2172t = null;
        try {
            try {
                C2172t.f22306o.getClass();
                f(new C2172t(c2633f, c2635h));
                return this;
            } catch (r e6) {
                C2172t c2172t2 = (C2172t) e6.f25503h;
                try {
                    throw e6;
                } catch (Throwable th) {
                    th = th;
                    c2172t = c2172t2;
                    if (c2172t != null) {
                        f(c2172t);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c2172t != null) {
                f(c2172t);
            }
            throw th;
        }
    }

    public final Object clone() {
        C2171s c2171s = new C2171s();
        C2172t c2172t = new C2172t(this);
        int i3 = (this.f22303k & 1) != 1 ? 0 : 1;
        c2172t.f22308k = this.f22304l;
        c2172t.j = i3;
        c2171s.f(c2172t);
        return c2171s;
    }

    @Override
    public final AbstractC2637j d(o oVar) {
        f((C2172t) oVar);
        return this;
    }

    public final void f(C2172t c2172t) {
        if (c2172t == C2172t.f22305n) {
            return;
        }
        if ((c2172t.j & 1) == 1) {
            int i3 = c2172t.f22308k;
            this.f22303k = 1 | this.f22303k;
            this.f22304l = i3;
        }
        e(c2172t);
        this.f25492h = this.f25492h.e(c2172t.f22307i);
    }
}
