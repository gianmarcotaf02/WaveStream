package p005a5;

import java.io.Serializable;
import p070h6.n;
import p109m6.a;
import p117n6.c;

public final class m9 extends c {

    public Object f14792h;

    public Object f14793i;
    public Object j;

    public Object f14794k;

    public final n9 f14795l;

    public int f14796m;

    public m9(n9 n9Var, c cVar) {
        super(cVar);
        this.f14795l = n9Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f14794k = obj;
        this.f14796m |= Integer.MIN_VALUE;
        Serializable serializableH = this.f14795l.h(null, this);
        return serializableH == a.f25430h ? serializableH : new n(serializableH);
    }
}
