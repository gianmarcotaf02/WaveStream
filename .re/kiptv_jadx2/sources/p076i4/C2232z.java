package p076i4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public final class C2232z extends AbstractCollection {

    public final Collection f22952h;

    public final B0 f22953i;

    public C2232z(Collection collection, B0 b9) {
        collection.getClass();
        this.f22952h = collection;
        this.f22953i = b9;
    }

    @Override
    public final void clear() {
        this.f22952h.clear();
    }

    @Override
    public final boolean isEmpty() {
        return this.f22952h.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        Iterator it = this.f22952h.iterator();
        B0 b9 = this.f22953i;
        b9.getClass();
        return new C2219s0(it, b9);
    }

    @Override
    public final int size() {
        return this.f22952h.size();
    }
}
