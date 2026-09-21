package D4;

import java.util.Collections;
import java.util.Map;

public final class c {

    public final String f2131a;

    public final Map f2132b;

    public c(String str, Map map) {
        this.f2131a = str;
        this.f2132b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2131a.equals(cVar.f2131a) && this.f2132b.equals(cVar.f2132b);
    }

    public final int hashCode() {
        return this.f2132b.hashCode() + (this.f2131a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f2131a + ", properties=" + this.f2132b.values() + "}";
    }
}
