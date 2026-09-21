package A7;

import kotlin.jvm.functions.Function0;
import p078i6.I;

public final class v implements Function0 {

    public final int f350h;

    public final x f351i;
    public final y j;

    public v(x xVar, y yVar, int i3) {
        this.f350h = i3;
        this.f351i = xVar;
        this.j = yVar;
    }

    @Override
    public final Object invoke() {
        switch (this.f350h) {
            case 0:
                return I.o0(this.f351i.f355a.keySet(), this.j.o());
            default:
                return I.o0(this.f351i.f356b.keySet(), this.j.p());
        }
    }
}
