package Y4;

public final class C1096n extends p117n6.c {

    public Object f11997h;

    public final C1105q f11998i;
    public int j;

    public C1096n(C1105q c1105q, p117n6.c cVar) {
        super(cVar);
        this.f11998i = c1105q;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11997h = obj;
        this.j |= Integer.MIN_VALUE;
        return C1105q.a(this.f11998i, null, this);
    }
}
