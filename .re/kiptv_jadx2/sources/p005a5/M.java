package p005a5;

import p117n6.c;

public final class M extends c {

    public int f13638h;

    public Object f13639i;
    public final O j;

    public int f13640k;

    public M(O o8, c cVar) {
        super(cVar);
        this.j = o8;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13639i = obj;
        this.f13640k |= Integer.MIN_VALUE;
        return this.j.f(0, 0, 0, null, null, this);
    }
}
