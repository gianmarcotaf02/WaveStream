package O1;

public final class V extends p117n6.c {

    public p028c8.d f7801h;

    public boolean f7802i;
    public Object j;

    public final X f7803k;

    public int f7804l;

    public V(X x9, p117n6.c cVar) {
        super(cVar);
        this.f7803k = x9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f7804l |= Integer.MIN_VALUE;
        return this.f7803k.c(null, this);
    }
}
