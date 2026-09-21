package p005a5;

import p117n6.c;

public final class v9 extends c {

    public x9 f15219h;

    public Object f15220i;
    public final x9 j;

    public int f15221k;

    public v9(x9 x9Var, c cVar) {
        super(cVar);
        this.j = x9Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15220i = obj;
        this.f15221k |= Integer.MIN_VALUE;
        return this.j.h(this);
    }
}
