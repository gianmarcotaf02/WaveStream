package p076i4;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public abstract class AbstractC2194f0 implements Map, Serializable {

    public transient AbstractC2214p0 f22894h;

    public transient AbstractC2214p0 f22895i;
    public transient W j;

    public static AbstractC2194f0 a(Map map) {
        if ((map instanceof AbstractC2194f0) && !(map instanceof SortedMap)) {
            AbstractC2194f0 abstractC2194f0 = (AbstractC2194f0) map;
            abstractC2194f0.getClass();
            return abstractC2194f0;
        }
        Set setEntrySet = map.entrySet();
        C2192e0 c2192e0 = new C2192e0(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        c2192e0.e(setEntrySet);
        return c2192e0.a(true);
    }

    public abstract U0 b();

    public abstract V0 c();

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract W d();

    @Override
    public final AbstractC2214p0 entrySet() {
        AbstractC2214p0 abstractC2214p0 = this.f22894h;
        if (abstractC2214p0 != null) {
            return abstractC2214p0;
        }
        U0 u0B = b();
        this.f22894h = u0B;
        return u0B;
    }

    @Override
    public final boolean equals(Object obj) {
        return AbstractC2230y.h(obj, this);
    }

    @Override
    public final AbstractC2214p0 keySet() {
        AbstractC2214p0 abstractC2214p0 = this.f22895i;
        if (abstractC2214p0 != null) {
            return abstractC2214p0;
        }
        V0 v0C = c();
        this.f22895i = v0C;
        return v0C;
    }

    @Override
    public abstract Object get(Object obj);

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override
    public W values() {
        W w6 = this.j;
        if (w6 != null) {
            return w6;
        }
        W wD = d();
        this.j = wD;
        return wD;
    }

    @Override
    public final int hashCode() {
        return AbstractC2230y.n(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return AbstractC2230y.z(this);
    }
}
