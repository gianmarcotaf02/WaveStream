package p086j6;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import p078i6.AbstractC2258i;

public final class g extends AbstractC2258i implements Serializable {

    public static final g f24255i;

    public final e f24256h;

    static {
        e eVar = e.f24240u;
        f24255i = new g(e.f24240u);
    }

    public g(e backing) {
        m.e(backing, "backing");
        this.f24256h = backing;
    }

    @Override
    public final boolean add(Object obj) {
        return this.f24256h.a(obj) >= 0;
    }

    @Override
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        this.f24256h.c();
        return super.addAll(elements);
    }

    @Override
    public final void clear() {
        this.f24256h.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f24256h.containsKey(obj);
    }

    @Override
    public final int d() {
        return this.f24256h.f24248p;
    }

    @Override
    public final boolean isEmpty() {
        return this.f24256h.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        e eVar = this.f24256h;
        eVar.getClass();
        return new c(eVar, 1);
    }

    @Override
    public final boolean remove(Object obj) {
        e eVar = this.f24256h;
        eVar.c();
        int iJ = eVar.j(obj);
        if (iJ < 0) {
            return false;
        }
        eVar.o(iJ);
        return true;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        m.e(elements, "elements");
        this.f24256h.c();
        return super.removeAll(elements);
    }

    @Override
    public final boolean retainAll(Collection elements) {
        m.e(elements, "elements");
        this.f24256h.c();
        return super.retainAll(elements);
    }

    public g() {
        this(new e());
    }
}
