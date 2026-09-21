package p005a5;

import java.util.List;
import p117n6.c;

public final class C1375p8 extends c {

    public C1434v8 f14952h;

    public List f14953i;
    public Object j;

    public final C1434v8 f14954k;

    public int f14955l;

    public C1375p8(C1434v8 c1434v8, c cVar) {
        super(cVar);
        this.f14954k = c1434v8;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f14955l |= Integer.MIN_VALUE;
        return this.f14954k.i(this);
    }
}
