package J;

import kotlin.jvm.functions.Function0;

public final class Z implements Function0 {

    public final int f5745h;

    public final g0 f5746i;

    public Z(g0 g0Var, int i3) {
        this.f5745h = i3;
        this.f5746i = g0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f5745h) {
            case 0:
                this.f5746i.a();
                break;
            default:
                this.f5746i.onCancel();
                break;
        }
        return p070h6.A.f22523a;
    }
}
