package p015b5;

import p117n6.c;

public final class i extends c {

    public k f17961h;

    public Object f17962i;
    public final k j;

    public int f17963k;

    public i(k kVar, c cVar) {
        super(cVar);
        this.j = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17962i = obj;
        this.f17963k |= Integer.MIN_VALUE;
        return this.j.f(this);
    }
}
