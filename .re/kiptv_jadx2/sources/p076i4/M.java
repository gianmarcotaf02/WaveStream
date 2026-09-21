package p076i4;

import java.io.Serializable;

public abstract class M implements Comparable, Serializable {

    public final Object f22812h;

    public M(Comparable comparable) {
        this.f22812h = comparable;
    }

    @Override
    public int compareTo(M m8) {
        if (m8 == L.f22808k) {
            return 1;
        }
        if (m8 == L.j) {
            return -1;
        }
        Object obj = m8.f22812h;
        P0 p2 = P0.j;
        int iCompareTo = this.f22812h.compareTo(obj);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(false, false);
    }

    public abstract void b(StringBuilder sb);

    public abstract void c(StringBuilder sb);

    public Comparable d() {
        return this.f22812h;
    }

    public abstract boolean e(Comparable comparable);

    public final boolean equals(Object obj) {
        if (obj instanceof M) {
            try {
                if (compareTo((M) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
