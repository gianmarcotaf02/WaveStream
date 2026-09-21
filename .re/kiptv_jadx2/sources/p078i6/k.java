package p078i6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p201y6.a;

public final class k implements Collection, a {

    public final Object[] f23198h;

    public final boolean f23199i;

    public k(Object[] values, boolean z6) {
        m.e(values, "values");
        this.f23198h = values;
        this.f23199i = z6;
    }

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
    public final boolean contains(Object obj) {
        return m.W(this.f23198h, obj);
    }

    @Override
    public final boolean containsAll(Collection elements) {
        m.e(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m.W(this.f23198h, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        return this.f23198h.length == 0;
    }

    @Override
    public final Iterator iterator() {
        return m.h(this.f23198h);
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
        return this.f23198h.length;
    }

    @Override
    public final Object[] toArray() {
        Object[] objArr = this.f23198h;
        m.e(objArr, "<this>");
        if (this.f23199i && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        m.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override
    public final Object[] toArray(Object[] array) {
        m.e(array, "array");
        return l.b(this, array);
    }
}
