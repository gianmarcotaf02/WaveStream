package p015b5;

import com.kiptv.core.model.EPGReminder;
import p117n6.c;

public final class j extends c {

    public k f17964h;

    public EPGReminder f17965i;
    public Object j;

    public final k f17966k;

    public int f17967l;

    public j(k kVar, c cVar) {
        super(cVar);
        this.f17966k = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.f17967l |= Integer.MIN_VALUE;
        return this.f17966k.g(null, 0, null, 0, null, null, this);
    }
}
