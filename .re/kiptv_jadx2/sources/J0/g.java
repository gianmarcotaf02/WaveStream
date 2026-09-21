package J0;

public final class g extends p117n6.c {

    public long f5985h;

    public long f5986i;
    public Object j;

    public final i f5987k;

    public int f5988l;

    public g(i iVar, p117n6.c cVar) {
        super(cVar);
        this.f5987k = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f5988l |= Integer.MIN_VALUE;
        return this.f5987k.h0(0L, 0L, this);
    }
}
