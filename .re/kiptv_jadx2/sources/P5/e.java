package P5;

public final class e extends p117n6.c {

    public g f8151h;

    public Object f8152i;
    public final g j;

    public int f8153k;

    public e(g gVar, p117n6.c cVar) {
        super(cVar);
        this.j = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8152i = obj;
        this.f8153k |= Integer.MIN_VALUE;
        return this.j.c(this);
    }
}
