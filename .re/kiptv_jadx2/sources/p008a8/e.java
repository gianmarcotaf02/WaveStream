package p008a8;

import N6.A;
import S7.O;
import U7.AbstractC0956d;
import X7.q;
import kotlin.jvm.internal.j;
import p117n6.i;
import p194x6.n;

public final class e {

    public final Object f15523a;

    public final j f15524b;

    public final n f15525c;

    public final A f15526d;

    public final i f15527e;

    public Object f15528f;
    public int g = -1;

    public final g f15529h;

    public e(g gVar, Object obj, n nVar, n nVar2, A a2, i iVar, AbstractC0956d abstractC0956d) {
        this.f15529h = gVar;
        this.f15523a = obj;
        this.f15524b = (j) nVar;
        this.f15525c = nVar2;
        this.f15526d = a2;
        this.f15527e = iVar;
    }

    public final void a() {
        Object obj = this.f15528f;
        if (obj instanceof q) {
            ((q) obj).h(this.g, this.f15529h.f15534h);
            return;
        }
        O o8 = obj instanceof O ? (O) obj : null;
        if (o8 != null) {
            o8.dispose();
        }
    }
}
