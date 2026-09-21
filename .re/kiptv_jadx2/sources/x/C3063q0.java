package x;

public final class C3063q0 extends p117n6.c {

    public Object f30986h;

    public final C3066s0 f30987i;
    public int j;

    public C3063q0(C3066s0 c3066s0, p117n6.c cVar) {
        super(cVar);
        this.f30987i = c3066s0;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f30986h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f30987i.c(this);
    }
}
