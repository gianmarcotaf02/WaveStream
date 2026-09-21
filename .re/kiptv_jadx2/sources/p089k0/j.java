package p089k0;

import Y2.L;
import p020c0.AbstractC1697o0;
import p020c0.InterfaceC1691l0;
import p020c0.h1;
import p064h0.c;
import p064h0.k;

public final class j extends c implements InterfaceC1691l0 {

    public static final j f24422k = new j(k.f22446e, 0);

    public final j b(AbstractC1697o0 abstractC1697o0, h1 h1Var) {
        L lU = this.f22432h.u(abstractC1697o0, abstractC1697o0.hashCode(), h1Var, 0);
        return lU == null ? this : new j((k) lU.j, this.f22433i + lU.f11389i);
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1697o0) {
            return super.containsKey((AbstractC1697o0) obj);
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (obj instanceof h1) {
            return super.containsValue((h1) obj);
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        if (obj instanceof AbstractC1697o0) {
            return (h1) super.get((AbstractC1697o0) obj);
        }
        return null;
    }

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1697o0) ? obj2 : (h1) super.getOrDefault((AbstractC1697o0) obj, (h1) obj2);
    }
}
