package p110m7;

import B2.a;
import java.util.Map;

public final class E implements Comparable, Map.Entry {

    public final Comparable f25448h;

    public Object f25449i;
    public final A j;

    public E(A a2, Comparable comparable, Object obj) {
        this.j = a2;
        this.f25448h = comparable;
        this.f25449i = obj;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.f25448h.compareTo(((E) obj).f25448h);
    }

    @Override
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f25448h;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f25449i;
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
        return this.f25448h;
    }

    @Override
    public final Object getValue() {
        return this.f25449i;
    }

    @Override
    public final int hashCode() {
        Comparable comparable = this.f25448h;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f25449i;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override
    public final Object setValue(Object obj) {
        this.j.b();
        Object obj2 = this.f25449i;
        this.f25449i = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f25448h);
        String strValueOf2 = String.valueOf(this.f25449i);
        return a.o(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
    }
}
