package p005a5;

import p117n6.c;

public final class Y0 extends c {

    public C1218a1 f14110h;

    public O0 f14111i;
    public Object j;

    public final C1218a1 f14112k;

    public int f14113l;

    public Y0(C1218a1 c1218a1, c cVar) {
        super(cVar);
        this.f14112k = c1218a1;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f14113l |= Integer.MIN_VALUE;
        return this.f14112k.f(this);
    }
}
