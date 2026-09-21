package J0;

public final class c extends p117n6.c {

    public Object f5978h;

    public final d f5979i;
    public int j;

    public c(d dVar, p117n6.c cVar) {
        super(cVar);
        this.f5979i = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5978h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f5979i.b(0L, this);
    }
}
