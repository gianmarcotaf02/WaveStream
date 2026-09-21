package p078i6;

import C5.C0132n0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p201y6.a;

public abstract class AbstractC2250a implements Collection, a {
    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (m.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection elements) {
        m.e(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int d();

    @Override
    public boolean isEmpty() {
        return d() == 0;
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return d();
    }

    @Override
    public Object[] toArray() {
        return l.a(this);
    }

    public final String toString() {
        return o.o1(this, ", ", "[", "]", new C0132n0(29, this), 24);
    }

    @Override
    public Object[] toArray(Object[] array) {
        m.e(array, "array");
        return l.b(this, array);
    }
}
