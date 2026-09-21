package U7;

public final class h extends p117n6.c {

    public Object f10182h;

    public final j f10183i;
    public int j;

    public h(j jVar, p117n6.c cVar) {
        super(cVar);
        this.f10183i = jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10182h = obj;
        this.j |= Integer.MIN_VALUE;
        Object objY = j.y(this.f10183i, this);
        return objY == p109m6.a.f25430h ? objY : new r(objY);
    }
}
