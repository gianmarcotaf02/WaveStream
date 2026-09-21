package p163t;

import p117n6.c;

public final class C2753e0 extends c {

    public Object f27584h;

    public Object f27585i;
    public final C2755f0 j;

    public int f27586k;

    public C2753e0(C2755f0 c2755f0, c cVar) {
        super(cVar);
        this.j = c2755f0;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f27585i = obj;
        this.f27586k |= Integer.MIN_VALUE;
        return C2755f0.H0(this.j, this);
    }
}
