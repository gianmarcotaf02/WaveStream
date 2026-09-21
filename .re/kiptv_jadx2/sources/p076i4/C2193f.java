package p076i4;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C2193f extends AbstractMap {

    public transient C2189d f22891h;

    public transient C2218s f22892i;
    public final transient Map j;

    public final AbstractC2215q f22893k;

    public C2193f(AbstractC2215q abstractC2215q, Map map) {
        this.f22893k = abstractC2215q;
        this.j = map;
    }

    public final X a(Map.Entry entry) {
        Object key = entry.getKey();
        return new X(key, this.f22893k.k(key, (Collection) entry.getValue()));
    }

    @Override
    public final void clear() {
        AbstractC2215q abstractC2215q = this.f22893k;
        if (this.j == abstractC2215q.f22929l) {
            abstractC2215q.clear();
        } else {
            AbstractC2230y.e(new C2191e(this));
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map map = this.j;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final Set entrySet() {
        C2189d c2189d = this.f22891h;
        if (c2189d != null) {
            return c2189d;
        }
        C2189d c2189d2 = new C2189d(this, 0);
        this.f22891h = c2189d2;
        return c2189d2;
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.j.equals(obj);
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.j;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.f22893k.k(obj, collection);
    }

    @Override
    public final int hashCode() {
        return this.j.hashCode();
    }

    @Override
    public Set keySet() {
        return this.f22893k.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.j.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractC2215q abstractC2215q = this.f22893k;
        Collection collectionJ = abstractC2215q.j();
        collectionJ.addAll(collection);
        abstractC2215q.f22930m -= collection.size();
        collection.clear();
        return collectionJ;
    }

    @Override
    public final int size() {
        return this.j.size();
    }

    @Override
    public final String toString() {
        return this.j.toString();
    }

    @Override
    public final Collection values() {
        C2218s c2218s = this.f22892i;
        if (c2218s != null) {
            return c2218s;
        }
        C2218s c2218s2 = new C2218s(this);
        this.f22892i = c2218s2;
        return c2218s2;
    }
}
