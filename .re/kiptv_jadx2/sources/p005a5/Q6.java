package p005a5;

import com.kiptv.core.repository.b;
import p117n6.c;

public final class Q6 extends c {

    public b f13828h;

    public Object f13829i;
    public final b j;

    public int f13830k;

    public Q6(b bVar, c cVar) {
        super(cVar);
        this.j = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13829i = obj;
        this.f13830k |= Integer.MIN_VALUE;
        return b.b(this.j, null, null, null, this);
    }
}
