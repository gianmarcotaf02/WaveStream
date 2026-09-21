package p163t;

import p117n6.c;

public final class Y extends c {

    public Object f27525h;

    public final C2755f0 f27526i;
    public int j;

    public Y(C2755f0 c2755f0, c cVar) {
        super(cVar);
        this.f27526i = c2755f0;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f27525h = obj;
        this.j |= Integer.MIN_VALUE;
        return C2755f0.F0(this.f27526i, this);
    }
}
