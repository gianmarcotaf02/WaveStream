package J5;

public final class H extends p117n6.c {

    public K f6106h;

    public Object f6107i;
    public final K j;

    public int f6108k;

    public H(K k9, p117n6.c cVar) {
        super(cVar);
        this.j = k9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6107i = obj;
        this.f6108k |= Integer.MIN_VALUE;
        return K.e(this.j, this);
    }
}
