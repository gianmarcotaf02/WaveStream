package p163t;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;

public final class p0 implements Function0 {

    public final int f27667h;

    public final y0 f27668i;

    public p0(y0 y0Var, int i3) {
        this.f27667h = i3;
        this.f27668i = y0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f27667h) {
            case 0:
                y0 y0Var = this.f27668i;
                return Boolean.valueOf((m.a(y0Var.f27730d.getValue(), y0Var.f27727a.s0()) && y0Var.g.g() == Long.MIN_VALUE && !((Boolean) y0Var.f27733h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.f27668i.b());
        }
    }
}
