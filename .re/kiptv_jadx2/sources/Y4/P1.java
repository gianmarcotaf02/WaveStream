package Y4;

import java.util.Map;

public final class P1 {

    public final Object f11709a;

    public final Object f11710b;

    public P1(Map map, Map map2) {
        this.f11709a = map;
        this.f11710b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P1)) {
            return false;
        }
        P1 p2 = (P1) obj;
        return this.f11709a.equals(p2.f11709a) && this.f11710b.equals(p2.f11710b);
    }

    public final int hashCode() {
        return this.f11710b.hashCode() + (this.f11709a.hashCode() * 31);
    }

    public final String toString() {
        return "XMLTVParseResult(channels=" + this.f11709a + ", programs=" + this.f11710b + ")";
    }
}
