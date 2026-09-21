package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class AbstractC1495b extends AbstractList implements InterfaceC1515w {

    public boolean f16181h;

    @Override
    public final boolean addAll(Collection collection) {
        d();
        return super.addAll(collection);
    }

    @Override
    public final void clear() {
        d();
        super.clear();
    }

    public final void d() {
        if (!this.f16181h) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < size; i3++) {
            if (!get(i3).equals(list.get(i3))) {
                return false;
            }
        }
        return true;
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
    public abstract Object remove(int i3);

    @Override
    public final boolean remove(Object obj) {
        d();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        d();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        d();
        return super.retainAll(collection);
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        d();
        return super.addAll(i3, collection);
    }
}
