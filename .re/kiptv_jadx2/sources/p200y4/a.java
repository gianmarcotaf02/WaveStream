package p200y4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a {

    public static final a f31883b = new a(Collections.unmodifiableMap(new HashMap()));

    public final Map f31884a;

    public a(Map map) {
        this.f31884a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f31884a.equals(((a) obj).f31884a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31884a.hashCode();
    }

    public final String toString() {
        return this.f31884a.toString();
    }
}
