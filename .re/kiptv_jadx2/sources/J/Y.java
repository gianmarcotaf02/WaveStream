package J;

import U.C0952z;

public final class Y implements p194x6.j {

    public final int f5743h;

    public final g0 f5744i;

    public Y(g0 g0Var, int i3) {
        this.f5743h = i3;
        this.f5744i = g0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f5743h) {
            case 0:
                this.f5744i.c(((p181w0.a) obj).f29744a, C0952z.f10100d);
                break;
            case 1:
                K0.x xVar = (K0.x) obj;
                this.f5744i.e(K0.w.g(xVar, false));
                xVar.a();
                break;
            default:
                K0.x xVar2 = (K0.x) obj;
                this.f5744i.e(K0.w.g(xVar2, false));
                xVar2.a();
                break;
        }
        return p070h6.A.f22523a;
    }
}
