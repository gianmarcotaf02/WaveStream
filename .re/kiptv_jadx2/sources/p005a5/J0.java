package p005a5;

import com.kiptv.core.repository.a;
import p028c8.d;
import p117n6.c;

public final class J0 extends c {

    public a f13529h;

    public d f13530i;
    public Object j;

    public final a f13531k;

    public int f13532l;

    public J0(a aVar, c cVar) {
        super(cVar);
        this.f13531k = aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f13532l |= Integer.MIN_VALUE;
        return this.f13531k.b(this);
    }
}
