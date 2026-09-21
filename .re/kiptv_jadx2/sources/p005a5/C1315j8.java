package p005a5;

import p117n6.c;

public final class C1315j8 extends c {

    public int f14671h;

    public String f14672i;
    public Object j;

    public final C1434v8 f14673k;

    public int f14674l;

    public C1315j8(C1434v8 c1434v8, c cVar) {
        super(cVar);
        this.f14673k = c1434v8;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f14674l |= Integer.MIN_VALUE;
        return C1434v8.e(this.f14673k, null, 0, null, this);
    }
}
