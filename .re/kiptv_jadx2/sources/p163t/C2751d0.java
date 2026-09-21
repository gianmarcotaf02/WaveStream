package p163t;

import p117n6.c;

public final class C2751d0 extends c {

    public Object f27577h;

    public Object f27578i;
    public final C2755f0 j;

    public int f27579k;

    public C2751d0(C2755f0 c2755f0, c cVar) {
        super(cVar);
        this.j = c2755f0;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f27578i = obj;
        this.f27579k |= Integer.MIN_VALUE;
        return C2755f0.G0(this.j, this);
    }
}
