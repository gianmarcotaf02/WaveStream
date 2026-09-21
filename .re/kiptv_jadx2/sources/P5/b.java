package P5;

public final class b extends p117n6.c {

    public g f8144h;

    public Object f8145i;
    public final g j;

    public int f8146k;

    public b(g gVar, p117n6.c cVar) {
        super(cVar);
        this.j = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8145i = obj;
        this.f8146k |= Integer.MIN_VALUE;
        return this.j.b(this);
    }
}
