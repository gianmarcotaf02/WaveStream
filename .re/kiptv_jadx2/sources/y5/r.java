package y5;

import J5.V;

public final class r extends p117n6.c {

    public Object f31936h;

    public int f31937i;
    public final V j;

    public r(V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f31936h = obj;
        this.f31937i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
