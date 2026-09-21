package p005a5;

import p117n6.c;

public final class u9 extends c {

    public x9 f15156h;

    public String f15157i;
    public Object j;

    public final x9 f15158k;

    public int f15159l;

    public u9(x9 x9Var, c cVar) {
        super(cVar);
        this.f15158k = x9Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f15159l |= Integer.MIN_VALUE;
        return this.f15158k.g(0, this);
    }
}
