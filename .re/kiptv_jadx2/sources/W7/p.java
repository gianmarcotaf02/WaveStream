package W7;

public final class p extends p117n6.c {

    public Object f10755h;

    public final q f10756i;
    public int j;

    public p(q qVar, p100l6.c cVar) {
        super(cVar);
        this.f10756i = qVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10755h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10756i.emit(null, this);
    }
}
