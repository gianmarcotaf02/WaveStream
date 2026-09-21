package x;

public final class C3064r0 extends p117n6.c {

    public Object f30993h;

    public final C3066s0 f30994i;
    public int j;

    public C3064r0(C3066s0 c3066s0, p117n6.c cVar) {
        super(cVar);
        this.f30994i = c3066s0;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f30993h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f30994i.f(this);
    }
}
