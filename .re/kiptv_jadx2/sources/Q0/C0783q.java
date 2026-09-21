package Q0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public final class C0783q implements List, p201y6.a {

    public final p136q.D f8458h = new p136q.D(16);

    public final p136q.y f8459i = new p136q.y(16);
    public int j = -1;

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
        this.j = -1;
        this.f8458h.d();
        this.f8459i.f26439b = 0;
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

    public final long d() {
        long jA = AbstractC0777k.a(Float.POSITIVE_INFINITY, false, false);
        int i3 = this.j + 1;
        int iA0 = p078i6.p.A0(this);
        if (i3 > iA0) {
            return jA;
        }
        while (true) {
            p136q.y yVar = this.f8459i;
            if (i3 < 0) {
                yVar.getClass();
                break;
            }
            if (i3 >= yVar.f26439b) {
                break;
            }
            long j = yVar.f26438a[i3];
            if (AbstractC0777k.g(j, jA) < 0) {
                jA = j;
            }
            if ((AbstractC0777k.i(jA) < 0.0f && AbstractC0777k.n(jA)) || i3 == iA0) {
                return jA;
            }
            i3++;
        }
        p144r.a.d("Index must be between 0 and size");
        throw null;
    }

    public final void e(int i3, int i9) {
        if (i3 >= i9) {
            return;
        }
        this.f8458h.l(i3, i9);
        p136q.y yVar = this.f8459i;
        if (i3 >= 0) {
            int i10 = yVar.f26439b;
            if (i3 <= i10 && i9 >= 0 && i9 <= i10) {
                if (i9 < i3) {
                    p144r.a.c("The end index must be < start index");
                    throw null;
                }
                if (i9 != i3) {
                    if (i9 < i10) {
                        long[] jArr = yVar.f26438a;
                        p078i6.m.c0(jArr, jArr, i3, i9, i10);
                    }
                    yVar.f26439b -= i9 - i3;
                    return;
                }
                return;
            }
        } else {
            yVar.getClass();
        }
        p144r.a.d("Index must be between 0 and size");
        throw null;
    }

    @Override
    public final Object get(int i3) {
        Object objF = this.f8458h.f(i3);
        kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (p137q0.o) objF;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof p137q0.o)) {
            return -1;
        }
        p137q0.o oVar = (p137q0.o) obj;
        int iA0 = p078i6.p.A0(this);
        if (iA0 >= 0) {
            int i3 = 0;
            while (!kotlin.jvm.internal.m.a(this.f8458h.f(i3), oVar)) {
                if (i3 != iA0) {
                    i3++;
                }
            }
            return i3;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.f8458h.h();
    }

    @Override
    public final Iterator iterator() {
        return new C0781o(this, 0, 7);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof p137q0.o)) {
            return -1;
        }
        p137q0.o oVar = (p137q0.o) obj;
        for (int iA0 = p078i6.p.A0(this); -1 < iA0; iA0--) {
            if (kotlin.jvm.internal.m.a(this.f8458h.f(iA0), oVar)) {
                return iA0;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return new C0781o(this, 0, 7);
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
        return this.f8458h.f26304b;
    }

    @Override
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List subList(int i3, int i9) {
        return new C0782p(this, i3, i9);
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
        return new C0781o(this, i3, 6);
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
