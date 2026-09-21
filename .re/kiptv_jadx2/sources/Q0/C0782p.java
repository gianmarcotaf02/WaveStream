package Q0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public final class C0782p implements List, p201y6.a {

    public final int f8456h;

    public final int f8457i;
    public final C0783q j;

    public C0782p(C0783q c0783q, int i3, int i9) {
        this.j = c0783q;
        this.f8456h = i3;
        this.f8457i = i9;
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
        return (obj instanceof p137q0.o) && indexOf((p137q0.o) obj) != -1;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((p137q0.o) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i3) {
        Object objF = this.j.f8458h.f(i3 + this.f8456h);
        kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (p137q0.o) objF;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof p137q0.o)) {
            return -1;
        }
        p137q0.o oVar = (p137q0.o) obj;
        int i3 = this.f8456h;
        int i9 = this.f8457i;
        if (i3 <= i9) {
            int i10 = i3;
            while (!kotlin.jvm.internal.m.a(this.j.f8458h.f(i10), oVar)) {
                if (i10 != i9) {
                    i10++;
                }
            }
            return i10 - i3;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public final Iterator iterator() {
        int i3 = this.f8456h;
        return new C0781o(this.j, i3, i3, this.f8457i);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof p137q0.o)) {
            return -1;
        }
        p137q0.o oVar = (p137q0.o) obj;
        int i3 = this.f8457i;
        int i9 = this.f8456h;
        if (i9 <= i3) {
            while (!kotlin.jvm.internal.m.a(this.j.f8458h.f(i3), oVar)) {
                if (i3 != i9) {
                    i3--;
                }
            }
            return i3 - i9;
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        int i3 = this.f8456h;
        return new C0781o(this.j, i3, i3, this.f8457i);
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
        return this.f8457i - this.f8456h;
    }

    @Override
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List subList(int i3, int i9) {
        int i10 = this.f8456h;
        return new C0782p(this.j, i3 + i10, i10 + i9);
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
        int i9 = this.f8456h;
        int i10 = this.f8457i;
        return new C0781o(this.j, i3 + i9, i9, i10);
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
