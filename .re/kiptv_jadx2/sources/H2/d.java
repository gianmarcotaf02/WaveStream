package H2;

public final class d extends p117n6.c {

    public Object f3876h;

    public p028c8.j f3877i;
    public Object j;

    public final e f3878k;

    public int f3879l;

    public d(e eVar, p117n6.c cVar) {
        super(cVar);
        this.f3878k = eVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f3879l |= Integer.MIN_VALUE;
        return this.f3878k.a(this);
    }
}
