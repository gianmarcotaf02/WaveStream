package p076i4;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public final class b1 extends AbstractSet {

    public final AbstractC2214p0 f22869h;

    public final AbstractC2214p0 f22870i;

    public b1(AbstractC2214p0 abstractC2214p0, AbstractC2214p0 abstractC2214p1) {
        this.f22869h = abstractC2214p0;
        this.f22870i = abstractC2214p1;
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f22869h.contains(obj) && this.f22870i.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f22869h.containsAll(collection) && this.f22870i.containsAll(collection);
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.f22870i, this.f22869h);
    }

    @Override
    public final Iterator iterator() {
        return new C2217r0(this);
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        Iterator it = this.f22869h.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (this.f22870i.contains(it.next())) {
                i3++;
            }
        }
        return i3;
    }
}
