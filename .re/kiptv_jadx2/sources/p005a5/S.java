package p005a5;

import java.util.Map;
import kotlin.jvm.internal.m;

public final class S {

    public final boolean f13868a;

    public final Object f13869b;

    public final C1353n6 f13870c;

    public S(boolean z6, Map map, C1353n6 c1353n6) {
        this.f13868a = z6;
        this.f13869b = map;
        this.f13870c = c1353n6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s9 = (S) obj;
        return this.f13868a == s9.f13868a && m.a(this.f13869b, s9.f13869b) && m.a(this.f13870c, s9.f13870c);
    }

    public final int hashCode() {
        int iHashCode = (this.f13869b.hashCode() + (Boolean.hashCode(this.f13868a) * 31)) * 31;
        C1353n6 c1353n6 = this.f13870c;
        return iHashCode + (c1353n6 == null ? 0 : c1353n6.hashCode());
    }

    public final String toString() {
        return "FeedQuery(isMovie=" + this.f13868a + ", params=" + this.f13869b + ", trakt=" + this.f13870c + ")";
    }
}
