package p005a5;

import p117n6.c;

public final class X0 extends c {

    public C1218a1 f14074h;

    public Object f14075i;
    public final C1218a1 j;

    public int f14076k;

    public X0(C1218a1 c1218a1, c cVar) {
        super(cVar);
        this.j = c1218a1;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14075i = obj;
        this.f14076k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
