package p048f1;

import java.util.List;
import p117n6.c;

public final class C2144b extends c {

    public List f21634h;

    public y f21635i;
    public int j;

    public int f21636k;

    public Object f21637l;

    public final C2145c f21638m;

    public int f21639n;

    public C2144b(C2145c c2145c, c cVar) {
        super(cVar);
        this.f21638m = c2145c;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f21637l = obj;
        this.f21639n |= Integer.MIN_VALUE;
        return this.f21638m.c(this);
    }
}
