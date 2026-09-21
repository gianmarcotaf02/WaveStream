package p005a5;

import p117n6.c;

public final class r9 extends c {

    public x9 f15039h;

    public Object f15040i;
    public final x9 j;

    public int f15041k;

    public r9(x9 x9Var, c cVar) {
        super(cVar);
        this.j = x9Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15040i = obj;
        this.f15041k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}
