package U7;

public final class i extends p117n6.c {

    public Object f10184h;

    public final j f10185i;
    public int j;

    public i(j jVar, p117n6.c cVar) {
        super(cVar);
        this.f10185i = jVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10184h = obj;
        this.j |= Integer.MIN_VALUE;
        Object objZ = this.f10185i.z(null, 0, 0L, this);
        return objZ == p109m6.a.f25430h ? objZ : new r(objZ);
    }
}
