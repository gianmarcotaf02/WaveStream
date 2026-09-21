package p076i4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class C2195g extends e1 {

    public final Map f22897h;

    public final AbstractC2215q f22898i;

    public C2195g(AbstractC2215q abstractC2215q, Map map) {
        this.f22898i = abstractC2215q;
        map.getClass();
        this.f22897h = map;
    }

    @Override
    public final void clear() {
        AbstractC2230y.e(iterator());
    }

    @Override
    public final boolean contains(Object obj) {
        return this.f22897h.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.f22897h.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.f22897h.keySet().equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.f22897h.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f22897h.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new C2191e(this, this.f22897h.entrySet().iterator());
    }

    @Override
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f22897h.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f22898i.f22930m -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override
    public final int size() {
        return this.f22897h.size();
    }
}
