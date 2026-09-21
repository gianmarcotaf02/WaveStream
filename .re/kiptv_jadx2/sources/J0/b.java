package J0;

public final class b extends p117n6.c {

    public Object f5976h;

    public final d f5977i;
    public int j;

    public b(d dVar, p117n6.c cVar) {
        super(cVar);
        this.f5977i = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5976h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f5977i.a(0L, 0L, this);
    }
}
