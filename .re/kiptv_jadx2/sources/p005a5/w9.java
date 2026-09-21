package p005a5;

import p117n6.c;

public final class w9 extends c {

    public x9 f15275h;

    public Object f15276i;
    public final x9 j;

    public int f15277k;

    public w9(x9 x9Var, c cVar) {
        super(cVar);
        this.j = x9Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15276i = obj;
        this.f15277k |= Integer.MIN_VALUE;
        return this.j.i(this);
    }
}
