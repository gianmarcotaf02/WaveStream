package K2;

public final class f extends p117n6.c {

    public k f6807h;

    public Object f6808i;
    public final h j;

    public int f6809k;

    public f(h hVar, p117n6.c cVar) {
        super(cVar);
        this.j = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6808i = obj;
        this.f6809k |= Integer.MIN_VALUE;
        return this.j.d(null, this);
    }
}
