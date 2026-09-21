package p005a5;

import p117n6.c;

public final class q9 extends c {

    public x9 f15010h;

    public Object f15011i;
    public final x9 j;

    public int f15012k;

    public q9(x9 x9Var, c cVar) {
        super(cVar);
        this.j = x9Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15011i = obj;
        this.f15012k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
