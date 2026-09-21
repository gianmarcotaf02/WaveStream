package p005a5;

import J5.V;
import p117n6.c;

public final class C1444w8 extends c {

    public Object f15273h;

    public int f15274i;
    public final V j;

    public C1444w8(V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15273h = obj;
        this.f15274i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}
