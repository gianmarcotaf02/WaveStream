package p125o5;

import J5.V;

public final class c extends p117n6.c {

    public Object f26137h;

    public int f26138i;
    public final V j;

    public c(V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f26137h = obj;
        this.f26138i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
