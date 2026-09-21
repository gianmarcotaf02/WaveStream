package p136q;

import O0.s0;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.m;
import p201y6.a;

public final class C2675t implements Map, a {

    public final H f26421h;

    public C2664h f26422i;
    public C2664h j;

    public s0 f26423k;

    public C2675t(H parent) {
        m.e(parent, "parent");
        this.f26421h = parent;
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.f26421h.c(obj);
    }

    @Override
    public final boolean containsValue(Object obj) {
        return this.f26421h.d(obj);
    }

    @Override
    public final Set entrySet() {
        C2664h c2664h = this.f26422i;
        if (c2664h != null) {
            return c2664h;
        }
        C2664h c2664h2 = new C2664h(this.f26421h, 0);
        this.f26422i = c2664h2;
        return c2664h2;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2675t.class != obj.getClass()) {
            return false;
        }
        return m.a(this.f26421h, ((C2675t) obj).f26421h);
    }

    @Override
    public final Object get(Object obj) {
        return this.f26421h.g(obj);
    }

    @Override
    public final int hashCode() {
        return this.f26421h.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.f26421h.i();
    }

    @Override
    public final Set keySet() {
        C2664h c2664h = this.j;
        if (c2664h != null) {
            return c2664h;
        }
        C2664h c2664h2 = new C2664h(this.f26421h, 1);
        this.j = c2664h2;
        return c2664h2;
    }

    @Override
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.f26421h.f26326e;
    }

    public final String toString() {
        return this.f26421h.toString();
    }

    @Override
    public final Collection values() {
        s0 s0Var = this.f26423k;
        if (s0Var != null) {
            return s0Var;
        }
        s0 s0Var2 = new s0(this.f26421h);
        this.f26423k = s0Var2;
        return s0Var2;
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
