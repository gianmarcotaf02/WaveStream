package V7;

public final class E extends p117n6.c {

    public F f10377h;

    public Object f10378i;
    public int j;

    public final F f10379k;

    public Object f10380l;

    public E(F f9, p100l6.c cVar) {
        super(cVar);
        this.f10379k = f9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10378i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10379k.emit(null, this);
    }
}
