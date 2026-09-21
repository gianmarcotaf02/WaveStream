package p005a5;

import com.kiptv.core.repository.a;
import p028c8.d;
import p117n6.c;

public final class L0 extends c {

    public a f13606h;

    public d f13607i;
    public Object j;

    public final a f13608k;

    public int f13609l;

    public L0(a aVar, c cVar) {
        super(cVar);
        this.f13608k = aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f13609l |= Integer.MIN_VALUE;
        return this.f13608k.e(this);
    }
}
