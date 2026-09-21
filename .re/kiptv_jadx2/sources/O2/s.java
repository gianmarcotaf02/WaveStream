package O2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p078i6.C;

public final class s {

    public static final s f7937b = new s(C.Y0(new LinkedHashMap()));

    public final Map f7938a;

    public s(Map map) {
        this.f7938a = map;
    }

    public final String a() {
        String lowerCase = "Content-Type".toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        List list = (List) this.f7938a.get(lowerCase);
        if (list != null) {
            return (String) p078i6.o.s1(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && kotlin.jvm.internal.m.a(this.f7938a, ((s) obj).f7938a);
    }

    public final int hashCode() {
        return this.f7938a.hashCode();
    }

    public final String toString() {
        return p121o0.p.r(new StringBuilder("NetworkHeaders(data="), this.f7938a, ')');
    }
}
