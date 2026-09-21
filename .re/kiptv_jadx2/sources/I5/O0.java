package I5;

import kotlin.jvm.functions.Function0;

public final class O0 implements Function0 {

    public final int f4852h;

    public final p020c0.X f4853i;
    public final p020c0.X j;

    public O0(p020c0.X x9, p020c0.X x10, int i3) {
        this.f4852h = i3;
        this.f4853i = x9;
        this.j = x10;
    }

    @Override
    public final Object invoke() {
        switch (this.f4852h) {
            case 0:
                this.f4853i.setValue(null);
                this.j.setValue(null);
                break;
            case 1:
                p020c0.X x9 = this.f4853i;
                p020c0.X x10 = this.j;
                x9.setValue(null);
                x10.setValue(null);
                break;
            case 2:
                Boolean bool = Boolean.TRUE;
                this.f4853i.setValue(bool);
                this.j.setValue(bool);
                break;
            case 3:
                J5.O2 o8 = (J5.O2) this.f4853i.getValue();
                if (!o8.f6219m && !o8.f6220n) {
                    this.j.setValue(Boolean.TRUE);
                }
                break;
            case 4:
                this.f4853i.setValue(Boolean.FALSE);
                this.j.setValue(Boolean.TRUE);
                break;
            case 5:
                this.f4853i.setValue(Boolean.FALSE);
                this.j.setValue(Boolean.TRUE);
                break;
            case 6:
                this.f4853i.setValue(null);
                this.j.setValue(null);
                break;
            default:
                p020c0.X x11 = this.f4853i;
                p020c0.X x12 = this.j;
                x11.setValue(null);
                x12.setValue(null);
                break;
        }
        return p070h6.A.f22523a;
    }
}
