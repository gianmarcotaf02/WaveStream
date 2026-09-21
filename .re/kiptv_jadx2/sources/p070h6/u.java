package p070h6;

import D1.X;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import p078i6.m;
import p201y6.a;

public final class u implements Collection, a {

    public final int[] f22552h;

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
        if (!(obj instanceof t)) {
            return false;
        }
        return m.V(this.f22552h, ((t) obj).f22551h);
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof t)) {
                return false;
            }
            if (!m.V(this.f22552h, ((t) obj).f22551h)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return kotlin.jvm.internal.m.a(this.f22552h, ((u) obj).f22552h);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.f22552h);
    }

    @Override
    public final boolean isEmpty() {
        return this.f22552h.length == 0;
    }

    @Override
    public final Iterator iterator() {
        return new X(2, this.f22552h);
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
        return this.f22552h.length;
    }

    @Override
    public final Object[] toArray() {
        return l.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f22552h) + ')';
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return l.b(this, array);
    }
}
