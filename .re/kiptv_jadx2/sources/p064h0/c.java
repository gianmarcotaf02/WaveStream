package p064h0;

import Y2.L;
import p073i0.a;
import p078i6.AbstractC2256g;

public class c extends AbstractC2256g {
    public static final c j = new c(k.f22446e, 0);

    public final k f22432h;

    public final int f22433i;

    public c(k kVar, int i3) {
        this.f22432h = kVar;
        this.f22433i = i3;
    }

    public final c a(Object obj, a aVar) {
        L lU = this.f22432h.u(obj, obj != null ? obj.hashCode() : 0, aVar, 0);
        return lU == null ? this : new c((k) lU.j, this.f22433i + lU.f11389i);
    }

    @Override
    public boolean containsKey(Object obj) {
        return this.f22432h.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override
    public Object get(Object obj) {
        return this.f22432h.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
