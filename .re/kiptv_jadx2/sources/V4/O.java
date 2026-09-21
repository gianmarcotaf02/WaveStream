package V4;

public final class O extends p117n6.c {

    public Object f10285h;

    public int f10286i;
    public final H j;

    public O(H h9, p100l6.c cVar) {
        super(cVar);
        this.j = h9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10285h = obj;
        this.f10286i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
