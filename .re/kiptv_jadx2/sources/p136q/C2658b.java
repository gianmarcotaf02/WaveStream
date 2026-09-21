package p136q;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class C2658b implements Set {

    public final C2661e f26373h;

    public C2658b(C2661e c2661e) {
        this.f26373h = c2661e;
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
        this.f26373h.clear();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f26373h.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f26373h.j(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C2661e c2661e = this.f26373h;
        try {
            return c2661e.j == set.size() && c2661e.j(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        C2661e c2661e = this.f26373h;
        int iHashCode = 0;
        for (int i3 = c2661e.j - 1; i3 >= 0; i3--) {
            Object objE = c2661e.e(i3);
            iHashCode += objE == null ? 0 : objE.hashCode();
        }
        return iHashCode;
    }

    @Override
    public final boolean isEmpty() {
        return this.f26373h.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new C2657a(this.f26373h, 0);
    }

    @Override
    public final boolean remove(Object obj) {
        C2661e c2661e = this.f26373h;
        int iC = c2661e.c(obj);
        if (iC < 0) {
            return false;
        }
        c2661e.g(iC);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        return this.f26373h.k(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        C2661e c2661e = this.f26373h;
        int i3 = c2661e.j;
        for (int i9 = i3 - 1; i9 >= 0; i9--) {
            if (!collection.contains(c2661e.e(i9))) {
                c2661e.g(i9);
            }
        }
        return i3 != c2661e.j;
    }

    @Override
    public final int size() {
        return this.f26373h.j;
    }

    @Override
    public final Object[] toArray() {
        C2661e c2661e = this.f26373h;
        int i3 = c2661e.j;
        Object[] objArr = new Object[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            objArr[i9] = c2661e.e(i9);
        }
        return objArr;
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        C2661e c2661e = this.f26373h;
        int i3 = c2661e.j;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        }
        for (int i9 = 0; i9 < i3; i9++) {
            objArr[i9] = c2661e.e(i9);
        }
        if (objArr.length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
