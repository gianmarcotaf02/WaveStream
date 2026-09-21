package p163t;

import p020c0.H;

public final class B0 implements H {

    public final int f27437a;

    public final y0 f27438b;

    public B0(y0 y0Var, int i3) {
        this.f27437a = i3;
        this.f27438b = y0Var;
    }

    @Override
    public final void dispose() {
        switch (this.f27437a) {
            case 0:
                y0 y0Var = this.f27438b;
                y0Var.i();
                y0Var.f27727a.C0();
                break;
            default:
                y0 y0Var2 = this.f27438b;
                y0Var2.i();
                y0Var2.f27727a.C0();
                break;
        }
    }
}
