package Y4;

public final class C1125x extends p117n6.c {

    public C1131z f12138h;

    public Object f12139i;
    public final C1131z j;

    public int f12140k;

    public C1125x(C1131z c1131z, p117n6.c cVar) {
        super(cVar);
        this.j = c1131z;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12139i = obj;
        this.f12140k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}
