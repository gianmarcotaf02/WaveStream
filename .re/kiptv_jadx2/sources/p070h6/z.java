package p070h6;

import D1.X;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p201y6.a;

public final class z implements Collection, a {

    public final short[] f22557h;

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        short s9 = ((y) obj).f22556h;
        short[] sArr = this.f22557h;
        int length = sArr.length;
        int i3 = 0;
        while (i3 < length) {
            if (s9 == sArr[i3]) {
                if (i3 >= 0) {
                    return true;
                }
                return false;
            }
            i3++;
        }
        i3 = -1;
        if (i3 >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection elements) {
        m.e(elements, "elements");
        Collection collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof y) {
                    short s9 = ((y) obj).f22556h;
                    short[] sArr = this.f22557h;
                    int length = sArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i3 = -1;
                            break;
                        }
                        if (s9 == sArr[i3]) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return m.a(this.f22557h, ((z) obj).f22557h);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.f22557h);
    }

    @Override
    public final boolean isEmpty() {
        return this.f22557h.length == 0;
    }

    @Override
    public final Iterator iterator() {
        return new X(4, this.f22557h);
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.f22557h.length;
    }

    @Override
    public final Object[] toArray() {
        return l.a(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f22557h) + ')';
    }

    @Override
    public final Object[] toArray(Object[] array) {
        m.e(array, "array");
        return l.b(this, array);
    }
}
