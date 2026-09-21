package F;

import kotlin.jvm.functions.Function0;

public final class Z implements Function0 {

    public final int f3400h;

    public final b0 f3401i;

    public Z(b0 b0Var, int i3) {
        this.f3400h = i3;
        this.f3401i = b0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f3400h) {
            case 0:
                return Float.valueOf(this.f3401i.f3416w.b());
            case 1:
                return Float.valueOf(this.f3401i.f3416w.d());
            default:
                b0 b0Var = this.f3401i;
                return Float.valueOf(b0Var.f3416w.a() - b0Var.f3416w.c());
        }
    }
}
