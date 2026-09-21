package p005a5;

import p117n6.c;

public final class t9 extends c {

    public x9 f15112h;

    public Object f15113i;
    public final x9 j;

    public int f15114k;

    public t9(x9 x9Var, c cVar) {
        super(cVar);
        this.j = x9Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15113i = obj;
        this.f15114k |= Integer.MIN_VALUE;
        return this.j.f(this);
    }
}
