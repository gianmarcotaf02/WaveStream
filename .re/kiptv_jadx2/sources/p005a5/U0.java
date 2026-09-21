package p005a5;

import java.util.List;
import kotlin.jvm.internal.m;

public final class U0 {

    public final List f13958a;

    public final long f13959b;

    public U0(List results, long j) {
        m.e(results, "results");
        this.f13958a = results;
        this.f13959b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U0)) {
            return false;
        }
        U0 u1 = (U0) obj;
        return m.a(this.f13958a, u1.f13958a) && this.f13959b == u1.f13959b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13959b) + (this.f13958a.hashCode() * 31);
    }

    public final String toString() {
        return "SearchCacheEntry(results=" + this.f13958a + ", timestampMs=" + this.f13959b + ")";
    }
}
