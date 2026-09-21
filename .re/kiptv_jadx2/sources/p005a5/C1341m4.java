package p005a5;

import java.io.Serializable;
import java.util.Iterator;
import p117n6.c;

public final class C1341m4 extends c {

    public Object f14766h;

    public Integer f14767i;
    public Integer j;

    public Serializable f14768k;

    public Object f14769l;

    public Object f14770m;

    public Iterator f14771n;

    public int f14772o;

    public Object f14773p;

    public final C1351n4 f14774q;

    public int f14775r;

    public C1341m4(C1351n4 c1351n4, c cVar) {
        super(cVar);
        this.f14774q = c1351n4;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14773p = obj;
        this.f14775r |= Integer.MIN_VALUE;
        return this.f14774q.c(null, null, null, null, this);
    }
}
