package p154s;

import O0.f0;
import O0.g0;
import kotlin.jvm.internal.o;
import p070h6.A;
import p113n1.n;
import p194x6.j;

public final class C2722h extends o implements j {

    public final g0[] f27147h;

    public final C2723i f27148i;
    public final int j;

    public final int f27149k;

    public C2722h(g0[] g0VarArr, C2723i c2723i, int i3, int i9) {
        super(1);
        this.f27147h = g0VarArr;
        this.f27148i = c2723i;
        this.j = i3;
        this.f27149k = i9;
    }

    @Override
    public final Object invoke(Object obj) {
        f0 f0Var = (f0) obj;
        for (g0 g0Var : this.f27147h) {
            if (g0Var != null) {
                long jA = this.f27148i.f27150a.f27162b.a((((long) g0Var.f7639h) << 32) | (((long) g0Var.f7640i) & 4294967295L), (((long) this.j) << 32) | (((long) this.f27149k) & 4294967295L), n.f25566h);
                f0Var.g(g0Var, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
            }
        }
        return A.f22523a;
    }
}
