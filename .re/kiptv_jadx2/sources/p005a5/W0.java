package p005a5;

import p117n6.c;

public final class W0 extends c {

    public C1218a1 f14047h;

    public String f14048i;
    public Object j;

    public final C1218a1 f14049k;

    public int f14050l;

    public W0(C1218a1 c1218a1, c cVar) {
        super(cVar);
        this.f14049k = c1218a1;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f14050l |= Integer.MIN_VALUE;
        return this.f14049k.d(null, null, this);
    }
}
