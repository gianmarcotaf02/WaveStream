package H2;

public final class v extends p117n6.c {

    public y f3914h;

    public p028c8.j f3915i;
    public Object j;

    public final y f3916k;

    public int f3917l;

    public v(y yVar, p117n6.c cVar) {
        super(cVar);
        this.f3916k = yVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f3917l |= Integer.MIN_VALUE;
        return this.f3916k.a(this);
    }
}
