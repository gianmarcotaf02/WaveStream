package p015b5;

import com.kiptv.core.local.datastore.LocalProgressEntry;
import java.util.Iterator;
import p117n6.c;

public final class C extends c {

    public D f17924h;

    public Iterator f17925i;
    public LocalProgressEntry j;

    public int f17926k;

    public int f17927l;

    public int f17928m;

    public int f17929n;

    public Object f17930o;

    public final D f17931p;

    public int f17932q;

    public C(D d4, c cVar) {
        super(cVar);
        this.f17931p = d4;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17930o = obj;
        this.f17932q |= Integer.MIN_VALUE;
        return this.f17931p.b(this);
    }
}
