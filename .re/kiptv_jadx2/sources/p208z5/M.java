package p208z5;

import p117n6.c;

public final class M extends c {

    public J f32525h;

    public Object f32526i;
    public final J j;

    public int f32527k;

    public M(J j, p100l6.c cVar) {
        super(cVar);
        this.j = j;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f32526i = obj;
        this.f32527k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
