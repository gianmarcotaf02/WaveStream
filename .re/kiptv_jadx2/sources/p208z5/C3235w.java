package p208z5;

import p117n6.c;

public final class C3235w extends c {

    public X f32868h;

    public Object f32869i;
    public final X j;

    public int f32870k;

    public C3235w(X x9, c cVar) {
        super(cVar);
        this.j = x9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f32869i = obj;
        this.f32870k |= Integer.MIN_VALUE;
        return X.e(this.j, 0, this);
    }
}
