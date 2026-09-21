package V4;

import J5.V;

public final class C0973p extends p117n6.c {

    public Object f10323h;

    public int f10324i;
    public final V j;

    public C0973p(V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10323h = obj;
        this.f10324i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
