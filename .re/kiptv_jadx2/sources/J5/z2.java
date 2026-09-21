package J5;

import V7.InterfaceC0982h;

public final class z2 implements InterfaceC0982h {

    public final int f6629h;

    public final N2 f6630i;

    public z2(N2 n3, int i3) {
        this.f6629h = i3;
        this.f6630i = n3;
    }

    @Override
    public final Object emit(Object obj, p100l6.c cVar) {
        Object value;
        Object value2;
        switch (this.f6629h) {
            case 0:
                O2 o8 = (O2) obj;
                V7.n0 n0Var = this.f6630i.f6199e;
                do {
                    value = n0Var.getValue();
                } while (!n0Var.g(value, O2.a(o8, ((O2) value).f6225s)));
                break;
            default:
                V7.n0 n0Var2 = this.f6630i.f6199e;
                do {
                    value2 = n0Var2.getValue();
                } while (!n0Var2.g(value2, O2.a((O2) value2, true)));
                break;
        }
        return p070h6.A.f22523a;
    }
}
