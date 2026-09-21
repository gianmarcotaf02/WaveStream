package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class Z extends AbstractMap {

    public static final int f16174m = 0;

    public List f16175h;

    public Map f16176i;
    public boolean j;

    public volatile c0 f16177k;

    public Map f16178l;

    public static Z g() {
        Z z6 = new Z();
        z6.f16175h = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        z6.f16176i = map;
        z6.f16178l = map;
        return z6;
    }

    public final int a(Comparable comparable) {
        int i3;
        int i9;
        int i10;
        int iCompareTo;
        int size = this.f16175h.size();
        int i11 = size - 1;
        if (i11 < 0) {
            i3 = 0;
            while (i3 <= i11) {
                i10 = (i3 + i11) / 2;
                iCompareTo = comparable.compareTo(((a0) this.f16175h.get(i10)).f16179h);
                if (iCompareTo < 0) {
                    i11 = i10 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i10;
                    }
                    i3 = i10 + 1;
                }
            }
            i9 = i3 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((a0) this.f16175h.get(i11)).f16179h);
            if (iCompareTo2 > 0) {
                i9 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i11;
                }
                i3 = 0;
                while (i3 <= i11) {
                    i10 = (i3 + i11) / 2;
                    iCompareTo = comparable.compareTo(((a0) this.f16175h.get(i10)).f16179h);
                    if (iCompareTo < 0) {
                        i11 = i10 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i10;
                        }
                        i3 = i10 + 1;
                    }
                }
                i9 = i3 + 1;
            }
        }
        return -i9;
    }

    public final void b() {
        if (this.j) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i3) {
        return (Map.Entry) this.f16175h.get(i3);
    }

    @Override
    public final void clear() {
        b();
        if (!this.f16175h.isEmpty()) {
            this.f16175h.clear();
        }
        if (this.f16176i.isEmpty()) {
            return;
        }
        this.f16176i.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f16176i.containsKey(comparable);
    }

    public final Set d() {
        return this.f16176i.isEmpty() ? Collections.EMPTY_SET : this.f16176i.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f16176i.isEmpty() && !(this.f16176i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16176i = treeMap;
            this.f16178l = treeMap.descendingMap();
        }
        return (SortedMap) this.f16176i;
    }

    @Override
    public final Set entrySet() {
        if (this.f16177k == null) {
            this.f16177k = new c0(this, 0);
        }
        return this.f16177k;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return super.equals(obj);
        }
        Z z6 = (Z) obj;
        int size = size();
        if (size == z6.size()) {
            int size2 = this.f16175h.size();
            if (size2 != z6.f16175h.size()) {
                return ((AbstractSet) entrySet()).equals(z6.entrySet());
            }
            for (int i3 = 0; i3 < size2; i3++) {
                if (c(i3).equals(z6.c(i3))) {
                }
            }
            if (size2 != size) {
                return this.f16176i.equals(z6.f16176i);
            }
            return true;
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((a0) this.f16175h.get(iA)).f16180i : this.f16176i.get(comparable);
    }

    @Override
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((a0) this.f16175h.get(iA)).setValue(obj);
        }
        b();
        if (this.f16175h.isEmpty() && !(this.f16175h instanceof ArrayList)) {
            this.f16175h = new ArrayList(16);
        }
        int i3 = -(iA + 1);
        if (i3 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f16175h.size() == 16) {
            a0 a0Var = (a0) this.f16175h.remove(15);
            e().put(a0Var.f16179h, a0Var.f16180i);
        }
        this.f16175h.add(i3, new a0(this, comparable, obj));
        return null;
    }

    @Override
    public final int hashCode() {
        int size = this.f16175h.size();
        int iHashCode = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iHashCode += ((a0) this.f16175h.get(i3)).hashCode();
        }
        return this.f16176i.size() > 0 ? this.f16176i.hashCode() + iHashCode : iHashCode;
    }

    public final Object i(int i3) {
        b();
        Object obj = ((a0) this.f16175h.remove(i3)).f16180i;
        if (!this.f16176i.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f16175h;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new a0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.f16176i.isEmpty()) {
            return null;
        }
        return this.f16176i.remove(comparable);
    }

    @Override
    public final int size() {
        return this.f16176i.size() + this.f16175h.size();
    }
}
