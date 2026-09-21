package p193x5;

import S4.p;
import kotlin.jvm.functions.Function0;
import p070h6.A;
import p194x6.m;

public final class O implements Function0 {

    public final int f31346h;

    public final m f31347i;
    public final p j;

    public final C3113e f31348k;

    public O(m mVar, p pVar, C3113e c3113e, int i3) {
        this.f31346h = i3;
        this.f31347i = mVar;
        this.j = pVar;
        this.f31348k = c3113e;
    }

    @Override
    public final Object invoke() {
        switch (this.f31346h) {
            case 0:
                this.f31347i.invoke(this.j, this.f31348k.f31449c);
                break;
            default:
                this.f31347i.invoke(this.j, this.f31348k);
                break;
        }
        return A.f22523a;
    }
}
