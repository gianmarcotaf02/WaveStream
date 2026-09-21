package v5;

public final class C2941n extends p117n6.c {

    public C2943o f29549h;

    public Object f29550i;
    public final C2943o j;

    public int f29551k;

    public C2941n(C2943o c2943o, p117n6.c cVar) {
        super(cVar);
        this.j = c2943o;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f29550i = obj;
        this.f29551k |= Integer.MIN_VALUE;
        return this.j.e(null, 0, null, 0, this);
    }
}
