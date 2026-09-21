package p136q;

import N7.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p201y6.a;
import p201y6.e;

public final class G implements e, Set, a {

    public final E f26320h;

    public final E f26321i;

    public G(E parent) {
        m.e(parent, "parent");
        this.f26320h = parent;
        this.f26321i = parent;
    }

    @Override
    public final boolean add(Object obj) {
        return this.f26321i.a(obj);
    }

    @Override
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        E e6 = this.f26321i;
        e6.getClass();
        int i3 = e6.g;
        for (Object obj : elements) {
            int iD = e6.d(obj);
            e6.f26307b[iD] = obj;
            long[] jArr = e6.f26308c;
            int i9 = e6.f26309d;
            jArr[iD] = (((long) i9) & 2147483647L) | 4611686016279904256L;
            if (i9 != Integer.MAX_VALUE) {
                jArr[i9] = ((((long) iD) & 2147483647L) << 31) | (jArr[i9] & (-4611686016279904257L));
            }
            e6.f26309d = iD;
            if (e6.f26310e == Integer.MAX_VALUE) {
                e6.f26310e = iD;
            }
        }
        return i3 != e6.g;
    }

    @Override
    public final void clear() {
        this.f26321i.b();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f26320h.c(obj);
    }

    @Override
    public final boolean containsAll(Collection elements) {
        m.e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f26320h.c(it.next())) {
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
        if (obj == null || G.class != obj.getClass()) {
            return false;
        }
        return m.a(this.f26320h, ((G) obj).f26320h);
    }

    @Override
    public final int hashCode() {
        return this.f26320h.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f26320h.g == 0;
    }

    @Override
    public final Iterator iterator() {
        return new k(this);
    }

    @Override
    public final boolean remove(Object obj) {
        return this.f26321i.g(obj);
    }

    @Override
    public final boolean removeAll(Collection elements) {
        int iNumberOfTrailingZeros;
        m.e(elements, "elements");
        E e6 = this.f26321i;
        e6.getClass();
        int i3 = e6.g;
        Iterator it = elements.iterator();
        while (true) {
            int i9 = 1;
            int i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i11 = iHashCode ^ (iHashCode << 16);
            int i12 = i11 & 127;
            int i13 = e6.f26311f;
            int i14 = (i11 >>> 7) & i13;
            while (true) {
                long[] jArr = e6.f26306a;
                int i15 = i14 >> 3;
                int i16 = (i14 & 7) << 3;
                int i17 = i9;
                int i18 = i10;
                long j = (((-i16) >> 63) & (jArr[i15 + i9] << (64 - i16))) | (jArr[i15] >>> i16);
                long j9 = (((long) i12) * 72340172838076673L) ^ j;
                long j10 = -9187201950435737472L;
                long j11 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (j11 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i14) & i13;
                    long j12 = j10;
                    if (m.a(e6.f26307b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j11 &= j11 - 1;
                    j10 = j12;
                }
                if ((j & ((~j) << 6) & j10) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i10 = i18 + 8;
                i14 = (i14 + i10) & i13;
                i9 = i17;
            }
            if (iNumberOfTrailingZeros >= 0) {
                e6.h(iNumberOfTrailingZeros);
            }
        }
        return i3 != e6.g;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        m.e(elements, "elements");
        return this.f26321i.i(elements);
    }

    @Override
    public final int size() {
        return this.f26320h.g;
    }

    @Override
    public final Object[] toArray() {
        return l.a(this);
    }

    public final String toString() {
        return this.f26320h.toString();
    }

    @Override
    public final Object[] toArray(Object[] array) {
        m.e(array, "array");
        return l.b(this, array);
    }
}
