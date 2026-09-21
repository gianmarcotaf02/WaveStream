package F;

import Q0.C0781o;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public final class K implements List, p201y6.a {

    public final p121o0.n f3354h = new p121o0.n();

    @Override
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof I)) {
            return false;
        }
        return this.f3354h.contains((I) obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f3354h.containsAll(collection);
    }

    @Override
    public final Object get(int i3) {
        return (I) this.f3354h.get(i3);
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof I)) {
            return -1;
        }
        return this.f3354h.indexOf((I) obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f3354h.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.f3354h.listIterator();
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof I)) {
            return -1;
        }
        return this.f3354h.lastIndexOf((I) obj);
    }

    @Override
    public final ListIterator listIterator() {
        return this.f3354h.listIterator();
    }

    @Override
    public final Object remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.f3354h.size();
    }

    @Override
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List subList(int i3, int i9) {
        return this.f3354h.subList(i3, i9);
    }

    @Override
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
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
    public final ListIterator listIterator(int i3) {
        p121o0.n nVar = this.f3354h;
        nVar.getClass();
        return new C0781o(nVar, i3);
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.l.b(this, objArr);
    }
}
