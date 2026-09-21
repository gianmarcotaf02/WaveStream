package p153r8;

import java.util.Map;
import kotlin.jvm.internal.m;
import p201y6.a;

public final class S implements Map.Entry, a {

    public final Object f26926h;

    public final Object f26927i;

    public S(Object obj, Object obj2) {
        this.f26926h = obj;
        this.f26927i = obj2;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s9 = (S) obj;
        return m.a(this.f26926h, s9.f26926h) && m.a(this.f26927i, s9.f26927i);
    }

    @Override
    public final Object getKey() {
        return this.f26926h;
    }

    @Override
    public final Object getValue() {
        return this.f26927i;
    }

    @Override
    public final int hashCode() {
        Object obj = this.f26926h;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f26927i;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapEntry(key=");
        sb.append(this.f26926h);
        sb.append(", value=");
        return B2.a.n(sb, this.f26927i, ')');
    }
}
