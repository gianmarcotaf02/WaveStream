package p005a5;

import p117n6.c;

public final class I3 extends c {

    public Object f13505h;

    public final J3 f13506i;
    public int j;

    public I3(J3 j9, c cVar) {
        super(cVar);
        this.f13506i = j9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13505h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f13506i.e(null, null, null, this);
    }
}
