package p062g7;

import p110m7.AbstractC2629b;
import p110m7.AbstractC2637j;
import p110m7.C2633f;
import p110m7.C2635h;
import p110m7.o;
import p110m7.r;
import p110m7.v;

public final class a0 extends AbstractC2637j implements v {

    public int f22111i;
    public int j;

    public int f22112k;

    public b0 f22113l;

    public int f22114m;

    public int f22115n;

    public c0 f22116o;

    public static a0 f() {
        a0 a0Var = new a0();
        a0Var.f22113l = b0.ERROR;
        a0Var.f22116o = c0.LANGUAGE_VERSION;
        return a0Var;
    }

    @Override
    public final AbstractC2629b b() {
        d0 d0VarE = e();
        d0VarE.isInitialized();
        return d0VarE;
    }

    @Override
    public final AbstractC2637j c(C2633f c2633f, C2635h c2635h) throws Throwable {
        d0 d0Var = null;
        try {
            try {
                d0.f22167s.getClass();
                g(new d0(c2633f));
                return this;
            } catch (r e6) {
                d0 d0Var2 = (d0) e6.f25503h;
                try {
                    throw e6;
                } catch (Throwable th) {
                    th = th;
                    d0Var = d0Var2;
                    if (d0Var != null) {
                        g(d0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (d0Var != null) {
                g(d0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        a0 a0VarF = f();
        a0VarF.g(e());
        return a0VarF;
    }

    @Override
    public final AbstractC2637j d(o oVar) {
        g((d0) oVar);
        return this;
    }

    public final d0 e() {
        d0 d0Var = new d0(this);
        int i3 = this.f22111i;
        int i9 = (i3 & 1) != 1 ? 0 : 1;
        d0Var.j = this.j;
        if ((i3 & 2) == 2) {
            i9 |= 2;
        }
        d0Var.f22170k = this.f22112k;
        if ((i3 & 4) == 4) {
            i9 |= 4;
        }
        d0Var.f22171l = this.f22113l;
        if ((i3 & 8) == 8) {
            i9 |= 8;
        }
        d0Var.f22172m = this.f22114m;
        if ((i3 & 16) == 16) {
            i9 |= 16;
        }
        d0Var.f22173n = this.f22115n;
        if ((i3 & 32) == 32) {
            i9 |= 32;
        }
        d0Var.f22174o = this.f22116o;
        d0Var.f22169i = i9;
        return d0Var;
    }

    public final void g(d0 d0Var) {
        if (d0Var == d0.f22166r) {
            return;
        }
        int i3 = d0Var.f22169i;
        if ((i3 & 1) == 1) {
            int i9 = d0Var.j;
            this.f22111i = 1 | this.f22111i;
            this.j = i9;
        }
        if ((i3 & 2) == 2) {
            int i10 = d0Var.f22170k;
            this.f22111i = 2 | this.f22111i;
            this.f22112k = i10;
        }
        if ((i3 & 4) == 4) {
            b0 b0Var = d0Var.f22171l;
            b0Var.getClass();
            this.f22111i = 4 | this.f22111i;
            this.f22113l = b0Var;
        }
        int i11 = d0Var.f22169i;
        if ((i11 & 8) == 8) {
            int i12 = d0Var.f22172m;
            this.f22111i = 8 | this.f22111i;
            this.f22114m = i12;
        }
        if ((i11 & 16) == 16) {
            int i13 = d0Var.f22173n;
            this.f22111i = 16 | this.f22111i;
            this.f22115n = i13;
        }
        if ((i11 & 32) == 32) {
            c0 c0Var = d0Var.f22174o;
            c0Var.getClass();
            this.f22111i = 32 | this.f22111i;
            this.f22116o = c0Var;
        }
        this.f25492h = this.f25492h.e(d0Var.f22168h);
    }
}
