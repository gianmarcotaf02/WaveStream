package V7;

import O1.C0754s;

public final class C0975a extends p117n6.c {

    public W7.y f10429h;

    public Object f10430i;
    public final C0754s j;

    public int f10431k;

    public C0975a(C0754s c0754s, p100l6.c cVar) {
        super(cVar);
        this.j = c0754s;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10430i = obj;
        this.f10431k |= Integer.MIN_VALUE;
        return this.j.collect(null, this);
    }
}
