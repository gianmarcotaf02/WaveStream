package D;

import v.n0;

public final class B extends p117n6.c {

    public n0 f1635h;

    public p194x6.m f1636i;
    public Object j;

    public final D f1637k;

    public int f1638l;

    public B(D d4, p100l6.c cVar) {
        super(cVar);
        this.f1637k = d4;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f1638l |= Integer.MIN_VALUE;
        return this.f1637k.c(null, null, this);
    }
}
