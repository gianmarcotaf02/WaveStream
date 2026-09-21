package p014b4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class j extends f implements List, RandomAccess {

    public static final g f17889i = new g(m.f17893l, 0);

    public static m p(Object[] objArr, int i3) {
        return i3 == 0 ? m.f17893l : new m(objArr, i3);
    }

    @Override
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override
    public int d(Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i3 = 0; i3 < size; i3++) {
                        if (AbstractC1659a.d(get(i3), list.get(i3))) {
                        }
                    }
                    return true;
                }
                g gVarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (gVarListIterator.hasNext()) {
                    if (it.hasNext() && AbstractC1659a.d(gVarListIterator.next(), it.next())) {
                    }
                }
                if (!it.hasNext()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i3 = 0; i3 < size; i3++) {
            iHashCode = (iHashCode * 31) + get(i3).hashCode();
        }
        return iHashCode;
    }

    @Override
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (obj.equals(get(i3))) {
                return i3;
            }
        }
        return -1;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public j subList(int i3, int i9) {
        AbstractC1659a.f(i3, i9, size());
        int i10 = i9 - i3;
        if (i10 == size()) {
            return this;
        }
        return i10 == 0 ? m.f17893l : new i(this, i3, i10);
    }

    @Override
    public final g listIterator(int i3) {
        int size = size();
        if (i3 < 0 || i3 > size) {
            throw new IndexOutOfBoundsException(AbstractC1659a.g(i3, size, "index"));
        }
        return isEmpty() ? f17889i : new g(this, i3);
    }

    @Override
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }
}
