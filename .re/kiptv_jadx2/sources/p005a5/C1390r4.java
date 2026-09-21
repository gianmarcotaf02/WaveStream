package p005a5;

import kotlin.jvm.internal.m;

public final class C1390r4 {

    public final Object f15026a;

    public final long f15027b;

    public C1390r4(Object value, long j) {
        m.e(value, "value");
        this.f15026a = value;
        this.f15027b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1390r4)) {
            return false;
        }
        C1390r4 c1390r4 = (C1390r4) obj;
        return m.a(this.f15026a, c1390r4.f15026a) && this.f15027b == c1390r4.f15027b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15027b) + (this.f15026a.hashCode() * 31);
    }

    public final String toString() {
        return "MemoryCacheEntry(value=" + this.f15026a + ", timestampMs=" + this.f15027b + ")";
    }
}
