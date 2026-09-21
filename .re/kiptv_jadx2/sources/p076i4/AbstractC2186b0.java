package p076i4;

import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class AbstractC2186b0 extends W implements List, RandomAccess {

    public static final Z f22868i = new Z(0, S0.f22832l);

    public static S0 A(Comparator comparator, List list) {
        comparator.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        AbstractC2230y.b(array, array.length);
        Arrays.sort(array, comparator);
        return r(array, array.length);
    }

    public static S0 r(Object[] objArr, int i3) {
        return i3 == 0 ? S0.f22832l : new S0(objArr, i3);
    }

    public static Y s() {
        return new Y(4);
    }

    public static Y t(int i3) {
        AbstractC2230y.d(i3, "expectedSize");
        return new Y(i3);
    }

    public static AbstractC2186b0 u(Collection collection) {
        if (!(collection instanceof W)) {
            Object[] array = collection.toArray();
            AbstractC2230y.b(array, array.length);
            return r(array, array.length);
        }
        AbstractC2186b0 abstractC2186b0D = ((W) collection).d();
        if (!abstractC2186b0D.p()) {
            return abstractC2186b0D;
        }
        Object[] array2 = abstractC2186b0D.toArray(W.f22843h);
        return r(array2, array2.length);
    }

    public static S0 v(Object[] objArr) {
        if (objArr.length == 0) {
            return S0.f22832l;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        AbstractC2230y.b(objArr2, objArr2.length);
        return r(objArr2, objArr2.length);
    }

    public static S0 x(Long l2, Long l9, Long l10, Long l11, Long l12) {
        Object[] objArr = {l2, l9, l10, l11, l12};
        AbstractC2230y.b(objArr, 5);
        return r(objArr, 5);
    }

    public static S0 y(Object obj) {
        Object[] objArr = {obj};
        AbstractC2230y.b(objArr, 1);
        return r(objArr, 1);
    }

    public static S0 z(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        AbstractC2230y.b(objArr, 2);
        return r(objArr, 2);
    }

    @Override
    public AbstractC2186b0 subList(int i3, int i9) {
        AbstractC1864o0.W(i3, i9, size());
        int i10 = i9 - i3;
        if (i10 == size()) {
            return this;
        }
        return i10 == 0 ? S0.f22832l : new C2184a0(i3, i10, this);
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
    public int e(Object[] objArr, int i3) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i3 + i9] = get(i9);
        }
        return i3 + size;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && AbstractC1853k0.m(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        if (AbstractC1853k0.m(get(i3), list.get(i3))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i9 = 0; i9 < size; i9++) {
            i3 = ~(~(get(i9).hashCode() + (i3 * 31)));
        }
        return i3;
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
    public Iterator iterator() {
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
    public final j1 iterator() {
        return listIterator(0);
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
    public final Z listIterator(int i3) {
        AbstractC1864o0.V(i3, size());
        return isEmpty() ? f22868i : new Z(i3, this);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final AbstractC2186b0 d() {
        return this;
    }
}
