package p074i1;

import com.google.android.gms.internal.play_billing.M0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import p078i6.w;
import p201y6.a;

public final class b implements Collection, a {
    public static final b j = new b(w.f23205h);

    public final List f22747h;

    public final int f22748i;

    public b(List list) {
        this.f22747h = list;
        this.f22748i = list.size();
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
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f22747h.contains((a) obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f22747h.containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return m.a(this.f22747h, ((b) obj).f22747h);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.f22747h.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f22747h.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.f22747h.iterator();
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
    public final boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.f22748i;
    }

    @Override
    public final Object[] toArray() {
        return l.a(this);
    }

    public final String toString() {
        return M0.n(new StringBuilder("LocaleList(localeList="), this.f22747h, ')');
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        return l.b(this, objArr);
    }
}
