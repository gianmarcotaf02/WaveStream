package p208z5;

import p117n6.c;

public final class S extends c {

    public Object f32561h;

    public final X f32562i;
    public int j;

    public S(X x9, c cVar) {
        super(cVar);
        this.f32562i = x9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f32561h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f32562i.r(null, this);
    }
}
