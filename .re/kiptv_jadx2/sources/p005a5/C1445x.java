package p005a5;

import p117n6.c;

public final class C1445x extends c {

    public C1455y f15278h;

    public Object f15279i;
    public final C1455y j;

    public int f15280k;

    public C1445x(C1455y c1455y, c cVar) {
        super(cVar);
        this.j = c1455y;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15279i = obj;
        this.f15280k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
