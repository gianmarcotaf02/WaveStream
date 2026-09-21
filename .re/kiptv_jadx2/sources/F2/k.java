package F2;

public final class k extends p117n6.c {

    public l f3539h;

    public p100l6.j f3540i;
    public Object j;

    public final l f3541k;

    public int f3542l;

    public k(l lVar, p117n6.c cVar) {
        super(cVar);
        this.f3541k = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f3542l |= Integer.MIN_VALUE;
        return this.f3541k.e(this);
    }
}
