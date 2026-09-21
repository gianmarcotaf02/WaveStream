package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

public abstract class r extends AbstractC1863o implements List, RandomAccess {

    public static final C1865p f19379i = new C1865p(C1876v.f19394l, 0);

    public static C1876v r(Object[] objArr, int i3) {
        return i3 == 0 ? C1876v.f19394l : new C1876v(objArr, i3);
    }

    public static r s(List list) {
        if (!(list instanceof AbstractC1863o)) {
            Object[] array = list.toArray();
            int length = array.length;
            P3.e.p0(array, length);
            return r(array, length);
        }
        r rVarN = ((AbstractC1863o) list).n();
        if (!rVarN.o()) {
            return rVarN;
        }
        Object[] array2 = rVarN.toArray(AbstractC1863o.f19361h);
        return r(array2, array2.length);
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
    public final boolean contains(Object obj) {
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
                        if (Objects.equals(get(i3), list.get(i3))) {
                        }
                    }
                    return true;
                }
                C1865p c1865pListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (c1865pListIterator.hasNext()) {
                    if (it.hasNext() && Objects.equals(c1865pListIterator.next(), it.next())) {
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
    public final int indexOf(Object obj) {
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
    public final int lastIndexOf(Object obj) {
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
    public final r n() {
        return this;
    }

    @Override
    public r subList(int i3, int i9) {
        E8.d.e0(i3, i9, size());
        int i10 = i9 - i3;
        if (i10 == size()) {
            return this;
        }
        return i10 == 0 ? C1876v.f19394l : new C1867q(this, i3, i10);
    }

    @Override
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final C1865p listIterator(int i3) {
        E8.d.d0(i3, size());
        return isEmpty() ? f19379i : new C1865p(this, i3);
    }
}
