package C5;

public final class Z0 extends p117n6.c {

    public K0 f1193h;

    public Object f1194i;
    public final K0 j;

    public int f1195k;

    public Z0(K0 k1, p100l6.c cVar) {
        super(cVar);
        this.j = k1;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f1194i = obj;
        this.f1195k |= Integer.MIN_VALUE;
        return this.j.a(false, this);
    }
}
