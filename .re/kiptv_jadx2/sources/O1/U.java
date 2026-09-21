package O1;

public final class U extends p117n6.c {

    public Object f7797h;

    public p028c8.d f7798i;
    public Object j;

    public final X f7799k;

    public int f7800l;

    public U(X x9, p117n6.c cVar) {
        super(cVar);
        this.f7799k = x9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f7800l |= Integer.MIN_VALUE;
        return this.f7799k.b(null, this);
    }
}
