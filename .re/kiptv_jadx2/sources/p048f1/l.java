package p048f1;

import com.google.android.gms.internal.play_billing.M0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.m;
import p201y6.a;

public final class l extends i implements List, a {

    public final List f21657l;

    public l(List list) {
        this.f21657l = list;
        if (list.isEmpty()) {
            p065h1.a.b("At least one font should be passed to FontFamily");
        }
    }

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
        if (!(obj instanceof y)) {
            return false;
        }
        return this.f21657l.contains((y) obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f21657l.containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return m.a(this.f21657l, ((l) obj).f21657l);
        }
        return false;
    }

    @Override
    public final Object get(int i3) {
        return (y) this.f21657l.get(i3);
    }

    @Override
    public final int hashCode() {
        return this.f21657l.hashCode();
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof y)) {
            return -1;
        }
        return this.f21657l.indexOf((y) obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.f21657l.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.f21657l.iterator();
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof y)) {
            return -1;
        }
        return this.f21657l.lastIndexOf((y) obj);
    }

    @Override
    public final ListIterator listIterator() {
        return this.f21657l.listIterator();
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
        return this.f21657l.size();
    }

    @Override
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List subList(int i3, int i9) {
        return this.f21657l.subList(i3, i9);
    }

    @Override
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.a(this);
    }

    public final String toString() {
        return M0.n(new StringBuilder("FontListFontFamily(fonts="), this.f21657l, ')');
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
        return this.f21657l.listIterator(i3);
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
