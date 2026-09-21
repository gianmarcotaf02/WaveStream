package J0;

public final class h extends p117n6.c {

    public long f5989h;

    public Object f5990i;
    public final i j;

    public int f5991k;

    public h(i iVar, p117n6.c cVar) {
        super(cVar);
        this.j = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5990i = obj;
        this.f5991k |= Integer.MIN_VALUE;
        return this.j.i(0L, this);
    }
}
