package p076i4;

import java.util.AbstractList;
import java.util.ListIterator;

public final class C2229x0 extends g1 implements ListIterator {

    public final int f22949i;
    public final AbstractList j;

    public C2229x0(AbstractList abstractList, ListIterator listIterator, int i3) {
        super(listIterator);
        this.f22949i = i3;
        this.j = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.f22949i) {
            case 0:
                return ((C2231y0) this.j).f22951i.apply(obj);
            default:
                return ((C2233z0) this.j).f22955i.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.f22901h).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.f22901h).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.f22901h).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.f22901h).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
