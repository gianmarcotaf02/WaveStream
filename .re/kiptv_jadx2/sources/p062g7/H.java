package p062g7;

import I3.b;
import p110m7.AbstractC2629b;
import p110m7.AbstractC2637j;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.o;
import p110m7.r;
import p110m7.v;

public final class H extends AbstractC2637j implements v {

    public int f21965i;
    public int j;

    public int f21966k;

    public I f21967l;

    public static H f() {
        H h9 = new H();
        h9.j = -1;
        h9.f21967l = I.PACKAGE;
        return h9;
    }

    @Override
    public final AbstractC2629b b() {
        J jE = e();
        if (jE.isInitialized()) {
            return jE;
        }
        throw new b(12);
    }

    @Override
    public final AbstractC2637j c(C2633f c2633f, C2635h c2635h) throws Throwable {
        J j = null;
        try {
            try {
                J.f21973p.getClass();
                g(new J(c2633f));
                return this;
            } catch (r e6) {
                J j9 = (J) e6.f25503h;
                try {
                    throw e6;
                } catch (Throwable th) {
                    th = th;
                    j = j9;
                    if (j != null) {
                        g(j);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (j != null) {
                g(j);
            }
            throw th;
        }
    }

    public final Object clone() {
        H hF = f();
        hF.g(e());
        return hF;
    }

    @Override
    public final AbstractC2637j d(o oVar) {
        g((J) oVar);
        return this;
    }

    public final J e() {
        J j = new J(this);
        int i3 = this.f21965i;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        j.j = this.j;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        j.f21976k = this.f21966k;
        if ((i3 & 4) == 4) {
            i9 |= 4;
        }
        j.f21977l = this.f21967l;
        j.f21975i = i9;
        return j;
    }

    public final void g(J j) {
        if (j == J.f21972o) {
            return;
        }
        int i3 = j.f21975i;
        if ((i3 & 1) == 1) {
            int i9 = j.j;
            this.f21965i = 1 | this.f21965i;
            this.j = i9;
        }
        if ((i3 & 2) == 2) {
            int i10 = j.f21976k;
            this.f21965i = 2 | this.f21965i;
            this.f21966k = i10;
        }
        if ((i3 & 4) == 4) {
            I i11 = j.f21977l;
            i11.getClass();
            this.f21965i = 4 | this.f21965i;
            this.f21967l = i11;
        }
        this.f25492h = this.f25492h.e(j.f21974h);
    }
}
