package p011b1;

import kotlin.jvm.internal.m;

public final class K {

    public final E f17778a;

    public final E f17779b;

    public final E f17780c;

    public final E f17781d;

    public K(E e6, E e9, E e10, E e11) {
        this.f17778a = e6;
        this.f17779b = e9;
        this.f17780c = e10;
        this.f17781d = e11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof K)) {
            return false;
        }
        K k9 = (K) obj;
        return m.a(this.f17778a, k9.f17778a) && m.a(this.f17779b, k9.f17779b) && m.a(this.f17780c, k9.f17780c) && m.a(this.f17781d, k9.f17781d);
    }

    public final int hashCode() {
        E e6 = this.f17778a;
        int iHashCode = (e6 != null ? e6.hashCode() : 0) * 31;
        E e9 = this.f17779b;
        int iHashCode2 = (iHashCode + (e9 != null ? e9.hashCode() : 0)) * 31;
        E e10 = this.f17780c;
        int iHashCode3 = (iHashCode2 + (e10 != null ? e10.hashCode() : 0)) * 31;
        E e11 = this.f17781d;
        return iHashCode3 + (e11 != null ? e11.hashCode() : 0);
    }
}
