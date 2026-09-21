package p015b5;

import p117n6.c;

public final class h extends c {

    public k f17958h;

    public Object f17959i;
    public final k j;

    public int f17960k;

    public h(k kVar, c cVar) {
        super(cVar);
        this.j = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17959i = obj;
        this.f17960k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}
