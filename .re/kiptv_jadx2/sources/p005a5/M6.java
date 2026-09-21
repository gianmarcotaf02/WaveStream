package p005a5;

import com.kiptv.core.repository.b;
import p117n6.c;

public final class M6 extends c {

    public b f13669h;

    public L6 f13670i;
    public String j;

    public Object f13671k;

    public final b f13672l;

    public int f13673m;

    public M6(b bVar, c cVar) {
        super(cVar);
        this.f13672l = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13671k = obj;
        this.f13673m |= Integer.MIN_VALUE;
        return b.a(this.f13672l, null, null, this);
    }
}
