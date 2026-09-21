package androidx.datastore.preferences.protobuf;

import java.util.Map;

public final class a0 implements Map.Entry, Comparable {

    public final Comparable f16179h;

    public Object f16180i;
    public final Z j;

    public a0(Z z6, Comparable comparable, Object obj) {
        this.j = z6;
        this.f16179h = comparable;
        this.f16180i = obj;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f16179h.compareTo(((a0) obj).f16179h);
    }

    @Override
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f16179h;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f16180i;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final Object getKey() {
        return this.f16179h;
    }

    @Override
    public final Object getValue() {
        return this.f16180i;
    }

    @Override
    public final int hashCode() {
        Comparable comparable = this.f16179h;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f16180i;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override
    public final Object setValue(Object obj) {
        this.j.b();
        Object obj2 = this.f16180i;
        this.f16180i = obj;
        return obj2;
    }

    public final String toString() {
        return this.f16179h + "=" + this.f16180i;
    }
}
