package p076i4;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p068h4.j;

public final class C2231y0 extends AbstractList implements RandomAccess, Serializable {

    public final List f22950h;

    public final j f22951i;

    public C2231y0(List list, j jVar) {
        list.getClass();
        this.f22950h = list;
        this.f22951i = jVar;
    }

    @Override
    public final Object get(int i3) {
        return this.f22951i.apply(this.f22950h.get(i3));
    }

    @Override
    public final boolean isEmpty() {
        return this.f22950h.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i3) {
        return new C2229x0(this, this.f22950h.listIterator(i3), 0);
    }

    @Override
    public final Object remove(int i3) {
        return this.f22951i.apply(this.f22950h.remove(i3));
    }

    @Override
    public final void removeRange(int i3, int i9) {
        this.f22950h.subList(i3, i9).clear();
    }

    @Override
    public final int size() {
        return this.f22950h.size();
    }
}
