package O1;

public final class r extends p117n6.c {

    public Object f7857h;

    public int f7858i;
    public final J5.V j;

    public r(J5.V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f7857h = obj;
        this.f7858i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
