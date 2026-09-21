package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p078i6.o;
import p119n8.i;
import p162s8.g;

@i(with = g.class)
public final class a extends b implements List<b>, p201y6.a {
    public static final JsonArray$Companion Companion = new JsonArray$Companion();

    public final List f24557h;

    public a(List content) {
        m.e(content, "content");
        this.f24557h = content;
    }

    @Override
    public final void add(int i3, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(int i3, Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b element = (b) obj;
        m.e(element, "element");
        return this.f24557h.contains(element);
    }

    @Override
    public final boolean containsAll(Collection elements) {
        m.e(elements, "elements");
        return this.f24557h.containsAll(elements);
    }

    @Override
    public final boolean equals(Object obj) {
        return m.a(this.f24557h, obj);
    }

    @Override
    public final b get(int i3) {
        return (b) this.f24557h.get(i3);
    }

    @Override
    public final int hashCode() {
        return this.f24557h.hashCode();
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        b element = (b) obj;
        m.e(element, "element");
        return this.f24557h.indexOf(element);
    }

    @Override
    public final boolean isEmpty() {
        return this.f24557h.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.f24557h.iterator();
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b)) {
            return -1;
        }
        b element = (b) obj;
        m.e(element, "element");
        return this.f24557h.lastIndexOf(element);
    }

    @Override
    public final ListIterator<b> listIterator() {
        return this.f24557h.listIterator();
    }

    @Override
    public final b remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void replaceAll(UnaryOperator<b> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final b set(int i3, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.f24557h.size();
    }

    @Override
    public final void sort(Comparator<? super b> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List<b> subList(int i3, int i9) {
        return this.f24557h.subList(i3, i9);
    }

    @Override
    public final Object[] toArray() {
        return l.a(this);
    }

    public final String toString() {
        return o.o1(this.f24557h, ",", "[", "]", null, 56);
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final ListIterator<b> listIterator(int i3) {
        return this.f24557h.listIterator(i3);
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object[] toArray(Object[] array) {
        m.e(array, "array");
        return l.b(this, array);
    }
}
