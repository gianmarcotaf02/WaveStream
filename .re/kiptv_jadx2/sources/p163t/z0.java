package p163t;

import p194x6.j;

public final class z0 implements j {

    public final int f27740h;

    public final y0 f27741i;

    public z0(y0 y0Var, int i3) {
        this.f27740h = i3;
        this.f27741i = y0Var;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f27740h) {
            case 0:
                return new B0(this.f27741i, 0);
            default:
                return new B0(this.f27741i, 1);
        }
    }
}
