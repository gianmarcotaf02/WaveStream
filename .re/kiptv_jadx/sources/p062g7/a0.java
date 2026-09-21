package p062g7;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends p110m7.AbstractC2637j implements p110m7.v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22111i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f22112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p062g7.b0 f22113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p062g7.c0 f22116o;

    public static p062g7.a0 f() {
        p062g7.a0 a0Var = new p062g7.a0();
        a0Var.f22113l = p062g7.b0.ERROR;
        a0Var.f22116o = p062g7.c0.LANGUAGE_VERSION;
        return a0Var;
    }

    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2629b b() {
        p062g7.d0 d0VarE = e();
        d0VarE.isInitialized();
        return d0VarE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p110m7.AbstractC2637j
    public final p110m7.AbstractC2637j c(p110m7.C2633f c2633f, p110m7.C2635h c2635h) throws java.lang.Throwable {
        p062g7.d0 d0Var = null;
        try {
            try {
                p062g7.d0.f22167s.getClass();
                g(new p062g7.d0(c2633f));
                return this;
            } catch (p110m7.r e6) {
                p062g7.d0 d0Var2 = (p062g7.d0) e6.f25503h;
                try {
                    throw e6;
                } catch (java.lang.Throwable th) {
                    th = th;
                    d0Var = d0Var2;
                    if (d0Var != null) {
                        g(d0Var);
                    }
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (d0Var != null) {
                g(d0Var);
            }
            throw th;
        }
    }

    public final java.lang.Object clone() {
        p062g7.a0 a0VarF = f();
        a0VarF.g(e());
        return a0VarF;
    }

    @Override // p110m7.AbstractC2637j
    public final /* bridge */ /* synthetic */ p110m7.AbstractC2637j d(p110m7.o oVar) {
        g((p062g7.d0) oVar);
        return this;
    }

    public final p062g7.d0 e() {
        p062g7.d0 d0Var = new p062g7.d0(this);
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

    public final void g(p062g7.d0 d0Var) {
        if (d0Var == p062g7.d0.f22166r) {
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
            p062g7.b0 b0Var = d0Var.f22171l;
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
            p062g7.c0 c0Var = d0Var.f22174o;
            c0Var.getClass();
            this.f22111i = 32 | this.f22111i;
            this.f22116o = c0Var;
        }
        this.f25492h = this.f25492h.e(d0Var.f22168h);
    }
}
