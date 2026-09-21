package p136q;

import E8.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p201y6.a;

public final class C2664h implements Set, a {

    public final int f26392h;

    public final H f26393i;

    public C2664h(H parent, int i3) {
        this.f26392h = i3;
        switch (i3) {
            case 1:
                m.e(parent, "parent");
                this.f26393i = parent;
                break;
            default:
                m.e(parent, "parent");
                this.f26393i = parent;
                break;
        }
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.f26392h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.f26392h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final void clear() {
        switch (this.f26392h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.f26392h) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry element = (Map.Entry) obj;
                m.e(element, "element");
                return m.a(this.f26393i.g(element.getKey()), element.getValue());
            default:
                return this.f26393i.c(obj);
        }
    }

    @Override
    public final boolean containsAll(Collection elements) {
        switch (this.f26392h) {
            case 0:
                m.e(elements, "elements");
                Collection<Map.Entry> collection = elements;
                if (collection.isEmpty()) {
                    return true;
                }
                for (Map.Entry entry : collection) {
                    if (!m.a(this.f26393i.g(entry.getKey()), entry.getValue())) {
                        return false;
                    }
                }
                return true;
            default:
                m.e(elements, "elements");
                Collection collection2 = elements;
                if (collection2.isEmpty()) {
                    return true;
                }
                Iterator it = collection2.iterator();
                while (it.hasNext()) {
                    if (!this.f26393i.c(it.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.f26392h) {
            case 0:
                break;
        }
        return this.f26393i.i();
    }

    @Override
    public final Iterator iterator() {
        switch (this.f26392h) {
            case 0:
                return d.T(new C2663g(this, null));
            default:
                return d.T(new C2671o(this, null));
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.f26392h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.f26392h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.f26392h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final int size() {
        switch (this.f26392h) {
            case 0:
                break;
        }
        return this.f26393i.f26326e;
    }

    @Override
    public final Object[] toArray() {
        switch (this.f26392h) {
            case 0:
                break;
        }
        return l.a(this);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        switch (this.f26392h) {
            case 0:
                m.e(array, "array");
                break;
            default:
                m.e(array, "array");
                break;
        }
        return l.b(this, array);
    }
}
