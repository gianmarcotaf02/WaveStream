package p005a5;

import p117n6.c;

public final class E2 extends c {

    public J2 f13337h;

    public Object f13338i;
    public final J2 j;

    public int f13339k;

    public E2(J2 j9, c cVar) {
        super(cVar);
        this.j = j9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13338i = obj;
        this.f13339k |= Integer.MIN_VALUE;
        return J2.b(this.j, this);
    }
}
