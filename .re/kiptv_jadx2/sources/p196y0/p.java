package p196y0;

import O7.r;
import kotlin.jvm.internal.o;
import p194x6.j;

public final class p extends o implements j {

    public final int f31776h;

    public final q f31777i;

    public p(q qVar, int i3) {
        super(1);
        this.f31776h = i3;
        this.f31777i = qVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f31776h) {
            case 0:
                double dDoubleValue = ((Number) obj).doubleValue();
                q qVar = this.f31777i;
                return Double.valueOf(qVar.f31787n.c(r.q(dDoubleValue, qVar.f31780e, qVar.f31781f)));
            default:
                double dDoubleValue2 = ((Number) obj).doubleValue();
                q qVar2 = this.f31777i;
                return Double.valueOf(r.q(qVar2.f31784k.c(dDoubleValue2), qVar2.f31780e, qVar2.f31781f));
        }
    }
}
