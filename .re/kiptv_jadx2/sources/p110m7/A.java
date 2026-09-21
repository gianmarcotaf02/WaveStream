package p110m7;

import androidx.datastore.preferences.protobuf.c0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class A extends AbstractMap {

    public static final int f25441m = 0;

    public final int f25442h;

    public List f25443i = Collections.EMPTY_LIST;
    public Map j = Collections.EMPTY_MAP;

    public boolean f25444k;

    public volatile c0 f25445l;

    public A(int i3) {
        this.f25442h = i3;
    }

    public final int a(Comparable comparable) {
        int i3;
        int i9;
        int i10;
        int iCompareTo;
        int size = this.f25443i.size();
        int i11 = size - 1;
        if (i11 < 0) {
            i3 = 0;
            while (i3 <= i11) {
                i10 = (i3 + i11) / 2;
                iCompareTo = comparable.compareTo(((E) this.f25443i.get(i10)).f25448h);
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
            int iCompareTo2 = comparable.compareTo(((E) this.f25443i.get(i11)).f25448h);
            if (iCompareTo2 > 0) {
                i9 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i11;
                }
                i3 = 0;
                while (i3 <= i11) {
                    i10 = (i3 + i11) / 2;
                    iCompareTo = comparable.compareTo(((E) this.f25443i.get(i10)).f25448h);
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
        if (this.f25444k) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable c() {
        return this.j.isEmpty() ? D.f25447b : this.j.entrySet();
    }

    @Override
    public final void clear() {
        b();
        if (!this.f25443i.isEmpty()) {
            this.f25443i.clear();
        }
        if (this.j.isEmpty()) {
            return;
        }
        this.j.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.j.containsKey(comparable);
    }

    public final SortedMap d() {
        b();
        if (this.j.isEmpty() && !(this.j instanceof TreeMap)) {
            this.j = new TreeMap();
        }
        return (SortedMap) this.j;
    }

    @Override
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((E) this.f25443i.get(iA)).setValue(obj);
        }
        b();
        boolean zIsEmpty = this.f25443i.isEmpty();
        int i3 = this.f25442h;
        if (zIsEmpty && !(this.f25443i instanceof ArrayList)) {
            this.f25443i = new ArrayList(i3);
        }
        int i9 = -(iA + 1);
        if (i9 >= i3) {
            return d().put(comparable, obj);
        }
        if (this.f25443i.size() == i3) {
            E e6 = (E) this.f25443i.remove(i3 - 1);
            d().put(e6.f25448h, e6.f25449i);
        }
        this.f25443i.add(i9, new E(this, comparable, obj));
        return null;
    }

    @Override
    public final Set entrySet() {
        if (this.f25445l == null) {
            this.f25445l = new c0(this, 1);
        }
        return this.f25445l;
    }

    public final Object g(int i3) {
        b();
        Object obj = ((E) this.f25443i.remove(i3)).f25449i;
        if (!this.j.isEmpty()) {
            Iterator it = d().entrySet().iterator();
            List list = this.f25443i;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new E(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((E) this.f25443i.get(iA)).f25449i : this.j.get(comparable);
    }

    @Override
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return g(iA);
        }
        if (this.j.isEmpty()) {
            return null;
        }
        return this.j.remove(comparable);
    }

    @Override
    public final int size() {
        return this.j.size() + this.f25443i.size();
    }
}
