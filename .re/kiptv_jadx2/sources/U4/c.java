package U4;

public final class c extends p117n6.c {

    public Object f10125h;

    public String f10126i;
    public Object j;

    public final g f10127k;

    public int f10128l;

    public c(g gVar, p117n6.c cVar) {
        super(cVar);
        this.f10127k = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f10128l |= Integer.MIN_VALUE;
        return this.f10127k.b(null, this);
    }
}
