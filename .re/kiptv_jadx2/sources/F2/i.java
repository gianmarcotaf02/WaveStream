package F2;

public final class i extends p117n6.c {

    public S2.h f3535h;

    public Object f3536i;
    public final j j;

    public int f3537k;

    public i(j jVar, p117n6.c cVar) {
        super(cVar);
        this.j = jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3536i = obj;
        this.f3537k |= Integer.MIN_VALUE;
        return this.j.a(null, null, this);
    }
}
