package A7;

import kotlin.jvm.functions.Function0;

public final class t implements Function0 {

    public final int f346h;

    public final Function0 f347i;

    public t(int i3, Function0 function0) {
        this.f346h = i3;
        this.f347i = function0;
    }

    @Override
    public final Object invoke() {
        switch (this.f346h) {
            case 0:
                return p078i6.o.R1((Iterable) this.f347i.invoke());
            default:
                p180v7.o oVar = (p180v7.o) this.f347i.invoke();
                return oVar instanceof p180v7.k ? ((p180v7.k) oVar).h() : oVar;
        }
    }
}
