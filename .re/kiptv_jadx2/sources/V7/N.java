package V7;

public final class N extends p117n6.c {

    public Object f10405h;

    public int f10406i;
    public final J5.V j;

    public N(J5.V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10405h = obj;
        this.f10406i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
