package p015b5;

import p117n6.c;

public final class q extends c {

    public t f17983h;

    public int f17984i;
    public Object j;

    public final t f17985k;

    public int f17986l;

    public q(t tVar, c cVar) {
        super(cVar);
        this.f17985k = tVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f17986l |= Integer.MIN_VALUE;
        return this.f17985k.a(null, this);
    }
}
