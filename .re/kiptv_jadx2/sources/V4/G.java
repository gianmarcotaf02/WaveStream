package V4;

public final class G extends p117n6.c {

    public Object f10267h;

    public int f10268i;
    public final H j;

    public G(H h9, p100l6.c cVar) {
        super(cVar);
        this.j = h9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10267h = obj;
        this.f10268i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
