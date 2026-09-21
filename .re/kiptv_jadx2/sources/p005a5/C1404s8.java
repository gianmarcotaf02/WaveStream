package p005a5;

import java.util.List;
import p117n6.c;

public final class C1404s8 extends c {

    public C1434v8 f15080h;

    public List f15081i;
    public Object j;

    public final C1434v8 f15082k;

    public int f15083l;

    public C1404s8(C1434v8 c1434v8, c cVar) {
        super(cVar);
        this.f15082k = c1434v8;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f15083l |= Integer.MIN_VALUE;
        return this.f15082k.j(this);
    }
}
