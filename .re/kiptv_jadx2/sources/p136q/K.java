package p136q;

import N7.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p078i6.o;
import p201y6.a;
import p201y6.e;

public final class K implements e, Set, a {

    public final I f26344h;

    public final I f26345i;

    public K(I i3) {
        this.f26344h = i3;
        this.f26345i = i3;
    }

    @Override
    public final boolean add(Object obj) {
        return this.f26345i.a(obj);
    }

    @Override
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        I i3 = this.f26345i;
        int i9 = i3.f26331d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            i3.j(it.next());
        }
        return i9 != i3.f26331d;
    }

    @Override
    public final void clear() {
        this.f26345i.b();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f26344h.c(obj);
    }

    @Override
    public final boolean containsAll(Collection elements) {
        m.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f26344h.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        return m.a(this.f26344h, ((K) obj).f26344h);
    }

    @Override
    public final int hashCode() {
        return this.f26344h.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f26344h.g();
    }

    @Override
    public final Iterator iterator() {
        return new k(this);
    }

    @Override
    public final boolean remove(Object obj) {
        return this.f26345i.l(obj);
    }

    @Override
    public final boolean removeAll(Collection elements) {
        m.e(elements, "elements");
        I i3 = this.f26345i;
        i3.getClass();
        int i9 = i3.f26331d;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            i3.i(it.next());
        }
        return i9 != i3.f26331d;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        boolean z6;
        m.e(elements, "elements");
        I i3 = this.f26345i;
        i3.getClass();
        Object[] objArr = i3.f26329b;
        int i9 = i3.f26331d;
        long[] jArr = i3.f26328a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j = jArr[i10];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!o.b1(elements, objArr[i13])) {
                                i3.m(i13);
                            }
                        }
                        j >>= 8;
                    }
                    z6 = false;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    z6 = false;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        } else {
            z6 = false;
        }
        if (i9 != i3.f26331d) {
            return true;
        }
        return z6;
    }

    @Override
    public final int size() {
        return this.f26344h.f26331d;
    }

    @Override
    public final Object[] toArray() {
        return l.a(this);
    }

    public final String toString() {
        return this.f26344h.toString();
    }

    @Override
    public final Object[] toArray(Object[] array) {
        m.e(array, "array");
        return l.b(this, array);
    }
}
