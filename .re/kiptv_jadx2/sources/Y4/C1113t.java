package Y4;

public final class C1113t extends p117n6.c {

    public C1131z f12080h;

    public int f12081i;
    public Object j;

    public final C1131z f12082k;

    public int f12083l;

    public C1113t(C1131z c1131z, p117n6.c cVar) {
        super(cVar);
        this.f12082k = c1131z;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f12083l |= Integer.MIN_VALUE;
        return this.f12082k.b(0, this);
    }
}
