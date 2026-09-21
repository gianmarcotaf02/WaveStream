package p208z5;

import p117n6.c;

public final class O extends c {

    public X f32541h;

    public boolean f32542i;
    public Object j;

    public final X f32543k;

    public int f32544l;

    public O(X x9, p100l6.c cVar) {
        super(cVar);
        this.f32543k = x9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f32544l |= Integer.MIN_VALUE;
        return X.f(this.f32543k, this);
    }
}
