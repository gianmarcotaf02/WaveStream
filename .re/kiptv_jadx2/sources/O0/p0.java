package O0;

import p020c0.AbstractC1709v;

public final class p0 extends kotlin.jvm.internal.o implements p194x6.m {

    public final int f7677h;

    public final q0 f7678i;

    public p0(q0 q0Var, int i3) {
        super(2);
        this.f7677h = i3;
        this.f7678i = q0Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7677h) {
            case 0:
                this.f7678i.a().f7596i = (AbstractC1709v) obj2;
                break;
            case 1:
                N nA = this.f7678i.a();
                ((Q0.F) obj).h0(new I(nA, (p194x6.m) obj2, nA.f7609w));
                break;
            default:
                Q0.F f9 = (Q0.F) obj;
                N n3 = f9.f8234P;
                q0 q0Var = this.f7678i;
                if (n3 == null) {
                    n3 = new N(f9, q0Var.f7679a);
                    f9.f8234P = n3;
                }
                q0Var.f7680b = n3;
                q0Var.a().h();
                N nA2 = q0Var.a();
                t0 t0Var = nA2.j;
                t0 t0Var2 = q0Var.f7679a;
                if (t0Var != t0Var2) {
                    nA2.j = t0Var2;
                    nA2.i(false);
                    Q0.F.a0(nA2.f7595h, false, 7);
                }
                break;
        }
        return p070h6.A.f22523a;
    }
}
