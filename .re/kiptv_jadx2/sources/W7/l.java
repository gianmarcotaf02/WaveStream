package W7;

import J.C0559y;

public final class l extends p117n6.c {

    public C0559y f10747h;

    public Object f10748i;
    public Object j;

    public final C0559y f10749k;

    public int f10750l;

    public l(C0559y c0559y, p100l6.c cVar) {
        super(cVar);
        this.f10749k = c0559y;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f10750l |= Integer.MIN_VALUE;
        return this.f10749k.emit(null, this);
    }
}
