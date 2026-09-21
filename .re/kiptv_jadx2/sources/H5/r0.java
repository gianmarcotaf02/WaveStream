package H5;

public final class r0 extends p117n6.c {

    public E0 f4295h;

    public String f4296i;
    public Object j;

    public final E0 f4297k;

    public int f4298l;

    public r0(E0 e6, p117n6.c cVar) {
        super(cVar);
        this.f4297k = e6;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f4298l |= Integer.MIN_VALUE;
        return E0.e(this.f4297k, null, this);
    }
}
