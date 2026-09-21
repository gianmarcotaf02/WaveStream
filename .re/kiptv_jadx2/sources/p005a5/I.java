package p005a5;

import com.kiptv.core.model.C1949j;
import kotlin.jvm.internal.m;

public final class I {

    public final C1949j f13495a;

    public final long f13496b;

    public I(C1949j data, long j) {
        m.e(data, "data");
        this.f13495a = data;
        this.f13496b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i3 = (I) obj;
        return m.a(this.f13495a, i3.f13495a) && this.f13496b == i3.f13496b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13496b) + (this.f13495a.hashCode() * 31);
    }

    public final String toString() {
        return "CacheEntry(data=" + this.f13495a + ", cachedAtMillis=" + this.f13496b + ")";
    }
}
