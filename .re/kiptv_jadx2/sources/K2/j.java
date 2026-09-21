package K2;

public final class j extends p117n6.c {

    public k f6829h;

    public h f6830i;
    public Object j;

    public final k f6831k;

    public int f6832l;

    public j(k kVar, p117n6.c cVar) {
        super(cVar);
        this.f6831k = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f6832l |= Integer.MIN_VALUE;
        return this.f6831k.a(this);
    }
}
