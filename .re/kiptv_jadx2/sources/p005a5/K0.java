package p005a5;

import com.kiptv.core.repository.a;
import p028c8.d;
import p117n6.c;

public final class K0 extends c {

    public a f13567h;

    public d f13568i;
    public Object j;

    public final a f13569k;

    public int f13570l;

    public K0(a aVar, c cVar) {
        super(cVar);
        this.f13569k = aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f13570l |= Integer.MIN_VALUE;
        return this.f13569k.d(this);
    }
}
