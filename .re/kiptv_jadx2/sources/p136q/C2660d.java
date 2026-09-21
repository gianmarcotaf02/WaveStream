package p136q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public final class C2660d implements Collection {

    public final C2661e f26377h;

    public C2660d(C2661e c2661e) {
        this.f26377h = c2661e;
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.f26377h.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f26377h.a(obj) >= 0;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        return this.f26377h.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new C2657a(this.f26377h, 1);
    }

    @Override
    public final boolean remove(Object obj) {
        C2661e c2661e = this.f26377h;
        int iA = c2661e.a(obj);
        if (iA < 0) {
            return false;
        }
        c2661e.g(iA);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        C2661e c2661e = this.f26377h;
        int i3 = c2661e.j;
        int i9 = 0;
        boolean z6 = false;
        while (i9 < i3) {
            if (collection.contains(c2661e.i(i9))) {
                c2661e.g(i9);
                i9--;
                i3--;
                z6 = true;
            }
            i9++;
        }
        return z6;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        C2661e c2661e = this.f26377h;
        int i3 = c2661e.j;
        int i9 = 0;
        boolean z6 = false;
        while (i9 < i3) {
            if (!collection.contains(c2661e.i(i9))) {
                c2661e.g(i9);
                i9--;
                i3--;
                z6 = true;
            }
            i9++;
        }
        return z6;
    }

    @Override
    public final int size() {
        return this.f26377h.j;
    }

    @Override
    public final Object[] toArray() {
        C2661e c2661e = this.f26377h;
        int i3 = c2661e.j;
        Object[] objArr = new Object[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            objArr[i9] = c2661e.i(i9);
        }
        return objArr;
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        C2661e c2661e = this.f26377h;
        int i3 = c2661e.j;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i9 = 0; i9 < i3; i9++) {
            objArr[i9] = c2661e.i(i9);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
