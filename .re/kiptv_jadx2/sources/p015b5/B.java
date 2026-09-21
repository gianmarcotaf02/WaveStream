package p015b5;

import com.kiptv.core.local.datastore.LocalProgressEntry;
import p117n6.c;

public final class B extends c {

    public LocalProgressEntry f17921h;

    public Object f17922i;
    public final D j;

    public int f17923k;

    public B(D d4, c cVar) {
        super(cVar);
        this.j = d4;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17922i = obj;
        this.f17923k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
