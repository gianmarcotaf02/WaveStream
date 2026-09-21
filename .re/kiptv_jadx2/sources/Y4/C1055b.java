package Y4;

import java.util.Map;

public final class C1055b extends p117n6.c {

    public C1075g f11811h;

    public Map f11812i;
    public Object j;

    public final C1075g f11813k;

    public int f11814l;

    public C1055b(C1075g c1075g, p117n6.c cVar) {
        super(cVar);
        this.f11813k = c1075g;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f11814l |= Integer.MIN_VALUE;
        return this.f11813k.c(this);
    }
}
