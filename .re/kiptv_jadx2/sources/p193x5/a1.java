package p193x5;

import J5.V;
import p117n6.c;

public final class a1 extends c {

    public Object f31422h;

    public int f31423i;
    public final V j;

    public a1(V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f31422h = obj;
        this.f31423i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
