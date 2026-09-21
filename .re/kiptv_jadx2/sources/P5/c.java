package P5;

import J5.V;

public final class c extends p117n6.c {

    public Object f8147h;

    public int f8148i;
    public final V j;

    public c(V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8147h = obj;
        this.f8148i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
