package p116n5;

import J5.V;
import p117n6.c;

public final class z extends c {

    public Object f25829h;

    public int f25830i;
    public final V j;

    public z(V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f25829h = obj;
        this.f25830i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
