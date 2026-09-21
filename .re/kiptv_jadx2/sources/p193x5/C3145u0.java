package p193x5;

import B2.a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;

public final class C3145u0 {

    public final boolean f31657a;

    public final List f31658b;

    public final Map f31659c;

    public final Map f31660d;

    public C3145u0(boolean z6, List categories, Map byCategory, Map nameMap) {
        m.e(categories, "categories");
        m.e(byCategory, "byCategory");
        m.e(nameMap, "nameMap");
        this.f31657a = z6;
        this.f31658b = categories;
        this.f31659c = byCategory;
        this.f31660d = nameMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3145u0)) {
            return false;
        }
        C3145u0 c3145u0 = (C3145u0) obj;
        return this.f31657a == c3145u0.f31657a && m.a(this.f31658b, c3145u0.f31658b) && m.a(this.f31659c, c3145u0.f31659c) && m.a(this.f31660d, c3145u0.f31660d);
    }

    public final int hashCode() {
        return this.f31660d.hashCode() + a.c(a.b(Boolean.hashCode(this.f31657a) * 31, 31, this.f31658b), 31, this.f31659c);
    }

    public final String toString() {
        return "RawLive(ready=" + this.f31657a + ", categories=" + this.f31658b + ", byCategory=" + this.f31659c + ", nameMap=" + this.f31660d + ")";
    }
}
