package B;

import O0.g0;

public final class C0073k implements p194x6.j {

    public final int f543h;

    public final g0 f544i;

    public C0073k(g0 g0Var, int i3) {
        this.f543h = i3;
        this.f544i = g0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        O0.f0 layout = (O0.f0) obj;
        switch (this.f543h) {
            case 0:
                O0.f0.j(layout, this.f544i, 0, 0);
                break;
            case 1:
                O0.f0.j(layout, this.f544i, 0, 0);
                break;
            case 2:
                p113n1.n nVarC = layout.c();
                p113n1.n nVar = p113n1.n.f25566h;
                g0 g0Var = this.f544i;
                if (nVarC == nVar || layout.f() == 0) {
                    O0.f0.a(layout, g0Var);
                    g0Var.h0(p113n1.k.c(0L, g0Var.f7642l), 0.0f, null);
                } else {
                    int i3 = (int) 0;
                    long jF = ((long) ((layout.f() - g0Var.f7639h) - i3)) << 32;
                    O0.f0.a(layout, g0Var);
                    g0Var.h0(p113n1.k.c((((long) i3) & 4294967295L) | jF, g0Var.f7642l), 0.0f, null);
                }
                break;
            case 3:
                O0.f0.j(layout, this.f544i, 0, 0);
                break;
            case 4:
                O0.f0.j(layout, this.f544i, 0, 0);
                break;
            case 5:
                layout.g(this.f544i, 0, 0, 0.0f);
                break;
            case 6:
                layout.g(this.f544i, 0, 0, 0.0f);
                break;
            case 7:
                O0.f0.j(layout, this.f544i, 0, 0);
                break;
            case 8:
                O0.f0.j(layout, this.f544i, 0, 0);
                break;
            case 9:
                layout.g(this.f544i, 0, 0, 0.0f);
                break;
            default:
                kotlin.jvm.internal.m.e(layout, "$this$layout");
                g0 g0Var2 = this.f544i;
                int i9 = g0Var2.f7640i;
                int i10 = g0Var2.f7639h;
                layout.g(g0Var2, (i9 - i10) / 2, (i10 - i9) / 2, 0.0f);
                break;
        }
        return p070h6.A.f22523a;
    }
}
