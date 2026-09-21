package X0;

public final class h extends p117n6.c {

    public Object f10808h;

    public final i f10809i;
    public int j;

    public h(i iVar, p117n6.c cVar) {
        super(cVar);
        this.f10809i = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10808h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10809i.b(0.0f, this);
    }
}
