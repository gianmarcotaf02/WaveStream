package K0;

import S7.w0;

public final class O extends p117n6.c {

    public w0 f6663h;

    public Object f6664i;
    public final S j;

    public int f6665k;

    public O(S s9, p117n6.c cVar) {
        super(cVar);
        this.j = s9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6664i = obj;
        this.f6665k |= Integer.MIN_VALUE;
        return this.j.f(0L, null, this);
    }
}
