package p008a8;

import p117n6.c;

public final class f extends c {

    public g f15530h;

    public Object f15531i;
    public final g j;

    public int f15532k;

    public f(g gVar, c cVar) {
        super(cVar);
        this.j = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15531i = obj;
        this.f15532k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}
