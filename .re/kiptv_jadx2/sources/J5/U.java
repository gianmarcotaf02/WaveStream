package J5;

public final class U extends p117n6.c {

    public Object f6278h;

    public int f6279i;
    public final V j;

    public U(V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6278h = obj;
        this.f6279i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
