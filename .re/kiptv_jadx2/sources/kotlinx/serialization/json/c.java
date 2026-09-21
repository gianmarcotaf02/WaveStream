package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.m;
import p078i6.o;
import p119n8.i;
import p162s8.x;

@i(with = x.class)
public final class c extends b implements Map<String, b>, p201y6.a {
    public static final JsonObject$Companion Companion = new JsonObject$Companion();

    public final Map f24558h;

    public c(Map content) {
        m.e(content, "content");
        this.f24558h = content;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final b compute(String str, BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final b computeIfAbsent(String str, Function<? super String, ? extends b> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final b computeIfPresent(String str, BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        m.e(key, "key");
        return this.f24558h.containsKey(key);
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b value = (b) obj;
        m.e(value, "value");
        return this.f24558h.containsValue(value);
    }

    @Override
    public final Set<Map.Entry<String, b>> entrySet() {
        return this.f24558h.entrySet();
    }

    @Override
    public final boolean equals(Object obj) {
        return m.a(this.f24558h, obj);
    }

    @Override
    public final b get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        m.e(key, "key");
        return (b) this.f24558h.get(key);
    }

    @Override
    public final int hashCode() {
        return this.f24558h.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f24558h.isEmpty();
    }

    @Override
    public final Set<String> keySet() {
        return this.f24558h.keySet();
    }

    @Override
    public final b merge(String str, b bVar, BiFunction<? super b, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final b put(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void putAll(Map<? extends String, ? extends b> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final b putIfAbsent(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final b remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final b replace(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void replaceAll(BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.f24558h.size();
    }

    public final String toString() {
        return o.o1(this.f24558h.entrySet(), ",", "{", "}", new q5.i(13), 24);
    }

    @Override
    public final Collection<b> values() {
        return this.f24558h.values();
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean replace(String str, b bVar, b bVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
