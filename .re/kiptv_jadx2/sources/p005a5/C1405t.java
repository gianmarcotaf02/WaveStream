package p005a5;

import p117n6.c;

public final class C1405t extends c {

    public C1455y f15087h;

    public String f15088i;
    public int j;

    public int f15089k;

    public Object f15090l;

    public final C1455y f15091m;

    public int f15092n;

    public C1405t(C1455y c1455y, c cVar) {
        super(cVar);
        this.f15091m = c1455y;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15090l = obj;
        this.f15092n |= Integer.MIN_VALUE;
        return this.f15091m.b(0, this);
    }
}
