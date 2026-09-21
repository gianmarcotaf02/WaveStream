package Z;

import kotlin.jvm.functions.Function0;

public final class Y extends kotlin.jvm.internal.o implements Function0 {

    public final int f12350h;

    public final Function0 f12351i;

    public Y(int i3, Function0 function0) {
        super(0);
        this.f12350h = i3;
        this.f12351i = function0;
    }

    @Override
    public final Object invoke() {
        switch (this.f12350h) {
            case 0:
                return Float.valueOf(O7.r.r(((Number) this.f12351i.invoke()).floatValue(), 0.0f, 1.0f));
            default:
                this.f12351i.invoke();
                return Boolean.TRUE;
        }
    }
}
