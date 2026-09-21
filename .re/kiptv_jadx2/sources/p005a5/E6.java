package p005a5;

import p117n6.c;
import p194x6.m;

public final class E6 extends c {

    public Object f13351h;

    public m f13352i;
    public Object j;

    public final F6 f13353k;

    public int f13354l;

    public E6(F6 f9, p100l6.c cVar) {
        super(cVar);
        this.f13353k = f9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f13354l |= Integer.MIN_VALUE;
        return this.f13353k.d(null, this);
    }
}
