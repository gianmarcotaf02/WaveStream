package V7;

import E5.D0;

public final class A extends p117n6.c {

    public D0 f10365h;

    public Object f10366i;
    public Object j;

    public final D0 f10367k;

    public int f10368l;

    public A(D0 d4, p100l6.c cVar) {
        super(cVar);
        this.f10367k = d4;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f10368l |= Integer.MIN_VALUE;
        return this.f10367k.emit(null, this);
    }
}
