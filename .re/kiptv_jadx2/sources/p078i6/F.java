package p078i6;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class F extends AbstractC2257h {

    public final List f23178h;

    public F(List list) {
        this.f23178h = list;
    }

    @Override
    public final void add(int i3, Object obj) {
        this.f23178h.add(o.W0(i3, this), obj);
    }

    @Override
    public final void clear() {
        this.f23178h.clear();
    }

    @Override
    public final int d() {
        return this.f23178h.size();
    }

    @Override
    public final Object e(int i3) {
        return this.f23178h.remove(o.V0(i3, this));
    }

    @Override
    public final Object get(int i3) {
        return this.f23178h.get(o.V0(i3, this));
    }

    @Override
    public final Iterator iterator() {
        return new E(this, 0);
    }

    @Override
    public final ListIterator listIterator() {
        return new E(this, 0);
    }

    @Override
    public final Object set(int i3, Object obj) {
        return this.f23178h.set(o.V0(i3, this), obj);
    }

    @Override
    public final ListIterator listIterator(int i3) {
        return new E(this, i3);
    }
}
