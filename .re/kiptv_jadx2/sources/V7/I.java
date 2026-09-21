package V7;

public final class I extends p117n6.c {

    public F f10389h;

    public Object f10390i;
    public int j;

    public final F f10391k;

    public Object f10392l;

    public I(F f9, p100l6.c cVar) {
        super(cVar);
        this.f10391k = f9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10390i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10391k.emit(null, this);
    }
}
