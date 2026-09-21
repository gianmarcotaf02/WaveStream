package p015b5;

import p117n6.c;

public final class g extends c {

    public k f17954h;

    public int f17955i;
    public Object j;

    public final k f17956k;

    public int f17957l;

    public g(k kVar, c cVar) {
        super(cVar);
        this.f17956k = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f17957l |= Integer.MIN_VALUE;
        return this.f17956k.c(0, this);
    }
}
