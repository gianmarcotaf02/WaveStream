package H6;

import kotlin.jvm.functions.Function0;

public final class f0 implements Function0 {

    public final int f4436h;

    public final h0 f4437i;

    public f0(h0 h0Var, int i3) {
        this.f4436h = i3;
        this.f4437i = h0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f4436h) {
            case 0:
                return new g0(this.f4437i);
            default:
                return this.f4437i.r();
        }
    }
}
