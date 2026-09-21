package Y;

public final class i extends p117n6.c {

    public p f10981h;

    public Object f10982i;
    public final p j;

    public int f10983k;

    public i(p pVar, p117n6.c cVar) {
        super(cVar);
        this.j = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10982i = obj;
        this.f10983k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}
