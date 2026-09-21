package p110m7;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class H extends AbstractList implements RandomAccess, t {

    public final s f25452h;

    public H(s sVar) {
        this.f25452h = sVar;
    }

    @Override
    public final List b() {
        return Collections.unmodifiableList(this.f25452h.f25505h);
    }

    @Override
    public final Object get(int i3) {
        return (String) this.f25452h.get(i3);
    }

    @Override
    public final AbstractC2632e i(int i3) {
        return this.f25452h.i(i3);
    }

    @Override
    public final Iterator iterator() {
        G g = new G();
        g.f25451h = this.f25452h.iterator();
        return g;
    }

    @Override
    public final void l(u uVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final ListIterator listIterator(int i3) {
        F f9 = new F();
        f9.f25450h = this.f25452h.listIterator(i3);
        return f9;
    }

    @Override
    public final int size() {
        return this.f25452h.size();
    }

    @Override
    public final H c() {
        return this;
    }
}
