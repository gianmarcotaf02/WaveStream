package V7;

public final class C0976b extends p117n6.c {

    public U7.A f10440h;

    public Object f10441i;
    public final C0977c j;

    public int f10442k;

    public C0976b(C0977c c0977c, p117n6.c cVar) {
        super(cVar);
        this.j = c0977c;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10441i = obj;
        this.f10442k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}
