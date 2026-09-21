package p005a5;

import com.kiptv.core.repository.b;
import p117n6.c;

public final class N6 extends c {

    public Object f13700h;

    public String f13701i;
    public String j;

    public Object f13702k;

    public final b f13703l;

    public int f13704m;

    public N6(b bVar, c cVar) {
        super(cVar);
        this.f13703l = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13702k = obj;
        this.f13704m |= Integer.MIN_VALUE;
        return this.f13703l.c(null, null, this);
    }
}
