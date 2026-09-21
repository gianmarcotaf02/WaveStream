package G2;

import S7.AbstractC0906w;
import S7.C0905v;
import kotlin.jvm.internal.m;
import p100l6.h;

public final class d implements h {

    public final h f3778h;

    public d(h hVar) {
        this.f3778h = hVar;
    }

    public final boolean equals(Object obj) {
        return m.a(this.f3778h, obj);
    }

    @Override
    public final Object fold(Object obj, p194x6.m mVar) {
        return this.f3778h.fold(obj, mVar);
    }

    @Override
    public final p100l6.f get(p100l6.g gVar) {
        return this.f3778h.get(gVar);
    }

    public final int hashCode() {
        return this.f3778h.hashCode();
    }

    @Override
    public final h minusKey(p100l6.g gVar) {
        h hVarMinusKey = this.f3778h.minusKey(gVar);
        int i3 = g.f3783b;
        C0905v c0905v = AbstractC0906w.f9624h;
        AbstractC0906w abstractC0906w = (AbstractC0906w) get(c0905v);
        AbstractC0906w abstractC0906w2 = (AbstractC0906w) hVarMinusKey.get(c0905v);
        if ((abstractC0906w instanceof e) && !m.a(abstractC0906w, abstractC0906w2)) {
            ((e) abstractC0906w).j = 0;
        }
        return new d(hVarMinusKey);
    }

    @Override
    public final h plus(h hVar) {
        h hVarPlus = this.f3778h.plus(hVar);
        int i3 = g.f3783b;
        C0905v c0905v = AbstractC0906w.f9624h;
        AbstractC0906w abstractC0906w = (AbstractC0906w) get(c0905v);
        AbstractC0906w abstractC0906w2 = (AbstractC0906w) hVarPlus.get(c0905v);
        if ((abstractC0906w instanceof e) && !m.a(abstractC0906w, abstractC0906w2)) {
            ((e) abstractC0906w).j = 0;
        }
        return new d(hVarPlus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f3778h + ')';
    }
}
