package p005a5;

import p117n6.c;

public final class p9 extends c {

    public x9 f14956h;

    public Object f14957i;
    public final x9 j;

    public int f14958k;

    public p9(x9 x9Var, c cVar) {
        super(cVar);
        this.j = x9Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14957i = obj;
        this.f14958k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
