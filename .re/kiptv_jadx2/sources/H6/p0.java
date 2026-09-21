package H6;

import T6.AbstractC0926d;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;

public final class p0 implements Function0 {

    public final int f4478h;

    public final q0 f4479i;

    public p0(q0 q0Var, int i3) {
        this.f4478h = i3;
        this.f4479i = q0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.f4478h) {
            case 0:
                q0 q0Var = this.f4479i;
                return q0Var.b(q0Var.f4483h);
            default:
                v0 v0Var = this.f4479i.f4484i;
                Type type = v0Var != null ? (Type) v0Var.invoke() : null;
                kotlin.jvm.internal.m.b(type);
                return AbstractC0926d.c(type);
        }
    }
}
