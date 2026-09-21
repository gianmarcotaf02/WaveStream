package p005a5;

import p117n6.c;

public final class A5 extends c {

    public C5 f13128h;

    public String f13129i;
    public Object j;

    public final C5 f13130k;

    public int f13131l;

    public A5(C5 c9, c cVar) {
        super(cVar);
        this.f13130k = c9;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f13131l |= Integer.MIN_VALUE;
        return this.f13130k.b(this);
    }
}
