package p208z5;

import p117n6.c;

public final class r extends c {

    public X f32805h;

    public Object f32806i;
    public final X j;

    public int f32807k;

    public r(X x9, c cVar) {
        super(cVar);
        this.j = x9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f32806i = obj;
        this.f32807k |= Integer.MIN_VALUE;
        return this.j.h(null, this);
    }
}
