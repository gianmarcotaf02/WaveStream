package p005a5;

import p117n6.c;

public final class C1395s extends c {

    public C1455y f15042h;

    public String f15043i;
    public int j;

    public Object f15044k;

    public final C1455y f15045l;

    public int f15046m;

    public C1395s(C1455y c1455y, c cVar) {
        super(cVar);
        this.f15045l = c1455y;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15044k = obj;
        this.f15046m |= Integer.MIN_VALUE;
        return this.f15045l.a(this);
    }
}
