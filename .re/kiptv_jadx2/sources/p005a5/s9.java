package p005a5;

import p117n6.c;

public final class s9 extends c {

    public x9 f15084h;

    public Object f15085i;
    public final x9 j;

    public int f15086k;

    public s9(x9 x9Var, c cVar) {
        super(cVar);
        this.j = x9Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15085i = obj;
        this.f15086k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
