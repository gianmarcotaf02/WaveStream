package p073i0;

import N7.k;
import java.util.Iterator;
import p064h0.c;
import p078i6.AbstractC2259j;

public final class b extends AbstractC2259j implements p047f0.b {

    public static final b f22743k;

    public final Object f22744h;

    public final Object f22745i;
    public final c j;

    static {
        p081j0.b bVar = p081j0.b.f23868a;
        f22743k = new b(bVar, bVar, c.j);
    }

    public b(Object obj, Object obj2, c cVar) {
        this.f22744h = obj;
        this.f22745i = obj2;
        this.j = cVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.j.containsKey(obj);
    }

    @Override
    public final int d() {
        c cVar = this.j;
        cVar.getClass();
        return cVar.f22433i;
    }

    @Override
    public final Iterator iterator() {
        return new k(this.f22744h, this.j);
    }
}
