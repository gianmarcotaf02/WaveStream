package p076i4;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;
import p068h4.j;

public final class C2233z0 extends AbstractSequentialList implements Serializable {

    public final List f22954h;

    public final j f22955i;

    public C2233z0(List list, j jVar) {
        list.getClass();
        this.f22954h = list;
        this.f22955i = jVar;
    }

    @Override
    public final boolean isEmpty() {
        return this.f22954h.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i3) {
        return new C2229x0(this, this.f22954h.listIterator(i3), 1);
    }

    @Override
    public final void removeRange(int i3, int i9) {
        this.f22954h.subList(i3, i9).clear();
    }

    @Override
    public final int size() {
        return this.f22954h.size();
    }
}
