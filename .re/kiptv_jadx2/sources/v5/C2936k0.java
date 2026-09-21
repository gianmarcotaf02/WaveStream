package v5;

import java.util.List;
import java.util.Map;

public final class C2936k0 {

    public final List f29532a;

    public final List f29533b;

    public final Map f29534c;

    public final Map f29535d;

    public C2936k0(List channels, List categories, Map byCategory, Map groupMap) {
        kotlin.jvm.internal.m.e(channels, "channels");
        kotlin.jvm.internal.m.e(categories, "categories");
        kotlin.jvm.internal.m.e(byCategory, "byCategory");
        kotlin.jvm.internal.m.e(groupMap, "groupMap");
        this.f29532a = channels;
        this.f29533b = categories;
        this.f29534c = byCategory;
        this.f29535d = groupMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2936k0)) {
            return false;
        }
        C2936k0 c2936k0 = (C2936k0) obj;
        return kotlin.jvm.internal.m.a(this.f29532a, c2936k0.f29532a) && kotlin.jvm.internal.m.a(this.f29533b, c2936k0.f29533b) && kotlin.jvm.internal.m.a(this.f29534c, c2936k0.f29534c) && kotlin.jvm.internal.m.a(this.f29535d, c2936k0.f29535d);
    }

    public final int hashCode() {
        return this.f29535d.hashCode() + B2.a.c(B2.a.b(this.f29532a.hashCode() * 31, 31, this.f29533b), 31, this.f29534c);
    }

    public final String toString() {
        return "EpgContent(channels=" + this.f29532a + ", categories=" + this.f29533b + ", byCategory=" + this.f29534c + ", groupMap=" + this.f29535d + ")";
    }
}
