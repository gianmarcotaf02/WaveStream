package p034d5;

import p028c8.d;
import p117n6.c;

public final class f extends c {

    public c f21246h;

    public d f21247i;
    public Object j;

    public final c f21248k;

    public int f21249l;

    public f(c cVar, c cVar2) {
        super(cVar2);
        this.f21248k = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f21249l |= Integer.MIN_VALUE;
        return this.f21248k.a(this);
    }
}
