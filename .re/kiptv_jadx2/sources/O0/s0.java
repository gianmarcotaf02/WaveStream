package O0;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public final class s0 implements Collection, p201y6.a {

    public final int f7688h = 0;

    public final Object f7689i;

    public s0() {
        int i3 = p136q.O.f26350a;
        this.f7689i = new p136q.E(6);
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f7688h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final void clear() {
        switch (this.f7688h) {
            case 0:
                ((p136q.E) this.f7689i).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).c(obj);
            default:
                return ((p136q.H) this.f7689i).d(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection elements) {
        switch (this.f7688h) {
            case 0:
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!((p136q.E) this.f7689i).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                Collection collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!((p136q.H) this.f7689i).d(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).g == 0;
            default:
                return ((p136q.H) this.f7689i).i();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.f7688h) {
            case 0:
                p136q.E e6 = (p136q.E) this.f7689i;
                e6.getClass();
                return new N7.k(new p136q.G(e6));
            default:
                return E8.d.T(new p136q.V(this, null));
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).g(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).g(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean removeIf(Predicate predicate) {
        switch (this.f7688h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).i(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final int size() {
        switch (this.f7688h) {
            case 0:
                return ((p136q.E) this.f7689i).g;
            default:
                return ((p136q.H) this.f7689i).f26326e;
        }
    }

    @Override
    public final Object[] toArray() {
        switch (this.f7688h) {
            case 0:
                break;
        }
        return kotlin.jvm.internal.l.a(this);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        switch (this.f7688h) {
            case 0:
                break;
            default:
                kotlin.jvm.internal.m.e(array, "array");
                break;
        }
        return kotlin.jvm.internal.l.b(this, array);
    }

    public s0(p136q.H parent) {
        kotlin.jvm.internal.m.e(parent, "parent");
        this.f7689i = parent;
    }
}
