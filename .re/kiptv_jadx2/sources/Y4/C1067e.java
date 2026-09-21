package Y4;

public final class C1067e extends p117n6.c {

    public C1075g f11857h;

    public Object f11858i;
    public final C1075g j;

    public int f11859k;

    public C1067e(C1075g c1075g, p117n6.c cVar) {
        super(cVar);
        this.j = c1075g;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11858i = obj;
        this.f11859k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}
