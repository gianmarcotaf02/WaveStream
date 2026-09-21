package p120o;

import java.util.Map;

public final class c implements Map.Entry {

    public final Object f25954h;

    public final Object f25955i;
    public c j;

    public c f25956k;

    public c(Object obj, Object obj2) {
        this.f25954h = obj;
        this.f25955i = obj2;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f25954h.equals(cVar.f25954h) && this.f25955i.equals(cVar.f25955i);
    }

    @Override
    public final Object getKey() {
        return this.f25954h;
    }

    @Override
    public final Object getValue() {
        return this.f25955i;
    }

    @Override
    public final int hashCode() {
        return this.f25954h.hashCode() ^ this.f25955i.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f25954h + "=" + this.f25955i;
    }
}
