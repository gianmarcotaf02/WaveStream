package p076i4;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public abstract class AbstractC2207m extends AbstractCollection {

    public final Object f22917h;

    public Collection f22918i;
    public final C2211o j;

    public final Collection f22919k;

    public final AbstractC2215q f22920l;

    public AbstractC2207m(AbstractC2215q abstractC2215q, Object obj, Collection collection, C2211o c2211o) {
        this.f22920l = abstractC2215q;
        this.f22917h = obj;
        this.f22918i = collection;
        this.j = c2211o;
        this.f22919k = c2211o == null ? null : c2211o.f22918i;
    }

    @Override
    public final boolean add(Object obj) {
        e();
        boolean zIsEmpty = this.f22918i.isEmpty();
        boolean zAdd = this.f22918i.add(obj);
        if (zAdd) {
            this.f22920l.f22930m++;
            if (zIsEmpty) {
                d();
            }
        }
        return zAdd;
    }

    @Override
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f22918i.addAll(collection);
        if (zAddAll) {
            this.f22920l.f22930m += this.f22918i.size() - size;
            if (size == 0) {
                d();
            }
        }
        return zAddAll;
    }

    @Override
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f22918i.clear();
        this.f22920l.f22930m -= size;
        f();
    }

    @Override
    public final boolean contains(Object obj) {
        e();
        return this.f22918i.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        e();
        return this.f22918i.containsAll(collection);
    }

    public final void d() {
        C2211o c2211o = this.j;
        if (c2211o != null) {
            c2211o.d();
        } else {
            this.f22920l.f22929l.put(this.f22917h, this.f22918i);
        }
    }

    public final void e() {
        Collection collection;
        C2211o c2211o = this.j;
        if (c2211o != null) {
            c2211o.e();
            if (c2211o.f22918i != this.f22919k) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f22918i.isEmpty() || (collection = (Collection) this.f22920l.f22929l.get(this.f22917h)) == null) {
                return;
            }
            this.f22918i = collection;
        }
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        e();
        return this.f22918i.equals(obj);
    }

    public final void f() {
        C2211o c2211o = this.j;
        if (c2211o != null) {
            c2211o.f();
        } else if (this.f22918i.isEmpty()) {
            this.f22920l.f22929l.remove(this.f22917h);
        }
    }

    @Override
    public final int hashCode() {
        e();
        return this.f22918i.hashCode();
    }

    @Override
    public final Iterator iterator() {
        e();
        return new C2191e(this);
    }

    @Override
    public final boolean remove(Object obj) {
        e();
        boolean zRemove = this.f22918i.remove(obj);
        if (zRemove) {
            this.f22920l.f22930m--;
            f();
        }
        return zRemove;
    }

    @Override
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f22918i.removeAll(collection);
        if (zRemoveAll) {
            this.f22920l.f22930m += this.f22918i.size() - size;
            f();
        }
        return zRemoveAll;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f22918i.retainAll(collection);
        if (zRetainAll) {
            this.f22920l.f22930m += this.f22918i.size() - size;
            f();
        }
        return zRetainAll;
    }

    @Override
    public final int size() {
        e();
        return this.f22918i.size();
    }

    @Override
    public final String toString() {
        e();
        return this.f22918i.toString();
    }
}
