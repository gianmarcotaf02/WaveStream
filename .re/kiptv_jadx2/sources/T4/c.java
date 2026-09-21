package T4;

public final class c extends p117n6.c {

    public g f9815h;

    public p028c8.d f9816i;
    public Object j;

    public final g f9817k;

    public int f9818l;

    public c(g gVar, p117n6.c cVar) {
        super(cVar);
        this.f9817k = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f9818l |= Integer.MIN_VALUE;
        return this.f9817k.a(this);
    }
}
