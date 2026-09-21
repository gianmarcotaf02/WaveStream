package p006a6;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p076i4.AbstractC2194f0;

public final class c implements Map {

    public final AbstractC2194f0 f15414h;

    public c(AbstractC2194f0 abstractC2194f0) {
        this.f15414h = abstractC2194f0;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.f15414h.containsKey(((Class) obj).getName());
    }

    @Override
    public final boolean containsValue(Object obj) {
        return this.f15414h.containsValue(obj);
    }

    @Override
    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override
    public final Object get(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.f15414h.get(((Class) obj).getName());
    }

    @Override
    public final boolean isEmpty() {
        return this.f15414h.isEmpty();
    }

    @Override
    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override
    public final int size() {
        return this.f15414h.size();
    }

    @Override
    public final Collection values() {
        return this.f15414h.values();
    }
}
