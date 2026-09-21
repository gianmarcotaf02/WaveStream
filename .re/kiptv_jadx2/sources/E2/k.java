package E2;

import java.util.LinkedHashMap;
import java.util.Map;

public final class k {

    public static final k f2786b = new k(P3.e.n0(new LinkedHashMap()));

    public final Map f2787a;

    public k(Map map) {
        this.f2787a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && kotlin.jvm.internal.m.a(this.f2787a, ((k) obj).f2787a);
    }

    public final int hashCode() {
        return this.f2787a.hashCode();
    }

    public final String toString() {
        return p121o0.p.r(new StringBuilder("Extras(data="), this.f2787a, ')');
    }
}
